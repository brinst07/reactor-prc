package org.brinst;

import java.util.List;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Publisher {
	public Flux<Integer> startFlux() {
		return Flux.range(1,10).log();
		// Flux.fromIterable(List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j"));
	}

	public Flux<String> startFlux2() {
		return Flux.fromIterable(List.of("a","b","c")).log();
	}

	public Mono<Integer> startMono() {
		return Mono.just(1).log();
	}

	public Mono<?> startMono2() {
		return Mono.empty().log();
	}

	public Mono<?> startMono3() {
		return Mono.error(new Exception("hello reactor"));
	}
}

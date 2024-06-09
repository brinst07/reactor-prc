# Docs

https://projectreactor.io/docs/core/release/reference/

# publisher

## Flux

- 0-N개 아이템을 가질 수 있는 데이터 스트림
- onNext(~N), onComplete, onError

## Mono

- 단일값 처리나 예외처리에 특화되어 있음
- 0개 또는 1개의 아이템을 가지는 데이터 스트림
- onNext(0-1), onComplete, onError

# operator

- flux, mono의 값을 변환하거나 가공하는 함수형 필터링, 집계하는 함수형 연산자
- 데이터를 어떻게 처리할 거냐의 관점

## map

## filter

## take

## flatMap

- map과 달리 1:N임
- 순서가 보장되지 않음
- 외부 IO에 대하여 비동기로 요청하기에, DB나 API 요청에 사용하기 좋음

## concatMap

- **순서가 중요한 작업에는 flatMap대신 concatMap을 사용**
- 다음요소를 처리 하기전에 이전 요소의 작업을 기다림

## flatMapMany

- Mono의 단일아이템에 대해서 flux로 전환할 때, 여러개의 데이터 스트림을 변환시에 사용

## switchIfEmpty/defaultIfEmpty

- Mono/Flux에 연산자를 사용하였을 때 만일 값이 없을때에 대한 연산자
- switchIfEmpty -> 값이 없을 경우 새로운 연산자로 시작할 수 있게함
- defaultIfEmpty -> 값이 없을 경우 값을 정할 수 있음

## merge/zip

- 여러개의 stream을 모아줌

## count

## distinct

## reduce

## groupby

## delaySequence / limitRate

## sample

# Schedulers

## Schedulers.immediate()

- 현재 스레드에서 동기적인 작업을 실행

## Schedulers.single()

- 단일 백그라운드 스레드에서 작업을 실행

## Schedulers.parallel()

- 병렬로 사용할 수 있는 스레드 풀
- cpu 개수에 맞게 고정된 개수로 만들어져있음

## Schedulers.boundedElastic()

- 크기에 제한이 있지만, 유연한 스레드 풀

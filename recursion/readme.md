## Recursion
---
* 모든 순환 함수는 반복문(iteration)으로 변경 가능

* 그 역도 성립함. 즉, 모든 반복문 역시 순환 함수로 변경 가능

* 순환 함수는 복잡한 알고리즘을 단순하고 알기쉽게 표현하는 것을 가능하게 함

* 하지만 함수 호출에 따른 오버헤드가 있음(매개변수 전달, 스택에 액티베이션 생  성) -> 속도 느려짐

* 무한루프에 빠지지 않기 위해선?
 1.  Base case : 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야한다
 2. Recursive case : recursion을 반복하다 보면 base case로 수렴해야 한다



### recursion1.js

> 1 ~ n까지 합
>
> 팩토리얼
>
> x의 n승
>
> 피보나치
>
> 최대공약수 방법 1
>
> 최대공약수 방법 2


### recursion2.js

> 문자열 출력
>
> 문자열 역순으로 출력
>
> 10진수를 2진수로 만들기
>
> 배열의 원소의 합 구하기
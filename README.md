계산기 만들기 과제

Lv1 
-> https://velog.io/@w0729/%EA%B3%84%EC%82%B0%EA%B8%B0-%EB%A7%8C%EB%93%A4%EA%B8%B0-Lv1

Lv2
-> https://velog.io/@w0729/%EA%B3%84%EC%82%B0%EA%B8%B0-%EB%A7%8C%EB%93%A4%EA%B8%B0-Lv2

Lv3
-> https://velog.io/@w0729/%EA%B3%84%EC%82%B0%EA%B8%B0-%EB%A7%8C%EB%93%A4%EA%B8%B0-Lv3

ENUM, 제네릭, LAMBDA, STREAM을 활용한 계산기 구현까지 완성했습니다

트러블슈팅
Lv1
- 사용자 입력시 잔류된 enter가 자동 입력됨
=>  scanner.nextLine();을 통해 버퍼를 비워줌

Lv2
- getResult 메서드에서 resultList.get안에 인덱스의 값을 넣어줘야하는데 size값을 넣어줘 IndexOutOfBoundsException 발생
=> size에서 하나를 빼주게끔 수정

Lv3
- 제네릭 활용 문제
=> 제네릭에 Double을 상속받아 매개변수 타입제한
- 검증로직 오류
=> !를 통해 true인 값을 false로 바꿔줌

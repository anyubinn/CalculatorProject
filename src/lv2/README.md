## Lv2. 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기
### 🚀 기능 소개
**✏️ 양의 정수 입력 받기**
- 0을 포함한 양의 정수 2개를 입력할 수 있습니다.

**✏️ 사칙연산 기호 입력 받기**
- +, -, /, *를 입력할 수 있습니다.

**✏️ 누적 결과 확인하기**
- 지금까지 계산한 결과들을 확인할 수 있습니다.

**✏️ 누적 결과 제거하기**
- 누적 결과는 최대 3개 보여집니다.
- 만약 누적 결과가 3개보다 많다면 가장 오래된 누적 결과를 제거합니다.

**✏️ 예외 처리**
- 0으로 나누면 `0으로 나눌 수 없습니다.`라는 오류 메시지가 뜹니다.
- 숫자를 입력하지 않으면 `숫자를 입력해주세요.`라는 오류 메시지가 뜹니다.
- 형식에 맞는 숫자를 입력하지 않으면 `적절하지 않은 숫자 형식입니다. 다시 입력해주세요.`라는 오류 메시지가 뜹니다.
- 0 이상의 정수를 입력하지 않으면 `음수는 입력할 수 없습니다. 다시 입력해주세요.`라는 오류 메시지가 뜹니다.
- 정해진 사칙연산자가 아니면 `잘못된 사칙연산 기호입니다. 다시 입력해주세요.`라는 오류 메시지가 뜹니다.

**✏️ 계산기 종료하기**
- `exit`을 입력하여 종료할 수 있습니다.

**✏️ 사용자 인터페이스**
- 콘솔 기반의 계산기입니다.

### 🚀 구현 진행사항
- [x]  **사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성**
    - [x]  사칙연산을 수행한 후, 결과값을 반환하는 메서드 구현
    - [x]  연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
    - [x]  1) 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(➕,➖,✖️,➗) 기능을 수행한 후 2) 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성합니다.

- [x]  **Lv 1에서 구현한 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정**
    - [x]  연산 수행 역할은 Calculator 클래스가 담당
        - [x]  연산 결과는 Calculator 클래스의 연산 결과를 저장하는 필드에 저장
    - [x]  소스 코드 수정 후에도 수정 전의 기능들이 반드시 똑같이 동작해야합니다.

- [x] **예외 처리**
   - [x]  연산 오류가 발생할 경우 해당 오류에 대한 내용을 정제하여 출력합니다.
      - [x]  “0으로 나눌 수 없습니다.“
   - [x]  숫자를 입력하지 않은 경우 오류에 대한 내용을 출력합니다.
      - [x]  “숫자를 입력해주세요.“
   - [x]  양의 정수가 아닌 다른 수를 입력한 경우 오류에 대한 내용을 출력합니다.
      - [x]  “음수는 입력할 수 없습니다. 다시 입력해주세요.“
   - [x]  숫자가 아닌 다른 문자를 입력한 경우 오류에 대한 내용을 출력합니다.
      - [x]  “적절하지 않은 숫자 형식입니다. 다시 입력해주세요.“
   - [x]  정해진 사칙연산이 아닌 경우 오류에 대한 내용을 출력합니다.
      - [x]  “잘못된 사칙연산 기호입니다. 다시 입력해주세요.“

- [ ]  **App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)**
    - [x]  간접 접근을 통해 필드에 접근하여 **가져올** 수 있도록 구현합니다. (Getter 메서드)
    - [ ]  간접 접근을 통해 필드에 접근하여 **수정할** 수 있도록 구현합니다. (Setter 메서드)
    - [x]  위 요구사항을 모두 구현 했다면 App 클래스의 main 메서드에서 위에서 구현한 메서드를 활용 해봅니다.

- [x]  Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정
    - [x]  키워드 : `컬렉션`
        - [x]  컬렉션에서 ‘값을 넣고 제거하는 방법을 이해한다.’가 중요합니다!
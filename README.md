# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## Step 1
### String 클래스에 대한 학습 테스트
#### 요구사항 1
- [x] "1,2"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.
- [x] "1"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.
#### 요구사항 2
- [x] "(1,2)" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 "1,2"를 반환하도록 구현한다. 
#### 요구사항 3
- [x] "abc" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.
- [x] String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.
- [x] JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.

### Set Collection에 대한 학습 테스트
#### 요구사항 1
- [x] Set의 size() 메소드를 활용해 Set의 크기를 확인하는 학습 테스트를 구현한다.
#### 요구사항 2
- [x] Set의 contains() 메소드를 활용해 1, 2, 3의 값이 존재하는지를 확인하는 학습 테스트를 구현한다.
- [x] JUnit의 ParameterizedTest를 활용해 중복 코드를 제거한다.
#### 요구사항 3
- [x] 요구사항 2를 입력 값에 따라 결과 값이 다른 경우에 대한 테스트도 가능하도록 구현한다.

## Step 2
### 문자열 덧셈 계산기를 통한 TDD/리팩토링 실습
#### 기능 요구사항
- [x] 빈 문자열 또는 null 값을 전달하는 경우 0을 반환한다.
- [x] 숫자 하나를 문자열로 전달하는 경우 해당 숫자를 반환한다.
- [x] 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환한다.
- [x] 그 외에 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
- [x] 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException이 발생한다.
#### 프로그래밍 요구사항
- [x] 들여쓰기 depth를 2단계에서 1단계로 줄인다.
- [x] 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
- [x] else를 사용하지 않는다.

## Step 3
### 로또(자동)
#### 기능 요구사항
- [x] 로또 구입 금액을 입력하면 구매한 로또 개수를 출력한다.
- [x] 구입 금액이 음수이면 IllegalArgumentException 를 발생시킨다.
- [x] 구입 금액이 로또 가격(1000)으로 나누어지지 않으면 IllegalArgumentException 를 발생시킨다.
- [x] 6개의 로또 번호(1~45)를 랜덤으로 중복되지 않게 생성한다.
- [ ] 로또 번호 생성이 완료되면 로또 번호를 출력한다.
- [ ] 생성된 로또 번호가 출력되면 당첨 번호 6개를 ,로 구분하여 입력받는다.
- [ ] 입력된 당첨 번호에 구분자(,)를 제외한 문자가 입력되는 경우 IllegalArgumentException 를 발생시킨다.
- [ ] 입력된 당첨 번호가 범위 내 숫자가 아닐 경우 IllegalArgumentException 를 발생시킨다.
- [ ] 당첨 통계는 3개, 4개, 5개, 6개 일치하는 로또의 갯수와 수익률을 출력한다.

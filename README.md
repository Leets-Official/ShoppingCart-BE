## 쇼핑 카트

## 🎯 미션 요구사항
```
간단한 쇼핑 앱을 구현합니다.
스마트폰과 컴퓨터를 장바구니에 담아 구매하는 프로그램을 작성해야합니다.

- 쇼핑앱을 실행할 경우 전체 상품을 출력합니다
- 제품 번호를 입력하면 카트에 상품이 담깁니다.
- c를 누르면 지금까지 카트에 담긴 물건의 총액을 출력합니다.
- y를 누를 경우 결제를 하고 종료합니다.
- n을 누를 경우 다시 제품 번호를 입력받습니다.

```

### 구현 조건
```
- 모든 상품은 ProductRepo로 관리합니다.
- ProductRepo에 있는 데이터는 수정할 수 없습니다.
- 컴퓨터와 스마트폰 클래스는 Product를 상속받아 구현합니다.
```

### 구현 목록
Cart
```
- getProductList() : 장바구니의 상품 목록을 반환하는 메서드
```
ProductRepo
```
- findAll() : 모든 상품 목록을 반환하는 메서드
- getProduct(): 제품 번호를 통해 제품을 반환하는 메서드
```
Computer, SmartPhone 
```클래스의 필드, 생성자, 메서드를 모두 구현해야 합니다```

ShopApp
```
- start() : 실행시 어플리케이션을 실행하는 메서드
- addItemtoCart() :  장바구니에 상품을 추가하는 메서드
- printProductList() : 상품 목록을 출력하는 메서드 
```

### 입력 

제품 번호를 입력받는다.

> 이때 c를 누를 경우 결제를, q를 누를경우 종료된다
```
제품 번호를 입력 하세요(결제:c, 종료:q): 1187
```

결제를 누를 경우 y/n 으로 결제 진행 여부를 입력받는다.
```
>>>> 3600000 결제를 진행할까요? (y/n): y
```

### 출력

모든 상품 데이터를 출력한다.
```
[1187] 구글 픽셀 5, carrier: LG U+ : 900000
[228] LG 그램, cpu: Intel core i7 : 1500000
[101] 삼성 갤럭시 노트북, cpu: Intel core i9 : 1200000
[2311] Apple 맥북, cpu: Intel core i5 : 2000000
[8638] 삼성 갤럭시 S10, carrier: SKT : 1000000
[238] Apple 아이폰 15, carrier: KT : 1500000
```

결제 전 장바구니에 담긴 상품을 출력한다.
```
# 장바구니 목록 #
================================
구글 픽셀 5, carrier: LG U+ : 900000
LG 그램, cpu: Intel core i7 : 1500000
삼성 갤럭시 노트북, cpu: Intel core i9 : 1200000
```



### 실행 예시
```
# 상품 목록
================================
[1187] 구글 픽셀 5, carrier: LG U+ : 900000
[228] LG 그램, cpu: Intel core i7 : 1500000
[101] 삼성 갤럭시 노트북, cpu: Intel core i9 : 1200000
[2311] Apple 맥북, cpu: Intel core i5 : 2000000
[8638] 삼성 갤럭시 S10, carrier: SKT : 1000000
[238] Apple 아이폰 15, carrier: KT : 1500000
--------------------------------
제품 번호를 입력 하세요(결제:c, 종료:q): 1187
# 상품 목록
================================
[1187] 구글 픽셀 5, carrier: LG U+ : 900000
[228] LG 그램, cpu: Intel core i7 : 1500000
[101] 삼성 갤럭시 노트북, cpu: Intel core i9 : 1200000
[2311] Apple 맥북, cpu: Intel core i5 : 2000000
[8638] 삼성 갤럭시 S10, carrier: SKT : 1000000
[238] Apple 아이폰 15, carrier: KT : 1500000
--------------------------------
제품 번호를 입력 하세요(결제:c, 종료:q): 228
# 상품 목록
================================
[1187] 구글 픽셀 5, carrier: LG U+ : 900000
[228] LG 그램, cpu: Intel core i7 : 1500000
[101] 삼성 갤럭시 노트북, cpu: Intel core i9 : 1200000
[2311] Apple 맥북, cpu: Intel core i5 : 2000000
[8638] 삼성 갤럭시 S10, carrier: SKT : 1000000
[238] Apple 아이폰 15, carrier: KT : 1500000
--------------------------------
제품 번호를 입력 하세요(결제:c, 종료:q): 101
# 상품 목록
================================
[1187] 구글 픽셀 5, carrier: LG U+ : 900000
[228] LG 그램, cpu: Intel core i7 : 1500000
[101] 삼성 갤럭시 노트북, cpu: Intel core i9 : 1200000
[2311] Apple 맥북, cpu: Intel core i5 : 2000000
[8638] 삼성 갤럭시 S10, carrier: SKT : 1000000
[238] Apple 아이폰 15, carrier: KT : 1500000
--------------------------------
제품 번호를 입력 하세요(결제:c, 종료:q): c
# 장바구니 목록 #
================================
구글 픽셀 5, carrier: LG U+ : 900000
LG 그램, cpu: Intel core i7 : 1500000
삼성 갤럭시 노트북, cpu: Intel core i9 : 1200000
>>>> 3600000 결제를 진행할까요? (y/n): y
>>>> 결제가 완료 되었습니다!!
```

## 프로그래밍 요구사항
- Scanner를 이용해서 입력을 받습니다
- terminal 환경에서 실행해야 합니다


## 📢 미션 진행 요구사항
미션은 아래의 가이드 노션을 보고 진행합니다.

[미션 진행 가이드](https://leets-final.notion.site/BackEndZero100-1bd13059433780ce8f91cfe8ba54917a?pvs=4)

- 💡 빌드, 실행, 배포 -> 빌드 도구 -> Gradle -> 빌드 및 실행 에서 빌드 도구를 `Gradle -> IntelliJ`로 변경해줍니다.
- Before
  </br>
  <img width="342" alt="스크린샷 2024-04-04 오후 6 34 30" src="https://github.com/Leets-Official/leets-mate-java-1/assets/129377887/5275689f-3f16-44ed-9775-48f5381b00d0">

- After
  </br>
  <img width="337" alt="스크린샷 2024-04-04 오후 6 34 35" src="https://github.com/Leets-Official/leets-mate-java-1/assets/129377887/5f7c8571-b4f7-4a82-a67a-2a71200c2e13">

- 최종 설정값
  <img width="983" alt="스크린샷 2024-04-04 오후 6 34 14" src="https://github.com/Leets-Official/leets-mate-java-1/assets/129377887/014402b2-e975-4feb-b6a8-c980885e0421">

</br>

### 테스트 실행 가이드


- 터미널에서 Mac 또는 Linux 사용자의 경우 `./gradlew clean test` 명령을 실행한다.
- Windows 사용자의 경우 `gradlew.bat clean test` 명령을 실행한다.
- 모든 Task가 제대로 통과하는지 확인한다.


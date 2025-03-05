## 25-03-04 Lv1

### 1. Scanner 사용

    키보드로 입력한 값을 받아오기 위해 (챕터 1-5 스캐너 활용 참고)

### 2. if문을 통해 "종료"입력시 종료
   
    if문을 통해 "종료"가 입력되었는지 확인 (챕터 1-7 if문 참고)
    "종료" 입력시 break;를 실행하여 반복문을 멈추게 함 (챕터 1-8 break문 참고)

### 3. switch 를 통해 계산기능 작동

    if보다 switch 문이 더 효율적(여러 동작 수행 가능) (챕터 1-7 Switch문 참고)
    default 를 통해 사칙연산 기호 외 입력시 오류 표출 (챕터 1-7 Switch문 참고)
    return 0; 을 통해 값을 되돌려줌 (챕터 1- 10 반환값 참고)

### 오류 메세지 출력

    0으로 나눌 시 오류발생 -> 이를 방지 
    if(num2 == 0) (챕터 1-6 비교 연산자 참고)

### while 반복문 사용    

    while(true)필요한 만큼 사용하기 위해 while문 사용 (챕터 1-8 두번째 반복문 while 참고)
    무한반복을 방지하기 위해 "종료" 입력시 break;를 통해 종료 (챕터 1-8 break문 참고)

---

## 25-03-05 Lv2

### 두개의 클래스로 구분

    Calculator.java (계산 수행 클래스)
    App.java (입력, 실행 클래스)

###  1. Calculator.java

  계산 기능 메서드

    calculate 메서드 - public int calculate (챕터 1-10 메서드 참고)
    result = num1 (사칙연산 기호) num2; 를통해 계산하고 결과 반환
    오류 발생시 return 0; 을 통해 값을 되돌려줌 (챕터 1- 10 반환값 참고)

  계산결과 저장
  
    여러번 계산시 결과를 results리스트에 저장  (챕터 1-9 배열 참고)
    ArrayList 활용
    public class Calculator
    private List<Integer> results;  (챕터 2-7 객체지향 Part1 - 캡슐화 참고), 부족한 내용 참고(https://hahahoho5915.tistory.com/35)

 연산 결과 조회

    public List <Integer> getResults() 메서드 (챕터 1-9 배열, 2-7 캡슐화 참고)
    
 가장 오래된 연산 결과 삭제

    반환값x = void 사용 (챕터 1- 10 반환 값이 없을 때 void)
    list 관련 자료를 찾던 중 FIFO 방식을 보게되어 응용해보았다.
    Queue (대기줄) 의 방식을 응용햐여 list의 형식으로 결과값들이 때문에 FIFO방식으로 사용해 보았다. 
    (https://hyunipad.tistory.com/96)참고

---

### 2. App.java

 입력 받기

    Scanner 사용
    public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out 에 출력되는 모든 값에 적용
    키보드로 입력한 값을 받아오기 위해 (챕터 1-5 스캐너 활용 참고)

 calculator 메서드 호출
 
    import org.example.lv1.Calculator;

    public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // Calculator 클래스 안의 calculator 메서드를 호출 (챕터 1-10 메서드활용 참고)

 저장된 결과 리스트 출력

    System.out.println("현재 저장된 연산 결과: " + calculator.getResults());
                                        calculator 메서드 / getter 항목
        
        
 오래된 부분 삭제 여부 확인    

    System.out.print("가장 먼저 저장된 결과를 삭제하시겠습니까? (yes/no): ");
            String deleteInput = scanner.next();
            if (deleteInput.equalsIgnoreCase("yes")) {
                calculator.removeFirstResult();
            }
    사용자가 "yes" 입력 시 removeFirstResult 메서드를 이용하여 가장 오래된 결과 삭제

 반복 실행

    사용자가 "종료" 입력시 종료
    
    while(true)필요한 만큼 사용하기 위해 while문 사용 (챕터 1-8 두번째 반복문 while 참고)
    무한반복을 방지하기 위해 "종료" 입력시 break;를 통해 종료 (챕터 1-8 break문 참고)
     
     while (true) {
            System.out.print("첫 번째 숫자 입력 (종료하려면 '종료' 입력): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("종료")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
      -> 첫 번째 숫자 입력단계에도 "종료"를 통해 종료 가능
    
    

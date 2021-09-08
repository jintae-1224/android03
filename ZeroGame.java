import java.util.Scanner;
class StartProg{
	public static void ShowScr(String sMsg){
		System.out.println(sMsg);
	}
	public static int MyRandom(int nStart, int nNo){
		int nResult = (int)(Math.random() * nNo) + nStart;
		return nResult;
	}
	public static void ZeroGame(){
		Scanner MyScan = new Scanner(System.in);
		boolean bFlag = true;
		int nCount = 1;
		while(bFlag){	
			int nUser = MyScan.nextInt();
			int nCom = MyRandom(1,5); //1~5
			ShowScr("컴퓨터가 일으킨 인원은 " + nCom);
			if(nUser != nCom){
				ShowScr("다시 공격!");
				nCount = nCount + 1;
			}
			else {
			ShowScr("종료");
			ShowScr(nCount + "번만에 승리");
			bFlag = false;
			} 
		}
	}
	public static void main(String args[]) {

		/*
		ShowScr("START!!"); // 함수
		Scanner MyScan = new Scanner(System.in); // 클래스
		int nInput = MyScan.nextInt(); // 클래스의 메소드
		//정수:n, 실수:f, 문자:s, 배열:a, 부울:b, int i,j,k:반복문일때
		ShowScr("" + nInput);
		//int nRan = (int)(Math.random() * 3) + 4; //4 5 6
		int nRan = MyRandom(2,4); // 2 3 4 5
		ShowScr("" + nRan );
		*/
		//1. 5명이 의자에 앉아있음
		//2. 사용자가 일어날 인원을 입력(공격)
		//3. 컴퓨터는 일으킬 인원을 랜덤으로 지정(수비)
		//4. 일어날 인원과 일으킬 인원이 다르면 다시 사용자 공격, 컴퓨터 수비
		//5. 일어날 인원과 일으킬 인원이 같으면 공격 끝 : 종료
		ZeroGame();	
	}
}

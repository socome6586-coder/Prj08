package ex02;

import java.util.Scanner;

//입력 1줄 -> 결과 1줄
//입력datprivate String: 사번,이름,입사일,월급,부서번호
//            int,String,int,double,int
//           num, name, join, pay, dp
//출력     : 사번,이름,입사일,월급,보너스,수령액,부서명
//           num, name, join, pay, pb,    payb , dp2 
//금액은 소수이하 두자리로 반올림
//보너스   =  근무연수에 따라 월급의 0.5% 로 계산한다
//수령액   =  월급 + 보너스
//부서명   =  10:인사,20:자재,30:총무,40:연구개발,50:생산,60:서비스

//모든기능은 class에 구현한다.
//입력data
//사번,이름,입사일,월급,부서번호
/*
100,사나,20110101,300.0,10      
200,모모,20120301,270.0,20      
300,정연,20091003,250.0,30      
400,나연,20110105,220.0,40      
500,미나,20180401,170.0,60      
600,쯔위,20150801,200.0,50      
*/

interface Ipo {
	void input();
	void process();
	void output();
}

// Field 입력
class ComP{
	private int num;      // 번호
	private String name;  // 이름
	private int join;     // 입사일
	private double pay;   // 월급
	private int dp;       // 부서 번호

// 출력
	private double pb; // 보너스
	private double payb; // 수령액
	private String dp2; // 부서
	
	
	public ComP(int num, String name, int join, double pay, int dp) {
		this.num = num;
		this.name = name;
		this.join = join;
		this.pay = pay;
		this.dp = dp;
	}



	//Setter, Getter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJoin() {
		return join;
	}
	public void setJoin(int join) {
		this.join = join;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	public int getDp() {
		return dp;
	}
	public void setDp(int dp) {
		this.dp = dp;
	}
	public double getPb() {
		return pb;
	}
	public void setPb(double pb) {
		this.pb = pb;
	}
	public double getPayb() {
		return payb;
	}
	public void setPayb(double payb) {
		this.payb = payb;
	}


	
	public String getDp2() {
		return dp2;
	}



	public void setDp2(String dp2) {
		this.dp2 = dp2;
	}



	// toString
	@Override
	public String toString() {
		return "ComP [num=" + num + ", name=" + name + ", join=" + join + ", pay=" + pay + ", dp=" + dp + ", pb=" + pb
				+ ", payb=" + payb + "]";
	}



	
	
}

class ComPany implements Ipo {

	private ComP p;
	
	
	@Override
	public void input() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("입력:사번,이름,입사일,월급,부서번호");
		String line  = in.nextLine();
		String [] li = line.trim().split(",");
		int    num   = Integer.parseInt(li[0].trim());
		String name  = li[1].trim();
		int    join  = Integer.parseInt(li[2].trim());
		double pay   = Double.parseDouble(li[3].trim());
		int    dp    = Integer.parseInt(li[4].trim());
		
		p = new ComP(num, name, join, pay, dp);
		
	}

	@Override
	public void process() {
		int dp = p.getDp();
		String n;
		
		switch (dp) {
		case 10: n  = "인사"; break;
		case 20: n = "자재"; break;
		case 30: n = "총무"; break;
		case 40: n = "연구개발"; break;
		case 50: n = "생산"; break;
		case 60: n = "서비스"; break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + dp);
		}
		p.setDp2(n);

		
		
		// double pb = (p.getPay() % 0.05);
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		
	}

	}




public class TestProduct2 {

	public static void main(String[] args) {
		ComPany cp1 = new ComPany();
		cp1.input();
		cp1.process();
		cp1.output();
		
	}

}

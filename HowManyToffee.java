package test;

public class HowManyToffee {
	public static void main(String[] args) {
		System.out.println("Total ToffeeWrapper is : "+HowManyToffee(32));
	}
	/* Question : In RS. 1 one toffe and in 3 Wrapper 1 toffee then calc how many toffee will u get in given Amt*/
	static int HowManyToffee(int Amt){
		int FinalToffee=Amt,ToffeeWrapper=Amt,ExtraToffeetWrapper=0;
		while (ToffeeWrapper+ExtraToffeetWrapper>3) {
			FinalToffee+=(ToffeeWrapper+ExtraToffeetWrapper)/3;
			ToffeeWrapper=(ToffeeWrapper+ExtraToffeetWrapper)/3;
			ExtraToffeetWrapper = (ToffeeWrapper+ExtraToffeetWrapper)%3;
		}
		return FinalToffee;
	}
}

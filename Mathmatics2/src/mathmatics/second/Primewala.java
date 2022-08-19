package mathmatics.second;

import java.util.Arrays;

public class Primewala {
	
	static boolean simpleprime(int n) {
		if(n==1||n==0) return false;
		for(int i=2;i<n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	static boolean rootprime(int n) {
		if(n==1||n==0) return false;
		for(int i=3;i*i<=n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	static boolean isprimeSbseEff(int n) {
		if(n==1||n==0) return false;
		if(n==2||n==3) return true;
		if(n%2==0||n%3==0) return false;
		for(int i=5;i*i<=n;i+=6) {
			if(n%i==0||n%(i+2)==0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isprimeSbseEff(911));
//		printUntillNprime(30);
		sieveaofratostheeme(30);
	}
	
	public static void sieveaofratostheeme(int n) {
		boolean isPrime[]= new boolean[n+1];
		Arrays.fill(isPrime, true);
		for(int i=2;i*i<=n;i++) {
			if(isPrime[i]) {
				for(int j=2*i;j<=n;j+=i) {
					isPrime[j]=false;
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(isPrime[i]) System.out.println(i);
		}
	}
	
	public static void printUntillNprime(int n) {
		for(int i=1;i<=n;i++) {
			if(isprimeSbseEff(n)) {
				System.out.println(i);
			}
		}
	}
}

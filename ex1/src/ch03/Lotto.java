package ch03;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	
	final int LOTTO_NUMBER_SIXE = 6; 
	
	public int[] createNumber() {
		int[] lottoWinNum = new int[LOTTO_NUMBER_SIXE];
		Random random = new Random();
		for(int i = 0; i < lottoWinNum.length; i++) {
			lottoWinNum[i] = random.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if( lottoWinNum[i] == lottoWinNum[j] ) {
					i--;
				}
			}
		}
		Arrays.sort(lottoWinNum);
		System.out.println(Arrays.toString(lottoWinNum));
		return lottoWinNum;
	}
}

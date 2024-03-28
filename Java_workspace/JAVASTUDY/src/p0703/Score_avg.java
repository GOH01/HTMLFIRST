package p0703;

public class Score_avg {

	public static void main(String[] args) {
		double score[][]= {
				{3.3,3.4},
				{3.5,3.6},
				{3.7,4.0},
				{4.1,4.2}};
		int i,j;
		double sum=0.0;
		double avg;
		
		for(i=0; i<score.length; i++)
		{
			for(j=0; j<score[0].length; j++)
			{
				sum+=score[i][j];
			}
		}
		avg=sum/(score.length*score[0].length);
		
		System.out.print("평균: "+avg );

	}

}

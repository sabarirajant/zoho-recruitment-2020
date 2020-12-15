#include <stdio.h>

	int main()
	{
	    int noOfRows;
	  
		printf("Input:");
		
		scanf("%d",&noOfRows);
		
		
		 int rowCount = 1;
	
		for (int i = 0; i <=noOfRows; i++) {
		
			for (int j = 0; j <=noOfRows-i; j++) {
				printf("  ");
			}
		
			for (int j = i; j >=0; j--) {
				printf("%d ",j);
			}
		
			for (int j = 1; j <=i; j++) {
				printf("%d ",j);
			}
			printf("\n");
		
			rowCount++;
		}
		return 0;
	}

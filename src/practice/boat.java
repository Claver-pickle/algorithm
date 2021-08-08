package practice;

import java.util.Arrays;

public class boat {

	
	public static void main(String[] args) {
        int answer = 0;
        int[] people = {70,50,80,50};
        int limit = 100;

        //Á¤·Ä
        Arrays.sort(people);
        //{50,50,70,80}
        
        int first_person = 0;
        int last_person = people.length-1;
        
        while(first_person<=last_person) {
        	if(people[first_person]+people[last_person]<=limit) {
            	first_person++;
            	last_person--;
            	answer ++;
            }else {
            	last_person--;
            	answer++;
            }
        }
        	
        
        
        System.out.println(answer);
    }
	

}

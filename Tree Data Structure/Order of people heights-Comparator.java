public class Solution {
    
    class Person{
        
        int height, infront;
        
        Person(int height, int infront){
            this.height = height;
            this.infront = infront;
        }
    }
	
	 public ArrayList<Integer> order(ArrayList<Integer> heights, ArrayList<Integer> infront) {
	 
	  ArrayList<Integer> output = new ArrayList<>();
	  ArrayList<Person> persons = new ArrayList<>();
	 
    int n = heights.size();

    for (int i = 0; i < n; i++)
        persons.add(new Person(heights.get(i), infront.get(i)));
		
		
	  Collections.sort(persons, new Comparator<Person>(){
        public int compare(Person a, Person b) {
      
	  return (a.height == b.height ) ? a.infront - b.infront : b.height - a.height;
 
        }
    });	
	
	for(int i = 0; i< n; i++)
	 output.add(persons.get(i).infront, persons.get(i).height);
	
	return output;
	}
	}
	
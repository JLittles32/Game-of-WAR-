package JavaFinalProject;

public class Card {
	
		
		public int value;
		public String name;
		 
		 public Card(int value, String string) {
			 this.value = value;
			 this.name = string;
			 
		 }

		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		public void describe() {
			System.out.println(name);
			
		}
	
	
	}

	



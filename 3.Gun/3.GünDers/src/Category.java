

public class Category {
	
		private int id;
		private String name; 
		private String tür;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name + " !!! ";        // daha sonradan tüm name deðiþkenlerine eklemek için kolayn kullaným
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTür() {
			return tür;
		}
		public void setTür(String tür) {
			this.tür = tür;
		}
		

}

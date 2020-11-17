package AlienRepository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

    @Entity
	@Table(name="another")
	public class User {
		
    	@Id
		private int id;
		private String ename;
		private String pass;
		
		public User() {
			
		}
		public User(int id, String name, String pass) {
			super();
			this.id = id;
			this.ename = ename;
			this.pass = pass;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String getPass() {
			return pass;
		}
		
		public void setPass(String pass) {
			this.pass = pass;
		}
		
		@Override
		public String toString() {
			return "User [id=" + id + ", ename=" + ename + ", pass=" + pass + "]";
		}
	
}



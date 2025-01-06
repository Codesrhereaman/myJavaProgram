class mydata {
    private int id;
    private String name;

     public void setname(String n) {
            name = n;
        }

        public String getname() {
            return name;
        }

        public void setid(int i) {
            this.id = i; //also 'this' can be used to set
        }

        public int getid() {
            return id;
        }
        //we have created some method to access fields  as private is used
        //is this way, we can use if commands to get right outputs from the user
}


public class ch9_accessModifiers_getters_setters {
    public static void main(String[] args) {
        //access(getters or setters) modifiers are used to access fields in different  way like private/protected/public
        mydata data = new mydata();
//        data.id = 45;
//        data.name = "code with Aman"; this will throw an error....no direct excess
        data.setname("code with Aman");
        data.setid(45);
        System.out.println(data.getname());
        System.out.println(data.getid());

    }
}

public class User {

    private int id;
    private String name;
    private String email;
    private  String address;
    private String phoneNumber;

    //Creando el método constructor con los parámetros mínimos para poder crear un usuario nuevo (Nombre y email)

    public User(String name, String email){
        this.name=name;
        this.email=email;

    }

    //Generanddo los gettters y setters de los atributos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        //Valida que el número sea de máximo 10 dígitos cuando sea ingresado
        if (phoneNumber.length() > 10){
            System.out.println("El número telefónico debe ser de 10 dígitos máximo");
        }else if(phoneNumber.length() == 10){
            this.phoneNumber = phoneNumber;
        }
    }

    //Se uso el método toString para manejar la sobreescritura de uno de mis métodos acerca de los valores que quiero que me regrese
    

    public String toString(){
        return "User: " + name + ", Email: "+email+
                "\nAddreess: "+address+". Phone: "+phoneNumber;
    }




    
}




/**ésta clase cumple con el papel de la clase padre que hereda los atributos que tienen en comun las clases hijo (Doctor y Patient) */
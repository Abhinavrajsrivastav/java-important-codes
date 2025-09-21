// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//custum exceptions

class CustumException extends Exception{
    public CustumException(String message){
        super(message);
    }
}

class B{
    private int age;
    
    public B(int age) throws CustumException{
        if(age<18){
            throw new CustumException("Age should be greater or more than 18");
        }
        this.age = age;
        System.out.println("Age is set to: "+age);
    }
}


class CustumExceptionCode {
    public static void main(String[] args) {
       try{
           B b = new B(15);
       }catch(CustumException e){
           System.out.println(e.getMessage());
       }
       
       try{
           B b = new B(20);
       }catch(CustumException e){
           System.out.println(e.getMessage());
       }
    }
}
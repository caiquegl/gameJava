package Classes;

public class GetUsuario {
   private static String usuario;
   private static int senha;
   
   public GetUsuario(){
       this("", 0);
   }
   
   public GetUsuario(String user, int key){
       GetUsuario.usuario = user;
       GetUsuario.senha = key;
       
   }
   
   public void setUsuario(String user){
       GetUsuario.usuario = user;
   }
   
   public String getName(){
       return GetUsuario.usuario;
       
   }
   
}

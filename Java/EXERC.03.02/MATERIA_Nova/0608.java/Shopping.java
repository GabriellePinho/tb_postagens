

public class Shopping {

   
        String nomedoshopping;
        String cidadedoshoppping;
        String bairrodoshopping;
        String ruadoshopping;
        String numerodoshopping;
    
        public  Shopping( String nomedoshopping,
        String cidadedoshoppping,
        String bairrodoshopping,
        String ruadoshopping,
        String numerodoshopping){
         this.nomedoshopping=nomedoshopping;
         this.cidadedoshoppping=cidadedoshoppping;
         this.bairrodoshopping=bairrodoshopping;
         this.ruadoshopping =ruadoshopping;
         this.numerodoshopping =numerodoshopping;
        }
        public void nomedoshopping(){
            System.out.println("nomedoshopping:  " + nomedoshopping);
            System.out.println("cidadedoshopping:  "+cidadedoshoppping);
            System.out.println("bairrodoshopping:  "+bairrodoshopping);
            System.out.println("ruadoshopping:  "+ruadoshopping);
            System.out.println("numerodoshopping:  "+numerodoshopping);
        }
    
    
    
    
        
        public static void main(String[] args){
            Shopping shop = new Shopping("Norte Shopping", "Rio de Janeiro", "Del Castilho", "Av. Dom Helder Câmara", "1313");
            shop.nomedoshopping();
        }
    }









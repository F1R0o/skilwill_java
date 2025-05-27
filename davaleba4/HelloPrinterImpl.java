package davaleba4;

public class HelloPrinterImpl implements HelloPrinter {


        @Override
        public void hello(String message) {
            System.out.println(message);
        }


        @Override
        public void hello(String message, int count) {
            for (int i = 0; i < count; i++) {
                System.out.println(message);
            }
        }

        
       
    }

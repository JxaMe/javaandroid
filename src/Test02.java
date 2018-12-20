import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Test02 {
    public static void main(String[] args) {
        char play1='b';
        char play2='a';
        // a石头,b剪刀,c布
        if (play1=='a' && play2=='a'){
            System.out.println("石头对石头,平手");
        }else if (play1=='a' && play2=='b'){
            System.out.println("石头对剪刀,play1获胜");
        }else if (play1=='a'&&play2=='c'){
            System.out.println("石头对布,Play2获胜");
        }else if (play1=='b'&&play2=='a'){
            System.out.println("剪刀对石头,play2获胜");
        }else if (play1=='b'&&play2=='b'){
            System.out.println("剪刀对剪刀,平手");
        }else if (play1=='b'&&play2=='c'){
            System.out.println("剪刀对布,Play1获胜");
        }else if (play1=='c'&&play2=='a'){
            System.out.println("布对石头,play1获胜");
        }else if (play1=='c'&&play2=='b'){
            System.out.println("布对剪刀,Play2获胜");
        }else if (play1=='c'&&play2=='c'){
            System.out.println("剪刀对剪刀,平手");
        }
    }
}

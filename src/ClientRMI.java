import fold1.ILibrairieRemote;
import fold1.Livre;

import java.rmi.Naming;
import java.util.Scanner;

public class ClientRMI
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try {

            String nom ="rmi://localhost:1099/REF";
            int i = 0;
            i=sc.nextInt();

            String titre="/khaldi/"+i/10+"/abdarhmane/"+i%10+"/" +i ;
            ILibrairieRemote stup=(ILibrairieRemote) Naming.lookup(nom);
            Livre livre =new Livre(titre);
            float textserveur= stup.renvoyerPrix(livre);
            System.out.println("LE PRIXT EST :"+textserveur);

        } catch (Exception e) {



            e.printStackTrace();
        }
    }
}/*
public class ClientRMI {
    public static void main(String[] args) {
        try {
            String nom= "rmi://localhost:1099/REF";
            String titre="/khaldi/0/abdarhmane/1/1";
            ILibrairieRemote stub = (ILibrairieRemote) Naming.lookup(nom);

            Livre livre=stub.creerLivre(titre);
            System.out.println(stub.renvoyerPrix(livre));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/
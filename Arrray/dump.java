package Arrray;

import java.util.ArrayList;
import java.util.Objects;

public class dump {

    public static void main(String[] args) {

        int[] a = {1,2,1,3,3,3,3,6,6,6,6,6,6,0};
        int[] visited =new int[a.length];

        int visit=-1;
        for(int i=0;i<a.length;i++)
        {
            int count=1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    visited[j]=visit;
                }
            }
            if(visited[i]!=visit)
            {
                visited[i]=count;
            }
        }
        for(int i=0 ;i<a.length;i++)
        {
            if(visited[i]!=visit)
                System.out.println("frequency of "+a[i]+" is "+visited[i]);
        }


        ArrayList<String > airtel = new ArrayList();
        airtel.add("Chennai");
        airtel.add("Nagpur");
        airtel.add("Delhi");
        System.out.println(airtel);

//        airtel.remove(1);
//        airtel.remove("Chennai");
//
//        System.out.println(airtel);

        airtel.add("Ranchi");
        airtel.add("Pune");
        airtel.add("Panaji");

        System.out.println(airtel);

        airtel.set(3,"Shimla");
        System.out.println(airtel);

        ArrayList<String> jio = new ArrayList<>();
        jio.add("Kolkata");
        jio.addAll(airtel);
        System.out.println(jio);

        System.out.println(jio.contains("Nagpur"));

        ArrayList<String> vi = new ArrayList<>();
        vi.add("Pune");
        vi.add("Pune");
        vi.addAll(jio);
        vi.addAll(airtel);
        System.out.println(vi);
        jio.retainAll(vi); //retain provided collection and remove the other collections
        System.out.println(jio);

        vi.get(0);
        System.out.println(vi.get(0));


    }
}

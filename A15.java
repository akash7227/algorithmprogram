import java.util.*;
class util{
int i=0;
	void toBinary(int data)
	{
		
		int remainder;
		/*if(data<=1)
		{
		i++;
			System.out.print("kk"+data);
			return;
		}
		remainder = data %2; 
        toBinary(data >> 1);
        System.out.println("a"+remainder);
	*/
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	while(data>0)
	{
	remainder = data %2; 
	data=data/2;
	al.add(remainder);
	//System.out.println("akash");
	}
	//System.out.print(al.size());
	Integer[] check=new Integer[al.size()];
	check=al.toArray(check);
	//System.out.print(check.length);
	for(int i=check.length-1;i>=0;i--)
	{
	//System.out.println("check");
	System.out.print(check[i]);
	}
	}

	
	
}
class A15{
	public static void main(String...args)
	{
	  int number; 
	util u=new util();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        number = sc.nextInt();

        if (number < 0)
		{
            System.out.println("Error: Not a positive integer");
        } 
		else 
		{ 
            System.out.print("Convert to binary is:");
          	u.toBinary(number);
            
        }
	}
}

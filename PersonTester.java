class Person implements Comparable<Person>
{
	int age;
	String name;

	public Person(int newAge, String newName)
	{
		this.age = newAge;
		this.name = newName;
	}	

	public int compareTo(Person p)
	{
		if(this.age > p.age)
		{
			System.out.print(this.name + "is bigger than" + p.name);
			return 0;
		}
		else if(this.age == p.age)
		{
			if(this.name.compareTo(p.name)== 0)
			{
				System.out.println("P1 and P2 are equal");
				return 0;
			}
			else
			{
				if(this.name.compareTo(p.name) > 0)
				{
					System.out.println(this.name + "\n" + p.name);
					return 0;
				}
				else
				{
					System.out.println(p.name + "\n" + this.name);
					return 0;
				}
			}

		}
		else
		{
			System.out.println(this.name + "is smaller than " + p.name);
			return 0;
		}
	}
}

public class PersonTester
{
	public static void main(String[]args){
		Person waleed = new Person(new Integer(22), "Waleed");
		Person voika = new Person(new Integer(22), "Waleed");
		waleed.compareTo(voika);

	}
}
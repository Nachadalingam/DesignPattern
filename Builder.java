import javax.naming.InvalidNameException;

public class Builder {
    private String firstname;
    private String lastname;
    private String age;
    private String emil;

    private Builder(String firstname,String lastname,String age,String email)
    {
         this.firstname=firstname;
         this.age=age;
         this.lastname=lastname;
         this.emil=email;
    }
    public static friend build()
    {
        return new friend();
    }

    @Override
    public String toString() {
        return "Builder{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age='" + age + '\'' +
                ", emil='" + emil + '\'' +
                '}';
    }

    public static class friend
    {
        private String firstname;
        private String lastname;
        private String age;
        private String emil;

        public friend setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public friend setAge(String age) {
            this.age = age;
            return this;
        }

        public friend setEmil(String emil) {
            this.emil = emil;
            return this;
        }

        public friend setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }
        private void validate()  {
            if(this.firstname==null || this.lastname==null)
            {
                throw new CorrectNameException();
            }
        }
        public Builder createobject()
        {
             validate();
            return new Builder(this.firstname,this.lastname,this.age,this.emil);

        }
    }
}

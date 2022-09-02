import java.util.Arrays;

    public class Person {

        private String name;
        private String dateOfBirth;
        private String[] address;

        public Person(String dorothy){}

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String[] getAddress() {
            return address;
        }

        public void setAddress(String[] address) {
            this.address = address;
        }


        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' + "\n" +
                    ", dateOfBirth='" + dateOfBirth + '\'' + "\n" +
                    ", address=" + Arrays.toString(address) + "\n" +
                    '}';
        }
    }



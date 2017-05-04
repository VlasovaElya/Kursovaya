package hello.model;

/**
 * Created by elvir_000 on 03.05.2017.
 */
public class Person {
    @Entity
    @Table(name="person")
    public class Person {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Integer id;

        @Column(name="n_person")
        private int n_person;
        private String name;
        private String surname;
        private String patronymic;
        private String gender;
        private String date_of_birth;




        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public int getN_person() {
            return n_person;
        }

        public void setN_person(int n_person) {
            this.n_person = n_person;
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }
        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getPatronymic() {
            return patronymic;
        }
        public void setPatronymic(String patronymic) {
            this.patronymic = patronymic;
        }

        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getDate_of_birth() {
            return date_of_birth;
        }
        public void setDate_of_birth(String patronymic) {
            this.date_of_birth = date_of_birth;
        }
    }
}

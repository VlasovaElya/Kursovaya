package hello.model;

/**
 * Created by elvir_000 on 03.05.2017.
 */
public class Person {
    @Entity
    @Table(name="PersonAll")
    public class Person {
        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private Integer id;

        @Column(name="person")
        private String n_person;
        private String fio;
        private String gender;
        private String date_of_birth;




        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getTypename() {
            return typename;
        }

        public void setTypename(String typename) {
            this.typename = typename;
        }

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public float getRadius() {
            return radius;
        }

        public void setRadius(float radius) {
            this.radius = radius;
        }
    }
}

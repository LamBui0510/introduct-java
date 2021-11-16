package kiemtragiuaModule2.QuanLyNhanVien;

        public class Staff {
        int id = 0;
        String name;
        String phoneNumber;
        String address;
        static int idNumber = 1;

            public Staff(String name, String phoneNumber, String address) {
                this.id = idNumber++;
                this.name = name;
                this.phoneNumber = phoneNumber;
                this.address = address;

            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public int getIdNumber() {
                return idNumber;
            }

            public void setIdNumber(int idNumber) {
                this.idNumber = idNumber;
            }

            @Override
            public String toString() {
                return "Staff{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", phoneNumber='" + phoneNumber + '\'' +
                        ", address='" + address + '\'' +
                        '}';
            }
        }



package s11_builder_pattern;

public class User {

    private final String id;
    private final String name;
    private final String email;
    private final String phone;
    private final boolean marketingAgree;

    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.marketingAgree = builder.marketingAgree;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", marketingAgree=" + marketingAgree +
                '}';
    }

    public static class Builder {

        // 필수
        private final String id;
        private final String name;

        // 선택
        private String email;
        private String phone;
        private boolean marketingAgree;

        public Builder(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder marketingAgree(boolean agree) {
            this.marketingAgree = agree;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }
}
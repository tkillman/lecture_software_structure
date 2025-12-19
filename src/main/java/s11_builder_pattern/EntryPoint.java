package s11_builder_pattern;

public class EntryPoint {
    public static void main(String[] args) {
        User user = new User.Builder("u001", "Kim")
                .email("kim@test.com")
                .phone("010-1234-5678")
                .marketingAgree(true)
                .build();

        System.out.println(user);
    }
}

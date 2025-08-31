import java.io.*;

class EmpDetails {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter ID: ");
        int id = Integer.parseInt(br.readLine());

        System.out.print("Enter Gender (M/F): ");
        char gender = (char) br.read();
        br.skip(2); // To consume leftover newline character

        System.out.print("Enter Name: ");
        String name = br.readLine();

        System.out.println("\nEmployee Details:");
        System.out.println("ID = " + id);
        System.out.println("Gender = " + gender);
        System.out.println("Name = " + name);
    }
}


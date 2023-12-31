import java.util.Scanner;

public class PasswordValidator {

	public static boolean isValid(String password)
	{

		if (!((password.length() >= 8)
			&& (password.length() <= 16))) {
			return false;
		}

		if (password.contains(" ")) {
			return false;
		}
		if (true) {
			int count = 0;

			for (int i = 0; i <= 9; i++) {

				String str1 = Integer.toString(i);

				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}

		if (!(password.contains("@") || password.contains("#")
			|| password.contains("!") || password.contains("~")
			|| password.contains("$") || password.contains("%")
			|| password.contains("^") || password.contains("&")
			|| password.contains("*") || password.contains("(")
			|| password.contains(")") || password.contains("-")
			|| password.contains("+") || password.contains("/")
			|| password.contains(":") || password.contains(".")
			|| password.contains(", ") || password.contains("<")
			|| password.contains(">") || password.contains("?")
			|| password.contains("|"))) {
			return false;
		}

		if (true) {
			int count = 0;

			for (int i = 65; i <= 90; i++) {

				char c = (char)i;

				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}

		if (true) {
			int count = 0;

			for (int i = 97; i <= 122; i++) {

				char c = (char)i;
				String str1 = Character.toString(c);

				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args)
	{

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password to validate: ");
        String userPassword = scanner.nextLine();

        if (isValid(userPassword)) {
            System.out.println(userPassword + " - Valid Password");
        } else {
            System.out.println(userPassword + " - Invalid Password!");
        }

        scanner.close();
	}
}

    

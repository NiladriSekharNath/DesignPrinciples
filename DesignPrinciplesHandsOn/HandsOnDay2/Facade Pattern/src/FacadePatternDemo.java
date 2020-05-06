import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternDemo {
	private static int choice;

	public static void main(String[] args) {

		do {
			System.out.print("========= Shape Maker ============ \n");
			System.out.print("            1. Circle.              \n");
			System.out.print("            2. Rectangle.              \n");
			System.out.print("            3. Square.            \n");
			System.out.print("            4. Exit.                     \n");
			System.out.print("Enter your choice: ");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try {
				choice = Integer.parseInt(br.readLine());
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
			ShapeMaker shapeMaker = new ShapeMaker();

			switch (choice) {
			case 1:
				shapeMaker.drawCircle();

				break;
			case 2:
				shapeMaker.drawRectangle();

				break;
			case 3:
				shapeMaker.drawSquare();

				break;
			default:
				System.out.println("No Shape Chosen");

				return;
			}

		} while (choice != 4);
	}

}

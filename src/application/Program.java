package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entites.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date now = new Date();

		System.out.print("Qual o número do quarto: ");
		int room = sc.nextInt();
		System.out.print("Qual a data de Check-in: (dd/MM/yyyy)");
		Date checkin = sdf.parse(sc.next());
		System.out.print("Qual a data de Check-out: (dd/MM/yyyy)");
		Date checkout = sdf.parse(sc.next());

		
			Reservation reservation = new Reservation(room, checkin, checkout);
			System.out.println("Reservation" + reservation);

			System.out.println("Quer atualizar as datas de Check-in? (y/n)");
			char c = sc.next().charAt(0);
			if (c == 'y') {

				
				System.out.println();
				System.out.println("Entra com a data de atualização: (dd/MM/yyyy)");
				System.out.print("Qual a data de Check-in: (dd/MM/yyyy)");
				checkin = sdf.parse(sc.next());
				System.out.print("Qual a data de Check-out: (dd/MM/yyyy)");
				checkout = sdf.parse(sc.next());
				
				String error = reservation.updateDates(checkin, checkout);
				if (error != null) {
					System.out.println("Error in Reservation: "+ error);
				}
				else {
					System.out.println("Reservation: "+reservation);

			}

			sc.close();
		}
	}
}
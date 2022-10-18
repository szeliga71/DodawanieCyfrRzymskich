public class main {

    public static void main(String[] args) {

        String pierwsza = "VI";
        String druga = "MCIX";
        System.out.println(odczytRzym(pierwsza));
        System.out.println(odczytRzym(druga));

        int faktor = 1;
        String wynikRzym = "";
        int liczba = sumaRzymskich(pierwsza, druga);


        while (liczba > 0) {
            wynikRzym = rome(liczba % 10, faktor) + wynikRzym;
            liczba = liczba / 10;
            faktor = faktor * 10;
        }



        System.out.println(wynikRzym);

        System.out.println(pierwsza +" "+"+"+" "+druga+" "+"="+" "+wynikRzym);
    }

    //=======================================================================
    public static int sumaRzymskich(String pier, String drug) {
        int suma = 0;

        suma = odczytRzym(pier) + odczytRzym(drug);
        return suma;
    }


    public static String rome(int licz, int fak) {

        String romeWynik = "";

        if (licz != 0) {
            if (licz == 1) {
                romeWynik = romeWynik + jakaRzym(1 * fak);
            }
            if (licz == 2) {
                romeWynik = romeWynik + jakaRzym(1 * fak) + jakaRzym(1 * fak);

            }
            if (licz == 3) {
                romeWynik = romeWynik + jakaRzym(1 * fak) + jakaRzym(1 * fak) + jakaRzym(1 * fak);

            }
            if (licz == 4) {
                romeWynik = romeWynik + jakaRzym(1 * fak) + jakaRzym(5 * fak);

            }
            if (licz == 5) {
                romeWynik = romeWynik + jakaRzym(5 * fak);
            }
            if (licz == 6) {
                romeWynik = romeWynik + jakaRzym(5 * fak) + jakaRzym(1 * fak);
            }
            if (licz == 7) {
                romeWynik = romeWynik + jakaRzym(5 * fak) + jakaRzym(1 * fak) + jakaRzym(1 * fak);
            }
            if (licz == 8) {
                romeWynik = romeWynik + jakaRzym(5 * fak) + jakaRzym(1 * fak) + jakaRzym(1 * fak) + jakaRzym(1 * fak);
            }
            if (licz == 9) {
                romeWynik = romeWynik + jakaRzym(1 * fak) + jakaRzym(10 * fak);
            }


        }
        return romeWynik;
    }


    public static int odczytRzym(String liczba) {

        int odczytana = 0;
        char temp = 0;

        for (int i = liczba.length() - 1; i >= 0; i--) {
            if (liczba.charAt(i) == temp) {
                odczytana = odczytana + jakaArab(liczba.charAt(i));
                temp = liczba.charAt(i);
                continue;
            }
            if (jakaArab(liczba.charAt(i)) >= odczytana) {
                odczytana = odczytana + jakaArab(liczba.charAt(i));
                temp = liczba.charAt(i);
            } else {
                odczytana = odczytana - jakaArab(liczba.charAt(i));
                temp = liczba.charAt(i);
            }
        }

        return odczytana;
    }

    public static int jakaArab(char a) {

        int arab = 0;

        switch (a) {

            case 'I':
                arab = 1;
                break;

            case 'V':
                arab = 5;
                break;

            case 'X':
                arab = 10;

                break;

            case 'L':
                arab = 50;

                break;

            case 'C':
                arab = 100;

                break;

            case 'D':
                arab = 500;

                break;

            case 'M':
                arab = 1000;

                break;

        }
        return arab;
    }

    public static String jakaRzym(int a) {

        String rzym = "";

        switch (a) {

            case 0:
                rzym = "";
                break;

            case 1:
                rzym = "I";
                break;

            case 5:
                rzym = "V";
                break;

            case 10:
                rzym = "X";

                break;

            case 50:
                rzym = "L";

                break;

            case 100:
                rzym = "C";

                break;

            case 500:
                rzym = "D";

                break;

            case 1000:
                rzym = "M";

                break;

        }
        return rzym;
    }

}







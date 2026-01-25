package JFrame;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class teste2
{

    public static void main(String[] args)
    {
        int answer;
        int tempAge;
        String tempName;
        boolean continuity = true;


        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        HashMap<String, Integer> studentsList = new HashMap<>();

        Runnable titlePrinter = () -> System.out.println("----------- SISTEMA ESCOLAR 2026 ----------");
        Runnable linePrinter = () -> System.out.println("-------------------------------------------");

        while (continuity)
        {
            titlePrinter.run();
            System.out.print("1 - CADASTRO DE ALUNOS \n2 - VER CADASTROS \n3 - SAIR DO SISTEMA\n");
            linePrinter.run();

            System.out.println("-> ");
            answer = scan.nextInt();
            System.out.println();

            switch (answer)
            {
                case 1:

                    linePrinter.run();
                    // Name
                    System.out.println("NOME: ");
                    tempName = scan.next();
                    System.out.println();

                    // Age

                    System.out.println("IDADE: ");
                    tempAge = scan.nextInt();
                    System.out.println();

                    studentsList.put(tempName, tempAge);
                    System.out.println("Aluno adicionado ao sistema.");
                    linePrinter.run();
                    break;

                case 2:

                    linePrinter.run();
                    for(Map.Entry<String, Integer> entry : studentsList.entrySet())
                    {
                        System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
                    }
                    linePrinter.run();
                    break;

                case 3:
                    continuity = false;
                    break;

            }

        }

    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome do curso: ");
        String nome = scan.next();

        System.out.println("Horário do curso: ");
        String horario = scan.next();

        System.out.println("Nome do professor: ");
        String profNome = scan.next();

        System.out.println("Departamento que o professor pertence: ");
        String depProf = scan.next();

        System.out.println("Email do professor");
        String emailProf = scan.next();

        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(profNome);
        professor.setDepartamento(depProf);
        professor.setEmail(emailProf);

        curso.setProfessor(professor);

        System.out.println("##### Aluno #####");

        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < 5; i++) {
            scan.nextLine();
            System.out.println("Nome do aluno: " + (i + 1));
            String nomeAluno = scan.nextLine();
            System.out.println("Matrícula do aluno: ");
            String matAluno = scan.nextLine();
            
            double[] notas = new double[4];
            for (int j = 0; j < 4; j++) {
                System.out.println("Notas = " + (j + 1));
                notas[j] = scan.nextDouble();
            }

            Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
            aluno.setNotas(notas);
            
            alunos[i] = aluno;
        }
        curso.setAlunos(alunos);
        System.out.println(curso.obterInfo());
    }
}

import java.time.LocalDate;

import br.com.desafio.dio.dominio.BootCamp;
import br.com.desafio.dio.dominio.Curso;
import br.com.desafio.dio.dominio.Dev;
import br.com.desafio.dio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("GFT Quality Assurance Para Mulheres");
        bootCamp.setDescricao("GFT Quality Assurance Para Mulheres");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        Dev dev2 = new Dev();

        dev1.setNome("Andrea");   
        dev1.inscreverBootcamp(bootCamp);

        dev2.setNome("junia");
        dev2.inscreverBootcamp(bootCamp);  
        
        System.out.println("");
        System.out.println(":::::::::: Dev " + dev1.getNome() + " ::::::::::");
        System.out.println("Conteudos Inscritos -> " + dev1.getConteudosInscritos());  
        System.out.println("XP -> "+dev1.calcularTotalXp());

        System.out.println("1a progressao");      
        dev1.progredir(); 
        System.out.println("Conteudos Inscritos -> " + dev1.getConteudosInscritos());    
        System.out.println("Conteudos Concluidos -> " + dev1.getConteudosConcluidos());
        System.out.println("XP -> "+dev1.calcularTotalXp());

        System.out.println("2a progressao");      
        dev1.progredir(); 
        System.out.println("Conteudos Inscritos -> " + dev1.getConteudosInscritos());    
        System.out.println("Conteudos Concluidos -> " + dev1.getConteudosConcluidos());
        System.out.println("XP -> "+dev1.calcularTotalXp());
        
        System.out.println("3a progressao");      
        dev1.progredir(); 
        System.out.println("Conteudos Inscritos -> " + dev1.getConteudosInscritos());    
        System.out.println("Conteudos Concluidos -> " + dev1.getConteudosConcluidos());
        System.out.println("XP -> " + dev1.calcularTotalXp());    
        
        dev1.progredir();  
            
        System.out.println("");

        System.out.println(":::::::::: Dev " + dev2.getNome() + " ::::::::::");
        System.out.println("Conteudos Inscritos  -> " + dev2.getConteudosInscritos());  
        System.out.println("XP -> "+dev2.calcularTotalXp());     
        
        System.out.println("1a progressao");      
        dev2.progredir(); 
        System.out.println("Conteudos Inscritos -> " + dev2.getConteudosInscritos());    
        System.out.println("Conteudos Concluidos -> " + dev2.getConteudosConcluidos());
        System.out.println("XP -> "+dev2.calcularTotalXp());

        System.out.println("2a progressao");      
        dev2.progredir(); 
        System.out.println("Conteudos Inscritos -> " + dev2.getConteudosInscritos());    
        System.out.println("Conteudos Concluidos -> " + dev2.getConteudosConcluidos());
        System.out.println("XP -> "+dev2.calcularTotalXp());

    }
}

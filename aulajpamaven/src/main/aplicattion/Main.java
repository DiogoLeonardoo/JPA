import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class  Main {
    public static void main(String[] args) {


        Pessoa p1 = new Pessoa(null, "João", "diogoleo57@gmail.com");
        Pessoa p2 = new Pessoa(null, "Maria", "diogoleonardo@gmail.com");
        Pessoa p3 = new Pessoa(null, "José", "djkadja@gmail.com");

        EntityManagerFactory enf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = enf.createEntityManager();
        // --> Repository (Salvar no Banco de Dados)

        //Pesquisa no Banco de dados (Convertendo para objeto)
        Pessoa p = em.find(Pessoa.class, 2);
        em.getTransaction().begin();

        //Remoção
        em.remove(p);
        em.getTransaction().commit();

        //Entidade monitorada (Recuperação via método find)

        System.out.println("Pronto!");
        em.close();
        enf.close();
    }
}
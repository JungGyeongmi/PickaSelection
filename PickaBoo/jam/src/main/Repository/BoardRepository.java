import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    

    /*
        @Query("select af from ApplicationForm af where af.member.id=:id")  
        ApplicationForm findByMemberId(String id);
    */
}

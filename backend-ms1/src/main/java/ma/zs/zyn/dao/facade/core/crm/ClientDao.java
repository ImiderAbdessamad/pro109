package ma.zs.zyn.dao.facade.core.crm;

import ma.zs.zyn.zynerator.repository.AbstractRepository;
import ma.zs.zyn.bean.core.crm.Client;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ClientDao extends AbstractRepository<Client,Long>  {

    Client findByUsername(String username);


}

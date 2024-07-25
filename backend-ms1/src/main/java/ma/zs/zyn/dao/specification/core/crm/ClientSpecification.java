package  ma.zs.zyn.dao.specification.core.crm;

import ma.zs.zyn.dao.criteria.core.crm.ClientCriteria;
import ma.zs.zyn.bean.core.crm.Client;
import ma.zs.zyn.zynerator.specification.AbstractSpecification;


public class ClientSpecification extends UserSpecification  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("fullName", criteria.getFullName(),criteria.getFullNameLike());
        addPredicateBool("credentialsNonExpired", criteria.getCredentialsNonExpired());
        addPredicateBool("enabled", criteria.getEnabled());
        addPredicateBool("accountNonExpired", criteria.getAccountNonExpired());
        addPredicateBool("accountNonLocked", criteria.getAccountNonLocked());
        addPredicateBool("passwordChanged", criteria.getPasswordChanged());
        addPredicate("username", criteria.getUsername(),criteria.getUsernameLike());
        addPredicate("password", criteria.getPassword(),criteria.getPasswordLike());
        addPredicate("avatar", criteria.getAvatar(),criteria.getAvatarLike());
        addPredicate("fullName", criteria.getFullName(),criteria.getFullNameLike());
        addPredicate("about", criteria.getAbout(),criteria.getAboutLike());
    }

    public ClientSpecification(ClientCriteria criteria) {
        super(criteria);
    }

    public ClientSpecification(ClientCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}

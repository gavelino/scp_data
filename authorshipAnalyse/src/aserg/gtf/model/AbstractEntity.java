package aserg.gtf.model;


import java.io.Serializable;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
public abstract class AbstractEntity implements Serializable {
    @Transient
    private static final long serialVersionUID = -3038903536445432584L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    protected Long id;
//
//    public Long getId() {
//        id = null;
//        return id;
//    }
//
//    public void setId(final Long id) {
//        this.id = null;
//    }

}

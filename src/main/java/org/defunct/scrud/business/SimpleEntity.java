package org.defunct.scrud.business;

import java.util.Date;

/**
 *
 * @author qmp
 */
public class SimpleEntity implements java.io.Serializable{

    private Long id;
    private Date createdDate;

    public SimpleEntity(){;}
    
    public SimpleEntity(Long id, Date createdDate){
        this.id=id;
        this.createdDate=createdDate;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public Date getCreatedDate(){
        return createdDate;
    }

    public void setCreatedDate(Date createdDate){
        this.createdDate=createdDate;
    }

}

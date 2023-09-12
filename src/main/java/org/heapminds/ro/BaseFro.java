package org.heapminds.ro;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseFro {


    public BaseFro( String error){
        this.error = error;
    }
    private Boolean success=false;
    private String error;




}

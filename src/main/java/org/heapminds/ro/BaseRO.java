package org.heapminds.ro;

import lombok.Data;

import java.util.Optional;

@Data
public class BaseRO<T> {
    public BaseRO(T data){
        this.data = data;
    }
    private Boolean success;
    private T data;
    private Optional<String> error;
}

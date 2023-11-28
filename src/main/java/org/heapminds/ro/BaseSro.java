package org.heapminds.ro;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseSro<T> {
    public BaseSro(T data) {
        System.out.println(data);
        this.data = data;
    }

    private Boolean success = true;
    private T data;
}

package cn.myfreecloud.entities;

import java.io.Serializable;
import java.util.HashMap;

public abstract class AbstractEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public AbstractEntity() {
    }

    public abstract HashMap<String, Object> toHashMap();
}

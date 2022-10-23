package org.example.model;

import org.example.model.abstraction.IHaveHierarchicalStructure;

import java.util.ArrayList;
import java.util.List;

public class Geography implements IHaveHierarchicalStructure<Geography>{
    private int id;
    private String name;
    private String type;
    private String code;
    private Integer parentId = null;
    private Geography parent;

    private List<Geography> children = new ArrayList<>();


    @Override
    public void setParent(Geography obj) {
        this.parent=obj;
    }

    @Override
    public List<Geography> getChildren() {
        return children;
    }

    @Override
    public Geography getParent() {
        return parent;
    }

    public int getId() {
        return id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public void setType(String type) {
        this.type = type;
    }
}

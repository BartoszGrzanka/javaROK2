package org.example.model.abstraction;

import java.util.List;

public interface IHaveHierarchicalStructure<TItem> {
    void setParent(TItem obj);

    List<TItem> getChildren();

    TItem getParent();

    int getId();

    Integer getParentId();
}

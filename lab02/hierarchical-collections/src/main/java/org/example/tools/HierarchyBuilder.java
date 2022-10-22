package org.example.tools;

import org.example.model.abstraction.IHaveHierarchicalStructure;

import java.util.ArrayList;
import java.util.List;

public class HierarchyBuilder<TItem extends IHaveHierarchicalStructure> {

    private List<TItem> list = new ArrayList<>();
    TItem rootElement;
    public void setElements(List<TItem> geographies) {
        this.list = geographies;
    }

    public void buildHierarchy(){
        for (TItem element : list) {
            if (element.getParentId() != null) {
                for (TItem parent : list) {
                    if (parent.getId() == element.getParentId()) {
                        element.setParent(parent);
                        parent.getChildren().add(element);
                    }
                }
            }else{
                rootElement = element;
            }
        }
    }

    public TItem getRootElement(){
        for(TItem item : list){
        if(list.get(4)==null){
            return item;
        }}
        return null;
    }
}

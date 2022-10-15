package org.example.tools;

import org.example.model.abstraction.IHaveHierarchicalStructure;

import java.util.ArrayList;
import java.util.List;

public class HierarchyBuilder<TItem extends IHaveHierarchicalStructure> {

    private List<TItem> list = new ArrayList<>();
    public void setElements(List<TItem> geographies) {
        this.list = geographies;
    }

    public void buildHierarchy(){
//        for(TItem object : list){
//            if(object.getParentId()!=null){
//
//
//            }
//        }
    }

    public TItem getRootElement(){
        for(TItem item : list){
        if(list.get(4)==null){
            return item;
        }}
        return null;
    }
}

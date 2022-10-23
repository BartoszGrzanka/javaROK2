package org.example.tools;

import org.example.model.abstraction.IHaveHierarchicalStructure;

import java.util.ArrayList;
import java.util.List;

public class HierarchyBuilder<TItem extends IHaveHierarchicalStructure<TItem>> {

    private List<TItem> list = new ArrayList<>();
    private TItem rootElement;
    public void setElements(List<TItem> geographies) {
        list = geographies;
    }

    public void buildHierarchy(){
        for (TItem item : list) {
            Integer parentId = item.getParentId();

            if (parentId == null) {
                rootElement = item;
                continue;
            }

            for (TItem item2 : list) {
                if (item2.getId() == parentId) {
                    item2.getChildren().add(item);
                    item.setParent(item2);
                }
            }
        }
    }

    public TItem getRootElement() {
    return rootElement;
    }
}

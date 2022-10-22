package org.example.tools;

import org.example.model.abstraction.IHaveHierarchicalStructure;

public class Hierarchy<TItem extends IHaveHierarchicalStructure<TItem>> {
private TItem root;

    public void setRootElement(TItem item) {
            root = item;
            }

    public TItem findElementById(int id) {
        TItem found = findRecursively(id, root);
        return found;
    }

    private TItem findRecursively(int id, TItem parent) {
        for (TItem item : parent.getChildren()) {
            if (item.getId() == id){
                return item;
            }
            if (item.getChildren().size() < 1) {
                continue;
            }

            TItem found = findRecursively(id, item);

            if (found != null) {
                return found;
            }
        }
        return null;
    }
}
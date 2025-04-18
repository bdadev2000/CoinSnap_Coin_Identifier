package androidx.appcompat.view.menu;

import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes3.dex */
public interface MenuView {

    /* loaded from: classes3.dex */
    public interface ItemView {
        MenuItemImpl getItemData();

        void initialize(MenuItemImpl menuItemImpl, int i2);
    }

    void initialize(MenuBuilder menuBuilder);
}

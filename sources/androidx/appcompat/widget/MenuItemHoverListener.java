package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

@RestrictTo
/* loaded from: classes3.dex */
public interface MenuItemHoverListener {
    void c(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);

    void m(MenuBuilder menuBuilder, MenuItem menuItem);
}

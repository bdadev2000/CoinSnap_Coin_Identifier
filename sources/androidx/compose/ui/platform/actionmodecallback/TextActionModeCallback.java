package androidx.compose.ui.platform.actionmodecallback;

import android.R;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import q0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class TextActionModeCallback {

    /* renamed from: a, reason: collision with root package name */
    public final a f16711a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f16712b;

    /* renamed from: c, reason: collision with root package name */
    public a f16713c;
    public a d;
    public a e;

    /* renamed from: f, reason: collision with root package name */
    public a f16714f;

    public TextActionModeCallback(a aVar) {
        Rect rect = Rect.e;
        this.f16711a = aVar;
        this.f16712b = rect;
        this.f16713c = null;
        this.d = null;
        this.e = null;
        this.f16714f = null;
    }

    public static void a(Menu menu, MenuItemOption menuItemOption) {
        int i2;
        int ordinal = menuItemOption.ordinal();
        if (ordinal == 0) {
            i2 = R.string.copy;
        } else if (ordinal == 1) {
            i2 = R.string.paste;
        } else if (ordinal == 2) {
            i2 = R.string.cut;
        } else {
            if (ordinal != 3) {
                throw new RuntimeException();
            }
            i2 = R.string.selectAll;
        }
        menu.add(0, menuItemOption.f16709a, menuItemOption.f16710b, i2).setShowAsAction(1);
    }

    public static void b(Menu menu, MenuItemOption menuItemOption, a aVar) {
        int i2 = menuItemOption.f16709a;
        if (aVar != null && menu.findItem(i2) == null) {
            a(menu, menuItemOption);
        } else {
            if (aVar != null || menu.findItem(i2) == null) {
                return;
            }
            menu.removeItem(i2);
        }
    }

    public final boolean c(ActionMode actionMode, MenuItem menuItem) {
        p0.a.p(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            a aVar = this.f16713c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == 1) {
            a aVar2 = this.d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == 2) {
            a aVar3 = this.e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else {
            if (itemId != 3) {
                return false;
            }
            a aVar4 = this.f16714f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    public final void d(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu".toString());
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode".toString());
        }
        if (this.f16713c != null) {
            a(menu, MenuItemOption.Copy);
        }
        if (this.d != null) {
            a(menu, MenuItemOption.Paste);
        }
        if (this.e != null) {
            a(menu, MenuItemOption.Cut);
        }
        if (this.f16714f != null) {
            a(menu, MenuItemOption.SelectAll);
        }
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        b(menu, MenuItemOption.Copy, this.f16713c);
        b(menu, MenuItemOption.Paste, this.d);
        b(menu, MenuItemOption.Cut, this.e);
        b(menu, MenuItemOption.SelectAll, this.f16714f);
        return true;
    }
}

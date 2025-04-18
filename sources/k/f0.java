package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
public class f0 extends d implements Menu {

    /* renamed from: d, reason: collision with root package name */
    public final i0.a f20060d;

    public f0(Context context, i0.a aVar) {
        super(context);
        if (aVar != null) {
            this.f20060d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return o(((o) this.f20060d).a(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = ((o) this.f20060d).addIntentOptions(i10, i11, i12, componentName, intentArr, intent, i13, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i14 = 0; i14 < length; i14++) {
                menuItemArr[i14] = o(menuItemArr2[i14]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return ((o) this.f20060d).addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        r.k kVar = (r.k) this.f20054b;
        if (kVar != null) {
            kVar.clear();
        }
        r.k kVar2 = (r.k) this.f20055c;
        if (kVar2 != null) {
            kVar2.clear();
        }
        ((o) this.f20060d).clear();
    }

    @Override // android.view.Menu
    public final void close() {
        ((o) this.f20060d).c(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        return o(((o) this.f20060d).findItem(i10));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return o(((o) this.f20060d).getItem(i10));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return ((o) this.f20060d).hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return ((o) this.f20060d).isShortcutKey(i10, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return ((o) this.f20060d).performIdentifierAction(i10, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        return ((o) this.f20060d).performShortcut(i10, keyEvent, i11);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        if (((r.k) this.f20054b) != null) {
            int i11 = 0;
            while (true) {
                r.k kVar = (r.k) this.f20054b;
                if (i11 >= kVar.f23955d) {
                    break;
                }
                if (((i0.b) kVar.h(i11)).getGroupId() == i10) {
                    ((r.k) this.f20054b).j(i11);
                    i11--;
                }
                i11++;
            }
        }
        ((o) this.f20060d).removeGroup(i10);
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        if (((r.k) this.f20054b) != null) {
            int i11 = 0;
            while (true) {
                r.k kVar = (r.k) this.f20054b;
                if (i11 >= kVar.f23955d) {
                    break;
                }
                if (((i0.b) kVar.h(i11)).getItemId() == i10) {
                    ((r.k) this.f20054b).j(i11);
                    break;
                }
                i11++;
            }
        }
        ((o) this.f20060d).removeItem(i10);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ((o) this.f20060d).setGroupCheckable(i10, z10, z11);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ((o) this.f20060d).setGroupEnabled(i10, z10);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        ((o) this.f20060d).setGroupVisible(i10, z10);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z10) {
        this.f20060d.setQwertyMode(z10);
    }

    @Override // android.view.Menu
    public final int size() {
        return ((o) this.f20060d).size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return ((o) this.f20060d).addSubMenu(i10);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return o(((o) this.f20060d).add(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        return ((o) this.f20060d).addSubMenu(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return o(((o) this.f20060d).a(i10, i11, i12, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return ((o) this.f20060d).addSubMenu(i10, i11, i12, i13);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return o(((o) this.f20060d).add(i10, i11, i12, i13));
    }
}

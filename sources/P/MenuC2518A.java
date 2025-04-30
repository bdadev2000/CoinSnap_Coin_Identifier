package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: p.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC2518A extends U1.b implements Menu {

    /* renamed from: d, reason: collision with root package name */
    public final MenuC2533l f22029d;

    public MenuC2518A(Context context, MenuC2533l menuC2533l) {
        super(context);
        if (menuC2533l != null) {
            this.f22029d = menuC2533l;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return f(this.f22029d.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i9, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f22029d.addIntentOptions(i9, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = f(menuItemArr2[i13]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.f22029d.addSubMenu(charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        x.l lVar = (x.l) this.f3114c;
        if (lVar != null) {
            lVar.clear();
        }
        this.f22029d.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f22029d.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i9) {
        return f(this.f22029d.findItem(i9));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i9) {
        return f(this.f22029d.getItem(i9));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f22029d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i9, KeyEvent keyEvent) {
        return this.f22029d.isShortcutKey(i9, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i9, int i10) {
        return this.f22029d.performIdentifierAction(i9, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i9, KeyEvent keyEvent, int i10) {
        return this.f22029d.performShortcut(i9, keyEvent, i10);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i9) {
        if (((x.l) this.f3114c) != null) {
            int i10 = 0;
            while (true) {
                x.l lVar = (x.l) this.f3114c;
                if (i10 >= lVar.f24086d) {
                    break;
                }
                if (((N.a) lVar.h(i10)).getGroupId() == i9) {
                    ((x.l) this.f3114c).k(i10);
                    i10--;
                }
                i10++;
            }
        }
        this.f22029d.removeGroup(i9);
    }

    @Override // android.view.Menu
    public final void removeItem(int i9) {
        if (((x.l) this.f3114c) != null) {
            int i10 = 0;
            while (true) {
                x.l lVar = (x.l) this.f3114c;
                if (i10 >= lVar.f24086d) {
                    break;
                }
                if (((N.a) lVar.h(i10)).getItemId() == i9) {
                    ((x.l) this.f3114c).k(i10);
                    break;
                }
                i10++;
            }
        }
        this.f22029d.removeItem(i9);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i9, boolean z8, boolean z9) {
        this.f22029d.setGroupCheckable(i9, z8, z9);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i9, boolean z8) {
        this.f22029d.setGroupEnabled(i9, z8);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i9, boolean z8) {
        this.f22029d.setGroupVisible(i9, z8);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z8) {
        this.f22029d.setQwertyMode(z8);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f22029d.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9) {
        return f(this.f22029d.add(i9));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i9) {
        return this.f22029d.addSubMenu(i9);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9, int i10, int i11, CharSequence charSequence) {
        return f(this.f22029d.add(i9, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i9, int i10, int i11, CharSequence charSequence) {
        return this.f22029d.addSubMenu(i9, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9, int i10, int i11, int i12) {
        return f(this.f22029d.add(i9, i10, i11, i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i9, int i10, int i11, int i12) {
        return this.f22029d.addSubMenu(i9, i10, i11, i12);
    }
}

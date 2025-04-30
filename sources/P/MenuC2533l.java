package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.ViewConfigurationCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: p.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC2533l implements Menu {

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f22101A = {1, 4, 5, 3, 2, 0};
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f22102c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22103d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22104f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC2531j f22105g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f22106h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f22107i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f22108j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f22109k;
    public final ArrayList l;
    public boolean m;

    /* renamed from: o, reason: collision with root package name */
    public CharSequence f22111o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f22112p;

    /* renamed from: q, reason: collision with root package name */
    public View f22113q;

    /* renamed from: x, reason: collision with root package name */
    public C2535n f22120x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f22122z;

    /* renamed from: n, reason: collision with root package name */
    public int f22110n = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f22114r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f22115s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f22116t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f22117u = false;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f22118v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final CopyOnWriteArrayList f22119w = new CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    public boolean f22121y = false;

    public MenuC2533l(Context context) {
        boolean z8 = false;
        this.b = context;
        Resources resources = context.getResources();
        this.f22102c = resources;
        this.f22106h = new ArrayList();
        this.f22107i = new ArrayList();
        this.f22108j = true;
        this.f22109k = new ArrayList();
        this.l = new ArrayList();
        this.m = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfigurationCompat.shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration.get(context), context)) {
            z8 = true;
        }
        this.f22104f = z8;
    }

    public final C2535n a(int i9, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 >= 0 && i13 < 6) {
            int i14 = (f22101A[i13] << 16) | (65535 & i11);
            C2535n c2535n = new C2535n(this, i9, i10, i11, i14, charSequence, this.f22110n);
            ArrayList arrayList = this.f22106h;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((C2535n) arrayList.get(size)).f22132f <= i14) {
                        i12 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    i12 = 0;
                    break;
                }
            }
            arrayList.add(i12, c2535n);
            p(true);
            return c2535n;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i9, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        Intent intent2;
        int i14;
        PackageManager packageManager = this.b.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i13 = queryIntentActivityOptions.size();
        } else {
            i13 = 0;
        }
        if ((i12 & 1) == 0) {
            removeGroup(i9);
        }
        for (int i15 = 0; i15 < i13; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            if (i16 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i16];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C2535n a6 = a(i9, i10, i11, resolveInfo.loadLabel(packageManager));
            a6.setIcon(resolveInfo.loadIcon(packageManager));
            a6.f22135i = intent3;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = a6;
            }
        }
        return i13;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(x xVar, Context context) {
        this.f22119w.add(new WeakReference(xVar));
        xVar.c(context, this);
        this.m = true;
    }

    public final void c(boolean z8) {
        if (this.f22117u) {
            return;
        }
        this.f22117u = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f22119w;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.b(this, z8);
            }
        }
        this.f22117u = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C2535n c2535n = this.f22120x;
        if (c2535n != null) {
            d(c2535n);
        }
        this.f22106h.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f22112p = null;
        this.f22111o = null;
        this.f22113q = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(C2535n c2535n) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f22119w;
        boolean z8 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f22120x == c2535n) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z8 = xVar.j(c2535n);
                    if (z8) {
                        break;
                    }
                }
            }
            v();
            if (z8) {
                this.f22120x = null;
            }
        }
        return z8;
    }

    public boolean e(MenuC2533l menuC2533l, MenuItem menuItem) {
        InterfaceC2531j interfaceC2531j = this.f22105g;
        if (interfaceC2531j != null && interfaceC2531j.b(menuC2533l, menuItem)) {
            return true;
        }
        return false;
    }

    public boolean f(C2535n c2535n) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f22119w;
        boolean z8 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z8 = xVar.i(c2535n);
                if (z8) {
                    break;
                }
            }
        }
        v();
        if (z8) {
            this.f22120x = c2535n;
        }
        return z8;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i9) {
        MenuItem findItem;
        ArrayList arrayList = this.f22106h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2535n c2535n = (C2535n) arrayList.get(i10);
            if (c2535n.b == i9) {
                return c2535n;
            }
            if (c2535n.hasSubMenu() && (findItem = c2535n.f22141q.findItem(i9)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final C2535n g(int i9, KeyEvent keyEvent) {
        char c9;
        ArrayList arrayList = this.f22118v;
        arrayList.clear();
        h(arrayList, i9, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C2535n) arrayList.get(0);
        }
        boolean n2 = n();
        for (int i10 = 0; i10 < size; i10++) {
            C2535n c2535n = (C2535n) arrayList.get(i10);
            if (n2) {
                c9 = c2535n.l;
            } else {
                c9 = c2535n.f22136j;
            }
            char[] cArr = keyData.meta;
            if ((c9 == cArr[0] && (metaState & 2) == 0) || ((c9 == cArr[2] && (metaState & 2) != 0) || (n2 && c9 == '\b' && i9 == 67))) {
                return c2535n;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i9) {
        return (MenuItem) this.f22106h.get(i9);
    }

    public final void h(List list, int i9, KeyEvent keyEvent) {
        char c9;
        int i10;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i9 != 67) {
            return;
        }
        ArrayList arrayList = this.f22106h;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C2535n c2535n = (C2535n) arrayList.get(i11);
            if (c2535n.hasSubMenu()) {
                c2535n.f22141q.h(list, i9, keyEvent);
            }
            if (n2) {
                c9 = c2535n.l;
            } else {
                c9 = c2535n.f22136j;
            }
            if (n2) {
                i10 = c2535n.m;
            } else {
                i10 = c2535n.f22137k;
            }
            if ((modifiers & 69647) == (i10 & 69647) && c9 != 0) {
                char[] cArr = keyData.meta;
                if (c9 != cArr[0] && c9 != cArr[2]) {
                    if (n2 && c9 == '\b') {
                        if (i9 != 67) {
                        }
                    }
                }
                if (c2535n.isEnabled()) {
                    list.add(c2535n);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f22122z) {
            return true;
        }
        ArrayList arrayList = this.f22106h;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((C2535n) arrayList.get(i9)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l = l();
        if (!this.m) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f22119w;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z8 |= xVar.d();
            }
        }
        ArrayList arrayList = this.f22109k;
        ArrayList arrayList2 = this.l;
        if (z8) {
            arrayList.clear();
            arrayList2.clear();
            int size = l.size();
            for (int i9 = 0; i9 < size; i9++) {
                C2535n c2535n = (C2535n) l.get(i9);
                if (c2535n.f()) {
                    arrayList.add(c2535n);
                } else {
                    arrayList2.add(c2535n);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(l());
        }
        this.m = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i9, KeyEvent keyEvent) {
        if (g(i9, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z8 = this.f22108j;
        ArrayList arrayList = this.f22107i;
        if (!z8) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f22106h;
        int size = arrayList2.size();
        for (int i9 = 0; i9 < size; i9++) {
            C2535n c2535n = (C2535n) arrayList2.get(i9);
            if (c2535n.isVisible()) {
                arrayList.add(c2535n);
            }
        }
        this.f22108j = false;
        this.m = true;
        return arrayList;
    }

    public boolean m() {
        return this.f22121y;
    }

    public boolean n() {
        return this.f22103d;
    }

    public boolean o() {
        return this.f22104f;
    }

    public final void p(boolean z8) {
        if (!this.f22114r) {
            if (z8) {
                this.f22108j = true;
                this.m = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f22119w;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    x xVar = (x) weakReference.get();
                    if (xVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        xVar.f();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f22115s = true;
        if (z8) {
            this.f22116t = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i9, int i10) {
        return q(findItem(i9), null, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i9, KeyEvent keyEvent, int i10) {
        boolean z8;
        C2535n g9 = g(i9, keyEvent);
        if (g9 != null) {
            z8 = q(g9, null, i10);
        } else {
            z8 = false;
        }
        if ((i10 & 2) != 0) {
            c(true);
        }
        return z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, p.x r8, int r9) {
        /*
            r6 = this;
            p.n r7 = (p.C2535n) r7
            r0 = 0
            if (r7 == 0) goto Ld7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld7
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f22142r
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = r2
            goto L43
        L1a:
            p.l r1 = r7.f22140p
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.f22135i
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.b     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            p.o r1 = r7.f22127C
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f22152c
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L18
        L42:
            r1 = r0
        L43:
            p.o r3 = r7.f22127C
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f22152c
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r2
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld6
            r6.c(r2)
            goto Ld6
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            p.D r9 = new p.D
            android.content.Context r5 = r6.b
            r9.<init>(r5, r6, r7)
            r7.f22141q = r9
            java.lang.CharSequence r5 = r7.f22133g
            r9.setHeaderTitle(r5)
        L90:
            p.D r7 = r7.f22141q
            if (r4 == 0) goto L9e
            p.s r9 = r3.f22153d
            r9.getClass()
            android.view.ActionProvider r9 = r3.f22152c
            r9.onPrepareSubMenu(r7)
        L9e:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.f22119w
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La7
            goto Ld0
        La7:
            if (r8 == 0) goto Lad
            boolean r0 = r8.h(r7)
        Lad:
            java.util.Iterator r8 = r9.iterator()
        Lb1:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            p.x r4 = (p.x) r4
            if (r4 != 0) goto Lc9
            r9.remove(r3)
            goto Lb1
        Lc9:
            if (r0 != 0) goto Lb1
            boolean r0 = r4.h(r7)
            goto Lb1
        Ld0:
            r1 = r1 | r0
            if (r1 != 0) goto Ld6
            r6.c(r2)
        Ld6:
            return r1
        Ld7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.MenuC2533l.q(android.view.MenuItem, p.x, int):boolean");
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f22119w;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i9) {
        ArrayList arrayList = this.f22106h;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                if (((C2535n) arrayList.get(i11)).f22130c == i9) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || ((C2535n) arrayList.get(i11)).f22130c != i9) {
                    break;
                }
                if (i11 >= 0) {
                    ArrayList arrayList2 = this.f22106h;
                    if (i11 < arrayList2.size()) {
                        arrayList2.remove(i11);
                    }
                }
                i10 = i12;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i9) {
        ArrayList arrayList = this.f22106h;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                if (((C2535n) arrayList.get(i10)).b == i9) {
                    break;
                } else {
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            ArrayList arrayList2 = this.f22106h;
            if (i10 < arrayList2.size()) {
                arrayList2.remove(i10);
                p(true);
            }
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f22106h.size();
        for (int i9 = 0; i9 < size; i9++) {
            MenuItem item = getItem(i9);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC2521D) item.getSubMenu()).s(bundle);
            }
        }
        int i10 = bundle.getInt("android:menu:expandedactionview");
        if (i10 > 0 && (findItem = findItem(i10)) != null) {
            findItem.expandActionView();
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i9, boolean z8, boolean z9) {
        int i10;
        ArrayList arrayList = this.f22106h;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C2535n c2535n = (C2535n) arrayList.get(i11);
            if (c2535n.f22130c == i9) {
                int i12 = c2535n.f22150z & (-5);
                if (z9) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                c2535n.f22150z = i12 | i10;
                c2535n.setCheckable(z8);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z8) {
        this.f22121y = z8;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i9, boolean z8) {
        ArrayList arrayList = this.f22106h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2535n c2535n = (C2535n) arrayList.get(i10);
            if (c2535n.f22130c == i9) {
                c2535n.setEnabled(z8);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i9, boolean z8) {
        int i10;
        ArrayList arrayList = this.f22106h;
        int size = arrayList.size();
        boolean z9 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C2535n c2535n = (C2535n) arrayList.get(i11);
            if (c2535n.f22130c == i9) {
                int i12 = c2535n.f22150z;
                int i13 = i12 & (-9);
                if (z8) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                int i14 = i13 | i10;
                c2535n.f22150z = i14;
                if (i12 != i14) {
                    z9 = true;
                }
            }
        }
        if (z9) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z8) {
        this.f22103d = z8;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f22106h.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f22106h.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i9 = 0; i9 < size; i9++) {
            MenuItem item = getItem(i9);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC2521D) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i9, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.f22113q = view;
            this.f22111o = null;
            this.f22112p = null;
        } else {
            if (i9 > 0) {
                this.f22111o = this.f22102c.getText(i9);
            } else if (charSequence != null) {
                this.f22111o = charSequence;
            }
            if (i10 > 0) {
                this.f22112p = I.h.getDrawable(this.b, i10);
            } else if (drawable != null) {
                this.f22112p = drawable;
            }
            this.f22113q = null;
        }
        p(false);
    }

    public final void v() {
        this.f22114r = false;
        if (this.f22115s) {
            this.f22115s = false;
            p(this.f22116t);
        }
    }

    public final void w() {
        if (!this.f22114r) {
            this.f22114r = true;
            this.f22115s = false;
            this.f22116t = false;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9) {
        return a(0, 0, 0, this.f22102c.getString(i9));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i9) {
        return addSubMenu(0, 0, 0, this.f22102c.getString(i9));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9, int i10, int i11, CharSequence charSequence) {
        return a(i9, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i9, int i10, int i11, CharSequence charSequence) {
        C2535n a6 = a(i9, i10, i11, charSequence);
        SubMenuC2521D subMenuC2521D = new SubMenuC2521D(this.b, this, a6);
        a6.f22141q = subMenuC2521D;
        subMenuC2521D.setHeaderTitle(a6.f22133g);
        return subMenuC2521D;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i9, int i10, int i11, int i12) {
        return a(i9, i10, i11, this.f22102c.getString(i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i9, int i10, int i11, int i12) {
        return addSubMenu(i9, i10, i11, this.f22102c.getString(i12));
    }

    public MenuC2533l k() {
        return this;
    }
}

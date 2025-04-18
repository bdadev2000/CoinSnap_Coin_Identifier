package k;

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

/* loaded from: classes.dex */
public class o implements i0.a {

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f20124y = {1, 4, 5, 3, 2, 0};
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f20125b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20126c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20127d;

    /* renamed from: e, reason: collision with root package name */
    public m f20128e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f20129f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f20130g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20131h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f20132i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f20133j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20134k;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f20136m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f20137n;

    /* renamed from: o, reason: collision with root package name */
    public View f20138o;

    /* renamed from: v, reason: collision with root package name */
    public q f20144v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f20146x;

    /* renamed from: l, reason: collision with root package name */
    public int f20135l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f20139p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f20140q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f20141r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f20142s = false;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f20143t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f20145w = false;

    public o(Context context) {
        boolean z10 = false;
        this.a = context;
        Resources resources = context.getResources();
        this.f20125b = resources;
        this.f20129f = new ArrayList();
        this.f20130g = new ArrayList();
        this.f20131h = true;
        this.f20132i = new ArrayList();
        this.f20133j = new ArrayList();
        this.f20134k = true;
        if (resources.getConfiguration().keyboard != 1 && ViewConfigurationCompat.shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration.get(context), context)) {
            z10 = true;
        }
        this.f20127d = z10;
    }

    public final q a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 >= 0 && i14 < 6) {
            int i15 = (f20124y[i14] << 16) | (65535 & i12);
            q qVar = new q(this, i10, i11, i12, i15, charSequence, this.f20135l);
            ArrayList arrayList = this.f20129f;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (((q) arrayList.get(size)).f20152d <= i15) {
                        i13 = size + 1;
                        break;
                    }
                } else {
                    i13 = 0;
                    break;
                }
            }
            arrayList.add(i13, qVar);
            p(true);
            return qVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        Intent intent2;
        int i15;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i14 = queryIntentActivityOptions.size();
        } else {
            i14 = 0;
        }
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i16 = 0; i16 < i14; i16++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i16);
            int i17 = resolveInfo.specificIndex;
            if (i17 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i17];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            q a = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            a.setIcon(resolveInfo.loadIcon(packageManager));
            a.f20155g = intent3;
            if (menuItemArr != null && (i15 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i15] = a;
            }
        }
        return i14;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(c0 c0Var, Context context) {
        this.u.add(new WeakReference(c0Var));
        c0Var.i(context, this);
        this.f20134k = true;
    }

    public final void c(boolean z10) {
        if (this.f20142s) {
            return;
        }
        this.f20142s = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            c0 c0Var = (c0) weakReference.get();
            if (c0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                c0Var.b(this, z10);
            }
        }
        this.f20142s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        q qVar = this.f20144v;
        if (qVar != null) {
            d(qVar);
        }
        this.f20129f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f20137n = null;
        this.f20136m = null;
        this.f20138o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z10 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f20144v == qVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                c0 c0Var = (c0) weakReference.get();
                if (c0Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z10 = c0Var.c(qVar);
                    if (z10) {
                        break;
                    }
                }
            }
            v();
            if (z10) {
                this.f20144v = null;
            }
        }
        return z10;
    }

    public boolean e(o oVar, MenuItem menuItem) {
        m mVar = this.f20128e;
        return mVar != null && mVar.e(oVar, menuItem);
    }

    public boolean f(q qVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        boolean z10 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            c0 c0Var = (c0) weakReference.get();
            if (c0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z10 = c0Var.e(qVar);
                if (z10) {
                    break;
                }
            }
        }
        v();
        if (z10) {
            this.f20144v = qVar;
        }
        return z10;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) this.f20129f.get(i11);
            if (qVar.a == i10) {
                return qVar;
            }
            if (qVar.hasSubMenu() && (findItem = qVar.f20163o.findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final q g(int i10, KeyEvent keyEvent) {
        char c10;
        ArrayList arrayList = this.f20143t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (q) arrayList.get(0);
        }
        boolean n10 = n();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (n10) {
                c10 = qVar.f20158j;
            } else {
                c10 = qVar.f20156h;
            }
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n10 && c10 == '\b' && i10 == 67))) {
                return qVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return (MenuItem) this.f20129f.get(i10);
    }

    public final void h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        char c10;
        int i11;
        boolean z10;
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i10 != 67) {
            return;
        }
        ArrayList arrayList2 = this.f20129f;
        int size = arrayList2.size();
        for (int i12 = 0; i12 < size; i12++) {
            q qVar = (q) arrayList2.get(i12);
            if (qVar.hasSubMenu()) {
                qVar.f20163o.h(arrayList, i10, keyEvent);
            }
            if (n10) {
                c10 = qVar.f20158j;
            } else {
                c10 = qVar.f20156h;
            }
            if (n10) {
                i11 = qVar.f20159k;
            } else {
                i11 = qVar.f20157i;
            }
            if ((modifiers & 69647) == (i11 & 69647)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && c10 != 0) {
                char[] cArr = keyData.meta;
                if (c10 != cArr[0] && c10 != cArr[2]) {
                    if (n10 && c10 == '\b') {
                        if (i10 != 67) {
                        }
                    }
                }
                if (qVar.isEnabled()) {
                    arrayList.add(qVar);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f20146x) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((q) this.f20129f.get(i10)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l10 = l();
        if (!this.f20134k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            c0 c0Var = (c0) weakReference.get();
            if (c0Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z10 |= c0Var.h();
            }
        }
        ArrayList arrayList = this.f20132i;
        ArrayList arrayList2 = this.f20133j;
        if (z10) {
            arrayList.clear();
            arrayList2.clear();
            int size = l10.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) l10.get(i10);
                if (qVar.f()) {
                    arrayList.add(qVar);
                } else {
                    arrayList2.add(qVar);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(l());
        }
        this.f20134k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public o k() {
        return this;
    }

    public final ArrayList l() {
        boolean z10 = this.f20131h;
        ArrayList arrayList = this.f20130g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f20129f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = (q) arrayList2.get(i10);
            if (qVar.isVisible()) {
                arrayList.add(qVar);
            }
        }
        this.f20131h = false;
        this.f20134k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f20145w;
    }

    public boolean n() {
        return this.f20126c;
    }

    public boolean o() {
        return this.f20127d;
    }

    public final void p(boolean z10) {
        if (!this.f20139p) {
            if (z10) {
                this.f20131h = true;
                this.f20134k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                w();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    c0 c0Var = (c0) weakReference.get();
                    if (c0Var == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        c0Var.d();
                    }
                }
                v();
                return;
            }
            return;
        }
        this.f20140q = true;
        if (z10) {
            this.f20141r = true;
        }
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        boolean z10;
        q g10 = g(i10, keyEvent);
        if (g10 != null) {
            z10 = q(g10, null, i11);
        } else {
            z10 = false;
        }
        if ((i11 & 2) != 0) {
            c(true);
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.MenuItem r7, k.c0 r8, int r9) {
        /*
            r6 = this;
            k.q r7 = (k.q) r7
            r0 = 0
            if (r7 == 0) goto Ld7
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld7
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f20164p
            r2 = 1
            if (r1 == 0) goto L19
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L19
            goto L40
        L19:
            k.o r1 = r7.f20162n
            boolean r3 = r1.e(r1, r7)
            if (r3 == 0) goto L22
            goto L40
        L22:
            android.content.Intent r3 = r7.f20155g
            if (r3 == 0) goto L34
            android.content.Context r1 = r1.a     // Catch: android.content.ActivityNotFoundException -> L2c
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2c
            goto L40
        L2c:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L34:
            k.r r1 = r7.A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.f20174b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
        L40:
            r1 = r2
            goto L43
        L42:
            r1 = r0
        L43:
            k.r r3 = r7.A
            if (r3 == 0) goto L51
            android.view.ActionProvider r4 = r3.f20174b
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
            k.i0 r9 = new k.i0
            android.content.Context r5 = r6.a
            r9.<init>(r5, r6, r7)
            r7.f20163o = r9
            java.lang.CharSequence r5 = r7.f20153e
            r9.setHeaderTitle(r5)
        L90:
            k.i0 r7 = r7.f20163o
            if (r4 == 0) goto L9e
            k.w r9 = r3.f20175c
            r9.getClass()
            android.view.ActionProvider r9 = r3.f20174b
            r9.onPrepareSubMenu(r7)
        L9e:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.u
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto La7
            goto Ld0
        La7:
            if (r8 == 0) goto Lad
            boolean r0 = r8.f(r7)
        Lad:
            java.util.Iterator r8 = r9.iterator()
        Lb1:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Ld0
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            k.c0 r4 = (k.c0) r4
            if (r4 != 0) goto Lc9
            r9.remove(r3)
            goto Lb1
        Lc9:
            if (r0 != 0) goto Lb1
            boolean r0 = r4.f(r7)
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
        throw new UnsupportedOperationException("Method not decompiled: k.o.q(android.view.MenuItem, k.c0, int):boolean");
    }

    public final void r(c0 c0Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.u;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            c0 c0Var2 = (c0) weakReference.get();
            if (c0Var2 == null || c0Var2 == c0Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList arrayList;
        int size = size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            arrayList = this.f20129f;
            if (i12 < size) {
                if (((q) arrayList.get(i12)).f20150b == i10) {
                    break;
                } else {
                    i12++;
                }
            } else {
                i12 = -1;
                break;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || ((q) arrayList.get(i12)).f20150b != i10) {
                    break;
                }
                if (i12 >= 0 && i12 < arrayList.size()) {
                    arrayList.remove(i12);
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList arrayList;
        int size = size();
        int i11 = 0;
        while (true) {
            arrayList = this.f20129f;
            if (i11 < size) {
                if (((q) arrayList.get(i11)).a == i10) {
                    break;
                } else {
                    i11++;
                }
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0 && i11 < arrayList.size()) {
            arrayList.remove(i11);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((i0) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 > 0 && (findItem = findItem(i11)) != null) {
            findItem.expandActionView();
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int i11;
        ArrayList arrayList = this.f20129f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            q qVar = (q) arrayList.get(i12);
            if (qVar.f20150b == i10) {
                int i13 = qVar.f20171x & (-5);
                if (z11) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                qVar.f20171x = i13 | i11;
                qVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f20145w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList arrayList = this.f20129f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            q qVar = (q) arrayList.get(i11);
            if (qVar.f20150b == i10) {
                qVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        int i11;
        boolean z11;
        ArrayList arrayList = this.f20129f;
        int size = arrayList.size();
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            q qVar = (q) arrayList.get(i12);
            if (qVar.f20150b == i10) {
                int i13 = qVar.f20171x;
                int i14 = i13 & (-9);
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                int i15 = i14 | i11;
                qVar.f20171x = i15;
                if (i13 != i15) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    z12 = true;
                }
            }
        }
        if (z12) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f20126c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f20129f.size();
    }

    public final void t(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
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
                ((i0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f20138o = view;
            this.f20136m = null;
            this.f20137n = null;
        } else {
            if (i10 > 0) {
                this.f20136m = this.f20125b.getText(i10);
            } else if (charSequence != null) {
                this.f20136m = charSequence;
            }
            if (i11 > 0) {
                this.f20137n = d0.h.getDrawable(this.a, i11);
            } else if (drawable != null) {
                this.f20137n = drawable;
            }
            this.f20138o = null;
        }
        p(false);
    }

    public final void v() {
        this.f20139p = false;
        if (this.f20140q) {
            this.f20140q = false;
            p(this.f20141r);
        }
    }

    public final void w() {
        if (!this.f20139p) {
            this.f20139p = true;
            this.f20140q = false;
            this.f20141r = false;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f20125b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f20125b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        q a = a(i10, i11, i12, charSequence);
        i0 i0Var = new i0(this.a, this, a);
        a.f20163o = i0Var;
        i0Var.setHeaderTitle(a.f20153e);
        return i0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f20125b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f20125b.getString(i13));
    }
}

package j;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.q;
import k.r;
import k.w;

/* loaded from: classes.dex */
public final class j {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ k E;
    public final Menu a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19677h;

    /* renamed from: i, reason: collision with root package name */
    public int f19678i;

    /* renamed from: j, reason: collision with root package name */
    public int f19679j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f19680k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f19681l;

    /* renamed from: m, reason: collision with root package name */
    public int f19682m;

    /* renamed from: n, reason: collision with root package name */
    public char f19683n;

    /* renamed from: o, reason: collision with root package name */
    public int f19684o;

    /* renamed from: p, reason: collision with root package name */
    public char f19685p;

    /* renamed from: q, reason: collision with root package name */
    public int f19686q;

    /* renamed from: r, reason: collision with root package name */
    public int f19687r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f19688s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f19689t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public int f19690v;

    /* renamed from: w, reason: collision with root package name */
    public int f19691w;

    /* renamed from: x, reason: collision with root package name */
    public String f19692x;

    /* renamed from: y, reason: collision with root package name */
    public String f19693y;

    /* renamed from: z, reason: collision with root package name */
    public r f19694z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;

    /* renamed from: b, reason: collision with root package name */
    public int f19671b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f19672c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f19673d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f19674e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19675f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19676g = true;

    public j(k kVar, Menu menu) {
        this.E = kVar;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.f19698c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e2) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        boolean z10;
        MenuItem enabled = menuItem.setChecked(this.f19688s).setVisible(this.f19689t).setEnabled(this.u);
        boolean z11 = false;
        if (this.f19687r >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        enabled.setCheckable(z10).setTitleCondensed(this.f19681l).setIcon(this.f19682m);
        int i10 = this.f19690v;
        if (i10 >= 0) {
            menuItem.setShowAsAction(i10);
        }
        String str = this.f19693y;
        k kVar = this.E;
        if (str != null) {
            if (!kVar.f19698c.isRestricted()) {
                if (kVar.f19699d == null) {
                    kVar.f19699d = k.a(kVar.f19698c);
                }
                menuItem.setOnMenuItemClickListener(new i(kVar.f19699d, this.f19693y));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f19687r >= 2) {
            if (menuItem instanceof q) {
                q qVar = (q) menuItem;
                qVar.f20171x = (qVar.f20171x & (-5)) | 4;
            } else if (menuItem instanceof w) {
                w wVar = (w) menuItem;
                try {
                    Method method = wVar.f20181e;
                    i0.b bVar = wVar.f20180d;
                    if (method == null) {
                        wVar.f20181e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    wVar.f20181e.invoke(bVar, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.f19692x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, k.f19695e, kVar.a));
            z11 = true;
        }
        int i11 = this.f19691w;
        if (i11 > 0) {
            if (!z11) {
                menuItem.setActionView(i11);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        r rVar = this.f19694z;
        if (rVar != null) {
            if (menuItem instanceof i0.b) {
                ((i0.b) menuItem).a(rVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z12 = menuItem instanceof i0.b;
        if (z12) {
            ((i0.b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            n0.r.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z12) {
            ((i0.b) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            n0.r.m(menuItem, charSequence2);
        }
        char c10 = this.f19683n;
        int i12 = this.f19684o;
        if (z12) {
            ((i0.b) menuItem).setAlphabeticShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            n0.r.g(menuItem, c10, i12);
        }
        char c11 = this.f19685p;
        int i13 = this.f19686q;
        if (z12) {
            ((i0.b) menuItem).setNumericShortcut(c11, i13);
        } else if (Build.VERSION.SDK_INT >= 26) {
            n0.r.k(menuItem, c11, i13);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z12) {
                ((i0.b) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                n0.r.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z12) {
                ((i0.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                n0.r.i(menuItem, colorStateList);
            }
        }
    }
}

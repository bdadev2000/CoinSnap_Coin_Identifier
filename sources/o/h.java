package o;

import T.AbstractC0285p;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.mbridge.msdk.foundation.entity.o;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p.ActionProviderVisibilityListenerC2536o;
import p.C2535n;
import p.s;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: A, reason: collision with root package name */
    public CharSequence f21886A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f21887B;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ i f21890E;

    /* renamed from: a, reason: collision with root package name */
    public final Menu f21891a;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21897h;

    /* renamed from: i, reason: collision with root package name */
    public int f21898i;

    /* renamed from: j, reason: collision with root package name */
    public int f21899j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f21900k;
    public CharSequence l;
    public int m;

    /* renamed from: n, reason: collision with root package name */
    public char f21901n;

    /* renamed from: o, reason: collision with root package name */
    public int f21902o;

    /* renamed from: p, reason: collision with root package name */
    public char f21903p;

    /* renamed from: q, reason: collision with root package name */
    public int f21904q;

    /* renamed from: r, reason: collision with root package name */
    public int f21905r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f21906s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f21907t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f21908u;

    /* renamed from: v, reason: collision with root package name */
    public int f21909v;

    /* renamed from: w, reason: collision with root package name */
    public int f21910w;

    /* renamed from: x, reason: collision with root package name */
    public String f21911x;

    /* renamed from: y, reason: collision with root package name */
    public String f21912y;

    /* renamed from: z, reason: collision with root package name */
    public ActionProviderVisibilityListenerC2536o f21913z;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f21888C = null;

    /* renamed from: D, reason: collision with root package name */
    public PorterDuff.Mode f21889D = null;
    public int b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f21892c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f21893d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f21894e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21895f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21896g = true;

    public h(i iVar, Menu menu) {
        this.f21890E = iVar;
        this.f21891a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f21890E.f21917c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e4) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.MenuItem$OnMenuItemClickListener, o.g, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z8;
        MenuItem enabled = menuItem.setChecked(this.f21906s).setVisible(this.f21907t).setEnabled(this.f21908u);
        boolean z9 = false;
        if (this.f21905r >= 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        enabled.setCheckable(z8).setTitleCondensed(this.l).setIcon(this.m);
        int i9 = this.f21909v;
        if (i9 >= 0) {
            menuItem.setShowAsAction(i9);
        }
        String str = this.f21912y;
        i iVar = this.f21890E;
        if (str != null) {
            if (!iVar.f21917c.isRestricted()) {
                if (iVar.f21918d == null) {
                    iVar.f21918d = i.a(iVar.f21917c);
                }
                Object obj = iVar.f21918d;
                String str2 = this.f21912y;
                ?? obj2 = new Object();
                obj2.f21885a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.b = cls.getMethod(str2, g.f21884c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e4) {
                    StringBuilder n2 = o.n("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    n2.append(cls.getName());
                    InflateException inflateException = new InflateException(n2.toString());
                    inflateException.initCause(e4);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f21905r >= 2) {
            if (menuItem instanceof C2535n) {
                C2535n c2535n = (C2535n) menuItem;
                c2535n.f22150z = (c2535n.f22150z & (-5)) | 4;
            } else if (menuItem instanceof s) {
                s sVar = (s) menuItem;
                try {
                    Method method = sVar.f22157f;
                    N.a aVar = sVar.f22156d;
                    if (method == null) {
                        sVar.f22157f = aVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    sVar.f22157f.invoke(aVar, Boolean.TRUE);
                } catch (Exception e9) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e9);
                }
            }
        }
        String str3 = this.f21911x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, i.f21914e, iVar.f21916a));
            z9 = true;
        }
        int i10 = this.f21910w;
        if (i10 > 0) {
            if (!z9) {
                menuItem.setActionView(i10);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        ActionProviderVisibilityListenerC2536o actionProviderVisibilityListenerC2536o = this.f21913z;
        if (actionProviderVisibilityListenerC2536o != null) {
            if (menuItem instanceof N.a) {
                ((N.a) menuItem).a(actionProviderVisibilityListenerC2536o);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.f21886A;
        boolean z10 = menuItem instanceof N.a;
        if (z10) {
            ((N.a) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0285p.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f21887B;
        if (z10) {
            ((N.a) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0285p.m(menuItem, charSequence2);
        }
        char c9 = this.f21901n;
        int i11 = this.f21902o;
        if (z10) {
            ((N.a) menuItem).setAlphabeticShortcut(c9, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0285p.g(menuItem, c9, i11);
        }
        char c10 = this.f21903p;
        int i12 = this.f21904q;
        if (z10) {
            ((N.a) menuItem).setNumericShortcut(c10, i12);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0285p.k(menuItem, c10, i12);
        }
        PorterDuff.Mode mode = this.f21889D;
        if (mode != null) {
            if (z10) {
                ((N.a) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0285p.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f21888C;
        if (colorStateList != null) {
            if (z10) {
                ((N.a) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0285p.i(menuItem, colorStateList);
            }
        }
    }
}

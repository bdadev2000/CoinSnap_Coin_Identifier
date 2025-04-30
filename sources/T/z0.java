package T;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class z0 extends E0 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f2944h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f2945i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f2946j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f2947k;
    public static Field l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f2948c;

    /* renamed from: d, reason: collision with root package name */
    public L.e[] f2949d;

    /* renamed from: e, reason: collision with root package name */
    public L.e f2950e;

    /* renamed from: f, reason: collision with root package name */
    public G0 f2951f;

    /* renamed from: g, reason: collision with root package name */
    public L.e f2952g;

    public z0(@NonNull G0 g02, @NonNull WindowInsets windowInsets) {
        super(g02);
        this.f2950e = null;
        this.f2948c = windowInsets;
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    private L.e r(int i9, boolean z8) {
        L.e eVar = L.e.f1668e;
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((i9 & i10) != 0) {
                eVar = L.e.a(eVar, s(i10, z8));
            }
        }
        return eVar;
    }

    private L.e t() {
        G0 g02 = this.f2951f;
        if (g02 != null) {
            return g02.f2863a.h();
        }
        return L.e.f1668e;
    }

    @Nullable
    private L.e u(@NonNull View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f2944h) {
                v();
            }
            Method method = f2945i;
            if (method != null && f2946j != null && f2947k != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f2947k.get(l.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return L.e.b(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e4) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            f2945i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f2946j = cls;
            f2947k = cls.getDeclaredField("mVisibleInsets");
            l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f2947k.setAccessible(true);
            l.setAccessible(true);
        } catch (ReflectiveOperationException e4) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
        }
        f2944h = true;
    }

    @Override // T.E0
    public void d(@NonNull View view) {
        L.e u8 = u(view);
        if (u8 == null) {
            u8 = L.e.f1668e;
        }
        w(u8);
    }

    @Override // T.E0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f2952g, ((z0) obj).f2952g);
    }

    @Override // T.E0
    @NonNull
    public L.e f(int i9) {
        return r(i9, false);
    }

    @Override // T.E0
    @NonNull
    public final L.e j() {
        if (this.f2950e == null) {
            WindowInsets windowInsets = this.f2948c;
            this.f2950e = L.e.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f2950e;
    }

    @Override // T.E0
    @NonNull
    public G0 l(int i9, int i10, int i11, int i12) {
        y0 v0Var;
        G0 h6 = G0.h(null, this.f2948c);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            v0Var = new x0(h6);
        } else if (i13 >= 29) {
            v0Var = new w0(h6);
        } else {
            v0Var = new v0(h6);
        }
        v0Var.g(G0.e(j(), i9, i10, i11, i12));
        v0Var.e(G0.e(h(), i9, i10, i11, i12));
        return v0Var.b();
    }

    @Override // T.E0
    public boolean n() {
        return this.f2948c.isRound();
    }

    @Override // T.E0
    public void o(L.e[] eVarArr) {
        this.f2949d = eVarArr;
    }

    @Override // T.E0
    public void p(@Nullable G0 g02) {
        this.f2951f = g02;
    }

    @NonNull
    public L.e s(int i9, boolean z8) {
        int i10;
        C0274i e4;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        if (i9 != 1) {
            L.e eVar = null;
            if (i9 != 2) {
                L.e eVar2 = L.e.f1668e;
                if (i9 != 8) {
                    if (i9 != 16) {
                        if (i9 != 32) {
                            if (i9 != 64) {
                                if (i9 != 128) {
                                    return eVar2;
                                }
                                G0 g02 = this.f2951f;
                                if (g02 != null) {
                                    e4 = g02.f2863a.e();
                                } else {
                                    e4 = e();
                                }
                                if (e4 != null) {
                                    int i15 = Build.VERSION.SDK_INT;
                                    if (i15 >= 28) {
                                        i11 = AbstractC0272h.d(e4.f2899a);
                                    } else {
                                        i11 = 0;
                                    }
                                    if (i15 >= 28) {
                                        i12 = AbstractC0272h.f(e4.f2899a);
                                    } else {
                                        i12 = 0;
                                    }
                                    if (i15 >= 28) {
                                        i13 = AbstractC0272h.e(e4.f2899a);
                                    } else {
                                        i13 = 0;
                                    }
                                    if (i15 >= 28) {
                                        i14 = AbstractC0272h.c(e4.f2899a);
                                    }
                                    return L.e.b(i11, i12, i13, i14);
                                }
                                return eVar2;
                            }
                            return k();
                        }
                        return g();
                    }
                    return i();
                }
                L.e[] eVarArr = this.f2949d;
                if (eVarArr != null) {
                    eVar = eVarArr[3];
                }
                if (eVar != null) {
                    return eVar;
                }
                L.e j7 = j();
                L.e t9 = t();
                int i16 = j7.f1671d;
                if (i16 > t9.f1671d) {
                    return L.e.b(0, 0, 0, i16);
                }
                L.e eVar3 = this.f2952g;
                if (eVar3 != null && !eVar3.equals(eVar2) && (i10 = this.f2952g.f1671d) > t9.f1671d) {
                    return L.e.b(0, 0, 0, i10);
                }
                return eVar2;
            }
            if (z8) {
                L.e t10 = t();
                L.e h6 = h();
                return L.e.b(Math.max(t10.f1669a, h6.f1669a), 0, Math.max(t10.f1670c, h6.f1670c), Math.max(t10.f1671d, h6.f1671d));
            }
            L.e j9 = j();
            G0 g03 = this.f2951f;
            if (g03 != null) {
                eVar = g03.f2863a.h();
            }
            int i17 = j9.f1671d;
            if (eVar != null) {
                i17 = Math.min(i17, eVar.f1671d);
            }
            return L.e.b(j9.f1669a, 0, j9.f1670c, i17);
        }
        if (z8) {
            return L.e.b(0, Math.max(t().b, j().b), 0, 0);
        }
        return L.e.b(0, j().b, 0, 0);
    }

    public void w(@NonNull L.e eVar) {
        this.f2952g = eVar;
    }
}

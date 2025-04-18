package n0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class j2 extends o2 {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f22292h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f22293i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f22294j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f22295k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f22296l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f22297c;

    /* renamed from: d, reason: collision with root package name */
    public g0.f[] f22298d;

    /* renamed from: e, reason: collision with root package name */
    public g0.f f22299e;

    /* renamed from: f, reason: collision with root package name */
    public r2 f22300f;

    /* renamed from: g, reason: collision with root package name */
    public g0.f f22301g;

    public j2(@NonNull r2 r2Var, @NonNull WindowInsets windowInsets) {
        super(r2Var);
        this.f22299e = null;
        this.f22297c = windowInsets;
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    private g0.f r(int i10, boolean z10) {
        g0.f fVar = g0.f.f17909e;
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                fVar = g0.f.a(fVar, s(i11, z10));
            }
        }
        return fVar;
    }

    private g0.f t() {
        r2 r2Var = this.f22300f;
        if (r2Var != null) {
            return r2Var.a.h();
        }
        return g0.f.f17909e;
    }

    @Nullable
    private g0.f u(@NonNull View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f22292h) {
                v();
            }
            Method method = f22293i;
            if (method != null && f22294j != null && f22295k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f22295k.get(f22296l.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return g0.f.b(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e2) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            f22293i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f22294j = cls;
            f22295k = cls.getDeclaredField("mVisibleInsets");
            f22296l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f22295k.setAccessible(true);
            f22296l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f22292h = true;
    }

    @Override // n0.o2
    public void d(@NonNull View view) {
        g0.f u = u(view);
        if (u == null) {
            u = g0.f.f17909e;
        }
        w(u);
    }

    @Override // n0.o2
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f22301g, ((j2) obj).f22301g);
    }

    @Override // n0.o2
    @NonNull
    public g0.f f(int i10) {
        return r(i10, false);
    }

    @Override // n0.o2
    @NonNull
    public final g0.f j() {
        if (this.f22299e == null) {
            WindowInsets windowInsets = this.f22297c;
            this.f22299e = g0.f.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f22299e;
    }

    @Override // n0.o2
    @NonNull
    public r2 l(int i10, int i11, int i12, int i13) {
        kc.c cVar = new kc.c(r2.h(null, this.f22297c));
        ((i2) cVar.f20640c).g(r2.f(j(), i10, i11, i12, i13));
        ((i2) cVar.f20640c).e(r2.f(h(), i10, i11, i12, i13));
        return cVar.n();
    }

    @Override // n0.o2
    public boolean n() {
        return this.f22297c.isRound();
    }

    @Override // n0.o2
    public void o(g0.f[] fVarArr) {
        this.f22298d = fVarArr;
    }

    @Override // n0.o2
    public void p(@Nullable r2 r2Var) {
        this.f22300f = r2Var;
    }

    @NonNull
    public g0.f s(int i10, boolean z10) {
        int i11;
        k e2;
        int i12;
        int i13;
        int i14;
        int i15 = 0;
        if (i10 != 1) {
            g0.f fVar = null;
            if (i10 != 2) {
                g0.f fVar2 = g0.f.f17909e;
                if (i10 != 8) {
                    if (i10 != 16) {
                        if (i10 != 32) {
                            if (i10 != 64) {
                                if (i10 != 128) {
                                    return fVar2;
                                }
                                r2 r2Var = this.f22300f;
                                if (r2Var != null) {
                                    e2 = r2Var.a.e();
                                } else {
                                    e2 = e();
                                }
                                if (e2 != null) {
                                    int i16 = Build.VERSION.SDK_INT;
                                    DisplayCutout displayCutout = e2.a;
                                    if (i16 >= 28) {
                                        i12 = j.d(displayCutout);
                                    } else {
                                        i12 = 0;
                                    }
                                    if (i16 >= 28) {
                                        i13 = j.f(displayCutout);
                                    } else {
                                        i13 = 0;
                                    }
                                    if (i16 >= 28) {
                                        i14 = j.e(displayCutout);
                                    } else {
                                        i14 = 0;
                                    }
                                    if (i16 >= 28) {
                                        i15 = j.c(displayCutout);
                                    }
                                    return g0.f.b(i12, i13, i14, i15);
                                }
                                return fVar2;
                            }
                            return k();
                        }
                        return g();
                    }
                    return i();
                }
                g0.f[] fVarArr = this.f22298d;
                if (fVarArr != null) {
                    fVar = fVarArr[com.bumptech.glide.c.G(8)];
                }
                if (fVar != null) {
                    return fVar;
                }
                g0.f j3 = j();
                g0.f t5 = t();
                int i17 = j3.f17912d;
                if (i17 > t5.f17912d) {
                    return g0.f.b(0, 0, 0, i17);
                }
                g0.f fVar3 = this.f22301g;
                if (fVar3 != null && !fVar3.equals(fVar2) && (i11 = this.f22301g.f17912d) > t5.f17912d) {
                    return g0.f.b(0, 0, 0, i11);
                }
                return fVar2;
            }
            if (z10) {
                g0.f t10 = t();
                g0.f h10 = h();
                return g0.f.b(Math.max(t10.a, h10.a), 0, Math.max(t10.f17911c, h10.f17911c), Math.max(t10.f17912d, h10.f17912d));
            }
            g0.f j10 = j();
            r2 r2Var2 = this.f22300f;
            if (r2Var2 != null) {
                fVar = r2Var2.a.h();
            }
            int i18 = j10.f17912d;
            if (fVar != null) {
                i18 = Math.min(i18, fVar.f17912d);
            }
            return g0.f.b(j10.a, 0, j10.f17911c, i18);
        }
        if (z10) {
            return g0.f.b(0, Math.max(t().f17910b, j().f17910b), 0, 0);
        }
        return g0.f.b(0, j().f17910b, 0, 0);
    }

    public void w(@NonNull g0.f fVar) {
        this.f22301g = fVar;
    }
}

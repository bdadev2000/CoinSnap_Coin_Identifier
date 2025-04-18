package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class WindowInsetsCompat {

    /* renamed from: b, reason: collision with root package name */
    public static final WindowInsetsCompat f18788b;

    /* renamed from: a, reason: collision with root package name */
    public final Impl f18789a;

    @RequiresApi
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    public static class Api21ReflectionHolder {

        /* renamed from: a, reason: collision with root package name */
        public static final Field f18790a;

        /* renamed from: b, reason: collision with root package name */
        public static final Field f18791b;

        /* renamed from: c, reason: collision with root package name */
        public static final Field f18792c;
        public static final boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f18790a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f18791b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f18792c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class BuilderImpl {

        /* renamed from: a, reason: collision with root package name */
        public final WindowInsetsCompat f18794a;

        /* renamed from: b, reason: collision with root package name */
        public Insets[] f18795b;

        public BuilderImpl() {
            this(new WindowInsetsCompat());
        }

        public final void a() {
            Insets[] insetsArr = this.f18795b;
            if (insetsArr != null) {
                Insets insets = insetsArr[Type.a(1)];
                Insets insets2 = this.f18795b[Type.a(2)];
                WindowInsetsCompat windowInsetsCompat = this.f18794a;
                if (insets2 == null) {
                    insets2 = windowInsetsCompat.f18789a.f(2);
                }
                if (insets == null) {
                    insets = windowInsetsCompat.f18789a.f(1);
                }
                g(Insets.a(insets, insets2));
                Insets insets3 = this.f18795b[Type.a(16)];
                if (insets3 != null) {
                    f(insets3);
                }
                Insets insets4 = this.f18795b[Type.a(32)];
                if (insets4 != null) {
                    d(insets4);
                }
                Insets insets5 = this.f18795b[Type.a(64)];
                if (insets5 != null) {
                    h(insets5);
                }
            }
        }

        @NonNull
        public WindowInsetsCompat b() {
            a();
            return this.f18794a;
        }

        public void c(int i2, @NonNull Insets insets) {
            if (this.f18795b == null) {
                this.f18795b = new Insets[9];
            }
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    this.f18795b[Type.a(i3)] = insets;
                }
            }
        }

        public void d(@NonNull Insets insets) {
        }

        public void e(@NonNull Insets insets) {
        }

        public void f(@NonNull Insets insets) {
        }

        public void g(@NonNull Insets insets) {
        }

        public void h(@NonNull Insets insets) {
        }

        public BuilderImpl(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f18794a = windowInsetsCompat;
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class BuilderImpl30 extends BuilderImpl29 {
        public BuilderImpl30() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void c(int i2, @NonNull Insets insets) {
            this.f18800c.setInsets(TypeImpl30.a(i2), insets.d());
        }

        public BuilderImpl30(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    /* loaded from: classes.dex */
    public static class Impl {

        /* renamed from: b, reason: collision with root package name */
        public static final WindowInsetsCompat f18801b = new Builder().f18793a.b().f18789a.a().f18789a.b().f18789a.c();

        /* renamed from: a, reason: collision with root package name */
        public final WindowInsetsCompat f18802a;

        public Impl(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f18802a = windowInsetsCompat;
        }

        @NonNull
        public WindowInsetsCompat a() {
            return this.f18802a;
        }

        @NonNull
        public WindowInsetsCompat b() {
            return this.f18802a;
        }

        @NonNull
        public WindowInsetsCompat c() {
            return this.f18802a;
        }

        public void d(@NonNull View view) {
        }

        @Nullable
        public DisplayCutoutCompat e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl)) {
                return false;
            }
            Impl impl = (Impl) obj;
            return o() == impl.o() && n() == impl.n() && Objects.equals(k(), impl.k()) && Objects.equals(i(), impl.i()) && Objects.equals(e(), impl.e());
        }

        @NonNull
        public Insets f(int i2) {
            return Insets.e;
        }

        @NonNull
        public Insets g(int i2) {
            if ((i2 & 8) == 0) {
                return Insets.e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        @NonNull
        public Insets h() {
            return k();
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
        }

        @NonNull
        public Insets i() {
            return Insets.e;
        }

        @NonNull
        public Insets j() {
            return k();
        }

        @NonNull
        public Insets k() {
            return Insets.e;
        }

        @NonNull
        public Insets l() {
            return k();
        }

        @NonNull
        public WindowInsetsCompat m(int i2, int i3, int i4, int i5) {
            return f18801b;
        }

        public boolean n() {
            return false;
        }

        public boolean o() {
            return false;
        }

        public boolean p(int i2) {
            return true;
        }

        public void q(Insets[] insetsArr) {
        }

        public void r(@Nullable WindowInsetsCompat windowInsetsCompat) {
        }

        public void s(Insets insets) {
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Impl20 extends Impl {

        /* renamed from: h, reason: collision with root package name */
        public static boolean f18803h;

        /* renamed from: i, reason: collision with root package name */
        public static Method f18804i;

        /* renamed from: j, reason: collision with root package name */
        public static Class f18805j;

        /* renamed from: k, reason: collision with root package name */
        public static Field f18806k;

        /* renamed from: l, reason: collision with root package name */
        public static Field f18807l;

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets f18808c;
        public Insets[] d;
        public Insets e;

        /* renamed from: f, reason: collision with root package name */
        public WindowInsetsCompat f18809f;

        /* renamed from: g, reason: collision with root package name */
        public Insets f18810g;

        public Impl20(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.e = null;
            this.f18808c = windowInsets;
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        private Insets t(int i2, boolean z2) {
            Insets insets = Insets.e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    insets = Insets.a(insets, u(i3, z2));
                }
            }
            return insets;
        }

        private Insets v() {
            WindowInsetsCompat windowInsetsCompat = this.f18809f;
            return windowInsetsCompat != null ? windowInsetsCompat.f18789a.i() : Insets.e;
        }

        @Nullable
        private Insets w(@NonNull View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f18803h) {
                y();
            }
            Method method = f18804i;
            if (method != null && f18805j != null && f18806k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f18806k.get(f18807l.get(invoke));
                    if (rect != null) {
                        return Insets.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void y() {
            try {
                f18804i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f18805j = cls;
                f18806k = cls.getDeclaredField("mVisibleInsets");
                f18807l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f18806k.setAccessible(true);
                f18807l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f18803h = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void d(@NonNull View view) {
            Insets w = w(view);
            if (w == null) {
                w = Insets.e;
            }
            z(w);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f18810g, ((Impl20) obj).f18810g);
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public Insets f(int i2) {
            return t(i2, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public Insets g(int i2) {
            return t(i2, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public final Insets k() {
            if (this.e == null) {
                WindowInsets windowInsets = this.f18808c;
                this.e = Insets.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public WindowInsetsCompat m(int i2, int i3, int i4, int i5) {
            Builder builder = new Builder(WindowInsetsCompat.s(null, this.f18808c));
            builder.b(WindowInsetsCompat.n(k(), i2, i3, i4, i5));
            Insets n2 = WindowInsetsCompat.n(i(), i2, i3, i4, i5);
            BuilderImpl builderImpl = builder.f18793a;
            builderImpl.e(n2);
            return builderImpl.b();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean o() {
            return this.f18808c.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @SuppressLint({"WrongConstant"})
        public boolean p(int i2) {
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0 && !x(i3)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void q(Insets[] insetsArr) {
            this.d = insetsArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void r(@Nullable WindowInsetsCompat windowInsetsCompat) {
            this.f18809f = windowInsetsCompat;
        }

        @NonNull
        public Insets u(int i2, boolean z2) {
            Insets i3;
            int i4;
            if (i2 == 1) {
                return z2 ? Insets.b(0, Math.max(v().f18534b, k().f18534b), 0, 0) : Insets.b(0, k().f18534b, 0, 0);
            }
            if (i2 == 2) {
                if (z2) {
                    Insets v2 = v();
                    Insets i5 = i();
                    return Insets.b(Math.max(v2.f18533a, i5.f18533a), 0, Math.max(v2.f18535c, i5.f18535c), Math.max(v2.d, i5.d));
                }
                Insets k2 = k();
                WindowInsetsCompat windowInsetsCompat = this.f18809f;
                i3 = windowInsetsCompat != null ? windowInsetsCompat.f18789a.i() : null;
                int i6 = k2.d;
                if (i3 != null) {
                    i6 = Math.min(i6, i3.d);
                }
                return Insets.b(k2.f18533a, 0, k2.f18535c, i6);
            }
            Insets insets = Insets.e;
            if (i2 == 8) {
                Insets[] insetsArr = this.d;
                i3 = insetsArr != null ? insetsArr[Type.a(8)] : null;
                if (i3 != null) {
                    return i3;
                }
                Insets k3 = k();
                Insets v3 = v();
                int i7 = k3.d;
                if (i7 > v3.d) {
                    return Insets.b(0, 0, 0, i7);
                }
                Insets insets2 = this.f18810g;
                return (insets2 == null || insets2.equals(insets) || (i4 = this.f18810g.d) <= v3.d) ? insets : Insets.b(0, 0, 0, i4);
            }
            if (i2 == 16) {
                return j();
            }
            if (i2 == 32) {
                return h();
            }
            if (i2 == 64) {
                return l();
            }
            if (i2 != 128) {
                return insets;
            }
            WindowInsetsCompat windowInsetsCompat2 = this.f18809f;
            DisplayCutoutCompat e = windowInsetsCompat2 != null ? windowInsetsCompat2.f18789a.e() : e();
            if (e == null) {
                return insets;
            }
            int i8 = Build.VERSION.SDK_INT;
            DisplayCutout displayCutout = e.f18709a;
            return Insets.b(i8 >= 28 ? DisplayCutoutCompat.Api28Impl.d(displayCutout) : 0, i8 >= 28 ? DisplayCutoutCompat.Api28Impl.f(displayCutout) : 0, i8 >= 28 ? DisplayCutoutCompat.Api28Impl.e(displayCutout) : 0, i8 >= 28 ? DisplayCutoutCompat.Api28Impl.c(displayCutout) : 0);
        }

        public boolean x(int i2) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 8 && i2 != 128) {
                    return true;
                }
            }
            return !u(i2, false).equals(Insets.e);
        }

        public void z(@NonNull Insets insets) {
            this.f18810g = insets;
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Impl21 extends Impl20 {

        /* renamed from: m, reason: collision with root package name */
        public Insets f18811m;

        public Impl21(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f18811m = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public WindowInsetsCompat b() {
            return WindowInsetsCompat.s(null, this.f18808c.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public WindowInsetsCompat c() {
            return WindowInsetsCompat.s(null, this.f18808c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public final Insets i() {
            if (this.f18811m == null) {
                WindowInsets windowInsets = this.f18808c;
                this.f18811m = Insets.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f18811m;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean n() {
            return this.f18808c.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void s(@Nullable Insets insets) {
            this.f18811m = insets;
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Impl28 extends Impl21 {
        public Impl28(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public WindowInsetsCompat a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f18808c.consumeDisplayCutout();
            return WindowInsetsCompat.s(null, consumeDisplayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @Nullable
        public DisplayCutoutCompat e() {
            DisplayCutout displayCutout;
            displayCutout = this.f18808c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new DisplayCutoutCompat(displayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl28)) {
                return false;
            }
            Impl28 impl28 = (Impl28) obj;
            return Objects.equals(this.f18808c, impl28.f18808c) && Objects.equals(this.f18810g, impl28.f18810g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
            return this.f18808c.hashCode();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Impl29 extends Impl28 {

        /* renamed from: n, reason: collision with root package name */
        public Insets f18812n;

        /* renamed from: o, reason: collision with root package name */
        public Insets f18813o;

        /* renamed from: p, reason: collision with root package name */
        public Insets f18814p;

        public Impl29(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f18812n = null;
            this.f18813o = null;
            this.f18814p = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public Insets h() {
            android.graphics.Insets mandatorySystemGestureInsets;
            if (this.f18813o == null) {
                mandatorySystemGestureInsets = this.f18808c.getMandatorySystemGestureInsets();
                this.f18813o = Insets.c(mandatorySystemGestureInsets);
            }
            return this.f18813o;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public Insets j() {
            android.graphics.Insets systemGestureInsets;
            if (this.f18812n == null) {
                systemGestureInsets = this.f18808c.getSystemGestureInsets();
                this.f18812n = Insets.c(systemGestureInsets);
            }
            return this.f18812n;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public Insets l() {
            android.graphics.Insets tappableElementInsets;
            if (this.f18814p == null) {
                tappableElementInsets = this.f18808c.getTappableElementInsets();
                this.f18814p = Insets.c(tappableElementInsets);
            }
            return this.f18814p;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public WindowInsetsCompat m(int i2, int i3, int i4, int i5) {
            WindowInsets inset;
            inset = this.f18808c.inset(i2, i3, i4, i5);
            return WindowInsetsCompat.s(null, inset);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        public void s(@Nullable Insets insets) {
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Impl30 extends Impl29 {

        /* renamed from: q, reason: collision with root package name */
        public static final WindowInsetsCompat f18815q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f18815q = WindowInsetsCompat.s(null, windowInsets);
        }

        public Impl30(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public final void d(@NonNull View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public Insets f(int i2) {
            android.graphics.Insets insets;
            insets = this.f18808c.getInsets(TypeImpl30.a(i2));
            return Insets.c(insets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        @NonNull
        public Insets g(int i2) {
            android.graphics.Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.f18808c.getInsetsIgnoringVisibility(TypeImpl30.a(i2));
            return Insets.c(insetsIgnoringVisibility);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean p(int i2) {
            boolean isVisible;
            isVisible = this.f18808c.isVisible(TypeImpl30.a(i2));
            return isVisible;
        }
    }

    /* loaded from: classes.dex */
    public static final class Type {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        /* loaded from: classes.dex */
        public @interface InsetsType {
        }

        public static int a(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            if (i2 == 8) {
                return 3;
            }
            if (i2 == 16) {
                return 4;
            }
            if (i2 == 32) {
                return 5;
            }
            if (i2 == 64) {
                return 6;
            }
            if (i2 == 128) {
                return 7;
            }
            if (i2 == 256) {
                return 8;
            }
            throw new IllegalArgumentException(android.support.v4.media.d.i("type needs to be >= FIRST and <= LAST, type=", i2));
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class TypeImpl30 {
        public static int a(int i2) {
            int statusBars;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i2 & i4) != 0) {
                    if (i4 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i3 |= statusBars;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f18788b = Impl30.f18815q;
        } else {
            f18788b = Impl.f18801b;
        }
    }

    public WindowInsetsCompat(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f18789a = new Impl30(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f18789a = new Impl29(this, windowInsets);
        } else if (i2 >= 28) {
            this.f18789a = new Impl28(this, windowInsets);
        } else {
            this.f18789a = new Impl21(this, windowInsets);
        }
    }

    public static Insets n(Insets insets, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, insets.f18533a - i2);
        int max2 = Math.max(0, insets.f18534b - i3);
        int max3 = Math.max(0, insets.f18535c - i4);
        int max4 = Math.max(0, insets.d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? insets : Insets.b(max, max2, max3, max4);
    }

    public static WindowInsetsCompat s(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = ViewCompat.f18740a;
            WindowInsetsCompat a2 = ViewCompat.Api23Impl.a(view);
            Impl impl = windowInsetsCompat.f18789a;
            impl.r(a2);
            impl.d(view.getRootView());
        }
        return windowInsetsCompat;
    }

    public final WindowInsetsCompat a() {
        return this.f18789a.a();
    }

    public final WindowInsetsCompat b() {
        return this.f18789a.b();
    }

    public final WindowInsetsCompat c() {
        return this.f18789a.c();
    }

    public final DisplayCutoutCompat d() {
        return this.f18789a.e();
    }

    public final Insets e(int i2) {
        return this.f18789a.f(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat)) {
            return false;
        }
        return Objects.equals(this.f18789a, ((WindowInsetsCompat) obj).f18789a);
    }

    public final Insets f(int i2) {
        return this.f18789a.g(i2);
    }

    public final void g() {
        this.f18789a.j();
    }

    public final int h() {
        return this.f18789a.k().d;
    }

    public final int hashCode() {
        Impl impl = this.f18789a;
        if (impl == null) {
            return 0;
        }
        return impl.hashCode();
    }

    public final int i() {
        return this.f18789a.k().f18533a;
    }

    public final int j() {
        return this.f18789a.k().f18535c;
    }

    public final int k() {
        return this.f18789a.k().f18534b;
    }

    public final boolean l() {
        return !this.f18789a.k().equals(Insets.e);
    }

    public final WindowInsetsCompat m(int i2, int i3, int i4, int i5) {
        return this.f18789a.m(i2, i3, i4, i5);
    }

    public final boolean o() {
        return this.f18789a.n();
    }

    public final boolean p(int i2) {
        return this.f18789a.p(i2);
    }

    public final WindowInsetsCompat q(int i2, int i3, int i4, int i5) {
        Builder builder = new Builder(this);
        Insets b2 = Insets.b(i2, i3, i4, i5);
        BuilderImpl builderImpl = builder.f18793a;
        builderImpl.g(b2);
        return builderImpl.b();
    }

    public final WindowInsets r() {
        Impl impl = this.f18789a;
        if (impl instanceof Impl20) {
            return ((Impl20) impl).f18808c;
        }
        return null;
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class BuilderImpl20 extends BuilderImpl {
        public static Field e;

        /* renamed from: f, reason: collision with root package name */
        public static boolean f18796f;

        /* renamed from: g, reason: collision with root package name */
        public static Constructor f18797g;

        /* renamed from: h, reason: collision with root package name */
        public static boolean f18798h;

        /* renamed from: c, reason: collision with root package name */
        public WindowInsets f18799c;
        public Insets d;

        public BuilderImpl20() {
            this.f18799c = i();
        }

        @Nullable
        private static WindowInsets i() {
            if (!f18796f) {
                try {
                    e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f18796f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f18798h) {
                try {
                    f18797g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f18798h = true;
            }
            Constructor constructor = f18797g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        @NonNull
        public WindowInsetsCompat b() {
            a();
            WindowInsetsCompat s2 = WindowInsetsCompat.s(null, this.f18799c);
            Insets[] insetsArr = this.f18795b;
            Impl impl = s2.f18789a;
            impl.q(insetsArr);
            impl.s(this.d);
            return s2;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void e(@Nullable Insets insets) {
            this.d = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void g(@NonNull Insets insets) {
            WindowInsets windowInsets = this.f18799c;
            if (windowInsets != null) {
                this.f18799c = windowInsets.replaceSystemWindowInsets(insets.f18533a, insets.f18534b, insets.f18535c, insets.d);
            }
        }

        public BuilderImpl20(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f18799c = windowInsetsCompat.r();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class BuilderImpl29 extends BuilderImpl {

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f18800c;

        public BuilderImpl29() {
            this.f18800c = androidx.compose.ui.graphics.layer.a.c();
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        @NonNull
        public WindowInsetsCompat b() {
            WindowInsets build;
            a();
            build = this.f18800c.build();
            WindowInsetsCompat s2 = WindowInsetsCompat.s(null, build);
            s2.f18789a.q(this.f18795b);
            return s2;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void d(@NonNull Insets insets) {
            this.f18800c.setMandatorySystemGestureInsets(insets.d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void e(@NonNull Insets insets) {
            this.f18800c.setStableInsets(insets.d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void f(@NonNull Insets insets) {
            this.f18800c.setSystemGestureInsets(insets.d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void g(@NonNull Insets insets) {
            this.f18800c.setSystemWindowInsets(insets.d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void h(@NonNull Insets insets) {
            this.f18800c.setTappableElementInsets(insets.d());
        }

        public BuilderImpl29(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            WindowInsets.Builder c2;
            WindowInsets r2 = windowInsetsCompat.r();
            if (r2 != null) {
                c2 = androidx.compose.ui.graphics.layer.a.d(r2);
            } else {
                c2 = androidx.compose.ui.graphics.layer.a.c();
            }
            this.f18800c = c2;
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final BuilderImpl f18793a;

        public Builder() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                this.f18793a = new BuilderImpl30();
            } else if (i2 >= 29) {
                this.f18793a = new BuilderImpl29();
            } else {
                this.f18793a = new BuilderImpl20();
            }
        }

        public final WindowInsetsCompat a() {
            return this.f18793a.b();
        }

        public final void b(Insets insets) {
            this.f18793a.g(insets);
        }

        public Builder(WindowInsetsCompat windowInsetsCompat) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                this.f18793a = new BuilderImpl30(windowInsetsCompat);
            } else if (i2 >= 29) {
                this.f18793a = new BuilderImpl29(windowInsetsCompat);
            } else {
                this.f18793a = new BuilderImpl20(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat() {
        this.f18789a = new Impl(this);
    }
}

package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.annotation.RequiresApi;
import androidx.collection.SimpleArrayMap;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public final class WindowInsetsControllerCompat {

    /* renamed from: a, reason: collision with root package name */
    public final Impl f18816a;

    /* loaded from: classes3.dex */
    public static class Impl {
        public int a() {
            return 0;
        }

        public void b(int i2) {
        }

        public boolean c() {
            return false;
        }

        public boolean d() {
            return false;
        }

        public void e(boolean z2) {
        }

        public void f(boolean z2) {
        }

        public void g(int i2) {
        }

        public void h(int i2) {
        }
    }

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Impl20 extends Impl {

        /* renamed from: a, reason: collision with root package name */
        public final Window f18817a;

        /* renamed from: b, reason: collision with root package name */
        public final SoftwareKeyboardControllerCompat f18818b;

        public Impl20(Window window, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.f18817a = window;
            this.f18818b = softwareKeyboardControllerCompat;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final int a() {
            return 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void b(int i2) {
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    if (i3 == 1) {
                        i(4);
                    } else if (i3 == 2) {
                        i(2);
                    } else if (i3 == 8) {
                        this.f18818b.a();
                    }
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void g(int i2) {
            if (i2 == 0) {
                j(6144);
                return;
            }
            if (i2 == 1) {
                j(4096);
                i(Opcodes.ACC_STRICT);
            } else {
                if (i2 != 2) {
                    return;
                }
                j(Opcodes.ACC_STRICT);
                i(4096);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void h(int i2) {
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    if (i3 == 1) {
                        j(4);
                        this.f18817a.clearFlags(1024);
                    } else if (i3 == 2) {
                        j(2);
                    } else if (i3 == 8) {
                        this.f18818b.b();
                    }
                }
            }
        }

        public final void i(int i2) {
            View decorView = this.f18817a.getDecorView();
            decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
        }

        public final void j(int i2) {
            View decorView = this.f18817a.getDecorView();
            decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
        }
    }

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Impl23 extends Impl20 {
        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final boolean d() {
            return (this.f18817a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void f(boolean z2) {
            if (!z2) {
                j(8192);
                return;
            }
            Window window = this.f18817a;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            i(8192);
        }
    }

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Impl26 extends Impl23 {
        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final boolean c() {
            return (this.f18817a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void e(boolean z2) {
            if (!z2) {
                j(16);
                return;
            }
            Window window = this.f18817a;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            i(16);
        }
    }

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class Impl30 extends Impl {

        /* renamed from: a, reason: collision with root package name */
        public final WindowInsetsController f18819a;

        /* renamed from: b, reason: collision with root package name */
        public final SoftwareKeyboardControllerCompat f18820b;

        /* renamed from: c, reason: collision with root package name */
        public Window f18821c;

        /* renamed from: androidx.core.view.WindowInsetsControllerCompat$Impl30$1, reason: invalid class name */
        /* loaded from: classes3.dex */
        class AnonymousClass1 implements WindowInsetsAnimationControlListener {
            public final void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
                throw null;
            }

            public final void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
                throw null;
            }

            public final void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i2) {
                throw null;
            }
        }

        public Impl30(WindowInsetsController windowInsetsController, SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            new SimpleArrayMap(0);
            this.f18819a = windowInsetsController;
            this.f18820b = softwareKeyboardControllerCompat;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final int a() {
            int systemBarsBehavior;
            systemBarsBehavior = this.f18819a.getSystemBarsBehavior();
            return systemBarsBehavior;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void b(int i2) {
            if ((i2 & 8) != 0) {
                this.f18820b.a();
            }
            this.f18819a.hide(i2 & (-9));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final boolean c() {
            int systemBarsAppearance;
            WindowInsetsController windowInsetsController = this.f18819a;
            windowInsetsController.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = windowInsetsController.getSystemBarsAppearance();
            return (systemBarsAppearance & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final boolean d() {
            int systemBarsAppearance;
            WindowInsetsController windowInsetsController = this.f18819a;
            windowInsetsController.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = windowInsetsController.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void e(boolean z2) {
            Window window = this.f18821c;
            WindowInsetsController windowInsetsController = this.f18819a;
            if (z2) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                }
                windowInsetsController.setSystemBarsAppearance(16, 16);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
            }
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void f(boolean z2) {
            Window window = this.f18821c;
            WindowInsetsController windowInsetsController = this.f18819a;
            if (z2) {
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                }
                windowInsetsController.setSystemBarsAppearance(8, 8);
                return;
            }
            if (window != null) {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
            }
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void g(int i2) {
            this.f18819a.setSystemBarsBehavior(i2);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public final void h(int i2) {
            if ((i2 & 8) != 0) {
                this.f18820b.b();
            }
            this.f18819a.show(i2 & (-9));
        }
    }

    /* loaded from: classes3.dex */
    public interface OnControllableInsetsChangedListener {
    }

    public WindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        this.f18816a = new Impl30(windowInsetsController, new SoftwareKeyboardControllerCompat(windowInsetsController));
    }

    public final int a() {
        return this.f18816a.a();
    }

    public final void b(int i2) {
        this.f18816a.b(i2);
    }

    public final boolean c() {
        return this.f18816a.c();
    }

    public final boolean d() {
        return this.f18816a.d();
    }

    public final void e(boolean z2) {
        this.f18816a.e(z2);
    }

    public final void f(boolean z2) {
        this.f18816a.f(z2);
    }

    public final void g(int i2) {
        this.f18816a.g(i2);
    }

    public final void h(int i2) {
        this.f18816a.h(i2);
    }

    public WindowInsetsControllerCompat(View view, Window window) {
        WindowInsetsController insetsController;
        SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat = new SoftwareKeyboardControllerCompat(view);
        if (Build.VERSION.SDK_INT >= 30) {
            insetsController = window.getInsetsController();
            Impl30 impl30 = new Impl30(insetsController, softwareKeyboardControllerCompat);
            impl30.f18821c = window;
            this.f18816a = impl30;
            return;
        }
        this.f18816a = new Impl20(window, softwareKeyboardControllerCompat);
    }
}

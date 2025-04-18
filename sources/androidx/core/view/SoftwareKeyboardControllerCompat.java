package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.RequiresApi;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class SoftwareKeyboardControllerCompat {

    /* renamed from: a, reason: collision with root package name */
    public final Impl20 f18729a;

    /* loaded from: classes2.dex */
    public static class Impl {
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Impl20 extends Impl {

        /* renamed from: a, reason: collision with root package name */
        public final View f18730a;

        public Impl20(View view) {
            this.f18730a = view;
        }

        public void a() {
            View view = this.f18730a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }

        public void b() {
            final View view;
            View view2 = this.f18730a;
            if (view2 == null) {
                return;
            }
            if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
                view2.requestFocus();
                view = view2;
            } else {
                view = view2.getRootView().findFocus();
            }
            if (view == null) {
                view = view2.getRootView().findViewById(R.id.content);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new Runnable() { // from class: androidx.core.view.e
                @Override // java.lang.Runnable
                public final void run() {
                    View view3 = view;
                    ((InputMethodManager) view3.getContext().getSystemService("input_method")).showSoftInput(view3, 0);
                }
            });
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Impl30 extends Impl20 {

        /* renamed from: b, reason: collision with root package name */
        public View f18731b;

        /* renamed from: c, reason: collision with root package name */
        public WindowInsetsController f18732c;

        /* JADX WARN: Type inference failed for: r4v0, types: [androidx.core.view.f] */
        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20
        public final void a() {
            int ime;
            View view = this.f18731b;
            WindowInsetsController windowInsetsController = this.f18732c;
            if (windowInsetsController == null) {
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r4 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.f
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i2) {
                    atomicBoolean.set((i2 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r4);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r4);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20
        public final void b() {
            int ime;
            View view = this.f18731b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f18732c;
            if (windowInsetsController == null) {
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
            }
            super.b();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.core.view.SoftwareKeyboardControllerCompat$Impl20, androidx.core.view.SoftwareKeyboardControllerCompat$Impl30] */
    public SoftwareKeyboardControllerCompat(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            ?? impl20 = new Impl20(view);
            impl20.f18731b = view;
            this.f18729a = impl20;
            return;
        }
        this.f18729a = new Impl20(view);
    }

    public final void a() {
        this.f18729a.a();
    }

    public final void b() {
        this.f18729a.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.core.view.SoftwareKeyboardControllerCompat$Impl20, androidx.core.view.SoftwareKeyboardControllerCompat$Impl30] */
    public SoftwareKeyboardControllerCompat(WindowInsetsController windowInsetsController) {
        ?? impl20 = new Impl20(null);
        impl20.f18732c = windowInsetsController;
        this.f18729a = impl20;
    }
}

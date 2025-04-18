package n0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g0 extends e0 {

    /* renamed from: f, reason: collision with root package name */
    public final View f22275f;

    /* renamed from: g, reason: collision with root package name */
    public final WindowInsetsController f22276g;

    public g0(View view) {
        super(view);
        this.f22275f = view;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [n0.f0] */
    @Override // n0.e0, ac.e
    public final void o() {
        int ime;
        View view = this.f22275f;
        WindowInsetsController windowInsetsController = this.f22276g;
        if (windowInsetsController == null) {
            if (view != null) {
                windowInsetsController = view.getWindowInsetsController();
            } else {
                windowInsetsController = null;
            }
        }
        if (windowInsetsController != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: n0.f0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    boolean z10;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    if ((i10 & 8) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    atomicBoolean2.set(z10);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(r42);
            if (!atomicBoolean.get() && view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(r42);
            ime = WindowInsets.Type.ime();
            windowInsetsController.hide(ime);
            return;
        }
        super.o();
    }

    @Override // n0.e0, ac.e
    public final void u() {
        int ime;
        View view = this.f22275f;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f22276g;
        if (windowInsetsController == null) {
            if (view != null) {
                windowInsetsController = view.getWindowInsetsController();
            } else {
                windowInsetsController = null;
            }
        }
        if (windowInsetsController != null) {
            ime = WindowInsets.Type.ime();
            windowInsetsController.show(ime);
        } else {
            super.u();
        }
    }

    public g0(WindowInsetsController windowInsetsController) {
        super(null);
        this.f22276g = windowInsetsController;
    }
}

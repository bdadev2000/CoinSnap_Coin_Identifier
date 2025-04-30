package T;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;
import n1.C2475f;

/* loaded from: classes.dex */
public final class D extends C2475f {

    /* renamed from: f, reason: collision with root package name */
    public View f2854f;

    /* renamed from: g, reason: collision with root package name */
    public WindowInsetsController f2855g;

    /* JADX WARN: Type inference failed for: r4v0, types: [T.C] */
    @Override // n1.C2475f
    public final void r() {
        int ime;
        WindowInsetsController windowInsetsController = this.f2855g;
        View view = this.f2854f;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ?? r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: T.C
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i9) {
                    boolean z8;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    if ((i9 & 8) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    atomicBoolean2.set(z8);
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
        super.r();
    }

    @Override // n1.C2475f
    public final void x() {
        int ime;
        View view = this.f2854f;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f2855g;
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
        }
        super.x();
    }
}

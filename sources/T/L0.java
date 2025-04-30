package T;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.d f2869a;

    public L0(WindowInsetsController windowInsetsController) {
        this.f2869a = new K0(windowInsetsController, new E1.c(windowInsetsController));
    }

    public L0(Window window, View view) {
        WindowInsetsController insetsController;
        E1.c cVar = new E1.c(view);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            insetsController = window.getInsetsController();
            K0 k02 = new K0(insetsController, cVar);
            k02.f2868n = window;
            this.f2869a = k02;
            return;
        }
        if (i9 >= 26) {
            this.f2869a = new H0(window, cVar);
        } else {
            this.f2869a = new H0(window, cVar);
        }
    }
}

package n0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class w2 {
    public final ka.e a;

    public w2(WindowInsetsController windowInsetsController) {
        this.a = new v2(windowInsetsController, new fb.c(windowInsetsController));
    }

    public w2(Window window, View view) {
        fb.c cVar = new fb.c(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.a = new v2(window, cVar);
        } else if (i10 >= 26) {
            this.a = new u2(window, cVar);
        } else {
            this.a = new t2(window, cVar);
        }
    }
}

package h;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import kotlin.time.DurationKt;

/* loaded from: classes.dex */
public abstract class z {
    public static OnBackInvokedDispatcher a(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h.y, android.window.OnBackInvokedCallback] */
    public static OnBackInvokedCallback b(Object obj, final g0 g0Var) {
        Objects.requireNonNull(g0Var);
        ?? r02 = new OnBackInvokedCallback() { // from class: h.y
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                g0.this.E();
            }
        };
        androidx.activity.j.m(obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, r02);
        return r02;
    }

    public static void c(Object obj, Object obj2) {
        androidx.activity.j.m(obj).unregisterOnBackInvokedCallback(androidx.activity.j.j(obj2));
    }
}

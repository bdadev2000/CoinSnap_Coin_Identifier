package f;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f20230a = new Object();

    public final OnBackInvokedCallback a(F7.a aVar) {
        G7.j.e(aVar, "onBackInvoked");
        return new M3.d(aVar, 1);
    }

    public final void b(Object obj, int i9, Object obj2) {
        G7.j.e(obj, "dispatcher");
        G7.j.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i9, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        G7.j.e(obj, "dispatcher");
        G7.j.e(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}

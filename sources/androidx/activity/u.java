package androidx.activity;

import android.window.OnBackInvokedCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u {
    public static final u a = new u();

    public final OnBackInvokedCallback a(Function0<Unit> onBackInvoked) {
        Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
        return new t(onBackInvoked, 0);
    }

    public final void b(Object dispatcher, int i10, Object callback) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(callback, "callback");
        j.m(dispatcher).registerOnBackInvokedCallback(i10, j.j(callback));
    }

    public final void c(Object dispatcher, Object callback) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(callback, "callback");
        j.m(dispatcher).unregisterOnBackInvokedCallback(j.j(callback));
    }
}

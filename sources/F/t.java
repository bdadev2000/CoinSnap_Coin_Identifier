package f;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f20234a = new Object();

    public final OnBackInvokedCallback a(F7.l lVar, F7.l lVar2, F7.a aVar, F7.a aVar2) {
        G7.j.e(lVar, "onBackStarted");
        G7.j.e(lVar2, "onBackProgressed");
        G7.j.e(aVar, "onBackInvoked");
        G7.j.e(aVar2, "onBackCancelled");
        return new s(lVar, lVar2, aVar, aVar2);
    }
}

package com.vungle.ads.internal.network;

import androidx.core.app.NotificationCompat;
import i8.I;
import i8.InterfaceC2373j;
import i8.InterfaceC2374k;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class g implements InterfaceC2374k {
    final /* synthetic */ InterfaceC2100b $callback;
    final /* synthetic */ h this$0;

    public g(h hVar, InterfaceC2100b interfaceC2100b) {
        this.this$0 = hVar;
        this.$callback = interfaceC2100b;
    }

    private final void callFailure(Throwable th) {
        try {
            this.$callback.onFailure(this.this$0, th);
        } catch (Throwable th2) {
            h.Companion.throwIfFatal(th2);
            com.vungle.ads.internal.util.v.Companion.e("OkHttpCall", "Cannot pass failure to callback", th2);
        }
    }

    @Override // i8.InterfaceC2374k
    public void onFailure(InterfaceC2373j interfaceC2373j, IOException iOException) {
        G7.j.e(interfaceC2373j, NotificationCompat.CATEGORY_CALL);
        G7.j.e(iOException, "e");
        callFailure(iOException);
    }

    @Override // i8.InterfaceC2374k
    public void onResponse(InterfaceC2373j interfaceC2373j, I i9) {
        G7.j.e(interfaceC2373j, NotificationCompat.CATEGORY_CALL);
        G7.j.e(i9, "response");
        try {
            try {
                this.$callback.onResponse(this.this$0, this.this$0.parseResponse(i9));
            } catch (Throwable th) {
                h.Companion.throwIfFatal(th);
                com.vungle.ads.internal.util.v.Companion.e("OkHttpCall", "Cannot pass response to callback", th);
            }
        } catch (Throwable th2) {
            h.Companion.throwIfFatal(th2);
            callFailure(th2);
        }
    }
}

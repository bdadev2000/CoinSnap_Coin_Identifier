package com.vungle.ads.internal.network;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import wh.u0;

/* loaded from: classes4.dex */
public final class g implements wh.l {
    final /* synthetic */ b $callback;
    final /* synthetic */ h this$0;

    public g(h hVar, b bVar) {
        this.this$0 = hVar;
        this.$callback = bVar;
    }

    private final void callFailure(Throwable th2) {
        try {
            this.$callback.onFailure(this.this$0, th2);
        } catch (Throwable th3) {
            h.Companion.throwIfFatal(th3);
            com.vungle.ads.internal.util.v.Companion.e("OkHttpCall", "Cannot pass failure to callback", th3);
        }
    }

    @Override // wh.l
    public void onFailure(wh.k call, IOException e2) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e2, "e");
        callFailure(e2);
    }

    @Override // wh.l
    public void onResponse(wh.k call, u0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            try {
                this.$callback.onResponse(this.this$0, this.this$0.parseResponse(response));
            } catch (Throwable th2) {
                h.Companion.throwIfFatal(th2);
                com.vungle.ads.internal.util.v.Companion.e("OkHttpCall", "Cannot pass response to callback", th2);
            }
        } catch (Throwable th3) {
            h.Companion.throwIfFatal(th3);
            callFailure(th3);
        }
    }
}

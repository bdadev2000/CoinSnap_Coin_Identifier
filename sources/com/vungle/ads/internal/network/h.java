package com.vungle.ads.internal.network;

import java.io.IOException;
import java.util.Objects;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import wh.g0;
import wh.t0;
import wh.u0;
import wh.x0;
import wh.y0;

/* loaded from: classes4.dex */
public final class h implements a {
    public static final c Companion = new c(null);
    private static final String TAG = "OkHttpCall";
    private volatile boolean canceled;
    private final wh.k rawCall;
    private final ch.a responseConverter;

    public h(wh.k rawCall, ch.a responseConverter) {
        Intrinsics.checkNotNullParameter(rawCall, "rawCall");
        Intrinsics.checkNotNullParameter(responseConverter, "responseConverter");
        this.rawCall = rawCall;
        this.responseConverter = responseConverter;
    }

    private final y0 buffer(y0 y0Var) throws IOException {
        ki.i iVar = new ki.i();
        y0Var.source().l(iVar);
        x0 x0Var = y0.Companion;
        g0 contentType = y0Var.contentType();
        long contentLength = y0Var.contentLength();
        x0Var.getClass();
        return x0.b(iVar, contentType, contentLength);
    }

    @Override // com.vungle.ads.internal.network.a
    public void cancel() {
        wh.k kVar;
        this.canceled = true;
        synchronized (this) {
            kVar = this.rawCall;
            Unit unit = Unit.INSTANCE;
        }
        ((bi.i) kVar).cancel();
    }

    @Override // com.vungle.ads.internal.network.a
    public void enqueue(b callback) {
        wh.k kVar;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            kVar = this.rawCall;
            Unit unit = Unit.INSTANCE;
        }
        if (this.canceled) {
            ((bi.i) kVar).cancel();
        }
        ((bi.i) kVar).d(new g(this, callback));
    }

    @Override // com.vungle.ads.internal.network.a
    public j execute() throws IOException {
        wh.k kVar;
        synchronized (this) {
            kVar = this.rawCall;
            Unit unit = Unit.INSTANCE;
        }
        if (this.canceled) {
            ((bi.i) kVar).cancel();
        }
        return parseResponse(((bi.i) kVar).e());
    }

    @Override // com.vungle.ads.internal.network.a
    public boolean isCanceled() {
        boolean z10;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            z10 = ((bi.i) this.rawCall).f2482r;
        }
        return z10;
    }

    public final j parseResponse(u0 rawResp) throws IOException {
        Intrinsics.checkNotNullParameter(rawResp, "rawResp");
        y0 y0Var = rawResp.f27219i;
        if (y0Var == null) {
            return null;
        }
        t0 t0Var = new t0(rawResp);
        t0Var.f27205g = new f(y0Var.contentType(), y0Var.contentLength());
        u0 a = t0Var.a();
        int i10 = a.f27216f;
        if (i10 >= 200 && i10 < 300) {
            if (i10 != 204 && i10 != 205) {
                e eVar = new e(y0Var);
                try {
                    return j.Companion.success(this.responseConverter.convert(eVar), a);
                } catch (RuntimeException e2) {
                    eVar.throwIfCaught();
                    throw e2;
                }
            }
            y0Var.close();
            return j.Companion.success(null, a);
        }
        try {
            j error = j.Companion.error(buffer(y0Var), a);
            CloseableKt.closeFinally(y0Var, null);
            return error;
        } finally {
        }
    }
}

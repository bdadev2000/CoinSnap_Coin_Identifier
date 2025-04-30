package com.vungle.ads.internal.network;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import d7.InterfaceC2194a;
import i8.H;
import i8.I;
import i8.InterfaceC2373j;
import i8.L;
import i8.M;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class h implements InterfaceC2099a {
    public static final c Companion = new c(null);
    private static final String TAG = "OkHttpCall";
    private volatile boolean canceled;
    private final InterfaceC2373j rawCall;
    private final InterfaceC2194a responseConverter;

    public h(InterfaceC2373j interfaceC2373j, InterfaceC2194a interfaceC2194a) {
        G7.j.e(interfaceC2373j, "rawCall");
        G7.j.e(interfaceC2194a, "responseConverter");
        this.rawCall = interfaceC2373j;
        this.responseConverter = interfaceC2194a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w8.h, w8.f] */
    private final M buffer(M m) throws IOException {
        ?? obj = new Object();
        m.source().f(obj);
        L l = M.Companion;
        i8.x contentType = m.contentType();
        long contentLength = m.contentLength();
        l.getClass();
        return L.b(obj, contentType, contentLength);
    }

    @Override // com.vungle.ads.internal.network.InterfaceC2099a
    public void cancel() {
        InterfaceC2373j interfaceC2373j;
        this.canceled = true;
        synchronized (this) {
            interfaceC2373j = this.rawCall;
        }
        ((m8.i) interfaceC2373j).cancel();
    }

    @Override // com.vungle.ads.internal.network.InterfaceC2099a
    public void enqueue(InterfaceC2100b interfaceC2100b) {
        InterfaceC2373j interfaceC2373j;
        G7.j.e(interfaceC2100b, "callback");
        synchronized (this) {
            interfaceC2373j = this.rawCall;
        }
        if (this.canceled) {
            ((m8.i) interfaceC2373j).cancel();
        }
        FirebasePerfOkHttpClient.enqueue(interfaceC2373j, new g(this, interfaceC2100b));
    }

    @Override // com.vungle.ads.internal.network.InterfaceC2099a
    public j execute() throws IOException {
        InterfaceC2373j interfaceC2373j;
        synchronized (this) {
            interfaceC2373j = this.rawCall;
        }
        if (this.canceled) {
            ((m8.i) interfaceC2373j).cancel();
        }
        return parseResponse(FirebasePerfOkHttpClient.execute(interfaceC2373j));
    }

    @Override // com.vungle.ads.internal.network.InterfaceC2099a
    public boolean isCanceled() {
        boolean z8;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            z8 = ((m8.i) this.rawCall).f21795r;
        }
        return z8;
    }

    public final j parseResponse(I i9) throws IOException {
        G7.j.e(i9, "rawResp");
        M m = i9.f20779i;
        if (m == null) {
            return null;
        }
        H h6 = i9.h();
        h6.f20769g = new f(m.contentType(), m.contentLength());
        I a6 = h6.a();
        int i10 = a6.f20776f;
        if (i10 >= 200 && i10 < 300) {
            if (i10 != 204 && i10 != 205) {
                e eVar = new e(m);
                try {
                    return j.Companion.success(this.responseConverter.convert(eVar), a6);
                } catch (RuntimeException e4) {
                    eVar.throwIfCaught();
                    throw e4;
                }
            }
            m.close();
            return j.Companion.success(null, a6);
        }
        try {
            j error = j.Companion.error(buffer(m), a6);
            android.support.v4.media.session.a.f(m, null);
            return error;
        } finally {
        }
    }
}

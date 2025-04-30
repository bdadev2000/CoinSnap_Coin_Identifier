package com.pgl.ssdk;

import android.os.HandlerThread;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class L {

    /* renamed from: a, reason: collision with root package name */
    private final O<M> f19546a;
    private P b;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final L f19547a = new L();
    }

    public static L a() {
        return b.f19547a;
    }

    public P b() {
        if (this.b == null) {
            synchronized (L.class) {
                try {
                    if (this.b == null) {
                        this.b = a("ssdk_net_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.b;
    }

    public P c() {
        if (this.b == null) {
            synchronized (L.class) {
                try {
                    if (this.b == null) {
                        this.b = a("ssdk_handler");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.b;
    }

    private L() {
        this.f19546a = O.a(2);
    }

    public P a(String str) {
        M a6 = this.f19546a.a();
        if (a6 != null) {
            a6.f19549a = new WeakReference<>(null);
            a6.a(str);
            return a6;
        }
        if (!G.b().a()) {
            try {
                HandlerThread handlerThread = new HandlerThread(str);
                handlerThread.start();
                return new M(handlerThread, null);
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}

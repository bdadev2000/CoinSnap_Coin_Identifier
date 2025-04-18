package com.pgl.ssdk;

import android.os.HandlerThread;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class M {
    private final P<N> a;

    /* renamed from: b, reason: collision with root package name */
    private Q f16526b;

    /* loaded from: classes4.dex */
    public static class b {
        private static final M a = new M();
    }

    public static M a() {
        return b.a;
    }

    public Q b() {
        if (this.f16526b == null) {
            synchronized (M.class) {
                if (this.f16526b == null) {
                    this.f16526b = a("ssdk_net_handler");
                }
            }
        }
        return this.f16526b;
    }

    public Q c() {
        if (this.f16526b == null) {
            synchronized (M.class) {
                if (this.f16526b == null) {
                    this.f16526b = a("ssdk_handler");
                }
            }
        }
        return this.f16526b;
    }

    private M() {
        this.a = P.a(2);
    }

    public Q a(String str) {
        N a10 = this.a.a();
        if (a10 != null) {
            a10.a = new WeakReference<>(null);
            a10.a(str);
            return a10;
        }
        if (!H.b().a()) {
            try {
                HandlerThread handlerThread = new HandlerThread(str);
                handlerThread.start();
                return new N(handlerThread, null);
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}

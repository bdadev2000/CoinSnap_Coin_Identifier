package com.mbridge.msdk.tracker.network;

/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18183a = "m";
    private static volatile m b;

    /* renamed from: c, reason: collision with root package name */
    private v f18184c;

    private m() {
    }

    public static m a() {
        if (b == null) {
            synchronized (m.class) {
                try {
                    if (b == null) {
                        b = new m();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final v b() {
        if (this.f18184c == null) {
            v a6 = com.mbridge.msdk.tracker.network.toolbox.n.a(new com.mbridge.msdk.tracker.network.toolbox.b(new com.mbridge.msdk.tracker.network.toolbox.k()), null, 10, new com.mbridge.msdk.tracker.network.toolbox.j());
            this.f18184c = a6;
            a6.a();
        }
        return this.f18184c;
    }
}

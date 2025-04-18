package com.mbridge.msdk.tracker.network;

/* loaded from: classes4.dex */
public class m {
    private static final String a = "m";

    /* renamed from: b, reason: collision with root package name */
    private static volatile m f15441b;

    /* renamed from: c, reason: collision with root package name */
    private v f15442c;

    private m() {
    }

    public static m a() {
        if (f15441b == null) {
            synchronized (m.class) {
                if (f15441b == null) {
                    f15441b = new m();
                }
            }
        }
        return f15441b;
    }

    public final v b() {
        if (this.f15442c == null) {
            v a10 = com.mbridge.msdk.tracker.network.toolbox.n.a(new com.mbridge.msdk.tracker.network.toolbox.b(new com.mbridge.msdk.tracker.network.toolbox.k()), null, 10, new com.mbridge.msdk.tracker.network.toolbox.j());
            this.f15442c = a10;
            a10.a();
        }
        return this.f15442c;
    }
}

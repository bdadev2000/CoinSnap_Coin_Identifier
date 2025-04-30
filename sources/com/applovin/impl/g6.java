package com.applovin.impl;

import android.content.Context;
import android.util.SparseArray;
import com.applovin.impl.g5;
import com.applovin.impl.t5;
import com.applovin.impl.yh;

/* loaded from: classes.dex */
public final class g6 implements yd {

    /* renamed from: a, reason: collision with root package name */
    private final g5.a f7785a;
    private final SparseArray b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f7786c;

    /* renamed from: d, reason: collision with root package name */
    private long f7787d;

    /* renamed from: e, reason: collision with root package name */
    private long f7788e;

    /* renamed from: f, reason: collision with root package name */
    private long f7789f;

    /* renamed from: g, reason: collision with root package name */
    private float f7790g;

    /* renamed from: h, reason: collision with root package name */
    private float f7791h;

    public g6(Context context, m8 m8Var) {
        this(new t5.a(context), m8Var);
    }

    private static SparseArray a(g5.a aVar, m8 m8Var) {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, (yd) Class.forName("com.applovin.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(yd.class).getConstructor(g5.a.class).newInstance(aVar));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (yd) Class.forName("com.applovin.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(yd.class).getConstructor(g5.a.class).newInstance(aVar));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (yd) Class.forName("com.applovin.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(yd.class).getConstructor(g5.a.class).newInstance(aVar));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (yd) Class.forName("com.applovin.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(yd.class).getConstructor(null).newInstance(null));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new yh.b(aVar, m8Var));
        return sparseArray;
    }

    public g6(g5.a aVar, m8 m8Var) {
        this.f7785a = aVar;
        SparseArray a6 = a(aVar, m8Var);
        this.b = a6;
        this.f7786c = new int[a6.size()];
        for (int i9 = 0; i9 < this.b.size(); i9++) {
            this.f7786c[i9] = this.b.keyAt(i9);
        }
        this.f7787d = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f7788e = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f7789f = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f7790g = -3.4028235E38f;
        this.f7791h = -3.4028235E38f;
    }
}

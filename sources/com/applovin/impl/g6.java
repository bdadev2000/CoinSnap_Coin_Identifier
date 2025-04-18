package com.applovin.impl;

import android.content.Context;
import android.util.SparseArray;
import com.applovin.impl.g5;
import com.applovin.impl.t5;
import com.applovin.impl.yh;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class g6 implements yd {
    private final g5.a a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f4843b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f4844c;

    /* renamed from: d, reason: collision with root package name */
    private long f4845d;

    /* renamed from: e, reason: collision with root package name */
    private long f4846e;

    /* renamed from: f, reason: collision with root package name */
    private long f4847f;

    /* renamed from: g, reason: collision with root package name */
    private float f4848g;

    /* renamed from: h, reason: collision with root package name */
    private float f4849h;

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
            sparseArray.put(3, (yd) Class.forName("com.applovin.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(yd.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new yh.b(aVar, m8Var));
        return sparseArray;
    }

    public g6(g5.a aVar, m8 m8Var) {
        this.a = aVar;
        SparseArray a = a(aVar, m8Var);
        this.f4843b = a;
        this.f4844c = new int[a.size()];
        for (int i10 = 0; i10 < this.f4843b.size(); i10++) {
            this.f4844c[i10] = this.f4843b.keyAt(i10);
        }
        this.f4845d = C.TIME_UNSET;
        this.f4846e = C.TIME_UNSET;
        this.f4847f = C.TIME_UNSET;
        this.f4848g = -3.4028235E38f;
        this.f4849h = -3.4028235E38f;
    }
}

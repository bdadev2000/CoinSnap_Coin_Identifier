package com.applovin.impl;

import android.content.Context;
import android.util.SparseArray;
import com.applovin.impl.bi;
import com.applovin.impl.i5;
import com.applovin.impl.v5;

/* loaded from: classes.dex */
public final class i6 implements de {

    /* renamed from: a, reason: collision with root package name */
    private final i5.a f24423a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f24424b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f24425c;
    private long d;
    private long e;

    /* renamed from: f, reason: collision with root package name */
    private long f24426f;

    /* renamed from: g, reason: collision with root package name */
    private float f24427g;

    /* renamed from: h, reason: collision with root package name */
    private float f24428h;

    public i6(Context context, o8 o8Var) {
        this(new v5.a(context), o8Var);
    }

    private static SparseArray a(i5.a aVar, o8 o8Var) {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, (de) Class.forName("com.applovin.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(de.class).getConstructor(i5.a.class).newInstance(aVar));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (de) Class.forName("com.applovin.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(de.class).getConstructor(i5.a.class).newInstance(aVar));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (de) Class.forName("com.applovin.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(de.class).getConstructor(i5.a.class).newInstance(aVar));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (de) Class.forName("com.applovin.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(de.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new bi.b(aVar, o8Var));
        return sparseArray;
    }

    public i6(i5.a aVar, o8 o8Var) {
        this.f24423a = aVar;
        SparseArray a2 = a(aVar, o8Var);
        this.f24424b = a2;
        this.f24425c = new int[a2.size()];
        for (int i2 = 0; i2 < this.f24424b.size(); i2++) {
            this.f24425c[i2] = this.f24424b.keyAt(i2);
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f24426f = -9223372036854775807L;
        this.f24427g = -3.4028235E38f;
        this.f24428h = -3.4028235E38f;
    }
}

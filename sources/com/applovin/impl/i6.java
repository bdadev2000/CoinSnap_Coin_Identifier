package com.applovin.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.applovin.impl.q5;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i6 implements oi {
    private final Context a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5253d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5255f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5256g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5257h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5258i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f5259j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f5260k;

    /* renamed from: b, reason: collision with root package name */
    private int f5251b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f5252c = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;

    /* renamed from: e, reason: collision with root package name */
    private hd f5254e = hd.a;

    public i6(Context context) {
        this.a = context;
    }

    public void a(Context context, Handler handler, int i10, ArrayList arrayList) {
    }

    public void a(Context context, int i10, hd hdVar, boolean z10, q1 q1Var, Handler handler, p1 p1Var, ArrayList arrayList) {
        int i11;
        dd ddVar = new dd(context, hdVar, z10, handler, p1Var, q1Var);
        ddVar.a(this.f5255f);
        ddVar.b(this.f5256g);
        ddVar.c(this.f5257h);
        arrayList.add(ddVar);
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (li) Class.forName("com.applovin.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, p1.class, q1.class).newInstance(handler, p1Var, q1Var));
                    kc.c("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                    try {
                        int i12 = i11 + 1;
                        arrayList.add(i11, (li) Class.forName("com.applovin.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, p1.class, q1.class).newInstance(handler, p1Var, q1Var));
                        kc.c("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused2) {
                    }
                    try {
                        arrayList.add(i12, (li) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, p1.class, q1.class).newInstance(handler, p1Var, q1Var));
                        kc.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        return;
                    } catch (Exception e2) {
                        throw new RuntimeException("Error instantiating FFmpeg extension", e2);
                    }
                }
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating Opus extension", e10);
            }
        } catch (ClassNotFoundException unused4) {
        }
        try {
            int i122 = i11 + 1;
            try {
                arrayList.add(i11, (li) Class.forName("com.applovin.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, p1.class, q1.class).newInstance(handler, p1Var, q1Var));
                kc.c("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
                i11 = i122;
                i122 = i11;
                arrayList.add(i122, (li) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, p1.class, q1.class).newInstance(handler, p1Var, q1Var));
                kc.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            }
            arrayList.add(i122, (li) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, p1.class, q1.class).newInstance(handler, p1Var, q1Var));
            kc.c("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating FLAC extension", e11);
        }
    }

    public void a(Context context, int i10, ArrayList arrayList) {
        arrayList.add(new u2());
    }

    public void a(Context context, af afVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new bf(afVar, looper));
    }

    public void a(Context context, bo boVar, Looper looper, int i10, ArrayList arrayList) {
        arrayList.add(new co(boVar, looper));
    }

    public void a(Context context, int i10, hd hdVar, boolean z10, Handler handler, xq xqVar, long j3, ArrayList arrayList) {
        int i11;
        kd kdVar = new kd(context, hdVar, j3, z10, handler, xqVar, 50);
        kdVar.a(this.f5255f);
        kdVar.b(this.f5256g);
        kdVar.c(this.f5257h);
        arrayList.add(kdVar);
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating VP9 extension", e2);
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            arrayList.add(size, (li) Class.forName("com.applovin.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, xq.class, Integer.TYPE).newInstance(Long.valueOf(j3), handler, xqVar, 50));
            kc.c("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
        } catch (ClassNotFoundException unused2) {
            size = i11;
            i11 = size;
            try {
                int i12 = i11 + 1;
                arrayList.add(i11, (li) Class.forName("com.applovin.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, xq.class, Integer.TYPE).newInstance(Long.valueOf(j3), handler, xqVar, 50));
                kc.c("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused3) {
            }
            try {
                arrayList.add(i12, (li) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, xq.class, Integer.TYPE).newInstance(Long.valueOf(j3), handler, xqVar, 50));
                kc.c("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
            } catch (ClassNotFoundException unused4) {
                return;
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e10);
            }
        }
        try {
            int i122 = i11 + 1;
            try {
                arrayList.add(i11, (li) Class.forName("com.applovin.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, xq.class, Integer.TYPE).newInstance(Long.valueOf(j3), handler, xqVar, 50));
                kc.c("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused5) {
                i11 = i122;
                i122 = i11;
                arrayList.add(i122, (li) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, xq.class, Integer.TYPE).newInstance(Long.valueOf(j3), handler, xqVar, 50));
                kc.c("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
            }
            arrayList.add(i122, (li) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, xq.class, Integer.TYPE).newInstance(Long.valueOf(j3), handler, xqVar, 50));
            kc.c("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating AV1 extension", e11);
        }
    }

    @Override // com.applovin.impl.oi
    public li[] a(Handler handler, xq xqVar, p1 p1Var, bo boVar, af afVar) {
        ArrayList arrayList = new ArrayList();
        a(this.a, this.f5251b, this.f5254e, this.f5253d, handler, xqVar, this.f5252c, arrayList);
        q1 a = a(this.a, this.f5258i, this.f5259j, this.f5260k);
        if (a != null) {
            a(this.a, this.f5251b, this.f5254e, this.f5253d, a, handler, p1Var, arrayList);
        }
        a(this.a, boVar, handler.getLooper(), this.f5251b, arrayList);
        a(this.a, afVar, handler.getLooper(), this.f5251b, arrayList);
        a(this.a, this.f5251b, arrayList);
        a(this.a, handler, this.f5251b, arrayList);
        return (li[]) arrayList.toArray(new li[0]);
    }

    public q1 a(Context context, boolean z10, boolean z11, boolean z12) {
        return new q5(m1.a(context), new q5.d(new o1[0]), z10, z11, z12 ? 1 : 0);
    }
}

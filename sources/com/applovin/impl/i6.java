package com.applovin.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.applovin.impl.q5;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class i6 implements oi {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8215a;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8217d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8219f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8220g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8221h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8222i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8223j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8224k;
    private int b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f8216c = DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS;

    /* renamed from: e, reason: collision with root package name */
    private hd f8218e = hd.f8124a;

    public i6(Context context) {
        this.f8215a = context;
    }

    public void a(Context context, Handler handler, int i9, ArrayList arrayList) {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(8:11|12|13|14|15|16|17|18)|20|21|22|23|24|26|27) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:(3:8|9|10)|(8:11|12|13|14|15|16|17|18)|20|21|22|23|24|26|27) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b5, code lost:
    
        r2 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r18, int r19, com.applovin.impl.hd r20, boolean r21, com.applovin.impl.InterfaceC0740q1 r22, android.os.Handler r23, com.applovin.impl.InterfaceC0736p1 r24, java.util.ArrayList r25) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.i6.a(android.content.Context, int, com.applovin.impl.hd, boolean, com.applovin.impl.q1, android.os.Handler, com.applovin.impl.p1, java.util.ArrayList):void");
    }

    public void a(Context context, int i9, ArrayList arrayList) {
        arrayList.add(new C0764u2());
    }

    public void a(Context context, af afVar, Looper looper, int i9, ArrayList arrayList) {
        arrayList.add(new bf(afVar, looper));
    }

    public void a(Context context, bo boVar, Looper looper, int i9, ArrayList arrayList) {
        arrayList.add(new co(boVar, looper));
    }

    public void a(Context context, int i9, hd hdVar, boolean z8, Handler handler, xq xqVar, long j7, ArrayList arrayList) {
        Handler handler2;
        Class cls;
        String str;
        int i10;
        int i11;
        kd kdVar = new kd(context, hdVar, j7, z8, handler, xqVar, 50);
        kdVar.a(this.f8219f);
        kdVar.b(this.f8220g);
        kdVar.c(this.f8221h);
        arrayList.add(kdVar);
        if (i9 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i9 == 2) {
            size--;
        }
        try {
            try {
                handler2 = handler;
                cls = Handler.class;
                try {
                    i10 = size + 1;
                    try {
                        arrayList.add(size, (li) Class.forName("com.applovin.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, xq.class, Integer.TYPE).newInstance(Long.valueOf(j7), handler2, xqVar, 50));
                        str = "DefaultRenderersFactory";
                    } catch (ClassNotFoundException unused) {
                        str = "DefaultRenderersFactory";
                    }
                } catch (ClassNotFoundException unused2) {
                    str = "DefaultRenderersFactory";
                    i10 = size;
                    try {
                        i11 = i10 + 1;
                        arrayList.add(i10, (li) Class.forName("com.applovin.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, cls, xq.class, Integer.TYPE).newInstance(Long.valueOf(j7), handler2, xqVar, 50));
                        kc.c(str, "Loaded Libgav1VideoRenderer.");
                        arrayList.add(i11, (li) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegVideoRenderer").getConstructor(Long.TYPE, cls, xq.class, Integer.TYPE).newInstance(Long.valueOf(j7), handler2, xqVar, 50));
                        kc.c(str, "Loaded FfmpegVideoRenderer.");
                    } catch (Exception e4) {
                        throw new RuntimeException("Error instantiating AV1 extension", e4);
                    }
                }
                try {
                    kc.c(str, "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused3) {
                    size = i10;
                    i10 = size;
                    i11 = i10 + 1;
                    arrayList.add(i10, (li) Class.forName("com.applovin.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, cls, xq.class, Integer.TYPE).newInstance(Long.valueOf(j7), handler2, xqVar, 50));
                    kc.c(str, "Loaded Libgav1VideoRenderer.");
                    arrayList.add(i11, (li) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegVideoRenderer").getConstructor(Long.TYPE, cls, xq.class, Integer.TYPE).newInstance(Long.valueOf(j7), handler2, xqVar, 50));
                    kc.c(str, "Loaded FfmpegVideoRenderer.");
                }
            } catch (Exception e9) {
                throw new RuntimeException("Error instantiating VP9 extension", e9);
            }
        } catch (ClassNotFoundException unused4) {
            handler2 = handler;
            cls = Handler.class;
        }
        try {
            i11 = i10 + 1;
        } catch (ClassNotFoundException unused5) {
        }
        try {
            try {
                arrayList.add(i10, (li) Class.forName("com.applovin.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, cls, xq.class, Integer.TYPE).newInstance(Long.valueOf(j7), handler2, xqVar, 50));
                kc.c(str, "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused6) {
                i10 = i11;
                i11 = i10;
                arrayList.add(i11, (li) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegVideoRenderer").getConstructor(Long.TYPE, cls, xq.class, Integer.TYPE).newInstance(Long.valueOf(j7), handler2, xqVar, 50));
                kc.c(str, "Loaded FfmpegVideoRenderer.");
            }
            arrayList.add(i11, (li) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegVideoRenderer").getConstructor(Long.TYPE, cls, xq.class, Integer.TYPE).newInstance(Long.valueOf(j7), handler2, xqVar, 50));
            kc.c(str, "Loaded FfmpegVideoRenderer.");
        } catch (ClassNotFoundException unused7) {
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating FFmpeg extension", e10);
        }
    }

    @Override // com.applovin.impl.oi
    public li[] a(Handler handler, xq xqVar, InterfaceC0736p1 interfaceC0736p1, bo boVar, af afVar) {
        ArrayList arrayList = new ArrayList();
        a(this.f8215a, this.b, this.f8218e, this.f8217d, handler, xqVar, this.f8216c, arrayList);
        InterfaceC0740q1 a6 = a(this.f8215a, this.f8222i, this.f8223j, this.f8224k);
        if (a6 != null) {
            a(this.f8215a, this.b, this.f8218e, this.f8217d, a6, handler, interfaceC0736p1, arrayList);
        }
        a(this.f8215a, boVar, handler.getLooper(), this.b, arrayList);
        a(this.f8215a, afVar, handler.getLooper(), this.b, arrayList);
        a(this.f8215a, this.b, arrayList);
        a(this.f8215a, handler, this.b, arrayList);
        return (li[]) arrayList.toArray(new li[0]);
    }

    public InterfaceC0740q1 a(Context context, boolean z8, boolean z9, boolean z10) {
        return new q5(C0724m1.a(context), new q5.d(new InterfaceC0732o1[0]), z8, z9, z10 ? 1 : 0);
    }
}

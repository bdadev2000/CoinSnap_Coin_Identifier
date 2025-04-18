package com.applovin.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.applovin.impl.s5;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class k6 implements ti {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24815a;
    private boolean d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24818f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f24819g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f24820h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f24821i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f24822j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f24823k;

    /* renamed from: b, reason: collision with root package name */
    private int f24816b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f24817c = 5000;
    private md e = md.f25242a;

    public k6(Context context) {
        this.f24815a = context;
    }

    public void a(Context context, Handler handler, int i2, ArrayList arrayList) {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:5|(1:7)|8|9|10|11|12|13|14|(2:15|16)|18|19|20|21|22|24|25) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:(2:15|16)|18|19|20|21|22|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
    
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        r8 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r19, int r20, com.applovin.impl.md r21, boolean r22, com.applovin.impl.r1 r23, android.os.Handler r24, com.applovin.impl.q1 r25, java.util.ArrayList r26) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.k6.a(android.content.Context, int, com.applovin.impl.md, boolean, com.applovin.impl.r1, android.os.Handler, com.applovin.impl.q1, java.util.ArrayList):void");
    }

    public void a(Context context, int i2, ArrayList arrayList) {
        arrayList.add(new w2());
    }

    public void a(Context context, ff ffVar, Looper looper, int i2, ArrayList arrayList) {
        arrayList.add(new gf(ffVar, looper));
    }

    public void a(Context context, ao aoVar, Looper looper, int i2, ArrayList arrayList) {
        arrayList.add(new bo(aoVar, looper));
    }

    public void a(Context context, int i2, md mdVar, boolean z2, Handler handler, wq wqVar, long j2, ArrayList arrayList) {
        int i3;
        int i4;
        pd pdVar = new pd(context, mdVar, j2, z2, handler, wqVar, 50);
        pdVar.a(this.f24818f);
        pdVar.b(this.f24819g);
        pdVar.c(this.f24820h);
        arrayList.add(pdVar);
        if (i2 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i2 == 2) {
            size--;
        }
        try {
            try {
                i3 = size + 1;
            } catch (ClassNotFoundException unused) {
            }
            try {
                try {
                    arrayList.add(size, (qi) Class.forName("com.applovin.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, wq.class, Integer.TYPE).newInstance(Long.valueOf(j2), handler, wqVar, 50));
                    pc.c("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused2) {
                    size = i3;
                    i3 = size;
                    try {
                        i4 = i3 + 1;
                        arrayList.add(i3, (qi) Class.forName("com.applovin.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, wq.class, Integer.TYPE).newInstance(Long.valueOf(j2), handler, wqVar, 50));
                        pc.c("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                        arrayList.add(i4, (qi) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, wq.class, Integer.TYPE).newInstance(Long.valueOf(j2), handler, wqVar, 50));
                        pc.c("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating AV1 extension", e);
                    }
                }
                try {
                    arrayList.add(i3, (qi) Class.forName("com.applovin.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, wq.class, Integer.TYPE).newInstance(Long.valueOf(j2), handler, wqVar, 50));
                    pc.c("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i3 = i4;
                    i4 = i3;
                    arrayList.add(i4, (qi) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, wq.class, Integer.TYPE).newInstance(Long.valueOf(j2), handler, wqVar, 50));
                    pc.c("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                }
                arrayList.add(i4, (qi) Class.forName("com.applovin.exoplayer2.ext.ffmpeg.FfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, wq.class, Integer.TYPE).newInstance(Long.valueOf(j2), handler, wqVar, 50));
                pc.c("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
            } catch (ClassNotFoundException unused4) {
                return;
            } catch (Exception e2) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e2);
            }
            try {
                i4 = i3 + 1;
            } catch (ClassNotFoundException unused5) {
            }
        } catch (Exception e3) {
            throw new RuntimeException("Error instantiating VP9 extension", e3);
        }
    }

    @Override // com.applovin.impl.ti
    public qi[] a(Handler handler, wq wqVar, q1 q1Var, ao aoVar, ff ffVar) {
        ArrayList arrayList = new ArrayList();
        a(this.f24815a, this.f24816b, this.e, this.d, handler, wqVar, this.f24817c, arrayList);
        r1 a2 = a(this.f24815a, this.f24821i, this.f24822j, this.f24823k);
        if (a2 != null) {
            a(this.f24815a, this.f24816b, this.e, this.d, a2, handler, q1Var, arrayList);
        }
        a(this.f24815a, aoVar, handler.getLooper(), this.f24816b, arrayList);
        a(this.f24815a, ffVar, handler.getLooper(), this.f24816b, arrayList);
        a(this.f24815a, this.f24816b, arrayList);
        a(this.f24815a, handler, this.f24816b, arrayList);
        return (qi[]) arrayList.toArray(new qi[0]);
    }

    public r1 a(Context context, boolean z2, boolean z3, boolean z4) {
        return new s5(n1.a(context), new s5.d(new p1[0]), z2, z3, z4 ? 1 : 0);
    }
}

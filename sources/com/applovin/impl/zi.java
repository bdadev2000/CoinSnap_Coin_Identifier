package com.applovin.impl;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zi implements vq, InterfaceC0760t2 {

    /* renamed from: j, reason: collision with root package name */
    private int f12595j;

    /* renamed from: k, reason: collision with root package name */
    private SurfaceTexture f12596k;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f12597n;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f12588a = new AtomicBoolean();
    private final AtomicBoolean b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    private final bi f12589c = new bi();

    /* renamed from: d, reason: collision with root package name */
    private final i9 f12590d = new i9();

    /* renamed from: f, reason: collision with root package name */
    private final fo f12591f = new fo();

    /* renamed from: g, reason: collision with root package name */
    private final fo f12592g = new fo();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f12593h = new float[16];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f12594i = new float[16];
    private volatile int l = 0;
    private int m = -1;

    public SurfaceTexture b() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        z9.a();
        this.f12589c.a();
        z9.a();
        this.f12595j = z9.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f12595j);
        this.f12596k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.applovin.impl.E3
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                zi.this.a(surfaceTexture2);
            }
        });
        return this.f12596k;
    }

    public void a(float[] fArr, boolean z8) {
        GLES20.glClear(16384);
        z9.a();
        if (this.f12588a.compareAndSet(true, false)) {
            ((SurfaceTexture) AbstractC0669a1.a(this.f12596k)).updateTexImage();
            z9.a();
            if (this.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f12593h, 0);
            }
            long timestamp = this.f12596k.getTimestamp();
            Long l = (Long) this.f12591f.b(timestamp);
            if (l != null) {
                this.f12590d.a(this.f12593h, l.longValue());
            }
            zh zhVar = (zh) this.f12592g.c(timestamp);
            if (zhVar != null) {
                this.f12589c.b(zhVar);
            }
        }
        Matrix.multiplyMM(this.f12594i, 0, fArr, 0, this.f12593h, 0);
        this.f12589c.a(this.f12595j, this.f12594i, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        this.f12588a.set(true);
    }

    @Override // com.applovin.impl.InterfaceC0760t2
    public void a(long j7, float[] fArr) {
        this.f12590d.a(j7, fArr);
    }

    @Override // com.applovin.impl.InterfaceC0760t2
    public void a() {
        this.f12591f.a();
        this.f12590d.a();
        this.b.set(true);
    }

    @Override // com.applovin.impl.vq
    public void a(long j7, long j9, d9 d9Var, MediaFormat mediaFormat) {
        this.f12591f.a(j9, Long.valueOf(j7));
        a(d9Var.f7220w, d9Var.f7221x, j9);
    }

    public void a(int i9) {
        this.l = i9;
    }

    private void a(byte[] bArr, int i9, long j7) {
        byte[] bArr2 = this.f12597n;
        int i10 = this.m;
        this.f12597n = bArr;
        if (i9 == -1) {
            i9 = this.l;
        }
        this.m = i9;
        if (i10 == i9 && Arrays.equals(bArr2, this.f12597n)) {
            return;
        }
        byte[] bArr3 = this.f12597n;
        zh a6 = bArr3 != null ? ai.a(bArr3, this.m) : null;
        if (a6 == null || !bi.a(a6)) {
            a6 = zh.a(this.m);
        }
        this.f12592g.a(j7, a6);
    }
}

package com.applovin.impl;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class dj implements uq, v2 {

    /* renamed from: j, reason: collision with root package name */
    private int f23494j;

    /* renamed from: k, reason: collision with root package name */
    private SurfaceTexture f23495k;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f23498n;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f23487a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f23488b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    private final ei f23489c = new ei();
    private final k9 d = new k9();

    /* renamed from: f, reason: collision with root package name */
    private final eo f23490f = new eo();

    /* renamed from: g, reason: collision with root package name */
    private final eo f23491g = new eo();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f23492h = new float[16];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f23493i = new float[16];

    /* renamed from: l, reason: collision with root package name */
    private volatile int f23496l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f23497m = -1;

    public SurfaceTexture b() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        ba.a();
        this.f23489c.a();
        ba.a();
        this.f23494j = ba.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f23494j);
        this.f23495k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.applovin.impl.gt
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                dj.this.a(surfaceTexture2);
            }
        });
        return this.f23495k;
    }

    public void a(int i2) {
        this.f23496l = i2;
    }

    public void a(float[] fArr, boolean z2) {
        GLES20.glClear(16384);
        ba.a();
        if (this.f23487a.compareAndSet(true, false)) {
            ((SurfaceTexture) b1.a(this.f23495k)).updateTexImage();
            ba.a();
            if (this.f23488b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f23492h, 0);
            }
            long timestamp = this.f23495k.getTimestamp();
            Long l2 = (Long) this.f23490f.b(timestamp);
            if (l2 != null) {
                this.d.a(this.f23492h, l2.longValue());
            }
            ci ciVar = (ci) this.f23491g.c(timestamp);
            if (ciVar != null) {
                this.f23489c.b(ciVar);
            }
        }
        Matrix.multiplyMM(this.f23493i, 0, fArr, 0, this.f23492h, 0);
        this.f23489c.a(this.f23494j, this.f23493i, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        this.f23487a.set(true);
    }

    @Override // com.applovin.impl.v2
    public void a(long j2, float[] fArr) {
        this.d.a(j2, fArr);
    }

    @Override // com.applovin.impl.v2
    public void a() {
        this.f23490f.a();
        this.d.a();
        this.f23488b.set(true);
    }

    @Override // com.applovin.impl.uq
    public void a(long j2, long j3, f9 f9Var, MediaFormat mediaFormat) {
        this.f23490f.a(j3, Long.valueOf(j2));
        a(f9Var.w, f9Var.x, j3);
    }

    private void a(byte[] bArr, int i2, long j2) {
        byte[] bArr2 = this.f23498n;
        int i3 = this.f23497m;
        this.f23498n = bArr;
        if (i2 == -1) {
            i2 = this.f23496l;
        }
        this.f23497m = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.f23498n)) {
            return;
        }
        byte[] bArr3 = this.f23498n;
        ci a2 = bArr3 != null ? di.a(bArr3, this.f23497m) : null;
        if (a2 == null || !ei.a(a2)) {
            a2 = ci.a(this.f23497m);
        }
        this.f23491g.a(j2, a2);
    }
}

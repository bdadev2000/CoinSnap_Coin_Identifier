package com.applovin.impl;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.JsonLexerKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zi implements vq, t2 {

    /* renamed from: j, reason: collision with root package name */
    private int f9411j;

    /* renamed from: k, reason: collision with root package name */
    private SurfaceTexture f9412k;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f9415n;
    private final AtomicBoolean a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f9404b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    private final bi f9405c = new bi();

    /* renamed from: d, reason: collision with root package name */
    private final i9 f9406d = new i9();

    /* renamed from: f, reason: collision with root package name */
    private final fo f9407f = new fo();

    /* renamed from: g, reason: collision with root package name */
    private final fo f9408g = new fo();

    /* renamed from: h, reason: collision with root package name */
    private final float[] f9409h = new float[16];

    /* renamed from: i, reason: collision with root package name */
    private final float[] f9410i = new float[16];

    /* renamed from: l, reason: collision with root package name */
    private volatile int f9413l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f9414m = -1;

    public SurfaceTexture b() {
        GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
        z9.a();
        this.f9405c.a();
        z9.a();
        this.f9411j = z9.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f9411j);
        this.f9412k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.applovin.impl.nw
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                zi.this.a(surfaceTexture2);
            }
        });
        return this.f9412k;
    }

    public void a(float[] fArr, boolean z10) {
        GLES20.glClear(JsonLexerKt.BATCH_SIZE);
        z9.a();
        if (this.a.compareAndSet(true, false)) {
            ((SurfaceTexture) a1.a(this.f9412k)).updateTexImage();
            z9.a();
            if (this.f9404b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f9409h, 0);
            }
            long timestamp = this.f9412k.getTimestamp();
            Long l10 = (Long) this.f9407f.b(timestamp);
            if (l10 != null) {
                this.f9406d.a(this.f9409h, l10.longValue());
            }
            zh zhVar = (zh) this.f9408g.c(timestamp);
            if (zhVar != null) {
                this.f9405c.b(zhVar);
            }
        }
        Matrix.multiplyMM(this.f9410i, 0, fArr, 0, this.f9409h, 0);
        this.f9405c.a(this.f9411j, this.f9410i, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SurfaceTexture surfaceTexture) {
        this.a.set(true);
    }

    @Override // com.applovin.impl.t2
    public void a(long j3, float[] fArr) {
        this.f9406d.a(j3, fArr);
    }

    @Override // com.applovin.impl.t2
    public void a() {
        this.f9407f.a();
        this.f9406d.a();
        this.f9404b.set(true);
    }

    @Override // com.applovin.impl.vq
    public void a(long j3, long j10, d9 d9Var, MediaFormat mediaFormat) {
        this.f9407f.a(j10, Long.valueOf(j3));
        a(d9Var.f4237w, d9Var.f4238x, j10);
    }

    public void a(int i10) {
        this.f9413l = i10;
    }

    private void a(byte[] bArr, int i10, long j3) {
        byte[] bArr2 = this.f9415n;
        int i11 = this.f9414m;
        this.f9415n = bArr;
        if (i10 == -1) {
            i10 = this.f9413l;
        }
        this.f9414m = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f9415n)) {
            return;
        }
        byte[] bArr3 = this.f9415n;
        zh a = bArr3 != null ? ai.a(bArr3, this.f9414m) : null;
        if (a == null || !bi.a(a)) {
            a = zh.a(this.f9414m);
        }
        this.f9408g.a(j3, a);
    }
}

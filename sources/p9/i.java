package p9;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import n9.h0;
import n9.o;
import n9.x;
import o9.p;
import s7.r0;

/* loaded from: classes3.dex */
public final class i implements p, a {

    /* renamed from: k, reason: collision with root package name */
    public int f23527k;

    /* renamed from: l, reason: collision with root package name */
    public SurfaceTexture f23528l;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f23531o;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f23519b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f23520c = new AtomicBoolean(true);

    /* renamed from: d, reason: collision with root package name */
    public final g f23521d = new g();

    /* renamed from: f, reason: collision with root package name */
    public final h3.a f23522f = new h3.a();

    /* renamed from: g, reason: collision with root package name */
    public final androidx.activity.result.i f23523g = new androidx.activity.result.i();

    /* renamed from: h, reason: collision with root package name */
    public final androidx.activity.result.i f23524h = new androidx.activity.result.i();

    /* renamed from: i, reason: collision with root package name */
    public final float[] f23525i = new float[16];

    /* renamed from: j, reason: collision with root package name */
    public final float[] f23526j = new float[16];

    /* renamed from: m, reason: collision with root package name */
    public volatile int f23529m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f23530n = -1;

    @Override // o9.p
    public final void a(long j3, long j10, r0 r0Var, MediaFormat mediaFormat) {
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        boolean z10;
        this.f23523g.a(j10, Long.valueOf(j3));
        byte[] bArr = r0Var.f24732x;
        int i13 = r0Var.f24733y;
        byte[] bArr2 = this.f23531o;
        int i14 = this.f23530n;
        this.f23531o = bArr;
        if (i13 == -1) {
            i13 = this.f23529m;
        }
        this.f23530n = i13;
        if (i14 != i13 || !Arrays.equals(bArr2, this.f23531o)) {
            byte[] bArr3 = this.f23531o;
            f fVar = null;
            if (bArr3 != null) {
                int i15 = this.f23530n;
                x xVar = new x(bArr3);
                try {
                    xVar.H(4);
                    int f12 = xVar.f();
                    xVar.G(0);
                    if (f12 == 1886547818) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                if (z10) {
                    xVar.H(8);
                    int i16 = xVar.f22599b;
                    int i17 = xVar.f22600c;
                    while (i16 < i17) {
                        int f13 = xVar.f() + i16;
                        if (f13 <= i16 || f13 > i17) {
                            break;
                        }
                        int f14 = xVar.f();
                        if (f14 != 2037673328 && f14 != 1836279920) {
                            xVar.G(f13);
                            i16 = f13;
                        }
                        xVar.F(f13);
                        arrayList = c6.k.t(xVar);
                        break;
                    }
                    arrayList = null;
                } else {
                    arrayList = c6.k.t(xVar);
                }
                if (arrayList != null) {
                    int size = arrayList.size();
                    if (size != 1) {
                        if (size == 2) {
                            fVar = new f((e) arrayList.get(0), (e) arrayList.get(1), i15);
                        }
                    } else {
                        e eVar = (e) arrayList.get(0);
                        fVar = new f(eVar, eVar, i15);
                    }
                }
            }
            if (fVar == null || !g.b(fVar)) {
                int i18 = this.f23530n;
                float radians = (float) Math.toRadians(180.0f);
                float radians2 = (float) Math.toRadians(360.0f);
                float f15 = radians / 36;
                float f16 = radians2 / 72;
                float[] fArr = new float[15984];
                float[] fArr2 = new float[10656];
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                for (int i22 = 36; i19 < i22; i22 = 36) {
                    float f17 = radians / 2.0f;
                    float f18 = (i19 * f15) - f17;
                    int i23 = i19 + 1;
                    float f19 = (i23 * f15) - f17;
                    int i24 = 0;
                    while (i24 < 73) {
                        int i25 = i23;
                        int i26 = 0;
                        int i27 = 2;
                        while (i26 < i27) {
                            if (i26 == 0) {
                                f11 = f19;
                                f10 = f18;
                            } else {
                                f10 = f19;
                                f11 = f10;
                            }
                            float f20 = i24 * f16;
                            float f21 = f18;
                            int i28 = i20 + 1;
                            float f22 = f16;
                            double d10 = 50.0f;
                            int i29 = i24;
                            double d11 = (f20 + 3.1415927f) - (radians2 / 2.0f);
                            float f23 = f15;
                            double d12 = f10;
                            int i30 = i18;
                            int i31 = i26;
                            fArr[i20] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                            int i32 = i28 + 1;
                            fArr[i28] = (float) (Math.sin(d12) * d10);
                            int i33 = i32 + 1;
                            fArr[i32] = (float) (Math.cos(d12) * Math.cos(d11) * d10);
                            int i34 = i21 + 1;
                            fArr2[i21] = f20 / radians2;
                            int i35 = i34 + 1;
                            fArr2[i34] = ((i19 + i31) * f23) / radians;
                            if (i29 == 0 && i31 == 0) {
                                i10 = i29;
                                i11 = i31;
                            } else {
                                i10 = i29;
                                i11 = i31;
                                if (i10 != 72 || i11 != 1) {
                                    i12 = 2;
                                    i21 = i35;
                                    i20 = i33;
                                    i26 = i11 + 1;
                                    i24 = i10;
                                    i27 = i12;
                                    f19 = f11;
                                    f16 = f22;
                                    f18 = f21;
                                    f15 = f23;
                                    i18 = i30;
                                }
                            }
                            System.arraycopy(fArr, i33 - 3, fArr, i33, 3);
                            i33 += 3;
                            i12 = 2;
                            System.arraycopy(fArr2, i35 - 2, fArr2, i35, 2);
                            i35 += 2;
                            i21 = i35;
                            i20 = i33;
                            i26 = i11 + 1;
                            i24 = i10;
                            i27 = i12;
                            f19 = f11;
                            f16 = f22;
                            f18 = f21;
                            f15 = f23;
                            i18 = i30;
                        }
                        i24++;
                        i23 = i25;
                        f18 = f18;
                        i18 = i18;
                    }
                    i19 = i23;
                }
                e eVar2 = new e(new androidx.activity.result.i(0, fArr, fArr2, 1));
                fVar = new f(eVar2, eVar2, i18);
            }
            this.f23524h.a(j10, fVar);
        }
    }

    @Override // p9.a
    public final void b(long j3, float[] fArr) {
        ((androidx.activity.result.i) this.f23522f.f18725g).a(j3, fArr);
    }

    @Override // p9.a
    public final void c() {
        this.f23523g.c();
        h3.a aVar = this.f23522f;
        ((androidx.activity.result.i) aVar.f18725g).c();
        aVar.f18722c = false;
        this.f23520c.set(true);
    }

    public final SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            com.bumptech.glide.c.j();
            this.f23521d.a();
            com.bumptech.glide.c.j();
            com.bumptech.glide.c.k("No current context", !h0.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT));
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            com.bumptech.glide.c.j();
            int i10 = iArr[0];
            com.bumptech.glide.c.d(36197, i10);
            this.f23527k = i10;
        } catch (n9.i e2) {
            o.d("SceneRenderer", "Failed to initialize the renderer", e2);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f23527k);
        this.f23528l = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: p9.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i.this.f23519b.set(true);
            }
        });
        return this.f23528l;
    }
}

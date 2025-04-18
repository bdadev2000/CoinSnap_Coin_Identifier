package s7;

import android.media.MediaFormat;

/* loaded from: classes3.dex */
public final class g0 implements o9.p, p9.a, i2 {

    /* renamed from: b, reason: collision with root package name */
    public o9.p f24372b;

    /* renamed from: c, reason: collision with root package name */
    public p9.a f24373c;

    /* renamed from: d, reason: collision with root package name */
    public o9.p f24374d;

    /* renamed from: f, reason: collision with root package name */
    public p9.a f24375f;

    @Override // o9.p
    public final void a(long j3, long j10, r0 r0Var, MediaFormat mediaFormat) {
        o9.p pVar = this.f24374d;
        if (pVar != null) {
            pVar.a(j3, j10, r0Var, mediaFormat);
        }
        o9.p pVar2 = this.f24372b;
        if (pVar2 != null) {
            pVar2.a(j3, j10, r0Var, mediaFormat);
        }
    }

    @Override // p9.a
    public final void b(long j3, float[] fArr) {
        p9.a aVar = this.f24375f;
        if (aVar != null) {
            aVar.b(j3, fArr);
        }
        p9.a aVar2 = this.f24373c;
        if (aVar2 != null) {
            aVar2.b(j3, fArr);
        }
    }

    @Override // p9.a
    public final void c() {
        p9.a aVar = this.f24375f;
        if (aVar != null) {
            aVar.c();
        }
        p9.a aVar2 = this.f24373c;
        if (aVar2 != null) {
            aVar2.c();
        }
    }

    @Override // s7.i2
    public final void handleMessage(int i10, Object obj) {
        if (i10 != 7) {
            if (i10 != 8) {
                if (i10 == 10000) {
                    p9.k kVar = (p9.k) obj;
                    if (kVar == null) {
                        this.f24374d = null;
                        this.f24375f = null;
                        return;
                    } else {
                        this.f24374d = kVar.getVideoFrameMetadataListener();
                        this.f24375f = kVar.getCameraMotionListener();
                        return;
                    }
                }
                return;
            }
            this.f24373c = (p9.a) obj;
            return;
        }
        this.f24372b = (o9.p) obj;
    }
}

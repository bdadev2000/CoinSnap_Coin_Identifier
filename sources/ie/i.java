package ie;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import he.s;

/* loaded from: classes4.dex */
public final class i extends d {

    /* renamed from: f, reason: collision with root package name */
    public long f19611f;

    /* renamed from: g, reason: collision with root package name */
    public final long f19612g;

    /* renamed from: h, reason: collision with root package name */
    public final e f19613h;

    public i(long j3, d dVar) {
        super(0);
        this.f19612g = j3;
        this.f19613h = dVar;
    }

    @Override // ie.d, ie.e
    public final void e(s sVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.e(sVar, captureRequest, totalCaptureResult);
        if (!c() && System.currentTimeMillis() > this.f19611f + this.f19612g) {
            this.f19613h.a(sVar);
        }
    }

    @Override // ie.d, ie.e
    public final void i(b bVar) {
        this.f19611f = System.currentTimeMillis();
        super.i(bVar);
    }

    @Override // ie.d
    public final e o() {
        return this.f19613h;
    }
}

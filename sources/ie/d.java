package ie;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import he.s;

/* loaded from: classes4.dex */
public abstract class d extends e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19603e;

    @Override // ie.e
    public final void d(b bVar) {
        switch (this.f19603e) {
            case 0:
                o().d(bVar);
                return;
            default:
                return;
        }
    }

    @Override // ie.e
    public void e(s sVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.f19603e) {
            case 0:
                o().e(sVar, captureRequest, totalCaptureResult);
                return;
            default:
                return;
        }
    }

    @Override // ie.e
    public final void f(s sVar, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f19603e) {
            case 0:
                o().f(sVar, captureRequest, captureResult);
                return;
            default:
                return;
        }
    }

    @Override // ie.e
    public final void g(s sVar, CaptureRequest captureRequest) {
        switch (this.f19603e) {
            case 0:
                super.g(sVar, captureRequest);
                o().g(sVar, captureRequest);
                return;
            default:
                super.g(sVar, captureRequest);
                return;
        }
    }

    @Override // ie.e
    public void i(b bVar) {
        switch (this.f19603e) {
            case 0:
                this.f19605c = bVar;
                o().b(new c(this, 0));
                o().i(bVar);
                return;
            default:
                this.f19605c = bVar;
                boolean n10 = n(bVar);
                if (m(bVar) && !n10) {
                    p(bVar);
                    return;
                } else {
                    k(Integer.MAX_VALUE);
                    return;
                }
        }
    }

    public abstract boolean m(b bVar);

    public abstract boolean n(b bVar);

    public abstract e o();

    public abstract void p(b bVar);
}

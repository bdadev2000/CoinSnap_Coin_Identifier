package ie;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import he.s;
import java.util.List;

/* loaded from: classes4.dex */
public final class h extends e {

    /* renamed from: e, reason: collision with root package name */
    public final List f19609e;

    /* renamed from: f, reason: collision with root package name */
    public int f19610f = -1;

    public h(List list) {
        this.f19609e = list;
        m();
    }

    @Override // ie.e
    public final void d(b bVar) {
        int i10 = this.f19610f;
        if (i10 >= 0) {
            ((e) this.f19609e.get(i10)).d(bVar);
        }
    }

    @Override // ie.e
    public final void e(s sVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10 = this.f19610f;
        if (i10 >= 0) {
            ((e) this.f19609e.get(i10)).e(sVar, captureRequest, totalCaptureResult);
        }
    }

    @Override // ie.e
    public final void f(s sVar, CaptureRequest captureRequest, CaptureResult captureResult) {
        int i10 = this.f19610f;
        if (i10 >= 0) {
            ((e) this.f19609e.get(i10)).f(sVar, captureRequest, captureResult);
        }
    }

    @Override // ie.e
    public final void g(s sVar, CaptureRequest captureRequest) {
        super.g(sVar, captureRequest);
        int i10 = this.f19610f;
        if (i10 >= 0) {
            ((e) this.f19609e.get(i10)).g(sVar, captureRequest);
        }
    }

    @Override // ie.e
    public final void i(b bVar) {
        this.f19605c = bVar;
        int i10 = this.f19610f;
        if (i10 >= 0) {
            ((e) this.f19609e.get(i10)).i(bVar);
        }
    }

    public final void m() {
        boolean z10;
        int i10 = this.f19610f;
        boolean z11 = false;
        int i11 = 1;
        if (i10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        List list = this.f19609e;
        if (i10 == list.size() - 1) {
            z11 = true;
        }
        if (z11) {
            k(Integer.MAX_VALUE);
            return;
        }
        int i12 = this.f19610f + 1;
        this.f19610f = i12;
        ((e) list.get(i12)).b(new c(this, i11));
        if (!z10) {
            ((e) list.get(this.f19610f)).i(this.f19605c);
        }
    }
}

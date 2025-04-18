package je;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import he.s;

/* loaded from: classes4.dex */
public final class d extends ie.d {

    /* renamed from: f, reason: collision with root package name */
    public static final fe.c f20022f = new fe.c(d.class.getSimpleName());

    public d() {
        super(1);
    }

    @Override // ie.d, ie.e
    public final void e(s sVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.e(sVar, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_STATE);
        f20022f.a(1, "processCapture:", "awbState:", num);
        if (num != null && num.intValue() == 3) {
            k(Integer.MAX_VALUE);
        }
    }

    @Override // ie.d
    public final boolean m(ie.b bVar) {
        boolean z10;
        boolean z11;
        if (((Integer) j(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, -1)).intValue() != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Integer num = (Integer) ((s) bVar).Z.get(CaptureRequest.CONTROL_AWB_MODE);
        if (z10 && num != null && num.intValue() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        f20022f.a(1, "checkIsSupported:", Boolean.valueOf(z11));
        return z11;
    }

    @Override // ie.d
    public final boolean n(ie.b bVar) {
        boolean z10;
        TotalCaptureResult totalCaptureResult = ((s) bVar).f19071a0;
        fe.c cVar = f20022f;
        if (totalCaptureResult != null) {
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_STATE);
            if (num != null && num.intValue() == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            cVar.a(1, "checkShouldSkip:", Boolean.valueOf(z10));
            return z10;
        }
        cVar.a(1, "checkShouldSkip: false - lastResult is null.");
        return false;
    }

    @Override // ie.d
    public final void p(ie.b bVar) {
        ((s) bVar).Z.set(CaptureRequest.CONTROL_AWB_LOCK, Boolean.TRUE);
        ((s) bVar).d0();
    }
}

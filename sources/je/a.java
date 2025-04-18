package je;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import he.s;

/* loaded from: classes4.dex */
public final class a extends ie.d {

    /* renamed from: f, reason: collision with root package name */
    public static final fe.c f20019f = new fe.c(a.class.getSimpleName());

    public a() {
        super(1);
    }

    @Override // ie.d, ie.e
    public final void e(s sVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.e(sVar, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        f20019f.a(1, "processCapture:", "aeState:", num);
        if (num != null && num.intValue() == 3) {
            k(Integer.MAX_VALUE);
        }
    }

    @Override // ie.d
    public final boolean m(ie.b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (((Integer) j(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, -1)).intValue() != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Integer num = (Integer) ((s) bVar).Z.get(CaptureRequest.CONTROL_AE_MODE);
        if (num != null && (num.intValue() == 1 || num.intValue() == 3 || num.intValue() == 2 || num.intValue() == 4 || num.intValue() == 5)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            z12 = true;
        } else {
            z12 = false;
        }
        f20019f.a(1, "checkIsSupported:", Boolean.valueOf(z12));
        return z12;
    }

    @Override // ie.d
    public final boolean n(ie.b bVar) {
        boolean z10;
        TotalCaptureResult totalCaptureResult = ((s) bVar).f19071a0;
        fe.c cVar = f20019f;
        if (totalCaptureResult != null) {
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
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
        ((s) bVar).Z.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        s sVar = (s) bVar;
        sVar.Z.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.TRUE);
        sVar.d0();
    }
}

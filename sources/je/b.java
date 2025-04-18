package je;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import he.s;

/* loaded from: classes4.dex */
public final class b extends ie.d {

    /* renamed from: f, reason: collision with root package name */
    public static final fe.c f20020f = new fe.c(b.class.getSimpleName());

    public b() {
        super(1);
    }

    @Override // ie.d, ie.e
    public final void e(s sVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        super.e(sVar, captureRequest, totalCaptureResult);
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE);
        f20020f.a(1, "onCapture:", "afState:", num, "afMode:", num2);
        if (num == null || num2 == null || num2.intValue() != 1) {
            return;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 2 || intValue == 4 || intValue == 5 || intValue == 6) {
            k(Integer.MAX_VALUE);
        }
    }

    @Override // ie.d
    public final boolean m(ie.b bVar) {
        for (int i10 : (int[]) j(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES, new int[0])) {
            if (i10 == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // ie.d
    public final boolean n(ie.b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        TotalCaptureResult totalCaptureResult = ((s) bVar).f19071a0;
        fe.c cVar = f20020f;
        if (totalCaptureResult != null) {
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num != null && (num.intValue() == 4 || num.intValue() == 5 || num.intValue() == 0 || num.intValue() == 2 || num.intValue() == 6)) {
                z10 = true;
            } else {
                z10 = false;
            }
            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE);
            if (num2 != null && num2.intValue() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            cVar.a(1, "checkShouldSkip:", Boolean.valueOf(z12));
            return z12;
        }
        cVar.a(1, "checkShouldSkip: false - lastResult is null.");
        return false;
    }

    @Override // ie.d
    public final void p(ie.b bVar) {
        ((s) bVar).Z.set(CaptureRequest.CONTROL_AF_MODE, 1);
        s sVar = (s) bVar;
        sVar.Z.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        sVar.d0();
    }
}

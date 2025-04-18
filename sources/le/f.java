package le;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import he.s;

/* loaded from: classes4.dex */
public final class f extends b {

    /* renamed from: f, reason: collision with root package name */
    public static final fe.c f21369f = new fe.c(f.class.getSimpleName());

    @Override // le.b
    public final void m(ie.b bVar, MeteringRectangle meteringRectangle) {
        boolean z10;
        Integer num;
        int intValue = ((Integer) j(CameraCharacteristics.CONTROL_MAX_REGIONS_AF, 0)).intValue();
        boolean z11 = true;
        if (meteringRectangle != null && intValue > 0) {
            ((s) bVar).Z.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{meteringRectangle});
            z10 = true;
        } else {
            z10 = false;
        }
        s sVar = (s) bVar;
        TotalCaptureResult totalCaptureResult = sVar.f19071a0;
        if (totalCaptureResult == null) {
            num = null;
        } else {
            num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_TRIGGER);
        }
        f21369f.a(2, "onStarted:", "last focus trigger is", num);
        if (num != null && num.intValue() == 1) {
            sVar.Z.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        } else {
            z11 = z10;
        }
        if (z11) {
            sVar.d0();
        }
        k(Integer.MAX_VALUE);
    }
}

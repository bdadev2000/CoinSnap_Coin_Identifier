package le;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import he.s;

/* loaded from: classes4.dex */
public final class d extends b {

    /* renamed from: f, reason: collision with root package name */
    public static final fe.c f21367f = new fe.c(d.class.getSimpleName());

    @Override // ie.e
    public final void e(s sVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        if (this.f19604b == 0) {
            sVar.Z.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.FALSE);
            sVar.d0();
            k(Integer.MAX_VALUE);
        }
    }

    @Override // le.b
    public final void m(ie.b bVar, MeteringRectangle meteringRectangle) {
        Integer num;
        int intValue = ((Integer) j(CameraCharacteristics.CONTROL_MAX_REGIONS_AE, 0)).intValue();
        if (meteringRectangle != null && intValue > 0) {
            ((s) bVar).Z.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{meteringRectangle});
        }
        s sVar = (s) bVar;
        TotalCaptureResult totalCaptureResult = sVar.f19071a0;
        if (totalCaptureResult == null) {
            num = null;
        } else {
            num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
        }
        fe.c cVar = f21367f;
        cVar.a(1, "onStarted:", "last precapture trigger is", num);
        if (num != null && num.intValue() == 1) {
            cVar.a(1, "onStarted:", "canceling precapture.");
            sVar.Z.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        sVar.Z.set(CaptureRequest.CONTROL_AE_LOCK, Boolean.TRUE);
        sVar.d0();
        k(0);
    }
}

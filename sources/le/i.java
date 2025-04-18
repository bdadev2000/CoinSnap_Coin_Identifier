package le;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import he.s;

/* loaded from: classes4.dex */
public final class i extends b {

    /* renamed from: f, reason: collision with root package name */
    public static final fe.c f21377f = new fe.c(i.class.getSimpleName());

    @Override // le.b
    public final void m(ie.b bVar, MeteringRectangle meteringRectangle) {
        f21377f.a(2, "onStarted:", "with area:", meteringRectangle);
        int intValue = ((Integer) j(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB, 0)).intValue();
        if (meteringRectangle != null && intValue > 0) {
            s sVar = (s) bVar;
            sVar.Z.set(CaptureRequest.CONTROL_AWB_REGIONS, new MeteringRectangle[]{meteringRectangle});
            sVar.d0();
        }
        k(Integer.MAX_VALUE);
    }
}

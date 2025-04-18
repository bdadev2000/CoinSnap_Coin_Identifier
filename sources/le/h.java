package le;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import he.s;
import java.util.List;

/* loaded from: classes4.dex */
public final class h extends a {

    /* renamed from: i, reason: collision with root package name */
    public static final fe.c f21376i = new fe.c(h.class.getSimpleName());

    public h(List list, boolean z10) {
        super(list, z10);
    }

    @Override // ie.e
    public final void e(s sVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_STATE);
        f21376i.a(1, "onCaptureCompleted:", "awbState:", num);
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        if (intValue != 2) {
            if (intValue == 3) {
                this.f21361f = false;
                k(Integer.MAX_VALUE);
                return;
            }
            return;
        }
        this.f21361f = true;
        k(Integer.MAX_VALUE);
    }

    @Override // le.a
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
        f21376i.a(1, "checkIsSupported:", Boolean.valueOf(z11));
        return z11;
    }

    @Override // le.a
    public final boolean n(ie.b bVar) {
        boolean z10;
        TotalCaptureResult totalCaptureResult = ((s) bVar).f19071a0;
        fe.c cVar = f21376i;
        if (totalCaptureResult != null) {
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_STATE);
            if (num != null && num.intValue() == 2) {
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

    @Override // le.a
    public final void o(ie.b bVar, List list) {
        f21376i.a(1, "onStarted:", "with areas:", list);
        int intValue = ((Integer) j(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB, 0)).intValue();
        if (!list.isEmpty() && intValue > 0) {
            s sVar = (s) bVar;
            sVar.Z.set(CaptureRequest.CONTROL_AWB_REGIONS, (MeteringRectangle[]) list.subList(0, Math.min(intValue, list.size())).toArray(new MeteringRectangle[0]));
            sVar.d0();
        }
    }
}

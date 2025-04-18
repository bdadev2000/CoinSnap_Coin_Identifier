package le;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import he.s;
import java.util.List;

/* loaded from: classes4.dex */
public final class e extends a {

    /* renamed from: i, reason: collision with root package name */
    public static final fe.c f21368i = new fe.c(e.class.getSimpleName());

    public e(List list, boolean z10) {
        super(list, z10);
    }

    @Override // ie.e
    public final void e(s sVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        f21368i.a(1, "onCaptureCompleted:", "afState:", num);
        if (num == null) {
            return;
        }
        int intValue = num.intValue();
        if (intValue != 4) {
            if (intValue == 5) {
                this.f21361f = false;
                k(Integer.MAX_VALUE);
                return;
            }
            return;
        }
        this.f21361f = true;
        k(Integer.MAX_VALUE);
    }

    @Override // ie.e
    public final void h(ie.b bVar) {
        ((s) bVar).Z.set(CaptureRequest.CONTROL_AF_TRIGGER, null);
    }

    @Override // le.a
    public final boolean m(ie.b bVar) {
        boolean z10;
        Integer num = (Integer) ((s) bVar).Z.get(CaptureRequest.CONTROL_AF_MODE);
        if (num != null && (num.intValue() == 1 || num.intValue() == 4 || num.intValue() == 3 || num.intValue() == 2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        f21368i.a(1, "checkIsSupported:", Boolean.valueOf(z10));
        return z10;
    }

    @Override // le.a
    public final boolean n(ie.b bVar) {
        boolean z10;
        TotalCaptureResult totalCaptureResult = ((s) bVar).f19071a0;
        fe.c cVar = f21368i;
        if (totalCaptureResult != null) {
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num != null && (num.intValue() == 4 || num.intValue() == 2)) {
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
        f21368i.a(1, "onStarted:", "with areas:", list);
        s sVar = (s) bVar;
        sVar.Z.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        int intValue = ((Integer) j(CameraCharacteristics.CONTROL_MAX_REGIONS_AF, 0)).intValue();
        if (!list.isEmpty() && intValue > 0) {
            sVar.Z.set(CaptureRequest.CONTROL_AF_REGIONS, (MeteringRectangle[]) list.subList(0, Math.min(intValue, list.size())).toArray(new MeteringRectangle[0]));
        }
        sVar.d0();
    }
}

package le;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import he.s;
import java.util.List;

/* loaded from: classes4.dex */
public final class c extends a {

    /* renamed from: k, reason: collision with root package name */
    public static final fe.c f21364k = new fe.c(c.class.getSimpleName());

    /* renamed from: i, reason: collision with root package name */
    public boolean f21365i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21366j;

    public c(List list, boolean z10) {
        super(list, z10);
        this.f21365i = false;
        this.f21366j = false;
    }

    @Override // ie.e
    public final void e(s sVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER);
        f21364k.a(1, "onCaptureCompleted:", "aeState:", num, "aeTriggerState:", num2);
        if (num == null) {
            return;
        }
        if (this.f19604b == 0) {
            int intValue = num.intValue();
            if (intValue != 2) {
                if (intValue != 3) {
                    if (intValue != 4) {
                        if (intValue == 5) {
                            k(1);
                        }
                    }
                } else {
                    this.f21361f = false;
                    k(Integer.MAX_VALUE);
                }
            }
            if (num2 != null && num2.intValue() == 1) {
                this.f21361f = true;
                k(Integer.MAX_VALUE);
            }
        }
        if (this.f19604b == 1) {
            int intValue2 = num.intValue();
            if (intValue2 != 2) {
                if (intValue2 != 3) {
                    if (intValue2 != 4) {
                        return;
                    }
                } else {
                    this.f21361f = false;
                    k(Integer.MAX_VALUE);
                    return;
                }
            }
            this.f21361f = true;
            k(Integer.MAX_VALUE);
        }
    }

    @Override // ie.e
    public final void h(ie.b bVar) {
        ((s) bVar).Z.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, null);
    }

    @Override // le.a
    public final boolean m(ie.b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (((Integer) j(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL, -1)).intValue() == 2) {
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
        this.f21366j = !z10;
        if (((Integer) j(CameraCharacteristics.CONTROL_MAX_REGIONS_AE, 0)).intValue() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f21365i = z12;
        if (z11 && (this.f21366j || z12)) {
            z13 = true;
        } else {
            z13 = false;
        }
        f21364k.a(1, "checkIsSupported:", Boolean.valueOf(z13), "trigger:", Boolean.valueOf(this.f21366j), "areas:", Boolean.valueOf(this.f21365i));
        return z13;
    }

    @Override // le.a
    public final boolean n(ie.b bVar) {
        boolean z10;
        TotalCaptureResult totalCaptureResult = ((s) bVar).f19071a0;
        fe.c cVar = f21364k;
        if (totalCaptureResult != null) {
            Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
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
        f21364k.a(1, "onStarted:", "with areas:", list);
        if (this.f21365i && !list.isEmpty()) {
            ((s) bVar).Z.set(CaptureRequest.CONTROL_AE_REGIONS, (MeteringRectangle[]) list.subList(0, Math.min(((Integer) j(CameraCharacteristics.CONTROL_MAX_REGIONS_AE, 0)).intValue(), list.size())).toArray(new MeteringRectangle[0]));
        }
        if (this.f21366j) {
            ((s) bVar).Z.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        }
        ((s) bVar).d0();
        if (this.f21366j) {
            k(0);
        } else {
            k(1);
        }
    }
}

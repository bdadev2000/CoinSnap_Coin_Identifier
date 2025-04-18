package ie;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import he.a0;
import he.s;

/* loaded from: classes4.dex */
public final class g extends e {

    /* renamed from: f, reason: collision with root package name */
    public static final fe.c f19607f = new fe.c(a0.class.getSimpleName());

    /* renamed from: e, reason: collision with root package name */
    public String f19608e;

    @Override // ie.e
    public final void e(s sVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        Integer num3 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        String str = "aeMode: " + num + " aeLock: " + ((Boolean) totalCaptureResult.get(CaptureResult.CONTROL_AE_LOCK)) + " aeState: " + num2 + " aeTriggerState: " + ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_PRECAPTURE_TRIGGER)) + " afState: " + num3 + " afTriggerState: " + ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_TRIGGER));
        if (!str.equals(this.f19608e)) {
            this.f19608e = str;
            f19607f.a(1, str);
        }
    }

    @Override // ie.e
    public final void h(b bVar) {
        k(0);
        l(bVar);
    }
}

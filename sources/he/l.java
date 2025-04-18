package he;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class l extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ s a;

    public l(s sVar) {
        this.a = sVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        s sVar = this.a;
        sVar.f19071a0 = totalCaptureResult;
        Iterator it = sVar.f19077g0.iterator();
        while (it.hasNext()) {
            ((ie.e) it.next()).e(sVar, captureRequest, totalCaptureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        s sVar = this.a;
        Iterator it = sVar.f19077g0.iterator();
        while (it.hasNext()) {
            ((ie.e) it.next()).f(sVar, captureRequest, captureResult);
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j3, long j10) {
        s sVar = this.a;
        Iterator it = sVar.f19077g0.iterator();
        while (it.hasNext()) {
            ((ie.e) it.next()).g(sVar, captureRequest);
        }
    }
}

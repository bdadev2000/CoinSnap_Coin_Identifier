package he;

import android.hardware.camera2.CameraCaptureSession;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class p extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ TaskCompletionSource a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f19064b;

    public p(s sVar, TaskCompletionSource taskCompletionSource) {
        this.f19064b = sVar;
        this.a = taskCompletionSource;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        RuntimeException runtimeException = new RuntimeException(a0.f19026e.a(3, "onConfigureFailed! Session", cameraCaptureSession));
        TaskCompletionSource taskCompletionSource = this.a;
        if (!taskCompletionSource.getTask().isComplete()) {
            taskCompletionSource.trySetException(new fe.a(runtimeException, 2));
            return;
        }
        throw new fe.a(3);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.f19064b.Y = cameraCaptureSession;
        a0.f19026e.a(1, "onStartBind:", "Completed");
        this.a.trySetResult(null);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        super.onReady(cameraCaptureSession);
        a0.f19026e.a(1, "CameraCaptureSession.StateCallback reported onReady.");
    }
}

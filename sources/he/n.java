package he;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class n extends CameraDevice.StateCallback {
    public final /* synthetic */ TaskCompletionSource a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f19061b;

    public n(s sVar, TaskCompletionSource taskCompletionSource) {
        this.f19061b = sVar;
        this.a = taskCompletionSource;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        fe.a aVar = new fe.a(3);
        TaskCompletionSource taskCompletionSource = this.a;
        if (!taskCompletionSource.getTask().isComplete()) {
            taskCompletionSource.trySetException(aVar);
        } else {
            a0.f19026e.a(1, "CameraDevice.StateCallback reported disconnection.");
            throw aVar;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        TaskCompletionSource taskCompletionSource = this.a;
        int i11 = 1;
        if (!taskCompletionSource.getTask().isComplete()) {
            this.f19061b.getClass();
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5) {
                i11 = 0;
            }
            taskCompletionSource.trySetException(new fe.a(i11));
            return;
        }
        a0.f19026e.a(3, "CameraDevice.StateCallback reported an error:", Integer.valueOf(i10));
        throw new fe.a(3);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        int i10;
        TaskCompletionSource taskCompletionSource = this.a;
        s sVar = this.f19061b;
        sVar.W = cameraDevice;
        CameraManager cameraManager = sVar.U;
        try {
            a0.f19026e.a(1, "onStartEngine:", "Opened camera device.");
            sVar.X = cameraManager.getCameraCharacteristics(sVar.V);
            boolean b3 = sVar.C.b(2, 3);
            int ordinal = sVar.f19099s.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i10 = 32;
                } else {
                    throw new IllegalArgumentException("Unknown format:" + sVar.f19099s);
                }
            } else {
                i10 = NotificationCompat.FLAG_LOCAL_ONLY;
            }
            sVar.f19087g = new oe.a(cameraManager, sVar.V, b3, i10);
            sVar.j0(1);
            taskCompletionSource.trySetResult(sVar.f19087g);
        } catch (CameraAccessException e2) {
            taskCompletionSource.trySetException(s.h0(e2));
        }
    }
}

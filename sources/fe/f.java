package fe;

import android.hardware.Camera;

/* loaded from: classes4.dex */
public abstract class f {
    public static final c a = new c(f.class.getSimpleName());

    public static boolean a(ge.f fVar) {
        if (ke.a.a == null) {
            ke.a.a = new ke.a();
        }
        ke.a.a.getClass();
        int intValue = ((Integer) ke.a.f20680d.get(fVar)).intValue();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i10 = 0; i10 < numberOfCameras; i10++) {
            Camera.getCameraInfo(i10, cameraInfo);
            if (cameraInfo.facing == intValue) {
                return true;
            }
        }
        return false;
    }
}

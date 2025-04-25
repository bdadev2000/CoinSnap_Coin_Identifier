package com.glority.android.deviceinsights.camera;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import com.glority.android.picturexx.recognize.logevents.RecognizeLogEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CameraInspector.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/glority/android/deviceinsights/camera/CameraInspector;", "", "<init>", "()V", "queryCameraCount", "", "context", "Landroid/content/Context;", "checkIfCameraSupportsMacroMode", "", "deviceinsights_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class CameraInspector {
    public static final CameraInspector INSTANCE = new CameraInspector();

    private CameraInspector() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x001a, code lost:
    
        if (r2 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int queryCameraCount(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "camera"
            java.lang.Object r2 = r2.getSystemService(r0)
            boolean r0 = r2 instanceof android.hardware.camera2.CameraManager
            if (r0 == 0) goto L12
            android.hardware.camera2.CameraManager r2 = (android.hardware.camera2.CameraManager) r2
            goto L13
        L12:
            r2 = 0
        L13:
            r0 = 0
            if (r2 == 0) goto L1c
            java.lang.String[] r2 = r2.getCameraIdList()     // Catch: java.lang.Exception -> L20
            if (r2 != 0) goto L1e
        L1c:
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: java.lang.Exception -> L20
        L1e:
            int r2 = r2.length     // Catch: java.lang.Exception -> L20
            return r2
        L20:
            r2 = move-exception
            r2.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.deviceinsights.camera.CameraInspector.queryCameraCount(android.content.Context):int");
    }

    public final boolean checkIfCameraSupportsMacroMode(Context context) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService(RecognizeLogEvents.camera);
        CameraManager cameraManager = systemService instanceof CameraManager ? (CameraManager) systemService : null;
        if (cameraManager == null) {
            return false;
        }
        try {
            for (String str : cameraManager.getCameraIdList()) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "getCameraCharacteristics(...)");
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                if ((num == null || num.intValue() != 2) && (iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES)) != null) {
                    for (int i : iArr) {
                        if (i == 2) {
                            Log.d("CameraMacro", "Camera " + str + " supports macro mode");
                            return true;
                        }
                    }
                }
            }
        } catch (CameraAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return false;
    }
}

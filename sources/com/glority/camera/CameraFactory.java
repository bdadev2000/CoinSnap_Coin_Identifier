package com.glority.camera;

import android.content.Context;
import com.glority.camera.utils.CameraUtils;
import com.glority.utils.app.AppUtils;

/* loaded from: classes6.dex */
public class CameraFactory {
    public static boolean forceCamera1 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ICamera newCamera(Context context) {
        if (forceCamera1) {
            return new Camera1();
        }
        boolean isCamera2Supported = CameraUtils.isCamera2Supported();
        if (AppUtils.isLollipop() && isCamera2Supported) {
            return new Camera2(context);
        }
        return new Camera1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ICamera newCamera1(ICamera iCamera) {
        CameraUtils.setCamera2Supported(false);
        Camera1 camera1 = new Camera1();
        camera1.initPreview(iCamera.getPreview());
        camera1.setAspectRatio(iCamera.getAspectRatio());
        camera1.setAutoFocus(iCamera.getAutoFocus());
        camera1.setFacing(iCamera.getFacing());
        camera1.setFlash(iCamera.getFlash());
        camera1.setRotation(iCamera.getRotation());
        camera1.setCallBack(iCamera.getCallBack());
        camera1.setSensorController(iCamera.getSensorController());
        return camera1;
    }
}

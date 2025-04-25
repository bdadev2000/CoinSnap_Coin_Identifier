package com.glority.camera.utils;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.glority.android.picturexx.recognize.logevents.RecognizeLogEvents;
import com.glority.utils.UtilsApp;
import com.glority.utils.store.SPUtils;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CameraUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\u0007H\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\f\u001a\u00020\nH\u0007J\b\u0010\r\u001a\u00020\nH\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\nH\u0007J\u0012\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/glority/camera/utils/CameraUtils;", "", "()V", "SP_ARG_SUPPORT_CAMERA2", "", "SP_CAMERA", "getScreenHeight", "", "getScreenWidth", "isCamera2Supported", "", "isCameraUsable", "isFlyme", "isShowNavigationBar", "setCamera2Supported", "", "supportCamera2", "mContext", "Landroid/content/Context;", "camera_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes6.dex */
public final class CameraUtils {
    public static final CameraUtils INSTANCE = new CameraUtils();
    private static final String SP_ARG_SUPPORT_CAMERA2 = "sp_arg_support_camera2_20231024";
    private static final String SP_CAMERA = "com.glority.camera";

    private CameraUtils() {
    }

    @JvmStatic
    public static final boolean isCamera2Supported() {
        return SPUtils.getInstance("com.glority.camera").getBoolean(SP_ARG_SUPPORT_CAMERA2, true);
    }

    @JvmStatic
    public static final void setCamera2Supported(boolean supportCamera2) {
        SPUtils.getInstance("com.glority.camera").put(SP_ARG_SUPPORT_CAMERA2, supportCamera2);
    }

    @JvmStatic
    public static final boolean isFlyme() {
        String str = Build.BRAND;
        Intrinsics.checkExpressionValueIsNotNull(str, "Build.BRAND");
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "Meizu", false, 2, (Object) null);
    }

    @JvmStatic
    public static final boolean isCameraUsable() {
        boolean z = true;
        if (isCamera2Supported()) {
            return true;
        }
        Camera mCamera = null;
        try {
            mCamera = Camera.open();
            Intrinsics.checkExpressionValueIsNotNull(mCamera, "mCamera");
            mCamera.setParameters(mCamera.getParameters());
        } catch (Exception unused) {
            z = false;
        }
        if (mCamera != null) {
            mCamera.release();
        }
        return z;
    }

    @JvmStatic
    public static final boolean supportCamera2(Context mContext) {
        Integer num;
        if (mContext == null) {
            return false;
        }
        try {
            Object systemService = mContext.getSystemService(RecognizeLogEvents.camera);
            if (!(systemService instanceof CameraManager)) {
                systemService = null;
            }
            CameraManager cameraManager = (CameraManager) systemService;
            if (cameraManager != null) {
                String[] cameraIdList = cameraManager.getCameraIdList();
                Intrinsics.checkExpressionValueIsNotNull(cameraIdList, "manager.cameraIdList");
                if (cameraIdList.length == 0) {
                    return false;
                }
                for (String str : cameraIdList) {
                    if (str != null) {
                        String str2 = str;
                        int length = str2.length() - 1;
                        int i = 0;
                        boolean z = false;
                        while (i <= length) {
                            boolean z2 = str2.charAt(!z ? i : length) <= ' ';
                            if (z) {
                                if (!z2) {
                                    break;
                                }
                                length--;
                            } else if (z2) {
                                i++;
                            } else {
                                z = true;
                            }
                        }
                        if (str2.subSequence(i, length + 1).toString().length() != 0) {
                            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                            Intrinsics.checkExpressionValueIsNotNull(cameraCharacteristics, "manager.getCameraCharacteristics(cameraId)");
                            Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                            if (num2 != null && num2.intValue() != 2 && (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)) != null && num.intValue() == 1) {
                                return true;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @JvmStatic
    public static final int getScreenWidth() {
        Object systemService = UtilsApp.getApp().getSystemService("window");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    @JvmStatic
    public static final int getScreenHeight() {
        Object systemService = UtilsApp.getApp().getSystemService("window");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
        }
        WindowManager windowManager = (WindowManager) systemService;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        if (!isShowNavigationBar()) {
            return i;
        }
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    @JvmStatic
    private static final boolean isShowNavigationBar() {
        Application app = UtilsApp.getApp();
        Intrinsics.checkExpressionValueIsNotNull(app, "UtilsApp.getApp()");
        Resources resources = app.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        return identifier > 0 && resources.getBoolean(identifier);
    }
}

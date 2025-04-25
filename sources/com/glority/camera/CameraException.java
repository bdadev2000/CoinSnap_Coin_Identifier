package com.glority.camera;

import android.hardware.camera2.CameraAccessException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes6.dex */
public class CameraException extends Exception {
    public static final int CAMERA_CHARACTERISTICS_CREATION_ERROR = 10002;
    public static final int CAMERA_DISABLED = 20001;
    public static final int CAMERA_DISCONNECTED = 20002;
    public static final int CAMERA_ERROR = 20003;
    public static final int CAMERA_IN_USE = 20004;
    public static final int CAMERA_MAX_IN_USE = 20005;
    public static final int CAMERA_PERMISSION_NOT_GRANTED = 20006;
    public static final int CAMERA_UNAVAILABLE_DO_NOT_DISTURB = 10001;
    public static final int CAMERA_UNKNOWN_ERROR = 20000;
    private final int mReason;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Reason {
    }

    public CameraException(int i) {
        this.mReason = i;
    }

    public CameraException(int i, String str) {
        super(str);
        this.mReason = i;
    }

    public CameraException(int i, String str, Throwable th) {
        super(str, th);
        this.mReason = i;
    }

    public CameraException(int i, Throwable th) {
        super(th);
        this.mReason = i;
    }

    public int getReason() {
        return this.mReason;
    }

    public static CameraException from(CameraAccessException cameraAccessException, String str) {
        int reason = cameraAccessException.getReason();
        return new CameraException(reason != 1 ? reason != 2 ? reason != 3 ? reason != 4 ? reason != 5 ? 20000 : CAMERA_MAX_IN_USE : CAMERA_IN_USE : CAMERA_ERROR : CAMERA_DISCONNECTED : CAMERA_DISABLED, str + " message: " + cameraAccessException.getMessage());
    }
}

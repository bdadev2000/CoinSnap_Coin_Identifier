package com.google.ar.core;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import com.google.ar.core.exceptions.FatalException;
import java.util.EnumSet;

/* loaded from: classes2.dex */
public class CameraConfig {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    /* loaded from: classes2.dex */
    public enum DepthSensorUsage {
        REQUIRE_AND_USE(1),
        DO_NOT_USE(2);

        final int nativeCode;

        DepthSensorUsage(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static EnumSet<DepthSensorUsage> forBitFlags(int i9) {
            EnumSet<DepthSensorUsage> noneOf = EnumSet.noneOf(DepthSensorUsage.class);
            for (DepthSensorUsage depthSensorUsage : values()) {
                if ((depthSensorUsage.nativeCode & i9) != 0) {
                    noneOf.add(depthSensorUsage);
                }
            }
            return noneOf;
        }

        @NonNull
        public static DepthSensorUsage forNumber(int i9) {
            for (DepthSensorUsage depthSensorUsage : values()) {
                if (depthSensorUsage.nativeCode == i9) {
                    return depthSensorUsage;
                }
            }
            throw new FatalException(A.a("Unexpected value for native DepthSensorUsage, value=", (byte) 52, i9));
        }
    }

    /* loaded from: classes2.dex */
    public enum FacingDirection {
        BACK(0),
        FRONT(1);

        final int nativeCode;

        FacingDirection(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static FacingDirection forNumber(int i9) {
            for (FacingDirection facingDirection : values()) {
                if (facingDirection.nativeCode == i9) {
                    return facingDirection;
                }
            }
            throw new FatalException(A.a("Unexpected value for native FacingDirection, value=", (byte) 51, i9));
        }
    }

    /* loaded from: classes2.dex */
    public enum StereoCameraUsage {
        REQUIRE_AND_USE(1),
        DO_NOT_USE(2);

        final int nativeCode;

        StereoCameraUsage(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static EnumSet<StereoCameraUsage> forBitFlags(int i9) {
            EnumSet<StereoCameraUsage> noneOf = EnumSet.noneOf(StereoCameraUsage.class);
            for (StereoCameraUsage stereoCameraUsage : values()) {
                if ((stereoCameraUsage.nativeCode & i9) != 0) {
                    noneOf.add(stereoCameraUsage);
                }
            }
            return noneOf;
        }

        @NonNull
        public static StereoCameraUsage forNumber(int i9) {
            for (StereoCameraUsage stereoCameraUsage : values()) {
                if (stereoCameraUsage.nativeCode == i9) {
                    return stereoCameraUsage;
                }
            }
            throw new FatalException(A.a("Unexpected value for native StereoCameraUsage, value=", (byte) 53, i9));
        }
    }

    /* loaded from: classes2.dex */
    public enum TargetFps {
        TARGET_FPS_30(1),
        TARGET_FPS_60(2);

        final int nativeCode;

        TargetFps(int i9) {
            this.nativeCode = i9;
        }

        public static EnumSet<TargetFps> forBitFlags(int i9) {
            EnumSet<TargetFps> noneOf = EnumSet.noneOf(TargetFps.class);
            for (TargetFps targetFps : values()) {
                if ((targetFps.nativeCode & i9) != 0) {
                    noneOf.add(targetFps);
                }
            }
            return noneOf;
        }
    }

    public CameraConfig() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    private static native void nativeDestroyCameraConfig(long j7, long j9);

    private native String nativeGetCameraId(long j7, long j9);

    private native int nativeGetDepthSensorUsage(long j7, long j9);

    private native int nativeGetFacingDirection(long j7, long j9);

    private native void nativeGetFpsRange(long j7, long j9, int[] iArr);

    private native void nativeGetImageDimensions(long j7, long j9, int[] iArr);

    private native int nativeGetStereoCameraUsage(long j7, long j9);

    private native void nativeGetTextureDimensions(long j7, long j9, int[] iArr);

    public void finalize() throws Throwable {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeDestroyCameraConfig(this.nativeSymbolTableHandle, j7);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    public String getCameraId() {
        return nativeGetCameraId(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @NonNull
    public DepthSensorUsage getDepthSensorUsage() {
        return DepthSensorUsage.forNumber(nativeGetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public FacingDirection getFacingDirection() {
        return FacingDirection.forNumber(nativeGetFacingDirection(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public Range<Integer> getFpsRange() {
        int[] iArr = new int[2];
        nativeGetFpsRange(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Range<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    @NonNull
    public Size getImageSize() {
        int[] iArr = new int[2];
        nativeGetImageDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Size(iArr[0], iArr[1]);
    }

    @NonNull
    public StereoCameraUsage getStereoCameraUsage() {
        return StereoCameraUsage.forNumber(nativeGetStereoCameraUsage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public Size getTextureSize() {
        int[] iArr = new int[2];
        nativeGetTextureDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Size(iArr[0], iArr[1]);
    }

    public CameraConfig(Session session, long j7) {
        this.session = session;
        this.nativeHandle = j7;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}

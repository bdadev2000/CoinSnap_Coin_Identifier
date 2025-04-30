package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes2.dex */
public class Anchor {
    long nativeHandle;
    final long nativeSymbolTableHandle;
    private final Session session;

    /* loaded from: classes2.dex */
    public enum CloudAnchorState {
        NONE(0),
        TASK_IN_PROGRESS(1),
        SUCCESS(2),
        ERROR_INTERNAL(-1),
        ERROR_NOT_AUTHORIZED(-2),
        ERROR_SERVICE_UNAVAILABLE(-3),
        ERROR_RESOURCE_EXHAUSTED(-4),
        ERROR_HOSTING_DATASET_PROCESSING_FAILED(-5),
        ERROR_CLOUD_ID_NOT_FOUND(-6),
        ERROR_RESOLVING_LOCALIZATION_NO_MATCH(-7),
        ERROR_RESOLVING_SDK_VERSION_TOO_OLD(-8),
        ERROR_RESOLVING_SDK_VERSION_TOO_NEW(-9),
        ERROR_HOSTING_SERVICE_UNAVAILABLE(-10);

        final int nativeCode;

        CloudAnchorState(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static CloudAnchorState forNumber(int i9) {
            for (CloudAnchorState cloudAnchorState : values()) {
                if (cloudAnchorState.nativeCode == i9) {
                    return cloudAnchorState;
                }
            }
            throw new FatalException(A.a("Unexpected value for native CloudAnchorState, value=", (byte) 52, i9));
        }

        public boolean isError() {
            return this.nativeCode < 0;
        }
    }

    /* loaded from: classes2.dex */
    public enum RooftopAnchorState {
        NONE(0),
        SUCCESS(1),
        ERROR_INTERNAL(-1),
        ERROR_NOT_AUTHORIZED(-2),
        ERROR_UNSUPPORTED_LOCATION(-3);

        final int nativeCode;

        RooftopAnchorState(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static RooftopAnchorState forNumber(int i9) {
            for (RooftopAnchorState rooftopAnchorState : values()) {
                if (rooftopAnchorState.nativeCode == i9) {
                    return rooftopAnchorState;
                }
            }
            throw new FatalException(A.a("Unexpected value for native RooftopAnchorState, value=", (byte) 54, i9));
        }

        public boolean isError() {
            return this.nativeCode < 0;
        }
    }

    /* loaded from: classes2.dex */
    public enum TerrainAnchorState {
        NONE(0),
        TASK_IN_PROGRESS(1),
        SUCCESS(2),
        ERROR_INTERNAL(-1),
        ERROR_NOT_AUTHORIZED(-2),
        ERROR_UNSUPPORTED_LOCATION(-3);

        final int nativeCode;

        TerrainAnchorState(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static TerrainAnchorState forNumber(int i9) {
            for (TerrainAnchorState terrainAnchorState : values()) {
                if (terrainAnchorState.nativeCode == i9) {
                    return terrainAnchorState;
                }
            }
            throw new FatalException(A.a("Unexpected value for native TerrainAnchorState, value=", (byte) 54, i9));
        }

        public boolean isError() {
            return this.nativeCode < 0;
        }
    }

    public Anchor() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    private native void nativeDetach(long j7, long j9);

    private native String nativeGetCloudAnchorId(long j7, long j9);

    private native int nativeGetCloudAnchorState(long j7, long j9);

    private native Pose nativeGetPose(long j7, long j9);

    private native int nativeGetTerrainAnchorState(long j7, long j9);

    private native int nativeGetTrackingState(long j7, long j9);

    public static native void nativeReleaseAnchor(long j7, long j9);

    public void detach() {
        nativeDetach(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Anchor) || ((Anchor) obj).nativeHandle != this.nativeHandle) {
            return false;
        }
        return true;
    }

    public void finalize() throws Throwable {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeReleaseAnchor(this.nativeSymbolTableHandle, j7);
        }
        super.finalize();
    }

    @NonNull
    @Deprecated
    public String getCloudAnchorId() {
        return nativeGetCloudAnchorId(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @NonNull
    @Deprecated
    public CloudAnchorState getCloudAnchorState() {
        return CloudAnchorState.forNumber(nativeGetCloudAnchorState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @NonNull
    @Deprecated
    public TerrainAnchorState getTerrainAnchorState() {
        return TerrainAnchorState.forNumber(nativeGetTerrainAnchorState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    public Anchor(long j7, Session session) {
        this.session = session;
        this.nativeHandle = j7;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}

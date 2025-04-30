package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.exceptions.FatalException;
import java.util.Collection;

/* loaded from: classes2.dex */
public class AugmentedImage extends TrackableBase {

    /* loaded from: classes2.dex */
    public enum TrackingMethod {
        NOT_TRACKING(0),
        FULL_TRACKING(1),
        LAST_KNOWN_POSE(2);

        final int nativeCode;

        TrackingMethod(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static TrackingMethod forNumber(int i9) {
            for (TrackingMethod trackingMethod : values()) {
                if (trackingMethod.nativeCode == i9) {
                    return trackingMethod;
                }
            }
            throw new FatalException(A.a("Unexpected value for native TrackingMethod, value=", (byte) 50, i9));
        }
    }

    public AugmentedImage(long j7, Session session) {
        super(j7, session);
    }

    private native Pose nativeGetCenterPose(long j7, long j9);

    private native float nativeGetExtentX(long j7, long j9);

    private native float nativeGetExtentZ(long j7, long j9);

    private native int nativeGetIndex(long j7, long j9);

    private native String nativeGetName(long j7, long j9);

    private native int nativeGetTrackingMethod(long j7, long j9);

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    @NonNull
    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    @NonNull
    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    public Pose getCenterPose() {
        return nativeGetCenterPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public float getExtentX() {
        return nativeGetExtentX(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public float getExtentZ() {
        return nativeGetExtentZ(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public int getIndex() {
        return nativeGetIndex(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public String getName() {
        return nativeGetName(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @NonNull
    public TrackingMethod getTrackingMethod() {
        return TrackingMethod.forNumber(nativeGetTrackingMethod(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    @NonNull
    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }
}

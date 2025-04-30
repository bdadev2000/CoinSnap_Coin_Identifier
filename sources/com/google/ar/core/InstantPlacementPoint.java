package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.exceptions.FatalException;
import java.util.Collection;

/* loaded from: classes2.dex */
public class InstantPlacementPoint extends TrackableBase {

    /* loaded from: classes2.dex */
    public enum TrackingMethod {
        NOT_TRACKING(0),
        SCREENSPACE_WITH_APPROXIMATE_DISTANCE(1),
        FULL_TRACKING(2);

        final int nativeCode;

        TrackingMethod(int i9) {
            this.nativeCode = i9;
        }

        public static TrackingMethod fromNumber(int i9) {
            for (TrackingMethod trackingMethod : values()) {
                if (trackingMethod.nativeCode == i9) {
                    return trackingMethod;
                }
            }
            throw new FatalException(A.a("Unexpected value for native InstantPlacementPoint TrackingMethod Mode, value=", (byte) 77, i9));
        }
    }

    public InstantPlacementPoint(long j7, Session session) {
        super(j7, session);
    }

    private native Pose nativeGetPose(long j7, long j9);

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

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @NonNull
    public TrackingMethod getTrackingMethod() {
        return TrackingMethod.fromNumber(nativeGetTrackingMethod(this.session.nativeWrapperHandle, this.nativeHandle));
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

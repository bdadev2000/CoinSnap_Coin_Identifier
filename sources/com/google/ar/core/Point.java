package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.exceptions.FatalException;
import java.util.Collection;

/* loaded from: classes2.dex */
public class Point extends TrackableBase {

    /* loaded from: classes2.dex */
    public enum OrientationMode {
        INITIALIZED_TO_IDENTITY(0),
        ESTIMATED_SURFACE_NORMAL(1);

        private final int nativeCode;

        OrientationMode(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static OrientationMode forNumber(int i9) {
            for (OrientationMode orientationMode : values()) {
                if (orientationMode.nativeCode == i9) {
                    return orientationMode;
                }
            }
            throw new FatalException(A.a("Unexpected value for native Point Orientation Mode, value=", (byte) 58, i9));
        }
    }

    public Point() {
        super(0L, null);
    }

    private native int nativeGetOrientationMode(long j7, long j9);

    private native Pose nativeGetPose(long j7, long j9);

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

    @NonNull
    public OrientationMode getOrientationMode() {
        return OrientationMode.forNumber(nativeGetOrientationMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
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

    public Point(long j7, Session session) {
        super(j7, session);
    }
}

package com.google.ar.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ar.core.exceptions.FatalException;
import java.nio.FloatBuffer;
import java.util.Collection;

/* loaded from: classes2.dex */
public class Plane extends TrackableBase {

    /* loaded from: classes2.dex */
    public enum Type {
        HORIZONTAL_UPWARD_FACING(0),
        HORIZONTAL_DOWNWARD_FACING(1),
        VERTICAL(2);

        final int nativeCode;

        Type(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static Type forNumber(int i9) {
            for (Type type : values()) {
                if (type.nativeCode == i9) {
                    return type;
                }
            }
            throw new FatalException(A.a("Unexpected value for native Plane.Type, value=", (byte) 46, i9));
        }
    }

    public Plane() {
        super(0L, null);
    }

    private native long nativeAcquireSubsumedBy(long j7, long j9);

    private native Pose nativeGetCenterPose(long j7, long j9);

    private native float nativeGetExtentX(long j7, long j9);

    private native float nativeGetExtentZ(long j7, long j9);

    private native float[] nativeGetPolygon(long j7, long j9);

    private native int nativeGetType(long j7, long j9);

    private native boolean nativeIsPoseInExtents(long j7, long j9, Pose pose);

    private native boolean nativeIsPoseInPolygon(long j7, long j9, Pose pose);

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

    @NonNull
    public FloatBuffer getPolygon() {
        return FloatBuffer.wrap(nativeGetPolygon(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Nullable
    public Plane getSubsumedBy() {
        long nativeAcquireSubsumedBy = nativeAcquireSubsumedBy(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeAcquireSubsumedBy == 0) {
            return null;
        }
        return new Plane(nativeAcquireSubsumedBy, this.session);
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    @NonNull
    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    @NonNull
    public Type getType() {
        return Type.forNumber(nativeGetType(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public boolean isPoseInExtents(Pose pose) {
        return nativeIsPoseInExtents(this.session.nativeWrapperHandle, this.nativeHandle, pose);
    }

    public boolean isPoseInPolygon(Pose pose) {
        return nativeIsPoseInPolygon(this.session.nativeWrapperHandle, this.nativeHandle, pose);
    }

    public Plane(long j7, Session session) {
        super(j7, session);
    }
}

package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.exceptions.FatalException;
import java.util.Collection;

/* loaded from: classes2.dex */
public class StreetscapeGeometry extends TrackableBase {

    /* loaded from: classes2.dex */
    public enum Quality {
        NONE(0),
        BUILDING_LOD_1(1),
        BUILDING_LOD_2(2);

        final int nativeCode;

        Quality(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static Quality forNumber(int i9) {
            for (Quality quality : values()) {
                if (quality.nativeCode == i9) {
                    return quality;
                }
            }
            throw new FatalException(A.a("Unexpected value for native StreetscapeGeometry.Quality, value=", (byte) 63, i9));
        }
    }

    /* loaded from: classes2.dex */
    public enum Type {
        TERRAIN(0),
        BUILDING(1);

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
            throw new FatalException(A.a("Unexpected value for native StreetscapeGeometry.Type, value=", (byte) 60, i9));
        }
    }

    public StreetscapeGeometry(long j7, Session session) {
        super(j7, session);
    }

    private native long nativeAcquireMesh(long j7, long j9);

    private native Pose nativeGetMeshPose(long j7, long j9);

    private native int nativeGetQuality(long j7, long j9);

    private native int nativeGetType(long j7, long j9);

    private native void nativeReleaseStreetscapeGeometry(long j7, long j9);

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    @NonNull
    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.ar.core.TrackableBase
    public void finalize() throws Throwable {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeReleaseStreetscapeGeometry(this.session.nativeSymbolTableHandle, j7);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    @NonNull
    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    public Mesh getMesh() {
        long nativeAcquireMesh = nativeAcquireMesh(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeAcquireMesh != 0) {
            return new Mesh(nativeAcquireMesh, this.session);
        }
        return null;
    }

    public Pose getMeshPose() {
        return nativeGetMeshPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Quality getQuality() {
        return Quality.forNumber(nativeGetQuality(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    @NonNull
    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    public Type getType() {
        return Type.forNumber(nativeGetType(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }
}

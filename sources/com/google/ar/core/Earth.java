package com.google.ar.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ar.core.Anchor;
import com.google.ar.core.ResolveAnchorOnRooftopFuture;
import com.google.ar.core.ResolveAnchorOnTerrainFuture;
import com.google.ar.core.exceptions.FatalException;
import java.util.Collection;
import java.util.function.BiConsumer;

/* loaded from: classes2.dex */
public class Earth extends TrackableBase {

    /* loaded from: classes2.dex */
    public enum EarthState {
        ENABLED(0),
        ERROR_INTERNAL(-1),
        ERROR_GEOSPATIAL_MODE_DISABLED(-2),
        ERROR_NOT_AUTHORIZED(-3),
        ERROR_RESOURCE_EXHAUSTED(-4),
        ERROR_APK_VERSION_TOO_OLD(-5);

        final int nativeCode;

        EarthState(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static EarthState forNumber(int i9) {
            for (EarthState earthState : values()) {
                if (earthState.nativeCode == i9) {
                    return earthState;
                }
            }
            throw new FatalException(A.a("Unexpected value for native EarthState, value=", (byte) 46, i9));
        }
    }

    public Earth(long j7, Session session) {
        super(j7, session);
    }

    private native long nativeCreateAnchor(long j7, long j9, double d2, double d9, double d10, float f9, float f10, float f11, float f12);

    private native long nativeGetCameraGeospatialPose(long j7, long j9);

    private native int nativeGetEarthState(long j7, long j9);

    private native long nativeGetGeospatialPose(long j7, long j9, Pose pose);

    private native Pose nativeGetPose(long j7, long j9, double d2, double d9, double d10, float f9, float f10, float f11, float f12);

    private native int nativeGetTrackingState(long j7, long j9);

    private native void nativeReleaseEarth(long j7, long j9);

    private native long[] nativeResolveAnchorOnRooftopAsync(long j7, long j9, double d2, double d9, double d10, float f9, float f10, float f11, float f12, ResolveAnchorOnRooftopFuture.CallbackWrapper callbackWrapper);

    private native long nativeResolveAnchorOnTerrain(long j7, long j9, double d2, double d9, double d10, float f9, float f10, float f11, float f12);

    private native long[] nativeResolveAnchorOnTerrainAsync(long j7, long j9, double d2, double d9, double d10, float f9, float f10, float f11, float f12, ResolveAnchorOnTerrainFuture.CallbackWrapper callbackWrapper);

    @NonNull
    public Anchor createAnchor(double d2, double d9, double d10, float f9, float f10, float f11, float f12) {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle, d2, d9, d10, f9, f10, f11, f12), this.session);
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.ar.core.TrackableBase
    public void finalize() throws Throwable {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeReleaseEarth(this.nativeSymbolTableHandle, j7);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    @NonNull
    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    @NonNull
    public GeospatialPose getCameraGeospatialPose() {
        return new GeospatialPose(nativeGetCameraGeospatialPose(this.session.nativeWrapperHandle, this.nativeHandle), this.session);
    }

    @NonNull
    public EarthState getEarthState() {
        return EarthState.forNumber(nativeGetEarthState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public GeospatialPose getGeospatialPose(Pose pose) {
        return new GeospatialPose(nativeGetGeospatialPose(this.session.nativeWrapperHandle, this.nativeHandle, pose), this.session);
    }

    @NonNull
    public Pose getPose(double d2, double d9, double d10, float f9, float f10, float f11, float f12) {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle, d2, d9, d10, f9, f10, f11, f12);
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    @NonNull
    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public ResolveAnchorOnRooftopFuture resolveAnchorOnRooftopAsync(double d2, double d9, double d10, float f9, float f10, float f11, float f12, @Nullable BiConsumer<Anchor, Anchor.RooftopAnchorState> biConsumer) {
        ResolveAnchorOnRooftopFuture.CallbackWrapper callbackWrapper;
        if (biConsumer != null) {
            callbackWrapper = new ResolveAnchorOnRooftopFuture.CallbackWrapper(this.session, biConsumer);
        } else {
            callbackWrapper = null;
        }
        long[] nativeResolveAnchorOnRooftopAsync = nativeResolveAnchorOnRooftopAsync(this.session.nativeWrapperHandle, this.nativeHandle, d2, d9, d10, f9, f10, f11, f12, callbackWrapper);
        return new ResolveAnchorOnRooftopFuture(this.session, nativeResolveAnchorOnRooftopAsync[0], nativeResolveAnchorOnRooftopAsync[1]);
    }

    @NonNull
    @Deprecated
    public Anchor resolveAnchorOnTerrain(double d2, double d9, double d10, float f9, float f10, float f11, float f12) {
        return new Anchor(nativeResolveAnchorOnTerrain(this.session.nativeWrapperHandle, this.nativeHandle, d2, d9, d10, f9, f10, f11, f12), this.session);
    }

    @NonNull
    public ResolveAnchorOnTerrainFuture resolveAnchorOnTerrainAsync(double d2, double d9, double d10, float f9, float f10, float f11, float f12, @Nullable BiConsumer<Anchor, Anchor.TerrainAnchorState> biConsumer) {
        ResolveAnchorOnTerrainFuture.CallbackWrapper callbackWrapper;
        if (biConsumer != null) {
            callbackWrapper = new ResolveAnchorOnTerrainFuture.CallbackWrapper(this.session, biConsumer);
        } else {
            callbackWrapper = null;
        }
        long[] nativeResolveAnchorOnTerrainAsync = nativeResolveAnchorOnTerrainAsync(this.session.nativeWrapperHandle, this.nativeHandle, d2, d9, d10, f9, f10, f11, f12, callbackWrapper);
        return new ResolveAnchorOnTerrainFuture(this.session, nativeResolveAnchorOnTerrainAsync[0], nativeResolveAnchorOnTerrainAsync[1]);
    }

    @NonNull
    public Anchor createAnchor(double d2, double d9, double d10, float[] fArr) {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle, d2, d9, d10, fArr[0], fArr[1], fArr[2], fArr[3]), this.session);
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    @Deprecated
    public Anchor createAnchor(Pose pose) {
        throw new IllegalArgumentException("Earth does not support createAnchor using a Pose. Use createAnchor with Geospatial coordinates instead.");
    }
}

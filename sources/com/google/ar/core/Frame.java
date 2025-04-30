package com.google.ar.core;

import android.hardware.HardwareBuffer;
import android.media.Image;
import android.os.Build;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.ar.core.exceptions.NotYetAvailableException;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public class Frame {
    static final ArrayList<Anchor> ANCHORS_EMPTY_LIST = new ArrayList<>();
    static final ArrayList<Plane> PLANES_EMPTY_LIST = new ArrayList<>();
    private static final String TAG = "ARCore-Frame";
    private LightEstimate lightEstimate;
    long nativeHandle;
    final long nativeSymbolTableHandle;
    final Session session;

    public Frame() {
        this.nativeHandle = 0L;
        this.session = null;
        this.nativeSymbolTableHandle = 0L;
    }

    private List<HitResult> convertNativeHitResultsToList(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j7 : jArr) {
            HitResult hitResult = new HitResult(j7, this.session);
            if (hitResult.getTrackable() != null) {
                arrayList.add(hitResult);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private native long nativeAcquireCameraImage(long j7, long j9);

    private native long nativeAcquireDepthImage(long j7, long j9);

    private native long nativeAcquireDepthImage16Bits(long j7, long j9);

    private native long nativeAcquireImageMetadata(long j7, long j9);

    private native long nativeAcquireRawDepthConfidenceImage(long j7, long j9);

    private native long nativeAcquireRawDepthImage(long j7, long j9);

    private native long nativeAcquireRawDepthImage16Bits(long j7, long j9);

    private native long nativeAcquireSemanticConfidenceImage(long j7, long j9);

    private native long nativeAcquireSemanticImage(long j7, long j9);

    private native long[] nativeAcquireTrackData(long j7, long j9, byte[] bArr);

    private native long[] nativeAcquireUpdatedAnchors(long j7, long j9);

    private static native long nativeCreateFrame(long j7);

    private static native void nativeDestroyFrame(long j7, long j9);

    private native long nativeGetAndroidCameraTimestamp(long j7, long j9);

    private native Pose nativeGetAndroidSensorPose(long j7, long j9);

    private native int nativeGetCameraTextureName(long j7, long j9);

    private native HardwareBuffer nativeGetHardwareBuffer(long j7, long j9);

    private native void nativeGetLightEstimate(long j7, long j9, long j10);

    private native float nativeGetSemanticLabelFraction(long j7, long j9, int i9);

    private native long nativeGetTimestamp(long j7, long j9);

    private native boolean nativeHasDisplayGeometryChanged(long j7, long j9);

    private native void nativeRecordTrackData(long j7, long j9, byte[] bArr, byte[] bArr2);

    private native void nativeTransformCoordinates2dFloatArrayOrBuffer(long j7, long j9, int i9, Object obj, int i10, Object obj2);

    private native void nativeTransformCoordinates3dFloatArrayOrBuffer(long j7, long j9, int i9, Object obj, int i10, Object obj2);

    private native void nativeTransformDisplayUvCoords(long j7, long j9, FloatBuffer floatBuffer, FloatBuffer floatBuffer2);

    @NonNull
    public Image acquireCameraImage() throws NotYetAvailableException {
        return new ArImage(this.session, nativeAcquireCameraImage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    @Deprecated(forRemoval = true)
    public Image acquireDepthImage() throws NotYetAvailableException {
        return new ArImage(this.session, nativeAcquireDepthImage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public Image acquireDepthImage16Bits() throws NotYetAvailableException {
        return new ArImage(this.session, nativeAcquireDepthImage16Bits(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public PointCloud acquirePointCloud() {
        return new PointCloud(this.session, nativeAcquirePointCloud(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public Image acquireRawDepthConfidenceImage() throws NotYetAvailableException {
        return new ArImage(this.session, nativeAcquireRawDepthConfidenceImage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    @Deprecated(forRemoval = true)
    public Image acquireRawDepthImage() throws NotYetAvailableException {
        return new ArImage(this.session, nativeAcquireRawDepthImage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public Image acquireRawDepthImage16Bits() throws NotYetAvailableException {
        return new ArImage(this.session, nativeAcquireRawDepthImage16Bits(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public Image acquireSemanticConfidenceImage() throws NotYetAvailableException {
        return new ArImage(this.session, nativeAcquireSemanticConfidenceImage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public Image acquireSemanticImage() throws NotYetAvailableException {
        return new ArImage(this.session, nativeAcquireSemanticImage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public void finalize() throws Throwable {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeDestroyFrame(this.nativeSymbolTableHandle, j7);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    public long getAndroidCameraTimestamp() {
        return nativeGetAndroidCameraTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public Pose getAndroidSensorPose() {
        return nativeGetAndroidSensorPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @NonNull
    public Camera getCamera() {
        return new Camera(this.session, this);
    }

    public int getCameraTextureName() {
        return nativeGetCameraTextureName(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @RequiresApi(27)
    public HardwareBuffer getHardwareBuffer() throws NotYetAvailableException, IllegalStateException {
        if (Build.VERSION.SDK_INT >= 27) {
            return nativeGetHardwareBuffer(this.session.nativeWrapperHandle, this.nativeHandle);
        }
        throw new IllegalStateException("Hardware Buffer isn't supported is current Android version");
    }

    @NonNull
    public ImageMetadata getImageMetadata() throws NotYetAvailableException {
        return new ImageMetadata(nativeAcquireImageMetadata(this.session.nativeWrapperHandle, this.nativeHandle), this.session);
    }

    @NonNull
    public LightEstimate getLightEstimate() {
        if (this.lightEstimate == null) {
            this.lightEstimate = new LightEstimate(this.session);
        }
        nativeGetLightEstimate(this.session.nativeWrapperHandle, this.nativeHandle, this.lightEstimate.nativeHandle);
        return this.lightEstimate;
    }

    @NonNull
    public float getSemanticLabelFraction(SemanticLabel semanticLabel) throws NotYetAvailableException {
        return nativeGetSemanticLabelFraction(this.session.nativeWrapperHandle, this.nativeHandle, semanticLabel.nativeCode);
    }

    public long getTimestamp() {
        return nativeGetTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @NonNull
    public Collection<Anchor> getUpdatedAnchors() {
        return this.session.convertNativeAnchorsToCollection(nativeAcquireUpdatedAnchors(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public Collection<TrackData> getUpdatedTrackData(UUID uuid) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return this.session.convertNativeTrackDataToCollection(nativeAcquireTrackData(this.session.nativeWrapperHandle, this.nativeHandle, wrap.array()));
    }

    @NonNull
    public <T extends Trackable> Collection<T> getUpdatedTrackables(Class<T> cls) {
        EnumC1861g enumC1861g;
        EnumC1861g enumC1861g2;
        EnumC1861g[] values = EnumC1861g.values();
        int length = values.length;
        int i9 = 0;
        while (true) {
            enumC1861g = EnumC1861g.UNKNOWN_TO_JAVA;
            if (i9 < length) {
                enumC1861g2 = values[i9];
                Class cls2 = enumC1861g2.f14296c;
                if (cls2 != null && cls2.equals(cls)) {
                    break;
                }
                i9++;
            } else {
                enumC1861g2 = enumC1861g;
                break;
            }
        }
        if (enumC1861g2 == enumC1861g) {
            return Collections.emptyList();
        }
        return this.session.convertNativeTrackablesToCollection(cls, nativeAcquireUpdatedTrackables(this.session.nativeWrapperHandle, this.nativeHandle, enumC1861g2.b));
    }

    public boolean hasDisplayGeometryChanged() {
        return nativeHasDisplayGeometryChanged(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    @NonNull
    public List<HitResult> hitTest(float f9, float f10) {
        return convertNativeHitResultsToList(nativeHitTest(this.session.nativeWrapperHandle, this.nativeHandle, f9, f10));
    }

    @NonNull
    public List<HitResult> hitTestInstantPlacement(float f9, float f10, float f11) {
        return convertNativeHitResultsToList(nativeHitTestInstantPlacement(this.session.nativeWrapperHandle, this.nativeHandle, f9, f10, f11));
    }

    public native long nativeAcquirePointCloud(long j7, long j9);

    public native long[] nativeAcquireUpdatedTrackables(long j7, long j9, int i9);

    public native long[] nativeHitTest(long j7, long j9, float f9, float f10);

    public native long[] nativeHitTestInstantPlacement(long j7, long j9, float f9, float f10, float f11);

    public native long[] nativeHitTestRay(long j7, long j9, float[] fArr, int i9, float[] fArr2, int i10);

    public void recordTrackData(UUID uuid, ByteBuffer byteBuffer) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            nativeRecordTrackData(this.session.nativeWrapperHandle, this.nativeHandle, wrap.array(), byteBuffer.array());
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        nativeRecordTrackData(this.session.nativeWrapperHandle, this.nativeHandle, wrap.array(), bArr);
    }

    public void transformCoordinates2d(Coordinates2d coordinates2d, FloatBuffer floatBuffer, Coordinates2d coordinates2d2, FloatBuffer floatBuffer2) {
        nativeTransformCoordinates2dFloatArrayOrBuffer(this.session.nativeWrapperHandle, this.nativeHandle, coordinates2d.nativeCode, floatBuffer, coordinates2d2.nativeCode, floatBuffer2);
    }

    public void transformCoordinates3d(Coordinates2d coordinates2d, FloatBuffer floatBuffer, Coordinates3d coordinates3d, FloatBuffer floatBuffer2) {
        nativeTransformCoordinates3dFloatArrayOrBuffer(this.session.nativeWrapperHandle, this.nativeHandle, coordinates2d.nativeCode, floatBuffer, coordinates3d.nativeCode, floatBuffer2);
    }

    @Deprecated
    public void transformDisplayUvCoords(FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (floatBuffer.isDirect() && floatBuffer2.isDirect()) {
            nativeTransformDisplayUvCoords(this.session.nativeWrapperHandle, this.nativeHandle, floatBuffer, floatBuffer2);
            return;
        }
        throw new IllegalArgumentException("transformDisplayUvCoords currently requires direct buffers.");
    }

    public Frame(Session session) {
        this(session, nativeCreateFrame(session.nativeWrapperHandle));
    }

    public void transformCoordinates2d(Coordinates2d coordinates2d, float[] fArr, Coordinates2d coordinates2d2, float[] fArr2) {
        nativeTransformCoordinates2dFloatArrayOrBuffer(this.session.nativeWrapperHandle, this.nativeHandle, coordinates2d.nativeCode, fArr, coordinates2d2.nativeCode, fArr2);
    }

    public void transformCoordinates3d(Coordinates2d coordinates2d, float[] fArr, Coordinates3d coordinates3d, float[] fArr2) {
        nativeTransformCoordinates3dFloatArrayOrBuffer(this.session.nativeWrapperHandle, this.nativeHandle, coordinates2d.nativeCode, fArr, coordinates3d.nativeCode, fArr2);
    }

    public Frame(Session session, long j7) {
        this.session = session;
        this.nativeHandle = j7;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    @NonNull
    public List<HitResult> hitTest(MotionEvent motionEvent) {
        return hitTest(motionEvent.getX(), motionEvent.getY());
    }

    @NonNull
    public List<HitResult> hitTest(float[] fArr, int i9, float[] fArr2, int i10) {
        return convertNativeHitResultsToList(nativeHitTestRay(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i9, fArr2, i10));
    }
}

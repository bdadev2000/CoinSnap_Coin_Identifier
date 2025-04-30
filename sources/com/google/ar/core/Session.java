package com.google.ar.core;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ar.core.Anchor;
import com.google.ar.core.Config;
import com.google.ar.core.HostCloudAnchorFuture;
import com.google.ar.core.ResolveCloudAnchorFuture;
import com.google.ar.core.VpsAvailabilityFuture;
import com.google.ar.core.annotations.UsedByNative;
import com.google.ar.core.exceptions.CameraNotAvailableException;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.PlaybackFailedException;
import com.google.ar.core.exceptions.RecordingFailedException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public class Session {
    private static final String TAG = "ARCore-Session";
    final A faceCache;
    final long nativeSymbolTableHandle;
    long nativeWrapperHandle;
    private SharedCamera sharedCamera;

    /* loaded from: classes2.dex */
    public enum Feature {
        FRONT_CAMERA(1),
        SHARED_CAMERA(1000);

        final int nativeCode;

        Feature(int i9) {
            this.nativeCode = i9;
        }
    }

    /* loaded from: classes2.dex */
    public enum FeatureMapQuality {
        INSUFFICIENT(0),
        SUFFICIENT(1),
        GOOD(2);

        final int nativeCode;

        FeatureMapQuality(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static FeatureMapQuality forNumber(int i9) {
            for (FeatureMapQuality featureMapQuality : values()) {
                if (featureMapQuality.nativeCode == i9) {
                    return featureMapQuality;
                }
            }
            throw new FatalException(A.a("Unexpected value for native FeatureMapQuality, value=", (byte) 53, i9));
        }
    }

    public Session() {
        this.faceCache = new A();
        this.sharedCamera = null;
        this.nativeWrapperHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    @NonNull
    @Deprecated
    public static Session createForSharedCamera(Context context) throws UnavailableArcoreNotInstalledException, UnavailableApkTooOldException, UnavailableSdkTooOldException, UnavailableDeviceNotCompatibleException {
        return new Session(context, EnumSet.of(Feature.SHARED_CAMERA));
    }

    public static ByteBuffer directByteBufferOrDefault(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        }
        return byteBuffer.order(ByteOrder.nativeOrder());
    }

    public static void loadDynamicSymbolsAfterSessionCreate() {
        ArImage.nativeLoadSymbols();
        ImageMetadata.nativeLoadSymbols();
    }

    private native long[] nativeAcquireAllAnchors(long j7);

    private native long nativeAcquireEarth(long j7);

    private native int nativeCheckModuleAvailability(long j7, int i9);

    private native void nativeCloseSession(long j7);

    private native void nativeConfigure(long j7, long j9);

    private native long nativeCreateAnchor(long j7, Pose pose);

    private static native long nativeCreateSessionAndWrapperWithFeatures(Context context, int[] iArr) throws UnavailableArcoreNotInstalledException, UnavailableApkTooOldException, UnavailableSdkTooOldException, UnavailableDeviceNotCompatibleException;

    public static native long nativeCreateSessionWrapperFromHandle(long j7, long j9);

    private native int nativeEstimateFeatureMapQualityForHosting(long j7, Pose pose);

    private native long nativeGetCameraConfig(long j7);

    private native void nativeGetConfig(long j7, long j9);

    private native int nativeGetPlaybackStatus(long j7);

    private native void nativeGetRandomAccessStats(long j7, long j9);

    private native int nativeGetRecordingStatus(long j7);

    private native long[] nativeGetSupportedCameraConfigs(long j7);

    private native long[] nativeGetSupportedCameraConfigsWithFilter(long j7, long j9);

    private native long nativeGetSymbolTable(long j7);

    private native long nativeHostCloudAnchor(long j7, long j9);

    private native long[] nativeHostCloudAnchorAsync(long j7, long j9, int i9, HostCloudAnchorFuture.CallbackWrapper callbackWrapper);

    private native long nativeHostCloudAnchorWithTtl(long j7, long j9, int i9);

    private native boolean nativeIsSupported(long j7, long j9);

    private native void nativePause(long j7);

    private native void nativeRequestModuleInstallDeferred(long j7, int[] iArr);

    private native void nativeRequestModuleInstallImmediate(long j7, int[] iArr);

    private native long nativeResolveCloudAnchor(long j7, String str);

    private native long[] nativeResolveCloudAnchorAsync(long j7, String str, ResolveCloudAnchorFuture.CallbackWrapper callbackWrapper);

    private native void nativeResume(long j7);

    private native int nativeSetCameraConfig(long j7, long j9);

    private native void nativeSetCameraTextureName(long j7, int i9);

    private native void nativeSetCameraTextureNames(long j7, int[] iArr);

    private native void nativeSetDisplayGeometry(long j7, int i9, int i10, int i11);

    private native void nativeSetPlaybackDataset(long j7, String str);

    private native void nativeSetPlaybackDatasetUri(long j7, String str);

    private native void nativeStartRecording(long j7, long j9);

    private native void nativeStopRecording(long j7);

    private native void nativeUpdate(long j7, long j9);

    private void pauseSharedCameraIfInUse() {
        SharedCamera sharedCamera = this.sharedCamera;
        if (sharedCamera != null) {
            sharedCamera.pause();
        }
    }

    public static void throwExceptionFromArStatus(int i9) throws Exception {
        throwExceptionFromArStatus(null, i9, null, null);
    }

    @NonNull
    public VpsAvailabilityFuture checkVpsAvailabilityAsync(double d2, double d9, @Nullable Consumer<VpsAvailability> consumer) {
        VpsAvailabilityFuture.CallbackWrapper callbackWrapper;
        if (consumer != null) {
            callbackWrapper = new VpsAvailabilityFuture.CallbackWrapper(consumer);
        } else {
            callbackWrapper = null;
        }
        long[] nativeCheckVpsAvailabilityAsync = nativeCheckVpsAvailabilityAsync(this.nativeWrapperHandle, d2, d9, callbackWrapper);
        return new VpsAvailabilityFuture(this, nativeCheckVpsAvailabilityAsync[0], nativeCheckVpsAvailabilityAsync[1]);
    }

    public void close() {
        nativeCloseSession(this.nativeWrapperHandle);
    }

    public void configure(Config config) {
        nativeConfigure(this.nativeWrapperHandle, config.nativeHandle);
    }

    @NonNull
    public Collection<Anchor> convertNativeAnchorsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j7 : jArr) {
            arrayList.add(new Anchor(j7, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    @NonNull
    public List<CameraConfig> convertNativeCameraConfigsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j7 : jArr) {
            arrayList.add(new CameraConfig(this, j7));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Collection<TrackData> convertNativeTrackDataToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j7 : jArr) {
            arrayList.add(new TrackData(j7, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public <T extends Trackable> Collection<T> convertNativeTrackablesToCollection(Class<T> cls, long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j7 : jArr) {
            Trackable createTrackable = createTrackable(j7);
            if (createTrackable != null) {
                arrayList.add(cls.cast(createTrackable));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @NonNull
    public Anchor createAnchor(Pose pose) {
        return new Anchor(nativeCreateAnchor(this.nativeWrapperHandle, pose), this);
    }

    public Trackable createTrackable(long j7) {
        EnumC1861g enumC1861g;
        AugmentedFace augmentedFace;
        int internalGetType = TrackableBase.internalGetType(this.nativeWrapperHandle, j7);
        EnumC1861g[] values = EnumC1861g.values();
        int length = values.length;
        int i9 = 0;
        while (true) {
            if (i9 < length) {
                enumC1861g = values[i9];
                if (enumC1861g.b == internalGetType) {
                    break;
                }
                i9++;
            } else {
                enumC1861g = null;
                break;
            }
        }
        if (enumC1861g != null) {
            switch (enumC1861g.ordinal()) {
                case 0:
                case 1:
                    return null;
                case 2:
                    return new Plane(j7, this);
                case 3:
                    return new Point(j7, this);
                case 4:
                    return new AugmentedImage(j7, this);
                case 5:
                    A a6 = this.faceCache;
                    synchronized (a6) {
                        z zVar = a6.f14250a;
                        Long valueOf = Long.valueOf(j7);
                        augmentedFace = (AugmentedFace) zVar.get(valueOf);
                        if (augmentedFace == null) {
                            augmentedFace = new AugmentedFace(j7, this);
                            a6.f14250a.put(valueOf, augmentedFace);
                        }
                    }
                    return augmentedFace;
                case 6:
                    return new StreetscapeGeometry(j7, this);
                case 7:
                    return getEarth();
                case 8:
                    return new DepthPoint(j7, this);
                case 9:
                    return new InstantPlacementPoint(j7, this);
                default:
                    throw null;
            }
        }
        TrackableBase.internalReleaseNativeHandle(this.nativeSymbolTableHandle, j7);
        return null;
    }

    @NonNull
    public FeatureMapQuality estimateFeatureMapQualityForHosting(Pose pose) {
        return FeatureMapQuality.forNumber(nativeEstimateFeatureMapQualityForHosting(this.nativeWrapperHandle, pose));
    }

    public void finalize() throws Throwable {
        long j7 = this.nativeWrapperHandle;
        if (j7 != 0) {
            nativeDestroySessionWrapper(j7);
            this.nativeWrapperHandle = 0L;
        }
        super.finalize();
    }

    @NonNull
    public Collection<Anchor> getAllAnchors() {
        return convertNativeAnchorsToCollection(nativeAcquireAllAnchors(this.nativeWrapperHandle));
    }

    @NonNull
    public <T extends Trackable> Collection<T> getAllTrackables(Class<T> cls) {
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
        return convertNativeTrackablesToCollection(cls, nativeAcquireAllTrackables(this.nativeWrapperHandle, enumC1861g2.b));
    }

    @NonNull
    public CameraConfig getCameraConfig() {
        return new CameraConfig(this, nativeGetCameraConfig(this.nativeWrapperHandle));
    }

    @NonNull
    public Config getConfig() {
        Config config = new Config(this);
        getConfig(config);
        return config;
    }

    @Nullable
    public Earth getEarth() {
        long nativeAcquireEarth = nativeAcquireEarth(this.nativeWrapperHandle);
        if (nativeAcquireEarth != 0) {
            return new Earth(nativeAcquireEarth, this);
        }
        return null;
    }

    @NonNull
    public PlaybackStatus getPlaybackStatus() {
        return PlaybackStatus.forNumber(nativeGetPlaybackStatus(this.nativeWrapperHandle));
    }

    @NonNull
    public RecordingStatus getRecordingStatus() {
        return RecordingStatus.forNumber(nativeGetRecordingStatus(this.nativeWrapperHandle));
    }

    @NonNull
    public SharedCamera getSharedCamera() {
        SharedCamera sharedCamera = this.sharedCamera;
        if (sharedCamera != null) {
            return sharedCamera;
        }
        throw new IllegalStateException("Shared camera is not in use, please create session using new Session(context, EnumSet.of(Session.Feature.SHARED_CAMERA)).");
    }

    @NonNull
    @Deprecated
    public List<CameraConfig> getSupportedCameraConfigs() {
        return convertNativeCameraConfigsToCollection(nativeGetSupportedCameraConfigs(this.nativeWrapperHandle));
    }

    @NonNull
    @Deprecated
    public Anchor hostCloudAnchor(Anchor anchor) {
        return new Anchor(nativeHostCloudAnchor(this.nativeWrapperHandle, anchor.nativeHandle), this);
    }

    @NonNull
    public HostCloudAnchorFuture hostCloudAnchorAsync(Anchor anchor, int i9, @Nullable BiConsumer<String, Anchor.CloudAnchorState> biConsumer) {
        HostCloudAnchorFuture.CallbackWrapper callbackWrapper;
        if (biConsumer != null) {
            callbackWrapper = new HostCloudAnchorFuture.CallbackWrapper(biConsumer);
        } else {
            callbackWrapper = null;
        }
        long[] nativeHostCloudAnchorAsync = nativeHostCloudAnchorAsync(this.nativeWrapperHandle, anchor.nativeHandle, i9, callbackWrapper);
        return new HostCloudAnchorFuture(this, nativeHostCloudAnchorAsync[0], nativeHostCloudAnchorAsync[1]);
    }

    @NonNull
    @Deprecated
    public Anchor hostCloudAnchorWithTtl(Anchor anchor, int i9) {
        return new Anchor(nativeHostCloudAnchorWithTtl(this.nativeWrapperHandle, anchor.nativeHandle, i9), this);
    }

    public boolean isDepthModeSupported(Config.DepthMode depthMode) {
        return nativeIsDepthModeSupported(this.nativeWrapperHandle, depthMode.nativeCode);
    }

    public boolean isGeospatialModeSupported(Config.GeospatialMode geospatialMode) {
        return nativeIsGeospatialModeSupported(this.nativeWrapperHandle, geospatialMode.nativeCode);
    }

    public boolean isImageStabilizationModeSupported(Config.ImageStabilizationMode imageStabilizationMode) {
        return nativeIsImageStabilizationModeSupported(this.nativeWrapperHandle, imageStabilizationMode.nativeCode);
    }

    public boolean isSemanticModeSupported(Config.SemanticMode semanticMode) {
        return nativeIsSemanticModeSupported(this.nativeWrapperHandle, semanticMode.nativeCode);
    }

    public boolean isSharedCameraUsed() {
        return this.sharedCamera != null;
    }

    @Deprecated
    public boolean isSupported(Config config) {
        return nativeIsSupported(this.nativeWrapperHandle, config.nativeHandle);
    }

    public native long[] nativeAcquireAllTrackables(long j7, int i9);

    public native long[] nativeCheckVpsAvailabilityAsync(long j7, double d2, double d9, VpsAvailabilityFuture.CallbackWrapper callbackWrapper);

    public native void nativeDestroySessionWrapper(long j7);

    public native long nativeGetSessionNativeHandle(long j7);

    public native boolean nativeIsDepthModeSupported(long j7, int i9);

    public native boolean nativeIsGeospatialModeSupported(long j7, int i9);

    public native boolean nativeIsImageStabilizationModeSupported(long j7, int i9);

    public native boolean nativeIsSemanticModeSupported(long j7, int i9);

    public native long nativeReleaseSessionOwnership(long j7);

    public void pause() {
        pauseSharedCameraIfInUse();
        nativePause(this.nativeWrapperHandle);
    }

    @NonNull
    @Deprecated
    public Anchor resolveCloudAnchor(String str) {
        return new Anchor(nativeResolveCloudAnchor(this.nativeWrapperHandle, str), this);
    }

    @NonNull
    public ResolveCloudAnchorFuture resolveCloudAnchorAsync(String str, @Nullable BiConsumer<Anchor, Anchor.CloudAnchorState> biConsumer) {
        ResolveCloudAnchorFuture.CallbackWrapper callbackWrapper;
        if (biConsumer != null) {
            callbackWrapper = new ResolveCloudAnchorFuture.CallbackWrapper(this, biConsumer);
        } else {
            callbackWrapper = null;
        }
        long[] nativeResolveCloudAnchorAsync = nativeResolveCloudAnchorAsync(this.nativeWrapperHandle, str, callbackWrapper);
        return new ResolveCloudAnchorFuture(this, nativeResolveCloudAnchorAsync[0], nativeResolveCloudAnchorAsync[1]);
    }

    public void resume() throws CameraNotAvailableException {
        nativeResume(this.nativeWrapperHandle);
    }

    public void setCameraConfig(CameraConfig cameraConfig) {
        nativeSetCameraConfig(this.nativeWrapperHandle, cameraConfig.nativeHandle);
    }

    public void setCameraTextureName(int i9) {
        nativeSetCameraTextureName(this.nativeWrapperHandle, i9);
    }

    public void setCameraTextureNames(int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            nativeSetCameraTextureNames(this.nativeWrapperHandle, iArr);
            return;
        }
        throw new IllegalArgumentException("textureIds must be an array with at least 1 entry.");
    }

    public void setDisplayGeometry(int i9, int i10, int i11) {
        nativeSetDisplayGeometry(this.nativeWrapperHandle, i9, i10, i11);
    }

    @Deprecated
    public void setPlaybackDataset(String str) throws PlaybackFailedException {
        nativeSetPlaybackDataset(this.nativeWrapperHandle, str);
    }

    public void setPlaybackDatasetUri(Uri uri) throws PlaybackFailedException {
        nativeSetPlaybackDatasetUri(this.nativeWrapperHandle, uri.toString());
    }

    public void startRecording(RecordingConfig recordingConfig) throws RecordingFailedException {
        if (recordingConfig != null) {
            nativeStartRecording(this.nativeWrapperHandle, recordingConfig.nativeHandle);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void stopRecording() throws RecordingFailedException {
        nativeStopRecording(this.nativeWrapperHandle);
    }

    @NonNull
    public Frame update() throws CameraNotAvailableException {
        Frame frame = new Frame(this);
        nativeUpdate(this.nativeWrapperHandle, frame.nativeHandle);
        return frame;
    }

    public Session(long j7) {
        this.faceCache = new A();
        this.sharedCamera = null;
        this.nativeWrapperHandle = j7;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(j7);
    }

    @UsedByNative("session_jni.cc")
    public static void throwExceptionFromArStatus(String str, int i9, String[] strArr, int[] iArr) throws Exception {
        int i10;
        for (EnumC1860f enumC1860f : EnumC1860f.values()) {
            if (enumC1860f.b == i9) {
                Class cls = enumC1860f.f14292c;
                if (cls == null) {
                    return;
                }
                if (strArr == null || iArr == null || (i10 = strArr.length) != iArr.length) {
                    i10 = 0;
                }
                String str2 = enumC1860f.f14293d;
                if (str2 == null && str == null) {
                    throw ((Exception) cls.getConstructor(null).newInstance(null));
                }
                if (str2 != null) {
                    str = str == null ? str2 : str2.concat(str);
                }
                Exception exc = (Exception) cls.getConstructor(String.class).newInstance(str);
                StackTraceElement[] stackTrace = exc.getStackTrace();
                StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + i10];
                int i11 = 0;
                while (i11 < i10) {
                    stackTraceElementArr[i11] = new StackTraceElement("ARCore", "native", strArr[i11], iArr[i11]);
                    i11++;
                }
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stackTraceElementArr[i11] = stackTraceElement;
                    i11++;
                }
                exc.setStackTrace(stackTraceElementArr);
                throw exc;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 23);
        sb.append("Unexpected error code: ");
        sb.append(i9);
        throw new FatalException(sb.toString());
    }

    public void getConfig(Config config) {
        nativeGetConfig(this.nativeWrapperHandle, config.nativeHandle);
    }

    @NonNull
    public List<CameraConfig> getSupportedCameraConfigs(CameraConfigFilter cameraConfigFilter) {
        if (cameraConfigFilter != null) {
            long[] nativeGetSupportedCameraConfigsWithFilter = nativeGetSupportedCameraConfigsWithFilter(this.nativeWrapperHandle, cameraConfigFilter.nativeHandle);
            ArrayList arrayList = new ArrayList(nativeGetSupportedCameraConfigsWithFilter.length);
            for (long j7 : nativeGetSupportedCameraConfigsWithFilter) {
                arrayList.add(new CameraConfig(this, j7));
            }
            return Collections.unmodifiableList(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public Session(Context context) throws UnavailableArcoreNotInstalledException, UnavailableApkTooOldException, UnavailableSdkTooOldException, UnavailableDeviceNotCompatibleException {
        this(context, EnumSet.noneOf(Feature.class));
    }

    public Session(Context context, Set<Feature> set) throws UnavailableArcoreNotInstalledException, UnavailableApkTooOldException, UnavailableSdkTooOldException, UnavailableDeviceNotCompatibleException, IllegalArgumentException {
        this.faceCache = new A();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        int[] iArr = new int[set.size() + 1];
        Iterator<Feature> it = set.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            iArr[i9] = it.next().nativeCode;
            i9++;
        }
        iArr[i9] = 0;
        long nativeCreateSessionAndWrapperWithFeatures = nativeCreateSessionAndWrapperWithFeatures(context, iArr);
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithFeatures;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(nativeCreateSessionAndWrapperWithFeatures);
        if (set.contains(Feature.SHARED_CAMERA)) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }
}

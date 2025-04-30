package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes2.dex */
public class Config {
    private static final String TAG = "ARCore-Config";
    long nativeHandle;
    final long nativeSymbolTableHandle;
    final Session session;

    /* loaded from: classes2.dex */
    public enum AugmentedFaceMode {
        DISABLED(0),
        MESH3D(2);

        final int nativeCode;

        AugmentedFaceMode(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static AugmentedFaceMode forNumber(int i9) {
            for (AugmentedFaceMode augmentedFaceMode : values()) {
                if (augmentedFaceMode.nativeCode == i9) {
                    return augmentedFaceMode;
                }
            }
            throw new FatalException(A.a("Unexpected value for native AugmentedFaceMode, value=", (byte) 53, i9));
        }
    }

    /* loaded from: classes2.dex */
    public enum CloudAnchorMode {
        DISABLED(0),
        ENABLED(1);

        final int nativeCode;

        CloudAnchorMode(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static CloudAnchorMode forNumber(int i9) {
            for (CloudAnchorMode cloudAnchorMode : values()) {
                if (cloudAnchorMode.nativeCode == i9) {
                    return cloudAnchorMode;
                }
            }
            throw new FatalException(A.a("Unexpected value for native AnchorHostingMode, value=", (byte) 53, i9));
        }
    }

    /* loaded from: classes2.dex */
    public enum DepthMode {
        DISABLED(0),
        AUTOMATIC(1),
        RAW_DEPTH_ONLY(3);

        final int nativeCode;

        DepthMode(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static DepthMode forNumber(int i9) {
            for (DepthMode depthMode : values()) {
                if (depthMode.nativeCode == i9) {
                    return depthMode;
                }
            }
            throw new FatalException(A.a("Unexpected value for native DepthMode, value=", (byte) 45, i9));
        }
    }

    /* loaded from: classes2.dex */
    public enum FocusMode {
        FIXED(0),
        AUTO(1);

        final int nativeCode;

        FocusMode(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static FocusMode forNumber(int i9) {
            for (FocusMode focusMode : values()) {
                if (focusMode.nativeCode == i9) {
                    return focusMode;
                }
            }
            throw new FatalException(A.a("Unexpected value for native FocusMode, value=", (byte) 45, i9));
        }
    }

    /* loaded from: classes2.dex */
    public enum GeospatialMode {
        DISABLED(0),
        ENABLED(2);

        final int nativeCode;

        GeospatialMode(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static GeospatialMode forNumber(int i9) {
            for (GeospatialMode geospatialMode : values()) {
                if (geospatialMode.nativeCode == i9) {
                    return geospatialMode;
                }
            }
            throw new FatalException(A.a("Unexpected value for native GeospatialMode, value=", (byte) 50, i9));
        }
    }

    /* loaded from: classes2.dex */
    public enum ImageStabilizationMode {
        OFF(0),
        EIS(1);

        final int nativeCode;

        ImageStabilizationMode(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static ImageStabilizationMode forNumber(int i9) {
            for (ImageStabilizationMode imageStabilizationMode : values()) {
                if (imageStabilizationMode.nativeCode == i9) {
                    return imageStabilizationMode;
                }
            }
            throw new FatalException(A.a("Unexpected value for native ImageStabilizationMode, value=", (byte) 58, i9));
        }
    }

    /* loaded from: classes2.dex */
    public enum InstantPlacementMode {
        DISABLED(0),
        LOCAL_Y_UP(2);

        final int nativeCode;

        InstantPlacementMode(int i9) {
            this.nativeCode = i9;
        }

        public static InstantPlacementMode forNumber(int i9) {
            for (InstantPlacementMode instantPlacementMode : values()) {
                if (instantPlacementMode.nativeCode == i9) {
                    return instantPlacementMode;
                }
            }
            throw new FatalException(A.a("Unexpected value for native InstantPlacementMode, value=", (byte) 56, i9));
        }
    }

    /* loaded from: classes2.dex */
    public enum LightEstimationMode {
        DISABLED(0),
        AMBIENT_INTENSITY(1),
        ENVIRONMENTAL_HDR(2);

        final int nativeCode;

        LightEstimationMode(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static LightEstimationMode forNumber(int i9) {
            for (LightEstimationMode lightEstimationMode : values()) {
                if (lightEstimationMode.nativeCode == i9) {
                    return lightEstimationMode;
                }
            }
            throw new FatalException(A.a("Unexpected value for native LightEstimationMode, value=", (byte) 55, i9));
        }
    }

    /* loaded from: classes2.dex */
    public enum PlaneFindingMode {
        DISABLED(0),
        HORIZONTAL(1),
        VERTICAL(2),
        HORIZONTAL_AND_VERTICAL(3);

        final int nativeCode;

        PlaneFindingMode(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static PlaneFindingMode forNumber(int i9) {
            for (PlaneFindingMode planeFindingMode : values()) {
                if (planeFindingMode.nativeCode == i9) {
                    return planeFindingMode;
                }
            }
            throw new FatalException(A.a("Unexpected value for native PlaneFindingMode, value=", (byte) 52, i9));
        }
    }

    /* loaded from: classes2.dex */
    public enum SemanticMode {
        DISABLED(0),
        ENABLED(1);

        final int nativeCode;

        SemanticMode(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static SemanticMode forNumber(int i9) {
            for (SemanticMode semanticMode : values()) {
                if (semanticMode.nativeCode == i9) {
                    return semanticMode;
                }
            }
            throw new FatalException(A.a("Unexpected value for native SemanticMode, value=", (byte) 48, i9));
        }
    }

    /* loaded from: classes2.dex */
    public enum StreetscapeGeometryMode {
        DISABLED(0),
        ENABLED(1);

        final int nativeCode;

        StreetscapeGeometryMode(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static StreetscapeGeometryMode forNumber(int i9) {
            for (StreetscapeGeometryMode streetscapeGeometryMode : values()) {
                if (streetscapeGeometryMode.nativeCode == i9) {
                    return streetscapeGeometryMode;
                }
            }
            throw new FatalException(A.a("Unexpected value for native StreetscapeGeometryMode, value=", (byte) 59, i9));
        }
    }

    /* loaded from: classes2.dex */
    public enum TextureUpdateMode {
        BIND_TO_TEXTURE_EXTERNAL_OES(0),
        EXPOSE_HARDWARE_BUFFER(1);

        final int nativeCode;

        TextureUpdateMode(int i9) {
            this.nativeCode = i9;
        }

        public static TextureUpdateMode forNumber(int i9) {
            for (TextureUpdateMode textureUpdateMode : values()) {
                if (textureUpdateMode.nativeCode == i9) {
                    return textureUpdateMode;
                }
            }
            throw new FatalException(A.a("Unexpected value for native TextureUpdateMode, value=", (byte) 53, i9));
        }
    }

    /* loaded from: classes2.dex */
    public enum UpdateMode {
        BLOCKING(0),
        LATEST_CAMERA_IMAGE(1);

        final int nativeCode;

        UpdateMode(int i9) {
            this.nativeCode = i9;
        }

        @NonNull
        public static UpdateMode forNumber(int i9) {
            for (UpdateMode updateMode : values()) {
                if (updateMode.nativeCode == i9) {
                    return updateMode;
                }
            }
            throw new FatalException(A.a("Unexpected value for native UpdateMode, value=", (byte) 46, i9));
        }
    }

    public Config() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    private static native long nativeCreate(long j7);

    private static native void nativeDestroy(long j7, long j9);

    private native int nativeGetAugmentedFaceMode(long j7, long j9);

    private native long nativeGetAugmentedImageDatabase(long j7, long j9);

    private native int nativeGetCloudAnchorMode(long j7, long j9);

    private native int nativeGetDepthMode(long j7, long j9);

    private native int nativeGetFocusMode(long j7, long j9);

    private native int nativeGetGeospatialMode(long j7, long j9, long j10);

    private native int nativeGetImageStabilizationMode(long j7, long j9);

    private native int nativeGetInstantPlacementMode(long j7, long j9);

    private native int nativeGetLightEstimationMode(long j7, long j9);

    private native int nativeGetPlaneFindingMode(long j7, long j9);

    private native int nativeGetSemanticMode(long j7, long j9);

    private native int nativeGetStreetscapeGeometryMode(long j7, long j9, long j10);

    private native int nativeGetTextureUpdateMode(long j7, long j9);

    private native int nativeGetUpdateMode(long j7, long j9);

    private native void nativeSetAugmentedFaceMode(long j7, long j9, int i9);

    private native void nativeSetAugmentedImageDatabase(long j7, long j9, long j10);

    private native void nativeSetCloudAnchorMode(long j7, long j9, int i9);

    private native void nativeSetDepthMode(long j7, long j9, int i9);

    private native void nativeSetFocusMode(long j7, long j9, int i9);

    private native void nativeSetGeospatialMode(long j7, long j9, long j10, int i9);

    private native void nativeSetImageStabilizationMode(long j7, long j9, int i9);

    private native void nativeSetInstantPlacementMode(long j7, long j9, int i9);

    private native void nativeSetLightEstimationMode(long j7, long j9, int i9);

    private native void nativeSetPlaneFindingMode(long j7, long j9, int i9);

    private native void nativeSetSemanticMode(long j7, long j9, int i9);

    private native void nativeSetStreetscapeGeometryMode(long j7, long j9, long j10, int i9);

    private native void nativeSetTextureUpdateMode(long j7, long j9, int i9);

    private native void nativeSetUpdateMode(long j7, long j9, int i9);

    public void finalize() throws Throwable {
        long j7 = this.nativeHandle;
        if (j7 != 0) {
            nativeDestroy(this.nativeSymbolTableHandle, j7);
        }
        super.finalize();
    }

    @NonNull
    public AugmentedFaceMode getAugmentedFaceMode() {
        return AugmentedFaceMode.forNumber(nativeGetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public AugmentedImageDatabase getAugmentedImageDatabase() {
        return new AugmentedImageDatabase(this.session, nativeGetAugmentedImageDatabase(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public CloudAnchorMode getCloudAnchorMode() {
        return CloudAnchorMode.forNumber(nativeGetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public DepthMode getDepthMode() {
        return DepthMode.forNumber(nativeGetDepthMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public FocusMode getFocusMode() {
        return FocusMode.forNumber(nativeGetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public GeospatialMode getGeospatialMode() {
        return GeospatialMode.forNumber(nativeGetGeospatialMode(this.nativeSymbolTableHandle, this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public ImageStabilizationMode getImageStabilizationMode() {
        return ImageStabilizationMode.forNumber(nativeGetImageStabilizationMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public InstantPlacementMode getInstantPlacementMode() {
        return InstantPlacementMode.forNumber(nativeGetInstantPlacementMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public LightEstimationMode getLightEstimationMode() {
        return LightEstimationMode.forNumber(nativeGetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public PlaneFindingMode getPlaneFindingMode() {
        return PlaneFindingMode.forNumber(nativeGetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public SemanticMode getSemanticMode() {
        return SemanticMode.forNumber(nativeGetSemanticMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public StreetscapeGeometryMode getStreetscapeGeometryMode() {
        return StreetscapeGeometryMode.forNumber(nativeGetStreetscapeGeometryMode(this.nativeSymbolTableHandle, this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public TextureUpdateMode getTextureUpdateMode() {
        return TextureUpdateMode.forNumber(nativeGetTextureUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public UpdateMode getUpdateMode() {
        return UpdateMode.forNumber(nativeGetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @NonNull
    public Config setAugmentedFaceMode(AugmentedFaceMode augmentedFaceMode) {
        nativeSetAugmentedFaceMode(this.session.nativeWrapperHandle, this.nativeHandle, augmentedFaceMode.nativeCode);
        return this;
    }

    @NonNull
    public Config setAugmentedImageDatabase(AugmentedImageDatabase augmentedImageDatabase) {
        long j7;
        long j9 = this.session.nativeWrapperHandle;
        long j10 = this.nativeHandle;
        if (augmentedImageDatabase == null) {
            j7 = 0;
        } else {
            j7 = augmentedImageDatabase.nativeHandle;
        }
        nativeSetAugmentedImageDatabase(j9, j10, j7);
        return this;
    }

    @NonNull
    public Config setCloudAnchorMode(CloudAnchorMode cloudAnchorMode) {
        nativeSetCloudAnchorMode(this.session.nativeWrapperHandle, this.nativeHandle, cloudAnchorMode.nativeCode);
        return this;
    }

    @NonNull
    public Config setDepthMode(DepthMode depthMode) {
        nativeSetDepthMode(this.session.nativeWrapperHandle, this.nativeHandle, depthMode.nativeCode);
        return this;
    }

    @NonNull
    public Config setFocusMode(FocusMode focusMode) {
        nativeSetFocusMode(this.session.nativeWrapperHandle, this.nativeHandle, focusMode.nativeCode);
        return this;
    }

    @NonNull
    public Config setGeospatialMode(GeospatialMode geospatialMode) {
        nativeSetGeospatialMode(this.nativeSymbolTableHandle, this.session.nativeWrapperHandle, this.nativeHandle, geospatialMode.nativeCode);
        return this;
    }

    @NonNull
    public Config setImageStabilizationMode(ImageStabilizationMode imageStabilizationMode) {
        nativeSetImageStabilizationMode(this.session.nativeWrapperHandle, this.nativeHandle, imageStabilizationMode.nativeCode);
        return this;
    }

    @NonNull
    public Config setInstantPlacementMode(InstantPlacementMode instantPlacementMode) {
        nativeSetInstantPlacementMode(this.session.nativeWrapperHandle, this.nativeHandle, instantPlacementMode.nativeCode);
        return this;
    }

    @NonNull
    public Config setLightEstimationMode(LightEstimationMode lightEstimationMode) {
        nativeSetLightEstimationMode(this.session.nativeWrapperHandle, this.nativeHandle, lightEstimationMode.nativeCode);
        return this;
    }

    @NonNull
    public Config setPlaneFindingMode(PlaneFindingMode planeFindingMode) {
        nativeSetPlaneFindingMode(this.session.nativeWrapperHandle, this.nativeHandle, planeFindingMode.nativeCode);
        return this;
    }

    @NonNull
    public Config setSemanticMode(SemanticMode semanticMode) {
        nativeSetSemanticMode(this.session.nativeWrapperHandle, this.nativeHandle, semanticMode.nativeCode);
        return this;
    }

    @NonNull
    public Config setStreetscapeGeometryMode(StreetscapeGeometryMode streetscapeGeometryMode) {
        nativeSetStreetscapeGeometryMode(this.nativeSymbolTableHandle, this.session.nativeWrapperHandle, this.nativeHandle, streetscapeGeometryMode.nativeCode);
        return this;
    }

    @NonNull
    public Config setTextureUpdateMode(TextureUpdateMode textureUpdateMode) {
        nativeSetTextureUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle, textureUpdateMode.nativeCode);
        return this;
    }

    @NonNull
    public Config setUpdateMode(UpdateMode updateMode) {
        nativeSetUpdateMode(this.session.nativeWrapperHandle, this.nativeHandle, updateMode.nativeCode);
        return this;
    }

    public Config(Session session) {
        this.session = session;
        this.nativeHandle = nativeCreate(session.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    public Config(Session session, long j7) {
        this.session = session;
        this.nativeHandle = j7;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }
}

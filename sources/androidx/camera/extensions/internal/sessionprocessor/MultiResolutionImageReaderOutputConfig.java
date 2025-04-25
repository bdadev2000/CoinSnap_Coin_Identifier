package androidx.camera.extensions.internal.sessionprocessor;

import java.util.List;

/* loaded from: classes.dex */
public abstract class MultiResolutionImageReaderOutputConfig implements Camera2OutputConfig {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getImageFormat();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getMaxImages();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MultiResolutionImageReaderOutputConfig create(int i, int i2, String str, List<Camera2OutputConfig> list, int i3, int i4) {
        return new AutoValue_MultiResolutionImageReaderOutputConfig(i, i2, str, list, i3, i4);
    }
}

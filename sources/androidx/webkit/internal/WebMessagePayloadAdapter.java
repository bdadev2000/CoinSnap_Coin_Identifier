package androidx.webkit.internal;

import android.support.v4.media.d;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes4.dex */
public class WebMessagePayloadAdapter implements WebMessagePayloadBoundaryInterface {
    public final void a(int i2) {
        if (i2 != 0) {
            throw new IllegalStateException(d.j("Expected ", i2, ", but type is 0"));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final byte[] getAsArrayBuffer() {
        a(1);
        throw null;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final String getAsString() {
        a(0);
        return null;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final int getType() {
        return 0;
    }
}

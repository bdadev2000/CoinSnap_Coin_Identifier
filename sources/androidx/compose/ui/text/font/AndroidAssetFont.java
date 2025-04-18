package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class AndroidAssetFont extends AndroidPreloadedFont {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidAssetFont)) {
            return false;
        }
        AndroidAssetFont androidAssetFont = (AndroidAssetFont) obj;
        androidAssetFont.getClass();
        if (!a.g(null, null)) {
            return false;
        }
        androidAssetFont.getClass();
        return a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "Font(assetManager, path=null, weight=null, style=" + ((Object) FontStyle.b(0)) + ')';
    }
}

package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import h0.g;

@StabilityInferred
/* loaded from: classes2.dex */
public final class DelegatingFontLoaderForBridgeUsage implements PlatformFontLoader {
    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public final Object a(Font font) {
        if (!(font instanceof AndroidFont)) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public final void b() {
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public final Object c(Font font, g gVar) {
        if (!(font instanceof AndroidFont)) {
            throw null;
        }
        ((AndroidFont) font).getClass();
        throw null;
    }
}

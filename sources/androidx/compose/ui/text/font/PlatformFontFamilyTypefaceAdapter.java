package androidx.compose.ui.text.font;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.TypefaceResult;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final PlatformTypefaces f17277a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.text.font.PlatformTypefaces] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public PlatformFontFamilyTypefaceAdapter() {
        this.f17277a = Build.VERSION.SDK_INT >= 28 ? new Object() : new Object();
    }

    public final TypefaceResult a(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, l lVar, l lVar2) {
        android.graphics.Typeface b2;
        FontFamily fontFamily = typefaceRequest.f17286a;
        PlatformTypefaces platformTypefaces = this.f17277a;
        int i2 = typefaceRequest.f17288c;
        FontWeight fontWeight = typefaceRequest.f17287b;
        if (fontFamily == null || (fontFamily instanceof DefaultFontFamily)) {
            b2 = platformTypefaces.b(fontWeight, i2);
        } else {
            if (!(fontFamily instanceof GenericFontFamily)) {
                if (!(fontFamily instanceof LoadedFontFamily)) {
                    return null;
                }
                a.q(null, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidTypeface");
                throw null;
            }
            b2 = platformTypefaces.a((GenericFontFamily) fontFamily, fontWeight, i2);
        }
        return new TypefaceResult.Immutable(b2, true);
    }
}

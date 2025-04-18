package androidx.compose.ui.text.font;

import p0.a;

/* loaded from: classes4.dex */
final class DeviceFontFamilyNameFont extends AndroidFont {
    @Override // androidx.compose.ui.text.font.Font
    public final int b() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceFontFamilyNameFont)) {
            return false;
        }
        DeviceFontFamilyNameFont deviceFontFamilyNameFont = (DeviceFontFamilyNameFont) obj;
        deviceFontFamilyNameFont.getClass();
        if (!a.g(null, null)) {
            return false;
        }
        deviceFontFamilyNameFont.getClass();
        if (!a.g(null, null)) {
            return false;
        }
        deviceFontFamilyNameFont.getClass();
        if (!FontStyle.a(0, 0)) {
            return false;
        }
        deviceFontFamilyNameFont.getClass();
        return a.g(null, null);
    }

    @Override // androidx.compose.ui.text.font.Font
    public final FontWeight getWeight() {
        return null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "Font(familyName=\"DeviceFontFamilyName(name=null)\", weight=null, style=" + ((Object) FontStyle.b(0)) + ')';
    }
}

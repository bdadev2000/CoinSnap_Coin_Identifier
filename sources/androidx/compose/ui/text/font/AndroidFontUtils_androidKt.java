package androidx.compose.ui.text.font;

/* loaded from: classes3.dex */
public final class AndroidFontUtils_androidKt {
    public static final int a(FontWeight fontWeight, int i2) {
        boolean z2 = fontWeight.compareTo(FontWeight.d) >= 0;
        boolean a2 = FontStyle.a(i2, 1);
        if (a2 && z2) {
            return 3;
        }
        if (z2) {
            return 1;
        }
        return a2 ? 2 : 0;
    }
}

package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public abstract class FontFamily {

    /* renamed from: a, reason: collision with root package name */
    public static final DefaultFontFamily f17224a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final GenericFontFamily f17225b = new GenericFontFamily("sans-serif", "FontFamily.SansSerif");

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* loaded from: classes.dex */
    public interface Resolver {
        TypefaceResult a(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3);
    }
}

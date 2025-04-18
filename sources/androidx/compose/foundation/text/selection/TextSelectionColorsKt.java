package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

/* loaded from: classes3.dex */
public final class TextSelectionColorsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f7360a = CompositionLocalKt.c(TextSelectionColorsKt$LocalTextSelectionColors$1.f7362a);

    /* renamed from: b, reason: collision with root package name */
    public static final TextSelectionColors f7361b;

    static {
        long d = ColorKt.d(4282550004L);
        f7361b = new TextSelectionColors(d, Color.b(d, 0.4f));
    }
}

package androidx.compose.foundation.text;

import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.ParagraphKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import e0.w;
import z0.m;

/* loaded from: classes2.dex */
public final class TextFieldDelegateKt {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6131a = m.i1(10, "H");

    public static final long a(TextStyle textStyle, Density density, FontFamily.Resolver resolver, String str, int i2) {
        AndroidParagraph a2 = ParagraphKt.a(str, textStyle, ConstraintsKt.b(0, 0, 15), density, resolver, w.f30218a, i2, 64);
        return IntSizeKt.a(TextDelegateKt.a(a2.f16875a.c()), TextDelegateKt.a(a2.getHeight()));
    }
}

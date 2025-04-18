package androidx.compose.foundation.text;

import android.support.v4.media.d;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;

/* loaded from: classes4.dex */
public final class ValidatingOffsetMappingKt {

    /* renamed from: a, reason: collision with root package name */
    public static final OffsetMapping f6254a = new ValidatingOffsetMapping(OffsetMapping.Companion.f17345a, 0, 0);

    public static final TransformedText a(VisualTransformation visualTransformation, AnnotatedString annotatedString) {
        OffsetMapping offsetMapping;
        TransformedText a2 = visualTransformation.a(annotatedString);
        int length = annotatedString.f16880a.length();
        int length2 = a2.f17392a.f16880a.length();
        int min = Math.min(length, 100);
        int i2 = 0;
        while (true) {
            offsetMapping = a2.f17393b;
            if (i2 >= min) {
                break;
            }
            b(offsetMapping.b(i2), length2, i2);
            i2++;
        }
        b(offsetMapping.b(length), length2, length);
        int min2 = Math.min(length2, 100);
        for (int i3 = 0; i3 < min2; i3++) {
            c(offsetMapping.a(i3), length, i3);
        }
        c(offsetMapping.a(length2), length, length2);
        int length3 = annotatedString.f16880a.length();
        AnnotatedString annotatedString2 = a2.f17392a;
        return new TransformedText(annotatedString2, new ValidatingOffsetMapping(offsetMapping, length3, annotatedString2.f16880a.length()));
    }

    public static final void b(int i2, int i3, int i4) {
        if (i2 < 0 || i2 > i3) {
            throw new IllegalStateException(d.o(d.u("OffsetMapping.originalToTransformed returned invalid mapping: ", i4, " -> ", i2, " is not in range of transformed text [0, "), i3, ']').toString());
        }
    }

    public static final void c(int i2, int i3, int i4) {
        if (i2 < 0 || i2 > i3) {
            throw new IllegalStateException(d.o(d.u("OffsetMapping.transformedToOriginal returned invalid mapping: ", i4, " -> ", i2, " is not in range of original text [0, "), i3, ']').toString());
        }
    }
}

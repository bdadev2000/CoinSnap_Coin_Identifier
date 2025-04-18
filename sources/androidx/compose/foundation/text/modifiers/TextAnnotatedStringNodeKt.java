package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.LinkAnnotation;
import java.util.List;

/* loaded from: classes3.dex */
public final class TextAnnotatedStringNodeKt {
    public static final boolean a(AnnotatedString annotatedString) {
        int length = annotatedString.f16880a.length();
        List list = annotatedString.d;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range range = (AnnotatedString.Range) list.get(i2);
            if ((range.f16890a instanceof LinkAnnotation) && AnnotatedStringKt.c(0, length, range.f16891b, range.f16892c)) {
                return true;
            }
        }
        return false;
    }
}

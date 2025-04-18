package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.input.OffsetMapping;
import z0.m;

@StabilityInferred
/* loaded from: classes.dex */
public final class PasswordVisualTransformation implements VisualTransformation {
    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final TransformedText a(AnnotatedString annotatedString) {
        return new TransformedText(new AnnotatedString(m.i1(annotatedString.f16880a.length(), String.valueOf((char) 0)), null, 6), OffsetMapping.Companion.f17345a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasswordVisualTransformation)) {
            return false;
        }
        ((PasswordVisualTransformation) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Character.hashCode((char) 0);
    }
}

package androidx.compose.ui.text.input;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;

@StabilityInferred
/* loaded from: classes.dex */
public final class TransformedText {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f17392a;

    /* renamed from: b, reason: collision with root package name */
    public final OffsetMapping f17393b;

    public TransformedText(AnnotatedString annotatedString, OffsetMapping offsetMapping) {
        this.f17392a = annotatedString;
        this.f17393b = offsetMapping;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransformedText)) {
            return false;
        }
        TransformedText transformedText = (TransformedText) obj;
        return p0.a.g(this.f17392a, transformedText.f17392a) && p0.a.g(this.f17393b, transformedText.f17393b);
    }

    public final int hashCode() {
        return this.f17393b.hashCode() + (this.f17392a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.f17392a) + ", offsetMapping=" + this.f17393b + ')';
    }
}

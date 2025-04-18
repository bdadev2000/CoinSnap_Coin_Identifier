package androidx.compose.foundation.text.input.internal;

/* loaded from: classes3.dex */
final class MaskCodepointTransformation implements CodepointTransformation {
    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public final int a(int i2, int i3) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskCodepointTransformation)) {
            return false;
        }
        ((MaskCodepointTransformation) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Character.hashCode((char) 0);
    }

    public final String toString() {
        return "MaskCodepointTransformation(character=\u0000)";
    }
}

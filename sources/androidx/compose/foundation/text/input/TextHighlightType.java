package androidx.compose.foundation.text.input;

import android.support.v4.media.d;

/* loaded from: classes2.dex */
public final class TextHighlightType {

    /* renamed from: a, reason: collision with root package name */
    public final int f6310a;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TextHighlightType) {
            return this.f6310a == ((TextHighlightType) obj).f6310a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6310a);
    }

    public final String toString() {
        return d.o(new StringBuilder("TextHighlightType(value="), this.f6310a, ')');
    }
}

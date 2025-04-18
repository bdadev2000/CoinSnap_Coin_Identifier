package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes.dex */
public final class SingleLineCodepointTransformation implements CodepointTransformation {

    /* renamed from: a, reason: collision with root package name */
    public static final SingleLineCodepointTransformation f6482a = new Object();

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public final int a(int i2, int i3) {
        if (i3 == 10) {
            return 32;
        }
        if (i3 == 13) {
            return 65279;
        }
        return i3;
    }

    public final String toString() {
        return "SingleLineCodepointTransformation";
    }
}

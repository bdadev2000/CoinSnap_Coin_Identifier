package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class Anchor {

    /* renamed from: a, reason: collision with root package name */
    public int f13675a;

    public Anchor(int i2) {
        this.f13675a = i2;
    }

    public final boolean a() {
        return this.f13675a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{ location = ");
        return androidx.compose.foundation.text.input.a.n(sb, this.f13675a, " }");
    }
}

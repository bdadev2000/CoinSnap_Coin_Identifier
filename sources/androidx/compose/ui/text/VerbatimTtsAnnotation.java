package androidx.compose.ui.text;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class VerbatimTtsAnnotation extends TtsAnnotation {

    /* renamed from: a, reason: collision with root package name */
    public final String f17063a;

    public VerbatimTtsAnnotation(String str) {
        this.f17063a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VerbatimTtsAnnotation) {
            return a.g(this.f17063a, ((VerbatimTtsAnnotation) obj).f17063a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17063a.hashCode();
    }

    public final String toString() {
        return d.q(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f17063a, ')');
    }
}

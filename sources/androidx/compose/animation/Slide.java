package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import q0.l;

@Immutable
/* loaded from: classes.dex */
public final class Slide {

    /* renamed from: a, reason: collision with root package name */
    public final l f1969a;

    /* renamed from: b, reason: collision with root package name */
    public final FiniteAnimationSpec f1970b;

    public Slide(FiniteAnimationSpec finiteAnimationSpec, l lVar) {
        this.f1969a = lVar;
        this.f1970b = finiteAnimationSpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Slide)) {
            return false;
        }
        Slide slide = (Slide) obj;
        return p0.a.g(this.f1969a, slide.f1969a) && p0.a.g(this.f1970b, slide.f1970b);
    }

    public final int hashCode() {
        return this.f1970b.hashCode() + (this.f1969a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f1969a + ", animationSpec=" + this.f1970b + ')';
    }
}

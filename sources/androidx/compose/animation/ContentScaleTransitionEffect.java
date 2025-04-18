package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ContentScaleTransitionEffect extends TransitionEffect {

    /* loaded from: classes3.dex */
    public static final class Key implements TransitionEffectKey<ContentScaleTransitionEffect> {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentScaleTransitionEffect)) {
            return false;
        }
        ((ContentScaleTransitionEffect) obj).getClass();
        return p0.a.g(null, null) && p0.a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "ContentScaleTransitionEffect(contentScale=null, alignment=null)";
    }
}

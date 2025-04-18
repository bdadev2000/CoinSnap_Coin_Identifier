package androidx.compose.material3;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class FadeInFadeOutAnimationItem<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9416a;

    /* renamed from: b, reason: collision with root package name */
    public final q f9417b;

    public FadeInFadeOutAnimationItem(SnackbarData snackbarData, ComposableLambdaImpl composableLambdaImpl) {
        this.f9416a = snackbarData;
        this.f9417b = composableLambdaImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
        return p0.a.g(this.f9416a, fadeInFadeOutAnimationItem.f9416a) && p0.a.g(this.f9417b, fadeInFadeOutAnimationItem.f9417b);
    }

    public final int hashCode() {
        Object obj = this.f9416a;
        return this.f9417b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f9416a + ", transition=" + this.f9417b + ')';
    }
}

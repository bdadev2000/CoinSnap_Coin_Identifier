package androidx.compose.runtime;

/* loaded from: classes4.dex */
public final class SkippableUpdater<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Composer f13976a;

    public /* synthetic */ SkippableUpdater(Composer composer) {
        this.f13976a = composer;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SkippableUpdater) {
            return p0.a.g(this.f13976a, ((SkippableUpdater) obj).f13976a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13976a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f13976a + ')';
    }
}

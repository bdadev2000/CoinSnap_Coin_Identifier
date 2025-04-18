package androidx.compose.runtime;

/* loaded from: classes3.dex */
final class NeverEqualPolicy implements SnapshotMutationPolicy<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final NeverEqualPolicy f13839a = new Object();

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public final boolean a(Object obj, Object obj2) {
        return false;
    }

    public final String toString() {
        return "NeverEqualPolicy";
    }
}

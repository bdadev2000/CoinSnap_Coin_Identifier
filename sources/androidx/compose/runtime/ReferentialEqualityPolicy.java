package androidx.compose.runtime;

/* loaded from: classes4.dex */
final class ReferentialEqualityPolicy implements SnapshotMutationPolicy<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final ReferentialEqualityPolicy f13969a = new Object();

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public final boolean a(Object obj, Object obj2) {
        return obj == obj2;
    }

    public final String toString() {
        return "ReferentialEqualityPolicy";
    }
}

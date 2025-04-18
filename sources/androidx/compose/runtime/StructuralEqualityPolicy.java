package androidx.compose.runtime;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class StructuralEqualityPolicy implements SnapshotMutationPolicy<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final StructuralEqualityPolicy f14078a = new Object();

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public final boolean a(Object obj, Object obj2) {
        return p0.a.g(obj, obj2);
    }

    public final String toString() {
        return "StructuralEqualityPolicy";
    }
}

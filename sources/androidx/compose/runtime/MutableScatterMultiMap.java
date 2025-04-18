package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class MutableScatterMultiMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableScatterMap f13838a;

    public final boolean equals(Object obj) {
        if (obj instanceof MutableScatterMultiMap) {
            return p0.a.g(this.f13838a, ((MutableScatterMultiMap) obj).f13838a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13838a.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.f13838a + ')';
    }
}

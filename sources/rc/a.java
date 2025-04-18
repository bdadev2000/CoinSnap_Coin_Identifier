package rc;

import jb.i;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes3.dex */
public final class a {
    public final Mutex a;

    /* renamed from: b, reason: collision with root package name */
    public i f24074b;

    public a(Mutex mutex) {
        Intrinsics.checkNotNullParameter(mutex, "mutex");
        this.a = mutex;
        this.f24074b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.a, aVar.a) && Intrinsics.areEqual(this.f24074b, aVar.f24074b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i iVar = this.f24074b;
        return hashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.a + ", subscriber=" + this.f24074b + ')';
    }
}

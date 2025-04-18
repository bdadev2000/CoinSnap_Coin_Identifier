package androidx.compose.runtime;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class OpaqueKey {

    /* renamed from: a, reason: collision with root package name */
    public final String f13843a;

    public OpaqueKey(String str) {
        this.f13843a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpaqueKey) && p0.a.g(this.f13843a, ((OpaqueKey) obj).f13843a);
    }

    public final int hashCode() {
        return this.f13843a.hashCode();
    }

    public final String toString() {
        return d.q(new StringBuilder("OpaqueKey(key="), this.f13843a, ')');
    }
}

package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes2.dex */
public final class JoinedKey {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13816a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13817b;

    public JoinedKey(Integer num, Object obj) {
        this.f13816a = num;
        this.f13817b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinedKey)) {
            return false;
        }
        JoinedKey joinedKey = (JoinedKey) obj;
        return p0.a.g(this.f13816a, joinedKey.f13816a) && p0.a.g(this.f13817b, joinedKey.f13817b);
    }

    public final int hashCode() {
        Object obj = this.f13816a;
        int i2 = 0;
        int ordinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f13817b;
        if (obj2 instanceof Enum) {
            i2 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i2 + ordinal;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.f13816a + ", right=" + this.f13817b + ')';
    }
}

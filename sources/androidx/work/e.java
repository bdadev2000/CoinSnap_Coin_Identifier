package androidx.work;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f5211a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            return this.f5211a.equals(((e) obj).f5211a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5211a.hashCode();
    }
}

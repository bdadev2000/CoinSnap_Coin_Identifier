package androidx.work;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class f {
    public final HashSet a = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            return this.a.equals(((f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

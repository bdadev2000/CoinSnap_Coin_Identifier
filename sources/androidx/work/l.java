package androidx.work;

/* loaded from: classes.dex */
public final class l extends n {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return l.class.getName().hashCode();
    }

    public final String toString() {
        return "Retry";
    }
}

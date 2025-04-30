package h3;

import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f20585a;

    public c(String str) {
        if (str != null) {
            this.f20585a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f20585a.equals(((c) obj).f20585a);
    }

    public final int hashCode() {
        return this.f20585a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC2914a.h(new StringBuilder("Encoding{name=\""), this.f20585a, "\"}");
    }
}

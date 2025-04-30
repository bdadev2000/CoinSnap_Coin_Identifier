package T1;

import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f2984a;

    public n(String str) {
        this.f2984a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return this.f2984a.equals(((n) obj).f2984a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2984a.hashCode();
    }

    public final String toString() {
        return AbstractC2914a.h(new StringBuilder("StringHeaderFactory{value='"), this.f2984a, "'}");
    }
}

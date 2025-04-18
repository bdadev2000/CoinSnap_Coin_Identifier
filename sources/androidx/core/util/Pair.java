package androidx.core.util;

import java.util.Objects;

/* loaded from: classes.dex */
public class Pair<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18679a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18680b;

    public Pair(Object obj, Object obj2) {
        this.f18679a = obj;
        this.f18680b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return Objects.equals(pair.f18679a, this.f18679a) && Objects.equals(pair.f18680b, this.f18680b);
    }

    public final int hashCode() {
        Object obj = this.f18679a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f18680b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "Pair{" + this.f18679a + " " + this.f18680b + "}";
    }
}

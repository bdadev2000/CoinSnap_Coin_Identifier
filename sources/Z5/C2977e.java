package z5;

import java.util.Objects;
import x0.AbstractC2914a;

/* renamed from: z5.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2977e {

    /* renamed from: a, reason: collision with root package name */
    public final String f24553a;
    public final String b;

    public C2977e(String str, String str2) {
        this.f24553a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2977e) {
            C2977e c2977e = (C2977e) obj;
            if (Objects.equals(this.f24553a, c2977e.f24553a) && Objects.equals(this.b, c2977e.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) + (Objects.hashCode(this.f24553a) * 37);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[packageName=");
        sb.append(this.f24553a);
        sb.append(",libraryName=");
        return AbstractC2914a.h(sb, this.b, "]");
    }
}

package F0;

import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f1062a;
    public final boolean b;

    /* renamed from: c, reason: collision with root package name */
    public final List f1063c;

    public d(String str, List list, boolean z8) {
        this.f1062a = str;
        this.b = z8;
        this.f1063c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.b != dVar.b || !this.f1063c.equals(dVar.f1063c)) {
            return false;
        }
        String str = this.f1062a;
        boolean startsWith = str.startsWith("index_");
        String str2 = dVar.f1062a;
        if (startsWith) {
            return str2.startsWith("index_");
        }
        return str.equals(str2);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f1062a;
        if (str.startsWith("index_")) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return this.f1063c.hashCode() + (((hashCode * 31) + (this.b ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f1062a + "', unique=" + this.b + ", columns=" + this.f1063c + '}';
    }
}

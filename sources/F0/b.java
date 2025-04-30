package F0;

import java.util.Collections;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f1055a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1056c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1057d;

    /* renamed from: e, reason: collision with root package name */
    public final List f1058e;

    public b(String str, String str2, String str3, List list, List list2) {
        this.f1055a = str;
        this.b = str2;
        this.f1056c = str3;
        this.f1057d = Collections.unmodifiableList(list);
        this.f1058e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f1055a.equals(bVar.f1055a) || !this.b.equals(bVar.b) || !this.f1056c.equals(bVar.f1056c) || !this.f1057d.equals(bVar.f1057d)) {
            return false;
        }
        return this.f1058e.equals(bVar.f1058e);
    }

    public final int hashCode() {
        return this.f1058e.hashCode() + ((this.f1057d.hashCode() + AbstractC2914a.b(AbstractC2914a.b(this.f1055a.hashCode() * 31, 31, this.b), 31, this.f1056c)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f1055a + "', onDelete='" + this.b + "', onUpdate='" + this.f1056c + "', columnNames=" + this.f1057d + ", referenceColumnNames=" + this.f1058e + '}';
    }
}

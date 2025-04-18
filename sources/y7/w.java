package y7;

/* loaded from: classes3.dex */
public final class w {
    public final y a;

    /* renamed from: b, reason: collision with root package name */
    public final y f28011b;

    public w(y yVar, y yVar2) {
        this.a = yVar;
        this.f28011b = yVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        if (this.a.equals(wVar.a) && this.f28011b.equals(wVar.f28011b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28011b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        y yVar = this.a;
        sb2.append(yVar);
        y yVar2 = this.f28011b;
        if (yVar.equals(yVar2)) {
            str = "";
        } else {
            str = ", " + yVar2;
        }
        return vd.e.h(sb2, str, "]");
    }
}

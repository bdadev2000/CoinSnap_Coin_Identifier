package u2;

import androidx.work.y;

/* loaded from: classes.dex */
public final class i {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public y f25451b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f25451b != iVar.f25451b) {
            return false;
        }
        return this.a.equals(iVar.a);
    }

    public final int hashCode() {
        return this.f25451b.hashCode() + (this.a.hashCode() * 31);
    }
}

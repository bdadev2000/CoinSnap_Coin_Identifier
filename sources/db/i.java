package db;

/* loaded from: classes3.dex */
public final class i {
    public final s a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16955b;

    public i(s sVar, boolean z10) {
        this.a = sVar;
        this.f16955b = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!iVar.a.equals(this.a) || iVar.f16955b != this.f16955b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f16955b).hashCode();
    }
}

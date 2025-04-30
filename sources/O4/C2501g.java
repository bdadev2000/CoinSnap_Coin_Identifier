package o4;

/* renamed from: o4.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2501g {

    /* renamed from: a, reason: collision with root package name */
    public final q f21959a;
    public final boolean b;

    public C2501g(q qVar, boolean z8) {
        this.f21959a = qVar;
        this.b = z8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2501g)) {
            return false;
        }
        C2501g c2501g = (C2501g) obj;
        if (!c2501g.f21959a.equals(this.f21959a) || c2501g.b != this.b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f21959a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
    }
}

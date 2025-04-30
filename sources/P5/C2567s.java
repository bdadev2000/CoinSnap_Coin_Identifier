package p5;

import Q7.n0;

/* renamed from: p5.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2567s {

    /* renamed from: a, reason: collision with root package name */
    public final String f22361a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22362c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22363d;

    public C2567s(String str, int i9, int i10, boolean z8) {
        this.f22361a = str;
        this.b = i9;
        this.f22362c = i10;
        this.f22363d = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2567s)) {
            return false;
        }
        C2567s c2567s = (C2567s) obj;
        if (G7.j.a(this.f22361a, c2567s.f22361a) && this.b == c2567s.b && this.f22362c == c2567s.f22362c && this.f22363d == c2567s.f22363d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (Integer.hashCode(this.f22362c) + ((Integer.hashCode(this.b) + (this.f22361a.hashCode() * 31)) * 31)) * 31;
        boolean z8 = this.f22363d;
        int i9 = z8;
        if (z8 != 0) {
            i9 = 1;
        }
        return hashCode + i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.f22361a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.f22362c);
        sb.append(", isDefaultProcess=");
        return n0.n(sb, this.f22363d, ')');
    }
}

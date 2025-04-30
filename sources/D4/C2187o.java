package d4;

import Q7.n0;

/* renamed from: d4.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2187o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19877a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f19878c;

    public C2187o(Object obj, Object obj2, Object obj3) {
        this.f19877a = obj;
        this.b = obj2;
        this.f19878c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f19877a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.f19878c);
        StringBuilder sb = new StringBuilder(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39);
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return new IllegalArgumentException(n0.m(sb, " and ", valueOf3, "=", valueOf4));
    }
}

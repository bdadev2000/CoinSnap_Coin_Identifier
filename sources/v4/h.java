package v4;

import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f23617c = new h(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f23618a;
    public final int b;

    public h(int i9, int i10) {
        this.f23618a = i9;
        this.b = i10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(h.class.getSimpleName());
        sb.append("[position = ");
        sb.append(this.f23618a);
        sb.append(", length = ");
        return AbstractC2914a.g(sb, this.b, "]");
    }
}

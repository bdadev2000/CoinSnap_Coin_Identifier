package x1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final int f27337b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27338c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27339d;

    /* renamed from: f, reason: collision with root package name */
    public final String f27340f;

    public d(int i10, int i11, String from, String to) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        this.f27337b = i10;
        this.f27338c = i11;
        this.f27339d = from;
        this.f27340f = to;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d other = (d) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int i10 = this.f27337b - other.f27337b;
        if (i10 == 0) {
            return this.f27338c - other.f27338c;
        }
        return i10;
    }
}

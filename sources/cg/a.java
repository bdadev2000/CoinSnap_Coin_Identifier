package cg;

import a4.j;

/* loaded from: classes4.dex */
public final class a {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f2795b;

    /* renamed from: c, reason: collision with root package name */
    public long f2796c;

    /* renamed from: d, reason: collision with root package name */
    public int f2797d;

    /* renamed from: e, reason: collision with root package name */
    public int f2798e;

    public a() {
        long currentTimeMillis = System.currentTimeMillis();
        this.a = 3;
        this.f2795b = 0;
        this.f2796c = currentTimeMillis;
        this.f2797d = 0;
        this.f2798e = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.f2795b == aVar.f2795b && this.f2796c == aVar.f2796c && this.f2797d == aVar.f2797d && this.f2798e == aVar.f2798e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2798e) + kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.e(this.f2797d, (Long.hashCode(this.f2796c) + kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.e(this.f2795b, Integer.hashCode(this.a) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IapEntity(totalNumberOfScans=");
        sb2.append(this.a);
        sb2.append(", totalNumberOfTimesUsed=");
        sb2.append(this.f2795b);
        sb2.append(", lastTimeBought=");
        sb2.append(this.f2796c);
        sb2.append(", countBoughtIap=");
        sb2.append(this.f2797d);
        sb2.append(", typeIap=");
        return j.i(sb2, this.f2798e, ')');
    }
}

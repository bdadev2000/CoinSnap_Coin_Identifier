package g0;

import java.util.Comparator;

/* loaded from: classes4.dex */
public final class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final a f30586a = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        p0.a.s(comparable, "a");
        p0.a.s(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return b.f30587a;
    }
}

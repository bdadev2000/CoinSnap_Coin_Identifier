package d4;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class C extends D implements Serializable {
    public static final C b = new D();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}

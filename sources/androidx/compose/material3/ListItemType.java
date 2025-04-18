package androidx.compose.material3;

/* loaded from: classes2.dex */
final class ListItemType implements Comparable<ListItemType> {

    /* loaded from: classes2.dex */
    public static final class Companion {
        public static int a(boolean z2, boolean z3, boolean z4) {
            if ((z2 && z3) || z4) {
                return 3;
            }
            return (z2 || z3) ? 2 : 1;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(ListItemType listItemType) {
        listItemType.getClass();
        return p0.a.E(0, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ListItemType)) {
            return false;
        }
        ((ListItemType) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(0);
    }

    public final String toString() {
        return "ListItemType(lines=0)";
    }
}

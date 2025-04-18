package e0;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class s extends q {
    public static void r0(List list) {
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void s0(List list, Comparator comparator) {
        p0.a.s(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

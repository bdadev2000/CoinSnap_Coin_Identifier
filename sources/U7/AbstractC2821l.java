package u7;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: u7.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2821l extends AbstractC2820k {
    public static void F(List list, Comparator comparator) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}

package u7;

import java.util.Collection;

/* renamed from: u7.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2818i extends AbstractC2817h {
    public static int E(Iterable iterable, int i9) {
        G7.j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i9;
    }
}

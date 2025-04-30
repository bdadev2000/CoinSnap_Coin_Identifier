package u7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: u7.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2817h extends android.support.v4.media.session.a {
    public static int A(List list) {
        G7.j.e(list, "<this>");
        return list.size() - 1;
    }

    public static List B(Object... objArr) {
        G7.j.e(objArr, "elements");
        if (objArr.length > 0) {
            return AbstractC2815f.t(objArr);
        }
        return C2824o.b;
    }

    public static final List C(List list) {
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return android.support.v4.media.session.a.w(list.get(0));
            }
            return list;
        }
        return C2824o.b;
    }

    public static void D() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static ArrayList y(Object... objArr) {
        G7.j.e(objArr, "elements");
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C2813d(objArr, true));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [L7.c, L7.a] */
    public static L7.c z(Collection collection) {
        G7.j.e(collection, "<this>");
        return new L7.a(0, collection.size() - 1, 1);
    }
}

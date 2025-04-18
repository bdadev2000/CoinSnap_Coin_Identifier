package r7;

import android.util.SparseArray;
import eb.j;
import f7.d;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class a {
    public static final SparseArray a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f24004b;

    static {
        HashMap hashMap = new HashMap();
        f24004b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        hashMap.put(d.VERY_LOW, 1);
        hashMap.put(d.HIGHEST, 2);
        for (d dVar : hashMap.keySet()) {
            a.append(((Integer) f24004b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f24004b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = (d) a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(j.i("Unknown Priority for value ", i10));
    }
}

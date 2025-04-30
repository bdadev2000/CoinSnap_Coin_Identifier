package u3;

import android.util.SparseArray;
import com.mbridge.msdk.foundation.entity.o;
import h3.d;
import java.util.HashMap;

/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2753a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f23106a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(d.b, 0);
        hashMap.put(d.f20586c, 1);
        hashMap.put(d.f20587d, 2);
        for (d dVar : hashMap.keySet()) {
            f23106a.append(((Integer) b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i9) {
        d dVar = (d) f23106a.get(i9);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(o.h(i9, "Unknown Priority for value "));
    }
}

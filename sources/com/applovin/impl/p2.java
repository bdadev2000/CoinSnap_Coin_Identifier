package com.applovin.impl;

import android.os.Bundle;
import android.util.SparseArray;
import com.applovin.impl.eb;
import com.applovin.impl.o2;
import java.util.List;

/* loaded from: classes.dex */
public abstract class p2 {
    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) xp.a(p2.class.getClassLoader()));
        }
    }

    public static List a(o2.a aVar, List list, List list2) {
        return list == null ? list2 : a(aVar, list);
    }

    public static SparseArray a(o2.a aVar, SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2;
        }
        SparseArray sparseArray3 = new SparseArray(sparseArray.size());
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            sparseArray3.put(sparseArray.keyAt(i2), aVar.a((Bundle) sparseArray.valueAt(i2)));
        }
        return sparseArray3;
    }

    public static o2 a(o2.a aVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return aVar.a(bundle);
    }

    public static eb a(o2.a aVar, List list) {
        eb.a f2 = eb.f();
        for (int i2 = 0; i2 < list.size(); i2++) {
            f2.b(aVar.a((Bundle) b1.a((Bundle) list.get(i2))));
        }
        return f2.a();
    }
}

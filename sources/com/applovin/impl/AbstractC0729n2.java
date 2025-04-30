package com.applovin.impl;

import android.os.Bundle;
import android.util.SparseArray;
import com.applovin.impl.InterfaceC0725m2;
import com.applovin.impl.ab;
import java.util.List;

/* renamed from: com.applovin.impl.n2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0729n2 {
    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) yp.a(AbstractC0729n2.class.getClassLoader()));
        }
    }

    public static List a(InterfaceC0725m2.a aVar, List list, List list2) {
        return list == null ? list2 : a(aVar, list);
    }

    public static SparseArray a(InterfaceC0725m2.a aVar, SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2;
        }
        SparseArray sparseArray3 = new SparseArray(sparseArray.size());
        for (int i9 = 0; i9 < sparseArray.size(); i9++) {
            sparseArray3.put(sparseArray.keyAt(i9), aVar.a((Bundle) sparseArray.valueAt(i9)));
        }
        return sparseArray3;
    }

    public static InterfaceC0725m2 a(InterfaceC0725m2.a aVar, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return aVar.a(bundle);
    }

    public static ab a(InterfaceC0725m2.a aVar, List list) {
        ab.a f9 = ab.f();
        for (int i9 = 0; i9 < list.size(); i9++) {
            f9.b(aVar.a((Bundle) AbstractC0669a1.a((Bundle) list.get(i9))));
        }
        return f9.a();
    }
}

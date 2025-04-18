package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class c1 {
    public final SparseArray a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public int f1884b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Set f1885c = Collections.newSetFromMap(new IdentityHashMap());

    public final b1 a(int i10) {
        SparseArray sparseArray = this.a;
        b1 b1Var = (b1) sparseArray.get(i10);
        if (b1Var == null) {
            b1 b1Var2 = new b1();
            sparseArray.put(i10, b1Var2);
            return b1Var2;
        }
        return b1Var;
    }
}

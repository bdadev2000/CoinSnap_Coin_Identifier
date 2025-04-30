package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.util.Set;

/* renamed from: androidx.recyclerview.widget.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0523d0 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f4967a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public Set f4968c;

    public final C0521c0 a(int i9) {
        SparseArray sparseArray = this.f4967a;
        C0521c0 c0521c0 = (C0521c0) sparseArray.get(i9);
        if (c0521c0 == null) {
            C0521c0 c0521c02 = new C0521c0();
            sparseArray.put(i9, c0521c02);
            return c0521c02;
        }
        return c0521c0;
    }
}

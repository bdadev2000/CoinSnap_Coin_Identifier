package androidx.collection;

import android.support.v4.media.d;
import e0.q;

/* loaded from: classes2.dex */
public final class IntListKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1435a = 0;

    static {
        new MutableIntList(0);
    }

    public static final MutableIntList a(int... iArr) {
        MutableIntList mutableIntList = new MutableIntList(iArr.length);
        int i2 = mutableIntList.f1434b;
        if (i2 < 0) {
            StringBuilder t2 = d.t("Index ", i2, " must be in 0..");
            t2.append(mutableIntList.f1434b);
            throw new IndexOutOfBoundsException(t2.toString());
        }
        if (iArr.length != 0) {
            mutableIntList.c(iArr.length + i2);
            int[] iArr2 = mutableIntList.f1433a;
            int i3 = mutableIntList.f1434b;
            if (i2 != i3) {
                q.O(iArr.length + i2, i2, i3, iArr2, iArr2);
            }
            q.S(iArr, iArr2, i2, 0, 12);
            mutableIntList.f1434b += iArr.length;
        }
        return mutableIntList;
    }
}

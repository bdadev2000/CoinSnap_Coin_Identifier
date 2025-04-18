package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import q0.p;
import w0.e;
import w0.f;

@StabilityInferred
@ExperimentalFoundationApi
/* loaded from: classes4.dex */
public final class LazyStaggeredGridScrollPosition {

    /* renamed from: a, reason: collision with root package name */
    public final p f5035a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5036b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f5037c;
    public int[] d;
    public final ParcelableSnapshotMutableIntState e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5038f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5039g;

    /* renamed from: h, reason: collision with root package name */
    public final LazyLayoutNearestRangeState f5040h;

    public LazyStaggeredGridScrollPosition(int[] iArr, int[] iArr2, p pVar) {
        Integer valueOf;
        this.f5035a = pVar;
        this.f5036b = iArr;
        this.f5037c = SnapshotIntStateKt.a(a(iArr));
        this.d = iArr2;
        this.e = SnapshotIntStateKt.a(b(iArr, iArr2));
        if (iArr.length == 0) {
            valueOf = null;
        } else {
            int i2 = iArr[0];
            f it = new e(1, iArr.length - 1, 1).iterator();
            while (it.f31411c) {
                int i3 = iArr[it.b()];
                if (i2 > i3) {
                    i2 = i3;
                }
            }
            valueOf = Integer.valueOf(i2);
        }
        this.f5040h = new LazyLayoutNearestRangeState(valueOf != null ? valueOf.intValue() : 0, 90, 200);
    }

    public static int a(int[] iArr) {
        int i2 = Integer.MAX_VALUE;
        for (int i3 : iArr) {
            if (i3 <= 0) {
                return 0;
            }
            if (i2 > i3) {
                i2 = i3;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            return 0;
        }
        return i2;
    }

    public static int b(int[] iArr, int[] iArr2) {
        int a2 = a(iArr);
        int length = iArr2.length;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            if (iArr[i3] == a2) {
                i2 = Math.min(i2, iArr2[i3]);
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            return 0;
        }
        return i2;
    }
}

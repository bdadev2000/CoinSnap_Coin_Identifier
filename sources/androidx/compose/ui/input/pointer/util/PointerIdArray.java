package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class PointerIdArray {

    /* renamed from: a, reason: collision with root package name */
    public int f15671a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f15672b;

    public final void a(long j2) {
        if (b(j2)) {
            return;
        }
        int i2 = this.f15671a;
        long[] jArr = this.f15672b;
        if (i2 >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i2 + 1, jArr.length * 2));
            a.r(copyOf, "copyOf(this, newSize)");
            this.f15672b = copyOf;
        }
        this.f15672b[i2] = j2;
        if (i2 >= this.f15671a) {
            this.f15671a = i2 + 1;
        }
    }

    public final boolean b(long j2) {
        int i2 = this.f15671a;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f15672b[i3] == j2) {
                return true;
            }
        }
        return false;
    }

    public final void c(int i2) {
        int i3 = this.f15671a;
        if (i2 < i3) {
            int i4 = i3 - 1;
            while (i2 < i4) {
                long[] jArr = this.f15672b;
                int i5 = i2 + 1;
                jArr[i2] = jArr[i5];
                i2 = i5;
            }
            this.f15671a--;
        }
    }
}

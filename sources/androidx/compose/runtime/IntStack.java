package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;

@StabilityInferred
/* loaded from: classes4.dex */
public final class IntStack {

    /* renamed from: a, reason: collision with root package name */
    public int[] f13807a = new int[10];

    /* renamed from: b, reason: collision with root package name */
    public int f13808b;

    public final int a() {
        int[] iArr = this.f13807a;
        int i2 = this.f13808b - 1;
        this.f13808b = i2;
        return iArr[i2];
    }

    public final void b(int i2) {
        int i3 = this.f13808b;
        int[] iArr = this.f13807a;
        if (i3 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            p0.a.r(copyOf, "copyOf(this, newSize)");
            this.f13807a = copyOf;
        }
        int[] iArr2 = this.f13807a;
        int i4 = this.f13808b;
        this.f13808b = i4 + 1;
        iArr2[i4] = i2;
    }
}

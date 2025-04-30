package D0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f590a;
    public final boolean[] b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f591c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f592d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f593e;

    public c(int i9) {
        long[] jArr = new long[i9];
        this.f590a = jArr;
        boolean[] zArr = new boolean[i9];
        this.b = zArr;
        this.f591c = new int[i9];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }

    public final int[] a() {
        boolean z8;
        synchronized (this) {
            try {
                if (this.f592d && !this.f593e) {
                    int length = this.f590a.length;
                    int i9 = 0;
                    while (true) {
                        int i10 = 1;
                        if (i9 < length) {
                            if (this.f590a[i9] > 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            boolean[] zArr = this.b;
                            if (z8 != zArr[i9]) {
                                int[] iArr = this.f591c;
                                if (!z8) {
                                    i10 = 2;
                                }
                                iArr[i9] = i10;
                            } else {
                                this.f591c[i9] = 0;
                            }
                            zArr[i9] = z8;
                            i9++;
                        } else {
                            this.f593e = true;
                            this.f592d = false;
                            return this.f591c;
                        }
                    }
                }
                return null;
            } finally {
            }
        }
    }
}

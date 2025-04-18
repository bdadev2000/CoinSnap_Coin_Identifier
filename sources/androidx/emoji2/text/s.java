package androidx.emoji2.text;

import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s {
    public int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final y f1525b;

    /* renamed from: c, reason: collision with root package name */
    public y f1526c;

    /* renamed from: d, reason: collision with root package name */
    public y f1527d;

    /* renamed from: e, reason: collision with root package name */
    public int f1528e;

    /* renamed from: f, reason: collision with root package name */
    public int f1529f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1530g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f1531h;

    public s(y yVar, boolean z10, int[] iArr) {
        this.f1525b = yVar;
        this.f1526c = yVar;
        this.f1530g = z10;
        this.f1531h = iArr;
    }

    public final int a(int i10) {
        y yVar;
        boolean z10;
        SparseArray sparseArray = this.f1526c.a;
        if (sparseArray == null) {
            yVar = null;
        } else {
            yVar = (y) sparseArray.get(i10);
        }
        int i11 = 1;
        if (this.a != 2) {
            if (yVar == null) {
                b();
            } else {
                this.a = 2;
                this.f1526c = yVar;
                this.f1529f = 1;
                i11 = 2;
            }
        } else {
            if (yVar != null) {
                this.f1526c = yVar;
                this.f1529f++;
            } else {
                boolean z11 = false;
                if (i10 == 65038) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    b();
                } else {
                    if (i10 == 65039) {
                        z11 = true;
                    }
                    if (!z11) {
                        y yVar2 = this.f1526c;
                        if (yVar2.f1550b != null) {
                            if (this.f1529f == 1) {
                                if (c()) {
                                    this.f1527d = this.f1526c;
                                    b();
                                } else {
                                    b();
                                }
                            } else {
                                this.f1527d = yVar2;
                                b();
                            }
                            i11 = 3;
                        } else {
                            b();
                        }
                    }
                }
            }
            i11 = 2;
        }
        this.f1528e = i10;
        return i11;
    }

    public final void b() {
        this.a = 1;
        this.f1526c = this.f1525b;
        this.f1529f = 0;
    }

    public final boolean c() {
        boolean z10;
        boolean z11;
        int[] iArr;
        d1.a c10 = this.f1526c.f1550b.c();
        int a = c10.a(6);
        if (a != 0 && ((ByteBuffer) c10.f16791d).get(a + c10.a) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        if (this.f1528e == 65039) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return true;
        }
        if (!this.f1530g || ((iArr = this.f1531h) != null && Arrays.binarySearch(iArr, this.f1526c.f1550b.a(0)) >= 0)) {
            return false;
        }
        return true;
    }
}

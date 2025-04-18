package ei;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public int f17400b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f17401c;

    /* renamed from: d, reason: collision with root package name */
    public final ki.e0 f17402d;

    /* renamed from: e, reason: collision with root package name */
    public c[] f17403e;

    /* renamed from: f, reason: collision with root package name */
    public int f17404f;

    /* renamed from: g, reason: collision with root package name */
    public int f17405g;

    /* renamed from: h, reason: collision with root package name */
    public int f17406h;

    public d(v source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.a = 4096;
        this.f17400b = 4096;
        this.f17401c = new ArrayList();
        this.f17402d = a6.k.f(source);
        this.f17403e = new c[8];
        this.f17404f = 7;
    }

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        if (i10 > 0) {
            int length = this.f17403e.length;
            while (true) {
                length--;
                i11 = this.f17404f;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                c cVar = this.f17403e[length];
                Intrinsics.checkNotNull(cVar);
                int i13 = cVar.f17397c;
                i10 -= i13;
                this.f17406h -= i13;
                this.f17405g--;
                i12++;
            }
            c[] cVarArr = this.f17403e;
            System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f17405g);
            this.f17404f += i12;
        }
        return i12;
    }

    public final ki.l b(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= f.a.length - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return f.a[i10].a;
        }
        int length = this.f17404f + 1 + (i10 - f.a.length);
        if (length >= 0) {
            c[] cVarArr = this.f17403e;
            if (length < cVarArr.length) {
                c cVar = cVarArr[length];
                Intrinsics.checkNotNull(cVar);
                return cVar.a;
            }
        }
        throw new IOException(Intrinsics.stringPlus("Header index too large ", Integer.valueOf(i10 + 1)));
    }

    public final void c(c cVar) {
        this.f17401c.add(cVar);
        int i10 = this.f17400b;
        int i11 = cVar.f17397c;
        if (i11 > i10) {
            ArraysKt___ArraysJvmKt.fill$default(this.f17403e, (Object) null, 0, 0, 6, (Object) null);
            this.f17404f = this.f17403e.length - 1;
            this.f17405g = 0;
            this.f17406h = 0;
            return;
        }
        a((this.f17406h + i11) - i10);
        int i12 = this.f17405g + 1;
        c[] cVarArr = this.f17403e;
        if (i12 > cVarArr.length) {
            c[] cVarArr2 = new c[cVarArr.length * 2];
            System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
            this.f17404f = this.f17403e.length - 1;
            this.f17403e = cVarArr2;
        }
        int i13 = this.f17404f;
        this.f17404f = i13 - 1;
        this.f17403e[i13] = cVar;
        this.f17405g++;
        this.f17406h += i11;
    }

    public final ki.l d() {
        boolean z10;
        ki.e0 source = this.f17402d;
        byte readByte = source.readByte();
        byte[] bArr = xh.b.a;
        int i10 = readByte & UByte.MAX_VALUE;
        int i11 = 0;
        if ((i10 & 128) == 128) {
            z10 = true;
        } else {
            z10 = false;
        }
        long e2 = e(i10, 127);
        if (z10) {
            ki.i sink = new ki.i();
            int[] iArr = c0.a;
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            e1.b bVar = c0.f17399c;
            long j3 = 0;
            e1.b bVar2 = bVar;
            int i12 = 0;
            while (j3 < e2) {
                j3++;
                byte readByte2 = source.readByte();
                byte[] bArr2 = xh.b.a;
                i11 = (i11 << 8) | (readByte2 & UByte.MAX_VALUE);
                i12 += 8;
                while (i12 >= 8) {
                    int i13 = i12 - 8;
                    e1.b[] bVarArr = (e1.b[]) bVar2.f17071d;
                    Intrinsics.checkNotNull(bVarArr);
                    bVar2 = bVarArr[(i11 >>> i13) & 255];
                    Intrinsics.checkNotNull(bVar2);
                    if (((e1.b[]) bVar2.f17071d) == null) {
                        sink.w(bVar2.f17069b);
                        i12 -= bVar2.f17070c;
                        bVar2 = bVar;
                    } else {
                        i12 = i13;
                    }
                }
            }
            while (i12 > 0) {
                e1.b[] bVarArr2 = (e1.b[]) bVar2.f17071d;
                Intrinsics.checkNotNull(bVarArr2);
                e1.b bVar3 = bVarArr2[(i11 << (8 - i12)) & 255];
                Intrinsics.checkNotNull(bVar3);
                if (((e1.b[]) bVar3.f17071d) != null || bVar3.f17070c > i12) {
                    break;
                }
                sink.w(bVar3.f17069b);
                i12 -= bVar3.f17070c;
                bVar2 = bVar;
            }
            return sink.readByteString();
        }
        return source.readByteString(e2);
    }

    public final int e(int i10, int i11) {
        int i12 = i10 & i11;
        if (i12 < i11) {
            return i12;
        }
        int i13 = 0;
        while (true) {
            byte readByte = this.f17402d.readByte();
            byte[] bArr = xh.b.a;
            int i14 = readByte & UByte.MAX_VALUE;
            if ((i14 & 128) == 0) {
                return i11 + (i14 << i13);
            }
            i11 += (i14 & 127) << i13;
            i13 += 7;
        }
    }
}

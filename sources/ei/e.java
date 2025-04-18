package ei;

import java.util.Arrays;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final ki.i f17407b;

    /* renamed from: c, reason: collision with root package name */
    public int f17408c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17409d;

    /* renamed from: e, reason: collision with root package name */
    public int f17410e;

    /* renamed from: f, reason: collision with root package name */
    public c[] f17411f;

    /* renamed from: g, reason: collision with root package name */
    public int f17412g;

    /* renamed from: h, reason: collision with root package name */
    public int f17413h;

    /* renamed from: i, reason: collision with root package name */
    public int f17414i;

    public e(ki.i out) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.a = true;
        this.f17407b = out;
        this.f17408c = Integer.MAX_VALUE;
        this.f17410e = 4096;
        this.f17411f = new c[8];
        this.f17412g = 7;
    }

    public final void a(int i10) {
        int i11;
        if (i10 > 0) {
            int length = this.f17411f.length - 1;
            int i12 = 0;
            while (true) {
                i11 = this.f17412g;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                c cVar = this.f17411f[length];
                Intrinsics.checkNotNull(cVar);
                i10 -= cVar.f17397c;
                int i13 = this.f17414i;
                c cVar2 = this.f17411f[length];
                Intrinsics.checkNotNull(cVar2);
                this.f17414i = i13 - cVar2.f17397c;
                this.f17413h--;
                i12++;
                length--;
            }
            c[] cVarArr = this.f17411f;
            int i14 = i11 + 1;
            System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f17413h);
            c[] cVarArr2 = this.f17411f;
            int i15 = this.f17412g + 1;
            Arrays.fill(cVarArr2, i15, i15 + i12, (Object) null);
            this.f17412g += i12;
        }
    }

    public final void b(c cVar) {
        int i10 = this.f17410e;
        int i11 = cVar.f17397c;
        if (i11 > i10) {
            ArraysKt___ArraysJvmKt.fill$default(this.f17411f, (Object) null, 0, 0, 6, (Object) null);
            this.f17412g = this.f17411f.length - 1;
            this.f17413h = 0;
            this.f17414i = 0;
            return;
        }
        a((this.f17414i + i11) - i10);
        int i12 = this.f17413h + 1;
        c[] cVarArr = this.f17411f;
        if (i12 > cVarArr.length) {
            c[] cVarArr2 = new c[cVarArr.length * 2];
            System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
            this.f17412g = this.f17411f.length - 1;
            this.f17411f = cVarArr2;
        }
        int i13 = this.f17412g;
        this.f17412g = i13 - 1;
        this.f17411f[i13] = cVar;
        this.f17413h++;
        this.f17414i += i11;
    }

    public final void c(ki.l source) {
        Intrinsics.checkNotNullParameter(source, "data");
        boolean z10 = this.a;
        ki.i iVar = this.f17407b;
        int i10 = 0;
        if (z10) {
            int[] iArr = c0.a;
            Intrinsics.checkNotNullParameter(source, "bytes");
            int d10 = source.d();
            int i11 = 0;
            long j3 = 0;
            while (i11 < d10) {
                int i12 = i11 + 1;
                byte i13 = source.i(i11);
                byte[] bArr = xh.b.a;
                j3 += c0.f17398b[i13 & UByte.MAX_VALUE];
                i11 = i12;
            }
            if (((int) ((j3 + 7) >> 3)) < source.d()) {
                ki.i sink = new ki.i();
                int[] iArr2 = c0.a;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(sink, "sink");
                int d11 = source.d();
                long j10 = 0;
                int i14 = 0;
                while (i10 < d11) {
                    int i15 = i10 + 1;
                    byte i16 = source.i(i10);
                    byte[] bArr2 = xh.b.a;
                    int i17 = i16 & UByte.MAX_VALUE;
                    int i18 = c0.a[i17];
                    byte b3 = c0.f17398b[i17];
                    j10 = (j10 << b3) | i18;
                    i14 += b3;
                    while (i14 >= 8) {
                        i14 -= 8;
                        sink.w((int) (j10 >> i14));
                    }
                    i10 = i15;
                }
                if (i14 > 0) {
                    sink.w((int) ((255 >>> i14) | (j10 << (8 - i14))));
                }
                ki.l readByteString = sink.readByteString();
                e(readByteString.d(), 127, 128);
                iVar.v(readByteString);
                return;
            }
        }
        e(source.d(), 127, 0);
        iVar.v(source);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.util.ArrayList r14) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ei.e.d(java.util.ArrayList):void");
    }

    public final void e(int i10, int i11, int i12) {
        ki.i iVar = this.f17407b;
        if (i10 < i11) {
            iVar.w(i10 | i12);
            return;
        }
        iVar.w(i12 | i11);
        int i13 = i10 - i11;
        while (i13 >= 128) {
            iVar.w(128 | (i13 & 127));
            i13 >>>= 7;
        }
        iVar.w(i13);
    }
}

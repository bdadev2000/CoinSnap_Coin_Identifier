package G5;

import U3.o;
import android.content.res.TypedArray;
import android.util.SparseArray;
import java.util.Arrays;
import l5.k;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1275a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1276c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1277d;

    public b(String str, int i9, int i10) {
        this.f1276c = str;
        this.b = i9;
        this.f1275a = i10;
        byte[] bArr = new byte[i9 * i10];
        this.f1277d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    public void a(int i9, int i10, int i11, int i12) {
        if (i9 < 0) {
            int i13 = this.f1275a;
            i9 += i13;
            i10 += 4 - ((i13 + 4) % 8);
        }
        int i14 = this.b;
        if (i10 < 0) {
            i10 += i14;
            i9 += 4 - ((i14 + 4) % 8);
        }
        int i15 = 1;
        if ((((CharSequence) this.f1276c).charAt(i11) & (1 << (8 - i12))) == 0) {
            i15 = 0;
        }
        ((byte[]) this.f1277d)[(i9 * i14) + i10] = (byte) i15;
    }

    public void b(int i9, int i10, int i11) {
        int i12 = i9 - 2;
        int i13 = i10 - 2;
        a(i12, i13, i11, 1);
        int i14 = i10 - 1;
        a(i12, i14, i11, 2);
        int i15 = i9 - 1;
        a(i15, i13, i11, 3);
        a(i15, i14, i11, 4);
        a(i15, i10, i11, 5);
        a(i9, i13, i11, 6);
        a(i9, i14, i11, 7);
        a(i9, i10, i11, 8);
    }

    public b(o oVar, k kVar) {
        this.f1276c = new SparseArray();
        this.f1277d = oVar;
        TypedArray typedArray = (TypedArray) kVar.b;
        this.f1275a = typedArray.getResourceId(28, 0);
        this.b = typedArray.getResourceId(52, 0);
    }
}

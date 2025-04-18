package d9;

import a9.g;
import a9.h;
import android.graphics.Bitmap;
import b9.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import kotlin.UByte;
import n9.h0;
import n9.x;

/* loaded from: classes3.dex */
public final class b extends g {

    /* renamed from: m, reason: collision with root package name */
    public final x f16923m = new x();

    /* renamed from: n, reason: collision with root package name */
    public final x f16924n = new x();

    /* renamed from: o, reason: collision with root package name */
    public final a f16925o = new a();

    /* renamed from: p, reason: collision with root package name */
    public Inflater f16926p;

    @Override // a9.g
    public final h b(byte[] bArr, int i10, boolean z10) {
        char c10;
        ArrayList arrayList;
        a9.b bVar;
        int i11;
        int i12;
        int i13;
        int v10;
        int i14;
        int x10;
        x xVar = this.f16923m;
        xVar.E(bArr, i10);
        int i15 = xVar.f22600c;
        int i16 = xVar.f22599b;
        char c11 = 255;
        if (i15 - i16 > 0 && (xVar.a[i16] & UByte.MAX_VALUE) == 120) {
            if (this.f16926p == null) {
                this.f16926p = new Inflater();
            }
            Inflater inflater = this.f16926p;
            x xVar2 = this.f16924n;
            if (h0.D(xVar, xVar2, inflater)) {
                xVar.E(xVar2.a, xVar2.f22600c);
            }
        }
        a aVar = this.f16925o;
        int i17 = 0;
        aVar.f16917d = 0;
        aVar.f16918e = 0;
        aVar.f16919f = 0;
        aVar.f16920g = 0;
        aVar.f16921h = 0;
        aVar.f16922i = 0;
        aVar.a.D(0);
        aVar.f16916c = false;
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            int i18 = xVar.f22600c;
            if (i18 - xVar.f22599b >= 3) {
                int v11 = xVar.v();
                int A = xVar.A();
                int i19 = xVar.f22599b + A;
                if (i19 > i18) {
                    xVar.G(i18);
                    c10 = c11;
                    arrayList = arrayList2;
                    i11 = i17;
                    bVar = null;
                } else {
                    int[] iArr = aVar.f16915b;
                    x xVar3 = aVar.a;
                    if (v11 != 128) {
                        int i20 = 1;
                        switch (v11) {
                            case 20:
                                if (A % 5 == 2) {
                                    xVar.H(2);
                                    Arrays.fill(iArr, i17);
                                    int i21 = A / 5;
                                    int i22 = i17;
                                    while (i22 < i21) {
                                        int v12 = xVar.v();
                                        int[] iArr2 = iArr;
                                        double v13 = xVar.v();
                                        double v14 = xVar.v() - 128;
                                        double v15 = xVar.v() - 128;
                                        iArr2[v12] = (h0.h((int) ((1.402d * v14) + v13), 0, 255) << 16) | (xVar.v() << 24) | (h0.h((int) ((v13 - (0.34414d * v15)) - (v14 * 0.71414d)), 0, 255) << 8) | h0.h((int) ((v15 * 1.772d) + v13), 0, 255);
                                        i22++;
                                        iArr = iArr2;
                                        c11 = 255;
                                        arrayList2 = arrayList2;
                                    }
                                    c10 = c11;
                                    arrayList = arrayList2;
                                    aVar.f16916c = true;
                                    break;
                                }
                                break;
                            case 21:
                                if (A >= 4) {
                                    xVar.H(3);
                                    if ((128 & xVar.v()) == 0) {
                                        i20 = i17;
                                    }
                                    int i23 = A - 4;
                                    if (i20 != 0) {
                                        if (i23 >= 7 && (x10 = xVar.x()) >= 4) {
                                            aVar.f16921h = xVar.A();
                                            aVar.f16922i = xVar.A();
                                            xVar3.D(x10 - 4);
                                            i23 -= 7;
                                        }
                                    }
                                    int i24 = xVar3.f22599b;
                                    int i25 = xVar3.f22600c;
                                    if (i24 < i25 && i23 > 0) {
                                        int min = Math.min(i23, i25 - i24);
                                        xVar.d(xVar3.a, i24, min);
                                        xVar3.G(i24 + min);
                                        break;
                                    }
                                }
                                break;
                            case 22:
                                if (A >= 19) {
                                    aVar.f16917d = xVar.A();
                                    aVar.f16918e = xVar.A();
                                    xVar.H(11);
                                    aVar.f16919f = xVar.A();
                                    aVar.f16920g = xVar.A();
                                    break;
                                }
                                break;
                        }
                        c10 = c11;
                        arrayList = arrayList2;
                        bVar = null;
                        i11 = 0;
                    } else {
                        c10 = c11;
                        arrayList = arrayList2;
                        if (aVar.f16917d != 0 && aVar.f16918e != 0 && aVar.f16921h != 0 && aVar.f16922i != 0 && (i12 = xVar3.f22600c) != 0 && xVar3.f22599b == i12 && aVar.f16916c) {
                            xVar3.G(0);
                            int i26 = aVar.f16921h * aVar.f16922i;
                            int[] iArr3 = new int[i26];
                            int i27 = 0;
                            while (i27 < i26) {
                                int v16 = xVar3.v();
                                if (v16 != 0) {
                                    i13 = i27 + 1;
                                    iArr3[i27] = iArr[v16];
                                } else {
                                    int v17 = xVar3.v();
                                    if (v17 != 0) {
                                        if ((v17 & 64) == 0) {
                                            v10 = v17 & 63;
                                        } else {
                                            v10 = ((v17 & 63) << 8) | xVar3.v();
                                        }
                                        if ((v17 & 128) == 0) {
                                            i14 = 0;
                                        } else {
                                            i14 = iArr[xVar3.v()];
                                        }
                                        i13 = v10 + i27;
                                        Arrays.fill(iArr3, i27, i13, i14);
                                    }
                                }
                                i27 = i13;
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(iArr3, aVar.f16921h, aVar.f16922i, Bitmap.Config.ARGB_8888);
                            a9.a aVar2 = new a9.a();
                            aVar2.f343b = createBitmap;
                            float f10 = aVar.f16919f;
                            float f11 = aVar.f16917d;
                            aVar2.f349h = f10 / f11;
                            aVar2.f350i = 0;
                            float f12 = aVar.f16920g;
                            float f13 = aVar.f16918e;
                            aVar2.f346e = f12 / f13;
                            aVar2.f347f = 0;
                            aVar2.f348g = 0;
                            aVar2.f353l = aVar.f16921h / f11;
                            aVar2.f354m = aVar.f16922i / f13;
                            bVar = aVar2.a();
                        } else {
                            bVar = null;
                        }
                        i11 = 0;
                        aVar.f16917d = 0;
                        aVar.f16918e = 0;
                        aVar.f16919f = 0;
                        aVar.f16920g = 0;
                        aVar.f16921h = 0;
                        aVar.f16922i = 0;
                        xVar3.D(0);
                        aVar.f16916c = false;
                    }
                    xVar.G(i19);
                }
                arrayList2 = arrayList;
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
                i17 = i11;
                c11 = c10;
            } else {
                return new j(Collections.unmodifiableList(arrayList2), 2);
            }
        }
    }
}

package w3;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l implements e0, rb.a, ze.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26710b;

    /* renamed from: c, reason: collision with root package name */
    public int f26711c;

    public /* synthetic */ l(int i10, int i11) {
        this.f26710b = i11;
        this.f26711c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    @Override // rb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.StackTraceElement[] a(java.lang.StackTraceElement[] r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f26710b
            r3 = 0
            switch(r2) {
                case 1: goto Lb;
                default: goto La;
            }
        La:
            goto L21
        Lb:
            int r2 = r1.length
            int r4 = r0.f26711c
            if (r2 > r4) goto L11
            goto L20
        L11:
            int r2 = r4 / 2
            int r5 = r4 - r2
            java.lang.StackTraceElement[] r4 = new java.lang.StackTraceElement[r4]
            java.lang.System.arraycopy(r1, r3, r4, r3, r5)
            int r3 = r1.length
            int r3 = r3 - r2
            java.lang.System.arraycopy(r1, r3, r4, r5, r2)
            r1 = r4
        L20:
            return r1
        L21:
            int r2 = r0.f26711c
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r5 = r1.length
            java.lang.StackTraceElement[] r5 = new java.lang.StackTraceElement[r5]
            r6 = 1
            r7 = r3
            r8 = r7
            r9 = r6
        L2f:
            int r10 = r1.length
            if (r7 >= r10) goto L88
            r10 = r1[r7]
            java.lang.Object r11 = r4.get(r10)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L75
            int r12 = r11.intValue()
            int r13 = r7 - r12
            int r14 = r7 + r13
            int r15 = r1.length
            if (r14 <= r15) goto L48
            goto L59
        L48:
            r14 = r3
        L49:
            if (r14 >= r13) goto L5f
            int r15 = r12 + r14
            r15 = r1[r15]
            int r16 = r7 + r14
            r3 = r1[r16]
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L5b
        L59:
            r3 = 0
            goto L60
        L5b:
            int r14 = r14 + 1
            r3 = 0
            goto L49
        L5f:
            r3 = r6
        L60:
            if (r3 != 0) goto L63
            goto L75
        L63:
            int r3 = r11.intValue()
            int r3 = r7 - r3
            if (r9 >= r2) goto L71
            java.lang.System.arraycopy(r1, r7, r5, r8, r3)
            int r8 = r8 + r3
            int r9 = r9 + 1
        L71:
            int r3 = r3 + (-1)
            int r3 = r3 + r7
            goto L7d
        L75:
            r3 = r1[r7]
            r5[r8] = r3
            int r8 = r8 + 1
            r9 = r6
            r3 = r7
        L7d:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4.put(r10, r7)
            int r7 = r3 + 1
            r3 = 0
            goto L2f
        L88:
            java.lang.StackTraceElement[] r2 = new java.lang.StackTraceElement[r8]
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r2, r3, r8)
            int r3 = r1.length
            if (r8 >= r3) goto L92
            r1 = r2
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.l.a(java.lang.StackTraceElement[]):java.lang.StackTraceElement[]");
    }

    @Override // ze.f
    public final boolean b(ze.b bVar) {
        switch (this.f26710b) {
            case 4:
                if (bVar.f28749b <= this.f26711c) {
                    return true;
                }
                return false;
            case 5:
                if (bVar.f28749b >= this.f26711c) {
                    return true;
                }
                return false;
            case 6:
                if (bVar.f28750c <= this.f26711c) {
                    return true;
                }
                return false;
            case 7:
                if (bVar.f28750c >= this.f26711c) {
                    return true;
                }
                return false;
            case 8:
                if (bVar.f28750c * bVar.f28749b <= this.f26711c) {
                    return true;
                }
                return false;
            default:
                if (bVar.f28750c * bVar.f28749b >= this.f26711c) {
                    return true;
                }
                return false;
        }
    }

    @Override // w3.e0
    public final Object f(x3.b bVar, float f10) {
        boolean z10;
        int i10;
        float f11;
        int i11;
        int argb;
        int argb2;
        int i12;
        ArrayList arrayList = new ArrayList();
        int i13 = 1;
        if (bVar.u() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            bVar.d();
        }
        while (bVar.p()) {
            arrayList.add(Float.valueOf((float) bVar.r()));
        }
        int i14 = 4;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f26711c = 2;
        }
        if (z10) {
            bVar.j();
        }
        if (this.f26711c == -1) {
            this.f26711c = arrayList.size() / 4;
        }
        int i15 = this.f26711c;
        float[] fArr = new float[i15];
        int[] iArr = new int[i15];
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            i10 = this.f26711c * i14;
            if (i16 >= i10) {
                break;
            }
            int i19 = i16 / 4;
            double floatValue = ((Float) arrayList.get(i16)).floatValue();
            int i20 = i16 % 4;
            if (i20 != 0) {
                if (i20 != i13) {
                    if (i20 != 2) {
                        if (i20 == 3) {
                            iArr[i19] = Color.argb(255, i17, i18, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i18 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i17 = (int) (floatValue * 255.0d);
                }
            } else {
                if (i19 > 0) {
                    float f12 = (float) floatValue;
                    if (fArr[i19 - 1] >= f12) {
                        fArr[i19] = f12 + 0.01f;
                    }
                }
                fArr[i19] = (float) floatValue;
            }
            i16++;
            i13 = 1;
            i14 = 4;
        }
        t3.c cVar = new t3.c(fArr, iArr);
        if (arrayList.size() > i10) {
            int size = (arrayList.size() - i10) / 2;
            float[] fArr2 = new float[size];
            float[] fArr3 = new float[size];
            int i21 = 0;
            while (i10 < arrayList.size()) {
                if (i10 % 2 == 0) {
                    fArr2[i21] = ((Float) arrayList.get(i10)).floatValue();
                } else {
                    fArr3[i21] = ((Float) arrayList.get(i10)).floatValue();
                    i21++;
                }
                i10++;
            }
            float[] fArr4 = cVar.a;
            if (fArr4.length == 0) {
                fArr4 = fArr2;
            } else if (size != 0) {
                int length = fArr4.length + size;
                float[] fArr5 = new float[length];
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                for (int i25 = 0; i25 < length; i25++) {
                    float f13 = Float.NaN;
                    if (i23 < fArr4.length) {
                        f11 = fArr4[i23];
                    } else {
                        f11 = Float.NaN;
                    }
                    if (i24 < size) {
                        f13 = fArr2[i24];
                    }
                    if (!Float.isNaN(f13) && f11 >= f13) {
                        if (!Float.isNaN(f11) && f13 >= f11) {
                            fArr5[i25] = f11;
                            i23++;
                            i24++;
                            i22++;
                        } else {
                            fArr5[i25] = f13;
                            i24++;
                        }
                    } else {
                        fArr5[i25] = f11;
                        i23++;
                    }
                }
                if (i22 == 0) {
                    fArr4 = fArr5;
                } else {
                    fArr4 = Arrays.copyOf(fArr5, length - i22);
                }
            }
            int length2 = fArr4.length;
            int[] iArr2 = new int[length2];
            for (int i26 = 0; i26 < length2; i26++) {
                float f14 = fArr4[i26];
                int binarySearch = Arrays.binarySearch(fArr, f14);
                int binarySearch2 = Arrays.binarySearch(fArr2, f14);
                int[] iArr3 = cVar.f25195b;
                if (binarySearch >= 0 && binarySearch2 <= 0) {
                    int i27 = iArr3[binarySearch];
                    if (size >= 2 && f14 > fArr2[0]) {
                        for (int i28 = 1; i28 < size; i28++) {
                            float f15 = fArr2[i28];
                            if (f15 >= f14 || i28 == size - 1) {
                                if (f15 <= f14) {
                                    i12 = (int) (fArr3[i28] * 255.0f);
                                } else {
                                    int i29 = i28 - 1;
                                    float f16 = fArr2[i29];
                                    float f17 = (f14 - f16) / (f15 - f16);
                                    float f18 = fArr3[i29];
                                    float f19 = fArr3[i28];
                                    PointF pointF = y3.f.a;
                                    i12 = (int) ((((f19 - f18) * f17) + f18) * 255.0f);
                                }
                                argb2 = Color.argb(i12, Color.red(i27), Color.green(i27), Color.blue(i27));
                            }
                        }
                        throw new IllegalArgumentException("Unreachable code.");
                    }
                    argb2 = Color.argb((int) (fArr3[0] * 255.0f), Color.red(i27), Color.green(i27), Color.blue(i27));
                    iArr2[i26] = argb2;
                } else {
                    if (binarySearch2 < 0) {
                        binarySearch2 = -(binarySearch2 + 1);
                    }
                    float f20 = fArr3[binarySearch2];
                    if (iArr3.length >= 2 && f14 != fArr[0]) {
                        for (int i30 = 1; i30 < i15; i30++) {
                            float f21 = fArr[i30];
                            if (f21 >= f14 || i30 == i15 - 1) {
                                if (i30 == i15 - 1 && f14 >= f21) {
                                    argb = Color.argb((int) (f20 * 255.0f), Color.red(iArr3[i30]), Color.green(iArr3[i30]), Color.blue(iArr3[i30]));
                                } else {
                                    int i31 = i30 - 1;
                                    float f22 = fArr[i31];
                                    int n10 = d6.g.n((f14 - f22) / (f21 - f22), iArr3[i31], iArr3[i30]);
                                    argb = Color.argb((int) (f20 * 255.0f), Color.red(n10), Color.green(n10), Color.blue(n10));
                                }
                                i11 = argb;
                            }
                        }
                        throw new IllegalArgumentException("Unreachable code.");
                    }
                    i11 = iArr3[0];
                    iArr2[i26] = i11;
                }
            }
            return new t3.c(fArr4, iArr2);
        }
        return cVar;
    }
}

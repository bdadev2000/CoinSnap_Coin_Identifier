package androidx.work;

import F1.E;
import android.graphics.Color;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import w4.v0;

/* loaded from: classes.dex */
public final class o implements C4.a, E {

    /* renamed from: c, reason: collision with root package name */
    public static o f5247c;
    public int b;

    public /* synthetic */ o(int i9) {
        this.b = i9;
    }

    public static synchronized o e() {
        o oVar;
        synchronized (o.class) {
            try {
                if (f5247c == null) {
                    f5247c = new o(3);
                }
                oVar = f5247c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    public static String g(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // F1.E
    public Object a(G1.c cVar, float f9) {
        boolean z8;
        int i9;
        float f10;
        int i10;
        int argb;
        int argb2;
        float e4;
        ArrayList arrayList = new ArrayList();
        int i11 = 1;
        if (cVar.o() == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            cVar.a();
        }
        while (cVar.j()) {
            arrayList.add(Float.valueOf((float) cVar.l()));
        }
        int i12 = 4;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.b = 2;
        }
        if (z8) {
            cVar.c();
        }
        if (this.b == -1) {
            this.b = arrayList.size() / 4;
        }
        int i13 = this.b;
        float[] fArr = new float[i13];
        int[] iArr = new int[i13];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i9 = this.b * i12;
            if (i14 >= i9) {
                break;
            }
            int i17 = i14 / 4;
            double floatValue = ((Float) arrayList.get(i14)).floatValue();
            int i18 = i14 % 4;
            if (i18 != 0) {
                if (i18 != i11) {
                    if (i18 != 2) {
                        if (i18 == 3) {
                            iArr[i17] = Color.argb(255, i15, i16, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i16 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i15 = (int) (floatValue * 255.0d);
                }
            } else {
                if (i17 > 0) {
                    float f11 = (float) floatValue;
                    if (fArr[i17 - 1] >= f11) {
                        fArr[i17] = f11 + 0.01f;
                    }
                }
                fArr[i17] = (float) floatValue;
            }
            i14++;
            i11 = 1;
            i12 = 4;
        }
        C1.c cVar2 = new C1.c(fArr, iArr);
        if (arrayList.size() > i9) {
            int size = (arrayList.size() - i9) / 2;
            float[] fArr2 = new float[size];
            float[] fArr3 = new float[size];
            int i19 = 0;
            while (i9 < arrayList.size()) {
                if (i9 % 2 == 0) {
                    fArr2[i19] = ((Float) arrayList.get(i9)).floatValue();
                } else {
                    fArr3[i19] = ((Float) arrayList.get(i9)).floatValue();
                    i19++;
                }
                i9++;
            }
            float[] fArr4 = cVar2.f425a;
            if (fArr4.length == 0) {
                fArr4 = fArr2;
            } else if (size != 0) {
                int length = fArr4.length + size;
                float[] fArr5 = new float[length];
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                for (int i23 = 0; i23 < length; i23++) {
                    float f12 = Float.NaN;
                    if (i21 < fArr4.length) {
                        f10 = fArr4[i21];
                    } else {
                        f10 = Float.NaN;
                    }
                    if (i22 < size) {
                        f12 = fArr2[i22];
                    }
                    if (!Float.isNaN(f12) && f10 >= f12) {
                        if (!Float.isNaN(f10) && f12 >= f10) {
                            fArr5[i23] = f10;
                            i21++;
                            i22++;
                            i20++;
                        } else {
                            fArr5[i23] = f12;
                            i22++;
                        }
                    } else {
                        fArr5[i23] = f10;
                        i21++;
                    }
                }
                if (i20 == 0) {
                    fArr4 = fArr5;
                } else {
                    fArr4 = Arrays.copyOf(fArr5, length - i20);
                }
            }
            int length2 = fArr4.length;
            int[] iArr2 = new int[length2];
            for (int i24 = 0; i24 < length2; i24++) {
                float f13 = fArr4[i24];
                int binarySearch = Arrays.binarySearch(fArr, f13);
                int binarySearch2 = Arrays.binarySearch(fArr2, f13);
                int[] iArr3 = cVar2.b;
                if (binarySearch >= 0 && binarySearch2 <= 0) {
                    int i25 = iArr3[binarySearch];
                    if (size >= 2 && f13 > fArr2[0]) {
                        for (int i26 = 1; i26 < size; i26++) {
                            float f14 = fArr2[i26];
                            if (f14 >= f13 || i26 == size - 1) {
                                if (f14 <= f13) {
                                    e4 = fArr3[i26];
                                } else {
                                    int i27 = i26 - 1;
                                    float f15 = fArr2[i27];
                                    e4 = H1.g.e(fArr3[i27], fArr3[i26], (f13 - f15) / (f14 - f15));
                                }
                                argb2 = Color.argb((int) (e4 * 255.0f), Color.red(i25), Color.green(i25), Color.blue(i25));
                            }
                        }
                        throw new IllegalArgumentException("Unreachable code.");
                    }
                    argb2 = Color.argb((int) (fArr3[0] * 255.0f), Color.red(i25), Color.green(i25), Color.blue(i25));
                    iArr2[i24] = argb2;
                } else {
                    if (binarySearch2 < 0) {
                        binarySearch2 = -(binarySearch2 + 1);
                    }
                    float f16 = fArr3[binarySearch2];
                    if (iArr3.length >= 2 && f13 != fArr[0]) {
                        for (int i28 = 1; i28 < i13; i28++) {
                            float f17 = fArr[i28];
                            if (f17 >= f13 || i28 == i13 - 1) {
                                if (i28 == i13 - 1 && f13 >= f17) {
                                    argb = Color.argb((int) (f16 * 255.0f), Color.red(iArr3[i28]), Color.green(iArr3[i28]), Color.blue(iArr3[i28]));
                                } else {
                                    int i29 = i28 - 1;
                                    float f18 = fArr[i29];
                                    int k6 = v0.k((f13 - f18) / (f17 - f18), iArr3[i29], iArr3[i28]);
                                    argb = Color.argb((int) (f16 * 255.0f), Color.red(k6), Color.green(k6), Color.blue(k6));
                                }
                                i10 = argb;
                            }
                        }
                        throw new IllegalArgumentException("Unreachable code.");
                    }
                    i10 = iArr3[0];
                    iArr2[i24] = i10;
                }
            }
            return new C1.c(fArr4, iArr2);
        }
        return cVar2;
    }

    public void b(String str, String str2, Throwable... thArr) {
        if (this.b <= 3) {
            if (thArr.length >= 1) {
                Log.d(str, str2, thArr[0]);
            } else {
                Log.d(str, str2);
            }
        }
    }

    @Override // C4.a
    public StackTraceElement[] c(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i9 = this.b;
        if (length <= i9) {
            return stackTraceElementArr;
        }
        int i10 = i9 / 2;
        int i11 = i9 - i10;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i9];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i11);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i10, stackTraceElementArr2, i11, i10);
        return stackTraceElementArr2;
    }

    public void d(String str, String str2, Throwable... thArr) {
        if (this.b <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public void f(String str, String str2, Throwable... thArr) {
        if (this.b <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public void h(String str, String str2, Throwable... thArr) {
        if (this.b <= 5) {
            if (thArr.length >= 1) {
                Log.w(str, str2, thArr[0]);
            } else {
                Log.w(str, str2);
            }
        }
    }
}

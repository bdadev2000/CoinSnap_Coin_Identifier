package g0;

import android.graphics.Path;
import android.util.Log;

/* loaded from: classes.dex */
public final class k {
    public char a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f17915b;

    public k(char c10, float[] fArr) {
        this.a = c10;
        this.f17915b = fArr;
    }

    public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
        double d10;
        double d11;
        double radians = Math.toRadians(f16);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d12 = f10;
        double d13 = f11;
        double d14 = (d13 * sin) + (d12 * cos);
        double d15 = d12;
        double d16 = f14;
        double d17 = d14 / d16;
        double d18 = f15;
        double d19 = ((d13 * cos) + ((-f10) * sin)) / d18;
        double d20 = d13;
        double d21 = f13;
        double d22 = ((d21 * sin) + (f12 * cos)) / d16;
        double d23 = ((d21 * cos) + ((-f12) * sin)) / d18;
        double d24 = d17 - d22;
        double d25 = d19 - d23;
        double d26 = (d17 + d22) / 2.0d;
        double d27 = (d19 + d23) / 2.0d;
        double d28 = (d25 * d25) + (d24 * d24);
        if (d28 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d29 = (1.0d / d28) - 0.25d;
        if (d29 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d28);
            float sqrt = (float) (Math.sqrt(d28) / 1.99999d);
            a(path, f10, f11, f12, f13, f14 * sqrt, f15 * sqrt, f16, z10, z11);
            return;
        }
        double sqrt2 = Math.sqrt(d29);
        double d30 = d24 * sqrt2;
        double d31 = sqrt2 * d25;
        if (z10 == z11) {
            d10 = d26 - d31;
            d11 = d27 + d30;
        } else {
            d10 = d26 + d31;
            d11 = d27 - d30;
        }
        double atan2 = Math.atan2(d19 - d11, d17 - d10);
        double atan22 = Math.atan2(d23 - d11, d22 - d10) - atan2;
        if (z11 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d32 = d10 * d16;
        double d33 = d11 * d18;
        double d34 = (d32 * cos) - (d33 * sin);
        double d35 = (d33 * cos) + (d32 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d36 = -d16;
        double d37 = d36 * cos2;
        double d38 = d18 * sin2;
        double d39 = (d37 * sin3) - (d38 * cos3);
        double d40 = d36 * sin2;
        double d41 = d18 * cos2;
        double d42 = (cos3 * d41) + (sin3 * d40);
        double d43 = d41;
        double d44 = atan22 / ceil;
        int i10 = 0;
        while (i10 < ceil) {
            double d45 = atan2 + d44;
            double sin4 = Math.sin(d45);
            double cos4 = Math.cos(d45);
            double d46 = d44;
            double d47 = (((d16 * cos2) * cos4) + d34) - (d38 * sin4);
            double d48 = d43;
            double d49 = d34;
            double d50 = (d48 * sin4) + (d16 * sin2 * cos4) + d35;
            double d51 = (d37 * sin4) - (d38 * cos4);
            double d52 = (cos4 * d48) + (sin4 * d40);
            double d53 = d45 - atan2;
            double tan = Math.tan(d53 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d53)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d39 * sqrt3) + d15), (float) ((d42 * sqrt3) + d20), (float) (d47 - (sqrt3 * d51)), (float) (d50 - (sqrt3 * d52)), (float) d47, (float) d50);
            i10++;
            atan2 = d45;
            d40 = d40;
            cos2 = cos2;
            ceil = ceil;
            d42 = d52;
            d16 = d16;
            d39 = d51;
            d15 = d47;
            d20 = d50;
            d34 = d49;
            d44 = d46;
            d43 = d48;
        }
    }

    public static void b(k[] kVarArr, Path path) {
        int i10;
        int i11;
        char c10;
        k kVar;
        int i12;
        int i13;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        k[] kVarArr2 = kVarArr;
        float[] fArr = new float[6];
        int length = kVarArr2.length;
        int i14 = 0;
        int i15 = 0;
        char c11 = 'm';
        while (i15 < length) {
            k kVar2 = kVarArr2[i15];
            char c12 = kVar2.a;
            float f28 = fArr[i14];
            float f29 = fArr[1];
            float f30 = fArr[2];
            float f31 = fArr[3];
            float f32 = fArr[4];
            float f33 = fArr[5];
            switch (c12) {
                case 'A':
                case 'a':
                    i10 = 7;
                    break;
                case 'C':
                case 'c':
                    i10 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i10 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i10 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f32, f33);
                    f28 = f32;
                    f30 = f28;
                    f29 = f33;
                    f31 = f29;
                    break;
            }
            i10 = 2;
            float f34 = f32;
            float f35 = f33;
            float f36 = f28;
            float f37 = f29;
            int i16 = i14;
            while (true) {
                float[] fArr2 = kVar2.f17915b;
                if (i16 < fArr2.length) {
                    if (c12 != 'A') {
                        if (c12 != 'C') {
                            if (c12 != 'H') {
                                if (c12 != 'Q') {
                                    if (c12 != 'V') {
                                        if (c12 != 'a') {
                                            if (c12 != 'c') {
                                                if (c12 != 'h') {
                                                    if (c12 != 'q') {
                                                        if (c12 != 'v') {
                                                            if (c12 != 'L') {
                                                                if (c12 != 'M') {
                                                                    if (c12 != 'S') {
                                                                        if (c12 != 'T') {
                                                                            if (c12 != 'l') {
                                                                                if (c12 != 'm') {
                                                                                    if (c12 != 's') {
                                                                                        if (c12 == 't') {
                                                                                            if (c11 != 'q' && c11 != 't' && c11 != 'Q' && c11 != 'T') {
                                                                                                f27 = 0.0f;
                                                                                                f26 = 0.0f;
                                                                                            } else {
                                                                                                f26 = f36 - f30;
                                                                                                f27 = f37 - f31;
                                                                                            }
                                                                                            int i17 = i16 + 0;
                                                                                            int i18 = i16 + 1;
                                                                                            path.rQuadTo(f26, f27, fArr2[i17], fArr2[i18]);
                                                                                            float f38 = f26 + f36;
                                                                                            float f39 = f27 + f37;
                                                                                            f36 += fArr2[i17];
                                                                                            f37 += fArr2[i18];
                                                                                            f31 = f39;
                                                                                            f30 = f38;
                                                                                        }
                                                                                        i11 = i16;
                                                                                        c10 = c12;
                                                                                        i13 = length;
                                                                                    } else {
                                                                                        if (c11 != 'c' && c11 != 's' && c11 != 'C' && c11 != 'S') {
                                                                                            f24 = 0.0f;
                                                                                            f25 = 0.0f;
                                                                                        } else {
                                                                                            f24 = f36 - f30;
                                                                                            f25 = f37 - f31;
                                                                                        }
                                                                                        int i19 = i16 + 0;
                                                                                        float f40 = fArr2[i19];
                                                                                        int i20 = i16 + 1;
                                                                                        float f41 = fArr2[i20];
                                                                                        int i21 = i16 + 2;
                                                                                        float f42 = fArr2[i21];
                                                                                        int i22 = i16 + 3;
                                                                                        float f43 = fArr2[i22];
                                                                                        float f44 = f24;
                                                                                        i11 = i16;
                                                                                        i13 = length;
                                                                                        f10 = f37;
                                                                                        c10 = c12;
                                                                                        path.rCubicTo(f44, f25, f40, f41, f42, f43);
                                                                                        f11 = fArr2[i19] + f36;
                                                                                        f12 = fArr2[i20] + f10;
                                                                                        f13 = f36 + fArr2[i21];
                                                                                        f14 = fArr2[i22];
                                                                                    }
                                                                                } else {
                                                                                    i11 = i16;
                                                                                    c10 = c12;
                                                                                    i13 = length;
                                                                                    float f45 = fArr2[i11 + 0];
                                                                                    f36 += f45;
                                                                                    float f46 = fArr2[i11 + 1];
                                                                                    f37 += f46;
                                                                                    if (i11 > 0) {
                                                                                        path.rLineTo(f45, f46);
                                                                                    } else {
                                                                                        path.rMoveTo(f45, f46);
                                                                                        f35 = f37;
                                                                                        f34 = f36;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i11 = i16;
                                                                                c10 = c12;
                                                                                i13 = length;
                                                                                f17 = f37;
                                                                                int i23 = i11 + 0;
                                                                                float f47 = fArr2[i23];
                                                                                int i24 = i11 + 1;
                                                                                path.rLineTo(f47, fArr2[i24]);
                                                                                f36 += fArr2[i23];
                                                                                f18 = fArr2[i24];
                                                                            }
                                                                        } else {
                                                                            i11 = i16;
                                                                            c10 = c12;
                                                                            i13 = length;
                                                                            float f48 = f37;
                                                                            if (c11 != 'q' && c11 != 't' && c11 != 'Q' && c11 != 'T') {
                                                                                f23 = f48;
                                                                            } else {
                                                                                f36 = (f36 * 2.0f) - f30;
                                                                                f23 = (f48 * 2.0f) - f31;
                                                                            }
                                                                            int i25 = i11 + 0;
                                                                            float f49 = fArr2[i25];
                                                                            int i26 = i11 + 1;
                                                                            path.quadTo(f36, f23, f49, fArr2[i26]);
                                                                            f31 = f23;
                                                                            kVar = kVar2;
                                                                            i12 = i15;
                                                                            f30 = f36;
                                                                            f36 = fArr2[i25];
                                                                            f37 = fArr2[i26];
                                                                        }
                                                                    } else {
                                                                        i11 = i16;
                                                                        c10 = c12;
                                                                        i13 = length;
                                                                        float f50 = f37;
                                                                        if (c11 != 'c' && c11 != 's' && c11 != 'C' && c11 != 'S') {
                                                                            f22 = f36;
                                                                            f21 = f50;
                                                                        } else {
                                                                            f21 = (f50 * 2.0f) - f31;
                                                                            f22 = (f36 * 2.0f) - f30;
                                                                        }
                                                                        int i27 = i11 + 0;
                                                                        int i28 = i11 + 1;
                                                                        int i29 = i11 + 2;
                                                                        int i30 = i11 + 3;
                                                                        path.cubicTo(f22, f21, fArr2[i27], fArr2[i28], fArr2[i29], fArr2[i30]);
                                                                        f11 = fArr2[i27];
                                                                        float f51 = fArr2[i28];
                                                                        f16 = fArr2[i29];
                                                                        f15 = fArr2[i30];
                                                                        f31 = f51;
                                                                        f36 = f16;
                                                                        f37 = f15;
                                                                        f30 = f11;
                                                                    }
                                                                } else {
                                                                    i11 = i16;
                                                                    c10 = c12;
                                                                    i13 = length;
                                                                    f19 = fArr2[i11 + 0];
                                                                    f20 = fArr2[i11 + 1];
                                                                    if (i11 > 0) {
                                                                        path.lineTo(f19, f20);
                                                                    } else {
                                                                        path.moveTo(f19, f20);
                                                                        f34 = f19;
                                                                        f35 = f20;
                                                                    }
                                                                }
                                                                f36 = f34;
                                                                f37 = f35;
                                                            } else {
                                                                i11 = i16;
                                                                c10 = c12;
                                                                i13 = length;
                                                                int i31 = i11 + 0;
                                                                float f52 = fArr2[i31];
                                                                int i32 = i11 + 1;
                                                                path.lineTo(f52, fArr2[i32]);
                                                                f19 = fArr2[i31];
                                                                f20 = fArr2[i32];
                                                            }
                                                            f36 = f19;
                                                            f37 = f20;
                                                        } else {
                                                            i11 = i16;
                                                            c10 = c12;
                                                            i13 = length;
                                                            f17 = f37;
                                                            int i33 = i11 + 0;
                                                            path.rLineTo(0.0f, fArr2[i33]);
                                                            f18 = fArr2[i33];
                                                        }
                                                        f37 = f17 + f18;
                                                    } else {
                                                        i11 = i16;
                                                        c10 = c12;
                                                        i13 = length;
                                                        f10 = f37;
                                                        int i34 = i11 + 0;
                                                        float f53 = fArr2[i34];
                                                        int i35 = i11 + 1;
                                                        int i36 = i11 + 2;
                                                        int i37 = i11 + 3;
                                                        path.rQuadTo(f53, fArr2[i35], fArr2[i36], fArr2[i37]);
                                                        f11 = fArr2[i34] + f36;
                                                        f12 = fArr2[i35] + f10;
                                                        f13 = f36 + fArr2[i36];
                                                        f14 = fArr2[i37];
                                                    }
                                                } else {
                                                    i11 = i16;
                                                    c10 = c12;
                                                    i13 = length;
                                                    int i38 = i11 + 0;
                                                    path.rLineTo(fArr2[i38], 0.0f);
                                                    f36 += fArr2[i38];
                                                }
                                                kVar = kVar2;
                                                i12 = i15;
                                            } else {
                                                i11 = i16;
                                                c10 = c12;
                                                i13 = length;
                                                f10 = f37;
                                                int i39 = i11 + 2;
                                                int i40 = i11 + 3;
                                                int i41 = i11 + 4;
                                                int i42 = i11 + 5;
                                                path.rCubicTo(fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i39], fArr2[i40], fArr2[i41], fArr2[i42]);
                                                f11 = fArr2[i39] + f36;
                                                f12 = fArr2[i40] + f10;
                                                f13 = f36 + fArr2[i41];
                                                f14 = fArr2[i42];
                                            }
                                            f15 = f10 + f14;
                                            f31 = f12;
                                            f16 = f13;
                                            f36 = f16;
                                            f37 = f15;
                                            f30 = f11;
                                            kVar = kVar2;
                                            i12 = i15;
                                        } else {
                                            i11 = i16;
                                            c10 = c12;
                                            i13 = length;
                                            float f54 = f37;
                                            int i43 = i11 + 5;
                                            float f55 = fArr2[i43] + f36;
                                            int i44 = i11 + 6;
                                            float f56 = fArr2[i44] + f54;
                                            float f57 = fArr2[i11 + 0];
                                            float f58 = fArr2[i11 + 1];
                                            float f59 = fArr2[i11 + 2];
                                            if (fArr2[i11 + 3] != 0.0f) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            if (fArr2[i11 + 4] != 0.0f) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            kVar = kVar2;
                                            i12 = i15;
                                            a(path, f36, f54, f55, f56, f57, f58, f59, z12, z13);
                                            f36 += fArr2[i43];
                                            f37 = f54 + fArr2[i44];
                                        }
                                    } else {
                                        i11 = i16;
                                        c10 = c12;
                                        kVar = kVar2;
                                        i12 = i15;
                                        i13 = length;
                                        int i45 = i11 + 0;
                                        path.lineTo(f36, fArr2[i45]);
                                        f37 = fArr2[i45];
                                    }
                                } else {
                                    i11 = i16;
                                    c10 = c12;
                                    kVar = kVar2;
                                    i12 = i15;
                                    i13 = length;
                                    int i46 = i11 + 0;
                                    float f60 = fArr2[i46];
                                    int i47 = i11 + 1;
                                    int i48 = i11 + 2;
                                    int i49 = i11 + 3;
                                    path.quadTo(f60, fArr2[i47], fArr2[i48], fArr2[i49]);
                                    float f61 = fArr2[i46];
                                    float f62 = fArr2[i47];
                                    f36 = fArr2[i48];
                                    f37 = fArr2[i49];
                                    f30 = f61;
                                    f31 = f62;
                                }
                            } else {
                                i11 = i16;
                                c10 = c12;
                                kVar = kVar2;
                                i12 = i15;
                                i13 = length;
                                int i50 = i11 + 0;
                                path.lineTo(fArr2[i50], f37);
                                f36 = fArr2[i50];
                            }
                        } else {
                            i11 = i16;
                            c10 = c12;
                            kVar = kVar2;
                            i12 = i15;
                            i13 = length;
                            int i51 = i11 + 2;
                            int i52 = i11 + 3;
                            int i53 = i11 + 4;
                            int i54 = i11 + 5;
                            path.cubicTo(fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i51], fArr2[i52], fArr2[i53], fArr2[i54]);
                            float f63 = fArr2[i53];
                            f37 = fArr2[i54];
                            f36 = f63;
                            f30 = fArr2[i51];
                            f31 = fArr2[i52];
                        }
                        i16 = i11 + i10;
                        c11 = c10;
                        c12 = c11;
                        i15 = i12;
                        length = i13;
                        kVar2 = kVar;
                    } else {
                        i11 = i16;
                        c10 = c12;
                        kVar = kVar2;
                        i12 = i15;
                        i13 = length;
                        float f64 = f37;
                        int i55 = i11 + 5;
                        float f65 = fArr2[i55];
                        int i56 = i11 + 6;
                        float f66 = fArr2[i56];
                        float f67 = fArr2[i11 + 0];
                        float f68 = fArr2[i11 + 1];
                        float f69 = fArr2[i11 + 2];
                        if (fArr2[i11 + 3] != 0.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (fArr2[i11 + 4] != 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        a(path, f36, f64, f65, f66, f67, f68, f69, z10, z11);
                        f36 = fArr2[i55];
                        f37 = fArr2[i56];
                    }
                    f31 = f37;
                    f30 = f36;
                    i16 = i11 + i10;
                    c11 = c10;
                    c12 = c11;
                    i15 = i12;
                    length = i13;
                    kVar2 = kVar;
                }
            }
            fArr[0] = f36;
            fArr[1] = f37;
            fArr[2] = f30;
            fArr[3] = f31;
            fArr[4] = f34;
            fArr[5] = f35;
            c11 = kVar2.a;
            i15++;
            i14 = 0;
            length = length;
            kVarArr2 = kVarArr;
        }
    }

    public k(k kVar) {
        this.a = kVar.a;
        float[] fArr = kVar.f17915b;
        this.f17915b = com.bumptech.glide.e.r(fArr, fArr.length);
    }
}

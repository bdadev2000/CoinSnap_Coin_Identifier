package L;

import a.AbstractC0325a;
import android.graphics.Path;
import android.util.Log;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public char f1673a;
    public final float[] b;

    public i(char c9, float[] fArr) {
        this.f1673a = c9;
        this.b = fArr;
    }

    public static void a(Path path, float f9, float f10, float f11, float f12, float f13, float f14, float f15, boolean z8, boolean z9) {
        double d2;
        double d9;
        boolean z10;
        double radians = Math.toRadians(f15);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d10 = f9;
        double d11 = f10;
        double d12 = (d11 * sin) + (d10 * cos);
        double d13 = d10;
        double d14 = f13;
        double d15 = d12 / d14;
        double d16 = f14;
        double d17 = ((d11 * cos) + ((-f9) * sin)) / d16;
        double d18 = d11;
        double d19 = f12;
        double d20 = ((d19 * sin) + (f11 * cos)) / d14;
        double d21 = ((d19 * cos) + ((-f11) * sin)) / d16;
        double d22 = d15 - d20;
        double d23 = d17 - d21;
        double d24 = (d15 + d20) / 2.0d;
        double d25 = (d17 + d21) / 2.0d;
        double d26 = (d23 * d23) + (d22 * d22);
        if (d26 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d27 = (1.0d / d26) - 0.25d;
        if (d27 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d26);
            float sqrt = (float) (Math.sqrt(d26) / 1.99999d);
            a(path, f9, f10, f11, f12, f13 * sqrt, f14 * sqrt, f15, z8, z9);
            return;
        }
        double sqrt2 = Math.sqrt(d27);
        double d28 = d22 * sqrt2;
        double d29 = sqrt2 * d23;
        if (z8 == z9) {
            d2 = d24 - d29;
            d9 = d25 + d28;
        } else {
            d2 = d24 + d29;
            d9 = d25 - d28;
        }
        double atan2 = Math.atan2(d17 - d9, d15 - d2);
        double atan22 = Math.atan2(d21 - d9, d20 - d2) - atan2;
        if (atan22 >= 0.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 != z10) {
            if (atan22 > 0.0d) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d30 = d2 * d14;
        double d31 = d9 * d16;
        double d32 = (d30 * cos) - (d31 * sin);
        double d33 = (d31 * cos) + (d30 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d34 = -d14;
        double d35 = d34 * cos2;
        double d36 = d16 * sin2;
        double d37 = (d35 * sin3) - (d36 * cos3);
        double d38 = d34 * sin2;
        double d39 = d16 * cos2;
        double d40 = (cos3 * d39) + (sin3 * d38);
        double d41 = d39;
        double d42 = atan22 / ceil;
        int i9 = 0;
        while (i9 < ceil) {
            double d43 = atan2 + d42;
            double sin4 = Math.sin(d43);
            double cos4 = Math.cos(d43);
            double d44 = d42;
            double d45 = (((d14 * cos2) * cos4) + d32) - (d36 * sin4);
            double d46 = d41;
            double d47 = d32;
            double d48 = (d46 * sin4) + (d14 * sin2 * cos4) + d33;
            double d49 = (d35 * sin4) - (d36 * cos4);
            double d50 = (cos4 * d46) + (sin4 * d38);
            double d51 = d43 - atan2;
            double tan = Math.tan(d51 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d51)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d37 * sqrt3) + d13), (float) ((d40 * sqrt3) + d18), (float) (d45 - (sqrt3 * d49)), (float) (d48 - (sqrt3 * d50)), (float) d45, (float) d48);
            i9++;
            atan2 = d43;
            d38 = d38;
            cos2 = cos2;
            ceil = ceil;
            d40 = d50;
            d14 = d14;
            d37 = d49;
            d13 = d45;
            d18 = d48;
            d32 = d47;
            d42 = d44;
            d41 = d46;
        }
    }

    public static void b(i[] iVarArr, Path path) {
        int i9;
        int i10;
        char c9;
        int i11;
        int i12;
        i iVar;
        boolean z8;
        boolean z9;
        float f9;
        float f10;
        boolean z10;
        boolean z11;
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
        i[] iVarArr2 = iVarArr;
        int i13 = 6;
        float[] fArr = new float[6];
        int length = iVarArr2.length;
        int i14 = 0;
        char c10 = 'm';
        while (i14 < length) {
            i iVar2 = iVarArr2[i14];
            char c11 = iVar2.f1673a;
            float f21 = fArr[0];
            float f22 = fArr[1];
            float f23 = fArr[2];
            float f24 = fArr[3];
            float f25 = fArr[4];
            float f26 = fArr[5];
            switch (c11) {
                case 'A':
                case 'a':
                    i9 = 7;
                    break;
                case 'C':
                case 'c':
                    i9 = i13;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i9 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i9 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f25, f26);
                    f21 = f25;
                    f23 = f21;
                    f22 = f26;
                    f24 = f22;
                    break;
            }
            i9 = 2;
            float f27 = f25;
            float f28 = f26;
            float f29 = f21;
            float f30 = f22;
            int i15 = 0;
            while (true) {
                float[] fArr2 = iVar2.b;
                if (i15 < fArr2.length) {
                    if (c11 != 'A') {
                        if (c11 != 'C') {
                            if (c11 != 'H') {
                                if (c11 != 'Q') {
                                    if (c11 != 'V') {
                                        if (c11 != 'a') {
                                            if (c11 != 'c') {
                                                if (c11 != 'h') {
                                                    if (c11 != 'q') {
                                                        if (c11 != 'v') {
                                                            if (c11 != 'L') {
                                                                if (c11 != 'M') {
                                                                    if (c11 != 'S') {
                                                                        if (c11 != 'T') {
                                                                            if (c11 != 'l') {
                                                                                if (c11 != 'm') {
                                                                                    if (c11 != 's') {
                                                                                        if (c11 != 't') {
                                                                                            i10 = i15;
                                                                                        } else {
                                                                                            if (c10 != 'q' && c10 != 't' && c10 != 'Q' && c10 != 'T') {
                                                                                                f20 = 0.0f;
                                                                                                f19 = 0.0f;
                                                                                            } else {
                                                                                                f19 = f29 - f23;
                                                                                                f20 = f30 - f24;
                                                                                            }
                                                                                            int i16 = i15 + 1;
                                                                                            path.rQuadTo(f19, f20, fArr2[i15], fArr2[i16]);
                                                                                            float f31 = f19 + f29;
                                                                                            float f32 = f20 + f30;
                                                                                            f29 += fArr2[i15];
                                                                                            f30 += fArr2[i16];
                                                                                            f24 = f32;
                                                                                            i10 = i15;
                                                                                            c9 = c11;
                                                                                            i11 = i14;
                                                                                            i12 = length;
                                                                                            f23 = f31;
                                                                                        }
                                                                                    } else {
                                                                                        if (c10 != 'c' && c10 != 's' && c10 != 'C' && c10 != 'S') {
                                                                                            f17 = 0.0f;
                                                                                            f18 = 0.0f;
                                                                                        } else {
                                                                                            float f33 = f29 - f23;
                                                                                            f17 = f30 - f24;
                                                                                            f18 = f33;
                                                                                        }
                                                                                        int i17 = i15 + 1;
                                                                                        int i18 = i15 + 2;
                                                                                        int i19 = i15 + 3;
                                                                                        i10 = i15;
                                                                                        float f34 = f30;
                                                                                        float f35 = f29;
                                                                                        path.rCubicTo(f18, f17, fArr2[i15], fArr2[i17], fArr2[i18], fArr2[i19]);
                                                                                        f11 = f35 + fArr2[i10];
                                                                                        f12 = f34 + fArr2[i17];
                                                                                        f13 = f35 + fArr2[i18];
                                                                                        f14 = fArr2[i19] + f34;
                                                                                    }
                                                                                } else {
                                                                                    i10 = i15;
                                                                                    float f36 = fArr2[i10];
                                                                                    f29 += f36;
                                                                                    float f37 = fArr2[i10 + 1];
                                                                                    f30 += f37;
                                                                                    if (i10 > 0) {
                                                                                        path.rLineTo(f36, f37);
                                                                                    } else {
                                                                                        path.rMoveTo(f36, f37);
                                                                                        f28 = f30;
                                                                                        f27 = f29;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i10 = i15;
                                                                                int i20 = i10 + 1;
                                                                                path.rLineTo(fArr2[i10], fArr2[i20]);
                                                                                f29 += fArr2[i10];
                                                                                f30 += fArr2[i20];
                                                                            }
                                                                        } else {
                                                                            i10 = i15;
                                                                            float f38 = f30;
                                                                            float f39 = f29;
                                                                            if (c10 != 'q' && c10 != 't' && c10 != 'Q' && c10 != 'T') {
                                                                                f11 = f39;
                                                                                f12 = f38;
                                                                            } else {
                                                                                f11 = (f39 * 2.0f) - f23;
                                                                                f12 = (f38 * 2.0f) - f24;
                                                                            }
                                                                            int i21 = i10 + 1;
                                                                            path.quadTo(f11, f12, fArr2[i10], fArr2[i21]);
                                                                            f13 = fArr2[i10];
                                                                            f14 = fArr2[i21];
                                                                        }
                                                                    } else {
                                                                        i10 = i15;
                                                                        float f40 = f30;
                                                                        float f41 = f29;
                                                                        if (c10 != 'c' && c10 != 's' && c10 != 'C' && c10 != 'S') {
                                                                            f16 = f41;
                                                                            f15 = f40;
                                                                        } else {
                                                                            f15 = (f40 * 2.0f) - f24;
                                                                            f16 = (f41 * 2.0f) - f23;
                                                                        }
                                                                        int i22 = i10 + 1;
                                                                        int i23 = i10 + 2;
                                                                        int i24 = i10 + 3;
                                                                        path.cubicTo(f16, f15, fArr2[i10], fArr2[i22], fArr2[i23], fArr2[i24]);
                                                                        float f42 = fArr2[i10];
                                                                        float f43 = fArr2[i22];
                                                                        f29 = fArr2[i23];
                                                                        f30 = fArr2[i24];
                                                                        f24 = f43;
                                                                        f23 = f42;
                                                                    }
                                                                } else {
                                                                    i10 = i15;
                                                                    f29 = fArr2[i10];
                                                                    f30 = fArr2[i10 + 1];
                                                                    if (i10 > 0) {
                                                                        path.lineTo(f29, f30);
                                                                    } else {
                                                                        path.moveTo(f29, f30);
                                                                        f28 = f30;
                                                                        f27 = f29;
                                                                    }
                                                                }
                                                            } else {
                                                                i10 = i15;
                                                                int i25 = i10 + 1;
                                                                path.lineTo(fArr2[i10], fArr2[i25]);
                                                                f29 = fArr2[i10];
                                                                f30 = fArr2[i25];
                                                            }
                                                        } else {
                                                            i10 = i15;
                                                            path.rLineTo(0.0f, fArr2[i10]);
                                                            f30 += fArr2[i10];
                                                        }
                                                    } else {
                                                        i10 = i15;
                                                        float f44 = f30;
                                                        float f45 = f29;
                                                        int i26 = i10 + 1;
                                                        int i27 = i10 + 2;
                                                        int i28 = i10 + 3;
                                                        path.rQuadTo(fArr2[i10], fArr2[i26], fArr2[i27], fArr2[i28]);
                                                        float f46 = f45 + fArr2[i10];
                                                        float f47 = fArr2[i26] + f44;
                                                        float f48 = f45 + fArr2[i27];
                                                        f30 = f44 + fArr2[i28];
                                                        f24 = f47;
                                                        f23 = f46;
                                                        c9 = c11;
                                                        i11 = i14;
                                                        i12 = length;
                                                        f29 = f48;
                                                    }
                                                    iVar = iVar2;
                                                } else {
                                                    i10 = i15;
                                                    path.rLineTo(fArr2[i10], 0.0f);
                                                    f29 += fArr2[i10];
                                                }
                                                c9 = c11;
                                                i11 = i14;
                                                i12 = length;
                                                iVar = iVar2;
                                            } else {
                                                i10 = i15;
                                                float f49 = f30;
                                                float f50 = f29;
                                                int i29 = i10 + 2;
                                                int i30 = i10 + 3;
                                                int i31 = i10 + 4;
                                                int i32 = i10 + 5;
                                                path.rCubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i29], fArr2[i30], fArr2[i31], fArr2[i32]);
                                                f11 = f50 + fArr2[i29];
                                                f12 = f49 + fArr2[i30];
                                                f13 = f50 + fArr2[i31];
                                                f14 = fArr2[i32] + f49;
                                            }
                                            f24 = f12;
                                            f23 = f11;
                                            c9 = c11;
                                            i11 = i14;
                                            i12 = length;
                                            f29 = f13;
                                            f30 = f14;
                                            iVar = iVar2;
                                        } else {
                                            i10 = i15;
                                            float f51 = f30;
                                            float f52 = f29;
                                            int i33 = i10 + 5;
                                            float f53 = fArr2[i33] + f52;
                                            int i34 = i10 + 6;
                                            float f54 = fArr2[i34] + f51;
                                            float f55 = fArr2[i10];
                                            float f56 = fArr2[i10 + 1];
                                            float f57 = fArr2[i10 + 2];
                                            if (fArr2[i10 + 3] != 0.0f) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            if (fArr2[i10 + 4] != 0.0f) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                            c9 = c11;
                                            i12 = length;
                                            iVar = iVar2;
                                            i11 = i14;
                                            a(path, f52, f51, f53, f54, f55, f56, f57, z10, z11);
                                            f29 = f52 + fArr2[i33];
                                            f30 = f51 + fArr2[i34];
                                        }
                                    } else {
                                        i10 = i15;
                                        c9 = c11;
                                        i11 = i14;
                                        i12 = length;
                                        iVar = iVar2;
                                        path.lineTo(f29, fArr2[i10]);
                                        f30 = fArr2[i10];
                                    }
                                } else {
                                    i10 = i15;
                                    c9 = c11;
                                    i11 = i14;
                                    i12 = length;
                                    iVar = iVar2;
                                    float f58 = fArr2[i10];
                                    int i35 = i10 + 1;
                                    float f59 = fArr2[i35];
                                    int i36 = i10 + 2;
                                    int i37 = i10 + 3;
                                    path.quadTo(f58, f59, fArr2[i36], fArr2[i37]);
                                    f9 = fArr2[i10];
                                    f10 = fArr2[i35];
                                    f29 = fArr2[i36];
                                    f30 = fArr2[i37];
                                }
                            } else {
                                i10 = i15;
                                c9 = c11;
                                i11 = i14;
                                i12 = length;
                                iVar = iVar2;
                                path.lineTo(fArr2[i10], f30);
                                f29 = fArr2[i10];
                            }
                            i15 = i10 + i9;
                            iVar2 = iVar;
                            length = i12;
                            c10 = c9;
                            c11 = c10;
                            i14 = i11;
                        } else {
                            i10 = i15;
                            c9 = c11;
                            i11 = i14;
                            i12 = length;
                            iVar = iVar2;
                            int i38 = i10 + 2;
                            int i39 = i10 + 3;
                            int i40 = i10 + 4;
                            int i41 = i10 + 5;
                            path.cubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i38], fArr2[i39], fArr2[i40], fArr2[i41]);
                            f29 = fArr2[i40];
                            f30 = fArr2[i41];
                            f9 = fArr2[i38];
                            f10 = fArr2[i39];
                        }
                        f23 = f9;
                        f24 = f10;
                        i15 = i10 + i9;
                        iVar2 = iVar;
                        length = i12;
                        c10 = c9;
                        c11 = c10;
                        i14 = i11;
                    } else {
                        i10 = i15;
                        float f60 = f30;
                        float f61 = f29;
                        c9 = c11;
                        i11 = i14;
                        i12 = length;
                        iVar = iVar2;
                        int i42 = i10 + 5;
                        float f62 = fArr2[i42];
                        int i43 = i10 + 6;
                        float f63 = fArr2[i43];
                        float f64 = fArr2[i10];
                        float f65 = fArr2[i10 + 1];
                        float f66 = fArr2[i10 + 2];
                        if (fArr2[i10 + 3] != 0.0f) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (fArr2[i10 + 4] != 0.0f) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        a(path, f61, f60, f62, f63, f64, f65, f66, z8, z9);
                        f29 = fArr2[i42];
                        f30 = fArr2[i43];
                    }
                    f24 = f30;
                    f23 = f29;
                    i15 = i10 + i9;
                    iVar2 = iVar;
                    length = i12;
                    c10 = c9;
                    c11 = c10;
                    i14 = i11;
                }
            }
            fArr[0] = f29;
            fArr[1] = f30;
            fArr[2] = f23;
            fArr[3] = f24;
            fArr[4] = f27;
            fArr[5] = f28;
            c10 = iVar2.f1673a;
            i14++;
            iVarArr2 = iVarArr;
            length = length;
            i13 = 6;
        }
    }

    public i(i iVar) {
        this.f1673a = iVar.f1673a;
        float[] fArr = iVar.b;
        this.b = AbstractC0325a.b(fArr, fArr.length);
    }
}

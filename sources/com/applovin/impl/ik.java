package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class ik {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f8316a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i9, boolean z8) {
        if ((i9 >>> 8) == 3368816) {
            return true;
        }
        if (i9 == 1751476579 && z8) {
            return true;
        }
        for (int i10 : f8316a) {
            if (i10 == i9) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(j8 j8Var) {
        return a(j8Var, true, false);
    }

    private static boolean a(j8 j8Var, boolean z8, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i9;
        boolean z13;
        boolean z14;
        long a6 = j8Var.a();
        long j7 = -1;
        int i10 = (a6 > (-1L) ? 1 : (a6 == (-1L) ? 0 : -1));
        long j9 = 4096;
        if (i10 != 0 && a6 <= 4096) {
            j9 = a6;
        }
        int i11 = (int) j9;
        yg ygVar = new yg(64);
        boolean z15 = false;
        int i12 = 0;
        boolean z16 = false;
        while (i12 < i11) {
            ygVar.d(8);
            if (!j8Var.b(ygVar.c(), z15 ? 1 : 0, 8, true)) {
                break;
            }
            long y4 = ygVar.y();
            int j10 = ygVar.j();
            if (y4 == 1) {
                j8Var.c(ygVar.c(), 8, 8);
                ygVar.e(16);
                i9 = 16;
                y4 = ygVar.s();
            } else {
                if (y4 == 0) {
                    long a9 = j8Var.a();
                    if (a9 != j7) {
                        y4 = (a9 - j8Var.d()) + 8;
                    }
                }
                i9 = 8;
            }
            long j11 = i9;
            if (y4 < j11) {
                return z15;
            }
            i12 += i9;
            if (j10 == 1836019574) {
                i11 += (int) y4;
                if (i10 != 0 && i11 > a6) {
                    i11 = (int) a6;
                }
            } else {
                if (j10 == 1836019558 || j10 == 1836475768) {
                    z10 = z15 ? 1 : 0;
                    z11 = true;
                    z12 = true;
                    break;
                }
                int i13 = i10;
                if ((i12 + y4) - j11 >= i11) {
                    z10 = false;
                    z11 = true;
                    break;
                }
                int i14 = (int) (y4 - j11);
                i12 += i14;
                if (j10 != 1718909296) {
                    z13 = false;
                    z16 = z16;
                    if (i14 != 0) {
                        j8Var.c(i14);
                        z16 = z16;
                    }
                } else {
                    if (i14 < 8) {
                        return false;
                    }
                    ygVar.d(i14);
                    j8Var.c(ygVar.c(), 0, i14);
                    int i15 = i14 / 4;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= i15) {
                            z14 = z16;
                            break;
                        }
                        if (i16 == 1) {
                            ygVar.g(4);
                        } else if (a(ygVar.j(), z9)) {
                            z14 = true;
                            break;
                        }
                        i16++;
                    }
                    z13 = false;
                    z16 = z14;
                    if (!z14) {
                        return false;
                    }
                }
                z15 = z13;
                i10 = i13;
            }
            j7 = -1;
            z16 = z16;
        }
        z10 = z15 ? 1 : 0;
        z11 = true;
        z12 = z10;
        return (z16 && z8 == z12) ? z11 : z10;
    }

    public static boolean a(j8 j8Var, boolean z8) {
        return a(j8Var, false, z8);
    }
}

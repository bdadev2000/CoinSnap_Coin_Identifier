package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class ik {
    private static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : a) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(j8 j8Var) {
        return a(j8Var, true, false);
    }

    private static boolean a(j8 j8Var, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        boolean z15;
        boolean z16;
        long a10 = j8Var.a();
        long j3 = -1;
        int i11 = (a10 > (-1L) ? 1 : (a10 == (-1L) ? 0 : -1));
        long j10 = 4096;
        if (i11 != 0 && a10 <= 4096) {
            j10 = a10;
        }
        int i12 = (int) j10;
        yg ygVar = new yg(64);
        boolean z17 = false;
        int i13 = 0;
        boolean z18 = false;
        while (i13 < i12) {
            ygVar.d(8);
            if (!j8Var.b(ygVar.c(), z17 ? 1 : 0, 8, true)) {
                break;
            }
            long y4 = ygVar.y();
            int j11 = ygVar.j();
            if (y4 == 1) {
                j8Var.c(ygVar.c(), 8, 8);
                ygVar.e(16);
                i10 = 16;
                y4 = ygVar.s();
            } else {
                if (y4 == 0) {
                    long a11 = j8Var.a();
                    if (a11 != j3) {
                        y4 = (a11 - j8Var.d()) + 8;
                    }
                }
                i10 = 8;
            }
            long j12 = i10;
            if (y4 < j12) {
                return z17;
            }
            i13 += i10;
            if (j11 == 1836019574) {
                i12 += (int) y4;
                if (i11 != 0 && i12 > a10) {
                    i12 = (int) a10;
                }
            } else {
                if (j11 == 1836019558 || j11 == 1836475768) {
                    z12 = z17 ? 1 : 0;
                    z13 = true;
                    z14 = true;
                    break;
                }
                int i14 = i11;
                if ((i13 + y4) - j12 >= i12) {
                    z12 = false;
                    z13 = true;
                    break;
                }
                int i15 = (int) (y4 - j12);
                i13 += i15;
                if (j11 != 1718909296) {
                    z15 = false;
                    z18 = z18;
                    if (i15 != 0) {
                        j8Var.c(i15);
                        z18 = z18;
                    }
                } else {
                    if (i15 < 8) {
                        return false;
                    }
                    ygVar.d(i15);
                    j8Var.c(ygVar.c(), 0, i15);
                    int i16 = i15 / 4;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= i16) {
                            z16 = z18;
                            break;
                        }
                        if (i17 == 1) {
                            ygVar.g(4);
                        } else if (a(ygVar.j(), z11)) {
                            z16 = true;
                            break;
                        }
                        i17++;
                    }
                    z15 = false;
                    z18 = z16;
                    if (!z16) {
                        return false;
                    }
                }
                z17 = z15;
                i11 = i14;
            }
            j3 = -1;
            z18 = z18;
        }
        z12 = z17 ? 1 : 0;
        z13 = true;
        z14 = z12;
        return (z18 && z10 == z14) ? z13 : z12;
    }

    public static boolean a(j8 j8Var, boolean z10) {
        return a(j8Var, false, z10);
    }
}

package com.applovin.impl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class lk {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f25097a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    private static boolean a(int i2, boolean z2) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579 && z2) {
            return true;
        }
        for (int i3 : f25097a) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(l8 l8Var) {
        return a(l8Var, true, false);
    }

    private static boolean a(l8 l8Var, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        boolean z7;
        boolean z8;
        long a2 = l8Var.a();
        long j2 = -1;
        int i3 = (a2 > (-1L) ? 1 : (a2 == (-1L) ? 0 : -1));
        long j3 = 4096;
        if (i3 != 0 && a2 <= 4096) {
            j3 = a2;
        }
        int i4 = (int) j3;
        bh bhVar = new bh(64);
        boolean z9 = false;
        int i5 = 0;
        boolean z10 = false;
        while (i5 < i4) {
            bhVar.d(8);
            if (!l8Var.b(bhVar.c(), z9 ? 1 : 0, 8, true)) {
                break;
            }
            long y2 = bhVar.y();
            int j4 = bhVar.j();
            if (y2 == 1) {
                l8Var.c(bhVar.c(), 8, 8);
                bhVar.e(16);
                i2 = 16;
                y2 = bhVar.s();
            } else {
                if (y2 == 0) {
                    long a3 = l8Var.a();
                    if (a3 != j2) {
                        y2 = (a3 - l8Var.d()) + 8;
                    }
                }
                i2 = 8;
            }
            long j5 = i2;
            if (y2 < j5) {
                return z9;
            }
            i5 += i2;
            if (j4 == 1836019574) {
                i4 += (int) y2;
                if (i3 != 0 && i4 > a2) {
                    i4 = (int) a2;
                }
            } else {
                if (j4 == 1836019558 || j4 == 1836475768) {
                    z4 = z9 ? 1 : 0;
                    z5 = true;
                    z6 = true;
                    break;
                }
                int i6 = i3;
                if ((i5 + y2) - j5 >= i4) {
                    z4 = false;
                    z5 = true;
                    break;
                }
                int i7 = (int) (y2 - j5);
                i5 += i7;
                if (j4 != 1718909296) {
                    z7 = false;
                    z10 = z10;
                    if (i7 != 0) {
                        l8Var.c(i7);
                        z10 = z10;
                    }
                } else {
                    if (i7 < 8) {
                        return false;
                    }
                    bhVar.d(i7);
                    l8Var.c(bhVar.c(), 0, i7);
                    int i8 = i7 / 4;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= i8) {
                            z8 = z10;
                            break;
                        }
                        if (i9 == 1) {
                            bhVar.g(4);
                        } else if (a(bhVar.j(), z3)) {
                            z8 = true;
                            break;
                        }
                        i9++;
                    }
                    z7 = false;
                    z10 = z8;
                    if (!z8) {
                        return false;
                    }
                }
                z9 = z7;
                i3 = i6;
            }
            j2 = -1;
            z10 = z10;
        }
        z4 = z9 ? 1 : 0;
        z5 = true;
        z6 = z4;
        return (z10 && z2 == z6) ? z5 : z4;
    }

    public static boolean a(l8 l8Var, boolean z2) {
        return a(l8Var, false, z2);
    }
}

package com.google.android.material.color.utilities;

import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28679a;

    public /* synthetic */ b(int i2) {
        this.f28679a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f28679a) {
            case 0:
                return MaterialDynamicColors.d(dynamicScheme);
            case 1:
                return MaterialDynamicColors.o(dynamicScheme);
            case 2:
                return MaterialDynamicColors.f2(dynamicScheme);
            case 3:
                return MaterialDynamicColors.O0(dynamicScheme);
            case 4:
                return MaterialDynamicColors.K1(dynamicScheme);
            case 5:
                return MaterialDynamicColors.J(dynamicScheme);
            case 6:
                return MaterialDynamicColors.R0(dynamicScheme);
            case 7:
                return MaterialDynamicColors.y1(dynamicScheme);
            case 8:
                return MaterialDynamicColors.p(dynamicScheme);
            case 9:
                return MaterialDynamicColors.d0(dynamicScheme);
            case 10:
                return MaterialDynamicColors.k0(dynamicScheme);
            case 11:
                return MaterialDynamicColors.T0(dynamicScheme);
            case 12:
                return MaterialDynamicColors.H(dynamicScheme);
            case 13:
                return MaterialDynamicColors.L0(dynamicScheme);
            case 14:
                return MaterialDynamicColors.z1(dynamicScheme);
            case 15:
                return MaterialDynamicColors.s0(dynamicScheme);
            case 16:
                return MaterialDynamicColors.T1(dynamicScheme);
            case 17:
                return MaterialDynamicColors.g0(dynamicScheme);
            case 18:
                return MaterialDynamicColors.E(dynamicScheme);
            case 19:
                return MaterialDynamicColors.s1(dynamicScheme);
            case 20:
                return MaterialDynamicColors.A(dynamicScheme);
            case 21:
                return MaterialDynamicColors.I0(dynamicScheme);
            case 22:
                return MaterialDynamicColors.x1(dynamicScheme);
            case 23:
                return MaterialDynamicColors.K0(dynamicScheme);
            case 24:
                return MaterialDynamicColors.e2(dynamicScheme);
            case 25:
                return MaterialDynamicColors.R1(dynamicScheme);
            case 26:
                return MaterialDynamicColors.A1(dynamicScheme);
            case 27:
                return MaterialDynamicColors.u(dynamicScheme);
            case 28:
                return MaterialDynamicColors.n(dynamicScheme);
            default:
                return MaterialDynamicColors.L(dynamicScheme);
        }
    }
}

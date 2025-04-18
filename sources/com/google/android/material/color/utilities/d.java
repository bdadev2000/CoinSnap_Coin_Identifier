package com.google.android.material.color.utilities;

import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28682a;

    public /* synthetic */ d(int i2) {
        this.f28682a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f28682a) {
            case 0:
                return MaterialDynamicColors.N(dynamicScheme);
            case 1:
                return MaterialDynamicColors.b0(dynamicScheme);
            case 2:
                return MaterialDynamicColors.P(dynamicScheme);
            case 3:
                return MaterialDynamicColors.a1(dynamicScheme);
            case 4:
                return MaterialDynamicColors.p1(dynamicScheme);
            case 5:
                return MaterialDynamicColors.b1(dynamicScheme);
            case 6:
                return MaterialDynamicColors.e1(dynamicScheme);
            case 7:
                return MaterialDynamicColors.t(dynamicScheme);
            case 8:
                return MaterialDynamicColors.a2(dynamicScheme);
            case 9:
                return MaterialDynamicColors.e(dynamicScheme);
            case 10:
                return MaterialDynamicColors.N1(dynamicScheme);
            case 11:
                return MaterialDynamicColors.u1(dynamicScheme);
            case 12:
                return MaterialDynamicColors.D(dynamicScheme);
            case 13:
                return MaterialDynamicColors.q1(dynamicScheme);
            case 14:
                return MaterialDynamicColors.F(dynamicScheme);
            case 15:
                return MaterialDynamicColors.G(dynamicScheme);
            case 16:
                return MaterialDynamicColors.n1(dynamicScheme);
            case 17:
                return MaterialDynamicColors.r(dynamicScheme);
            case 18:
                return MaterialDynamicColors.G1(dynamicScheme);
            case 19:
                return MaterialDynamicColors.U0(dynamicScheme);
            case 20:
                return MaterialDynamicColors.D1(dynamicScheme);
            case 21:
                return MaterialDynamicColors.t1(dynamicScheme);
            case 22:
                return MaterialDynamicColors.C1(dynamicScheme);
            case 23:
                return MaterialDynamicColors.C0(dynamicScheme);
            case 24:
                return MaterialDynamicColors.j0(dynamicScheme);
            case 25:
                return MaterialDynamicColors.Z0(dynamicScheme);
            case 26:
                return MaterialDynamicColors.Y1(dynamicScheme);
            case 27:
                return MaterialDynamicColors.B(dynamicScheme);
            case 28:
                return MaterialDynamicColors.a(dynamicScheme);
            default:
                return MaterialDynamicColors.Q0(dynamicScheme);
        }
    }
}

package com.google.android.material.color.utilities;

import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f28681b;

    public /* synthetic */ c(MaterialDynamicColors materialDynamicColors, int i2) {
        this.f28680a = i2;
        this.f28681b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        ToneDeltaPair lambda$primaryContainer$60;
        ToneDeltaPair lambda$secondary$69;
        ToneDeltaPair lambda$secondaryFixed$119;
        DynamicColor lambda$onSecondaryFixed$125;
        DynamicColor lambda$onSecondaryFixed$126;
        DynamicColor lambda$onErrorContainer$102;
        ToneDeltaPair lambda$primaryFixed$105;
        ToneDeltaPair lambda$secondaryFixedDim$122;
        ToneDeltaPair lambda$error$93;
        DynamicColor lambda$inversePrimary$66;
        ToneDeltaPair lambda$primaryFixedDim$108;
        ToneDeltaPair lambda$primary$54;
        DynamicColor lambda$onPrimary$57;
        DynamicColor lambda$onPrimaryFixed$111;
        DynamicColor lambda$onPrimaryFixed$112;
        DynamicColor lambda$onError$96;
        DynamicColor lambda$onSecondary$72;
        DynamicColor lambda$onTertiaryFixed$139;
        DynamicColor lambda$onTertiaryFixed$140;
        int i2 = this.f28680a;
        MaterialDynamicColors materialDynamicColors = this.f28681b;
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (i2) {
            case 0:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 1:
                lambda$primaryContainer$60 = materialDynamicColors.lambda$primaryContainer$60(dynamicScheme);
                return lambda$primaryContainer$60;
            case 2:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 3:
                lambda$secondary$69 = materialDynamicColors.lambda$secondary$69(dynamicScheme);
                return lambda$secondary$69;
            case 4:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 5:
                lambda$secondaryFixed$119 = materialDynamicColors.lambda$secondaryFixed$119(dynamicScheme);
                return lambda$secondaryFixed$119;
            case 6:
                lambda$onSecondaryFixed$125 = materialDynamicColors.lambda$onSecondaryFixed$125(dynamicScheme);
                return lambda$onSecondaryFixed$125;
            case 7:
                lambda$onSecondaryFixed$126 = materialDynamicColors.lambda$onSecondaryFixed$126(dynamicScheme);
                return lambda$onSecondaryFixed$126;
            case 8:
                lambda$onErrorContainer$102 = materialDynamicColors.lambda$onErrorContainer$102(dynamicScheme);
                return lambda$onErrorContainer$102;
            case 9:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 10:
                lambda$primaryFixed$105 = materialDynamicColors.lambda$primaryFixed$105(dynamicScheme);
                return lambda$primaryFixed$105;
            case 11:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 12:
                lambda$secondaryFixedDim$122 = materialDynamicColors.lambda$secondaryFixedDim$122(dynamicScheme);
                return lambda$secondaryFixedDim$122;
            case 13:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 14:
                lambda$error$93 = materialDynamicColors.lambda$error$93(dynamicScheme);
                return lambda$error$93;
            case 15:
                lambda$inversePrimary$66 = materialDynamicColors.lambda$inversePrimary$66(dynamicScheme);
                return lambda$inversePrimary$66;
            case 16:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 17:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 18:
                lambda$primaryFixedDim$108 = materialDynamicColors.lambda$primaryFixedDim$108(dynamicScheme);
                return lambda$primaryFixedDim$108;
            case 19:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 20:
                lambda$primary$54 = materialDynamicColors.lambda$primary$54(dynamicScheme);
                return lambda$primary$54;
            case 21:
                lambda$onPrimary$57 = materialDynamicColors.lambda$onPrimary$57(dynamicScheme);
                return lambda$onPrimary$57;
            case 22:
                lambda$onPrimaryFixed$111 = materialDynamicColors.lambda$onPrimaryFixed$111(dynamicScheme);
                return lambda$onPrimaryFixed$111;
            case 23:
                lambda$onPrimaryFixed$112 = materialDynamicColors.lambda$onPrimaryFixed$112(dynamicScheme);
                return lambda$onPrimaryFixed$112;
            case 24:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 25:
                lambda$onError$96 = materialDynamicColors.lambda$onError$96(dynamicScheme);
                return lambda$onError$96;
            case 26:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 27:
                lambda$onSecondary$72 = materialDynamicColors.lambda$onSecondary$72(dynamicScheme);
                return lambda$onSecondary$72;
            case 28:
                lambda$onTertiaryFixed$139 = materialDynamicColors.lambda$onTertiaryFixed$139(dynamicScheme);
                return lambda$onTertiaryFixed$139;
            default:
                lambda$onTertiaryFixed$140 = materialDynamicColors.lambda$onTertiaryFixed$140(dynamicScheme);
                return lambda$onTertiaryFixed$140;
        }
    }
}

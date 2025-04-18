package com.google.android.material.color.utilities;

import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialDynamicColors f28685b;

    public /* synthetic */ f(MaterialDynamicColors materialDynamicColors, int i2) {
        this.f28684a = i2;
        this.f28685b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        DynamicColor lambda$onTertiary$84;
        ToneDeltaPair lambda$tertiaryFixedDim$136;
        ToneDeltaPair lambda$tertiaryContainer$87;
        DynamicColor lambda$onPrimaryFixedVariant$115;
        DynamicColor lambda$onPrimaryFixedVariant$116;
        ToneDeltaPair lambda$tertiaryFixed$133;
        Double lambda$onTertiaryContainer$89;
        DynamicColor lambda$onTertiaryContainer$90;
        ToneDeltaPair lambda$tertiary$81;
        ToneDeltaPair lambda$secondaryContainer$75;
        DynamicColor lambda$inverseOnSurface$41;
        DynamicColor lambda$onSecondaryFixedVariant$129;
        DynamicColor lambda$onSecondaryFixedVariant$130;
        ToneDeltaPair lambda$errorContainer$99;
        DynamicColor lambda$onTertiaryFixedVariant$143;
        DynamicColor lambda$onTertiaryFixedVariant$144;
        Double lambda$onPrimaryContainer$62;
        DynamicColor lambda$onPrimaryContainer$63;
        DynamicColor lambda$onBackground$14;
        Double lambda$onSecondaryContainer$77;
        DynamicColor lambda$onSecondaryContainer$78;
        int i2 = this.f28684a;
        MaterialDynamicColors materialDynamicColors = this.f28685b;
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (i2) {
            case 0:
                lambda$onTertiary$84 = materialDynamicColors.lambda$onTertiary$84(dynamicScheme);
                return lambda$onTertiary$84;
            case 1:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 2:
                lambda$tertiaryFixedDim$136 = materialDynamicColors.lambda$tertiaryFixedDim$136(dynamicScheme);
                return lambda$tertiaryFixedDim$136;
            case 3:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 4:
                lambda$tertiaryContainer$87 = materialDynamicColors.lambda$tertiaryContainer$87(dynamicScheme);
                return lambda$tertiaryContainer$87;
            case 5:
                lambda$onPrimaryFixedVariant$115 = materialDynamicColors.lambda$onPrimaryFixedVariant$115(dynamicScheme);
                return lambda$onPrimaryFixedVariant$115;
            case 6:
                lambda$onPrimaryFixedVariant$116 = materialDynamicColors.lambda$onPrimaryFixedVariant$116(dynamicScheme);
                return lambda$onPrimaryFixedVariant$116;
            case 7:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 8:
                lambda$tertiaryFixed$133 = materialDynamicColors.lambda$tertiaryFixed$133(dynamicScheme);
                return lambda$tertiaryFixed$133;
            case 9:
                lambda$onTertiaryContainer$89 = materialDynamicColors.lambda$onTertiaryContainer$89(dynamicScheme);
                return lambda$onTertiaryContainer$89;
            case 10:
                lambda$onTertiaryContainer$90 = materialDynamicColors.lambda$onTertiaryContainer$90(dynamicScheme);
                return lambda$onTertiaryContainer$90;
            case 11:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 12:
                lambda$tertiary$81 = materialDynamicColors.lambda$tertiary$81(dynamicScheme);
                return lambda$tertiary$81;
            case 13:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 14:
                lambda$secondaryContainer$75 = materialDynamicColors.lambda$secondaryContainer$75(dynamicScheme);
                return lambda$secondaryContainer$75;
            case 15:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 16:
                lambda$inverseOnSurface$41 = materialDynamicColors.lambda$inverseOnSurface$41(dynamicScheme);
                return lambda$inverseOnSurface$41;
            case 17:
                lambda$onSecondaryFixedVariant$129 = materialDynamicColors.lambda$onSecondaryFixedVariant$129(dynamicScheme);
                return lambda$onSecondaryFixedVariant$129;
            case 18:
                lambda$onSecondaryFixedVariant$130 = materialDynamicColors.lambda$onSecondaryFixedVariant$130(dynamicScheme);
                return lambda$onSecondaryFixedVariant$130;
            case 19:
                return materialDynamicColors.highestSurface(dynamicScheme);
            case 20:
                lambda$errorContainer$99 = materialDynamicColors.lambda$errorContainer$99(dynamicScheme);
                return lambda$errorContainer$99;
            case 21:
                lambda$onTertiaryFixedVariant$143 = materialDynamicColors.lambda$onTertiaryFixedVariant$143(dynamicScheme);
                return lambda$onTertiaryFixedVariant$143;
            case 22:
                lambda$onTertiaryFixedVariant$144 = materialDynamicColors.lambda$onTertiaryFixedVariant$144(dynamicScheme);
                return lambda$onTertiaryFixedVariant$144;
            case 23:
                lambda$onPrimaryContainer$62 = materialDynamicColors.lambda$onPrimaryContainer$62(dynamicScheme);
                return lambda$onPrimaryContainer$62;
            case 24:
                lambda$onPrimaryContainer$63 = materialDynamicColors.lambda$onPrimaryContainer$63(dynamicScheme);
                return lambda$onPrimaryContainer$63;
            case 25:
                lambda$onBackground$14 = materialDynamicColors.lambda$onBackground$14(dynamicScheme);
                return lambda$onBackground$14;
            case 26:
                lambda$onSecondaryContainer$77 = materialDynamicColors.lambda$onSecondaryContainer$77(dynamicScheme);
                return lambda$onSecondaryContainer$77;
            default:
                lambda$onSecondaryContainer$78 = materialDynamicColors.lambda$onSecondaryContainer$78(dynamicScheme);
                return lambda$onSecondaryContainer$78;
        }
    }
}

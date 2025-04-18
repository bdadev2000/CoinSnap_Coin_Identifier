package com.google.android.material.color.utilities;

import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28686a;

    public /* synthetic */ g(int i2) {
        this.f28686a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        TonalPalette tonalPalette;
        Double lambda$surfaceContainerHigh$28;
        TonalPalette tonalPalette2;
        Double lambda$background$11;
        TonalPalette tonalPalette3;
        Double lambda$surfaceContainerHighest$30;
        TonalPalette tonalPalette4;
        Double lambda$surface$16;
        TonalPalette tonalPalette5;
        Double lambda$surfaceDim$18;
        TonalPalette tonalPalette6;
        Double lambda$neutralPaletteKeyColor$7;
        TonalPalette tonalPalette7;
        Double lambda$outline$43;
        TonalPalette tonalPalette8;
        Double lambda$inverseOnSurface$40;
        TonalPalette tonalPalette9;
        Double lambda$textPrimaryInverseDisableOnly$157;
        TonalPalette tonalPalette10;
        Double lambda$onSecondaryFixedVariant$128;
        TonalPalette tonalPalette11;
        Double lambda$errorContainer$98;
        TonalPalette tonalPalette12;
        Double lambda$onTertiaryFixedVariant$142;
        TonalPalette tonalPalette13;
        TonalPalette tonalPalette14;
        Double lambda$onBackground$13;
        TonalPalette tonalPalette15;
        Double lambda$tertiaryPaletteKeyColor$5;
        TonalPalette tonalPalette16;
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f28686a) {
            case 0:
                tonalPalette = dynamicScheme.neutralPalette;
                return tonalPalette;
            case 1:
                lambda$surfaceContainerHigh$28 = MaterialDynamicColors.lambda$surfaceContainerHigh$28(dynamicScheme);
                return lambda$surfaceContainerHigh$28;
            case 2:
                tonalPalette2 = dynamicScheme.neutralPalette;
                return tonalPalette2;
            case 3:
                lambda$background$11 = MaterialDynamicColors.lambda$background$11(dynamicScheme);
                return lambda$background$11;
            case 4:
                tonalPalette3 = dynamicScheme.neutralPalette;
                return tonalPalette3;
            case 5:
                lambda$surfaceContainerHighest$30 = MaterialDynamicColors.lambda$surfaceContainerHighest$30(dynamicScheme);
                return lambda$surfaceContainerHighest$30;
            case 6:
                tonalPalette4 = dynamicScheme.neutralPalette;
                return tonalPalette4;
            case 7:
                lambda$surface$16 = MaterialDynamicColors.lambda$surface$16(dynamicScheme);
                return lambda$surface$16;
            case 8:
                tonalPalette5 = dynamicScheme.neutralPalette;
                return tonalPalette5;
            case 9:
                lambda$surfaceDim$18 = MaterialDynamicColors.lambda$surfaceDim$18(dynamicScheme);
                return lambda$surfaceDim$18;
            case 10:
                tonalPalette6 = dynamicScheme.neutralPalette;
                return tonalPalette6;
            case 11:
                lambda$neutralPaletteKeyColor$7 = MaterialDynamicColors.lambda$neutralPaletteKeyColor$7(dynamicScheme);
                return lambda$neutralPaletteKeyColor$7;
            case 12:
                tonalPalette7 = dynamicScheme.neutralVariantPalette;
                return tonalPalette7;
            case 13:
                lambda$outline$43 = MaterialDynamicColors.lambda$outline$43(dynamicScheme);
                return lambda$outline$43;
            case 14:
                tonalPalette8 = dynamicScheme.neutralPalette;
                return tonalPalette8;
            case 15:
                lambda$inverseOnSurface$40 = MaterialDynamicColors.lambda$inverseOnSurface$40(dynamicScheme);
                return lambda$inverseOnSurface$40;
            case 16:
                tonalPalette9 = dynamicScheme.neutralPalette;
                return tonalPalette9;
            case 17:
                lambda$textPrimaryInverseDisableOnly$157 = MaterialDynamicColors.lambda$textPrimaryInverseDisableOnly$157(dynamicScheme);
                return lambda$textPrimaryInverseDisableOnly$157;
            case 18:
                tonalPalette10 = dynamicScheme.secondaryPalette;
                return tonalPalette10;
            case 19:
                lambda$onSecondaryFixedVariant$128 = MaterialDynamicColors.lambda$onSecondaryFixedVariant$128(dynamicScheme);
                return lambda$onSecondaryFixedVariant$128;
            case 20:
                tonalPalette11 = dynamicScheme.errorPalette;
                return tonalPalette11;
            case 21:
                lambda$errorContainer$98 = MaterialDynamicColors.lambda$errorContainer$98(dynamicScheme);
                return lambda$errorContainer$98;
            case 22:
                tonalPalette12 = dynamicScheme.tertiaryPalette;
                return tonalPalette12;
            case 23:
                lambda$onTertiaryFixedVariant$142 = MaterialDynamicColors.lambda$onTertiaryFixedVariant$142(dynamicScheme);
                return lambda$onTertiaryFixedVariant$142;
            case 24:
                tonalPalette13 = dynamicScheme.primaryPalette;
                return tonalPalette13;
            case 25:
                tonalPalette14 = dynamicScheme.neutralPalette;
                return tonalPalette14;
            case 26:
                lambda$onBackground$13 = MaterialDynamicColors.lambda$onBackground$13(dynamicScheme);
                return lambda$onBackground$13;
            case 27:
                tonalPalette15 = dynamicScheme.tertiaryPalette;
                return tonalPalette15;
            case 28:
                lambda$tertiaryPaletteKeyColor$5 = MaterialDynamicColors.lambda$tertiaryPaletteKeyColor$5(dynamicScheme);
                return lambda$tertiaryPaletteKeyColor$5;
            default:
                tonalPalette16 = dynamicScheme.neutralVariantPalette;
                return tonalPalette16;
        }
    }
}

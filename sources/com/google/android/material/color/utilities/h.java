package com.google.android.material.color.utilities;

import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28687a;

    public /* synthetic */ h(int i2) {
        this.f28687a = i2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Double lambda$surfaceVariant$34;
        TonalPalette tonalPalette;
        DynamicScheme dynamicScheme = (DynamicScheme) obj;
        switch (this.f28687a) {
            case 0:
                lambda$surfaceVariant$34 = MaterialDynamicColors.lambda$surfaceVariant$34(dynamicScheme);
                return lambda$surfaceVariant$34;
            default:
                tonalPalette = dynamicScheme.secondaryPalette;
                return tonalPalette;
        }
    }
}

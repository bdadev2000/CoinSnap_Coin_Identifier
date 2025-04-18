package com.google.android.material.color.utilities;

import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28678b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f28677a = i2;
        this.f28678b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        TonalPalette lambda$fromArgb$0;
        Double lambda$fromArgb$1;
        int i2 = this.f28677a;
        Object obj2 = this.f28678b;
        switch (i2) {
            case 0:
                lambda$fromArgb$0 = DynamicColor.lambda$fromArgb$0((TonalPalette) obj2, (DynamicScheme) obj);
                return lambda$fromArgb$0;
            case 1:
                lambda$fromArgb$1 = DynamicColor.lambda$fromArgb$1((Hct) obj2, (DynamicScheme) obj);
                return lambda$fromArgb$1;
            default:
                return TemperatureCache.a((TemperatureCache) obj2, (Hct) obj);
        }
    }
}

package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import q0.l;

/* loaded from: classes4.dex */
public final class SheetDefaultsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f11187a = 22;

    /* renamed from: b, reason: collision with root package name */
    public static final TweenSpec f11188b = AnimationSpecKt.d(300, 0, EasingKt.f2083a, 2);

    public static final SheetState a(boolean z2, l lVar, SheetValue sheetValue, boolean z3, Composer composer, int i2, int i3) {
        boolean z4 = (i3 & 1) != 0 ? false : z2;
        l lVar2 = (i3 & 2) != 0 ? SheetDefaultsKt$rememberSheetState$1.f11192a : lVar;
        SheetValue sheetValue2 = (i3 & 4) != 0 ? SheetValue.f11206a : sheetValue;
        boolean z5 = (i3 & 8) != 0 ? false : z3;
        Density density = (Density) composer.K(CompositionLocalsKt.f16434f);
        Object[] objArr = {Boolean.valueOf(z4), lVar2, Boolean.valueOf(z5)};
        SheetState$Companion$Saver$1 sheetState$Companion$Saver$1 = SheetState$Companion$Saver$1.f11200a;
        SheetState$Companion$Saver$2 sheetState$Companion$Saver$2 = new SheetState$Companion$Saver$2(density, lVar2, z4, z5);
        SaverKt$Saver$1 saverKt$Saver$1 = SaverKt.f14531a;
        SaverKt$Saver$1 saverKt$Saver$12 = new SaverKt$Saver$1(sheetState$Companion$Saver$2, sheetState$Companion$Saver$1);
        boolean I = ((((i2 & 14) ^ 6) > 4 && composer.a(z4)) || (i2 & 6) == 4) | composer.I(density) | ((((i2 & 896) ^ 384) > 256 && composer.I(sheetValue2)) || (i2 & 384) == 256) | ((((i2 & 112) ^ 48) > 32 && composer.I(lVar2)) || (i2 & 48) == 32) | ((((i2 & 7168) ^ 3072) > 2048 && composer.a(z5)) || (i2 & 3072) == 2048);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new SheetDefaultsKt$rememberSheetState$2$1(z4, density, sheetValue2, lVar2, z5);
            composer.o(u2);
        }
        return (SheetState) RememberSaveableKt.c(objArr, saverKt$Saver$12, null, (q0.a) u2, composer, 0, 4);
    }
}

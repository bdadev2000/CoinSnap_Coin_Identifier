package com.cooldev.gba.emulator.gameboy.features.loading_ads;

import android.support.v4.media.d;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.features.app.views.AppInfoFooterKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.p;
import q0.q;

/* renamed from: com.cooldev.gba.emulator.gameboy.features.loading_ads.ComposableSingletons$LoadingAdsPageKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$LoadingAdsPageKt$lambda1$1 extends r implements q {
    public static final ComposableSingletons$LoadingAdsPageKt$lambda1$1 INSTANCE = new ComposableSingletons$LoadingAdsPageKt$lambda1$1();

    public ComposableSingletons$LoadingAdsPageKt$lambda1$1() {
        super(3);
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull PaddingValues paddingValues, @Nullable Composer composer, int i2) {
        int i3;
        Modifier c2;
        Modifier c3;
        a.s(paddingValues, "it");
        if ((i2 & 14) == 0) {
            i3 = i2 | (composer.I(paddingValues) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 91) == 18 && composer.i()) {
            composer.A();
            return;
        }
        Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.f14670n;
        Modifier.Companion companion = Modifier.Companion.f14687a;
        Modifier j2 = PaddingKt.j(SizeKt.f4107c, 0.0f, 0.0f, 0.0f, paddingValues.a(), 7);
        ColumnMeasurePolicy a2 = ColumnKt.a(arrangement$Center$1, horizontal, composer, 54);
        int E = composer.E();
        PersistentCompositionLocalMap m2 = composer.m();
        Modifier c4 = ComposedModifierKt.c(composer, j2);
        ComposeUiNode.h8.getClass();
        q0.a aVar = ComposeUiNode.Companion.f15895b;
        if (composer.j() instanceof Applier) {
            composer.z();
            if (composer.e()) {
                composer.B(aVar);
            } else {
                composer.n();
            }
            Updater.b(composer, a2, ComposeUiNode.Companion.f15898g);
            Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar);
            }
            Updater.b(composer, c4, ComposeUiNode.Companion.d);
            c2 = ColumnScopeInstance.f3837a.c(1.0f, true);
            SpacerKt.a(c2, composer);
            ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getLogo(), composer, 6), null, SizeKt.j(companion, 72), null, null, 0.0f, null, composer, 440, 120);
            float f2 = 20;
            SpacerKt.a(SizeKt.e(companion, f2), composer);
            ProgressIndicatorKt.c(0.0f, 0, 54, 28, MyColors.INSTANCE.m12getPrimary0d7_KjU(), 0L, composer, SizeKt.n(companion, 50));
            c3 = ColumnScopeInstance.f3837a.c(1.0f, true);
            SpacerKt.a(c3, composer);
            AppInfoFooterKt.m115AppInfoFooterIv8Zu3U(Color.f14957b, composer, 6, 0);
            SpacerKt.a(SizeKt.e(companion, f2), composer);
            composer.p();
            return;
        }
        ComposablesKt.a();
        throw null;
    }
}

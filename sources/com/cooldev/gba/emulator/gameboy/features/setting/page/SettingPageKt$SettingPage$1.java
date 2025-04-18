package com.cooldev.gba.emulator.gameboy.features.setting.page;

import android.content.Context;
import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import com.cooldev.gba.emulator.gameboy.features.app.views.AppInfoFooterKt;
import com.cooldev.gba.emulator.gameboy.features.setting.logic.SettingViewModel;
import com.cooldev.gba.emulator.gameboy.features.setting.widgets.AppbarSettingKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.p;
import q0.q;

/* loaded from: classes.dex */
public final class SettingPageKt$SettingPage$1 extends r implements q {
    final /* synthetic */ Context $context;
    final /* synthetic */ SettingViewModel $settingViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingPageKt$SettingPage$1(SettingViewModel settingViewModel, Context context) {
        super(3);
        this.$settingViewModel = settingViewModel;
        this.$context = context;
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
        Modifier.Companion companion = Modifier.Companion.f14687a;
        float f2 = 8;
        Modifier j2 = PaddingKt.j(companion, 0.0f, paddingValues.d(), 0.0f, paddingValues.a() + f2, 5);
        SettingViewModel settingViewModel = this.$settingViewModel;
        Context context = this.$context;
        ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, composer, 0);
        int E = composer.E();
        PersistentCompositionLocalMap m2 = composer.m();
        Modifier c3 = ComposedModifierKt.c(composer, j2);
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
            Updater.b(composer, c3, ComposeUiNode.Companion.d);
            AppbarSettingKt.AppbarSetting(composer, 0);
            SpacerKt.a(SizeKt.e(companion, f2), composer);
            c2 = ColumnScopeInstance.f3837a.c(1.0f, true);
            float f3 = 16;
            LazyDslKt.a(c2, null, new PaddingValuesImpl(f3, 0, f3, 24), false, null, null, null, false, new SettingPageKt$SettingPage$1$1$1(settingViewModel, context), composer, 384, 250);
            AppInfoFooterKt.m115AppInfoFooterIv8Zu3U(0L, composer, 0, 1);
            SpacerKt.a(SizeKt.e(companion, 20), composer);
            composer.p();
            return;
        }
        ComposablesKt.a();
        throw null;
    }
}

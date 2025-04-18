package com.cooldev.gba.emulator.gameboy.features.theme.page;

import android.support.v4.media.d;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.features.theme.widgets.AppbarThemeKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.p;
import q0.q;

/* renamed from: com.cooldev.gba.emulator.gameboy.features.theme.page.ComposableSingletons$ThemePageKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$ThemePageKt$lambda1$1 extends r implements q {
    public static final ComposableSingletons$ThemePageKt$lambda1$1 INSTANCE = new ComposableSingletons$ThemePageKt$lambda1$1();

    public ComposableSingletons$ThemePageKt$lambda1$1() {
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
        FillElement fillElement = SizeKt.f4107c;
        MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
        int E = composer.E();
        PersistentCompositionLocalMap m2 = composer.m();
        Modifier c2 = ComposedModifierKt.c(composer, fillElement);
        ComposeUiNode.h8.getClass();
        q0.a aVar = ComposeUiNode.Companion.f15895b;
        if (composer.j() instanceof Applier) {
            composer.z();
            if (composer.e()) {
                composer.B(aVar);
            } else {
                composer.n();
            }
            p pVar = ComposeUiNode.Companion.f15898g;
            Updater.b(composer, e, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(composer, m2, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(composer, c2, pVar4);
            Modifier j2 = PaddingKt.j(companion, 0.0f, paddingValues.d(), 0.0f, 0.0f, 13);
            ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14670n, composer, 48);
            int E2 = composer.E();
            PersistentCompositionLocalMap m3 = composer.m();
            Modifier c3 = ComposedModifierKt.c(composer, j2);
            if (composer.j() instanceof Applier) {
                composer.z();
                if (composer.e()) {
                    composer.B(aVar);
                } else {
                    composer.n();
                }
                Updater.b(composer, a2, pVar);
                Updater.b(composer, m3, pVar2);
                if (composer.e() || !a.g(composer.u(), Integer.valueOf(E2))) {
                    d.w(E2, composer, E2, pVar3);
                }
                Updater.b(composer, c3, pVar4);
                AppbarThemeKt.AppbarTheme(composer, 0);
                SpacerKt.a(SizeKt.e(companion, 8), composer);
                ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getThemePage(), composer, 6), null, fillElement, null, ContentScale.Companion.f15724g, 0.0f, null, composer, 25016, 104);
                composer.p();
                composer.p();
                return;
            }
            ComposablesKt.a();
            throw null;
        }
        ComposablesKt.a();
        throw null;
    }
}

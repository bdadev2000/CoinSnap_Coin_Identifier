package com.cooldev.gba.emulator.gameboy.features.themenew.page;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.cooldev.gba.emulator.gameboy.features.themenew.logic.ThemeState;
import com.cooldev.gba.emulator.gameboy.features.themenew.widgets.AppbarNewThemeKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import p0.a;
import q0.l;
import q0.p;
import q0.q;

/* loaded from: classes.dex */
public final class ThemeNewPageKt$ThemeNewPage$2 extends r implements q {
    final /* synthetic */ ThemeState $themeState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeNewPageKt$ThemeNewPage$2(ThemeState themeState) {
        super(3);
        this.$themeState = themeState;
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
        ThemeState themeState = this.$themeState;
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
                AppbarNewThemeKt.AppbarNewTheme(composer, 0);
                SpacerKt.a(SizeKt.e(companion, 8), composer);
                float f2 = 16;
                PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(f2, 0, f2, 24);
                GridCells.Fixed fixed = new GridCells.Fixed(2);
                Arrangement.SpacedAligned g2 = Arrangement.g(f2);
                Arrangement.SpacedAligned g3 = Arrangement.g(f2);
                Modifier d = SizeKt.d(companion, 1.0f);
                composer.J(38244618);
                boolean I = composer.I(themeState);
                Object u2 = composer.u();
                if (I || u2 == Composer.Companion.f13690a) {
                    u2 = new ThemeNewPageKt$ThemeNewPage$2$1$1$1$1(themeState);
                    composer.o(u2);
                }
                composer.D();
                LazyGridDslKt.a(102435888, Opcodes.LCMP, null, g2, g3, paddingValuesImpl, fixed, null, composer, d, (l) u2, false, true);
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

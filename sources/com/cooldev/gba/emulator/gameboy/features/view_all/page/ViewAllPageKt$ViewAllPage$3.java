package com.cooldev.gba.emulator.gameboy.features.view_all.page;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllState;
import com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllViewModel;
import com.cooldev.gba.emulator.gameboy.features.view_all.widgets.AppbarViewAllKt;
import com.cooldev.gba.emulator.gameboy.features.view_all.widgets.BackgroundViewAllKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.p;
import q0.q;

/* loaded from: classes.dex */
public final class ViewAllPageKt$ViewAllPage$3 extends r implements q {
    final /* synthetic */ float $totalHeight;
    final /* synthetic */ ViewAllState $viewAllState;
    final /* synthetic */ ViewAllViewModel $viewAllViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAllPageKt$ViewAllPage$3(ViewAllViewModel viewAllViewModel, float f2, ViewAllState viewAllState) {
        super(3);
        this.$viewAllViewModel = viewAllViewModel;
        this.$totalHeight = f2;
        this.$viewAllState = viewAllState;
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
        FillElement fillElement = SizeKt.f4107c;
        ViewAllViewModel viewAllViewModel = this.$viewAllViewModel;
        float f2 = this.$totalHeight;
        ViewAllState viewAllState = this.$viewAllState;
        MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
        int E = composer.E();
        PersistentCompositionLocalMap m2 = composer.m();
        Modifier c3 = ComposedModifierKt.c(composer, fillElement);
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
            Updater.b(composer, c3, pVar4);
            BackgroundViewAllKt.BackgroundViewAll(composer, 0);
            Modifier j2 = PaddingKt.j(companion, 0.0f, paddingValues.d(), 0.0f, 0.0f, 13);
            ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14670n, composer, 48);
            int E2 = composer.E();
            PersistentCompositionLocalMap m3 = composer.m();
            Modifier c4 = ComposedModifierKt.c(composer, j2);
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
                Updater.b(composer, c4, pVar4);
                AppbarViewAllKt.AppbarViewAll(composer, 0);
                SpacerKt.a(SizeKt.e(companion, 8), composer);
                c2 = ColumnScopeInstance.f3837a.c(1.0f, true);
                BoxWithConstraintsKt.a(SuspendingPointerInputFilterKt.b(c2, b0.f30125a, new ViewAllPageKt$ViewAllPage$3$1$1$1(viewAllViewModel, null)), null, false, ComposableLambdaKt.c(-1003747257, new ViewAllPageKt$ViewAllPage$3$1$1$2(f2, viewAllState, viewAllViewModel), composer), composer, 3072, 6);
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

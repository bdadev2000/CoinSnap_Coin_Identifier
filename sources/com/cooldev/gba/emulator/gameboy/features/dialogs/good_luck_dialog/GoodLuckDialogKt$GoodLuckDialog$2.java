package com.cooldev.gba.emulator.gameboy.features.dialogs.good_luck_dialog;

import android.support.v4.media.d;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class GoodLuckDialogKt$GoodLuckDialog$2 extends r implements p {
    final /* synthetic */ a $onDismissRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoodLuckDialogKt$GoodLuckDialog$2(a aVar) {
        super(2);
        this.$onDismissRequest = aVar;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        if ((i2 & 11) == 2 && composer.i()) {
            composer.A();
            return;
        }
        Modifier.Companion companion = Modifier.Companion.f14687a;
        FillElement fillElement = SizeKt.f4107c;
        b0 b0Var = b0.f30125a;
        composer.J(58575634);
        boolean I = composer.I(this.$onDismissRequest);
        a aVar = this.$onDismissRequest;
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new GoodLuckDialogKt$GoodLuckDialog$2$1$1(aVar, null);
            composer.o(u2);
        }
        composer.D();
        Modifier b2 = SuspendingPointerInputFilterKt.b(fillElement, b0Var, (p) u2);
        ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, composer, 0);
        int E = composer.E();
        PersistentCompositionLocalMap m2 = composer.m();
        Modifier c2 = ComposedModifierKt.c(composer, b2);
        ComposeUiNode.h8.getClass();
        a aVar2 = ComposeUiNode.Companion.f15895b;
        if (composer.j() instanceof Applier) {
            composer.z();
            if (composer.e()) {
                composer.B(aVar2);
            } else {
                composer.n();
            }
            p pVar = ComposeUiNode.Companion.f15898g;
            Updater.b(composer, a2, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(composer, m2, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(composer, c2, pVar4);
            SpacerKt.a(SizeKt.e(companion, 95), composer);
            Modifier g2 = PaddingKt.g(ClickableKt.c(BackgroundKt.a(SizeKt.d(PaddingKt.h(companion, 24, 0.0f, 2), 1.0f), MyColors.INSTANCE.m37getText70d7_KjU(), RoundedCornerShapeKt.b(8)), false, null, GoodLuckDialogKt$GoodLuckDialog$2$2$1.INSTANCE, 7), 16, 21);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int E2 = composer.E();
            PersistentCompositionLocalMap m3 = composer.m();
            Modifier c3 = ComposedModifierKt.c(composer, g2);
            if (composer.j() instanceof Applier) {
                composer.z();
                if (composer.e()) {
                    composer.B(aVar2);
                } else {
                    composer.n();
                }
                Updater.b(composer, e, pVar);
                Updater.b(composer, m3, pVar2);
                if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E2))) {
                    d.w(E2, composer, E2, pVar3);
                }
                Updater.b(composer, c3, pVar4);
                ColumnMeasurePolicy a3 = ColumnKt.a(Arrangement.e, Alignment.Companion.f14670n, composer, 54);
                int E3 = composer.E();
                PersistentCompositionLocalMap m4 = composer.m();
                Modifier c4 = ComposedModifierKt.c(composer, companion);
                if (composer.j() instanceof Applier) {
                    composer.z();
                    if (composer.e()) {
                        composer.B(aVar2);
                    } else {
                        composer.n();
                    }
                    Updater.b(composer, a3, pVar);
                    Updater.b(composer, m4, pVar2);
                    if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E3))) {
                        d.w(E3, composer, E3, pVar3);
                    }
                    Updater.b(composer, c4, pVar4);
                    GoodLuckDialogKt.TextTitle(composer, 0);
                    SpacerKt.a(SizeKt.e(companion, 17), composer);
                    GoodLuckDialogKt.TextSubTitle(composer, 0);
                    composer.p();
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
        ComposablesKt.a();
        throw null;
    }
}

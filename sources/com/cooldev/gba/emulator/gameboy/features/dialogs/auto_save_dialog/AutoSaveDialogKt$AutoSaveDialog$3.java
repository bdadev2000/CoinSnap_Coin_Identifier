package com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog;

import android.support.v4.media.d;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;
import q0.q;

/* loaded from: classes.dex */
public final class AutoSaveDialogKt$AutoSaveDialog$3 extends r implements p {
    final /* synthetic */ a $debouncedOnDismiss;
    final /* synthetic */ a $debouncedOnTurnOn;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog.AutoSaveDialogKt$AutoSaveDialog$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements q {
        final /* synthetic */ a $debouncedOnDismiss;
        final /* synthetic */ a $debouncedOnTurnOn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, a aVar2) {
            super(3);
            this.$debouncedOnDismiss = aVar;
            this.$debouncedOnTurnOn = aVar2;
        }

        @Override // q0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return b0.f30125a;
        }

        @ComposableTarget
        @Composable
        public final void invoke(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i2) {
            p0.a.s(columnScope, "$this$Card");
            if ((i2 & 81) == 16 && composer.i()) {
                composer.A();
                return;
            }
            Modifier.Companion companion = Modifier.Companion.f14687a;
            float f2 = 16;
            Modifier f3 = PaddingKt.f(BackgroundKt.a(SizeKt.d(companion, 1.0f), MyColors.INSTANCE.m37getText70d7_KjU(), RoundedCornerShapeKt.b(f2)), f2);
            a aVar = this.$debouncedOnDismiss;
            a aVar2 = this.$debouncedOnTurnOn;
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer, f3);
            ComposeUiNode.h8.getClass();
            a aVar3 = ComposeUiNode.Companion.f15895b;
            if (composer.j() instanceof Applier) {
                composer.z();
                if (composer.e()) {
                    composer.B(aVar3);
                } else {
                    composer.n();
                }
                p pVar = ComposeUiNode.Companion.f15898g;
                Updater.b(composer, e, pVar);
                p pVar2 = ComposeUiNode.Companion.f15897f;
                Updater.b(composer, m2, pVar2);
                p pVar3 = ComposeUiNode.Companion.f15900i;
                if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                    d.w(E, composer, E, pVar3);
                }
                p pVar4 = ComposeUiNode.Companion.d;
                Updater.b(composer, c2, pVar4);
                ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.e, Alignment.Companion.f14670n, composer, 54);
                int E2 = composer.E();
                PersistentCompositionLocalMap m3 = composer.m();
                Modifier c3 = ComposedModifierKt.c(composer, companion);
                if (composer.j() instanceof Applier) {
                    composer.z();
                    if (composer.e()) {
                        composer.B(aVar3);
                    } else {
                        composer.n();
                    }
                    Updater.b(composer, a2, pVar);
                    Updater.b(composer, m3, pVar2);
                    if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E2))) {
                        d.w(E2, composer, E2, pVar3);
                    }
                    Updater.b(composer, c3, pVar4);
                    SpacerKt.a(SizeKt.e(companion, f2), composer);
                    ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getNoSave(), composer, 6), null, SizeKt.n(companion, 68), null, null, 0.0f, null, composer, 440, 120);
                    SpacerKt.a(SizeKt.e(companion, f2), composer);
                    AutoSaveDialogKt.TextSubtitle(composer, 0);
                    SpacerKt.a(SizeKt.e(companion, f2), composer);
                    RowMeasurePolicy a3 = RowKt.a(Arrangement.f3772a, Alignment.Companion.f14666j, composer, 0);
                    int E3 = composer.E();
                    PersistentCompositionLocalMap m4 = composer.m();
                    Modifier c4 = ComposedModifierKt.c(composer, companion);
                    if (composer.j() instanceof Applier) {
                        composer.z();
                        if (composer.e()) {
                            composer.B(aVar3);
                        } else {
                            composer.n();
                        }
                        Updater.b(composer, a3, pVar);
                        Updater.b(composer, m4, pVar2);
                        if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E3))) {
                            d.w(E3, composer, E3, pVar3);
                        }
                        Updater.b(composer, c4, pVar4);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.f4094a;
                        Modifier a4 = rowScopeInstance.a(companion, 5.0f, true);
                        composer.J(544666273);
                        boolean I = composer.I(aVar);
                        Object u2 = composer.u();
                        Object obj = Composer.Companion.f13690a;
                        if (I || u2 == obj) {
                            u2 = new AutoSaveDialogKt$AutoSaveDialog$3$1$1$1$1$1$1(aVar);
                            composer.o(u2);
                        }
                        composer.D();
                        AutoSaveDialogKt.ButtonDismiss(a4, (a) u2, composer, 0);
                        SpacerKt.a(SizeKt.r(companion, 8), composer);
                        Modifier a5 = rowScopeInstance.a(companion, 5.0f, true);
                        composer.J(544675264);
                        boolean I2 = composer.I(aVar2);
                        Object u3 = composer.u();
                        if (I2 || u3 == obj) {
                            u3 = new AutoSaveDialogKt$AutoSaveDialog$3$1$1$1$1$2$1(aVar2);
                            composer.o(u3);
                        }
                        composer.D();
                        AutoSaveDialogKt.ButtonTurnOn(a5, (a) u3, composer, 0);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoSaveDialogKt$AutoSaveDialog$3(a aVar, a aVar2) {
        super(2);
        this.$debouncedOnDismiss = aVar;
        this.$debouncedOnTurnOn = aVar2;
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
        CardKt.a(PaddingKt.h(SizeKt.d(Modifier.Companion.f14687a, 1.0f), 24, 0.0f, 2), RoundedCornerShapeKt.b(16), CardDefaults.a(Color.f14961h, composer), CardDefaults.b(0, 62), null, ComposableLambdaKt.c(-1207663664, new AnonymousClass1(this.$debouncedOnDismiss, this.$debouncedOnTurnOn), composer), composer, 196614, 16);
    }
}

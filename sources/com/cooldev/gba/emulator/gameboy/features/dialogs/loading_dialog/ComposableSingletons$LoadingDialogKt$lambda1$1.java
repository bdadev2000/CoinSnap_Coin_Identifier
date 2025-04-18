package com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog;

import android.support.v4.media.d;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* renamed from: com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.ComposableSingletons$LoadingDialogKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class ComposableSingletons$LoadingDialogKt$lambda1$1 extends r implements p {
    public static final ComposableSingletons$LoadingDialogKt$lambda1$1 INSTANCE = new ComposableSingletons$LoadingDialogKt$lambda1$1();

    public ComposableSingletons$LoadingDialogKt$lambda1$1() {
        super(2);
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
        BiasAlignment biasAlignment = Alignment.Companion.e;
        Modifier a2 = BackgroundKt.a(SizeKt.n(Modifier.Companion.f14687a, 100), Color.f14958c, RoundedCornerShapeKt.b(8));
        MeasurePolicy e = BoxKt.e(biasAlignment, false);
        int E = composer.E();
        PersistentCompositionLocalMap m2 = composer.m();
        Modifier c2 = ComposedModifierKt.c(composer, a2);
        ComposeUiNode.h8.getClass();
        a aVar = ComposeUiNode.Companion.f15895b;
        if (composer.j() instanceof Applier) {
            composer.z();
            if (composer.e()) {
                composer.B(aVar);
            } else {
                composer.n();
            }
            Updater.b(composer, e, ComposeUiNode.Companion.f15898g);
            Updater.b(composer, m2, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar);
            }
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            ProgressIndicatorKt.c(0.0f, 0, 48, 29, MyColors.INSTANCE.m12getPrimary0d7_KjU(), 0L, composer, null);
            composer.p();
            return;
        }
        ComposablesKt.a();
        throw null;
    }
}

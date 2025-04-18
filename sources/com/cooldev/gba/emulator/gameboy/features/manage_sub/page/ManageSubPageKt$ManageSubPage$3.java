package com.cooldev.gba.emulator.gameboy.features.manage_sub.page;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
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
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import com.cooldev.gba.emulator.gameboy.features.manage_sub.widgets.AppbarManageSubKt;
import com.cooldev.gba.emulator.gameboy.features.manage_sub.widgets.BoxEmptySubscriptionKt;
import com.cooldev.gba.emulator.gameboy.features.manage_sub.widgets.BoxSubscriptionKt;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.p;
import q0.q;

/* loaded from: classes3.dex */
public final class ManageSubPageKt$ManageSubPage$3 extends r implements q {
    final /* synthetic */ IAPState $iapState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageSubPageKt$ManageSubPage$3(IAPState iAPState) {
        super(3);
        this.$iapState = iAPState;
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((PaddingValues) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull PaddingValues paddingValues, @Nullable Composer composer, int i2) {
        a.s(paddingValues, "it");
        if ((i2 & 14) == 0) {
            i2 |= composer.I(paddingValues) ? 4 : 2;
        }
        if ((i2 & 91) == 18 && composer.i()) {
            composer.A();
            return;
        }
        Modifier.Companion companion = Modifier.Companion.f14687a;
        Modifier j2 = PaddingKt.j(companion, 0.0f, paddingValues.d(), 0.0f, 0.0f, 13);
        BiasAlignment.Horizontal horizontal = Alignment.Companion.f14669m;
        Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
        IAPState iAPState = this.$iapState;
        ColumnMeasurePolicy a2 = ColumnKt.a(arrangement$Center$1, horizontal, composer, 54);
        int E = composer.E();
        PersistentCompositionLocalMap m2 = composer.m();
        Modifier c2 = ComposedModifierKt.c(composer, j2);
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
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            AppbarManageSubKt.AppbarManageSub(composer, 0);
            SpacerKt.a(SizeKt.e(companion, 8), composer);
            if (iAPState.isPremium()) {
                composer.J(-1357910597);
                BoxSubscriptionKt.BoxSubscription(composer, 0);
                composer.D();
            } else {
                composer.J(-1357855882);
                BoxEmptySubscriptionKt.BoxEmptySubscription(composer, 0);
                composer.D();
            }
            composer.p();
            return;
        }
        ComposablesKt.a();
        throw null;
    }
}

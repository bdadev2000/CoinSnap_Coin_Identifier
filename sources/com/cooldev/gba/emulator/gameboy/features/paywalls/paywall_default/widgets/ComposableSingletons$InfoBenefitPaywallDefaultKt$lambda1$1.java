package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_default.widgets;

import android.support.v4.media.d;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.features.paywalls.enums.SubscriptionFeature;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.p;
import q0.q;

/* renamed from: com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_default.widgets.ComposableSingletons$InfoBenefitPaywallDefaultKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$InfoBenefitPaywallDefaultKt$lambda1$1 extends r implements q {
    public static final ComposableSingletons$InfoBenefitPaywallDefaultKt$lambda1$1 INSTANCE = new ComposableSingletons$InfoBenefitPaywallDefaultKt$lambda1$1();

    public ComposableSingletons$InfoBenefitPaywallDefaultKt$lambda1$1() {
        super(3);
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((FlowRowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull FlowRowScope flowRowScope, @Nullable Composer composer, int i2) {
        Composer composer2 = composer;
        a.s(flowRowScope, "$this$FlowRow");
        if ((i2 & 81) == 16 && composer.i()) {
            composer.A();
            return;
        }
        for (SubscriptionFeature subscriptionFeature : SubscriptionFeature.getEntries()) {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            float f2 = 8;
            Modifier g2 = PaddingKt.g(BackgroundKt.a(companion, MyColors.INSTANCE.m28getText240d7_KjU(), RoundedCornerShapeKt.b(f2)), f2, 4);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer2, g2);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            if (composer.j() instanceof Applier) {
                composer.z();
                if (composer.e()) {
                    composer2.B(aVar);
                } else {
                    composer.n();
                }
                p pVar = ComposeUiNode.Companion.f15898g;
                Updater.b(composer2, e, pVar);
                p pVar2 = ComposeUiNode.Companion.f15897f;
                Updater.b(composer2, m2, pVar2);
                p pVar3 = ComposeUiNode.Companion.f15900i;
                if (composer.e() || !a.g(composer.u(), Integer.valueOf(E))) {
                    d.w(E, composer2, E, pVar3);
                }
                p pVar4 = ComposeUiNode.Companion.d;
                Updater.b(composer2, c2, pVar4);
                RowMeasurePolicy a2 = RowKt.a(Arrangement.e, Alignment.Companion.f14667k, composer2, 54);
                int E2 = composer.E();
                PersistentCompositionLocalMap m3 = composer.m();
                Modifier c3 = ComposedModifierKt.c(composer2, companion);
                if (composer.j() instanceof Applier) {
                    composer.z();
                    if (composer.e()) {
                        composer2.B(aVar);
                    } else {
                        composer.n();
                    }
                    Updater.b(composer2, a2, pVar);
                    Updater.b(composer2, m3, pVar2);
                    if (composer.e() || !a.g(composer.u(), Integer.valueOf(E2))) {
                        d.w(E2, composer2, E2, pVar3);
                    }
                    Updater.b(composer2, c3, pVar4);
                    ImageKt.a(PainterResources_androidKt.a(subscriptionFeature.getImageRes(), composer2, 0), null, SizeKt.n(companion, 24), null, null, 0.0f, null, composer, 440, 120);
                    SpacerKt.a(SizeKt.r(companion, 6), composer2);
                    TextKt.b(subscriptionFeature.getTitle(), null, Color.f14958c, TextUnitKt.b(14), null, FontWeight.f17264b, MyFonts.INSTANCE.getInter(), 0L, null, new TextAlign(3), TextUnitKt.b(20), 0, false, 0, 0, null, null, composer, 1772928, 6, 129426);
                    composer.p();
                    composer.p();
                    composer2 = composer;
                } else {
                    ComposablesKt.a();
                    throw null;
                }
            } else {
                ComposablesKt.a();
                throw null;
            }
        }
    }
}

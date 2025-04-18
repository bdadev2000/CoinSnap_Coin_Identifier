package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes3.dex */
final class Tooltip_androidKt$RichTooltip$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f12583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f12584b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RichTooltipColors f12585c;
    public final /* synthetic */ p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tooltip_androidKt$RichTooltip$1(p pVar, p pVar2, RichTooltipColors richTooltipColors, p pVar3) {
        super(2);
        this.f12583a = pVar;
        this.f12584b = pVar2;
        this.f12585c = richTooltipColors;
        this.d = pVar3;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        TextStyle textStyle;
        TextStyle textStyle2;
        BiasAlignment biasAlignment;
        p pVar;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            float f2 = RichTooltipTokens.f13497a;
            TextStyle a2 = TypographyKt.a(TypographyKeyTokens.f13649j, composer);
            TextStyle a3 = TypographyKt.a(RichTooltipTokens.d, composer);
            TextStyle a4 = TypographyKt.a(RichTooltipTokens.f13500f, composer);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier h2 = PaddingKt.h(companion, TooltipKt.f12533h, 0.0f, 2);
            ColumnMeasurePolicy a5 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, composer, 0);
            int E = composer.E();
            PersistentCompositionLocalMap m2 = composer.m();
            Modifier c2 = ComposedModifierKt.c(composer, h2);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            if (!(composer.j() instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            composer.z();
            if (composer.e()) {
                composer.B(aVar);
            } else {
                composer.n();
            }
            p pVar2 = ComposeUiNode.Companion.f15898g;
            Updater.b(composer, a5, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15897f;
            Updater.b(composer, m2, pVar3);
            p pVar4 = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar4);
            }
            p pVar5 = ComposeUiNode.Companion.d;
            Updater.b(composer, c2, pVar5);
            composer.J(955016030);
            BiasAlignment biasAlignment2 = Alignment.Companion.f14659a;
            p pVar6 = this.f12583a;
            RichTooltipColors richTooltipColors = this.f12585c;
            if (pVar6 == null) {
                textStyle = a2;
                biasAlignment = biasAlignment2;
                textStyle2 = a4;
                pVar = pVar5;
            } else {
                Modifier c3 = AlignmentLineKt.c(TooltipKt.f12534i, Float.NaN);
                textStyle = a2;
                MeasurePolicy e = BoxKt.e(biasAlignment2, false);
                int E2 = composer.E();
                textStyle2 = a4;
                PersistentCompositionLocalMap m3 = composer.m();
                Modifier c4 = ComposedModifierKt.c(composer, c3);
                biasAlignment = biasAlignment2;
                if (!(composer.j() instanceof Applier)) {
                    ComposablesKt.a();
                    throw null;
                }
                composer.z();
                if (composer.e()) {
                    composer.B(aVar);
                } else {
                    composer.n();
                }
                Updater.b(composer, e, pVar2);
                Updater.b(composer, m3, pVar3);
                if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E2))) {
                    d.w(E2, composer, E2, pVar4);
                }
                Updater.b(composer, c4, pVar5);
                pVar = pVar5;
                CompositionLocalKt.b(new ProvidedValue[]{androidx.compose.foundation.text.input.a.d(richTooltipColors.f10779c, ContentColorKt.f8654a), TextKt.f12204a.c(a3)}, pVar6, composer, 8);
                composer.p();
            }
            composer.D();
            boolean z2 = pVar6 != null;
            p pVar7 = this.f12584b;
            Modifier j2 = (z2 || (pVar7 != null)) ? PaddingKt.j(AlignmentLineKt.c(TooltipKt.f12535j, Float.NaN), 0.0f, 0.0f, 0.0f, TooltipKt.f12536k, 7) : PaddingKt.h(companion, 0.0f, TooltipKt.e, 1);
            BiasAlignment biasAlignment3 = biasAlignment;
            MeasurePolicy e2 = BoxKt.e(biasAlignment3, false);
            int E3 = composer.E();
            PersistentCompositionLocalMap m4 = composer.m();
            Modifier c5 = ComposedModifierKt.c(composer, j2);
            if (!(composer.j() instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            composer.z();
            if (composer.e()) {
                composer.B(aVar);
            } else {
                composer.n();
            }
            Updater.b(composer, e2, pVar2);
            Updater.b(composer, m4, pVar3);
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E3))) {
                d.w(E3, composer, E3, pVar4);
            }
            Updater.b(composer, c5, pVar);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.f8654a;
            ProvidedValue d = androidx.compose.foundation.text.input.a.d(richTooltipColors.f10778b, dynamicProvidableCompositionLocal);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = TextKt.f12204a;
            CompositionLocalKt.b(new ProvidedValue[]{d, dynamicProvidableCompositionLocal2.c(textStyle2)}, this.d, composer, 8);
            composer.p();
            composer.J(955039618);
            if (pVar7 != null) {
                Modifier j3 = PaddingKt.j(SizeKt.i(companion, TooltipKt.f12537l), 0.0f, 0.0f, 0.0f, TooltipKt.f12538m, 7);
                MeasurePolicy e3 = BoxKt.e(biasAlignment3, false);
                int E4 = composer.E();
                PersistentCompositionLocalMap m5 = composer.m();
                Modifier c6 = ComposedModifierKt.c(composer, j3);
                if (!(composer.j() instanceof Applier)) {
                    ComposablesKt.a();
                    throw null;
                }
                composer.z();
                if (composer.e()) {
                    composer.B(aVar);
                } else {
                    composer.n();
                }
                Updater.b(composer, e3, pVar2);
                Updater.b(composer, m5, pVar3);
                if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E4))) {
                    d.w(E4, composer, E4, pVar4);
                }
                Updater.b(composer, c6, pVar);
                CompositionLocalKt.b(new ProvidedValue[]{dynamicProvidableCompositionLocal.c(new Color(richTooltipColors.d)), dynamicProvidableCompositionLocal2.c(textStyle)}, pVar7, composer, 8);
                composer.p();
            }
            composer.D();
            composer.p();
        }
        return b0.f30125a;
    }
}

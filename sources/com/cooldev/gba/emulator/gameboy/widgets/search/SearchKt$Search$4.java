package com.cooldev.gba.emulator.gameboy.widgets.search;

import android.support.v4.media.d;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;
import q0.q;

/* loaded from: classes.dex */
public final class SearchKt$Search$4 extends r implements q {
    final /* synthetic */ long $background;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ String $hint;
    final /* synthetic */ boolean $isHintVisible;
    final /* synthetic */ boolean $isShowClearButton;
    final /* synthetic */ a $onClear;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchKt$Search$4(long j2, FocusRequester focusRequester, boolean z2, boolean z3, a aVar, String str) {
        super(3);
        this.$background = j2;
        this.$focusRequester = focusRequester;
        this.$isHintVisible = z2;
        this.$isShowClearButton = z3;
        this.$onClear = aVar;
        this.$hint = str;
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((p) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @Composable
    @ComposableInferredTarget
    public final void invoke(@NotNull p pVar, @Nullable Composer composer, int i2) {
        int i3;
        float f2;
        Composer composer2;
        String str;
        RowScopeInstance rowScopeInstance;
        Modifier.Companion companion;
        p0.a.s(pVar, "innerTextField");
        if ((i2 & 14) == 0) {
            i3 = i2 | (composer.w(pVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 91) == 18 && composer.i()) {
            composer.A();
            return;
        }
        Modifier.Companion companion2 = Modifier.Companion.f14687a;
        Modifier d = SizeKt.d(companion2, 1.0f);
        long j2 = this.$background;
        RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.f5392a;
        Modifier a2 = BackgroundKt.a(d, j2, roundedCornerShape);
        MyColors myColors = MyColors.INSTANCE;
        float f3 = 12;
        Modifier a3 = FocusRequesterModifierKt.a(PaddingKt.g(a2.T0(new BorderModifierNodeElement(1, new SolidColor(myColors.m20getText160d7_KjU()), roundedCornerShape)), f3, 8), this.$focusRequester);
        BiasAlignment.Vertical vertical = Alignment.Companion.f14667k;
        boolean z2 = this.$isHintVisible;
        boolean z3 = this.$isShowClearButton;
        a aVar = this.$onClear;
        String str2 = this.$hint;
        RowMeasurePolicy a4 = RowKt.a(Arrangement.f3772a, vertical, composer, 48);
        int E = composer.E();
        PersistentCompositionLocalMap m2 = composer.m();
        Modifier c2 = ComposedModifierKt.c(composer, a3);
        ComposeUiNode.h8.getClass();
        a aVar2 = ComposeUiNode.Companion.f15895b;
        if (composer.j() instanceof Applier) {
            composer.z();
            if (composer.e()) {
                composer.B(aVar2);
            } else {
                composer.n();
            }
            p pVar2 = ComposeUiNode.Companion.f15898g;
            Updater.b(composer, a4, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15897f;
            Updater.b(composer, m2, pVar3);
            p pVar4 = ComposeUiNode.Companion.f15900i;
            if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar4);
            }
            p pVar5 = ComposeUiNode.Companion.d;
            Updater.b(composer, c2, pVar5);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.f4094a;
            MyImages myImages = MyImages.INSTANCE;
            float f4 = 24;
            ImageKt.a(PainterResources_androidKt.a(myImages.getIcSearch(), composer, 6), null, SizeKt.n(companion2, f4), null, null, 0.0f, null, composer, 440, 120);
            SpacerKt.a(SizeKt.r(companion2, f3), composer);
            if (z2) {
                composer.J(1150787494);
                MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
                int E2 = composer.E();
                PersistentCompositionLocalMap m3 = composer.m();
                Modifier c3 = ComposedModifierKt.c(composer, companion2);
                if (composer.j() instanceof Applier) {
                    composer.z();
                    if (composer.e()) {
                        composer.B(aVar2);
                    } else {
                        composer.n();
                    }
                    Updater.b(composer, e, pVar2);
                    Updater.b(composer, m3, pVar3);
                    if (composer.e() || !p0.a.g(composer.u(), Integer.valueOf(E2))) {
                        d.w(E2, composer, E2, pVar4);
                    }
                    Updater.b(composer, c3, pVar5);
                    pVar.invoke(composer, Integer.valueOf(i3 & 14));
                    f2 = f3;
                    composer2 = composer;
                    TextKt.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.a(0, 16646104, myColors.m38getText80d7_KjU(), TextUnitKt.b(16), 0L, TextUnitKt.b(24), null, (TextStyle) composer.K(TextKt.f12204a), MyFonts.INSTANCE.getInter(), FontWeight.f17264b, null), composer, 0, 0, 65534);
                    composer.p();
                    composer.D();
                    rowScopeInstance = rowScopeInstance2;
                    companion = companion2;
                    str = null;
                } else {
                    ComposablesKt.a();
                    throw null;
                }
            } else {
                f2 = f3;
                composer2 = composer;
                str = null;
                composer2.J(1151353523);
                pVar.invoke(composer2, Integer.valueOf(i3 & 14));
                composer.D();
                rowScopeInstance = rowScopeInstance2;
                companion = companion2;
            }
            SpacerKt.a(rowScopeInstance.a(companion, 1.0f, true), composer2);
            composer2.J(-1209781031);
            if (z3) {
                SpacerKt.a(SizeKt.r(companion, f2), composer2);
                Painter a5 = PainterResources_androidKt.a(myImages.getIcClose(), composer2, 6);
                Modifier n2 = SizeKt.n(companion, f4);
                composer2.J(-1209769849);
                boolean I = composer2.I(aVar);
                Object u2 = composer.u();
                if (I || u2 == Composer.Companion.f13690a) {
                    u2 = new SearchKt$Search$4$1$2$1(aVar);
                    composer2.o(u2);
                }
                composer.D();
                ImageKt.a(a5, null, ClickableKt.c(n2, false, str, (a) u2, 7), null, null, 0.0f, null, composer, 56, 120);
            }
            composer.D();
            composer.p();
            return;
        }
        ComposablesKt.a();
        throw null;
    }
}

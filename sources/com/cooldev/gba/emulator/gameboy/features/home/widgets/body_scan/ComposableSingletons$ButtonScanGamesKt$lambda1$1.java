package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_scan;

import android.support.v4.media.d;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.layout.ContentScale;
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
import p0.a;
import q0.p;
import q0.q;

/* renamed from: com.cooldev.gba.emulator.gameboy.features.home.widgets.body_scan.ComposableSingletons$ButtonScanGamesKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ButtonScanGamesKt$lambda1$1 extends r implements q {
    public static final ComposableSingletons$ButtonScanGamesKt$lambda1$1 INSTANCE = new ComposableSingletons$ButtonScanGamesKt$lambda1$1();

    public ComposableSingletons$ButtonScanGamesKt$lambda1$1() {
        super(3);
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer, int i2) {
        a.s(rowScope, "$this$Button");
        if ((i2 & 81) == 16 && composer.i()) {
            composer.A();
            return;
        }
        BiasAlignment biasAlignment = Alignment.Companion.f14660b;
        Modifier.Companion companion = Modifier.Companion.f14687a;
        MeasurePolicy e = BoxKt.e(biasAlignment, false);
        int E = composer.E();
        PersistentCompositionLocalMap m2 = composer.m();
        Modifier c2 = ComposedModifierKt.c(composer, companion);
        ComposeUiNode.h8.getClass();
        q0.a aVar = ComposeUiNode.Companion.f15895b;
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
            if (composer.e() || !a.g(composer.u(), Integer.valueOf(E))) {
                d.w(E, composer, E, pVar);
            }
            Updater.b(composer, c2, ComposeUiNode.Companion.d);
            ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getButton1(), composer, 6), null, SizeKt.f4107c, null, ContentScale.Companion.f15724g, 0.0f, null, composer, 25016, 104);
            long b2 = TextUnitKt.b(32);
            long b3 = TextUnitKt.b(40);
            TextKt.b("Scan Games", PaddingKt.j(companion, 0.0f, 4, 0.0f, 0.0f, 13), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(MyColors.INSTANCE.m25getText200d7_KjU(), b2, new FontWeight(400), MyFonts.INSTANCE.getDeterminationSans(), 0L, null, 3, b3, 16613336), composer, 54, 0, 65532);
            composer.p();
            return;
        }
        ComposablesKt.a();
        throw null;
    }
}

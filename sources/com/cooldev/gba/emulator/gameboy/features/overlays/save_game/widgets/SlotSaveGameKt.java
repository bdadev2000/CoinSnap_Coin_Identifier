package com.cooldev.gba.emulator.gameboy.features.overlays.save_game.widgets;

import android.support.v4.media.d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.TextUnitKt;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.features.game.models.StateEntry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes3.dex */
public final class SlotSaveGameKt {
    @ComposableTarget
    @Composable
    public static final void SlotSaveGame(@NotNull StateEntry stateEntry, @NotNull a aVar, @Nullable Composer composer, int i2) {
        p0.a.s(stateEntry, "item");
        p0.a.s(aVar, "onClick");
        ComposerImpl g2 = composer.g(-865613882);
        g2.J(1598786116);
        g2.J(757210042);
        Object u2 = g2.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (u2 == composer$Companion$Empty$1) {
            u2 = SnapshotLongStateKt.a(0L);
            g2.o(u2);
        }
        g2.V(false);
        SlotSaveGameKt$SlotSaveGame$$inlined$debounced$1 slotSaveGameKt$SlotSaveGame$$inlined$debounced$1 = new SlotSaveGameKt$SlotSaveGame$$inlined$debounced$1(500L, (MutableLongState) u2, aVar);
        g2.V(false);
        Modifier.Companion companion = Modifier.Companion.f14687a;
        Modifier h2 = PaddingKt.h(SizeKt.d(companion, 1.0f), 16, 0.0f, 2);
        boolean enabled = stateEntry.getEnabled();
        g2.J(-431858797);
        boolean I = g2.I(slotSaveGameKt$SlotSaveGame$$inlined$debounced$1);
        Object u3 = g2.u();
        if (I || u3 == composer$Companion$Empty$1) {
            u3 = new SlotSaveGameKt$SlotSaveGame$1$1(slotSaveGameKt$SlotSaveGame$$inlined$debounced$1);
            g2.o(u3);
        }
        g2.V(false);
        Modifier c2 = ClickableKt.c(h2, enabled, null, (a) u3, 6);
        MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
        int i3 = g2.P;
        PersistentCompositionLocalMap Q = g2.Q();
        Modifier c3 = ComposedModifierKt.c(g2, c2);
        ComposeUiNode.h8.getClass();
        a aVar2 = ComposeUiNode.Companion.f15895b;
        Applier applier = g2.f13691a;
        if (!(applier instanceof Applier)) {
            ComposablesKt.a();
            throw null;
        }
        g2.z();
        if (g2.O) {
            g2.B(aVar2);
        } else {
            g2.n();
        }
        p pVar = ComposeUiNode.Companion.f15898g;
        Updater.b(g2, e, pVar);
        p pVar2 = ComposeUiNode.Companion.f15897f;
        Updater.b(g2, Q, pVar2);
        p pVar3 = ComposeUiNode.Companion.f15900i;
        if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i3))) {
            d.x(i3, g2, i3, pVar3);
        }
        p pVar4 = ComposeUiNode.Companion.d;
        Updater.b(g2, c3, pVar4);
        ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, g2, 0);
        int i4 = g2.P;
        PersistentCompositionLocalMap Q2 = g2.Q();
        Modifier c4 = ComposedModifierKt.c(g2, companion);
        if (!(applier instanceof Applier)) {
            ComposablesKt.a();
            throw null;
        }
        g2.z();
        if (g2.O) {
            g2.B(aVar2);
        } else {
            g2.n();
        }
        Updater.b(g2, a2, pVar);
        Updater.b(g2, Q2, pVar2);
        if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
            d.x(i4, g2, i4, pVar3);
        }
        Updater.b(g2, c4, pVar4);
        String title = stateEntry.getTitle();
        MyColors myColors = MyColors.INSTANCE;
        long m22getText180d7_KjU = myColors.m22getText180d7_KjU();
        long b2 = TextUnitKt.b(16);
        long b3 = TextUnitKt.b(24);
        FontWeight fontWeight = FontWeight.f17265c;
        MyFonts myFonts = MyFonts.INSTANCE;
        TextKt.b(title, null, m22getText180d7_KjU, b2, null, fontWeight, myFonts.getInter(), 0L, null, new TextAlign(5), b3, 0, false, 0, 0, null, null, g2, 1772928, 6, 129426);
        float f2 = 8;
        SpacerKt.a(SizeKt.e(companion, f2), g2);
        RowMeasurePolicy a3 = RowKt.a(Arrangement.e, Alignment.Companion.f14667k, g2, 54);
        int i5 = g2.P;
        PersistentCompositionLocalMap Q3 = g2.Q();
        Modifier c5 = ComposedModifierKt.c(g2, companion);
        if (!(applier instanceof Applier)) {
            ComposablesKt.a();
            throw null;
        }
        g2.z();
        if (g2.O) {
            g2.B(aVar2);
        } else {
            g2.n();
        }
        Updater.b(g2, a3, pVar);
        Updater.b(g2, Q3, pVar2);
        if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
            d.x(i5, g2, i5, pVar3);
        }
        Updater.b(g2, c5, pVar4);
        g2.J(1715066546);
        if (stateEntry.getPreview() != null) {
            ImageKt.b(new AndroidImageBitmap(stateEntry.getPreview()), SizeKt.n(companion, 48), ContentScale.Companion.f15720a, g2, 25016);
            SpacerKt.a(SizeKt.r(companion, f2), g2);
        }
        g2.V(false);
        TextKt.b(stateEntry.getDescription(), null, myColors.m22getText180d7_KjU(), TextUnitKt.b(16), null, fontWeight, myFonts.getInter(), 0L, null, new TextAlign(5), TextUnitKt.b(24), 0, false, 0, 0, null, null, g2, 1772928, 6, 129426);
        g2.V(true);
        g2.V(true);
        g2.V(true);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SlotSaveGameKt$SlotSaveGame$3(stateEntry, aVar, i2);
        }
    }
}

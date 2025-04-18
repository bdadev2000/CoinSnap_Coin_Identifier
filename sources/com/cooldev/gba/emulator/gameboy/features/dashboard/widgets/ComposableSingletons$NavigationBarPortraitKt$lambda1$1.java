package com.cooldev.gba.emulator.gameboy.features.dashboard.widgets;

import android.support.v4.media.d;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.cooldev.gba.emulator.gameboy.constants.MyApps;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.features.dashboard.enums.NavigationBottomBarPortraitItem;
import d0.b0;
import java.util.Iterator;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.p;
import q0.q;

/* renamed from: com.cooldev.gba.emulator.gameboy.features.dashboard.widgets.ComposableSingletons$NavigationBarPortraitKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$NavigationBarPortraitKt$lambda1$1 extends r implements q {
    public static final ComposableSingletons$NavigationBarPortraitKt$lambda1$1 INSTANCE = new ComposableSingletons$NavigationBarPortraitKt$lambda1$1();

    public ComposableSingletons$NavigationBarPortraitKt$lambda1$1() {
        super(3);
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((AnimatedVisibilityScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull AnimatedVisibilityScope animatedVisibilityScope, @Nullable Composer composer, int i2) {
        a.s(animatedVisibilityScope, "$this$AnimatedVisibility");
        Modifier.Companion companion = Modifier.Companion.f14687a;
        Modifier a2 = BackgroundKt.a(SizeKt.e(SizeKt.d(companion, 1.0f), MyApps.INSTANCE.m9getHNavigationBarPortraitD9Ej5fM()), MyColors.INSTANCE.m37getText70d7_KjU(), RectangleShapeKt.f15014a);
        MeasurePolicy e = BoxKt.e(Alignment.Companion.e, false);
        int E = composer.E();
        PersistentCompositionLocalMap m2 = composer.m();
        Modifier c2 = ComposedModifierKt.c(composer, a2);
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
            Updater.b(composer, c2, pVar4);
            FillElement fillElement = SizeKt.f4107c;
            RowMeasurePolicy a3 = RowKt.a(Arrangement.f3772a, Alignment.Companion.f14667k, composer, 48);
            int E2 = composer.E();
            PersistentCompositionLocalMap m3 = composer.m();
            Modifier c3 = ComposedModifierKt.c(composer, fillElement);
            if (composer.j() instanceof Applier) {
                composer.z();
                if (composer.e()) {
                    composer.B(aVar);
                } else {
                    composer.n();
                }
                Updater.b(composer, a3, pVar);
                Updater.b(composer, m3, pVar2);
                if (composer.e() || !a.g(composer.u(), Integer.valueOf(E2))) {
                    d.w(E2, composer, E2, pVar3);
                }
                Updater.b(composer, c3, pVar4);
                RowScopeInstance rowScopeInstance = RowScopeInstance.f4094a;
                composer.J(-494284284);
                Iterator<E> it = NavigationBottomBarPortraitItem.getEntries().iterator();
                while (it.hasNext()) {
                    ItemBottomBarPortraitWidgetKt.ItemBottomBarPortraitWidget(rowScopeInstance.a(companion, 1.0f, true), (NavigationBottomBarPortraitItem) it.next(), composer, 0, 0);
                }
                composer.D();
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

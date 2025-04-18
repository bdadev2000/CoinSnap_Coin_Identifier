package com.cooldev.gba.emulator.gameboy.features;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.cooldev.gba.emulator.gameboy.features.admob.LoadingInterstitialViewKt;
import com.cooldev.gba.emulator.gameboy.features.admob.PlaceHolderAdsViewKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class GBAEmulatorAppKt$GBAEmulatorApp$2 extends r implements p {
    final /* synthetic */ MutableState<Boolean> $isInitialized$delegate;
    final /* synthetic */ Modifier $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GBAEmulatorAppKt$GBAEmulatorApp$2(Modifier modifier, MutableState<Boolean> mutableState) {
        super(2);
        this.$modifier = modifier;
        this.$isInitialized$delegate = mutableState;
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
        FillElement fillElement = SizeKt.f4107c;
        Modifier modifier = this.$modifier;
        MutableState<Boolean> mutableState = this.$isInitialized$delegate;
        MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
        int E = composer.E();
        PersistentCompositionLocalMap m2 = composer.m();
        Modifier c2 = ComposedModifierKt.c(composer, fillElement);
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
            SurfaceKt.a(modifier.T0(fillElement), null, Color.f14957b, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.c(299967377, new GBAEmulatorAppKt$GBAEmulatorApp$2$1$1(mutableState), composer), composer, 12583296, 122);
            LoadingInterstitialViewKt.LoadingInterstitialView(composer, 0);
            PlaceHolderAdsViewKt.AdPlaceholderView(composer, 0);
            composer.p();
            return;
        }
        ComposablesKt.a();
        throw null;
    }
}

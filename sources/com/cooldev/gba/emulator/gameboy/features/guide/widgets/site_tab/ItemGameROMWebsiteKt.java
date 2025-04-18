package com.cooldev.gba.emulator.gameboy.features.guide.widgets.site_tab;

import android.content.Context;
import android.support.v4.media.d;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.extensions.DebounceExtensionsKt;
import com.cooldev.gba.emulator.gameboy.features.guide.enums.GameROMWebsite;
import com.cooldev.gba.emulator.gameboy.features.guide.logic.GuideViewModel;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.compose.ViewModelInternalsKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import org.objectweb.asm.Opcodes;
import p0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class ItemGameROMWebsiteKt {
    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void Description(String str, Composer composer, int i2) {
        int i3;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(1448370798);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            composerImpl = g2;
            long b2 = TextUnitKt.b(14);
            long b3 = TextUnitKt.b(20);
            TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(MyColors.INSTANCE.m34getText40d7_KjU(), b2, new FontWeight(400), MyFonts.INSTANCE.getInter(), 0L, null, 0, b3, 16646104), composerImpl, i3 & 14, 0, 65534);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new ItemGameROMWebsiteKt$Description$1(str, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void ImageBanner(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(1041944746);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getPreview(), g2, 6), null, ClipKt.a(SizeKt.n(Modifier.Companion.f14687a, 156), RoundedCornerShapeKt.b(8)), null, ContentScale.Companion.d, 0.0f, null, g2, 24632, 104);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ItemGameROMWebsiteKt$ImageBanner$1(i2);
        }
    }

    @ComposableTarget
    @Composable
    public static final void ItemGameROMWebsite(@NotNull GameROMWebsite gameROMWebsite, @Nullable Composer composer, int i2) {
        int i3;
        a.s(gameROMWebsite, "data");
        ComposerImpl g2 = composer.g(-2118951790);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(gameROMWebsite) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
            g2.t(-1614864554);
            ViewModelStoreOwner a2 = LocalViewModelStoreOwner.a(g2);
            if (a2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel resolveViewModel = GetViewModelKt.resolveViewModel(g0.a(GuideViewModel.class), a2.getViewModelStore(), null, ViewModelInternalsKt.defaultExtras(a2, g2, 8), null, KoinApplicationKt.currentKoinScope(g2, 0), null);
            g2.V(false);
            BiasAlignment.Horizontal horizontal = Alignment.Companion.f14670n;
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.f3774c;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier debouncedClickable$default = DebounceExtensionsKt.debouncedClickable$default(SizeKt.e(companion, Opcodes.INVOKESTATIC), false, 0L, new ItemGameROMWebsiteKt$ItemGameROMWebsite$1((GuideViewModel) resolveViewModel, context, gameROMWebsite), 3, null);
            ColumnMeasurePolicy a3 = ColumnKt.a(arrangement$Top$1, horizontal, g2, 54);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, debouncedClickable$default);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, a3, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            ImageBanner(g2, 0);
            SpacerKt.a(SizeKt.e(companion, 8), g2);
            Description(gameROMWebsite.getTitle(), g2, 0);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ItemGameROMWebsiteKt$ItemGameROMWebsite$3(gameROMWebsite, i2);
        }
    }
}

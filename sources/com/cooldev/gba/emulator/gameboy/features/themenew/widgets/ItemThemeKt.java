package com.cooldev.gba.emulator.gameboy.features.themenew.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.d;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.BlurKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1;
import androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.features.themenew.enums.GamePadTheme;
import com.cooldev.gba.emulator.gameboy.features.themenew.logic.ThemeViewModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;
import q0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class ItemThemeKt {
    @ComposableTarget
    @Composable
    public static final void ItemTheme(@NotNull GamePadTheme gamePadTheme, boolean z2, @Nullable Composer composer, int i2) {
        int i3;
        p pVar;
        p pVar2;
        a aVar;
        IAPState iAPState;
        p pVar3;
        Throwable th;
        Modifier.Companion companion;
        Applier applier;
        Applier applier2;
        Modifier.Companion companion2;
        boolean z3;
        p0.a.s(gamePadTheme, "item");
        ComposerImpl g2 = composer.g(-494614179);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(gamePadTheme) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.a(z2) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (y2 || u2 == composer$Companion$Empty$1) {
                u2 = t.g(ThemeViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            ThemeViewModel themeViewModel = (ThemeViewModel) u2;
            Scope q3 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y3 = t.y(g2, false, 511388516, null) | g2.I(q3);
            Object u3 = g2.u();
            if (y3 || u3 == composer$Companion$Empty$1) {
                u3 = t.g(IAPViewModel.class, q3, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            IAPState iAPState2 = (IAPState) t.f((IAPViewModel) u3, g2, 8);
            Scope q4 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y4 = t.y(g2, false, 511388516, null) | g2.I(q4);
            Object u4 = g2.u();
            if (y4 || u4 == composer$Companion$Empty$1) {
                u4 = t.g(PaywallNavigationViewModel.class, q4, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            Modifier.Companion companion3 = Modifier.Companion.f14687a;
            Modifier c2 = ClickableKt.c(companion3, false, null, new ItemThemeKt$ItemTheme$1(iAPState2, themeViewModel, gamePadTheme, (PaywallNavigationViewModel) u4), 7);
            ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, g2, 0);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, c2);
            ComposeUiNode.h8.getClass();
            a aVar2 = ComposeUiNode.Companion.f15895b;
            Applier applier3 = g2.f13691a;
            if (!(applier3 instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar2);
            } else {
                g2.n();
            }
            p pVar4 = ComposeUiNode.Companion.f15898g;
            Updater.b(g2, a2, pVar4);
            p pVar5 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar5);
            p pVar6 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar6);
            }
            p pVar7 = ComposeUiNode.Companion.d;
            Updater.b(g2, c3, pVar7);
            MeasurePolicy e = BoxKt.e(Alignment.Companion.e, false);
            int i5 = g2.P;
            PersistentCompositionLocalMap Q2 = g2.Q();
            Modifier c4 = ComposedModifierKt.c(g2, companion3);
            if (!(applier3 instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar2);
            } else {
                g2.n();
            }
            Updater.b(g2, e, pVar4);
            Updater.b(g2, Q2, pVar5);
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar6);
            }
            Updater.b(g2, c4, pVar7);
            boolean lock = gamePadTheme.getLock();
            ContentScale$Companion$FillWidth$1 contentScale$Companion$FillWidth$1 = ContentScale.Companion.d;
            if (!lock || iAPState2.isPremium()) {
                pVar = pVar5;
                pVar2 = pVar6;
                aVar = aVar2;
                iAPState = iAPState2;
                pVar3 = pVar4;
                th = null;
                g2.J(-489325347);
                companion = companion3;
                applier = applier3;
                ImageKt.a(PainterResources_androidKt.a(gamePadTheme.getIconResId(), g2, 0), null, ClipKt.a(SizeKt.d(companion3, 1.0f), RoundedCornerShapeKt.a(16)), null, contentScale$Companion$FillWidth$1, 0.0f, null, g2, 24632, 104);
                g2.V(false);
            } else {
                g2.J(-489932637);
                if (Build.VERSION.SDK_INT < 31) {
                    g2.J(-489880867);
                    LegacyBlurImage(gamePadTheme.getIconResId(), 25.0f, g2, 48);
                    g2.V(false);
                    z3 = false;
                    pVar = pVar5;
                    pVar2 = pVar6;
                    applier2 = applier3;
                    aVar = aVar2;
                    companion2 = companion3;
                    iAPState = iAPState2;
                    pVar3 = pVar4;
                    th = null;
                } else {
                    g2.J(-489787960);
                    pVar = pVar5;
                    pVar2 = pVar6;
                    applier2 = applier3;
                    aVar = aVar2;
                    companion2 = companion3;
                    iAPState = iAPState2;
                    pVar3 = pVar4;
                    th = null;
                    ImageKt.a(PainterResources_androidKt.a(gamePadTheme.getIconResId(), g2, 0), null, BlurKt.a(ClipKt.a(SizeKt.d(companion3, 1.0f), RoundedCornerShapeKt.a(16)), 8), null, contentScale$Companion$FillWidth$1, 0.0f, null, g2, 24632, 104);
                    z3 = false;
                    g2.V(false);
                }
                g2.V(z3);
                applier = applier2;
                companion = companion2;
            }
            g2.J(1785342770);
            boolean lock2 = gamePadTheme.getLock();
            ContentScale$Companion$FillBounds$1 contentScale$Companion$FillBounds$1 = ContentScale.Companion.f15724g;
            if (lock2 && !iAPState.isPremium()) {
                ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getLock(), g2, 6), null, SizeKt.n(companion, 40), null, contentScale$Companion$FillBounds$1, 0.0f, null, g2, 25016, 104);
            }
            g2.V(false);
            g2.V(true);
            SpacerKt.a(SizeKt.e(companion, 12), g2);
            RowMeasurePolicy a3 = RowKt.a(Arrangement.f3772a, Alignment.Companion.f14666j, g2, 0);
            int i6 = g2.P;
            PersistentCompositionLocalMap Q3 = g2.Q();
            Modifier c5 = ComposedModifierKt.c(g2, companion);
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw th;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, a3, pVar3);
            Updater.b(g2, Q3, pVar);
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i6))) {
                d.x(i6, g2, i6, pVar2);
            }
            Updater.b(g2, c5, pVar7);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f4094a;
            Modifier.Companion companion4 = companion;
            TextKt.b(gamePadTheme.getTitle(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(Color.f14958c, TextUnitKt.b(16), new FontWeight(600), MyFonts.INSTANCE.getNotoSans(), 0L, null, 3, 0L, 16744408), g2, 0, 0, 65534);
            SpacerKt.a(rowScopeInstance.a(companion4, 1.0f, true), g2);
            MyImages myImages = MyImages.INSTANCE;
            ImageKt.a(PainterResources_androidKt.a(z2 ? myImages.getRadio1() : myImages.getRadio2(), g2, 0), null, SizeKt.n(companion4, 24), null, contentScale$Companion$FillBounds$1, 0.0f, null, g2, 25016, 104);
            g2.V(true);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ItemThemeKt$ItemTheme$3(gamePadTheme, z2, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void LegacyBlurImage(int i2, float f2, Composer composer, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(-332735507);
        if ((i3 & 14) == 0) {
            i4 = (g2.c(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            i4 |= g2.b(f2) ? 32 : 16;
        }
        if ((i4 & 91) == 18 && g2.i()) {
            g2.A();
        } else {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.f16325b;
            Bitmap decodeResource = BitmapFactory.decodeResource(((Context) g2.K(staticProvidableCompositionLocal)).getResources(), i2);
            RenderScript create = RenderScript.create((Context) g2.K(staticProvidableCompositionLocal));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, decodeResource);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, createFromBitmap.getElement());
            create2.setRadius(f2);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap);
            createFromBitmap.copyTo(decodeResource);
            create.destroy();
            p0.a.p(decodeResource);
            ImageKt.b(new AndroidImageBitmap(decodeResource), ClipKt.a(SizeKt.d(Modifier.Companion.f14687a, 1.0f), RoundedCornerShapeKt.a(16)), ContentScale.Companion.d, g2, 24632);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ItemThemeKt$LegacyBlurImage$2(i2, f2, i3);
        }
    }
}

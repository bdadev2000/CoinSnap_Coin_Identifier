package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import android.content.Context;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.features.home.utils.GameUtils;
import com.cooldev.gba.emulator.gameboy.features.home.utils.TextDrawable;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import g.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import p0.a;
import q.h;
import q.j;

/* loaded from: classes2.dex */
public final class PreviewImageCardKt {
    @Composable
    public static final void PreviewImageCard(@NotNull Game game, @NotNull Orientation orientation, @Nullable Composer composer, int i2) {
        Modifier a2;
        a.s(game, "data");
        a.s(orientation, "orientation");
        ComposerImpl g2 = composer.g(-55733749);
        String id = game.getId();
        g2.J(201187551);
        boolean I = g2.I(id);
        Object u2 = g2.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = GameUtils.INSTANCE.getFallbackDrawable(game);
            g2.o(u2);
        }
        g2.V(false);
        Painter rememberDrawablePainter = DrawablePainterKt.rememberDrawablePainter((TextDrawable) u2, g2, 8);
        h hVar = new h((Context) g2.K(AndroidCompositionLocals_androidKt.f16325b));
        hVar.f31271c = game.getCoverFrontUrl();
        j a3 = hVar.a();
        String id2 = game.getId();
        Orientation orientation2 = Orientation.f3394a;
        Modifier.Companion companion = Modifier.Companion.f14687a;
        if (orientation == orientation2) {
            float f2 = 80;
            a2 = ClipKt.a(SizeKt.e(SizeKt.r(companion, f2), f2), RoundedCornerShapeKt.b(8));
        } else {
            float f3 = 8;
            a2 = ClipKt.a(SizeKt.e(SizeKt.d(companion, 1.0f), Opcodes.F2I), RoundedCornerShapeKt.c(f3, f3));
        }
        g0.a(a3, id2, a2, rememberDrawablePainter, rememberDrawablePainter, rememberDrawablePainter, g2, 299016, 64448);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new PreviewImageCardKt$PreviewImageCard$1(game, orientation, i2);
        }
    }
}

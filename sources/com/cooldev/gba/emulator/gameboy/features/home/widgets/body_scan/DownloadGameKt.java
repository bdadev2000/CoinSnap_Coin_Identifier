package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_scan;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import com.cooldev.gba.emulator.gameboy.extensions.DebounceExtensionsKt;
import com.safedk.android.internal.d;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class DownloadGameKt {
    @ComposableTarget
    @Composable
    public static final void DownloadGame(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1873467695);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            long b2 = TextUnitKt.b(18);
            long b3 = TextUnitKt.b(28);
            FontFamily inter = MyFonts.INSTANCE.getInter();
            TextKt.b("Download load game", DebounceExtensionsKt.debouncedClickable$default(Modifier.Companion.f14687a, false, 0L, DownloadGameKt$DownloadGame$1.INSTANCE, 3, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(MyColors.INSTANCE.m36getText60d7_KjU(), b2, new FontWeight(d.f29936c), inter, 0L, TextDecoration.f17465c, 3, b3, 16609240), g2, 6, 0, 65532);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DownloadGameKt$DownloadGame$2(i2);
        }
    }
}

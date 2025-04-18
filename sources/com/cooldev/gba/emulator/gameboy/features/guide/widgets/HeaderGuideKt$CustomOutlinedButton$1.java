package com.cooldev.gba.emulator.gameboy.features.guide.widgets;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import d0.b0;
import java.util.Locale;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.q;

/* loaded from: classes2.dex */
public final class HeaderGuideKt$CustomOutlinedButton$1 extends r implements q {
    final /* synthetic */ long $color;
    final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderGuideKt$CustomOutlinedButton$1(String str, long j2) {
        super(3);
        this.$text = str;
        this.$color = j2;
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer, int i2) {
        a.s(rowScope, "$this$OutlinedButton");
        if ((i2 & 81) == 16 && composer.i()) {
            composer.A();
            return;
        }
        String upperCase = this.$text.toUpperCase(Locale.ROOT);
        a.r(upperCase, "toUpperCase(...)");
        long b2 = TextUnitKt.b(16);
        long b3 = TextUnitKt.b(24);
        FontFamily inter = MyFonts.INSTANCE.getInter();
        TextKt.b(upperCase, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(this.$color, b2, FontWeight.f17272l, inter, 0L, null, 3, b3, 16613336), composer, 0, 0, 65534);
    }
}

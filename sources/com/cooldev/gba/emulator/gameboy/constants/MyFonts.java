package com.cooldev.gba.emulator.gameboy.constants;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontWeight;
import com.cooldev.gba.emulator.gameboy.R;
import e0.q;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
/* loaded from: classes2.dex */
public final class MyFonts {
    public static final int $stable = 0;

    @NotNull
    public static final MyFonts INSTANCE = new MyFonts();

    @NotNull
    private static final FontFamily determinationSans;

    @NotNull
    private static final FontFamily inter;

    @NotNull
    private static final FontFamily notoSans;

    static {
        int i2 = R.font.inter_bold;
        FontWeight fontWeight = FontWeight.f17272l;
        int i3 = R.font.inter_regular;
        FontWeight fontWeight2 = FontWeight.f17269i;
        inter = new FontListFontFamily(q.J(new Font[]{FontKt.a(R.font.inter_thin, FontWeight.f17267g), FontKt.a(i2, fontWeight), FontKt.a(R.font.inter_light, FontWeight.f17268h), FontKt.a(R.font.inter_medium, FontWeight.f17270j), FontKt.a(i3, fontWeight2)}));
        determinationSans = new FontListFontFamily(q.J(new Font[]{FontKt.a(R.font.svn_determination_sans, fontWeight2)}));
        notoSans = new FontListFontFamily(q.J(new Font[]{FontKt.a(R.font.noto_sans_bold, fontWeight)}));
    }

    private MyFonts() {
    }

    @NotNull
    public final FontFamily getDeterminationSans() {
        return determinationSans;
    }

    @NotNull
    public final FontFamily getInter() {
        return inter;
    }

    @NotNull
    public final FontFamily getNotoSans() {
        return notoSans;
    }
}

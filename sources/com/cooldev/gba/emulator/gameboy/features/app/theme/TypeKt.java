package com.cooldev.gba.emulator.gameboy.features.app.theme;

import androidx.compose.material3.Typography;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.DefaultFontFamily;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class TypeKt {

    @NotNull
    private static final Typography Typography;

    static {
        DefaultFontFamily defaultFontFamily = FontFamily.f17224a;
        FontWeight fontWeight = FontWeight.f17269i;
        Typography = new Typography(new TextStyle(0L, TextUnitKt.b(16), fontWeight, defaultFontFamily, TextUnitKt.a(0.5d), null, 0, TextUnitKt.b(24), 16645977), 32255);
    }

    @NotNull
    public static final Typography getTypography() {
        return Typography;
    }
}

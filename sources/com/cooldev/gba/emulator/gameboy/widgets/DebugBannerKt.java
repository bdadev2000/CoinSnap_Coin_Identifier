package com.cooldev.gba.emulator.gameboy.widgets;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import com.facebook.internal.AnalyticsEvents;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes2.dex */
public final class DebugBannerKt {
    @NotNull
    /* renamed from: debugBanner-XO-JAsU, reason: not valid java name */
    public static final Modifier m390debugBannerXOJAsU(@NotNull Modifier modifier, @NotNull String str, long j2, @NotNull TextStyle textStyle, float f2) {
        a.s(modifier, "$this$debugBanner");
        a.s(str, "text");
        a.s(textStyle, AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE);
        return ComposedModifierKt.a(modifier, new DebugBannerKt$debugBanner$1(str, textStyle, f2, j2));
    }
}

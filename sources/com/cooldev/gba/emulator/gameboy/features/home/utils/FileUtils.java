package com.cooldev.gba.emulator.gameboy.features.home.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p0.a;
import z0.m;

@StabilityInferred
/* loaded from: classes3.dex */
public final class FileUtils {
    public static final int $stable = 0;

    @NotNull
    public static final FileUtils INSTANCE = new FileUtils();

    private FileUtils() {
    }

    @NotNull
    public final String discardExtension(@NotNull String str) {
        a.s(str, "fileName");
        return m.w1(str);
    }

    @NotNull
    public final String extractExtension(@NotNull String str) {
        String substring;
        a.s(str, "fileName");
        int b12 = m.b1(str, ".", 6);
        if (b12 == -1) {
            substring = "";
        } else {
            substring = str.substring(1 + b12, str.length());
            a.r(substring, "substring(...)");
        }
        Locale locale = Locale.US;
        a.r(locale, "US");
        String lowerCase = substring.toLowerCase(locale);
        a.r(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}

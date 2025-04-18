package org.koin.ext;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import p0.a;
import z0.m;
import z0.n;

/* loaded from: classes2.dex */
public final class StringExtKt {
    @NotNull
    public static final String clearQuotes(@NotNull String str) {
        a.s(str, "<this>");
        if (str.length() <= 1) {
            return str;
        }
        if (str.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (str.charAt(0) != '\"' || n.z1(str) != '\"') {
            return str;
        }
        String substring = str.substring(1, m.T0(str));
        a.r(substring, "substring(...)");
        return substring;
    }
}

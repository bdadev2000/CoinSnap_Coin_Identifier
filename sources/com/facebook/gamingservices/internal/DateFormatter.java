package com.facebook.gamingservices.internal;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes3.dex */
public final class DateFormatter {

    @NotNull
    public static final DateFormatter INSTANCE = new DateFormatter();

    private DateFormatter() {
    }

    @Nullable
    public final ZonedDateTime format$facebook_gamingservices_release(@NotNull String str) {
        a.s(str, "isoDate");
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssZ");
        a.r(ofPattern, "ofPattern(\"yyyy-MM-dd'T'HH:mm:ssZ\")");
        return ZonedDateTime.parse(str, ofPattern);
    }
}

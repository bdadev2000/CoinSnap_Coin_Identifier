package com.facebook.gamingservices.model;

import android.support.v4.media.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes4.dex */
public final class CustomUpdateMediaInfo {

    @NotNull
    private final String url;

    public CustomUpdateMediaInfo(@NotNull String str) {
        a.s(str, "url");
        this.url = str;
    }

    public static /* synthetic */ CustomUpdateMediaInfo copy$default(CustomUpdateMediaInfo customUpdateMediaInfo, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = customUpdateMediaInfo.url;
        }
        return customUpdateMediaInfo.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.url;
    }

    @NotNull
    public final CustomUpdateMediaInfo copy(@NotNull String str) {
        a.s(str, "url");
        return new CustomUpdateMediaInfo(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CustomUpdateMediaInfo) && a.g(this.url, ((CustomUpdateMediaInfo) obj).url);
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    @NotNull
    public String toString() {
        return d.q(new StringBuilder("CustomUpdateMediaInfo(url="), this.url, ')');
    }
}

package com.cooldev.gba.emulator.gameboy.network.models;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.safedk.android.analytics.brandsafety.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class Accessory {
    public static final int $stable = 0;

    @NotNull
    private final String alt_text;

    @NotNull
    private final String image_url;

    @NotNull
    private final String type;

    public Accessory(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        a.s(str, "type");
        a.s(str2, c.f29374h);
        a.s(str3, "alt_text");
        this.type = str;
        this.image_url = str2;
        this.alt_text = str3;
    }

    public static /* synthetic */ Accessory copy$default(Accessory accessory, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = accessory.type;
        }
        if ((i2 & 2) != 0) {
            str2 = accessory.image_url;
        }
        if ((i2 & 4) != 0) {
            str3 = accessory.alt_text;
        }
        return accessory.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.image_url;
    }

    @NotNull
    public final String component3() {
        return this.alt_text;
    }

    @NotNull
    public final Accessory copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        a.s(str, "type");
        a.s(str2, c.f29374h);
        a.s(str3, "alt_text");
        return new Accessory(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Accessory)) {
            return false;
        }
        Accessory accessory = (Accessory) obj;
        return a.g(this.type, accessory.type) && a.g(this.image_url, accessory.image_url) && a.g(this.alt_text, accessory.alt_text);
    }

    @NotNull
    public final String getAlt_text() {
        return this.alt_text;
    }

    @NotNull
    public final String getImage_url() {
        return this.image_url;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.alt_text.hashCode() + androidx.compose.foundation.text.input.a.b(this.image_url, this.type.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Accessory(type=");
        sb.append(this.type);
        sb.append(", image_url=");
        sb.append(this.image_url);
        sb.append(", alt_text=");
        return d.q(sb, this.alt_text, ')');
    }
}

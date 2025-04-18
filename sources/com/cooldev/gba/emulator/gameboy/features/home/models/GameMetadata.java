package com.cooldev.gba.emulator.gameboy.features.home.models;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class GameMetadata {
    public static final int $stable = 0;

    @Nullable
    private final String developer;

    @Nullable
    private final String name;

    @Nullable
    private final String romName;

    @Nullable
    private final String system;

    @Nullable
    private final String thumbnail;

    public GameMetadata(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.name = str;
        this.system = str2;
        this.romName = str3;
        this.developer = str4;
        this.thumbnail = str5;
    }

    public static /* synthetic */ GameMetadata copy$default(GameMetadata gameMetadata, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gameMetadata.name;
        }
        if ((i2 & 2) != 0) {
            str2 = gameMetadata.system;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = gameMetadata.romName;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = gameMetadata.developer;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = gameMetadata.thumbnail;
        }
        return gameMetadata.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final String component2() {
        return this.system;
    }

    @Nullable
    public final String component3() {
        return this.romName;
    }

    @Nullable
    public final String component4() {
        return this.developer;
    }

    @Nullable
    public final String component5() {
        return this.thumbnail;
    }

    @NotNull
    public final GameMetadata copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        return new GameMetadata(str, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameMetadata)) {
            return false;
        }
        GameMetadata gameMetadata = (GameMetadata) obj;
        return a.g(this.name, gameMetadata.name) && a.g(this.system, gameMetadata.system) && a.g(this.romName, gameMetadata.romName) && a.g(this.developer, gameMetadata.developer) && a.g(this.thumbnail, gameMetadata.thumbnail);
    }

    @Nullable
    public final String getDeveloper() {
        return this.developer;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getRomName() {
        return this.romName;
    }

    @Nullable
    public final String getSystem() {
        return this.system;
    }

    @Nullable
    public final String getThumbnail() {
        return this.thumbnail;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.system;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.romName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.developer;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.thumbnail;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GameMetadata(name=");
        sb.append(this.name);
        sb.append(", system=");
        sb.append(this.system);
        sb.append(", romName=");
        sb.append(this.romName);
        sb.append(", developer=");
        sb.append(this.developer);
        sb.append(", thumbnail=");
        return d.q(sb, this.thumbnail, ')');
    }
}

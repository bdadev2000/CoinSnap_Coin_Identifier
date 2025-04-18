package com.cooldev.gba.emulator.gameboy.local.storage;

import android.support.v4.media.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class GameDistinct {

    @Nullable
    private final String developer;

    @NotNull
    private final String gameTitle;

    @Nullable
    private final String thumbnail;

    public GameDistinct(@Nullable String str, @NotNull String str2, @Nullable String str3) {
        a.s(str2, "gameTitle");
        this.developer = str;
        this.gameTitle = str2;
        this.thumbnail = str3;
    }

    public static /* synthetic */ GameDistinct copy$default(GameDistinct gameDistinct, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gameDistinct.developer;
        }
        if ((i2 & 2) != 0) {
            str2 = gameDistinct.gameTitle;
        }
        if ((i2 & 4) != 0) {
            str3 = gameDistinct.thumbnail;
        }
        return gameDistinct.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.developer;
    }

    @NotNull
    public final String component2() {
        return this.gameTitle;
    }

    @Nullable
    public final String component3() {
        return this.thumbnail;
    }

    @NotNull
    public final GameDistinct copy(@Nullable String str, @NotNull String str2, @Nullable String str3) {
        a.s(str2, "gameTitle");
        return new GameDistinct(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameDistinct)) {
            return false;
        }
        GameDistinct gameDistinct = (GameDistinct) obj;
        return a.g(this.developer, gameDistinct.developer) && a.g(this.gameTitle, gameDistinct.gameTitle) && a.g(this.thumbnail, gameDistinct.thumbnail);
    }

    @Nullable
    public final String getDeveloper() {
        return this.developer;
    }

    @NotNull
    public final String getGameTitle() {
        return this.gameTitle;
    }

    @Nullable
    public final String getThumbnail() {
        return this.thumbnail;
    }

    public int hashCode() {
        String str = this.developer;
        int b2 = androidx.compose.foundation.text.input.a.b(this.gameTitle, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.thumbnail;
        return b2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GameDistinct(developer=");
        sb.append(this.developer);
        sb.append(", gameTitle=");
        sb.append(this.gameTitle);
        sb.append(", thumbnail=");
        return d.q(sb, this.thumbnail, ')');
    }
}

package com.cooldev.gba.emulator.gameboy.db.entity;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
@Entity
/* loaded from: classes3.dex */
public final class GameRom {
    public static final int $stable = 0;

    @ColumnInfo
    @Nullable
    private final String crc32;

    @ColumnInfo
    @Nullable
    private final String developer;

    @PrimaryKey
    @ColumnInfo
    private final int id;

    @ColumnInfo
    @Nullable
    private final String name;

    @ColumnInfo
    @Nullable
    private final String romName;

    @ColumnInfo
    @Nullable
    private final String serial;

    @ColumnInfo
    @Nullable
    private final String system;

    public GameRom(int i2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.id = i2;
        this.name = str;
        this.system = str2;
        this.romName = str3;
        this.developer = str4;
        this.crc32 = str5;
        this.serial = str6;
    }

    public static /* synthetic */ GameRom copy$default(GameRom gameRom, int i2, String str, String str2, String str3, String str4, String str5, String str6, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = gameRom.id;
        }
        if ((i3 & 2) != 0) {
            str = gameRom.name;
        }
        String str7 = str;
        if ((i3 & 4) != 0) {
            str2 = gameRom.system;
        }
        String str8 = str2;
        if ((i3 & 8) != 0) {
            str3 = gameRom.romName;
        }
        String str9 = str3;
        if ((i3 & 16) != 0) {
            str4 = gameRom.developer;
        }
        String str10 = str4;
        if ((i3 & 32) != 0) {
            str5 = gameRom.crc32;
        }
        String str11 = str5;
        if ((i3 & 64) != 0) {
            str6 = gameRom.serial;
        }
        return gameRom.copy(i2, str7, str8, str9, str10, str11, str6);
    }

    public final int component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final String component3() {
        return this.system;
    }

    @Nullable
    public final String component4() {
        return this.romName;
    }

    @Nullable
    public final String component5() {
        return this.developer;
    }

    @Nullable
    public final String component6() {
        return this.crc32;
    }

    @Nullable
    public final String component7() {
        return this.serial;
    }

    @NotNull
    public final GameRom copy(int i2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new GameRom(i2, str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameRom)) {
            return false;
        }
        GameRom gameRom = (GameRom) obj;
        return this.id == gameRom.id && a.g(this.name, gameRom.name) && a.g(this.system, gameRom.system) && a.g(this.romName, gameRom.romName) && a.g(this.developer, gameRom.developer) && a.g(this.crc32, gameRom.crc32) && a.g(this.serial, gameRom.serial);
    }

    @Nullable
    public final String getCrc32() {
        return this.crc32;
    }

    @Nullable
    public final String getDeveloper() {
        return this.developer;
    }

    public final int getId() {
        return this.id;
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
    public final String getSerial() {
        return this.serial;
    }

    @Nullable
    public final String getSystem() {
        return this.system;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.system;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.romName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.developer;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.crc32;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.serial;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GameRom(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", system=");
        sb.append(this.system);
        sb.append(", romName=");
        sb.append(this.romName);
        sb.append(", developer=");
        sb.append(this.developer);
        sb.append(", crc32=");
        sb.append(this.crc32);
        sb.append(", serial=");
        return d.q(sb, this.serial, ')');
    }
}

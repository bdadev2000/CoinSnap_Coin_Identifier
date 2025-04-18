package com.cooldev.gba.emulator.gameboy.network.models;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class BlockText {
    public static final int $stable = 0;

    @NotNull
    private final String text;

    @NotNull
    private final String type;

    public BlockText(@NotNull String str, @NotNull String str2) {
        a.s(str, "type");
        a.s(str2, "text");
        this.type = str;
        this.text = str2;
    }

    public static /* synthetic */ BlockText copy$default(BlockText blockText, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = blockText.type;
        }
        if ((i2 & 2) != 0) {
            str2 = blockText.text;
        }
        return blockText.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.text;
    }

    @NotNull
    public final BlockText copy(@NotNull String str, @NotNull String str2) {
        a.s(str, "type");
        a.s(str2, "text");
        return new BlockText(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockText)) {
            return false;
        }
        BlockText blockText = (BlockText) obj;
        return a.g(this.type, blockText.type) && a.g(this.text, blockText.text);
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.type.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("BlockText(type=");
        sb.append(this.type);
        sb.append(", text=");
        return d.q(sb, this.text, ')');
    }
}

package com.cooldev.gba.emulator.gameboy.features.game_pad.config;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class CrossContentDescription {
    public static final int $stable = 0;

    @NotNull
    private final String baseName;

    @NotNull
    private final String down;

    @NotNull
    private final String left;

    @NotNull
    private final String right;

    @NotNull
    private final String up;

    public CrossContentDescription() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CrossContentDescription copy$default(CrossContentDescription crossContentDescription, String str, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = crossContentDescription.baseName;
        }
        if ((i2 & 2) != 0) {
            str2 = crossContentDescription.up;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = crossContentDescription.down;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = crossContentDescription.left;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = crossContentDescription.right;
        }
        return crossContentDescription.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.baseName;
    }

    @NotNull
    public final String component2() {
        return this.up;
    }

    @NotNull
    public final String component3() {
        return this.down;
    }

    @NotNull
    public final String component4() {
        return this.left;
    }

    @NotNull
    public final String component5() {
        return this.right;
    }

    @NotNull
    public final CrossContentDescription copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        a.s(str, "baseName");
        a.s(str2, "up");
        a.s(str3, "down");
        a.s(str4, ViewHierarchyConstants.DIMENSION_LEFT_KEY);
        a.s(str5, "right");
        return new CrossContentDescription(str, str2, str3, str4, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrossContentDescription)) {
            return false;
        }
        CrossContentDescription crossContentDescription = (CrossContentDescription) obj;
        return a.g(this.baseName, crossContentDescription.baseName) && a.g(this.up, crossContentDescription.up) && a.g(this.down, crossContentDescription.down) && a.g(this.left, crossContentDescription.left) && a.g(this.right, crossContentDescription.right);
    }

    @NotNull
    public final String getBaseName() {
        return this.baseName;
    }

    @NotNull
    public final String getDown() {
        return this.down;
    }

    @NotNull
    public final String getLeft() {
        return this.left;
    }

    @NotNull
    public final String getRight() {
        return this.right;
    }

    @NotNull
    public final String getUp() {
        return this.up;
    }

    public int hashCode() {
        return this.right.hashCode() + androidx.compose.foundation.text.input.a.b(this.left, androidx.compose.foundation.text.input.a.b(this.down, androidx.compose.foundation.text.input.a.b(this.up, this.baseName.hashCode() * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CrossContentDescription(baseName=");
        sb.append(this.baseName);
        sb.append(", up=");
        sb.append(this.up);
        sb.append(", down=");
        sb.append(this.down);
        sb.append(", left=");
        sb.append(this.left);
        sb.append(", right=");
        return d.q(sb, this.right, ')');
    }

    public CrossContentDescription(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        a.s(str, "baseName");
        a.s(str2, "up");
        a.s(str3, "down");
        a.s(str4, ViewHierarchyConstants.DIMENSION_LEFT_KEY);
        a.s(str5, "right");
        this.baseName = str;
        this.up = str2;
        this.down = str3;
        this.left = str4;
        this.right = str5;
    }

    public /* synthetic */ CrossContentDescription(String str, String str2, String str3, String str4, String str5, int i2, k kVar) {
        this((i2 & 1) != 0 ? "d-pad" : str, (i2 & 2) != 0 ? "up" : str2, (i2 & 4) != 0 ? "down" : str3, (i2 & 8) != 0 ? ViewHierarchyConstants.DIMENSION_LEFT_KEY : str4, (i2 & 16) != 0 ? "right" : str5);
    }
}

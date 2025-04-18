package com.cooldev.gba.emulator.gameboy.features.game.models;

import android.graphics.Bitmap;
import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class StateEntry {
    public static final int $stable = 8;

    @NotNull
    private final String description;
    private final boolean enabled;

    @Nullable
    private final Bitmap preview;

    @NotNull
    private final String title;

    public StateEntry(@NotNull String str, @NotNull String str2, boolean z2, @Nullable Bitmap bitmap) {
        a.s(str, "title");
        a.s(str2, "description");
        this.title = str;
        this.description = str2;
        this.enabled = z2;
        this.preview = bitmap;
    }

    public static /* synthetic */ StateEntry copy$default(StateEntry stateEntry, String str, String str2, boolean z2, Bitmap bitmap, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = stateEntry.title;
        }
        if ((i2 & 2) != 0) {
            str2 = stateEntry.description;
        }
        if ((i2 & 4) != 0) {
            z2 = stateEntry.enabled;
        }
        if ((i2 & 8) != 0) {
            bitmap = stateEntry.preview;
        }
        return stateEntry.copy(str, str2, z2, bitmap);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @NotNull
    public final String component2() {
        return this.description;
    }

    public final boolean component3() {
        return this.enabled;
    }

    @Nullable
    public final Bitmap component4() {
        return this.preview;
    }

    @NotNull
    public final StateEntry copy(@NotNull String str, @NotNull String str2, boolean z2, @Nullable Bitmap bitmap) {
        a.s(str, "title");
        a.s(str2, "description");
        return new StateEntry(str, str2, z2, bitmap);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StateEntry)) {
            return false;
        }
        StateEntry stateEntry = (StateEntry) obj;
        return a.g(this.title, stateEntry.title) && a.g(this.description, stateEntry.description) && this.enabled == stateEntry.enabled && a.g(this.preview, stateEntry.preview);
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final Bitmap getPreview() {
        return this.preview;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int g2 = d.g(this.enabled, androidx.compose.foundation.text.input.a.b(this.description, this.title.hashCode() * 31, 31), 31);
        Bitmap bitmap = this.preview;
        return g2 + (bitmap == null ? 0 : bitmap.hashCode());
    }

    @NotNull
    public String toString() {
        return "StateEntry(title=" + this.title + ", description=" + this.description + ", enabled=" + this.enabled + ", preview=" + this.preview + ')';
    }
}

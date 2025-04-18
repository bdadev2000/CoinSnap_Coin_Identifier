package com.cooldev.gba.emulator.gameboy.features.game_pad.accessibility;

import android.graphics.Rect;
import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class AccessibilityBox {
    public static final int $stable = 8;

    @NotNull
    private final Rect rect;

    @NotNull
    private final String text;

    public AccessibilityBox(@NotNull Rect rect, @NotNull String str) {
        a.s(rect, "rect");
        a.s(str, "text");
        this.rect = rect;
        this.text = str;
    }

    public static /* synthetic */ AccessibilityBox copy$default(AccessibilityBox accessibilityBox, Rect rect, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            rect = accessibilityBox.rect;
        }
        if ((i2 & 2) != 0) {
            str = accessibilityBox.text;
        }
        return accessibilityBox.copy(rect, str);
    }

    @NotNull
    public final Rect component1() {
        return this.rect;
    }

    @NotNull
    public final String component2() {
        return this.text;
    }

    @NotNull
    public final AccessibilityBox copy(@NotNull Rect rect, @NotNull String str) {
        a.s(rect, "rect");
        a.s(str, "text");
        return new AccessibilityBox(rect, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityBox)) {
            return false;
        }
        AccessibilityBox accessibilityBox = (AccessibilityBox) obj;
        return a.g(this.rect, accessibilityBox.rect) && a.g(this.text, accessibilityBox.text);
    }

    @NotNull
    public final Rect getRect() {
        return this.rect;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return this.text.hashCode() + (this.rect.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityBox(rect=");
        sb.append(this.rect);
        sb.append(", text=");
        return d.q(sb, this.text, ')');
    }
}

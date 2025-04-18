package com.cooldev.gba.emulator.gameboy.features.game_pad.config;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.GestureType;
import com.cooldev.gba.emulator.gameboy.features.themenew.enums.GamePadTheme;
import e0.y;
import java.util.Set;
import k0.a;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes2.dex */
public final class CrossConfig {
    public static final int $stable = 8;

    @NotNull
    private final CrossContentDescription contentDescription;

    @Nullable
    private final GamePadTheme gamePadTheme;
    private final int id;

    @Nullable
    private final Integer rightDrawableForegroundId;

    @NotNull
    private final Shape shape;

    @NotNull
    private final Set<GestureType> supportsGestures;

    @Nullable
    private final RadialGamePadTheme theme;
    private final boolean useDiagonals;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Shape {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Shape[] $VALUES;
        public static final Shape STANDARD = new Shape("STANDARD", 0);
        public static final Shape CIRCLE = new Shape("CIRCLE", 1);

        private static final /* synthetic */ Shape[] $values() {
            return new Shape[]{STANDARD, CIRCLE};
        }

        static {
            Shape[] $values = $values();
            $VALUES = $values;
            $ENTRIES = f0.l($values);
        }

        private Shape(String str, int i2) {
        }

        @NotNull
        public static a getEntries() {
            return $ENTRIES;
        }

        public static Shape valueOf(String str) {
            return (Shape) Enum.valueOf(Shape.class, str);
        }

        public static Shape[] values() {
            return (Shape[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CrossConfig(int i2, @NotNull Shape shape, @Nullable Integer num, @NotNull Set<? extends GestureType> set, @NotNull CrossContentDescription crossContentDescription, boolean z2, @Nullable RadialGamePadTheme radialGamePadTheme, @Nullable GamePadTheme gamePadTheme) {
        p0.a.s(shape, "shape");
        p0.a.s(set, "supportsGestures");
        p0.a.s(crossContentDescription, "contentDescription");
        this.id = i2;
        this.shape = shape;
        this.rightDrawableForegroundId = num;
        this.supportsGestures = set;
        this.contentDescription = crossContentDescription;
        this.useDiagonals = z2;
        this.theme = radialGamePadTheme;
        this.gamePadTheme = gamePadTheme;
    }

    public final int component1() {
        return this.id;
    }

    @NotNull
    public final Shape component2() {
        return this.shape;
    }

    @Nullable
    public final Integer component3() {
        return this.rightDrawableForegroundId;
    }

    @NotNull
    public final Set<GestureType> component4() {
        return this.supportsGestures;
    }

    @NotNull
    public final CrossContentDescription component5() {
        return this.contentDescription;
    }

    public final boolean component6() {
        return this.useDiagonals;
    }

    @Nullable
    public final RadialGamePadTheme component7() {
        return this.theme;
    }

    @Nullable
    public final GamePadTheme component8() {
        return this.gamePadTheme;
    }

    @NotNull
    public final CrossConfig copy(int i2, @NotNull Shape shape, @Nullable Integer num, @NotNull Set<? extends GestureType> set, @NotNull CrossContentDescription crossContentDescription, boolean z2, @Nullable RadialGamePadTheme radialGamePadTheme, @Nullable GamePadTheme gamePadTheme) {
        p0.a.s(shape, "shape");
        p0.a.s(set, "supportsGestures");
        p0.a.s(crossContentDescription, "contentDescription");
        return new CrossConfig(i2, shape, num, set, crossContentDescription, z2, radialGamePadTheme, gamePadTheme);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrossConfig)) {
            return false;
        }
        CrossConfig crossConfig = (CrossConfig) obj;
        return this.id == crossConfig.id && this.shape == crossConfig.shape && p0.a.g(this.rightDrawableForegroundId, crossConfig.rightDrawableForegroundId) && p0.a.g(this.supportsGestures, crossConfig.supportsGestures) && p0.a.g(this.contentDescription, crossConfig.contentDescription) && this.useDiagonals == crossConfig.useDiagonals && p0.a.g(this.theme, crossConfig.theme) && this.gamePadTheme == crossConfig.gamePadTheme;
    }

    @NotNull
    public final CrossContentDescription getContentDescription() {
        return this.contentDescription;
    }

    @Nullable
    public final GamePadTheme getGamePadTheme() {
        return this.gamePadTheme;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getRightDrawableForegroundId() {
        return this.rightDrawableForegroundId;
    }

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    @NotNull
    public final Set<GestureType> getSupportsGestures() {
        return this.supportsGestures;
    }

    @Nullable
    public final RadialGamePadTheme getTheme() {
        return this.theme;
    }

    public final boolean getUseDiagonals() {
        return this.useDiagonals;
    }

    public int hashCode() {
        int hashCode = (this.shape.hashCode() + (Integer.hashCode(this.id) * 31)) * 31;
        Integer num = this.rightDrawableForegroundId;
        int g2 = d.g(this.useDiagonals, (this.contentDescription.hashCode() + ((this.supportsGestures.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31, 31);
        RadialGamePadTheme radialGamePadTheme = this.theme;
        int hashCode2 = (g2 + (radialGamePadTheme == null ? 0 : radialGamePadTheme.hashCode())) * 31;
        GamePadTheme gamePadTheme = this.gamePadTheme;
        return hashCode2 + (gamePadTheme != null ? gamePadTheme.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CrossConfig(id=" + this.id + ", shape=" + this.shape + ", rightDrawableForegroundId=" + this.rightDrawableForegroundId + ", supportsGestures=" + this.supportsGestures + ", contentDescription=" + this.contentDescription + ", useDiagonals=" + this.useDiagonals + ", theme=" + this.theme + ", gamePadTheme=" + this.gamePadTheme + ')';
    }

    public /* synthetic */ CrossConfig(int i2, Shape shape, Integer num, Set set, CrossContentDescription crossContentDescription, boolean z2, RadialGamePadTheme radialGamePadTheme, GamePadTheme gamePadTheme, int i3, k kVar) {
        this(i2, (i3 & 2) != 0 ? Shape.STANDARD : shape, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? y.f30220a : set, (i3 & 16) != 0 ? new CrossContentDescription(null, null, null, null, null, 31, null) : crossContentDescription, (i3 & 32) != 0 ? true : z2, (i3 & 64) != 0 ? null : radialGamePadTheme, (i3 & 128) == 0 ? gamePadTheme : null);
    }
}

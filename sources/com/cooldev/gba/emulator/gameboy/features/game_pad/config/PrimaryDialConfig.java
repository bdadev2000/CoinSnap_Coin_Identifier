package com.cooldev.gba.emulator.gameboy.features.game_pad.config;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.GestureType;
import e0.y;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public abstract class PrimaryDialConfig {
    public static final int $stable = 0;

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class Cross extends PrimaryDialConfig {
        public static final int $stable = 8;

        @NotNull
        private final CrossConfig crossConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cross(@NotNull CrossConfig crossConfig) {
            super(null);
            a.s(crossConfig, "crossConfig");
            this.crossConfig = crossConfig;
        }

        public static /* synthetic */ Cross copy$default(Cross cross, CrossConfig crossConfig, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                crossConfig = cross.crossConfig;
            }
            return cross.copy(crossConfig);
        }

        @NotNull
        public final CrossConfig component1() {
            return this.crossConfig;
        }

        @NotNull
        public final Cross copy(@NotNull CrossConfig crossConfig) {
            a.s(crossConfig, "crossConfig");
            return new Cross(crossConfig);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Cross) && a.g(this.crossConfig, ((Cross) obj).crossConfig);
        }

        @NotNull
        public final CrossConfig getCrossConfig() {
            return this.crossConfig;
        }

        public int hashCode() {
            return this.crossConfig.hashCode();
        }

        @NotNull
        public String toString() {
            return "Cross(crossConfig=" + this.crossConfig + ')';
        }
    }

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class PrimaryButtons extends PrimaryDialConfig {
        public static final int $stable = 8;
        private final boolean allowMultiplePressesSingleFinger;

        @Nullable
        private final ButtonConfig center;

        @NotNull
        private final List<ButtonConfig> dials;
        private final float rotationInDegrees;

        @Nullable
        private final RadialGamePadTheme theme;

        public /* synthetic */ PrimaryButtons(List list, ButtonConfig buttonConfig, float f2, boolean z2, RadialGamePadTheme radialGamePadTheme, int i2, k kVar) {
            this(list, (i2 & 2) != 0 ? null : buttonConfig, (i2 & 4) != 0 ? 0.0f : f2, (i2 & 8) != 0 ? true : z2, (i2 & 16) != 0 ? null : radialGamePadTheme);
        }

        public static /* synthetic */ PrimaryButtons copy$default(PrimaryButtons primaryButtons, List list, ButtonConfig buttonConfig, float f2, boolean z2, RadialGamePadTheme radialGamePadTheme, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = primaryButtons.dials;
            }
            if ((i2 & 2) != 0) {
                buttonConfig = primaryButtons.center;
            }
            ButtonConfig buttonConfig2 = buttonConfig;
            if ((i2 & 4) != 0) {
                f2 = primaryButtons.rotationInDegrees;
            }
            float f3 = f2;
            if ((i2 & 8) != 0) {
                z2 = primaryButtons.allowMultiplePressesSingleFinger;
            }
            boolean z3 = z2;
            if ((i2 & 16) != 0) {
                radialGamePadTheme = primaryButtons.theme;
            }
            return primaryButtons.copy(list, buttonConfig2, f3, z3, radialGamePadTheme);
        }

        @NotNull
        public final List<ButtonConfig> component1() {
            return this.dials;
        }

        @Nullable
        public final ButtonConfig component2() {
            return this.center;
        }

        public final float component3() {
            return this.rotationInDegrees;
        }

        public final boolean component4() {
            return this.allowMultiplePressesSingleFinger;
        }

        @Nullable
        public final RadialGamePadTheme component5() {
            return this.theme;
        }

        @NotNull
        public final PrimaryButtons copy(@NotNull List<ButtonConfig> list, @Nullable ButtonConfig buttonConfig, float f2, boolean z2, @Nullable RadialGamePadTheme radialGamePadTheme) {
            a.s(list, "dials");
            return new PrimaryButtons(list, buttonConfig, f2, z2, radialGamePadTheme);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrimaryButtons)) {
                return false;
            }
            PrimaryButtons primaryButtons = (PrimaryButtons) obj;
            return a.g(this.dials, primaryButtons.dials) && a.g(this.center, primaryButtons.center) && Float.compare(this.rotationInDegrees, primaryButtons.rotationInDegrees) == 0 && this.allowMultiplePressesSingleFinger == primaryButtons.allowMultiplePressesSingleFinger && a.g(this.theme, primaryButtons.theme);
        }

        public final boolean getAllowMultiplePressesSingleFinger() {
            return this.allowMultiplePressesSingleFinger;
        }

        @Nullable
        public final ButtonConfig getCenter() {
            return this.center;
        }

        @NotNull
        public final List<ButtonConfig> getDials() {
            return this.dials;
        }

        public final float getRotationInDegrees() {
            return this.rotationInDegrees;
        }

        @Nullable
        public final RadialGamePadTheme getTheme() {
            return this.theme;
        }

        public int hashCode() {
            int hashCode = this.dials.hashCode() * 31;
            ButtonConfig buttonConfig = this.center;
            int g2 = d.g(this.allowMultiplePressesSingleFinger, d.b(this.rotationInDegrees, (hashCode + (buttonConfig == null ? 0 : buttonConfig.hashCode())) * 31, 31), 31);
            RadialGamePadTheme radialGamePadTheme = this.theme;
            return g2 + (radialGamePadTheme != null ? radialGamePadTheme.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PrimaryButtons(dials=" + this.dials + ", center=" + this.center + ", rotationInDegrees=" + this.rotationInDegrees + ", allowMultiplePressesSingleFinger=" + this.allowMultiplePressesSingleFinger + ", theme=" + this.theme + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrimaryButtons(@NotNull List<ButtonConfig> list, @Nullable ButtonConfig buttonConfig, float f2, boolean z2, @Nullable RadialGamePadTheme radialGamePadTheme) {
            super(null);
            a.s(list, "dials");
            this.dials = list;
            this.center = buttonConfig;
            this.rotationInDegrees = f2;
            this.allowMultiplePressesSingleFinger = z2;
            this.theme = radialGamePadTheme;
        }
    }

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class Stick extends PrimaryDialConfig {
        public static final int $stable = 8;

        @Nullable
        private final Integer buttonPressId;

        @NotNull
        private final String contentDescription;
        private final int id;

        @NotNull
        private final Set<GestureType> supportsGestures;

        @Nullable
        private final RadialGamePadTheme theme;

        public /* synthetic */ Stick(int i2, Integer num, Set set, String str, RadialGamePadTheme radialGamePadTheme, int i3, k kVar) {
            this(i2, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? y.f30220a : set, (i3 & 8) != 0 ? "Stick" : str, (i3 & 16) != 0 ? null : radialGamePadTheme);
        }

        public static /* synthetic */ Stick copy$default(Stick stick, int i2, Integer num, Set set, String str, RadialGamePadTheme radialGamePadTheme, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = stick.id;
            }
            if ((i3 & 2) != 0) {
                num = stick.buttonPressId;
            }
            Integer num2 = num;
            if ((i3 & 4) != 0) {
                set = stick.supportsGestures;
            }
            Set set2 = set;
            if ((i3 & 8) != 0) {
                str = stick.contentDescription;
            }
            String str2 = str;
            if ((i3 & 16) != 0) {
                radialGamePadTheme = stick.theme;
            }
            return stick.copy(i2, num2, set2, str2, radialGamePadTheme);
        }

        public final int component1() {
            return this.id;
        }

        @Nullable
        public final Integer component2() {
            return this.buttonPressId;
        }

        @NotNull
        public final Set<GestureType> component3() {
            return this.supportsGestures;
        }

        @NotNull
        public final String component4() {
            return this.contentDescription;
        }

        @Nullable
        public final RadialGamePadTheme component5() {
            return this.theme;
        }

        @NotNull
        public final Stick copy(int i2, @Nullable Integer num, @NotNull Set<? extends GestureType> set, @NotNull String str, @Nullable RadialGamePadTheme radialGamePadTheme) {
            a.s(set, "supportsGestures");
            a.s(str, "contentDescription");
            return new Stick(i2, num, set, str, radialGamePadTheme);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Stick)) {
                return false;
            }
            Stick stick = (Stick) obj;
            return this.id == stick.id && a.g(this.buttonPressId, stick.buttonPressId) && a.g(this.supportsGestures, stick.supportsGestures) && a.g(this.contentDescription, stick.contentDescription) && a.g(this.theme, stick.theme);
        }

        @Nullable
        public final Integer getButtonPressId() {
            return this.buttonPressId;
        }

        @NotNull
        public final String getContentDescription() {
            return this.contentDescription;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final Set<GestureType> getSupportsGestures() {
            return this.supportsGestures;
        }

        @Nullable
        public final RadialGamePadTheme getTheme() {
            return this.theme;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.id) * 31;
            Integer num = this.buttonPressId;
            int b2 = androidx.compose.foundation.text.input.a.b(this.contentDescription, (this.supportsGestures.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31);
            RadialGamePadTheme radialGamePadTheme = this.theme;
            return b2 + (radialGamePadTheme != null ? radialGamePadTheme.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Stick(id=" + this.id + ", buttonPressId=" + this.buttonPressId + ", supportsGestures=" + this.supportsGestures + ", contentDescription=" + this.contentDescription + ", theme=" + this.theme + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Stick(int i2, @Nullable Integer num, @NotNull Set<? extends GestureType> set, @NotNull String str, @Nullable RadialGamePadTheme radialGamePadTheme) {
            super(null);
            a.s(set, "supportsGestures");
            a.s(str, "contentDescription");
            this.id = i2;
            this.buttonPressId = num;
            this.supportsGestures = set;
            this.contentDescription = str;
            this.theme = radialGamePadTheme;
        }
    }

    private PrimaryDialConfig() {
    }

    public /* synthetic */ PrimaryDialConfig(k kVar) {
        this();
    }
}

package com.cooldev.gba.emulator.gameboy.features.game_pad.config;

import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.GestureType;
import e0.y;
import java.util.Set;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public abstract class SecondaryDialConfig {
    public static final int $stable = 0;
    private final boolean avoidClipping;
    private final float distance;
    private final int index;

    @NotNull
    private final RotationProcessor rotationProcessor;
    private final float scale;
    private final int spread;

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static class RotationProcessor {
        public static final int $stable = 0;

        public float getRotation(float f2) {
            return f2;
        }

        public float getSpacing(float f2, float f3) {
            return f2;
        }
    }

    public /* synthetic */ SecondaryDialConfig(int i2, int i3, float f2, float f3, RotationProcessor rotationProcessor, boolean z2, k kVar) {
        this(i2, i3, f2, f3, rotationProcessor, z2);
    }

    public final boolean getAvoidClipping$gba_v1_0_35_54__09Apr2025_1046_release() {
        return this.avoidClipping;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final RotationProcessor getRotationProcessor() {
        return this.rotationProcessor;
    }

    public final float getScale() {
        return this.scale;
    }

    public final int getSpread() {
        return this.spread;
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Cross extends SecondaryDialConfig {
        public static final int $stable = 8;

        @NotNull
        private final CrossConfig crossConfig;

        public /* synthetic */ Cross(int i2, int i3, float f2, float f3, CrossConfig crossConfig, RotationProcessor rotationProcessor, int i4, k kVar) {
            this(i2, i3, f2, f3, crossConfig, (i4 & 32) != 0 ? new RotationProcessor() : rotationProcessor);
        }

        @NotNull
        public final CrossConfig getCrossConfig() {
            return this.crossConfig;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cross(int i2, int i3, float f2, float f3, @NotNull CrossConfig crossConfig, @NotNull RotationProcessor rotationProcessor) {
            super(i2, i3, f2, f3, rotationProcessor, false, 32, null);
            a.s(crossConfig, "crossConfig");
            a.s(rotationProcessor, "rotationProcessor");
            this.crossConfig = crossConfig;
        }
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class DoubleButton extends SecondaryDialConfig {
        public static final int $stable = 8;

        @NotNull
        private final ButtonConfig buttonConfig;

        @Nullable
        private final RadialGamePadTheme theme;

        public /* synthetic */ DoubleButton(int i2, float f2, ButtonConfig buttonConfig, RadialGamePadTheme radialGamePadTheme, RotationProcessor rotationProcessor, int i3, k kVar) {
            this(i2, f2, buttonConfig, (i3 & 8) != 0 ? null : radialGamePadTheme, (i3 & 16) != 0 ? new RotationProcessor() : rotationProcessor);
        }

        @NotNull
        public final ButtonConfig getButtonConfig() {
            return this.buttonConfig;
        }

        @Nullable
        public final RadialGamePadTheme getTheme() {
            return this.theme;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DoubleButton(int i2, float f2, @NotNull ButtonConfig buttonConfig, @Nullable RadialGamePadTheme radialGamePadTheme, @NotNull RotationProcessor rotationProcessor) {
            super(i2, 2, 1.0f, f2, rotationProcessor, true, null);
            a.s(buttonConfig, "buttonConfig");
            a.s(rotationProcessor, "rotationProcessor");
            this.buttonConfig = buttonConfig;
            this.theme = radialGamePadTheme;
        }
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Empty extends SecondaryDialConfig {
        public static final int $stable = 0;

        public /* synthetic */ Empty(int i2, int i3, float f2, float f3, RotationProcessor rotationProcessor, int i4, k kVar) {
            this(i2, i3, f2, f3, (i4 & 16) != 0 ? new RotationProcessor() : rotationProcessor);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Empty(int i2, int i3, float f2, float f3, @NotNull RotationProcessor rotationProcessor) {
            super(i2, i3, f2, f3, rotationProcessor, false, 32, null);
            a.s(rotationProcessor, "rotationProcessor");
        }
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class SingleButton extends SecondaryDialConfig {
        public static final int $stable = 8;

        @NotNull
        private final ButtonConfig buttonConfig;

        @Nullable
        private final RadialGamePadTheme theme;

        public /* synthetic */ SingleButton(int i2, float f2, float f3, ButtonConfig buttonConfig, RadialGamePadTheme radialGamePadTheme, RotationProcessor rotationProcessor, int i3, k kVar) {
            this(i2, f2, f3, buttonConfig, (i3 & 16) != 0 ? null : radialGamePadTheme, (i3 & 32) != 0 ? new RotationProcessor() : rotationProcessor);
        }

        @NotNull
        public final ButtonConfig getButtonConfig() {
            return this.buttonConfig;
        }

        @Nullable
        public final RadialGamePadTheme getTheme() {
            return this.theme;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleButton(int i2, float f2, float f3, @NotNull ButtonConfig buttonConfig, @Nullable RadialGamePadTheme radialGamePadTheme, @NotNull RotationProcessor rotationProcessor) {
            super(i2, 1, f2, f3, rotationProcessor, false, 32, null);
            a.s(buttonConfig, "buttonConfig");
            a.s(rotationProcessor, "rotationProcessor");
            this.buttonConfig = buttonConfig;
            this.theme = radialGamePadTheme;
        }
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static final class Stick extends SecondaryDialConfig {
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

        public /* synthetic */ Stick(int i2, int i3, float f2, float f3, int i4, Integer num, RadialGamePadTheme radialGamePadTheme, Set set, String str, RotationProcessor rotationProcessor, int i5, k kVar) {
            this(i2, i3, f2, f3, i4, (i5 & 32) != 0 ? null : num, (i5 & 64) != 0 ? null : radialGamePadTheme, (i5 & 128) != 0 ? y.f30220a : set, (i5 & 256) != 0 ? "Stick" : str, (i5 & 512) != 0 ? new RotationProcessor() : rotationProcessor);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Stick(int i2, int i3, float f2, float f3, int i4, @Nullable Integer num, @Nullable RadialGamePadTheme radialGamePadTheme, @NotNull Set<? extends GestureType> set, @NotNull String str, @NotNull RotationProcessor rotationProcessor) {
            super(i2, i3, f2, f3, rotationProcessor, false, 32, null);
            a.s(set, "supportsGestures");
            a.s(str, "contentDescription");
            a.s(rotationProcessor, "rotationProcessor");
            this.id = i4;
            this.buttonPressId = num;
            this.theme = radialGamePadTheme;
            this.supportsGestures = set;
            this.contentDescription = str;
        }
    }

    private SecondaryDialConfig(int i2, int i3, float f2, float f3, RotationProcessor rotationProcessor, boolean z2) {
        this.index = i2;
        this.spread = i3;
        this.scale = f2;
        this.distance = f3;
        this.rotationProcessor = rotationProcessor;
        this.avoidClipping = z2;
    }

    public /* synthetic */ SecondaryDialConfig(int i2, int i3, float f2, float f3, RotationProcessor rotationProcessor, boolean z2, int i4, k kVar) {
        this(i2, i3, f2, f3, (i4 & 16) != 0 ? new RotationProcessor() : rotationProcessor, (i4 & 32) != 0 ? false : z2, null);
    }
}

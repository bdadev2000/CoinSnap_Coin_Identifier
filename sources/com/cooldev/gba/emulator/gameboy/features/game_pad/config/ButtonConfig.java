package com.cooldev.gba.emulator.gameboy.features.game_pad.config;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.GestureType;
import com.cooldev.gba.emulator.gameboy.features.themenew.enums.GamePadTheme;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes.dex */
public final class ButtonConfig {
    public static final int $stable = 8;

    @Nullable
    private final String contentDescription;

    @Nullable
    private final GamePadTheme gamePadTheme;

    @Nullable
    private final Integer iconId;
    private final int id;

    @Nullable
    private final String label;
    private final boolean supportsButtons;

    @NotNull
    private final Set<GestureType> supportsGestures;

    @Nullable
    private final RadialGamePadTheme theme;
    private final boolean visible;

    /* JADX WARN: Multi-variable type inference failed */
    public ButtonConfig(int i2, @Nullable String str, boolean z2, @Nullable Integer num, @Nullable String str2, @NotNull Set<? extends GestureType> set, boolean z3, @Nullable RadialGamePadTheme radialGamePadTheme, @Nullable GamePadTheme gamePadTheme) {
        a.s(set, "supportsGestures");
        this.id = i2;
        this.label = str;
        this.visible = z2;
        this.iconId = num;
        this.contentDescription = str2;
        this.supportsGestures = set;
        this.supportsButtons = z3;
        this.theme = radialGamePadTheme;
        this.gamePadTheme = gamePadTheme;
    }

    public final int component1() {
        return this.id;
    }

    @Nullable
    public final String component2() {
        return this.label;
    }

    public final boolean component3() {
        return this.visible;
    }

    @Nullable
    public final Integer component4() {
        return this.iconId;
    }

    @Nullable
    public final String component5() {
        return this.contentDescription;
    }

    @NotNull
    public final Set<GestureType> component6() {
        return this.supportsGestures;
    }

    public final boolean component7() {
        return this.supportsButtons;
    }

    @Nullable
    public final RadialGamePadTheme component8() {
        return this.theme;
    }

    @Nullable
    public final GamePadTheme component9() {
        return this.gamePadTheme;
    }

    @NotNull
    public final ButtonConfig copy(int i2, @Nullable String str, boolean z2, @Nullable Integer num, @Nullable String str2, @NotNull Set<? extends GestureType> set, boolean z3, @Nullable RadialGamePadTheme radialGamePadTheme, @Nullable GamePadTheme gamePadTheme) {
        a.s(set, "supportsGestures");
        return new ButtonConfig(i2, str, z2, num, str2, set, z3, radialGamePadTheme, gamePadTheme);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonConfig)) {
            return false;
        }
        ButtonConfig buttonConfig = (ButtonConfig) obj;
        return this.id == buttonConfig.id && a.g(this.label, buttonConfig.label) && this.visible == buttonConfig.visible && a.g(this.iconId, buttonConfig.iconId) && a.g(this.contentDescription, buttonConfig.contentDescription) && a.g(this.supportsGestures, buttonConfig.supportsGestures) && this.supportsButtons == buttonConfig.supportsButtons && a.g(this.theme, buttonConfig.theme) && this.gamePadTheme == buttonConfig.gamePadTheme;
    }

    @Nullable
    public final String getContentDescription() {
        return this.contentDescription;
    }

    @Nullable
    public final GamePadTheme getGamePadTheme() {
        return this.gamePadTheme;
    }

    @Nullable
    public final Integer getIconId() {
        return this.iconId;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    public final boolean getSupportsButtons() {
        return this.supportsButtons;
    }

    @NotNull
    public final Set<GestureType> getSupportsGestures() {
        return this.supportsGestures;
    }

    @Nullable
    public final RadialGamePadTheme getTheme() {
        return this.theme;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.id) * 31;
        String str = this.label;
        int g2 = d.g(this.visible, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Integer num = this.iconId;
        int hashCode2 = (g2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.contentDescription;
        int g3 = d.g(this.supportsButtons, (this.supportsGestures.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31);
        RadialGamePadTheme radialGamePadTheme = this.theme;
        int hashCode3 = (g3 + (radialGamePadTheme == null ? 0 : radialGamePadTheme.hashCode())) * 31;
        GamePadTheme gamePadTheme = this.gamePadTheme;
        return hashCode3 + (gamePadTheme != null ? gamePadTheme.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ButtonConfig(id=" + this.id + ", label=" + this.label + ", visible=" + this.visible + ", iconId=" + this.iconId + ", contentDescription=" + this.contentDescription + ", supportsGestures=" + this.supportsGestures + ", supportsButtons=" + this.supportsButtons + ", theme=" + this.theme + ", gamePadTheme=" + this.gamePadTheme + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ButtonConfig(int r10, java.lang.String r11, boolean r12, java.lang.Integer r13, java.lang.String r14, java.util.Set r15, boolean r16, com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadTheme r17, com.cooldev.gba.emulator.gameboy.features.themenew.enums.GamePadTheme r18, int r19, kotlin.jvm.internal.k r20) {
        /*
            r9 = this;
            r0 = r19
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L9
            r1 = r2
            goto La
        L9:
            r1 = r11
        La:
            r3 = r0 & 4
            r4 = 1
            if (r3 == 0) goto L11
            r3 = r4
            goto L12
        L11:
            r3 = r12
        L12:
            r5 = r0 & 8
            if (r5 == 0) goto L18
            r5 = r2
            goto L19
        L18:
            r5 = r13
        L19:
            r6 = r0 & 16
            if (r6 == 0) goto L1f
            r6 = r1
            goto L20
        L1f:
            r6 = r14
        L20:
            r7 = r0 & 32
            if (r7 == 0) goto L27
            e0.y r7 = e0.y.f30220a
            goto L28
        L27:
            r7 = r15
        L28:
            r8 = r0 & 64
            if (r8 == 0) goto L2d
            goto L2f
        L2d:
            r4 = r16
        L2f:
            r8 = r0 & 128(0x80, float:1.8E-43)
            if (r8 == 0) goto L35
            r8 = r2
            goto L37
        L35:
            r8 = r17
        L37:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L3c
            goto L3e
        L3c:
            r2 = r18
        L3e:
            r11 = r9
            r12 = r10
            r13 = r1
            r14 = r3
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r4
            r19 = r8
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.game_pad.config.ButtonConfig.<init>(int, java.lang.String, boolean, java.lang.Integer, java.lang.String, java.util.Set, boolean, com.cooldev.gba.emulator.gameboy.features.game_pad.config.RadialGamePadTheme, com.cooldev.gba.emulator.gameboy.features.themenew.enums.GamePadTheme, int, kotlin.jvm.internal.k):void");
    }
}

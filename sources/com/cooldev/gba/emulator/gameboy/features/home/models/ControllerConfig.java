package com.cooldev.gba.emulator.gameboy.features.home.models;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import com.cooldev.gba.emulator.gameboy.features.home.models.TouchControllerID;
import java.io.Serializable;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ControllerConfig implements Serializable {
    public static final int $stable = 0;
    private final boolean allowTouchOverlay;
    private final boolean allowTouchRotation;
    private final int displayName;

    @Nullable
    private final String libretroDescriptor;

    @Nullable
    private final Integer libretroId;
    private final boolean mergeDPADAndLeftStickEvents;

    @NotNull
    private final String name;

    @NotNull
    private final TouchControllerID touchControllerID;

    public ControllerConfig(@NotNull String str, int i2, @NotNull TouchControllerID touchControllerID, boolean z2, boolean z3, boolean z4, @Nullable String str2, @Nullable Integer num) {
        a.s(str, "name");
        a.s(touchControllerID, "touchControllerID");
        this.name = str;
        this.displayName = i2;
        this.touchControllerID = touchControllerID;
        this.allowTouchRotation = z2;
        this.allowTouchOverlay = z3;
        this.mergeDPADAndLeftStickEvents = z4;
        this.libretroDescriptor = str2;
        this.libretroId = num;
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.displayName;
    }

    @NotNull
    public final TouchControllerID component3() {
        return this.touchControllerID;
    }

    public final boolean component4() {
        return this.allowTouchRotation;
    }

    public final boolean component5() {
        return this.allowTouchOverlay;
    }

    public final boolean component6() {
        return this.mergeDPADAndLeftStickEvents;
    }

    @Nullable
    public final String component7() {
        return this.libretroDescriptor;
    }

    @Nullable
    public final Integer component8() {
        return this.libretroId;
    }

    @NotNull
    public final ControllerConfig copy(@NotNull String str, int i2, @NotNull TouchControllerID touchControllerID, boolean z2, boolean z3, boolean z4, @Nullable String str2, @Nullable Integer num) {
        a.s(str, "name");
        a.s(touchControllerID, "touchControllerID");
        return new ControllerConfig(str, i2, touchControllerID, z2, z3, z4, str2, num);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ControllerConfig)) {
            return false;
        }
        ControllerConfig controllerConfig = (ControllerConfig) obj;
        return a.g(this.name, controllerConfig.name) && this.displayName == controllerConfig.displayName && this.touchControllerID == controllerConfig.touchControllerID && this.allowTouchRotation == controllerConfig.allowTouchRotation && this.allowTouchOverlay == controllerConfig.allowTouchOverlay && this.mergeDPADAndLeftStickEvents == controllerConfig.mergeDPADAndLeftStickEvents && a.g(this.libretroDescriptor, controllerConfig.libretroDescriptor) && a.g(this.libretroId, controllerConfig.libretroId);
    }

    public final boolean getAllowTouchOverlay() {
        return this.allowTouchOverlay;
    }

    public final boolean getAllowTouchRotation() {
        return this.allowTouchRotation;
    }

    public final int getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final String getLibretroDescriptor() {
        return this.libretroDescriptor;
    }

    @Nullable
    public final Integer getLibretroId() {
        return this.libretroId;
    }

    public final boolean getMergeDPADAndLeftStickEvents() {
        return this.mergeDPADAndLeftStickEvents;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final TouchControllerID.Config getTouchControllerConfig() {
        return TouchControllerID.Companion.getConfig(this.touchControllerID);
    }

    @NotNull
    public final TouchControllerID getTouchControllerID() {
        return this.touchControllerID;
    }

    public int hashCode() {
        int g2 = d.g(this.mergeDPADAndLeftStickEvents, d.g(this.allowTouchOverlay, d.g(this.allowTouchRotation, (this.touchControllerID.hashCode() + d.c(this.displayName, this.name.hashCode() * 31, 31)) * 31, 31), 31), 31);
        String str = this.libretroDescriptor;
        int hashCode = (g2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.libretroId;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ControllerConfig(name=" + this.name + ", displayName=" + this.displayName + ", touchControllerID=" + this.touchControllerID + ", allowTouchRotation=" + this.allowTouchRotation + ", allowTouchOverlay=" + this.allowTouchOverlay + ", mergeDPADAndLeftStickEvents=" + this.mergeDPADAndLeftStickEvents + ", libretroDescriptor=" + this.libretroDescriptor + ", libretroId=" + this.libretroId + ')';
    }

    public /* synthetic */ ControllerConfig(String str, int i2, TouchControllerID touchControllerID, boolean z2, boolean z3, boolean z4, String str2, Integer num, int i3, k kVar) {
        this(str, i2, touchControllerID, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? true : z3, (i3 & 32) != 0 ? false : z4, (i3 & 64) != 0 ? null : str2, (i3 & 128) != 0 ? null : num);
    }
}

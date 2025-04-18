package com.cooldev.gba.emulator.gameboy.features.home.models;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class SystemCoreConfig implements Serializable {
    public static final int $stable = 8;

    @NotNull
    private final HashMap<Integer, ArrayList<ControllerConfig>> controllerConfigs;

    @NotNull
    private final CoreID coreID;

    @NotNull
    private final List<CoreVariable> defaultSettings;

    @NotNull
    private final List<ExposedSetting> exposedAdvancedSettings;

    @NotNull
    private final List<ExposedSetting> exposedSettings;

    @NotNull
    private final Map<String, String> regionalBIOSFiles;

    @NotNull
    private final List<String> requiredBIOSFiles;
    private final boolean rumbleSupported;
    private final boolean skipDuplicateFrames;
    private final boolean statesSupported;
    private final int statesVersion;

    @Nullable
    private final Set<String> supportedOnlyArchitectures;
    private final boolean supportsLibretroVFS;

    public SystemCoreConfig(@NotNull CoreID coreID, @NotNull HashMap<Integer, ArrayList<ControllerConfig>> hashMap, @NotNull List<ExposedSetting> list, @NotNull List<ExposedSetting> list2, @NotNull List<CoreVariable> list3, boolean z2, boolean z3, @NotNull List<String> list4, @NotNull Map<String, String> map, int i2, boolean z4, boolean z5, @Nullable Set<String> set) {
        a.s(coreID, "coreID");
        a.s(hashMap, "controllerConfigs");
        a.s(list, "exposedSettings");
        a.s(list2, "exposedAdvancedSettings");
        a.s(list3, "defaultSettings");
        a.s(list4, "requiredBIOSFiles");
        a.s(map, "regionalBIOSFiles");
        this.coreID = coreID;
        this.controllerConfigs = hashMap;
        this.exposedSettings = list;
        this.exposedAdvancedSettings = list2;
        this.defaultSettings = list3;
        this.statesSupported = z2;
        this.rumbleSupported = z3;
        this.requiredBIOSFiles = list4;
        this.regionalBIOSFiles = map;
        this.statesVersion = i2;
        this.supportsLibretroVFS = z4;
        this.skipDuplicateFrames = z5;
        this.supportedOnlyArchitectures = set;
    }

    @NotNull
    public final CoreID component1() {
        return this.coreID;
    }

    public final int component10() {
        return this.statesVersion;
    }

    public final boolean component11() {
        return this.supportsLibretroVFS;
    }

    public final boolean component12() {
        return this.skipDuplicateFrames;
    }

    @Nullable
    public final Set<String> component13() {
        return this.supportedOnlyArchitectures;
    }

    @NotNull
    public final HashMap<Integer, ArrayList<ControllerConfig>> component2() {
        return this.controllerConfigs;
    }

    @NotNull
    public final List<ExposedSetting> component3() {
        return this.exposedSettings;
    }

    @NotNull
    public final List<ExposedSetting> component4() {
        return this.exposedAdvancedSettings;
    }

    @NotNull
    public final List<CoreVariable> component5() {
        return this.defaultSettings;
    }

    public final boolean component6() {
        return this.statesSupported;
    }

    public final boolean component7() {
        return this.rumbleSupported;
    }

    @NotNull
    public final List<String> component8() {
        return this.requiredBIOSFiles;
    }

    @NotNull
    public final Map<String, String> component9() {
        return this.regionalBIOSFiles;
    }

    @NotNull
    public final SystemCoreConfig copy(@NotNull CoreID coreID, @NotNull HashMap<Integer, ArrayList<ControllerConfig>> hashMap, @NotNull List<ExposedSetting> list, @NotNull List<ExposedSetting> list2, @NotNull List<CoreVariable> list3, boolean z2, boolean z3, @NotNull List<String> list4, @NotNull Map<String, String> map, int i2, boolean z4, boolean z5, @Nullable Set<String> set) {
        a.s(coreID, "coreID");
        a.s(hashMap, "controllerConfigs");
        a.s(list, "exposedSettings");
        a.s(list2, "exposedAdvancedSettings");
        a.s(list3, "defaultSettings");
        a.s(list4, "requiredBIOSFiles");
        a.s(map, "regionalBIOSFiles");
        return new SystemCoreConfig(coreID, hashMap, list, list2, list3, z2, z3, list4, map, i2, z4, z5, set);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemCoreConfig)) {
            return false;
        }
        SystemCoreConfig systemCoreConfig = (SystemCoreConfig) obj;
        return this.coreID == systemCoreConfig.coreID && a.g(this.controllerConfigs, systemCoreConfig.controllerConfigs) && a.g(this.exposedSettings, systemCoreConfig.exposedSettings) && a.g(this.exposedAdvancedSettings, systemCoreConfig.exposedAdvancedSettings) && a.g(this.defaultSettings, systemCoreConfig.defaultSettings) && this.statesSupported == systemCoreConfig.statesSupported && this.rumbleSupported == systemCoreConfig.rumbleSupported && a.g(this.requiredBIOSFiles, systemCoreConfig.requiredBIOSFiles) && a.g(this.regionalBIOSFiles, systemCoreConfig.regionalBIOSFiles) && this.statesVersion == systemCoreConfig.statesVersion && this.supportsLibretroVFS == systemCoreConfig.supportsLibretroVFS && this.skipDuplicateFrames == systemCoreConfig.skipDuplicateFrames && a.g(this.supportedOnlyArchitectures, systemCoreConfig.supportedOnlyArchitectures);
    }

    @NotNull
    public final HashMap<Integer, ArrayList<ControllerConfig>> getControllerConfigs() {
        return this.controllerConfigs;
    }

    @NotNull
    public final CoreID getCoreID() {
        return this.coreID;
    }

    @NotNull
    public final List<CoreVariable> getDefaultSettings() {
        return this.defaultSettings;
    }

    @NotNull
    public final List<ExposedSetting> getExposedAdvancedSettings() {
        return this.exposedAdvancedSettings;
    }

    @NotNull
    public final List<ExposedSetting> getExposedSettings() {
        return this.exposedSettings;
    }

    @NotNull
    public final Map<String, String> getRegionalBIOSFiles() {
        return this.regionalBIOSFiles;
    }

    @NotNull
    public final List<String> getRequiredBIOSFiles() {
        return this.requiredBIOSFiles;
    }

    public final boolean getRumbleSupported() {
        return this.rumbleSupported;
    }

    public final boolean getSkipDuplicateFrames() {
        return this.skipDuplicateFrames;
    }

    public final boolean getStatesSupported() {
        return this.statesSupported;
    }

    public final int getStatesVersion() {
        return this.statesVersion;
    }

    @Nullable
    public final Set<String> getSupportedOnlyArchitectures() {
        return this.supportedOnlyArchitectures;
    }

    public final boolean getSupportsLibretroVFS() {
        return this.supportsLibretroVFS;
    }

    public int hashCode() {
        int g2 = d.g(this.skipDuplicateFrames, d.g(this.supportsLibretroVFS, d.c(this.statesVersion, (this.regionalBIOSFiles.hashCode() + d.f(this.requiredBIOSFiles, d.g(this.rumbleSupported, d.g(this.statesSupported, d.f(this.defaultSettings, d.f(this.exposedAdvancedSettings, d.f(this.exposedSettings, (this.controllerConfigs.hashCode() + (this.coreID.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31)) * 31, 31), 31), 31);
        Set<String> set = this.supportedOnlyArchitectures;
        return g2 + (set == null ? 0 : set.hashCode());
    }

    @NotNull
    public String toString() {
        return "SystemCoreConfig(coreID=" + this.coreID + ", controllerConfigs=" + this.controllerConfigs + ", exposedSettings=" + this.exposedSettings + ", exposedAdvancedSettings=" + this.exposedAdvancedSettings + ", defaultSettings=" + this.defaultSettings + ", statesSupported=" + this.statesSupported + ", rumbleSupported=" + this.rumbleSupported + ", requiredBIOSFiles=" + this.requiredBIOSFiles + ", regionalBIOSFiles=" + this.regionalBIOSFiles + ", statesVersion=" + this.statesVersion + ", supportsLibretroVFS=" + this.supportsLibretroVFS + ", skipDuplicateFrames=" + this.skipDuplicateFrames + ", supportedOnlyArchitectures=" + this.supportedOnlyArchitectures + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ SystemCoreConfig(com.cooldev.gba.emulator.gameboy.features.home.models.CoreID r18, java.util.HashMap r19, java.util.List r20, java.util.List r21, java.util.List r22, boolean r23, boolean r24, java.util.List r25, java.util.Map r26, int r27, boolean r28, boolean r29, java.util.Set r30, int r31, kotlin.jvm.internal.k r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 4
            e0.w r2 = e0.w.f30218a
            if (r1 == 0) goto La
            r6 = r2
            goto Lc
        La:
            r6 = r20
        Lc:
            r1 = r0 & 8
            if (r1 == 0) goto L12
            r7 = r2
            goto L14
        L12:
            r7 = r21
        L14:
            r1 = r0 & 16
            if (r1 == 0) goto L1a
            r8 = r2
            goto L1c
        L1a:
            r8 = r22
        L1c:
            r1 = r0 & 32
            r3 = 1
            if (r1 == 0) goto L23
            r9 = r3
            goto L25
        L23:
            r9 = r23
        L25:
            r1 = r0 & 64
            r4 = 0
            if (r1 == 0) goto L2c
            r10 = r4
            goto L2e
        L2c:
            r10 = r24
        L2e:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L34
            r11 = r2
            goto L36
        L34:
            r11 = r25
        L36:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3e
            e0.x r1 = e0.x.f30219a
            r12 = r1
            goto L40
        L3e:
            r12 = r26
        L40:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L46
            r13 = r4
            goto L48
        L46:
            r13 = r27
        L48:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L4e
            r14 = r4
            goto L50
        L4e:
            r14 = r28
        L50:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L56
            r15 = r3
            goto L58
        L56:
            r15 = r29
        L58:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L60
            r0 = 0
            r16 = r0
            goto L62
        L60:
            r16 = r30
        L62:
            r3 = r17
            r4 = r18
            r5 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.home.models.SystemCoreConfig.<init>(com.cooldev.gba.emulator.gameboy.features.home.models.CoreID, java.util.HashMap, java.util.List, java.util.List, java.util.List, boolean, boolean, java.util.List, java.util.Map, int, boolean, boolean, java.util.Set, int, kotlin.jvm.internal.k):void");
    }
}

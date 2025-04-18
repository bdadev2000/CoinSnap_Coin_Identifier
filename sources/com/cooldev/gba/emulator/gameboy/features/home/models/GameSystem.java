package com.cooldev.gba.emulator.gameboy.features.home.models;

import android.support.v4.media.d;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.R;
import com.cooldev.gba.emulator.gameboy.features.home.models.ExposedSetting;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.material.internal.ViewUtils;
import com.safedk.android.analytics.events.RedirectEvent;
import d0.h;
import e0.e0;
import e0.t;
import e0.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class GameSystem {

    @NotNull
    private static final List<GameSystem> SYSTEMS;

    @NotNull
    private static final h byExtensionCache$delegate;

    @NotNull
    private static final h byIdCache$delegate;
    private final boolean fastForwardSupport;
    private final boolean hasMultiDiskSupport;

    @NotNull
    private final SystemID id;

    @NotNull
    private final String libretroFullName;

    @NotNull
    private final Companion.ScanOptions scanOptions;
    private final int shortTitleResId;

    @NotNull
    private final List<String> supportedExtensions;

    @NotNull
    private final List<SystemCoreConfig> systemCoreConfigs;
    private final int titleResId;

    @NotNull
    private final List<String> uniqueExtensions;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Companion {

        @StabilityInferred
        /* loaded from: classes2.dex */
        public static final class ScanOptions {
            public static final int $stable = 0;
            private final boolean scanByFilename;
            private final boolean scanByPathAndFilename;
            private final boolean scanByPathAndSupportedExtensions;
            private final boolean scanBySimilarSerial;
            private final boolean scanByUniqueExtension;

            public ScanOptions() {
                this(false, false, false, false, false, 31, null);
            }

            public static /* synthetic */ ScanOptions copy$default(ScanOptions scanOptions, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    z2 = scanOptions.scanByFilename;
                }
                if ((i2 & 2) != 0) {
                    z3 = scanOptions.scanByUniqueExtension;
                }
                boolean z7 = z3;
                if ((i2 & 4) != 0) {
                    z4 = scanOptions.scanByPathAndFilename;
                }
                boolean z8 = z4;
                if ((i2 & 8) != 0) {
                    z5 = scanOptions.scanByPathAndSupportedExtensions;
                }
                boolean z9 = z5;
                if ((i2 & 16) != 0) {
                    z6 = scanOptions.scanBySimilarSerial;
                }
                return scanOptions.copy(z2, z7, z8, z9, z6);
            }

            public final boolean component1() {
                return this.scanByFilename;
            }

            public final boolean component2() {
                return this.scanByUniqueExtension;
            }

            public final boolean component3() {
                return this.scanByPathAndFilename;
            }

            public final boolean component4() {
                return this.scanByPathAndSupportedExtensions;
            }

            public final boolean component5() {
                return this.scanBySimilarSerial;
            }

            @NotNull
            public final ScanOptions copy(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
                return new ScanOptions(z2, z3, z4, z5, z6);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ScanOptions)) {
                    return false;
                }
                ScanOptions scanOptions = (ScanOptions) obj;
                return this.scanByFilename == scanOptions.scanByFilename && this.scanByUniqueExtension == scanOptions.scanByUniqueExtension && this.scanByPathAndFilename == scanOptions.scanByPathAndFilename && this.scanByPathAndSupportedExtensions == scanOptions.scanByPathAndSupportedExtensions && this.scanBySimilarSerial == scanOptions.scanBySimilarSerial;
            }

            public final boolean getScanByFilename() {
                return this.scanByFilename;
            }

            public final boolean getScanByPathAndFilename() {
                return this.scanByPathAndFilename;
            }

            public final boolean getScanByPathAndSupportedExtensions() {
                return this.scanByPathAndSupportedExtensions;
            }

            public final boolean getScanBySimilarSerial() {
                return this.scanBySimilarSerial;
            }

            public final boolean getScanByUniqueExtension() {
                return this.scanByUniqueExtension;
            }

            public int hashCode() {
                return Boolean.hashCode(this.scanBySimilarSerial) + d.g(this.scanByPathAndSupportedExtensions, d.g(this.scanByPathAndFilename, d.g(this.scanByUniqueExtension, Boolean.hashCode(this.scanByFilename) * 31, 31), 31), 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("ScanOptions(scanByFilename=");
                sb.append(this.scanByFilename);
                sb.append(", scanByUniqueExtension=");
                sb.append(this.scanByUniqueExtension);
                sb.append(", scanByPathAndFilename=");
                sb.append(this.scanByPathAndFilename);
                sb.append(", scanByPathAndSupportedExtensions=");
                sb.append(this.scanByPathAndSupportedExtensions);
                sb.append(", scanBySimilarSerial=");
                return d.s(sb, this.scanBySimilarSerial, ')');
            }

            public ScanOptions(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
                this.scanByFilename = z2;
                this.scanByUniqueExtension = z3;
                this.scanByPathAndFilename = z4;
                this.scanByPathAndSupportedExtensions = z5;
                this.scanBySimilarSerial = z6;
            }

            public /* synthetic */ ScanOptions(boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2, k kVar) {
                this((i2 & 1) != 0 ? true : z2, (i2 & 2) != 0 ? true : z3, (i2 & 4) != 0 ? false : z4, (i2 & 8) == 0 ? z5 : true, (i2 & 16) != 0 ? false : z6);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final Map<String, GameSystem> getByExtensionCache() {
            return (Map) GameSystem.byExtensionCache$delegate.getValue();
        }

        private final Map<String, GameSystem> getByIdCache() {
            return (Map) GameSystem.byIdCache$delegate.getValue();
        }

        @NotNull
        public final List<GameSystem> all() {
            return GameSystem.SYSTEMS;
        }

        @NotNull
        public final GameSystem findById(@NotNull String str) {
            a.s(str, "id");
            return (GameSystem) e0.r(str, getByIdCache());
        }

        @Nullable
        public final GameSystem findByUniqueFileExtension(@NotNull String str) {
            a.s(str, "fileExtension");
            Map<String, GameSystem> byExtensionCache = getByExtensionCache();
            Locale locale = Locale.US;
            a.r(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            a.r(lowerCase, "toLowerCase(...)");
            return byExtensionCache.get(lowerCase);
        }

        @NotNull
        public final List<GameSystem> findSystemForCore(@NotNull CoreID coreID) {
            a.s(coreID, "coreID");
            List<GameSystem> all = all();
            ArrayList arrayList = new ArrayList();
            for (Object obj : all) {
                List<SystemCoreConfig> systemCoreConfigs = ((GameSystem) obj).getSystemCoreConfigs();
                if (!(systemCoreConfigs instanceof Collection) || !systemCoreConfigs.isEmpty()) {
                    Iterator<T> it = systemCoreConfigs.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((SystemCoreConfig) it.next()).getCoreID() == coreID) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
            return arrayList;
        }

        @NotNull
        public final List<String> getSupportedExtensions() {
            List list = GameSystem.SYSTEMS;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                t.t0(arrayList, ((GameSystem) it.next()).getSupportedExtensions());
            }
            return arrayList;
        }
    }

    static {
        int i2 = R.string.game_system_title_atari2600;
        int i3 = R.string.game_system_abbr_atari2600;
        CoreID coreID = CoreID.STELLA;
        ArrayList arrayList = null;
        List v2 = f0.v(new ExposedSetting("stella_filter", R.string.setting_stella_filter, f0.b(new ExposedSetting.Value("disabled", R.string.value_stella_filter_disabled), new ExposedSetting.Value("composite", R.string.value_stella_filter_composite), new ExposedSetting.Value("s-video", R.string.value_stella_filter_svideo), new ExposedSetting.Value("rgb", R.string.value_stella_filter_rgb), new ExposedSetting.Value("badly adjusted", R.string.value_stella_filter_badlyadjusted))), new ExposedSetting("stella_crop_hoverscan", R.string.setting_stella_crop_hoverscan, arrayList, 4, null));
        ControllerConfigs controllerConfigs = ControllerConfigs.INSTANCE;
        boolean z2 = false;
        GameSystem gameSystem = new GameSystem(SystemID.ATARI2600, "Atari - 2600", i2, i3, f0.u(new SystemCoreConfig(coreID, e0.s(f0.E(0, f0.b(controllerConfigs.getATARI_2600()))), v2, null, arrayList, false, false, null, null, 0, false, z2, null, 8184, null)), f0.u("a26"), null, null, false, false, 960, null);
        ArrayList arrayList2 = null;
        int i4 = 4;
        k kVar = null;
        k kVar2 = null;
        GameSystem gameSystem2 = new GameSystem(SystemID.NES, "Nintendo - Nintendo Entertainment System", R.string.game_system_title_nes, R.string.game_system_abbr_nes, f0.u(new SystemCoreConfig(CoreID.FCEUMM, e0.s(f0.E(0, f0.b(controllerConfigs.getNES()))), f0.v(new ExposedSetting("fceumm_overscan_h", R.string.setting_fceumm_overscan_h, arrayList2, i4, kVar), new ExposedSetting("fceumm_overscan_v", R.string.setting_fceumm_overscan_v, null, 4, kVar2)), f0.u(new ExposedSetting("fceumm_nospritelimit", R.string.setting_fceumm_nospritelimit, arrayList2, i4, kVar)), null, z2, false, null, 0 == true ? 1 : 0, 0, false, false, null, 8176, null)), f0.u("nes"), null, null, false, false, 960, null);
        GameSystem gameSystem3 = new GameSystem(SystemID.SNES, "Nintendo - Super Nintendo Entertainment System", R.string.game_system_title_snes, R.string.game_system_abbr_snes, f0.u(new SystemCoreConfig(CoreID.SNES9X, e0.s(f0.E(0, f0.b(controllerConfigs.getSNES()))), null, null, null, false, false, null, null, 0, false, false, 0 == true ? 1 : 0, 8188, null)), f0.v("smc", "sfc"), null, null, false, false, 960, kVar2);
        int i5 = R.string.game_system_title_sms;
        int i6 = R.string.game_system_abbr_sms;
        CoreID coreID2 = CoreID.GENESIS_PLUS_GX;
        List list = null;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 8176;
        k kVar3 = null;
        GameSystem gameSystem4 = new GameSystem(SystemID.SMS, "Sega - Master System - Mark III", i5, i6, f0.u(new SystemCoreConfig(coreID2, e0.s(f0.E(0, f0.b(controllerConfigs.getSMS()))), f0.u(new ExposedSetting("genesis_plus_gx_blargg_ntsc_filter", R.string.setting_genesis_plus_gx_blargg_ntsc_filter, f0.b(new ExposedSetting.Value("disabled", R.string.value_genesis_plus_gx_blargg_ntsc_filter_disabled), new ExposedSetting.Value("monochrome", R.string.value_genesis_plus_gx_blargg_ntsc_filter_monochrome), new ExposedSetting.Value("composite", R.string.value_genesis_plus_gx_blargg_ntsc_filter_composite), new ExposedSetting.Value("svideo", R.string.value_genesis_plus_gx_blargg_ntsc_filter_svideo), new ExposedSetting.Value("rgb", R.string.value_genesis_plus_gx_blargg_ntsc_filter_rgb)))), f0.v(new ExposedSetting("genesis_plus_gx_no_sprite_limit", R.string.setting_genesis_plus_gx_no_sprite_limit, 0 == true ? 1 : 0, 4, 0 == true ? 1 : 0), new ExposedSetting("genesis_plus_gx_overscan", R.string.setting_genesis_plus_gx_overscan, f0.b(new ExposedSetting.Value("disabled", R.string.value_genesis_plus_gx_overscan_disabled), new ExposedSetting.Value("top/bottom", R.string.value_genesis_plus_gx_overscan_topbottom), new ExposedSetting.Value("left/right", R.string.value_genesis_plus_gx_overscan_leftright), new ExposedSetting.Value("full", R.string.value_genesis_plus_gx_overscan_full)))), null, false, false, list, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z3, z4, 0 == true ? 1 : 0, i7, kVar3)), f0.u("sms"), null, null, false, false, 960, null);
        GameSystem gameSystem5 = new GameSystem(SystemID.GENESIS, "Sega - Mega Drive - Genesis", R.string.game_system_title_genesis, R.string.game_system_abbr_genesis, f0.u(new SystemCoreConfig(coreID2, e0.s(f0.E(0, f0.b(controllerConfigs.getGENESIS_3(), controllerConfigs.getGENESIS_6())), f0.E(1, f0.b(controllerConfigs.getGENESIS_3(), controllerConfigs.getGENESIS_6())), f0.E(2, f0.b(controllerConfigs.getGENESIS_3(), controllerConfigs.getGENESIS_6())), f0.E(3, f0.b(controllerConfigs.getGENESIS_3(), controllerConfigs.getGENESIS_6()))), f0.u(new ExposedSetting("genesis_plus_gx_blargg_ntsc_filter", R.string.setting_genesis_plus_gx_blargg_ntsc_filter, f0.b(new ExposedSetting.Value("disabled", R.string.value_genesis_plus_gx_blargg_ntsc_filter_disabled), new ExposedSetting.Value("monochrome", R.string.value_genesis_plus_gx_blargg_ntsc_filter_monochrome), new ExposedSetting.Value("composite", R.string.value_genesis_plus_gx_blargg_ntsc_filter_composite), new ExposedSetting.Value("svideo", R.string.value_genesis_plus_gx_blargg_ntsc_filter_svideo), new ExposedSetting.Value("rgb", R.string.value_genesis_plus_gx_blargg_ntsc_filter_rgb)))), f0.v(new ExposedSetting("genesis_plus_gx_no_sprite_limit", R.string.setting_genesis_plus_gx_no_sprite_limit, null, 4, 0 == true ? 1 : 0), new ExposedSetting("genesis_plus_gx_overscan", R.string.setting_genesis_plus_gx_overscan, f0.b(new ExposedSetting.Value("disabled", R.string.value_genesis_plus_gx_overscan_disabled), new ExposedSetting.Value("top/bottom", R.string.value_genesis_plus_gx_overscan_topbottom), new ExposedSetting.Value("left/right", R.string.value_genesis_plus_gx_overscan_leftright), new ExposedSetting.Value("full", R.string.value_genesis_plus_gx_overscan_full)))), null, false, false, list, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z3, z4, 0 == true ? 1 : 0, i7, kVar3)), f0.v("gen", "smd", "md"), null, null, false, false, 960, null);
        SystemID systemID = SystemID.SEGACD;
        int i8 = R.string.game_system_title_scd;
        int i9 = R.string.game_system_abbr_scd;
        boolean z5 = false;
        List u2 = f0.u(new SystemCoreConfig(coreID2, e0.s(f0.E(0, f0.b(controllerConfigs.getGENESIS_3(), controllerConfigs.getGENESIS_6())), f0.E(1, f0.b(controllerConfigs.getGENESIS_3(), controllerConfigs.getGENESIS_6())), f0.E(2, f0.b(controllerConfigs.getGENESIS_3(), controllerConfigs.getGENESIS_6())), f0.E(3, f0.b(controllerConfigs.getGENESIS_3(), controllerConfigs.getGENESIS_6()))), f0.u(new ExposedSetting("genesis_plus_gx_blargg_ntsc_filter", R.string.setting_genesis_plus_gx_blargg_ntsc_filter, f0.b(new ExposedSetting.Value("disabled", R.string.value_genesis_plus_gx_blargg_ntsc_filter_disabled), new ExposedSetting.Value("monochrome", R.string.value_genesis_plus_gx_blargg_ntsc_filter_monochrome), new ExposedSetting.Value("composite", R.string.value_genesis_plus_gx_blargg_ntsc_filter_composite), new ExposedSetting.Value("svideo", R.string.value_genesis_plus_gx_blargg_ntsc_filter_svideo), new ExposedSetting.Value("rgb", R.string.value_genesis_plus_gx_blargg_ntsc_filter_rgb)))), f0.v(new ExposedSetting("genesis_plus_gx_no_sprite_limit", R.string.setting_genesis_plus_gx_no_sprite_limit, null, 4, 0 == true ? 1 : 0), new ExposedSetting("genesis_plus_gx_overscan", R.string.setting_genesis_plus_gx_overscan, f0.b(new ExposedSetting.Value("disabled", R.string.value_genesis_plus_gx_overscan_disabled), new ExposedSetting.Value("top/bottom", R.string.value_genesis_plus_gx_overscan_topbottom), new ExposedSetting.Value("left/right", R.string.value_genesis_plus_gx_overscan_leftright), new ExposedSetting.Value("full", R.string.value_genesis_plus_gx_overscan_full)))), null, z5, false, null, e0.t(f0.E("Europe", "bios_CD_E.bin"), f0.E("Japan", "bios_CD_J.bin"), f0.E("USA", "bios_CD_U.bin")), 0 == true ? 1 : 0, z3, z4, 0 == true ? 1 : 0, 7920, kVar3));
        Companion.ScanOptions scanOptions = new Companion.ScanOptions(false, false, z5, true, true, 4, null);
        w wVar = w.f30218a;
        GameSystem gameSystem6 = new GameSystem(systemID, "Sega - Mega-CD - Sega CD", i8, i9, u2, wVar, scanOptions, f0.v("cue", "iso", "chd"), z5, false, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        GameSystem gameSystem7 = new GameSystem(SystemID.GG, "Sega - Game Gear", R.string.game_system_title_gg, R.string.game_system_abbr_gg, f0.u(new SystemCoreConfig(coreID2, e0.s(f0.E(0, f0.b(controllerConfigs.getGG()))), f0.u(new ExposedSetting("genesis_plus_gx_lcd_filter", R.string.setting_genesis_plus_gx_lcd_filter, null, 4, null)), f0.u(new ExposedSetting("genesis_plus_gx_no_sprite_limit", R.string.setting_genesis_plus_gx_no_sprite_limit, null, 4, 0 == true ? 1 : 0)), null, false, false, null, 0 == true ? 1 : 0, 0, z3, z4, 0 == true ? 1 : 0, 8176, kVar3)), f0.u("gg"), null, null, false, false, 960, null);
        int i10 = R.string.game_system_title_gb;
        int i11 = R.string.game_system_abbr_gb;
        CoreID coreID3 = CoreID.GAMBATTE;
        ArrayList arrayList3 = null;
        int i12 = 4;
        List list2 = null;
        boolean z6 = false;
        List list3 = null;
        Map map = null;
        boolean z7 = false;
        boolean z8 = false;
        Set set = null;
        k kVar4 = null;
        GameSystem gameSystem8 = new GameSystem(SystemID.GB, "Nintendo - Game Boy", i10, i11, f0.u(new SystemCoreConfig(coreID3, e0.s(f0.E(0, f0.b(controllerConfigs.getGB()))), f0.v(new ExposedSetting("gambatte_gb_colorization", R.string.setting_gambatte_gb_colorization, arrayList3, i12, 0 == true ? 1 : 0), new ExposedSetting("gambatte_gb_internal_palette", R.string.setting_gambatte_gb_internal_palette, 0 == true ? 1 : 0, 4, kVar3), new ExposedSetting("gambatte_mix_frames", R.string.setting_gambatte_mix_frames, f0.b(new ExposedSetting.Value("disabled", R.string.value_gambatte_mix_frames_disabled), new ExposedSetting.Value("mix", R.string.value_gambatte_mix_frames_mix), new ExposedSetting.Value("lcd_ghosting", R.string.value_gambatte_mix_frames_lcd_ghosting), new ExposedSetting.Value("lcd_ghosting_fast", R.string.value_gambatte_mix_frames_lcd_ghosting_fast))), new ExposedSetting("gambatte_dark_filter_level", R.string.setting_gambatte_dark_filter_level, arrayList3, i12, 0 == true ? 1 : 0)), list2, f0.v(new CoreVariable("gambatte_gb_colorization", RedirectEvent.f29829i), new CoreVariable("gambatte_gb_internal_palette", "GB - Pocket")), z6, false, list3, map, 0, z7, z8, set, 8168, kVar4)), f0.u("gb"), null, arrayList3, false, false, 960, null);
        k kVar5 = null;
        GameSystem gameSystem9 = new GameSystem(SystemID.GBC, "Nintendo - Game Boy Color", R.string.game_system_title_gbc, R.string.game_system_abbr_gbc, f0.u(new SystemCoreConfig(coreID3, e0.s(f0.E(0, f0.b(controllerConfigs.getGB()))), f0.v(new ExposedSetting("gambatte_mix_frames", R.string.setting_gambatte_mix_frames, f0.b(new ExposedSetting.Value("disabled", R.string.value_gambatte_mix_frames_disabled), new ExposedSetting.Value("mix", R.string.value_gambatte_mix_frames_mix), new ExposedSetting.Value("lcd_ghosting", R.string.value_gambatte_mix_frames_lcd_ghosting), new ExposedSetting.Value("lcd_ghosting_fast", R.string.value_gambatte_mix_frames_lcd_ghosting_fast))), new ExposedSetting("gambatte_gbc_color_correction", R.string.setting_gambatte_gbc_color_correction, f0.b(new ExposedSetting.Value("disabled", R.string.value_gambatte_gbc_color_correction_disabled), new ExposedSetting.Value("always", R.string.value_gambatte_gbc_color_correction_always))), new ExposedSetting("gambatte_dark_filter_level", R.string.setting_gambatte_dark_filter_level, arrayList3, 4, kVar5)), list2, f0.u(new CoreVariable("gambatte_gbc_color_correction", "disabled")), z6, true, list3, map, 0 == true ? 1 : 0, z7, z8, set, 8104, kVar4)), f0.u("gbc"), null, list3, false, 0 == true ? 1 : 0, 960, null);
        List list4 = null;
        boolean z9 = false;
        boolean z10 = true;
        Map map2 = null;
        boolean z11 = false;
        boolean z12 = false;
        GameSystem gameSystem10 = new GameSystem(SystemID.GBA, "Nintendo - Game Boy Advance", R.string.game_system_title_gba, R.string.game_system_abbr_gba, f0.u(new SystemCoreConfig(CoreID.MGBA, e0.s(f0.E(0, f0.b(controllerConfigs.getGBA()))), f0.v(new ExposedSetting("mgba_solar_sensor_level", R.string.setting_mgba_solar_sensor_level, null, 4, null), new ExposedSetting("mgba_interframe_blending", R.string.setting_mgba_interframe_blending, f0.b(new ExposedSetting.Value("OFF", R.string.value_mgba_interframe_blending_off), new ExposedSetting.Value("mix", R.string.value_mgba_interframe_blending_mix), new ExposedSetting.Value("lcd_ghosting", R.string.value_mgba_interframe_blending_lcd_ghosting), new ExposedSetting.Value("lcd_ghosting_fast", R.string.value_mgba_interframe_blending_lcd_ghosting_fast))), new ExposedSetting("mgba_frameskip", R.string.setting_mgba_frameskip, f0.b(new ExposedSetting.Value("disabled", R.string.value_mgba_frameskip_disabled), new ExposedSetting.Value("auto", R.string.value_mgba_frameskip_auto))), new ExposedSetting("mgba_color_correction", R.string.setting_mgba_color_correction, f0.b(new ExposedSetting.Value("OFF", R.string.value_mgba_color_correction_off), new ExposedSetting.Value("GBA", R.string.value_mgba_color_correction_gba)))), list4, null, z9, z10, list3, map2, 0 == true ? 1 : 0, z11, z12, set, 8120, kVar4)), f0.u("gba"), null, null, false, false, 960, null);
        boolean z13 = false;
        k kVar6 = null;
        GameSystem gameSystem11 = new GameSystem(SystemID.N64, "Nintendo - Nintendo 64", R.string.game_system_title_n64, R.string.game_system_abbr_n64, f0.u(new SystemCoreConfig(CoreID.MUPEN64_PLUS_NEXT, e0.s(f0.E(0, f0.b(controllerConfigs.getN64()))), f0.v(new ExposedSetting("mupen64plus-43screensize", R.string.setting_mupen64plus_43screensize, null, 4, null), new ExposedSetting("mupen64plus-cpucore", R.string.setting_mupen64plus_cpucore, f0.b(new ExposedSetting.Value("dynamic_recompiler", R.string.value_mupen64plus_cpucore_dynamicrecompiler), new ExposedSetting.Value("pure_interpreter", R.string.value_mupen64plus_cpucore_pureinterpreter), new ExposedSetting.Value("cached_interpreter", R.string.value_mupen64plus_cpucore_cachedinterpreter))), new ExposedSetting("mupen64plus-BilinearMode", R.string.setting_mupen64plus_BilinearMode, f0.b(new ExposedSetting.Value("standard", R.string.value_mupen64plus_bilinearmode_standard), new ExposedSetting.Value("3point", R.string.value_mupen64plus_bilinearmode_3point))), new ExposedSetting("mupen64plus-pak1", R.string.setting_mupen64plus_pak1, f0.b(new ExposedSetting.Value("memory", R.string.value_mupen64plus_mupen64plus_pak1_memory), new ExposedSetting.Value("rumble", R.string.value_mupen64plus_mupen64plus_pak1_rumble), new ExposedSetting.Value(IntegrityManager.INTEGRITY_TYPE_NONE, R.string.value_mupen64plus_mupen64plus_pak1_none))), new ExposedSetting("mupen64plus-pak2", R.string.setting_mupen64plus_pak2, f0.b(new ExposedSetting.Value(IntegrityManager.INTEGRITY_TYPE_NONE, R.string.value_mupen64plus_mupen64plus_pak2_none), new ExposedSetting.Value("rumble", R.string.value_mupen64plus_mupen64plus_pak2_rumble)))), list4, f0.v(new CoreVariable("mupen64plus-43screensize", "320x240"), new CoreVariable("mupen64plus-FrameDuping", "True")), z9, z10, list3, map2, 0 == true ? 1 : 0, z11, z12, set, 6056, kVar4)), f0.v("n64", "z64"), null, null, false, z13, 960, kVar6);
        ArrayList arrayList4 = null;
        int i13 = 4;
        k kVar7 = null;
        GameSystem gameSystem12 = new GameSystem(SystemID.PSX, "Sony - PlayStation", R.string.game_system_title_psx, R.string.game_system_abbr_psx, f0.u(new SystemCoreConfig(CoreID.PCSX_REARMED, e0.s(f0.E(0, f0.b(controllerConfigs.getPSX_STANDARD(), controllerConfigs.getPSX_DUALSHOCK())), f0.E(1, f0.b(controllerConfigs.getPSX_STANDARD(), controllerConfigs.getPSX_DUALSHOCK())), f0.E(2, f0.b(controllerConfigs.getPSX_STANDARD(), controllerConfigs.getPSX_DUALSHOCK())), f0.E(3, f0.b(controllerConfigs.getPSX_STANDARD(), controllerConfigs.getPSX_DUALSHOCK()))), f0.u(new ExposedSetting("pcsx_rearmed_frameskip", R.string.setting_pcsx_rearmed_frameskip, arrayList4, i13, kVar7)), f0.u(new ExposedSetting("pcsx_rearmed_drc", R.string.setting_pcsx_rearmed_drc, arrayList4, i13, kVar7)), f0.u(new CoreVariable("pcsx_rearmed_drc", "disabled")), false, true, null, null, 0, true, false, null, 5024, null)), wVar, new Companion.ScanOptions(false, false, false, true, z13, 20, kVar6), f0.v("iso", "pbp", "chd", "cue", "m3u"), true, false, 512, null);
        ArrayList arrayList5 = null;
        int i14 = 4;
        k kVar8 = null;
        k kVar9 = null;
        List list5 = null;
        Map map3 = null;
        int i15 = 0;
        boolean z14 = false;
        Set set2 = null;
        k kVar10 = null;
        String str = "Sony - PlayStation Portable";
        GameSystem gameSystem13 = new GameSystem(SystemID.PSP, str, R.string.game_system_title_psp, R.string.game_system_abbr_psp, f0.u(new SystemCoreConfig(CoreID.PPSSPP, e0.s(f0.E(0, f0.b(controllerConfigs.getPSP()))), f0.v(new ExposedSetting("ppsspp_auto_frameskip", R.string.setting_ppsspp_auto_frameskip, null, 4, null), new ExposedSetting("ppsspp_frameskip", R.string.setting_mgba_frameskip, arrayList5, i14, kVar8)), f0.v(new ExposedSetting("ppsspp_cpu_core", R.string.setting_ppsspp_cpu_core, f0.b(new ExposedSetting.Value("JIT", R.string.value_ppsspp_cpu_core_jit), new ExposedSetting.Value("IR JIT", R.string.value_ppsspp_cpu_core_irjit), new ExposedSetting.Value("Interpreter", R.string.value_ppsspp_cpu_core_interpreter))), new ExposedSetting("ppsspp_internal_resolution", R.string.setting_ppsspp_internal_resolution, 0 == true ? 1 : 0, 4, kVar9), new ExposedSetting("ppsspp_texture_scaling_level", R.string.setting_ppsspp_texture_scaling_level, arrayList5, i14, kVar8)), f0.u(new CoreVariable("ppsspp_frame_duplication", "enabled")), false, false, list5, map3, i15, true, z14, set2, 7136, kVar10)), wVar, new Companion.ScanOptions(false, false, false, true, false, 20, kVar9), f0.v("iso", "cso", "pbp"), false, false, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = true;
        boolean z19 = false;
        boolean z20 = false;
        int i16 = 16;
        GameSystem gameSystem14 = new GameSystem(SystemID.FBNEO, "FBNeo - Arcade Games", R.string.game_system_title_arcade_fbneo, R.string.game_system_abbr_arcade_fbneo, f0.u(new SystemCoreConfig(CoreID.FBNEO, e0.s(f0.E(0, f0.b(controllerConfigs.getFB_NEO_4(), controllerConfigs.getFB_NEO_6()))), f0.v(new ExposedSetting("fbneo-frameskip", R.string.setting_fbneo_frameskip, null, 4, null), new ExposedSetting("fbneo-cpu-speed-adjust", R.string.setting_fbneo_cpu_speed_adjust, null, 4, kVar5)), null, null, false, false, list5, map3, i15, z15, z14, set2, 8184, kVar10)), wVar, new Companion.ScanOptions(z16, z17, z18, z19, z20, i16, kVar9), f0.u("zip"), false, false, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        GameSystem gameSystem15 = new GameSystem(SystemID.MAME2003PLUS, "MAME 2003-Plus", R.string.game_system_title_arcade_mame2003_plus, R.string.game_system_abbr_arcade_mame2003_plus, f0.u(new SystemCoreConfig(CoreID.MAME2003PLUS, e0.s(f0.E(0, f0.b(controllerConfigs.getMAME_2003_4(), controllerConfigs.getMAME_2003_6()))), null, null, null, false, false, list5, map3, i15, z15, z14, set2, 8156, kVar10)), wVar, new Companion.ScanOptions(z16, z17, z18, z19, z20, i16, kVar9), f0.u("zip"), false, false, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        int i17 = 4;
        k kVar11 = null;
        List list6 = null;
        boolean z21 = false;
        GameSystem gameSystem16 = new GameSystem(SystemID.NDS, "Nintendo - Nintendo DS", R.string.game_system_title_nds, R.string.game_system_abbr_nds, f0.v(new SystemCoreConfig(CoreID.DESMUME, e0.s(f0.E(0, f0.b(controllerConfigs.getDESMUME()))), f0.v(new ExposedSetting("desmume_screens_layout", R.string.setting_desmume_screens_layout, f0.b(new ExposedSetting.Value("top/bottom", R.string.value_desmume_screens_layout_topbottom), new ExposedSetting.Value("left/right", R.string.value_desmume_screens_layout_leftright))), new ExposedSetting("desmume_frameskip", R.string.setting_desmume_frameskip, null, i17, kVar11)), null, f0.v(new CoreVariable("desmume_pointer_type", "touch"), new CoreVariable("desmume_frameskip", AppEventsConstants.EVENT_PARAM_VALUE_YES)), false, false, list6, null, 0, false, false, null, 6120, null), new SystemCoreConfig(CoreID.MELONDS, e0.s(f0.E(0, f0.b(controllerConfigs.getMELONDS()))), f0.u(new ExposedSetting("melonds_screen_layout1", R.string.setting_melonds_screen_layout, f0.b(new ExposedSetting.Value("top-bottom", R.string.value_melonds_screen_layout_topbottom), new ExposedSetting.Value("left-right", R.string.value_melonds_screen_layout_leftright)))), f0.v(new ExposedSetting("melonds_threaded_renderer", R.string.setting_melonds_threaded_renderer, null, i17, kVar11), new ExposedSetting("melonds_jit_enable", R.string.setting_melonds_jit_enable, null, 4, null)), f0.v(new CoreVariable("melonds_number_of_screen_layouts", AppEventsConstants.EVENT_PARAM_VALUE_YES), new CoreVariable("melonds_touch_mode", "Touch"), new CoreVariable("melonds_threaded_renderer", "enabled"), new CoreVariable("melonds_mic_input", "blow")), false, 0 == true ? 1 : 0, null, null, 2, false, false, null, 7648, null)), f0.u("nds"), null, null, false, z21, 960, null);
        GameSystem gameSystem17 = new GameSystem(SystemID.ATARI7800, "Atari - 7800", R.string.game_system_title_atari7800, R.string.game_system_abbr_atari7800, f0.u(new SystemCoreConfig(CoreID.PROSYSTEM, e0.s(f0.E(0, f0.b(controllerConfigs.getATARI7800()))), null, null, list6, false, 0 == true ? 1 : 0, null, null, 0, false, false, 0 == true ? 1 : 0, 8188, null)), f0.u("a78"), null, f0.u("bin"), false, false, 832, null);
        boolean z22 = false;
        List list7 = null;
        GameSystem gameSystem18 = new GameSystem(SystemID.LYNX, "Atari - Lynx", R.string.game_system_title_lynx, R.string.game_system_abbr_lynx, f0.u(new SystemCoreConfig(CoreID.HANDY, e0.s(f0.E(0, f0.b(controllerConfigs.getLYNX()))), f0.u(new ExposedSetting("handy_rot", R.string.setting_handy_rot, f0.b(new ExposedSetting.Value("None", R.string.value_handy_rot_none), new ExposedSetting.Value("90", R.string.value_handy_rot_90), new ExposedSetting.Value("270", R.string.value_handy_rot_270)))), null, f0.v(new CoreVariable("handy_rot", "None"), new CoreVariable("handy_refresh_rate", "60")), false, false, f0.u("lynxboot.img"), 0 == true ? 1 : 0, 0 == true ? 1 : 0, z21, z22, 0 == true ? 1 : 0, 8040, 0 == true ? 1 : 0)), f0.u("lnx"), null, list7, false, false, 960, null);
        Companion.ScanOptions scanOptions2 = null;
        boolean z23 = false;
        boolean z24 = false;
        k kVar12 = null;
        GameSystem gameSystem19 = new GameSystem(SystemID.PC_ENGINE, "NEC - PC Engine - TurboGrafx 16", R.string.game_system_title_pce, R.string.game_system_abbr_pce, f0.u(new SystemCoreConfig(CoreID.MEDNAFEN_PCE_FAST, e0.s(f0.E(0, f0.b(controllerConfigs.getPCE()))), null, null, null, false, false, null, null, 0, false, false, null, 8188, 0 == true ? 1 : 0)), f0.u("pce"), scanOptions2, f0.u("bin"), z23, z24, 832, kVar12);
        int i18 = R.string.game_system_title_ngp;
        int i19 = R.string.game_system_abbr_ngp;
        CoreID coreID4 = CoreID.MEDNAFEN_NGP;
        List list8 = null;
        int i20 = 8188;
        GameSystem gameSystem20 = new GameSystem(SystemID.NGP, "SNK - Neo Geo Pocket", i18, i19, f0.u(new SystemCoreConfig(coreID4, e0.s(f0.E(0, f0.b(controllerConfigs.getNGP()))), list7, null, null, false, false, list8, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z21, z22, 0 == true ? 1 : 0, i20, 0 == true ? 1 : 0)), f0.u("ngp"), null, list7, false, false, 960, null);
        List list9 = null;
        boolean z25 = false;
        boolean z26 = false;
        List list10 = null;
        int i21 = 960;
        GameSystem gameSystem21 = new GameSystem(SystemID.NGC, "SNK - Neo Geo Pocket Color", R.string.game_system_title_ngc, R.string.game_system_abbr_ngc, f0.u(new SystemCoreConfig(coreID4, e0.s(f0.E(0, f0.b(controllerConfigs.getNGP()))), list7, list9, null, z25, z26, list8, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z21, z22, 0 == true ? 1 : 0, i20, 0 == true ? 1 : 0)), f0.u("ngc"), scanOptions2, list10, z23, z24, i21, kVar12);
        int i22 = R.string.game_system_title_ws;
        int i23 = R.string.game_system_abbr_ws;
        CoreID coreID5 = CoreID.MEDNAFEN_WSWAN;
        int i24 = 8168;
        GameSystem gameSystem22 = new GameSystem(SystemID.WS, "Bandai - WonderSwan", i22, i23, f0.u(new SystemCoreConfig(coreID5, e0.s(f0.E(0, f0.b(controllerConfigs.getWS_LANDSCAPE(), controllerConfigs.getWS_PORTRAIT()))), f0.v(new ExposedSetting("wswan_rotate_display", R.string.setting_wswan_rotate_display, f0.b(new ExposedSetting.Value("landscape", R.string.value_wswan_rotate_display_landscape), new ExposedSetting.Value("portrait", R.string.value_wswan_rotate_display_portrait))), new ExposedSetting("wswan_mono_palette", R.string.setting_wswan_mono_palette, null, 4, null)), list9, f0.v(new CoreVariable("wswan_rotate_display", "landscape"), new CoreVariable("wswan_mono_palette", "wonderswan")), z25, z26, list8, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z21, z22, 0 == true ? 1 : 0, i24, 0 == true ? 1 : 0)), f0.u("ws"), null, null, false, false, 960, null);
        List list11 = null;
        boolean z27 = false;
        boolean z28 = false;
        List list12 = null;
        String str2 = "DOS";
        SYSTEMS = f0.v(gameSystem, gameSystem2, gameSystem3, gameSystem4, gameSystem5, gameSystem6, gameSystem7, gameSystem8, gameSystem9, gameSystem10, gameSystem11, gameSystem12, gameSystem13, gameSystem14, gameSystem15, gameSystem16, gameSystem17, gameSystem18, gameSystem19, gameSystem20, gameSystem21, gameSystem22, new GameSystem(SystemID.WSC, "Bandai - WonderSwan Color", R.string.game_system_title_wsc, R.string.game_system_abbr_wsc, f0.u(new SystemCoreConfig(coreID5, e0.s(f0.E(0, f0.b(controllerConfigs.getWS_LANDSCAPE(), controllerConfigs.getWS_PORTRAIT()))), f0.u(new ExposedSetting("wswan_rotate_display", R.string.setting_wswan_rotate_display, f0.b(new ExposedSetting.Value("landscape", R.string.value_wswan_rotate_display_landscape), new ExposedSetting.Value("portrait", R.string.value_wswan_rotate_display_portrait)))), list11, f0.u(new CoreVariable("wswan_rotate_display", "landscape")), z27, z28, list8, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z21, z22, 0 == true ? 1 : 0, i24, 0 == true ? 1 : 0)), f0.u("wsc"), scanOptions2, list10, z23, z24, i21, kVar12), new GameSystem(SystemID.DOS, str2, R.string.game_system_title_dos, R.string.game_system_abbr_dos, f0.u(new SystemCoreConfig(CoreID.DOSBOX_PURE, e0.s(f0.E(0, f0.b(controllerConfigs.getDOS_AUTO(), controllerConfigs.getDOS_MOUSE_LEFT(), controllerConfigs.getDOS_MOUSE_RIGHT()))), list12, list11, null, z27, z28, list8, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z21, z22, 0 == true ? 1 : 0, 8156, 0 == true ? 1 : 0)), f0.u("dosz"), new Companion.ScanOptions(false, true, false, true, false, i16, kVar9), list12, false, false, 384, null), new GameSystem(SystemID.NINTENDO_3DS, "Nintendo - Nintendo 3DS", R.string.game_system_title_3ds, R.string.game_system_abbr_3ds, f0.u(new SystemCoreConfig(CoreID.CITRA, e0.s(f0.E(0, f0.b(controllerConfigs.getNINTENDO_3DS()))), f0.v(new ExposedSetting("citra_layout_option", R.string.setting_citra_layout_option, f0.b(new ExposedSetting.Value("Default Top-Bottom Screen", R.string.value_citra_layout_option_topbottom), new ExposedSetting.Value("Side by Side", R.string.value_citra_layout_option_sidebyside))), new ExposedSetting("citra_resolution_factor", R.string.setting_citra_resolution_factor, null, 4, null), new ExposedSetting("citra_use_acc_mul", R.string.setting_citra_use_acc_mul, null, 4, null), new ExposedSetting("citra_use_acc_geo_shaders", R.string.setting_citra_use_acc_geo_shaders, null, 4, null)), null, f0.v(new CoreVariable("citra_use_acc_mul", "disabled"), new CoreVariable("citra_touch_touchscreen", "enabled"), new CoreVariable("citra_mouse_touchscreen", "disabled"), new CoreVariable("citra_render_touchscreen", "disabled"), new CoreVariable("citra_use_hw_shader_cache", "disabled")), false, false, null, null, 0, true, false, f0.B("arm64-v8a"), 3016, null)), f0.u("3ds"), null, null, false, false, 960, null));
        byIdCache$delegate = f0.t(GameSystem$Companion$byIdCache$2.INSTANCE);
        byExtensionCache$delegate = f0.t(GameSystem$Companion$byExtensionCache$2.INSTANCE);
    }

    public GameSystem(@NotNull SystemID systemID, @NotNull String str, @StringRes int i2, @StringRes int i3, @NotNull List<SystemCoreConfig> list, @NotNull List<String> list2, @NotNull Companion.ScanOptions scanOptions, @NotNull List<String> list3, boolean z2, boolean z3) {
        a.s(systemID, "id");
        a.s(str, "libretroFullName");
        a.s(list, "systemCoreConfigs");
        a.s(list2, "uniqueExtensions");
        a.s(scanOptions, "scanOptions");
        a.s(list3, "supportedExtensions");
        this.id = systemID;
        this.libretroFullName = str;
        this.titleResId = i2;
        this.shortTitleResId = i3;
        this.systemCoreConfigs = list;
        this.uniqueExtensions = list2;
        this.scanOptions = scanOptions;
        this.supportedExtensions = list3;
        this.hasMultiDiskSupport = z2;
        this.fastForwardSupport = z3;
    }

    @NotNull
    public final SystemID component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.fastForwardSupport;
    }

    @NotNull
    public final String component2() {
        return this.libretroFullName;
    }

    public final int component3() {
        return this.titleResId;
    }

    public final int component4() {
        return this.shortTitleResId;
    }

    @NotNull
    public final List<SystemCoreConfig> component5() {
        return this.systemCoreConfigs;
    }

    @NotNull
    public final List<String> component6() {
        return this.uniqueExtensions;
    }

    @NotNull
    public final Companion.ScanOptions component7() {
        return this.scanOptions;
    }

    @NotNull
    public final List<String> component8() {
        return this.supportedExtensions;
    }

    public final boolean component9() {
        return this.hasMultiDiskSupport;
    }

    @NotNull
    public final GameSystem copy(@NotNull SystemID systemID, @NotNull String str, @StringRes int i2, @StringRes int i3, @NotNull List<SystemCoreConfig> list, @NotNull List<String> list2, @NotNull Companion.ScanOptions scanOptions, @NotNull List<String> list3, boolean z2, boolean z3) {
        a.s(systemID, "id");
        a.s(str, "libretroFullName");
        a.s(list, "systemCoreConfigs");
        a.s(list2, "uniqueExtensions");
        a.s(scanOptions, "scanOptions");
        a.s(list3, "supportedExtensions");
        return new GameSystem(systemID, str, i2, i3, list, list2, scanOptions, list3, z2, z3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GameSystem)) {
            return false;
        }
        GameSystem gameSystem = (GameSystem) obj;
        return this.id == gameSystem.id && a.g(this.libretroFullName, gameSystem.libretroFullName) && this.titleResId == gameSystem.titleResId && this.shortTitleResId == gameSystem.shortTitleResId && a.g(this.systemCoreConfigs, gameSystem.systemCoreConfigs) && a.g(this.uniqueExtensions, gameSystem.uniqueExtensions) && a.g(this.scanOptions, gameSystem.scanOptions) && a.g(this.supportedExtensions, gameSystem.supportedExtensions) && this.hasMultiDiskSupport == gameSystem.hasMultiDiskSupport && this.fastForwardSupport == gameSystem.fastForwardSupport;
    }

    public final boolean getFastForwardSupport() {
        return this.fastForwardSupport;
    }

    public final boolean getHasMultiDiskSupport() {
        return this.hasMultiDiskSupport;
    }

    @NotNull
    public final SystemID getId() {
        return this.id;
    }

    @NotNull
    public final String getLibretroFullName() {
        return this.libretroFullName;
    }

    @NotNull
    public final Companion.ScanOptions getScanOptions() {
        return this.scanOptions;
    }

    public final int getShortTitleResId() {
        return this.shortTitleResId;
    }

    @NotNull
    public final List<String> getSupportedExtensions() {
        return this.supportedExtensions;
    }

    @NotNull
    public final List<SystemCoreConfig> getSystemCoreConfigs() {
        return this.systemCoreConfigs;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    @NotNull
    public final List<String> getUniqueExtensions() {
        return this.uniqueExtensions;
    }

    public int hashCode() {
        return Boolean.hashCode(this.fastForwardSupport) + d.g(this.hasMultiDiskSupport, d.f(this.supportedExtensions, (this.scanOptions.hashCode() + d.f(this.uniqueExtensions, d.f(this.systemCoreConfigs, d.c(this.shortTitleResId, d.c(this.titleResId, androidx.compose.foundation.text.input.a.b(this.libretroFullName, this.id.hashCode() * 31, 31), 31), 31), 31), 31)) * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GameSystem(id=");
        sb.append(this.id);
        sb.append(", libretroFullName=");
        sb.append(this.libretroFullName);
        sb.append(", titleResId=");
        sb.append(this.titleResId);
        sb.append(", shortTitleResId=");
        sb.append(this.shortTitleResId);
        sb.append(", systemCoreConfigs=");
        sb.append(this.systemCoreConfigs);
        sb.append(", uniqueExtensions=");
        sb.append(this.uniqueExtensions);
        sb.append(", scanOptions=");
        sb.append(this.scanOptions);
        sb.append(", supportedExtensions=");
        sb.append(this.supportedExtensions);
        sb.append(", hasMultiDiskSupport=");
        sb.append(this.hasMultiDiskSupport);
        sb.append(", fastForwardSupport=");
        return d.s(sb, this.fastForwardSupport, ')');
    }

    public /* synthetic */ GameSystem(SystemID systemID, String str, int i2, int i3, List list, List list2, Companion.ScanOptions scanOptions, List list3, boolean z2, boolean z3, int i4, k kVar) {
        this(systemID, str, i2, i3, list, list2, (i4 & 64) != 0 ? new Companion.ScanOptions(false, false, false, false, false, 31, null) : scanOptions, (i4 & 128) != 0 ? list2 : list3, (i4 & 256) != 0 ? false : z2, (i4 & 512) != 0 ? true : z3);
    }
}

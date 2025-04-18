package com.facebook.appevents.integrity;

import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes4.dex */
public final class BlocklistEventsManager {

    @NotNull
    public static final BlocklistEventsManager INSTANCE = new BlocklistEventsManager();

    @NotNull
    private static Set<String> blocklist = new HashSet();
    private static boolean enabled;

    private BlocklistEventsManager() {
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(BlocklistEventsManager.class)) {
            return;
        }
        try {
            enabled = false;
            blocklist = new HashSet();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BlocklistEventsManager.class);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(BlocklistEventsManager.class)) {
            return;
        }
        try {
            INSTANCE.loadBlocklistEvents();
            Set<String> set = blocklist;
            if (set != null && !set.isEmpty()) {
                enabled = true;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BlocklistEventsManager.class);
        }
    }

    public static final boolean isInBlocklist(@NotNull String str) {
        if (CrashShieldHandler.isObjectCrashing(BlocklistEventsManager.class)) {
            return false;
        }
        try {
            a.s(str, "eventName");
            if (enabled) {
                return blocklist.contains(str);
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, BlocklistEventsManager.class);
            return false;
        }
    }

    private final void loadBlocklistEvents() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null) {
                return;
            }
            Utility utility = Utility.INSTANCE;
            HashSet<String> convertJSONArrayToHashSet = Utility.convertJSONArrayToHashSet(queryAppSettings.getBlocklistEvents());
            if (convertJSONArrayToHashSet == null) {
                return;
            }
            blocklist = convertJSONArrayToHashSet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}

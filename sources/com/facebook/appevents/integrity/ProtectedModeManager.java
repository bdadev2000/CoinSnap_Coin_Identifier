package com.facebook.appevents.integrity;

import android.os.Bundle;
import b1.f0;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import d0.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import p0.a;

/* loaded from: classes.dex */
public final class ProtectedModeManager {

    @NotNull
    private static final String PROTECTED_MODE_IS_APPLIED_KEY = "pm";

    @NotNull
    private static final String PROTECTED_MODE_IS_APPLIED_VALUE = "1";
    private static boolean enabled;

    @Nullable
    private static HashSet<String> standardParams;

    @NotNull
    public static final ProtectedModeManager INSTANCE = new ProtectedModeManager();

    @NotNull
    private static final h defaultStandardParameterNames$delegate = f0.t(ProtectedModeManager$defaultStandardParameterNames$2.INSTANCE);

    private ProtectedModeManager() {
    }

    private final HashSet<String> convertJSONArrayToHashSet(JSONArray jSONArray) {
        if (!CrashShieldHandler.isObjectCrashing(this) && jSONArray != null) {
            try {
                if (jSONArray.length() != 0) {
                    HashSet<String> hashSet = new HashSet<>();
                    int length = jSONArray.length();
                    if (length > 0) {
                        int i2 = 0;
                        while (true) {
                            int i3 = i2 + 1;
                            String string = jSONArray.getString(i2);
                            a.r(string, "jsonArray.getString(i)");
                            hashSet.add(string);
                            if (i3 >= length) {
                                break;
                            }
                            i2 = i3;
                        }
                    }
                    return hashSet;
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
        return null;
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(ProtectedModeManager.class)) {
            return;
        }
        try {
            enabled = false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ProtectedModeManager.class);
        }
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(ProtectedModeManager.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.loadStandardParams();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ProtectedModeManager.class);
        }
    }

    private final void loadStandardParams() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null) {
                return;
            }
            HashSet<String> convertJSONArrayToHashSet = convertJSONArrayToHashSet(queryAppSettings.getProtectedModeStandardParamsSetting());
            if (convertJSONArrayToHashSet == null) {
                convertJSONArrayToHashSet = getDefaultStandardParameterNames();
            }
            standardParams = convertJSONArrayToHashSet;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public static final void processParametersForProtectedMode(@Nullable Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(ProtectedModeManager.class)) {
            return;
        }
        try {
            if (enabled && bundle != null && !bundle.isEmpty() && standardParams != null) {
                ArrayList arrayList = new ArrayList();
                Set<String> keySet = bundle.keySet();
                a.r(keySet, "parameters.keySet()");
                for (String str : keySet) {
                    HashSet<String> hashSet = standardParams;
                    a.p(hashSet);
                    if (!hashSet.contains(str)) {
                        a.r(str, "param");
                        arrayList.add(str);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bundle.remove((String) it.next());
                }
                bundle.putString(PROTECTED_MODE_IS_APPLIED_KEY, "1");
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ProtectedModeManager.class);
        }
    }

    @NotNull
    public final HashSet<String> getDefaultStandardParameterNames() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return (HashSet) defaultStandardParameterNames$delegate.getValue();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final boolean protectedModeIsApplied(@NotNull Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            a.s(bundle, "parameters");
            if (bundle.containsKey(PROTECTED_MODE_IS_APPLIED_KEY)) {
                return a.g(bundle.get(PROTECTED_MODE_IS_APPLIED_KEY), "1");
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}

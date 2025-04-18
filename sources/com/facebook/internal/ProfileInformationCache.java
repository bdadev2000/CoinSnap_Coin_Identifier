package com.facebook.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ProfileInformationCache {

    @NotNull
    public static final ProfileInformationCache INSTANCE = new ProfileInformationCache();

    @NotNull
    private static final ConcurrentHashMap<String, JSONObject> infoCache = new ConcurrentHashMap<>();

    private ProfileInformationCache() {
    }

    @Nullable
    public static final JSONObject getProfileInformation(@NotNull String str) {
        p0.a.s(str, SDKConstants.PARAM_ACCESS_TOKEN);
        return infoCache.get(str);
    }

    public static final void putProfileInformation(@NotNull String str, @NotNull JSONObject jSONObject) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        p0.a.s(jSONObject, "value");
        infoCache.put(str, jSONObject);
    }
}

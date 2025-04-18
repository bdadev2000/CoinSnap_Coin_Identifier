package com.facebook.gamingservices.model;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p0.a;

/* loaded from: classes4.dex */
public final class CustomUpdateLocalizedText {

    /* renamed from: default, reason: not valid java name */
    @NotNull
    private final String f50default;

    @Nullable
    private final HashMap<String, String> localizations;

    public CustomUpdateLocalizedText(@NotNull String str, @Nullable HashMap<String, String> hashMap) {
        a.s(str, "default");
        this.f50default = str;
        this.localizations = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomUpdateLocalizedText copy$default(CustomUpdateLocalizedText customUpdateLocalizedText, String str, HashMap hashMap, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = customUpdateLocalizedText.f50default;
        }
        if ((i2 & 2) != 0) {
            hashMap = customUpdateLocalizedText.localizations;
        }
        return customUpdateLocalizedText.copy(str, hashMap);
    }

    @NotNull
    public final String component1() {
        return this.f50default;
    }

    @Nullable
    public final HashMap<String, String> component2() {
        return this.localizations;
    }

    @NotNull
    public final CustomUpdateLocalizedText copy(@NotNull String str, @Nullable HashMap<String, String> hashMap) {
        a.s(str, "default");
        return new CustomUpdateLocalizedText(str, hashMap);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomUpdateLocalizedText)) {
            return false;
        }
        CustomUpdateLocalizedText customUpdateLocalizedText = (CustomUpdateLocalizedText) obj;
        return a.g(this.f50default, customUpdateLocalizedText.f50default) && a.g(this.localizations, customUpdateLocalizedText.localizations);
    }

    @NotNull
    public final String getDefault() {
        return this.f50default;
    }

    @Nullable
    public final HashMap<String, String> getLocalizations() {
        return this.localizations;
    }

    public int hashCode() {
        int hashCode = this.f50default.hashCode() * 31;
        HashMap<String, String> hashMap = this.localizations;
        return hashCode + (hashMap == null ? 0 : hashMap.hashCode());
    }

    @NotNull
    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("default", this.f50default);
        HashMap<String, String> hashMap = this.localizations;
        if (hashMap != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("localizations", jSONObject2);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "CustomUpdateLocalizedText(default=" + this.f50default + ", localizations=" + this.localizations + ')';
    }

    public /* synthetic */ CustomUpdateLocalizedText(String str, HashMap hashMap, int i2, k kVar) {
        this(str, (i2 & 2) != 0 ? null : hashMap);
    }
}

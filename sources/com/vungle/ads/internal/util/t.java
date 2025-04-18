package com.vungle.ads.internal.util;

import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public final class t {
    public static final t INSTANCE = new t();

    private t() {
    }

    public final String getContentStringValue(JsonObject json, String key) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return JsonElementKt.getJsonPrimitive((JsonElement) MapsKt.getValue(json, key)).getContent();
        } catch (Exception unused) {
            return null;
        }
    }
}

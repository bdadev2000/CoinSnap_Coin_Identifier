package com.glority.android.picturexx.utils;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PropertiesItemUtils.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/glority/android/picturexx/utils/PropertiesItemUtils;", "", "<init>", "()V", "getDisplayImages", "", "", "properties", "defaultImage", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class PropertiesItemUtils {
    public static final int $stable = 0;
    public static final PropertiesItemUtils INSTANCE = new PropertiesItemUtils();

    private PropertiesItemUtils() {
    }

    public final List<String> getDisplayImages(String properties, String defaultImage) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(defaultImage, "defaultImage");
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(properties);
            if (jSONObject.has("beautify_original_image_url")) {
                String string = jSONObject.getString("beautify_original_image_url");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                arrayList.add(string);
            } else if (jSONObject.has("original_image_urls")) {
                JSONArray jSONArray = jSONObject.getJSONArray("original_image_urls");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string2 = jSONArray.getString(i);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    arrayList.add(string2);
                }
            } else {
                arrayList.add(defaultImage);
            }
        } catch (Throwable unused) {
            arrayList.add(defaultImage);
        }
        return arrayList;
    }
}

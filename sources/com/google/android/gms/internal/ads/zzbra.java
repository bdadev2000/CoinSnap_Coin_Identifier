package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbra {
    @Nullable
    public static final List zza(JSONObject jSONObject, String str) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                arrayList.add(optJSONArray.getString(i9));
            }
            return Collections.unmodifiableList(arrayList);
        }
        return null;
    }
}

package com.facebook.internal;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class BundleJSONConverter {

    @NotNull
    public static final BundleJSONConverter INSTANCE = new BundleJSONConverter();

    @NotNull
    private static final Map<Class<?>, Setter> SETTERS;

    /* loaded from: classes3.dex */
    public interface Setter {
        void setOnBundle(@NotNull Bundle bundle, @NotNull String str, @NotNull Object obj) throws JSONException;

        void setOnJSON(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) throws JSONException;
    }

    static {
        HashMap hashMap = new HashMap();
        SETTERS = hashMap;
        hashMap.put(Boolean.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.1
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(@NotNull Bundle bundle, @NotNull String str, @NotNull Object obj) throws JSONException {
                p0.a.s(bundle, "bundle");
                p0.a.s(str, SDKConstants.PARAM_KEY);
                p0.a.s(obj, "value");
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) throws JSONException {
                p0.a.s(jSONObject, "json");
                p0.a.s(str, SDKConstants.PARAM_KEY);
                p0.a.s(obj, "value");
                jSONObject.put(str, obj);
            }
        });
        hashMap.put(Integer.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.2
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(@NotNull Bundle bundle, @NotNull String str, @NotNull Object obj) throws JSONException {
                p0.a.s(bundle, "bundle");
                p0.a.s(str, SDKConstants.PARAM_KEY);
                p0.a.s(obj, "value");
                bundle.putInt(str, ((Integer) obj).intValue());
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) throws JSONException {
                p0.a.s(jSONObject, "json");
                p0.a.s(str, SDKConstants.PARAM_KEY);
                p0.a.s(obj, "value");
                jSONObject.put(str, obj);
            }
        });
        hashMap.put(Long.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.3
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(@NotNull Bundle bundle, @NotNull String str, @NotNull Object obj) throws JSONException {
                p0.a.s(bundle, "bundle");
                p0.a.s(str, SDKConstants.PARAM_KEY);
                p0.a.s(obj, "value");
                bundle.putLong(str, ((Long) obj).longValue());
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) throws JSONException {
                p0.a.s(jSONObject, "json");
                p0.a.s(str, SDKConstants.PARAM_KEY);
                p0.a.s(obj, "value");
                jSONObject.put(str, obj);
            }
        });
        hashMap.put(Double.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.4
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(@NotNull Bundle bundle, @NotNull String str, @NotNull Object obj) throws JSONException {
                p0.a.s(bundle, "bundle");
                p0.a.s(str, SDKConstants.PARAM_KEY);
                p0.a.s(obj, "value");
                bundle.putDouble(str, ((Double) obj).doubleValue());
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) throws JSONException {
                p0.a.s(jSONObject, "json");
                p0.a.s(str, SDKConstants.PARAM_KEY);
                p0.a.s(obj, "value");
                jSONObject.put(str, obj);
            }
        });
        hashMap.put(String.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.5
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(@NotNull Bundle bundle, @NotNull String str, @NotNull Object obj) throws JSONException {
                p0.a.s(bundle, "bundle");
                p0.a.s(str, SDKConstants.PARAM_KEY);
                p0.a.s(obj, "value");
                bundle.putString(str, (String) obj);
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) throws JSONException {
                p0.a.s(jSONObject, "json");
                p0.a.s(str, SDKConstants.PARAM_KEY);
                p0.a.s(obj, "value");
                jSONObject.put(str, obj);
            }
        });
        hashMap.put(String[].class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.6
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(@NotNull Bundle bundle, @NotNull String str, @NotNull Object obj) throws JSONException {
                p0.a.s(bundle, "bundle");
                p0.a.s(str, SDKConstants.PARAM_KEY);
                p0.a.s(obj, "value");
                throw new IllegalArgumentException("Unexpected type from JSON");
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) throws JSONException {
                p0.a.s(jSONObject, "json");
                p0.a.s(str, SDKConstants.PARAM_KEY);
                p0.a.s(obj, "value");
                JSONArray jSONArray = new JSONArray();
                String[] strArr = (String[]) obj;
                int length = strArr.length;
                int i2 = 0;
                while (i2 < length) {
                    String str2 = strArr[i2];
                    i2++;
                    jSONArray.put(str2);
                }
                jSONObject.put(str, jSONArray);
            }
        });
        hashMap.put(JSONArray.class, new Setter() { // from class: com.facebook.internal.BundleJSONConverter.7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(@NotNull Bundle bundle, @NotNull String str, @NotNull Object obj) throws JSONException {
                p0.a.s(bundle, "bundle");
                p0.a.s(str, SDKConstants.PARAM_KEY);
                p0.a.s(obj, "value");
                JSONArray jSONArray = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() == 0) {
                    bundle.putStringArrayList(str, arrayList);
                    return;
                }
                int length = jSONArray.length();
                if (length > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        Object obj2 = jSONArray.get(i2);
                        if (!(obj2 instanceof String)) {
                            throw new IllegalArgumentException(p0.a.z0(obj2.getClass(), "Unexpected type in an array: "));
                        }
                        arrayList.add(obj2);
                        if (i3 >= length) {
                            break;
                        } else {
                            i2 = i3;
                        }
                    }
                }
                bundle.putStringArrayList(str, arrayList);
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(@NotNull JSONObject jSONObject, @NotNull String str, @NotNull Object obj) throws JSONException {
                p0.a.s(jSONObject, "json");
                p0.a.s(str, SDKConstants.PARAM_KEY);
                p0.a.s(obj, "value");
                throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
            }
        });
    }

    private BundleJSONConverter() {
    }

    @NotNull
    public static final Bundle convertToBundle(@NotNull JSONObject jSONObject) throws JSONException {
        p0.a.s(jSONObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, convertToBundle((JSONObject) obj));
                } else {
                    Setter setter = SETTERS.get(obj.getClass());
                    if (setter == null) {
                        throw new IllegalArgumentException(p0.a.z0(obj.getClass(), "Unsupported type: "));
                    }
                    p0.a.r(next, SDKConstants.PARAM_KEY);
                    setter.setOnBundle(bundle, next, obj);
                }
            }
        }
        return bundle;
    }

    @NotNull
    public static final JSONObject convertToJSON(@NotNull Bundle bundle) throws JSONException {
        p0.a.s(bundle, "bundle");
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        jSONArray.put((String) it.next());
                    }
                    jSONObject.put(str, jSONArray);
                } else if (obj instanceof Bundle) {
                    jSONObject.put(str, convertToJSON((Bundle) obj));
                } else {
                    Setter setter = SETTERS.get(obj.getClass());
                    if (setter == null) {
                        throw new IllegalArgumentException(p0.a.z0(obj.getClass(), "Unsupported type: "));
                    }
                    p0.a.r(str, SDKConstants.PARAM_KEY);
                    setter.setOnJSON(jSONObject, str, obj);
                }
            }
        }
        return jSONObject;
    }
}

package com.facebook.share.internal;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.model.CameraEffectArguments;
import d0.k;
import e0.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class CameraEffectJSONUtility {

    @NotNull
    public static final CameraEffectJSONUtility INSTANCE = new CameraEffectJSONUtility();

    @NotNull
    private static final HashMap<Class<?>, Setter> SETTERS = e0.s(new k(String.class, new Setter() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$1
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnArgumentsBuilder(@NotNull CameraEffectArguments.Builder builder, @NotNull String str, @Nullable Object obj) throws JSONException {
            p0.a.s(builder, "builder");
            p0.a.s(str, SDKConstants.PARAM_KEY);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            builder.putArgument(str, (String) obj);
        }

        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnJSON(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Object obj) throws JSONException {
            p0.a.s(jSONObject, "json");
            p0.a.s(str, SDKConstants.PARAM_KEY);
            jSONObject.put(str, obj);
        }
    }), new k(String[].class, new Setter() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$2
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnArgumentsBuilder(@NotNull CameraEffectArguments.Builder builder, @NotNull String str, @Nullable Object obj) throws JSONException {
            p0.a.s(builder, "builder");
            p0.a.s(str, SDKConstants.PARAM_KEY);
            throw new IllegalArgumentException("Unexpected type from JSON");
        }

        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnJSON(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Object obj) throws JSONException {
            p0.a.s(jSONObject, "json");
            p0.a.s(str, SDKConstants.PARAM_KEY);
            JSONArray jSONArray = new JSONArray();
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String?>");
            }
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
    }), new k(JSONArray.class, new Setter() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$3
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnArgumentsBuilder(@NotNull CameraEffectArguments.Builder builder, @NotNull String str, @Nullable Object obj) throws JSONException {
            p0.a.s(builder, "builder");
            p0.a.s(str, SDKConstants.PARAM_KEY);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
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
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            builder.putArgument(str, (String[]) array);
        }

        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnJSON(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Object obj) throws JSONException {
            p0.a.s(jSONObject, "json");
            p0.a.s(str, SDKConstants.PARAM_KEY);
            throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }));

    /* loaded from: classes.dex */
    public interface Setter {
        void setOnArgumentsBuilder(@NotNull CameraEffectArguments.Builder builder, @NotNull String str, @Nullable Object obj) throws JSONException;

        void setOnJSON(@NotNull JSONObject jSONObject, @NotNull String str, @Nullable Object obj) throws JSONException;
    }

    private CameraEffectJSONUtility() {
    }

    @Nullable
    public static final CameraEffectArguments convertToCameraEffectArguments(@Nullable JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        CameraEffectArguments.Builder builder = new CameraEffectArguments.Builder();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                Setter setter = SETTERS.get(obj.getClass());
                if (setter == null) {
                    throw new IllegalArgumentException(p0.a.z0(obj.getClass(), "Unsupported type: "));
                }
                p0.a.r(next, SDKConstants.PARAM_KEY);
                setter.setOnArgumentsBuilder(builder, next, obj);
            }
        }
        return builder.build();
    }

    @Nullable
    public static final JSONObject convertToJSON(@Nullable CameraEffectArguments cameraEffectArguments) throws JSONException {
        if (cameraEffectArguments == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : cameraEffectArguments.keySet()) {
            Object obj = cameraEffectArguments.get(str);
            if (obj != null) {
                Setter setter = SETTERS.get(obj.getClass());
                if (setter == null) {
                    throw new IllegalArgumentException(p0.a.z0(obj.getClass(), "Unsupported type: "));
                }
                setter.setOnJSON(jSONObject, str, obj);
            }
        }
        return jSONObject;
    }
}

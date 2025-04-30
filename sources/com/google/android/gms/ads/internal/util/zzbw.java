package com.google.android.gms.ads.internal.util;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfgy;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbw {
    public static final zzbv zza = new zzbu();

    @Nullable
    public static Bundle zza(JSONObject jSONObject) {
        Bundle bundle;
        String str;
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> keys = jSONObject.keys();
        Bundle bundle2 = new Bundle();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof Boolean) {
                    bundle2.putBoolean(next, ((Boolean) opt).booleanValue());
                } else if (opt instanceof Double) {
                    bundle2.putDouble(next, ((Double) opt).doubleValue());
                } else if (opt instanceof Integer) {
                    bundle2.putInt(next, ((Integer) opt).intValue());
                } else if (opt instanceof Long) {
                    bundle2.putLong(next, ((Long) opt).longValue());
                } else if (opt instanceof String) {
                    bundle2.putString(next, (String) opt);
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i9 = 0;
                        Object obj = null;
                        for (int i10 = 0; obj == null && i10 < length; i10++) {
                            if (!jSONArray.isNull(i10)) {
                                obj = jSONArray.opt(i10);
                            } else {
                                obj = null;
                            }
                        }
                        if (obj == null) {
                            com.google.android.gms.ads.internal.util.client.zzm.zzj("Expected JSONArray with at least 1 non-null element for key:".concat(String.valueOf(next)));
                        } else if (obj instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i9 < length) {
                                if (!jSONArray.isNull(i9)) {
                                    bundle = zza(jSONArray.optJSONObject(i9));
                                } else {
                                    bundle = null;
                                }
                                bundleArr[i9] = bundle;
                                i9++;
                            }
                            bundle2.putParcelableArray(next, bundleArr);
                        } else if (obj instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i9 < length) {
                                dArr[i9] = jSONArray.optDouble(i9);
                                i9++;
                            }
                            bundle2.putDoubleArray(next, dArr);
                        } else if (obj instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i9 < length) {
                                if (!jSONArray.isNull(i9)) {
                                    str = jSONArray.optString(i9);
                                } else {
                                    str = null;
                                }
                                strArr[i9] = str;
                                i9++;
                            }
                            bundle2.putStringArray(next, strArr);
                        } else if (obj instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i9 < length) {
                                zArr[i9] = jSONArray.optBoolean(i9);
                                i9++;
                            }
                            bundle2.putBooleanArray(next, zArr);
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzm.zzj("JSONArray with unsupported type " + obj.getClass().getCanonicalName() + " for key:" + next);
                        }
                    }
                } else if (opt instanceof JSONObject) {
                    bundle2.putBundle(next, zza((JSONObject) opt));
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Unsupported type for key:".concat(String.valueOf(next)));
                }
            }
        }
        return bundle2;
    }

    public static String zzb(String str, JSONObject jSONObject, String... strArr) {
        JSONObject zzn = zzn(jSONObject, strArr);
        if (zzn == null) {
            return "";
        }
        return zzn.optString(strArr[0], "");
    }

    @NonNull
    public static List zzc(@Nullable JSONArray jSONArray, @Nullable List list) throws JSONException {
        if (list == null) {
            list = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                list.add(jSONArray.getString(i9));
            }
        }
        return list;
    }

    public static List zzd(JsonReader jsonReader) throws IllegalStateException, IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static Map zze(JsonReader jsonReader) throws IOException, IllegalStateException {
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            HashMap hashMap2 = new HashMap();
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                hashMap2.put(jsonReader.nextName(), jsonReader.nextString());
            }
            jsonReader.endObject();
            hashMap.put(nextName, hashMap2);
        }
        jsonReader.endObject();
        return hashMap;
    }

    public static JSONArray zzf(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONArray.put(zzf(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONArray.put(zzi(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else if (JsonToken.STRING.equals(peek)) {
                jSONArray.put(jsonReader.nextString());
            } else {
                throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static JSONObject zzg(JSONObject jSONObject, String str) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    @Nullable
    public static JSONObject zzh(JSONObject jSONObject, String... strArr) {
        JSONObject zzn = zzn(jSONObject, strArr);
        if (zzn == null) {
            return null;
        }
        return zzn.optJSONObject(strArr[1]);
    }

    public static JSONObject zzi(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            JsonToken peek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONObject.put(nextName, zzf(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONObject.put(nextName, zzi(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else if (JsonToken.STRING.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextString());
            } else {
                throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(peek)));
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static void zzj(JsonWriter jsonWriter, JSONArray jSONArray) throws IOException {
        try {
            jsonWriter.beginArray();
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                Object obj = jSONArray.get(i9);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    zzk(jsonWriter, (JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    zzj(jsonWriter, (JSONArray) obj);
                } else {
                    throw new JSONException("unable to write field: " + String.valueOf(obj));
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e4) {
            throw new IOException(e4);
        }
    }

    public static void zzk(JsonWriter jsonWriter, JSONObject jSONObject) throws IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    zzk(jsonWriter.name(next), (JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    zzj(jsonWriter.name(next), (JSONArray) obj);
                } else {
                    throw new JSONException("unable to write field: " + String.valueOf(obj));
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e4) {
            throw new IOException(e4);
        }
    }

    public static boolean zzl(boolean z8, JSONObject jSONObject, String... strArr) {
        JSONObject zzn = zzn(jSONObject, strArr);
        if (zzn == null) {
            return false;
        }
        return zzn.optBoolean(strArr[strArr.length - 1], false);
    }

    public static String zzm(zzfgy zzfgyVar) {
        if (zzfgyVar == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            zzo(jsonWriter, zzfgyVar);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Error when writing JSON.", e4);
            return null;
        }
    }

    @Nullable
    private static JSONObject zzn(JSONObject jSONObject, String[] strArr) {
        for (int i9 = 0; i9 < strArr.length - 1; i9 = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }

    private static void zzo(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof zzfgy) {
            zzk(jsonWriter, ((zzfgy) obj).zzd);
            return;
        }
        if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (key instanceof String) {
                    zzo(jsonWriter.name((String) key), entry.getValue());
                }
            }
            jsonWriter.endObject();
            return;
        }
        if (obj instanceof List) {
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzo(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.nullValue();
    }
}

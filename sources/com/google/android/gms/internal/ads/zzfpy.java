package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfpy {
    private static WindowManager zzb;
    private static final String[] zzc = {"x", "y", "width", "height"};
    static float zza = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject zza(int i9, int i10, int i11, int i12) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i9 / zza);
            jSONObject.put("y", i10 / zza);
            jSONObject.put("width", i11 / zza);
            jSONObject.put("height", i12 / zza);
        } catch (JSONException e4) {
            zzfpz.zza("Error with creating viewStateObject", e4);
        }
        return jSONObject;
    }

    public static void zzb(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e4) {
            zzfpz.zza("Error with setting ad session id", e4);
        }
    }

    public static void zzc(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    public static void zzd(Context context) {
        if (context != null) {
            zza = context.getResources().getDisplayMetrics().density;
            zzb = (WindowManager) context.getSystemService("window");
        }
    }

    public static void zze(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e4) {
            zzfpz.zza("JSONException during JSONObject.put for name [" + str + "]", e4);
        }
    }

    public static void zzf(JSONObject jSONObject) {
        float f9;
        float f10;
        if (zzb != null) {
            Point point = new Point(0, 0);
            zzb.getDefaultDisplay().getRealSize(point);
            float f11 = point.x;
            float f12 = zza;
            f9 = f11 / f12;
            f10 = point.y / f12;
        } else {
            f9 = 0.0f;
            f10 = 0.0f;
        }
        try {
            jSONObject.put("width", f9);
            jSONObject.put("height", f10);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    public static boolean zzg(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = zzc;
            int i9 = 0;
            while (true) {
                if (i9 < 4) {
                    String str = strArr[i9];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i9++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (zzh(optJSONArray, optJSONArray2)) {
                            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                                if (!optJSONArray.optString(i10, "").equals(optJSONArray2.optString(i10, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (zzh(optJSONArray3, optJSONArray4)) {
                            for (int i11 = 0; i11 < optJSONArray3.length(); i11++) {
                                if (zzg(optJSONArray3.optJSONObject(i11), optJSONArray4.optJSONObject(i11))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzh(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray != null && jSONArray2 != null && jSONArray.length() == jSONArray2.length()) {
            return true;
        }
        return false;
    }
}

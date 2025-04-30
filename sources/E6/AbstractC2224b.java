package e6;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import e1.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: e6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2224b {

    /* renamed from: a, reason: collision with root package name */
    public static WindowManager f20113a;
    public static final String[] b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    public static float f20114c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i9, int i10, int i11, int i12) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i9 / f20114c);
            jSONObject.put("y", i10 / f20114c);
            jSONObject.put("width", i11 / f20114c);
            jSONObject.put("height", i12 / f20114c);
        } catch (JSONException e4) {
            f.a("Error with creating viewStateObject", e4);
        }
        return jSONObject;
    }

    public static void b(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e4) {
            f.a("JSONException during JSONObject.put for name [" + str + "]", e4);
        }
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2) {
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

    public static void d(JSONObject jSONObject) {
        float f9;
        float f10;
        if (f20113a != null) {
            Point point = new Point(0, 0);
            f20113a.getDefaultDisplay().getRealSize(point);
            float f11 = point.x;
            float f12 = f20114c;
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

    public static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z8;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        String[] strArr = b;
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
                    if ((optJSONArray == null && optJSONArray2 == null) || (optJSONArray != null && optJSONArray2 != null && optJSONArray.length() == optJSONArray2.length())) {
                        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                            if (!optJSONArray.optString(i10, "").equals(optJSONArray2.optString(i10, ""))) {
                                break;
                            }
                        }
                    }
                }
                JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                boolean z9 = true;
                if (optJSONArray3 != null || optJSONArray4 != null) {
                    if ((optJSONArray3 == null && optJSONArray4 == null) || (optJSONArray3 != null && optJSONArray4 != null && optJSONArray3.length() == optJSONArray4.length())) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        for (int i11 = 0; i11 < optJSONArray3.length(); i11++) {
                            if (e(optJSONArray3.optJSONObject(i11), optJSONArray4.optJSONObject(i11))) {
                            }
                        }
                    }
                    z9 = false;
                    break;
                }
                if (z9) {
                    return true;
                }
            }
        }
        return false;
    }
}

package qd;

import a6.k;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class c {
    public static WindowManager a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f23895b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    public static float f23896c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i10 / f23896c);
            jSONObject.put("y", i11 / f23896c);
            jSONObject.put("width", i12 / f23896c);
            jSONObject.put("height", i13 / f23896c);
        } catch (JSONException e2) {
            k.b("Error with creating viewStateObject", e2);
        }
        return jSONObject;
    }

    public static void b(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e2) {
            k.b("JSONException during JSONObject.put for name [" + str + "]", e2);
        }
    }

    public static void c(JSONObject jSONObject) {
        float f10;
        float f11;
        if (a != null) {
            Point point = new Point(0, 0);
            a.getDefaultDisplay().getRealSize(point);
            float f12 = point.x;
            float f13 = f23896c;
            f10 = f12 / f13;
            f11 = point.y / f13;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        try {
            jSONObject.put("width", f10);
            jSONObject.put("height", f11);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z10;
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if ((optJSONArray == null && optJSONArray2 == null) || (optJSONArray != null && optJSONArray2 != null && optJSONArray.length() == optJSONArray2.length())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            if (!e(optJSONArray.optJSONObject(i10), optJSONArray2.optJSONObject(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        String[] strArr = f23895b;
        int i10 = 0;
        while (true) {
            if (i10 < 4) {
                String str = strArr[i10];
                if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                    z10 = false;
                    break;
                }
                i10++;
            } else {
                z10 = true;
                break;
            }
        }
        if (z10 && jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
            JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
            if (optJSONArray != null || optJSONArray2 != null) {
                if ((optJSONArray == null && optJSONArray2 == null) || (optJSONArray != null && optJSONArray2 != null && optJSONArray.length() == optJSONArray2.length())) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                        if (optJSONArray.optString(i11, "").equals(optJSONArray2.optString(i11, ""))) {
                        }
                    }
                }
                z12 = false;
                if (z12 && d(jSONObject, jSONObject2)) {
                    return true;
                }
            }
            z12 = true;
            if (z12) {
                return true;
            }
        }
        return false;
    }
}

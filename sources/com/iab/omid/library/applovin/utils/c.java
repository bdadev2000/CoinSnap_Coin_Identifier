package com.iab.omid.library.applovin.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.OutputDeviceStatus;
import com.iab.omid.library.applovin.walking.a;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static WindowManager f14453a;
    private static String[] b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    static float f14454c = Resources.getSystem().getDisplayMetrics().density;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14455a;

        static {
            int[] iArr = new int[OutputDeviceStatus.values().length];
            f14455a = iArr;
            try {
                iArr[OutputDeviceStatus.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final float f14456a;
        final float b;

        public b(float f9, float f10) {
            this.f14456a = f9;
            this.b = f10;
        }
    }

    public static float a(int i9) {
        return i9 / f14454c;
    }

    public static void b(JSONObject jSONObject) {
        b a6 = a(jSONObject);
        try {
            jSONObject.put("width", a6.f14456a);
            jSONObject.put("height", a6.b);
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
            if (!optJSONArray.optString(i9, "").equals(optJSONArray2.optString(i9, ""))) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean h(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return f(jSONObject, jSONObject2) && g(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && c(jSONObject, jSONObject2) && b(jSONObject, jSONObject2);
    }

    private static b a(JSONObject jSONObject) {
        float f9;
        float f10;
        if (f14453a != null) {
            Point point = new Point(0, 0);
            f14453a.getDefaultDisplay().getRealSize(point);
            f9 = a(point.x);
            f10 = a(point.y);
        } else {
            f9 = 0.0f;
            f10 = 0.0f;
        }
        return new b(f9, f10);
    }

    public static void b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e4) {
            d.a("Error with setting not visible reason", e4);
        }
    }

    public static JSONObject a(int i9, int i10, int i11, int i12) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i9));
            jSONObject.put("y", a(i10));
            jSONObject.put("width", a(i11));
            jSONObject.put("height", a(i12));
        } catch (JSONException e4) {
            d.a("Error with creating viewStateObject", e4);
        }
        return jSONObject;
    }

    private static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
            if (!h(optJSONArray.optJSONObject(i9), optJSONArray2.optJSONObject(i9))) {
                return false;
            }
        }
        return true;
    }

    public static void a(Context context) {
        if (context != null) {
            f14454c = context.getResources().getDisplayMetrics().density;
            f14453a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject, OutputDeviceStatus outputDeviceStatus) {
        try {
            jSONObject.put("noOutputDevice", a(outputDeviceStatus));
        } catch (JSONException e4) {
            d.a("Error with setting output device status", e4);
        }
    }

    public static void a(JSONObject jSONObject, a.C0144a c0144a) {
        com.iab.omid.library.applovin.internal.e a6 = c0144a.a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = c0144a.b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a6.d());
            jSONObject.put("friendlyObstructionPurpose", a6.b());
            jSONObject.put("friendlyObstructionReason", a6.a());
        } catch (JSONException e4) {
            d.a("Error with setting friendly obstruction", e4);
        }
    }

    public static void a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e4) {
            d.a("Error with setting has window focus", e4);
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e4) {
            d.a("Error with setting ad session id", e4);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e4) {
            d.a("JSONException during JSONObject.put for name [" + str + "]", e4);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
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

    private static boolean a(OutputDeviceStatus outputDeviceStatus) {
        return a.f14455a[outputDeviceStatus.ordinal()] == 1;
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}

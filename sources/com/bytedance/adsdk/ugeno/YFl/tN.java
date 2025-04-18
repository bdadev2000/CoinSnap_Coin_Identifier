package com.bytedance.adsdk.ugeno.YFl;

import android.text.TextUtils;
import android.util.Pair;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.adjust.sdk.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tN {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Interpolator Sg(String str) {
        char c10;
        switch (str.hashCode()) {
            case -1965072618:
                if (str.equals("ease_in")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -787702915:
                if (str.equals("ease_out")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1065009829:
                if (str.equals("ease_in_out")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    return new LinearInterpolator();
                }
                return new DecelerateInterpolator();
            }
            return new AccelerateDecelerateInterpolator();
        }
        return new AccelerateInterpolator();
    }

    public static int YFl(int i10) {
        if (i10 < 0) {
            return -1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10 - 1;
    }

    public static float[] tN(String str) {
        float[] fArr = {0.0f, 0.0f};
        JSONArray YFl = com.bytedance.adsdk.ugeno.DSW.Sg.YFl(str, (JSONArray) null);
        if (YFl != null && YFl.length() == 2) {
            fArr[0] = (float) YFl.optDouble(0);
            fArr[1] = (float) YFl.optDouble(1);
        }
        return fArr;
    }

    public static Sg YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Sg sg2 = new Sg();
        sg2.Sg(jSONObject.optLong("delay"));
        sg2.YFl(jSONObject.optLong("duration"));
        sg2.YFl(jSONObject.optInt("playCount"));
        sg2.YFl(jSONObject.optString("playDirection"));
        sg2.Sg(jSONObject.optString("transformOrigin"));
        sg2.tN(jSONObject.optString("timingFunction", "linear"));
        sg2.YFl(jSONObject.optJSONObject("effect"));
        sg2.YFl(YFl(jSONObject.optJSONArray("keyframes")));
        return sg2;
    }

    public static Map<String, TreeMap<Float, String>> YFl(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
            if (optJSONObject != null) {
                float optDouble = (float) optJSONObject.optDouble("offset");
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    TreeMap treeMap = (TreeMap) hashMap.get(next);
                    if (!TextUtils.equals(next, "offset")) {
                        if (hashMap.containsKey(next) && treeMap != null) {
                            treeMap.put(Float.valueOf(optDouble), optJSONObject.optString(next));
                        } else {
                            TreeMap treeMap2 = new TreeMap();
                            new Pair(Float.valueOf(optDouble), optJSONObject.optString(next));
                            treeMap2.put(Float.valueOf(optDouble), optJSONObject.optString(next));
                            hashMap.put(next, treeMap2);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public static int YFl(String str) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode != -1408024454) {
            if (hashCode == -1039745817 && str.equals(Constants.NORMAL)) {
                c10 = 1;
            }
            c10 = 65535;
        } else {
            if (str.equals("alternate")) {
                c10 = 0;
            }
            c10 = 65535;
        }
        return c10 != 0 ? 1 : 2;
    }
}

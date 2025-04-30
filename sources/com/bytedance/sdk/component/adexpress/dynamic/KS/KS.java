package com.bytedance.sdk.component.adexpress.dynamic.KS;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class KS {
    private JSONObject lMd;
    private HashMap<String, Object> zp = new HashMap<>();

    public KS(JSONObject jSONObject) {
        this.lMd = jSONObject;
    }

    public boolean lMd(String str) {
        return this.zp.containsKey(str);
    }

    public Object zp(String str) {
        if (this.zp.containsKey(str)) {
            return this.zp.get(str);
        }
        return null;
    }

    public void zp() {
        Iterator<String> keys = this.lMd.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = this.lMd.opt(next);
            int i9 = 0;
            if (TextUtils.equals("image", next)) {
                if (opt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) opt;
                        if (i9 < jSONArray.length()) {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                            if (optJSONObject != null) {
                                Iterator<String> keys2 = optJSONObject.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    Object opt2 = optJSONObject.opt(next2);
                                    this.zp.put(next + "." + i9 + "." + next2, opt2);
                                }
                            }
                            i9++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (opt instanceof String) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) opt);
                        Iterator<String> keys3 = jSONObject.keys();
                        while (keys3.hasNext()) {
                            String next3 = keys3.next();
                            Object opt3 = jSONObject.opt(next3);
                            if ((opt3 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int i10 = 0; i10 < ((JSONArray) opt3).length(); i10++) {
                                    this.zp.put(next + "." + next3 + "." + i10, ((JSONArray) opt3).opt(i10));
                                }
                            } else if ((opt3 instanceof JSONObject) && TextUtils.equals(next3, "coupon")) {
                                Iterator<String> keys4 = ((JSONObject) opt3).keys();
                                while (keys4.hasNext()) {
                                    String next4 = keys4.next();
                                    Object opt4 = ((JSONObject) opt3).opt(next4);
                                    this.zp.put(next + "." + next3 + "." + next4, opt4);
                                }
                            } else if ((opt3 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                zp(next, next3, opt3);
                            } else {
                                this.zp.put(next + "." + next3, opt3);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            } else if (!(opt instanceof JSONObject)) {
                this.zp.put(next, opt);
                if (opt instanceof String) {
                    this.zp.put(next, opt);
                }
            } else if (opt != null) {
                JSONObject jSONObject2 = (JSONObject) opt;
                Iterator<String> keys5 = jSONObject2.keys();
                while (keys5.hasNext()) {
                    String next5 = keys5.next();
                    Object opt5 = jSONObject2.opt(next5);
                    this.zp.put(next + "." + next5, opt5);
                }
            }
        }
    }

    private void zp(String str, String str2, Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if ((opt instanceof JSONArray) && TextUtils.equals(next, "product_infos")) {
                int i9 = 0;
                while (true) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (i9 < jSONArray.length()) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                        Iterator<String> keys2 = optJSONObject.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            Object opt2 = optJSONObject.opt(next2);
                            this.zp.put(str + "." + str2 + "." + next + "." + i9 + "." + next2, opt2);
                        }
                        i9++;
                    }
                }
            } else {
                this.zp.put(str + "." + str2 + "." + next, opt);
            }
        }
    }
}

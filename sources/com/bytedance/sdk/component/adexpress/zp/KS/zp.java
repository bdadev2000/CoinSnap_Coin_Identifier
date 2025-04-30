package com.bytedance.sdk.component.adexpress.zp.KS;

import android.text.TextUtils;
import android.util.Pair;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp {
    private lMd COT;
    private Map<String, zp> HWF = new ConcurrentHashMap();
    private String KS;
    private List<C0085zp> jU;
    private String lMd;
    private String zp;

    /* loaded from: classes.dex */
    public static class lMd {
        private List<Pair<String, String>> KS;
        private String lMd;
        private String zp;

        public void lMd(String str) {
            this.lMd = str;
        }

        public String zp() {
            return this.zp;
        }

        public List<Pair<String, String>> lMd() {
            return this.KS;
        }

        public void zp(String str) {
            this.zp = str;
        }

        public void zp(List<Pair<String, String>> list) {
            this.KS = list;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.zp.KS.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0085zp {
        private int KS;
        private String lMd;
        private String zp;

        public int KS() {
            return this.KS;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj instanceof C0085zp) {
                String str2 = this.zp;
                if (str2 != null) {
                    C0085zp c0085zp = (C0085zp) obj;
                    if (str2.equals(c0085zp.zp()) && (str = this.lMd) != null && str.equals(c0085zp.lMd())) {
                        return true;
                    }
                }
                return false;
            }
            return super.equals(obj);
        }

        public String lMd() {
            return this.lMd;
        }

        public String zp() {
            return this.zp;
        }

        public void lMd(String str) {
            this.lMd = str;
        }

        public void zp(String str) {
            this.zp = str;
        }

        public void zp(int i9) {
            this.KS = i9;
        }
    }

    public lMd COT() {
        return this.COT;
    }

    public List<C0085zp> HWF() {
        if (this.jU == null) {
            this.jU = new ArrayList();
        }
        return this.jU;
    }

    public String KS() {
        return this.lMd;
    }

    public boolean QR() {
        if (!TextUtils.isEmpty(jU()) && !TextUtils.isEmpty(KS()) && !TextUtils.isEmpty(lMd())) {
            return true;
        }
        return false;
    }

    public String YW() {
        JSONObject ku;
        if (QR() && (ku = ku()) != null) {
            return ku.toString();
        }
        return null;
    }

    public String jU() {
        return this.KS;
    }

    public JSONObject ku() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", lMd());
            jSONObject.putOpt("version", KS());
            jSONObject.putOpt("main", jU());
            JSONArray jSONArray = new JSONArray();
            if (HWF() != null) {
                for (C0085zp c0085zp : HWF()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0085zp.zp());
                    jSONObject2.putOpt("md5", c0085zp.lMd());
                    jSONObject2.putOpt(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(c0085zp.KS()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.HWF.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z8 = false;
                for (String str : this.HWF.keySet()) {
                    zp zpVar = this.HWF.get(str);
                    if (zpVar != null) {
                        jSONObject3.put(str, zpVar.ku());
                        z8 = true;
                    }
                }
                if (z8) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            lMd COT = COT();
            if (COT != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", COT.zp);
                jSONObject4.put("md5", COT.lMd);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> lMd2 = COT.lMd();
                if (lMd2 != null) {
                    for (Pair<String, String> pair : lMd2) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String lMd() {
        return this.zp;
    }

    public Map<String, zp> zp() {
        return this.HWF;
    }

    public static zp jU(String str) {
        if (str == null) {
            return null;
        }
        try {
            return zp(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public void KS(String str) {
        this.KS = str;
    }

    public void lMd(String str) {
        this.lMd = str;
    }

    public void zp(String str) {
        this.zp = str;
    }

    public void zp(lMd lmd) {
        this.COT = lmd;
    }

    public void zp(List<C0085zp> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.jU = list;
    }

    public static zp zp(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null) {
            return null;
        }
        zp zpVar = new zp();
        zpVar.zp(jSONObject.optString("name"));
        zpVar.lMd(jSONObject.optString("version"));
        zpVar.KS(jSONObject.optString("main"));
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i9);
                C0085zp c0085zp = new C0085zp();
                c0085zp.zp(optJSONObject2.optString("url"));
                c0085zp.lMd(optJSONObject2.optString("md5"));
                c0085zp.zp(optJSONObject2.optInt(AppLovinEventTypes.USER_COMPLETED_LEVEL));
                arrayList.add(c0085zp);
            }
        }
        zpVar.zp(arrayList);
        try {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("engines");
            if (optJSONObject3 != null) {
                Iterator<String> keys = optJSONObject3.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    zp zp = zp(optJSONObject3.optJSONObject(next));
                    if (zp != null) {
                        zpVar.zp().put(next, zp);
                    }
                }
            }
        } catch (Exception e4) {
            e4.getMessage();
        }
        if (jSONObject.has("resources_archive") && (optJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            lMd lmd = new lMd();
            lmd.zp(optJSONObject.optString("url"));
            lmd.lMd(optJSONObject.optString("md5"));
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("map");
            if (optJSONObject4 != null) {
                Iterator<String> keys2 = optJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    arrayList2.add(new Pair(next2, optJSONObject4.optString(next2)));
                }
                lmd.zp(arrayList2);
            }
            zpVar.zp(lmd);
        }
        if (zpVar.QR()) {
            return zpVar;
        }
        return null;
    }
}

package com.bytedance.sdk.component.adexpress.YFl.tN;

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
public class YFl {
    private List<C0082YFl> AlY;
    private String Sg;
    private String YFl;
    private String tN;

    /* renamed from: vc, reason: collision with root package name */
    private Map<String, YFl> f10363vc = new ConcurrentHashMap();
    private Sg wN;

    /* loaded from: classes.dex */
    public static class Sg {
        private String Sg;
        private String YFl;
        private List<Pair<String, String>> tN;

        public void Sg(String str) {
            this.Sg = str;
        }

        public String YFl() {
            return this.YFl;
        }

        public List<Pair<String, String>> Sg() {
            return this.tN;
        }

        public void YFl(String str) {
            this.YFl = str;
        }

        public void YFl(List<Pair<String, String>> list) {
            this.tN = list;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.YFl.tN.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0082YFl {
        private String Sg;
        private String YFl;
        private int tN;

        public String Sg() {
            return this.Sg;
        }

        public String YFl() {
            return this.YFl;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj instanceof C0082YFl) {
                String str2 = this.YFl;
                if (str2 != null) {
                    C0082YFl c0082YFl = (C0082YFl) obj;
                    if (str2.equals(c0082YFl.YFl()) && (str = this.Sg) != null && str.equals(c0082YFl.Sg())) {
                        return true;
                    }
                }
                return false;
            }
            return super.equals(obj);
        }

        public int tN() {
            return this.tN;
        }

        public void Sg(String str) {
            this.Sg = str;
        }

        public void YFl(String str) {
            this.YFl = str;
        }

        public void YFl(int i10) {
            this.tN = i10;
        }
    }

    public String AlY() {
        return this.tN;
    }

    public boolean DSW() {
        return (TextUtils.isEmpty(AlY()) || TextUtils.isEmpty(tN()) || TextUtils.isEmpty(Sg())) ? false : true;
    }

    public String NjR() {
        JSONObject qsH;
        if (DSW() && (qsH = qsH()) != null) {
            return qsH.toString();
        }
        return null;
    }

    public String Sg() {
        return this.YFl;
    }

    public Map<String, YFl> YFl() {
        return this.f10363vc;
    }

    public JSONObject qsH() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", Sg());
            jSONObject.putOpt("version", tN());
            jSONObject.putOpt("main", AlY());
            JSONArray jSONArray = new JSONArray();
            if (vc() != null) {
                for (C0082YFl c0082YFl : vc()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0082YFl.YFl());
                    jSONObject2.putOpt("md5", c0082YFl.Sg());
                    jSONObject2.putOpt(AppLovinEventTypes.USER_COMPLETED_LEVEL, Integer.valueOf(c0082YFl.tN()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.f10363vc.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z10 = false;
                for (String str : this.f10363vc.keySet()) {
                    YFl yFl = this.f10363vc.get(str);
                    if (yFl != null) {
                        jSONObject3.put(str, yFl.qsH());
                        z10 = true;
                    }
                }
                if (z10) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            Sg wN = wN();
            if (wN != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", wN.YFl);
                jSONObject4.put("md5", wN.Sg);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> Sg2 = wN.Sg();
                if (Sg2 != null) {
                    for (Pair<String, String> pair : Sg2) {
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

    public String tN() {
        return this.Sg;
    }

    public List<C0082YFl> vc() {
        if (this.AlY == null) {
            this.AlY = new ArrayList();
        }
        return this.AlY;
    }

    public Sg wN() {
        return this.wN;
    }

    public static YFl AlY(String str) {
        if (str == null) {
            return null;
        }
        try {
            return YFl(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public void Sg(String str) {
        this.Sg = str;
    }

    public void YFl(String str) {
        this.YFl = str;
    }

    public void tN(String str) {
        this.tN = str;
    }

    public void YFl(Sg sg2) {
        this.wN = sg2;
    }

    public void YFl(List<C0082YFl> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.AlY = list;
    }

    public static YFl YFl(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null) {
            return null;
        }
        YFl yFl = new YFl();
        yFl.YFl(jSONObject.optString("name"));
        yFl.Sg(jSONObject.optString("version"));
        yFl.tN(jSONObject.optString("main"));
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i10);
                C0082YFl c0082YFl = new C0082YFl();
                c0082YFl.YFl(optJSONObject2.optString("url"));
                c0082YFl.Sg(optJSONObject2.optString("md5"));
                c0082YFl.YFl(optJSONObject2.optInt(AppLovinEventTypes.USER_COMPLETED_LEVEL));
                arrayList.add(c0082YFl);
            }
        }
        yFl.YFl(arrayList);
        try {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("engines");
            if (optJSONObject3 != null) {
                Iterator<String> keys = optJSONObject3.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    YFl YFl = YFl(optJSONObject3.optJSONObject(next));
                    if (YFl != null) {
                        yFl.YFl().put(next, YFl);
                    }
                }
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
        if (jSONObject.has("resources_archive") && (optJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            Sg sg2 = new Sg();
            sg2.YFl(optJSONObject.optString("url"));
            sg2.Sg(optJSONObject.optString("md5"));
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("map");
            if (optJSONObject4 != null) {
                Iterator<String> keys2 = optJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    arrayList2.add(new Pair(next2, optJSONObject4.optString(next2)));
                }
                sg2.YFl(arrayList2);
            }
            yFl.YFl(sg2);
        }
        if (yFl.DSW()) {
            return yFl;
        }
        return null;
    }
}

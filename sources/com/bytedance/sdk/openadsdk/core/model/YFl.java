package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl {
    private C0128YFl AlY;
    private long NjR;
    private int Sg;
    private String YFl;
    private int YoT;

    /* renamed from: nc, reason: collision with root package name */
    private boolean f10699nc;
    private String qsH;
    private String tN;
    private boolean wN;

    /* renamed from: vc, reason: collision with root package name */
    private List<Wwa> f10700vc = new ArrayList();
    private List<qsH> DSW = new ArrayList();
    private volatile boolean eT = false;

    /* renamed from: com.bytedance.sdk.openadsdk.core.model.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0128YFl extends Wwa.YFl {
        private int YFl;

        public JSONObject Sg() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", vc());
                jSONObject.put("md5", DSW());
                jSONObject.put("url", qsH());
                jSONObject.put(DataSchemeDataSource.SCHEME_DATA, NjR());
                jSONObject.put("diff_data", nc());
                jSONObject.put("version", wN());
                jSONObject.put("dynamic_creative", eT());
                jSONObject.put("count_down_time", YFl());
                return jSONObject;
            } catch (Throwable unused) {
                return null;
            }
        }

        public void YFl(int i10) {
            this.YFl = i10;
        }

        public int YFl() {
            return this.YFl;
        }

        public static C0128YFl YFl(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0128YFl c0128YFl = new C0128YFl();
            c0128YFl.tN(jSONObject.optString("id"));
            c0128YFl.AlY(jSONObject.optString("md5"));
            c0128YFl.wN(jSONObject.optString("url"));
            c0128YFl.vc(jSONObject.optString(DataSchemeDataSource.SCHEME_DATA));
            c0128YFl.DSW(jSONObject.optString("diff_data"));
            c0128YFl.Sg(jSONObject.optString("version"));
            c0128YFl.qsH(jSONObject.optString("dynamic_creative"));
            c0128YFl.YFl(jSONObject.optInt("count_down_time"));
            if (YFl(c0128YFl)) {
                return c0128YFl;
            }
            return null;
        }

        private static boolean YFl(C0128YFl c0128YFl) {
            return (c0128YFl == null || TextUtils.isEmpty(c0128YFl.vc()) || TextUtils.isEmpty(c0128YFl.qsH())) ? false : true;
        }
    }

    public boolean AlY() {
        List<Wwa> list = this.f10700vc;
        return list != null && list.size() > 0;
    }

    public boolean DSW() {
        return this.f10699nc;
    }

    public boolean NjR() {
        return this.eT;
    }

    public int Sg() {
        return this.Sg;
    }

    public String YFl() {
        Wwa wN = wN();
        return wN != null ? wN.ivp() : "";
    }

    @Nullable
    public JSONObject YoT() {
        try {
            JSONObject jSONObject = new JSONObject();
            C0128YFl qsH = qsH();
            if (qsH != null) {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject Sg = qsH.Sg();
                if (Sg != null) {
                    jSONObject2.put("tpl_info", Sg);
                    jSONObject.put("choose_ui_data", jSONObject2);
                }
            }
            List<Wwa> list = this.f10700vc;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < this.f10700vc.size(); i10++) {
                    jSONArray.put(this.f10700vc.get(i10).ni());
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("is_choose_ad_original", this.f10699nc);
            jSONObject.put("multi_ad_style", this.YoT);
            jSONObject.put("request_id", this.YFl);
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("AdInfo", "toJsonObj: ", th2);
            return null;
        }
    }

    public boolean eT() {
        return this.YoT == 1;
    }

    public void nc() {
        this.eT = false;
    }

    public C0128YFl qsH() {
        return this.AlY;
    }

    public List<Wwa> tN() {
        return this.f10700vc;
    }

    public boolean vc() {
        if (qsH() != null && tN() != null && tN().size() > 1) {
            this.wN = true;
        } else {
            this.wN = false;
            YFl((C0128YFl) null);
        }
        return this.wN;
    }

    public Wwa wN() {
        if (this.f10700vc.size() > 0) {
            return this.f10700vc.get(0);
        }
        return null;
    }

    public void Sg(String str) {
        this.tN = str;
    }

    public void tN(String str) {
        this.qsH = str;
    }

    public void Sg(int i10) {
        this.YoT = i10;
    }

    public void YFl(String str) {
        this.YFl = str;
    }

    public static YFl Sg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            YFl yFl = new YFl();
            JSONObject optJSONObject = jSONObject.optJSONObject("choose_ui_data");
            if (optJSONObject != null) {
                yFl.YFl(optJSONObject);
            }
            yFl.Sg(jSONObject.optInt("multi_ad_style", 0));
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    Wwa YFl = com.bytedance.sdk.openadsdk.core.Sg.YFl(optJSONArray.optJSONObject(i10));
                    if (YFl != null) {
                        YFl.NjR(yFl.eT());
                        arrayList.add(YFl);
                    }
                }
                yFl.YFl(arrayList);
            }
            yFl.YFl(jSONObject.optBoolean("is_choose_ad_original", false));
            yFl.YFl(jSONObject.optString("request_id", ""));
            return yFl;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("AdInfo", "fromJson: ", th2);
            return null;
        }
    }

    public void YFl(int i10) {
        this.Sg = i10;
    }

    public void YFl(Wwa wwa) {
        this.f10700vc.add(wwa);
    }

    public void YFl(List<Wwa> list) {
        this.f10700vc = list;
    }

    public void YFl(qsH qsh) {
        this.DSW.add(qsh);
    }

    public void YFl(long j3) {
        this.NjR = j3;
    }

    public static Map<String, Wwa> YFl(YFl yFl) {
        if (yFl == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Wwa wwa : yFl.tN()) {
            if (!TextUtils.isEmpty(wwa.DjU())) {
                hashMap.put(wwa.DjU(), wwa);
            }
        }
        if (hashMap.size() != 0) {
            return hashMap;
        }
        return null;
    }

    public void YFl(boolean z10) {
        this.f10699nc = z10;
    }

    public void YFl(C0128YFl c0128YFl) {
        this.AlY = c0128YFl;
        if (c0128YFl == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.YFl.Sg.Sg.YFl(Wwa.YFl.YFl(c0128YFl, ""));
    }

    public void YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        YFl(C0128YFl.YFl(jSONObject.optJSONObject("tpl_info")));
    }
}

package com.bytedance.sdk.openadsdk.core.YoT;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl {
    private String AlY;
    private String DSW;
    private String EH;
    private int NjR;
    Sg Sg;
    private String eT;

    /* renamed from: nc, reason: collision with root package name */
    private int f10654nc;
    private double qsH;
    tN tN;

    /* renamed from: vc, reason: collision with root package name */
    private String f10655vc;
    private String wN;
    AlY YFl = new AlY(this);
    private final Set<nc> YoT = new HashSet();
    private String GA = "VAST_ACTION_BUTTON";
    private boolean pDU = false;

    private JSONArray rkt() {
        JSONArray jSONArray = new JSONArray();
        for (nc ncVar : this.YoT) {
            if (ncVar != null) {
                jSONArray.put(ncVar.AlY());
            }
        }
        return jSONArray;
    }

    public String AlY() {
        return this.AlY;
    }

    public String DSW() {
        return this.DSW;
    }

    public void EH() {
        this.pDU = true;
    }

    public int GA() {
        return this.f10654nc;
    }

    public String NjR() {
        tN tNVar;
        String str = this.f10655vc;
        if (!TextUtils.isEmpty(this.EH)) {
            String str2 = this.EH;
            this.EH = null;
            return str2;
        }
        String str3 = this.GA;
        str3.getClass();
        if (!str3.equals("VAST_ICON")) {
            if (str3.equals("VAST_END_CARD") && (tNVar = this.tN) != null && !TextUtils.isEmpty(tNVar.qsH)) {
                str = this.tN.qsH;
            }
        } else {
            Sg sg2 = this.Sg;
            if (sg2 != null && !TextUtils.isEmpty(sg2.qsH)) {
                str = this.Sg.qsH;
            }
        }
        this.GA = "VAST_ACTION_BUTTON";
        return str;
    }

    public Sg Sg() {
        return this.Sg;
    }

    public AlY YFl() {
        return this.YFl;
    }

    public int YoT() {
        return this.NjR;
    }

    public String eT() {
        return this.eT;
    }

    public JSONObject nc() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("videoTrackers", this.YFl.YFl());
        Sg sg2 = this.Sg;
        if (sg2 != null) {
            jSONObject.put("vastIcon", sg2.YFl());
        }
        tN tNVar = this.tN;
        if (tNVar != null) {
            jSONObject.put("endCard", tNVar.YFl());
        }
        jSONObject.put(CampaignEx.JSON_KEY_TITLE, this.AlY);
        jSONObject.put("description", this.wN);
        jSONObject.put("clickThroughUrl", this.f10655vc);
        jSONObject.put("videoUrl", this.DSW);
        jSONObject.put("videDuration", this.qsH);
        jSONObject.put("tag", this.eT);
        jSONObject.put("videoWidth", this.NjR);
        jSONObject.put("videoHeight", this.f10654nc);
        jSONObject.put("viewabilityVendor", rkt());
        return jSONObject;
    }

    public Set<nc> pDU() {
        return this.YoT;
    }

    public double qsH() {
        return this.qsH;
    }

    public tN tN() {
        return this.tN;
    }

    public String vc() {
        return this.f10655vc;
    }

    public String wN() {
        return this.wN;
    }

    public void AlY(String str) {
        this.DSW = str;
    }

    public void DSW(String str) {
        this.EH = str;
    }

    public void Sg(String str) {
        this.wN = str;
    }

    public void YFl(Sg sg2) {
        if (sg2 != null) {
            sg2.YFl(this.DSW);
        }
        this.Sg = sg2;
    }

    public void tN(String str) {
        this.f10655vc = str;
    }

    public void vc(String str) {
        this.eT = str;
        this.YFl.YFl(str);
    }

    public void wN(String str) {
        this.GA = str;
    }

    public void Sg(int i10) {
        this.f10654nc = i10;
    }

    public void YFl(tN tNVar) {
        if (tNVar != null) {
            tNVar.YFl(this.DSW);
        }
        this.tN = tNVar;
    }

    public void YFl(String str) {
        this.AlY = str;
    }

    public void YFl(double d10) {
        this.qsH = d10;
    }

    public static YFl YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        YFl yFl = new YFl();
        yFl.YFl.YFl(jSONObject.optJSONObject("videoTrackers"));
        yFl.Sg = Sg.YFl(jSONObject.optJSONObject("vastIcon"));
        yFl.tN = tN.Sg(jSONObject.optJSONObject("endCard"));
        yFl.AlY = jSONObject.optString(CampaignEx.JSON_KEY_TITLE);
        yFl.wN = jSONObject.optString("description");
        yFl.f10655vc = jSONObject.optString("clickThroughUrl");
        yFl.DSW = jSONObject.optString("videoUrl");
        yFl.qsH = jSONObject.optDouble("videDuration");
        yFl.eT = jSONObject.optString("tag");
        yFl.NjR = jSONObject.optInt("videoWidth");
        yFl.NjR = jSONObject.optInt("videoHeight");
        yFl.YoT.addAll(nc.YFl(jSONObject.optJSONArray("viewabilityVendor")));
        return yFl;
    }

    public void YFl(Wwa wwa) {
        this.YFl.YFl(wwa);
        Sg sg2 = this.Sg;
        if (sg2 != null) {
            sg2.YFl(wwa);
        }
        tN tNVar = this.tN;
        if (tNVar != null) {
            tNVar.YFl(wwa);
        }
    }

    public void YFl(int i10) {
        this.NjR = i10;
    }

    public void YFl(Set<nc> set) {
        if (set == null || set.size() <= 0) {
            return;
        }
        this.YoT.addAll(set);
    }
}

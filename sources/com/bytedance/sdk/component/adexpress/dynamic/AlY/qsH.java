package com.bytedance.sdk.component.adexpress.dynamic.AlY;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qsH {
    private float AlY;
    private float DSW;
    private String GA;
    private wN NjR;
    private float Sg;
    private String YFl;
    private List<List<qsH>> YoT;
    private qsH eT;

    /* renamed from: nc, reason: collision with root package name */
    private List<qsH> f10370nc;
    private boolean pDU;
    private float qsH;
    private float tN;

    /* renamed from: vc, reason: collision with root package name */
    private float f10371vc;
    private float wN;
    private Map<String, String> EH = new HashMap();
    private Map<Integer, String> rkt = new HashMap();

    public float AlY() {
        return this.AlY;
    }

    public float DSW() {
        return this.tN;
    }

    public float EH() {
        vc wN = this.NjR.wN();
        return (wN.YoT() * 2.0f) + wN.rkt() + wN.EH() + GA();
    }

    public int GA() {
        vc wN = this.NjR.wN();
        return wN.dGX() + wN.Bh();
    }

    public boolean Ne() {
        return TextUtils.equals(this.NjR.wN().dXO(), "flex");
    }

    public float NjR() {
        return this.DSW;
    }

    public Map<Integer, String> Sg() {
        return this.rkt;
    }

    public String VOe() {
        return this.NjR.wN().VOe();
    }

    public boolean Wwa() {
        List<qsH> list = this.f10370nc;
        return list == null || list.size() <= 0;
    }

    public String YFl() {
        return this.GA;
    }

    public qsH YoT() {
        return this.eT;
    }

    public Map<String, String> aIu() {
        return this.EH;
    }

    public boolean bZ() {
        if (this.NjR.wN().rE() >= 0 && this.NjR.wN().AfY() >= 0 && this.NjR.wN().DjU() >= 0 && this.NjR.wN().YP() >= 0) {
            return false;
        }
        return true;
    }

    public List<qsH> eT() {
        return this.f10370nc;
    }

    public List<List<qsH>> lG() {
        return this.YoT;
    }

    public wN nc() {
        return this.NjR;
    }

    public int pDU() {
        vc wN = this.NjR.wN();
        return wN.iY() + wN.fIu();
    }

    public boolean qO() {
        return this.pDU;
    }

    public float qsH() {
        return this.f10371vc;
    }

    public float rkt() {
        vc wN = this.NjR.wN();
        return (wN.YoT() * 2.0f) + wN.pDU() + wN.lG() + pDU();
    }

    public String tN() {
        return this.YFl;
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.YFl + "', x=" + this.Sg + ", y=" + this.tN + ", width=" + this.f10371vc + ", height=" + this.DSW + ", remainWidth=" + this.qsH + ", rootBrick=" + this.NjR + ", childrenBrickUnits=" + this.f10370nc + AbstractJsonLexerKt.END_OBJ;
    }

    public float vc() {
        return this.Sg;
    }

    public float wN() {
        return this.wN;
    }

    public void wXo() {
        List<List<qsH>> list = this.YoT;
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (List<qsH> list2 : this.YoT) {
                if (list2 != null && list2.size() > 0) {
                    arrayList.add(list2);
                }
            }
            this.YoT = arrayList;
        }
    }

    public void AlY(float f10) {
        this.tN = f10;
    }

    public void DSW(float f10) {
        this.qsH = f10;
    }

    public void Sg(String str) {
        this.YFl = str;
    }

    public void YFl(String str) {
        this.GA = str;
    }

    public void tN(float f10) {
        this.Sg = f10;
    }

    public void vc(float f10) {
        this.DSW = f10;
    }

    public void wN(float f10) {
        this.f10371vc = f10;
    }

    public void Sg(float f10) {
        this.wN = f10;
    }

    public void YFl(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    this.rkt.put(Integer.valueOf(optJSONObject.optInt("id")), optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void tN(String str) {
        this.NjR.wN().vc(str);
    }

    public void Sg(List<List<qsH>> list) {
        this.YoT = list;
    }

    public void YFl(float f10) {
        this.AlY = f10;
    }

    public void YFl(wN wNVar) {
        this.NjR = wNVar;
    }

    public void YFl(List<qsH> list) {
        this.f10370nc = list;
    }

    public void YFl(qsH qsh) {
        this.eT = qsh;
    }

    public void YFl(boolean z10) {
        this.pDU = z10;
    }

    public void YFl(String str, String str2) {
        this.EH.put(str, str2);
    }

    public String YFl(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.NjR.Sg());
        sb2.append(":");
        sb2.append(this.YFl);
        if (this.NjR.wN() != null) {
            sb2.append(":");
            sb2.append(this.NjR.wN().pm());
        }
        sb2.append(":");
        sb2.append(i10);
        return sb2.toString();
    }
}

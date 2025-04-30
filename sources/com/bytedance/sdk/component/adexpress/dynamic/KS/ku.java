package com.bytedance.sdk.component.adexpress.dynamic.KS;

import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ku {
    private ku Bj;
    private float COT;
    private float HWF;
    private float KS;
    private float QR;
    private COT YW;
    private List<ku> dT;
    private float jU;
    private float ku;
    private float lMd;
    private boolean rV;
    private String tG;
    private List<List<ku>> vDp;
    private String zp;
    private Map<String, String> dQp = new HashMap();
    private Map<Integer, String> KVG = new HashMap();

    public List<ku> Bj() {
        return this.dT;
    }

    public float COT() {
        return this.COT;
    }

    public void FP() {
        List<List<ku>> list = this.vDp;
        if (list != null && list.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (List<ku> list2 : this.vDp) {
                if (list2 != null && list2.size() > 0) {
                    arrayList.add(list2);
                }
            }
            this.vDp = arrayList;
        }
    }

    public float HWF() {
        return this.lMd;
    }

    public String KS() {
        return this.zp;
    }

    public float KVG() {
        HWF COT = this.YW.COT();
        return (COT.vDp() * 2.0f) + COT.rV() + COT.woN() + rV();
    }

    public float QR() {
        return this.KS;
    }

    public float YW() {
        return this.QR;
    }

    public Map<String, String> cz() {
        return this.dQp;
    }

    public float dQp() {
        HWF COT = this.YW.COT();
        return (COT.vDp() * 2.0f) + COT.KVG() + COT.dQp() + tG();
    }

    public COT dT() {
        return this.YW;
    }

    public float jU() {
        return this.jU;
    }

    public float ku() {
        return this.HWF;
    }

    public Map<Integer, String> lMd() {
        return this.KVG;
    }

    public boolean ot() {
        return TextUtils.equals(this.YW.COT().irS(), "flex");
    }

    public boolean ox() {
        if (this.YW.COT().Eg() >= 0 && this.YW.COT().TS() >= 0 && this.YW.COT().vLi() >= 0 && this.YW.COT().bQm() >= 0) {
            return false;
        }
        return true;
    }

    public boolean pvr() {
        return this.rV;
    }

    public int rV() {
        HWF COT = this.YW.COT();
        return COT.DY() + COT.si();
    }

    public int tG() {
        HWF COT = this.YW.COT();
        return COT.gH() + COT.Rh();
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.zp + "', x=" + this.lMd + ", y=" + this.KS + ", width=" + this.HWF + ", height=" + this.QR + ", remainWidth=" + this.ku + ", rootBrick=" + this.YW + ", childrenBrickUnits=" + this.dT + '}';
    }

    public ku vDp() {
        return this.Bj;
    }

    public boolean vwr() {
        List<ku> list = this.dT;
        if (list != null && list.size() > 0) {
            return false;
        }
        return true;
    }

    public List<List<ku>> woN() {
        return this.vDp;
    }

    public String yRU() {
        return this.YW.COT().yRU();
    }

    public String zp() {
        return this.tG;
    }

    public void COT(float f9) {
        this.HWF = f9;
    }

    public void HWF(float f9) {
        this.QR = f9;
    }

    public void KS(float f9) {
        this.lMd = f9;
    }

    public void QR(float f9) {
        this.ku = f9;
    }

    public void jU(float f9) {
        this.KS = f9;
    }

    public void lMd(String str) {
        this.zp = str;
    }

    public void zp(String str) {
        this.tG = str;
    }

    public void KS(String str) {
        this.YW.COT().HWF(str);
    }

    public void lMd(float f9) {
        this.COT = f9;
    }

    public void zp(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i9);
                    this.KVG.put(Integer.valueOf(optJSONObject.optInt("id")), optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void lMd(List<List<ku>> list) {
        this.vDp = list;
    }

    public void zp(float f9) {
        this.jU = f9;
    }

    public void zp(COT cot) {
        this.YW = cot;
    }

    public void zp(List<ku> list) {
        this.dT = list;
    }

    public void zp(ku kuVar) {
        this.Bj = kuVar;
    }

    public void zp(boolean z8) {
        this.rV = z8;
    }

    public void zp(String str, String str2) {
        this.dQp.put(str, str2);
    }

    public String zp(int i9) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.YW.lMd());
        sb.append(":");
        sb.append(this.zp);
        if (this.YW.COT() != null) {
            sb.append(":");
            sb.append(this.YW.COT().sm());
        }
        sb.append(":");
        sb.append(i9);
        return sb.toString();
    }
}

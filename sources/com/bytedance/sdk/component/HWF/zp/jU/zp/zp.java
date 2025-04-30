package com.bytedance.sdk.component.HWF.zp.jU.zp;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp implements com.bytedance.sdk.component.HWF.zp.jU.zp {
    private String Bj;
    private long COT;
    private long HWF;
    private byte KS;
    private long QR;
    private String YW;
    private byte dT;
    private byte jU;
    private String ku;
    private lMd lMd;
    private int vDp;
    protected JSONObject zp;

    public zp(String str, JSONObject jSONObject) {
        this.YW = str;
        this.zp = jSONObject;
    }

    public static com.bytedance.sdk.component.HWF.zp.jU.zp KS(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("type");
            int optInt2 = jSONObject.optInt("priority");
            zp zpVar = new zp();
            zpVar.zp((byte) optInt);
            zpVar.lMd((byte) optInt2);
            zpVar.zp(jSONObject.optJSONObject(NotificationCompat.CATEGORY_EVENT));
            zpVar.zp(jSONObject.optString("localId"));
            zpVar.lMd(jSONObject.optString("genTime"));
            zpVar.zp(jSONObject.optInt("channel"));
            return zpVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String Bj() {
        return this.Bj;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public byte COT() {
        return this.jU;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public String HWF() {
        if (!TextUtils.isEmpty(this.YW)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("localId", this.YW);
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, QR());
                jSONObject.put("genTime", vDp());
                jSONObject.put("priority", (int) this.jU);
                jSONObject.put("type", (int) this.KS);
                jSONObject.put("channel", this.vDp);
            } catch (Throwable unused) {
            }
            return jSONObject.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public synchronized JSONObject QR() {
        lMd lmd;
        try {
            if (this.zp == null && (lmd = this.lMd) != null) {
                this.zp = lmd.zp(Bj());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zp;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public long YW() {
        return this.HWF;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public int dT() {
        return this.vDp;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public byte jU() {
        return this.KS;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public long ku() {
        return this.COT;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public byte lMd() {
        return this.dT;
    }

    public String vDp() {
        return this.ku;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public lMd zp() {
        return this.lMd;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public void lMd(String str) {
        this.ku = str;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public void zp(JSONObject jSONObject) {
        this.zp = jSONObject;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public void lMd(long j7) {
        this.HWF = j7;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public void zp(byte b) {
        this.KS = b;
    }

    public zp(String str, lMd lmd) {
        this.YW = str;
        this.lMd = lmd;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public void lMd(byte b) {
        this.jU = b;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public void zp(String str) {
        this.YW = str;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public void zp(long j7) {
        this.COT = j7;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public void zp(int i9) {
        this.vDp = i9;
    }

    private zp() {
    }

    public void KS(byte b) {
        this.dT = b;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public String KS() {
        return this.YW;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp
    public void KS(long j7) {
        this.QR = j7;
    }
}

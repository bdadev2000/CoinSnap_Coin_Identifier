package com.bytedance.sdk.component.vc.YFl.AlY.YFl;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl implements com.bytedance.sdk.component.vc.YFl.AlY.YFl {
    private byte AlY;
    private long DSW;
    private String NjR;
    private Sg Sg;
    protected JSONObject YFl;
    private int YoT;
    private String eT;

    /* renamed from: nc, reason: collision with root package name */
    private byte f10446nc;
    private String qsH;
    private byte tN;

    /* renamed from: vc, reason: collision with root package name */
    private long f10447vc;
    private long wN;

    public YFl(String str, JSONObject jSONObject) {
        this.NjR = str;
        this.YFl = jSONObject;
    }

    public static com.bytedance.sdk.component.vc.YFl.AlY.YFl tN(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("type");
            int optInt2 = jSONObject.optInt("priority");
            YFl yFl = new YFl();
            yFl.YFl((byte) optInt);
            yFl.Sg((byte) optInt2);
            yFl.YFl(jSONObject.optJSONObject(NotificationCompat.CATEGORY_EVENT));
            yFl.YFl(jSONObject.optString("localId"));
            yFl.Sg(jSONObject.optString("genTime"));
            yFl.YFl(jSONObject.optInt("channel"));
            return yFl;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public byte AlY() {
        return this.tN;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public synchronized JSONObject DSW() {
        Sg sg2;
        if (this.YFl == null && (sg2 = this.Sg) != null) {
            this.YFl = sg2.YFl(eT());
        }
        return this.YFl;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public long NjR() {
        return this.f10447vc;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public byte Sg() {
        return this.f10446nc;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public Sg YFl() {
        return this.Sg;
    }

    public String YoT() {
        return this.qsH;
    }

    public String eT() {
        return this.eT;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public int nc() {
        return this.YoT;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public long qsH() {
        return this.wN;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public String vc() {
        if (!TextUtils.isEmpty(this.NjR)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("localId", this.NjR);
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, DSW());
                jSONObject.put("genTime", YoT());
                jSONObject.put("priority", (int) this.AlY);
                jSONObject.put("type", (int) this.tN);
                jSONObject.put("channel", this.YoT);
            } catch (Throwable unused) {
            }
            return jSONObject.toString();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public byte wN() {
        return this.AlY;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public void Sg(String str) {
        this.qsH = str;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public void YFl(JSONObject jSONObject) {
        this.YFl = jSONObject;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public void Sg(long j3) {
        this.f10447vc = j3;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public void YFl(byte b3) {
        this.tN = b3;
    }

    public YFl(String str, Sg sg2) {
        this.NjR = str;
        this.Sg = sg2;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public void Sg(byte b3) {
        this.AlY = b3;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public void YFl(String str) {
        this.NjR = str;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public void YFl(long j3) {
        this.wN = j3;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public void YFl(int i10) {
        this.YoT = i10;
    }

    private YFl() {
    }

    public void tN(byte b3) {
        this.f10446nc = b3;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public String tN() {
        return this.NjR;
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl
    public void tN(long j3) {
        this.DSW = j3;
    }
}

package com.bytedance.sdk.openadsdk.dT.zp;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.bytedance.sdk.component.lMd.zp.rV;
import com.bytedance.sdk.component.utils.tG;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.vungle.ads.internal.signals.j;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class jU {
    public static int zp = -10;
    private int Bj;
    private long COT;
    private long HWF;
    private String KS;
    private int QR;
    private boolean YW;
    private String dT;
    private long jU;
    private int ku;
    private final int lMd;

    public jU(int i9) {
        this.lMd = i9;
    }

    public jU KS(String str) {
        byte[] bytes;
        if (!TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.ku = bytes.length;
        }
        return this;
    }

    public jU jU(String str) {
        this.dT = str;
        return this;
    }

    public jU lMd(String str) {
        byte[] bytes;
        if (!TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.QR = bytes.length;
        }
        return this;
    }

    public jU zp(String str) {
        this.KS = str;
        return this;
    }

    public static void jU() {
        synchronized (jU.class) {
            try {
                long zp2 = com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_sdk_req_monitor", "req_monitor_las_req", 0L);
                if (zp2 <= 0) {
                    com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_sdk_req_monitor", "req_monitor_las_req", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                if (System.currentTimeMillis() - zp2 >= j.TWENTY_FOUR_HOURS_MILLIS) {
                    String lMd = com.bytedance.sdk.openadsdk.multipro.jU.jU.lMd("tt_sdk_req_monitor", "req_monitor_data", null);
                    if (!TextUtils.isEmpty(lMd)) {
                        com.bytedance.sdk.openadsdk.dT.KS.KS(lMd);
                        com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_sdk_req_monitor");
                        com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_sdk_req_monitor", "req_monitor_las_req", Long.valueOf(System.currentTimeMillis()));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public jU zp(rV rVVar) {
        byte[] bArr;
        if (rVVar != null) {
            if (rVVar.HWF == rV.zp.STRING_TYPE && !TextUtils.isEmpty(rVVar.zp())) {
                this.QR = rVVar.zp().getBytes().length;
            }
            if (rVVar.HWF == rV.zp.BYTE_ARRAY_TYPE && (bArr = rVVar.COT) != null) {
                this.QR = bArr.length;
            }
        }
        return this;
    }

    public void KS() {
        this.COT = SystemClock.elapsedRealtime() - this.jU;
        QUv.KS().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dT.zp.jU.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                zp zpVar;
                zp zpVar2;
                synchronized (jU.class) {
                    try {
                        String lMd = com.bytedance.sdk.openadsdk.multipro.jU.jU.lMd("tt_sdk_req_monitor", "req_monitor_data", null);
                        try {
                            if (TextUtils.isEmpty(lMd)) {
                                jSONObject = new JSONObject();
                            } else {
                                jSONObject = new JSONObject(lMd);
                            }
                        } catch (Exception e4) {
                            tG.lMd(e4.getMessage());
                        }
                        if (jSONObject.has(jU.this.KS)) {
                            JSONObject optJSONObject = jSONObject.optJSONObject(jU.this.KS);
                            if (optJSONObject != null) {
                                zpVar2 = zp.zp(optJSONObject);
                                zpVar2.zp(jU.this.YW, jU.this.COT, jU.this.QR, jU.this.ku, jU.this.Bj);
                                jSONObject.put(jU.this.KS, zpVar2.zp());
                                com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_sdk_req_monitor", "req_monitor_data", jSONObject.toString());
                            } else {
                                zpVar = new zp(jU.this.lMd, jU.this.YW, jU.this.COT, jU.this.QR, jU.this.ku, jU.this.Bj);
                            }
                        } else {
                            zpVar = new zp(jU.this.lMd, jU.this.YW, jU.this.COT, jU.this.QR, jU.this.ku, jU.this.Bj);
                        }
                        zpVar2 = zpVar;
                        jSONObject.put(jU.this.KS, zpVar2.zp());
                        com.bytedance.sdk.openadsdk.multipro.jU.jU.zp("tt_sdk_req_monitor", "req_monitor_data", jSONObject.toString());
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    public void lMd() {
        this.HWF = SystemClock.elapsedRealtime() - this.jU;
    }

    /* loaded from: classes.dex */
    public static class zp {
        private long COT;
        private int HWF;
        private int KS;
        private int QR;
        private long jU;
        private final SparseIntArray ku;
        private int lMd;
        private int zp;

        public zp() {
            this.zp = 0;
            this.lMd = 0;
            this.KS = 0;
            this.jU = 0L;
            this.COT = 0L;
            this.HWF = 0;
            this.QR = 0;
            this.ku = new SparseIntArray();
        }

        public void zp(boolean z8, long j7, int i9, int i10, int i11) {
            if (!z8) {
                this.ku.put(i11, this.ku.get(i11) + 1);
            }
            int i12 = this.lMd;
            int i13 = this.KS;
            int i14 = i12 + i13;
            int i15 = (this.HWF * i14) + i9;
            int i16 = i14 + 1;
            this.HWF = i15 / i16;
            this.QR = ((this.QR * i14) + i10) / i16;
            if (z8) {
                long j9 = (this.jU * i12) + j7;
                int i17 = i12 + 1;
                this.lMd = i17;
                this.jU = j9 / i17;
                return;
            }
            long j10 = (this.COT * i13) + j7;
            int i18 = i13 + 1;
            this.KS = i18;
            this.COT = j10 / i18;
        }

        public static zp zp(JSONObject jSONObject) {
            zp zpVar = new zp();
            zpVar.zp = jSONObject.optInt("type", 0);
            zpVar.lMd = jSONObject.optInt("suc_times", 0);
            zpVar.KS = jSONObject.optInt("fail_times", 0);
            zpVar.jU = jSONObject.optLong("suc_duration", 0L);
            zpVar.COT = jSONObject.optLong("fail_duration", 0L);
            zpVar.HWF = jSONObject.optInt("req_size", 0);
            zpVar.QR = jSONObject.optInt("res_size", 0);
            JSONObject optJSONObject = jSONObject.optJSONObject("codes");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    zpVar.ku.put(Integer.parseInt(next), optJSONObject.optInt(next));
                }
            }
            return zpVar;
        }

        public zp(int i9, boolean z8, long j7, int i10, int i11, int i12) {
            this.zp = 0;
            this.lMd = 0;
            this.KS = 0;
            this.jU = 0L;
            this.COT = 0L;
            this.HWF = 0;
            this.QR = 0;
            SparseIntArray sparseIntArray = new SparseIntArray();
            this.ku = sparseIntArray;
            this.zp = i9;
            if (z8) {
                this.lMd++;
                this.jU = j7;
            } else {
                this.KS++;
                this.COT = j7;
                sparseIntArray.put(i12, 1);
            }
            this.HWF = i10;
            this.QR = i11;
        }

        public JSONObject zp() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", this.zp);
                jSONObject.put("suc_times", this.lMd);
                jSONObject.put("fail_times", this.KS);
                jSONObject.put("suc_duration", this.jU);
                jSONObject.put("fail_duration", this.COT);
                jSONObject.put("req_size", this.HWF);
                jSONObject.put("res_size", this.QR);
                JSONObject jSONObject2 = new JSONObject();
                for (int i9 = 0; i9 < this.ku.size(); i9++) {
                    jSONObject2.put(String.valueOf(this.ku.keyAt(i9)), this.ku.valueAt(i9));
                }
                jSONObject.put("codes", jSONObject2);
            } catch (Exception e4) {
                tG.lMd(e4.getMessage());
            }
            return jSONObject;
        }
    }

    public void zp() {
        this.jU = SystemClock.elapsedRealtime();
    }

    public jU zp(int i9) {
        this.Bj = i9;
        return this;
    }

    public jU zp(boolean z8) {
        this.YW = z8;
        return this;
    }
}

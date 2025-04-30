package com.bytedance.sdk.openadsdk.lMd;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class QR {
    private long COT;
    private long KS;
    private long jU;
    private long lMd;
    private long zp;

    public void COT(long j7) {
        if (this.COT <= 0) {
            this.COT = j7;
        }
    }

    public void KS(long j7) {
        if (this.KS <= 0) {
            this.KS = j7;
        }
    }

    public void jU(long j7) {
        if (this.jU <= 0) {
            this.jU = j7;
        }
    }

    public void lMd(long j7) {
        if (this.lMd <= 0) {
            this.lMd = j7;
        }
    }

    public void zp(long j7) {
        if (this.zp <= 0) {
            this.zp = j7;
        }
    }

    public JSONObject lMd() {
        return zp((JSONObject) null);
    }

    public boolean zp() {
        return this.zp > 0;
    }

    public void zp(long j7, float f9) {
        if (f9 > 0.0f) {
            zp(j7);
        }
        double d2 = f9;
        if (d2 >= 0.25d) {
            zp(j7);
            lMd(j7);
        }
        if (d2 >= 0.5d) {
            zp(j7);
            lMd(j7);
            KS(j7);
        }
        if (d2 >= 0.75d) {
            zp(j7);
            lMd(j7);
            KS(j7);
            jU(j7);
        }
        if (f9 >= 1.0f) {
            zp(j7);
            lMd(j7);
            KS(j7);
            jU(j7);
            COT(j7);
        }
    }

    public JSONObject zp(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j7 = this.zp;
        if (j7 > 0) {
            jSONObject.put("show_start", j7);
            long j9 = this.lMd;
            if (j9 > 0) {
                jSONObject.put("show_firstQuartile", j9);
                long j10 = this.KS;
                if (j10 > 0) {
                    jSONObject.put("show_mid", j10);
                    long j11 = this.jU;
                    if (j11 > 0) {
                        jSONObject.put("show_thirdQuartile", j11);
                        long j12 = this.COT;
                        if (j12 > 0) {
                            jSONObject.put("show_full", j12);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}

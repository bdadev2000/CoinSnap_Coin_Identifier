package com.bytedance.sdk.openadsdk.AlY;

import org.json.JSONObject;

/* loaded from: classes.dex */
public class DSW {
    private long AlY;
    private long Sg;
    private long YFl;
    private long tN;
    private long wN;

    public void AlY(long j3) {
        if (this.AlY <= 0) {
            this.AlY = j3;
        }
    }

    public void Sg(long j3) {
        if (this.Sg <= 0) {
            this.Sg = j3;
        }
    }

    public void YFl(long j3) {
        if (this.YFl <= 0) {
            this.YFl = j3;
        }
    }

    public void tN(long j3) {
        if (this.tN <= 0) {
            this.tN = j3;
        }
    }

    public void wN(long j3) {
        if (this.wN <= 0) {
            this.wN = j3;
        }
    }

    public JSONObject Sg() {
        return YFl((JSONObject) null);
    }

    public boolean YFl() {
        return this.YFl > 0;
    }

    public void YFl(long j3, float f10) {
        if (f10 > 0.0f) {
            YFl(j3);
        }
        double d10 = f10;
        if (d10 >= 0.25d) {
            YFl(j3);
            Sg(j3);
        }
        if (d10 >= 0.5d) {
            YFl(j3);
            Sg(j3);
            tN(j3);
        }
        if (d10 >= 0.75d) {
            YFl(j3);
            Sg(j3);
            tN(j3);
            AlY(j3);
        }
        if (f10 >= 1.0f) {
            YFl(j3);
            Sg(j3);
            tN(j3);
            AlY(j3);
            wN(j3);
        }
    }

    public JSONObject YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        long j3 = this.YFl;
        if (j3 > 0) {
            jSONObject.put("show_start", j3);
            long j10 = this.Sg;
            if (j10 > 0) {
                jSONObject.put("show_firstQuartile", j10);
                long j11 = this.tN;
                if (j11 > 0) {
                    jSONObject.put("show_mid", j11);
                    long j12 = this.AlY;
                    if (j12 > 0) {
                        jSONObject.put("show_thirdQuartile", j12);
                        long j13 = this.wN;
                        if (j13 > 0) {
                            jSONObject.put("show_full", j13);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }
}

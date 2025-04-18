package com.bytedance.sdk.openadsdk.pDU.YFl;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.bytedance.sdk.component.Sg.YFl.pDU;
import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.vungle.ads.internal.signals.j;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class wN {
    public static int YFl = -10;
    private long AlY;
    private int DSW;
    private boolean NjR;
    private final int Sg;
    private int eT;

    /* renamed from: nc, reason: collision with root package name */
    private String f10783nc;
    private int qsH;
    private String tN;

    /* renamed from: vc, reason: collision with root package name */
    private long f10784vc;
    private long wN;

    public wN(int i10) {
        this.Sg = i10;
    }

    public wN AlY(String str) {
        this.f10783nc = str;
        return this;
    }

    public wN Sg(String str) {
        byte[] bytes;
        if (!TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.DSW = bytes.length;
        }
        return this;
    }

    public wN YFl(String str) {
        this.tN = str;
        return this;
    }

    public wN tN(String str) {
        byte[] bytes;
        if (!TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.qsH = bytes.length;
        }
        return this;
    }

    public static void AlY() {
        synchronized (wN.class) {
            long YFl2 = com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_sdk_req_monitor", "req_monitor_las_req", 0L);
            if (YFl2 <= 0) {
                com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_sdk_req_monitor", "req_monitor_las_req", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (System.currentTimeMillis() - YFl2 >= j.TWENTY_FOUR_HOURS_MILLIS) {
                String Sg = com.bytedance.sdk.openadsdk.multipro.AlY.AlY.Sg("tt_sdk_req_monitor", "req_monitor_data", null);
                if (!TextUtils.isEmpty(Sg)) {
                    com.bytedance.sdk.openadsdk.pDU.tN.tN(Sg);
                    com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_sdk_req_monitor");
                    com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_sdk_req_monitor", "req_monitor_las_req", Long.valueOf(System.currentTimeMillis()));
                }
            }
        }
    }

    public wN YFl(pDU pdu) {
        byte[] bArr;
        if (pdu != null) {
            if (pdu.f10338vc == pDU.YFl.STRING_TYPE && !TextUtils.isEmpty(pdu.YFl())) {
                this.DSW = pdu.YFl().getBytes().length;
            }
            if (pdu.f10338vc == pDU.YFl.BYTE_ARRAY_TYPE && (bArr = pdu.wN) != null) {
                this.DSW = bArr.length;
            }
        }
        return this;
    }

    public void Sg() {
        this.f10784vc = SystemClock.elapsedRealtime() - this.AlY;
    }

    public void tN() {
        this.wN = SystemClock.elapsedRealtime() - this.AlY;
        mn.tN().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.pDU.YFl.wN.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                YFl yFl;
                YFl yFl2;
                synchronized (wN.class) {
                    String Sg = com.bytedance.sdk.openadsdk.multipro.AlY.AlY.Sg("tt_sdk_req_monitor", "req_monitor_data", null);
                    try {
                        if (TextUtils.isEmpty(Sg)) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = new JSONObject(Sg);
                        }
                    } catch (Exception e2) {
                        YoT.Sg(e2.getMessage());
                    }
                    if (jSONObject.has(wN.this.tN)) {
                        JSONObject optJSONObject = jSONObject.optJSONObject(wN.this.tN);
                        if (optJSONObject != null) {
                            yFl2 = YFl.YFl(optJSONObject);
                            yFl2.YFl(wN.this.NjR, wN.this.wN, wN.this.DSW, wN.this.qsH, wN.this.eT);
                            jSONObject.put(wN.this.tN, yFl2.YFl());
                            com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_sdk_req_monitor", "req_monitor_data", jSONObject.toString());
                        } else {
                            yFl = new YFl(wN.this.Sg, wN.this.NjR, wN.this.wN, wN.this.DSW, wN.this.qsH, wN.this.eT);
                        }
                    } else {
                        yFl = new YFl(wN.this.Sg, wN.this.NjR, wN.this.wN, wN.this.DSW, wN.this.qsH, wN.this.eT);
                    }
                    yFl2 = yFl;
                    jSONObject.put(wN.this.tN, yFl2.YFl());
                    com.bytedance.sdk.openadsdk.multipro.AlY.AlY.YFl("tt_sdk_req_monitor", "req_monitor_data", jSONObject.toString());
                }
            }
        });
    }

    /* loaded from: classes.dex */
    public static class YFl {
        private long AlY;
        private int DSW;
        private int Sg;
        private int YFl;
        private final SparseIntArray qsH;
        private int tN;

        /* renamed from: vc, reason: collision with root package name */
        private int f10785vc;
        private long wN;

        public YFl() {
            this.YFl = 0;
            this.Sg = 0;
            this.tN = 0;
            this.AlY = 0L;
            this.wN = 0L;
            this.f10785vc = 0;
            this.DSW = 0;
            this.qsH = new SparseIntArray();
        }

        public void YFl(boolean z10, long j3, int i10, int i11, int i12) {
            if (!z10) {
                this.qsH.put(i12, this.qsH.get(i12) + 1);
            }
            int i13 = this.Sg;
            int i14 = this.tN;
            int i15 = i13 + i14;
            int i16 = (this.f10785vc * i15) + i10;
            int i17 = i15 + 1;
            this.f10785vc = i16 / i17;
            this.DSW = ((this.DSW * i15) + i11) / i17;
            if (z10) {
                long j10 = (this.AlY * i13) + j3;
                int i18 = i13 + 1;
                this.Sg = i18;
                this.AlY = j10 / i18;
                return;
            }
            long j11 = (this.wN * i14) + j3;
            int i19 = i14 + 1;
            this.tN = i19;
            this.wN = j11 / i19;
        }

        public static YFl YFl(JSONObject jSONObject) {
            YFl yFl = new YFl();
            yFl.YFl = jSONObject.optInt("type", 0);
            yFl.Sg = jSONObject.optInt("suc_times", 0);
            yFl.tN = jSONObject.optInt("fail_times", 0);
            yFl.AlY = jSONObject.optLong("suc_duration", 0L);
            yFl.wN = jSONObject.optLong("fail_duration", 0L);
            yFl.f10785vc = jSONObject.optInt("req_size", 0);
            yFl.DSW = jSONObject.optInt("res_size", 0);
            JSONObject optJSONObject = jSONObject.optJSONObject("codes");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    yFl.qsH.put(Integer.parseInt(next), optJSONObject.optInt(next));
                }
            }
            return yFl;
        }

        public YFl(int i10, boolean z10, long j3, int i11, int i12, int i13) {
            this.YFl = 0;
            this.Sg = 0;
            this.tN = 0;
            this.AlY = 0L;
            this.wN = 0L;
            this.f10785vc = 0;
            this.DSW = 0;
            SparseIntArray sparseIntArray = new SparseIntArray();
            this.qsH = sparseIntArray;
            this.YFl = i10;
            if (z10) {
                this.Sg++;
                this.AlY = j3;
            } else {
                this.tN++;
                this.wN = j3;
                sparseIntArray.put(i13, 1);
            }
            this.f10785vc = i11;
            this.DSW = i12;
        }

        public JSONObject YFl() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", this.YFl);
                jSONObject.put("suc_times", this.Sg);
                jSONObject.put("fail_times", this.tN);
                jSONObject.put("suc_duration", this.AlY);
                jSONObject.put("fail_duration", this.wN);
                jSONObject.put("req_size", this.f10785vc);
                jSONObject.put("res_size", this.DSW);
                JSONObject jSONObject2 = new JSONObject();
                for (int i10 = 0; i10 < this.qsH.size(); i10++) {
                    jSONObject2.put(String.valueOf(this.qsH.keyAt(i10)), this.qsH.valueAt(i10));
                }
                jSONObject.put("codes", jSONObject2);
            } catch (Exception e2) {
                YoT.Sg(e2.getMessage());
            }
            return jSONObject;
        }
    }

    public void YFl() {
        this.AlY = SystemClock.elapsedRealtime();
    }

    public wN YFl(int i10) {
        this.eT = i10;
        return this;
    }

    public wN YFl(boolean z10) {
        this.NjR = z10;
        return this;
    }
}

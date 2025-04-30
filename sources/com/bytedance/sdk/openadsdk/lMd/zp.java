package com.bytedance.sdk.openadsdk.lMd;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.cz;
import com.bytedance.sdk.openadsdk.core.model.woN;
import com.bytedance.sdk.openadsdk.utils.FP;
import com.bytedance.sdk.openadsdk.utils.QUv;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zp implements com.bytedance.sdk.component.HWF.zp.jU.zp.lMd {
    private static final Set<String> dT = new HashSet(Arrays.asList("insight_log"));
    private final AtomicBoolean Bj;
    private long COT;
    private String FP;
    private final String HWF;
    private boolean KS;
    private String KVG;
    private int QR;
    private int YW;
    private String cz;
    private String dQp;
    private long jU;
    private int ku;
    protected final JSONObject lMd;
    private int ot;
    private com.bytedance.sdk.openadsdk.lMd.lMd.zp pvr;
    private String rV;
    private String tG;
    private JSONObject vDp;
    private String vwr;
    private String woN;
    private String yRU;
    public final String zp;

    /* renamed from: com.bytedance.sdk.openadsdk.lMd.zp$zp, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0124zp {
        private String Bj;
        private String COT;
        private String HWF;
        private String KS;
        private final long KVG;
        private String QR;
        private String YW;
        private com.bytedance.sdk.openadsdk.lMd.lMd.zp dQp;
        private JSONObject dT;
        private String jU;
        private String ku;
        private String lMd;
        private boolean pvr;
        private com.bytedance.sdk.openadsdk.lMd.lMd.lMd rV;
        private String tG;
        private final int vDp;
        private int vwr;
        private int woN;
        public int zp;

        public C0124zp(long j7, woN won) {
            this.woN = -1;
            this.vwr = -1;
            this.zp = -1;
            if (won != null) {
                this.pvr = cz.lMd(won);
                this.woN = won.dQp();
                this.vwr = won.rV();
                this.zp = won.mW();
            }
            this.KVG = j7;
            this.vDp = com.bytedance.sdk.component.utils.KVG.KS(com.bytedance.sdk.openadsdk.core.KVG.zp());
        }

        public C0124zp COT(String str) {
            this.HWF = str;
            return this;
        }

        public C0124zp HWF(String str) {
            this.ku = str;
            return this;
        }

        public C0124zp KS(String str) {
            this.jU = str;
            return this;
        }

        public C0124zp QR(String str) {
            this.YW = str;
            return this;
        }

        public C0124zp jU(String str) {
            this.COT = str;
            return this;
        }

        public C0124zp ku(String str) {
            this.QR = str;
            return this;
        }

        public C0124zp lMd(String str) {
            this.KS = str;
            return this;
        }

        public C0124zp zp(String str) {
            this.tG = str;
            return this;
        }

        public C0124zp zp(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.dT = jSONObject;
            return this;
        }

        public void zp(com.bytedance.sdk.openadsdk.lMd.lMd.zp zpVar) {
            this.dQp = zpVar;
            final zp zpVar2 = new zp(this);
            try {
                com.bytedance.sdk.openadsdk.lMd.lMd.lMd lmd = this.rV;
                if (lmd != null) {
                    lmd.zp(zpVar2.lMd, this.KVG);
                } else {
                    new com.bytedance.sdk.openadsdk.lMd.lMd.KS().zp(zpVar2.lMd, this.KVG);
                }
            } catch (Throwable unused) {
            }
            if (com.bytedance.sdk.openadsdk.multipro.lMd.KS()) {
                QUv.KS(new com.bytedance.sdk.component.ku.ku("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.lMd.zp.zp.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.lMd.zp.jU.zp(zpVar2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.lMd.zp.jU.zp(zpVar2);
            }
        }
    }

    public zp(String str, JSONObject jSONObject) {
        this.HWF = "adiff";
        this.Bj = new AtomicBoolean(false);
        this.vDp = new JSONObject();
        this.zp = str;
        this.lMd = jSONObject;
    }

    private void HWF() {
        JSONObject jSONObject = this.vDp;
        if (jSONObject == null) {
            if (!zp(this.KVG, this.dQp, this.FP)) {
                return;
            }
        } else {
            String optString = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            String optString2 = this.vDp.optString("category");
            String optString3 = this.vDp.optString("log_extra");
            if (zp(this.KVG, this.dQp, this.FP)) {
                if (!TextUtils.isEmpty(optString) && TextUtils.equals(optString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(optString2) && !lMd(optString2)) {
                    return;
                }
            } else if ((!TextUtils.isEmpty(optString) && !TextUtils.equals(optString, "0")) || (!TextUtils.isEmpty(this.KVG) && !TextUtils.equals(this.KVG, "0"))) {
                if ((!TextUtils.isEmpty(this.dQp) && lMd(this.dQp)) || (!TextUtils.isEmpty(optString2) && lMd(optString2))) {
                    if (TextUtils.isEmpty(this.FP) && TextUtils.isEmpty(optString3)) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.jU = com.bytedance.sdk.openadsdk.lMd.zp.jU.zp.incrementAndGet();
    }

    private void QR() throws JSONException {
        this.lMd.putOpt("app_log_url", this.yRU);
        this.lMd.putOpt("tag", this.tG);
        this.lMd.putOpt("label", this.rV);
        this.lMd.putOpt("category", this.dQp);
        if (!TextUtils.isEmpty(this.KVG)) {
            try {
                this.lMd.putOpt(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(Long.parseLong(this.KVG)));
            } catch (NumberFormatException unused) {
                this.lMd.putOpt(AppMeasurementSdk.ConditionalUserProperty.VALUE, 0L);
            }
        }
        if (!TextUtils.isEmpty(this.vwr)) {
            try {
                this.lMd.putOpt("ext_value", Long.valueOf(Long.parseLong(this.vwr)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.FP)) {
            this.lMd.putOpt("log_extra", this.FP);
        }
        if (!TextUtils.isEmpty(this.cz)) {
            try {
                this.lMd.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.cz)));
            } catch (NumberFormatException unused3) {
            }
        }
        zp(this.lMd, this.rV);
        try {
            this.lMd.putOpt("nt", Integer.valueOf(this.ot));
        } catch (Exception unused4) {
        }
        Iterator<String> keys = this.vDp.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.lMd.putOpt(next, this.vDp.opt(next));
        }
    }

    private boolean lMd(String str) {
        str.getClass();
        char c9 = 65535;
        switch (str.hashCode()) {
            case 111399750:
                if (str.equals("umeng")) {
                    c9 = 0;
                    break;
                }
                break;
            case 278118976:
                if (str.equals("event_v1")) {
                    c9 = 1;
                    break;
                }
                break;
            case 278118978:
                if (str.equals("event_v3")) {
                    c9 = 2;
                    break;
                }
                break;
            case 1844205361:
                if (str.equals("app_union")) {
                    c9 = 3;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    private boolean zp(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.getClass();
        char c9 = 65535;
        switch (str2.hashCode()) {
            case 111399750:
                if (str2.equals("umeng")) {
                    c9 = 0;
                    break;
                }
                break;
            case 278118976:
                if (str2.equals("event_v1")) {
                    c9 = 1;
                    break;
                }
                break;
            case 278118978:
                if (str2.equals("event_v3")) {
                    c9 = 2;
                    break;
                }
                break;
            case 1844205361:
                if (str2.equals("app_union")) {
                    c9 = 3;
                    break;
                }
                break;
        }
        switch (c9) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public boolean COT() {
        Set<String> rV;
        if (this.lMd == null || (rV = com.bytedance.sdk.openadsdk.core.KVG.jU().rV()) == null) {
            return false;
        }
        String optString = this.lMd.optString("label");
        if (TextUtils.isEmpty(optString)) {
            if (TextUtils.isEmpty(this.rV)) {
                return false;
            }
            return rV.contains(this.rV);
        }
        return rV.contains(optString);
    }

    public JSONObject KS() {
        if (this.Bj.get()) {
            return this.lMd;
        }
        try {
            QR();
            com.bytedance.sdk.openadsdk.lMd.lMd.zp zpVar = this.pvr;
            if (zpVar != null) {
                zpVar.zp(this.lMd);
            }
        } catch (Throwable unused) {
        }
        if (this.lMd.has("ad_extra_data")) {
            Object opt = this.lMd.opt("ad_extra_data");
            if (opt != null) {
                try {
                    if (opt instanceof JSONObject) {
                        com.bytedance.sdk.component.utils.tG.zp("AdEvent", "ad_extra_data is JSONObject");
                        if (!((JSONObject) opt).has("adiff")) {
                            ((JSONObject) opt).put("adiff", this.zp);
                        }
                        if (this.KS) {
                            if (!((JSONObject) opt).has("interaction_method")) {
                                ((JSONObject) opt).put("interaction_method", this.QR);
                            }
                            if (!((JSONObject) opt).has("real_interaction_method")) {
                                ((JSONObject) opt).put("real_interaction_method", this.ku);
                            }
                            if (!((JSONObject) opt).has("image_mode")) {
                                ((JSONObject) opt).put("image_mode", this.YW);
                            }
                        }
                        this.lMd.put("ad_extra_data", opt.toString());
                    } else if (opt instanceof String) {
                        JSONObject jSONObject = new JSONObject((String) opt);
                        if (!jSONObject.has("adiff")) {
                            jSONObject.put("adiff", this.zp);
                        }
                        if (this.KS) {
                            if (!jSONObject.has("interaction_method")) {
                                jSONObject.put("interaction_method", this.QR);
                            }
                            if (!jSONObject.has("real_interaction_method")) {
                                jSONObject.put("real_interaction_method", this.ku);
                            }
                            if (!jSONObject.has("image_mode")) {
                                jSONObject.put("image_mode", this.YW);
                            }
                        }
                        this.lMd.put("ad_extra_data", jSONObject.toString());
                    }
                } catch (JSONException e4) {
                    com.bytedance.sdk.component.utils.tG.zp("AdEvent", "json error", e4.getMessage());
                }
            }
            this.Bj.set(true);
            return this.lMd;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("adiff", this.zp);
            if (this.KS) {
                jSONObject2.put("interaction_method", this.QR);
                jSONObject2.put("real_interaction_method", this.ku);
                jSONObject2.put("image_mode", this.YW);
            }
            this.lMd.put("ad_extra_data", jSONObject2.toString());
        } catch (JSONException e9) {
            com.bytedance.sdk.component.utils.tG.zp("AdEvent", "json error", e9.getMessage());
        }
        this.Bj.set(true);
        return this.lMd;
        return this.lMd;
    }

    public String jU() {
        return this.zp;
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp.lMd
    public long lMd() {
        return this.jU;
    }

    public JSONObject zp(boolean z8) {
        JSONObject KS = KS();
        try {
            if (z8) {
                JSONObject jSONObject = new JSONObject(KS.toString());
                JSONObject optJSONObject = jSONObject.optJSONObject("params");
                if (optJSONObject != null) {
                    optJSONObject.remove("app_log_url");
                }
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(KS.toString());
            jSONObject2.remove("app_log_url");
            return jSONObject2;
        } catch (JSONException e4) {
            com.bytedance.sdk.component.utils.tG.zp("AdEvent", e4.getMessage());
            return KS;
        }
    }

    public zp(C0124zp c0124zp) {
        this.HWF = "adiff";
        this.Bj = new AtomicBoolean(false);
        this.vDp = new JSONObject();
        if (!TextUtils.isEmpty(c0124zp.lMd)) {
            this.zp = c0124zp.lMd;
        } else {
            this.zp = FP.zp();
        }
        this.pvr = c0124zp.dQp;
        this.FP = c0124zp.HWF;
        this.tG = c0124zp.KS;
        this.rV = c0124zp.jU;
        if (!TextUtils.isEmpty(c0124zp.COT)) {
            this.dQp = c0124zp.COT;
        } else {
            this.dQp = "app_union";
        }
        this.cz = c0124zp.Bj;
        this.KVG = c0124zp.ku;
        this.vwr = c0124zp.YW;
        this.woN = c0124zp.QR;
        this.ot = c0124zp.vDp;
        this.yRU = c0124zp.tG;
        this.vDp = c0124zp.dT = c0124zp.dT != null ? c0124zp.dT : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.lMd = jSONObject;
        if (!TextUtils.isEmpty(c0124zp.tG)) {
            try {
                jSONObject.put("app_log_url", c0124zp.tG);
            } catch (JSONException e4) {
                com.bytedance.sdk.component.utils.tG.zp("AdEvent", e4.getMessage());
            }
        }
        this.QR = c0124zp.woN;
        this.ku = c0124zp.vwr;
        this.YW = c0124zp.zp;
        this.KS = c0124zp.pvr;
        this.COT = System.currentTimeMillis();
        HWF();
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp.lMd
    public JSONObject zp(String str) {
        return KS();
    }

    @Override // com.bytedance.sdk.component.HWF.zp.jU.zp.lMd
    public long zp() {
        return this.COT;
    }

    private static void zp(JSONObject jSONObject, String str) {
        try {
            Set<String> set = dT;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.tG.zp("AdEvent", th);
        }
    }
}

package com.bytedance.sdk.openadsdk.AlY;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.Ne;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import com.bytedance.sdk.openadsdk.utils.mn;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl implements com.bytedance.sdk.component.vc.YFl.AlY.YFl.Sg {
    private long AlY;
    private int DSW;
    private String EH;
    private JSONObject GA;
    private String Ne;
    private int NjR;
    protected final JSONObject Sg;
    private int VOe;
    private String Wwa;
    public final String YFl;
    private final AtomicBoolean YoT;
    private com.bytedance.sdk.openadsdk.AlY.Sg.YFl aIu;
    private String bZ;
    private String lG;
    private String pDU;
    private String qO;
    private int qsH;
    private String rkt;
    private boolean tN;

    /* renamed from: vc, reason: collision with root package name */
    private final String f10492vc;
    private long wN;
    private String wXo;

    /* renamed from: nc, reason: collision with root package name */
    private static final Set<String> f10491nc = new HashSet(Arrays.asList("insight_log"));
    private static final Map<String, String> eT = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.AlY.YFl.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", "extra_url");
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put("errorCode", "error_code");
            put("md5", "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.AlY.YFl$YFl, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0099YFl {
        private String AlY;
        private String DSW;
        private com.bytedance.sdk.openadsdk.AlY.Sg.YFl EH;
        private String GA;
        private String NjR;
        private String Sg;
        private int Wwa;
        public int YFl;
        private final int YoT;
        private String aIu;
        private String eT;
        private int lG;

        /* renamed from: nc, reason: collision with root package name */
        private JSONObject f10495nc;
        private com.bytedance.sdk.openadsdk.AlY.Sg.Sg pDU;
        private boolean qO;
        private String qsH;
        private final long rkt;
        private String tN;

        /* renamed from: vc, reason: collision with root package name */
        private String f10496vc;
        private String wN;

        public C0099YFl(long j3, Wwa wwa) {
            this.lG = -1;
            this.Wwa = -1;
            this.YFl = -1;
            if (wwa != null) {
                this.qO = Ne.Sg(wwa);
                this.lG = wwa.lG();
                this.Wwa = wwa.rkt();
                this.YFl = wwa.ZLB();
            }
            this.rkt = j3;
            this.YoT = com.bytedance.sdk.component.utils.EH.tN(com.bytedance.sdk.openadsdk.core.lG.YFl());
        }

        public C0099YFl AlY(String str) {
            this.wN = str;
            return this;
        }

        public C0099YFl DSW(String str) {
            this.DSW = str;
            return this;
        }

        public C0099YFl Sg(String str) {
            this.tN = str;
            return this;
        }

        public C0099YFl qsH(String str) {
            this.aIu = str;
            return this;
        }

        public C0099YFl tN(String str) {
            this.AlY = str;
            return this;
        }

        public C0099YFl vc(String str) {
            this.NjR = str;
            return this;
        }

        public C0099YFl wN(String str) {
            this.qsH = str;
            return this;
        }

        public C0099YFl YFl(String str) {
            this.GA = str;
            return this;
        }

        public C0099YFl YFl(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.f10495nc = jSONObject;
            return this;
        }

        public void YFl(com.bytedance.sdk.openadsdk.AlY.Sg.YFl yFl) {
            com.bytedance.sdk.openadsdk.vc.Sg.YFl().YFl(this.AlY, this.aIu, this.DSW, this.tN);
            this.EH = yFl;
            final YFl yFl2 = new YFl(this);
            try {
                com.bytedance.sdk.openadsdk.AlY.Sg.Sg sg2 = this.pDU;
                if (sg2 != null) {
                    sg2.YFl(yFl2.Sg, this.rkt);
                } else {
                    new com.bytedance.sdk.openadsdk.AlY.Sg.tN().YFl(yFl2.Sg, this.rkt);
                }
            } catch (Throwable unused) {
            }
            if (com.bytedance.sdk.openadsdk.multipro.Sg.tN()) {
                mn.tN(new com.bytedance.sdk.component.qsH.qsH("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.AlY.YFl.YFl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.AlY.YFl.AlY.YFl(yFl2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.AlY.YFl.AlY.YFl(yFl2);
            }
        }
    }

    public YFl(String str, JSONObject jSONObject) {
        this.f10492vc = "adiff";
        this.YoT = new AtomicBoolean(false);
        this.GA = new JSONObject();
        this.YFl = str;
        this.Sg = jSONObject;
    }

    private void DSW() throws JSONException {
        this.Sg.putOpt("app_log_url", this.bZ);
        this.Sg.putOpt("tag", this.pDU);
        this.Sg.putOpt("label", this.EH);
        this.Sg.putOpt("category", this.rkt);
        if (!TextUtils.isEmpty(this.lG)) {
            try {
                this.Sg.putOpt(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(Long.parseLong(this.lG)));
            } catch (NumberFormatException unused) {
                this.Sg.putOpt(AppMeasurementSdk.ConditionalUserProperty.VALUE, 0L);
            }
        }
        if (!TextUtils.isEmpty(this.qO)) {
            try {
                this.Sg.putOpt("ext_value", Long.valueOf(Long.parseLong(this.qO)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.Ne)) {
            this.Sg.putOpt("log_extra", this.Ne);
        }
        if (!TextUtils.isEmpty(this.wXo)) {
            try {
                this.Sg.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.wXo)));
            } catch (NumberFormatException unused3) {
            }
        }
        YFl(this.Sg, this.EH);
        try {
            this.Sg.putOpt("nt", Integer.valueOf(this.VOe));
        } catch (Exception unused4) {
        }
        Iterator<String> keys = this.GA.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.Sg.putOpt(next, this.GA.opt(next));
        }
    }

    private boolean Sg(String str) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 111399750:
                if (str.equals("umeng")) {
                    c10 = 0;
                    break;
                }
                break;
            case 278118976:
                if (str.equals("event_v1")) {
                    c10 = 1;
                    break;
                }
                break;
            case 278118978:
                if (str.equals("event_v3")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1844205361:
                if (str.equals("app_union")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    private boolean YFl(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.getClass();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 111399750:
                if (str2.equals("umeng")) {
                    c10 = 0;
                    break;
                }
                break;
            case 278118976:
                if (str2.equals("event_v1")) {
                    c10 = 1;
                    break;
                }
                break;
            case 278118978:
                if (str2.equals("event_v3")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1844205361:
                if (str2.equals("app_union")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    private void vc() {
        JSONObject jSONObject = this.GA;
        if (jSONObject == null) {
            if (!YFl(this.lG, this.rkt, this.Ne)) {
                return;
            }
        } else {
            String optString = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            String optString2 = this.GA.optString("category");
            String optString3 = this.GA.optString("log_extra");
            if (YFl(this.lG, this.rkt, this.Ne)) {
                if (!TextUtils.isEmpty(optString) && TextUtils.equals(optString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(optString2) && !Sg(optString2)) {
                    return;
                }
            } else if ((!TextUtils.isEmpty(optString) && !TextUtils.equals(optString, "0")) || (!TextUtils.isEmpty(this.lG) && !TextUtils.equals(this.lG, "0"))) {
                if ((!TextUtils.isEmpty(this.rkt) && Sg(this.rkt)) || (!TextUtils.isEmpty(optString2) && Sg(optString2))) {
                    if (TextUtils.isEmpty(this.Ne) && TextUtils.isEmpty(optString3)) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.AlY = com.bytedance.sdk.openadsdk.AlY.YFl.AlY.YFl.incrementAndGet();
    }

    public String AlY() {
        return this.YFl;
    }

    public JSONObject tN() {
        if (this.YoT.get()) {
            return this.Sg;
        }
        try {
            DSW();
        } catch (Throwable unused) {
        }
        if (this.Sg.has("ad_extra_data")) {
            Object opt = this.Sg.opt("ad_extra_data");
            if (opt != null) {
                try {
                    if (opt instanceof JSONObject) {
                        com.bytedance.sdk.component.utils.YoT.YFl("AdEvent", "ad_extra_data is JSONObject");
                        this.Sg.put("ad_extra_data", YFl((JSONObject) opt).toString());
                    } else if (opt instanceof String) {
                        this.Sg.put("ad_extra_data", YFl(new JSONObject((String) opt)).toString());
                    }
                } catch (JSONException e2) {
                    com.bytedance.sdk.component.utils.YoT.YFl("AdEvent", "json error", e2.getMessage());
                }
            }
            this.YoT.set(true);
            return this.Sg;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adiff", this.YFl);
            if (this.tN) {
                jSONObject.put("interaction_method", this.DSW);
                jSONObject.put("real_interaction_method", this.qsH);
                jSONObject.put("image_mode", this.NjR);
            }
            this.Sg.put("ad_extra_data", jSONObject.toString());
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.YoT.YFl("AdEvent", "json error", e10.getMessage());
        }
        this.YoT.set(true);
        return this.Sg;
        return this.Sg;
    }

    public boolean wN() {
        Set<String> GA;
        if (this.Sg == null || (GA = com.bytedance.sdk.openadsdk.core.lG.AlY().GA()) == null) {
            return false;
        }
        String optString = this.Sg.optString("label");
        if (TextUtils.isEmpty(optString)) {
            if (TextUtils.isEmpty(this.EH)) {
                return false;
            }
            return GA.contains(this.EH);
        }
        return GA.contains(optString);
    }

    private void Sg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : eT.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object opt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(eT.get(str), opt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private JSONObject YFl(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.YFl);
            }
            if (this.tN) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.DSW);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.qsH);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.NjR);
                }
            }
            if (com.bytedance.sdk.openadsdk.aIu.YFl.YFl("replace_log_extra_key", false)) {
                Sg(jSONObject);
            }
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.YFl + "-" + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("AdEvent", th2.getMessage() == null ? "error " : th2.getMessage());
            return jSONObject;
        }
    }

    public YFl(C0099YFl c0099YFl) {
        this.f10492vc = "adiff";
        this.YoT = new AtomicBoolean(false);
        this.GA = new JSONObject();
        if (!TextUtils.isEmpty(c0099YFl.Sg)) {
            this.YFl = c0099YFl.Sg;
        } else {
            this.YFl = com.bytedance.sdk.openadsdk.utils.Ne.YFl();
        }
        this.aIu = c0099YFl.EH;
        this.Ne = c0099YFl.f10496vc;
        this.pDU = c0099YFl.tN;
        this.EH = c0099YFl.AlY;
        if (!TextUtils.isEmpty(c0099YFl.wN)) {
            this.rkt = c0099YFl.wN;
        } else {
            this.rkt = "app_union";
        }
        this.wXo = c0099YFl.eT;
        this.lG = c0099YFl.qsH;
        this.qO = c0099YFl.NjR;
        this.Wwa = c0099YFl.DSW;
        this.VOe = c0099YFl.YoT;
        this.bZ = c0099YFl.GA;
        this.GA = c0099YFl.f10495nc = c0099YFl.f10495nc != null ? c0099YFl.f10495nc : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.Sg = jSONObject;
        if (!TextUtils.isEmpty(c0099YFl.GA)) {
            try {
                jSONObject.put("app_log_url", c0099YFl.GA);
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.YoT.YFl("AdEvent", e2.getMessage());
            }
        }
        this.DSW = c0099YFl.lG;
        this.qsH = c0099YFl.Wwa;
        this.NjR = c0099YFl.YFl;
        this.tN = c0099YFl.qO;
        this.wN = System.currentTimeMillis();
        vc();
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl.Sg
    public long Sg() {
        return this.AlY;
    }

    public JSONObject YFl(boolean z10) {
        JSONObject tN = tN();
        try {
            if (z10) {
                JSONObject jSONObject = new JSONObject(tN.toString());
                JSONObject optJSONObject = jSONObject.optJSONObject("params");
                if (optJSONObject != null) {
                    optJSONObject.remove("app_log_url");
                }
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(tN.toString());
            jSONObject2.remove("app_log_url");
            return jSONObject2;
        } catch (JSONException e2) {
            com.bytedance.sdk.component.utils.YoT.YFl("AdEvent", e2.getMessage());
            return tN;
        }
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl.Sg
    public JSONObject YFl(String str) {
        return tN();
    }

    @Override // com.bytedance.sdk.component.vc.YFl.AlY.YFl.Sg
    public long YFl() {
        return this.wN;
    }

    private static void YFl(JSONObject jSONObject, String str) {
        try {
            Set<String> set = f10491nc;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.YoT.YFl("AdEvent", th2);
        }
    }
}

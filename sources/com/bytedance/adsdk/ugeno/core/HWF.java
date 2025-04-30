package com.bytedance.adsdk.ugeno.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class HWF {
    private String KS;
    private JSONObject jU;
    private JSONObject lMd;
    private JSONObject zp;

    /* loaded from: classes.dex */
    public static class zp {
        private zp COT;
        private String HWF;
        private JSONObject KS;
        private List<zp> jU;
        private String lMd;
        private String zp;

        public List<zp> COT() {
            return this.jU;
        }

        public JSONObject jU() {
            return this.KS;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("UGNode{id='");
            sb.append(this.zp);
            sb.append("', name='");
            return AbstractC2914a.h(sb, this.lMd, "'}");
        }

        public String KS() {
            return this.lMd;
        }

        public String lMd() {
            return this.HWF;
        }

        public String zp() {
            return this.zp;
        }

        public void zp(zp zpVar) {
            if (this.jU == null) {
                this.jU = new ArrayList();
            }
            this.jU.add(zpVar);
        }
    }

    public HWF(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null) {
            this.zp = jSONObject.optJSONObject("main_template");
            this.lMd = jSONObject.optJSONObject("sub_templates");
            JSONObject optJSONObject = jSONObject.optJSONObject("template_info");
            if (optJSONObject != null) {
                this.KS = optJSONObject.optString("sdk_version");
            }
            this.jU = jSONObject2;
        }
    }

    public List<zp> KS() {
        if (this.lMd == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.lMd.keys();
        while (keys.hasNext()) {
            zp zp2 = zp(this.lMd.optJSONObject(keys.next()), null);
            if (zp2 != null) {
                arrayList.add(zp2);
            }
        }
        return arrayList;
    }

    public String lMd() {
        return this.KS;
    }

    public zp zp() {
        return zp(this.zp, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.adsdk.ugeno.core.HWF.zp zp(org.json.JSONObject r10, com.bytedance.adsdk.ugeno.core.HWF.zp r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "name"
            java.lang.String r2 = r10.optString(r1)
            java.lang.String r3 = "id"
            java.lang.String r4 = r10.optString(r3)
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.util.Iterator r6 = r10.keys()
        L19:
            boolean r7 = r6.hasNext()
            java.lang.String r8 = "children"
            if (r7 == 0) goto L35
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r8 = android.text.TextUtils.equals(r7, r8)
            if (r8 != 0) goto L19
            java.lang.Object r8 = r10.opt(r7)     // Catch: org.json.JSONException -> L19
            r5.put(r7, r8)     // Catch: org.json.JSONException -> L19
            goto L19
        L35:
            com.bytedance.adsdk.ugeno.core.HWF$zp r6 = new com.bytedance.adsdk.ugeno.core.HWF$zp
            r6.<init>()
            com.bytedance.adsdk.ugeno.core.HWF.zp.zp(r6, r4)
            com.bytedance.adsdk.ugeno.core.HWF.zp.lMd(r6, r2)
            com.bytedance.adsdk.ugeno.core.HWF.zp.zp(r6, r5)
            com.bytedance.adsdk.ugeno.core.HWF.zp.zp(r6, r11)
            java.lang.String r11 = r9.KS
            com.bytedance.adsdk.ugeno.core.HWF.zp.KS(r6, r11)
            org.json.JSONArray r10 = r10.optJSONArray(r8)
            if (r10 == 0) goto L90
            int r11 = r10.length()
            if (r11 > 0) goto L58
            goto L90
        L58:
            r11 = 0
        L59:
            int r2 = r10.length()
            if (r11 >= r2) goto L90
            org.json.JSONObject r2 = r10.optJSONObject(r11)
            java.lang.String r4 = r2.optString(r1)
            java.lang.String r5 = r2.optString(r3)
            org.json.JSONObject r7 = r9.jU
            java.lang.String r5 = com.bytedance.adsdk.ugeno.zp.KS.zp(r5, r7)
            java.lang.String r7 = "Template"
            boolean r4 = android.text.TextUtils.equals(r4, r7)
            if (r4 == 0) goto L84
            org.json.JSONObject r2 = r9.lMd
            if (r2 == 0) goto L82
            org.json.JSONObject r2 = r2.optJSONObject(r5)
            goto L84
        L82:
            r2 = r0
            goto L88
        L84:
            com.bytedance.adsdk.ugeno.core.HWF$zp r2 = r9.zp(r2, r6)
        L88:
            if (r2 == 0) goto L8d
            r6.zp(r2)
        L8d:
            int r11 = r11 + 1
            goto L59
        L90:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.core.HWF.zp(org.json.JSONObject, com.bytedance.adsdk.ugeno.core.HWF$zp):com.bytedance.adsdk.ugeno.core.HWF$zp");
    }

    public static boolean zp(zp zpVar) {
        return (zpVar == null || zpVar.KS == null) ? false : true;
    }
}

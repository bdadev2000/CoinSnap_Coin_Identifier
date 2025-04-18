package com.bytedance.adsdk.ugeno.core;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vd.e;

/* loaded from: classes.dex */
public class wN {
    private JSONObject AlY;
    private boolean DSW;
    private JSONObject Sg;
    private JSONObject YFl;
    private String tN;

    /* renamed from: vc, reason: collision with root package name */
    private JSONObject f10278vc;
    private String wN;

    /* loaded from: classes.dex */
    public static class YFl {
        private List<YFl> AlY;
        private String DSW;
        private String Sg;
        private String YFl;
        private JSONObject tN;

        /* renamed from: vc, reason: collision with root package name */
        private String f10279vc;
        private YFl wN;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("UGNode{id='");
            sb2.append(this.YFl);
            sb2.append("', name='");
            return e.h(sb2, this.Sg, "'}");
        }

        public List<YFl> wN() {
            return this.AlY;
        }

        public JSONObject AlY() {
            return this.tN;
        }

        public String tN() {
            return this.Sg;
        }

        public String Sg() {
            return this.f10279vc;
        }

        public String YFl() {
            return this.YFl;
        }

        public void YFl(YFl yFl) {
            if (this.AlY == null) {
                this.AlY = new ArrayList();
            }
            this.AlY.add(yFl);
        }
    }

    public wN(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, null);
    }

    public boolean AlY() {
        return this.DSW;
    }

    public String Sg() {
        return this.tN;
    }

    public YFl YFl() {
        return YFl(this.YFl, (YFl) null);
    }

    public List<YFl> tN() {
        if (this.Sg == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.Sg.keys();
        while (keys.hasNext()) {
            YFl YFl2 = YFl(this.Sg.optJSONObject(keys.next()), (YFl) null);
            if (YFl2 != null) {
                arrayList.add(YFl2);
            }
        }
        return arrayList;
    }

    public wN(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject optJSONObject;
        if (jSONObject != null) {
            if (jSONObject.has(TtmlNode.TAG_BODY)) {
                this.YFl = jSONObject.optJSONObject(TtmlNode.TAG_BODY);
            } else {
                this.YFl = jSONObject.optJSONObject("main_template");
            }
            this.Sg = jSONObject.optJSONObject("sub_templates");
            if (jSONObject.has("meta")) {
                optJSONObject = jSONObject.optJSONObject("meta");
            } else {
                optJSONObject = jSONObject.optJSONObject("template_info");
            }
            if (optJSONObject != null) {
                if (jSONObject.has(TtmlNode.TAG_BODY)) {
                    this.DSW = true;
                    String optString = optJSONObject.optString("version");
                    this.tN = optString;
                    if (TextUtils.isEmpty(optString)) {
                        this.tN = "3.0";
                    }
                } else {
                    this.tN = optJSONObject.optString("sdk_version");
                }
                if (optJSONObject.has("adType")) {
                    this.wN = optJSONObject.optString("adType");
                }
            } else if (jSONObject.has(TtmlNode.TAG_BODY)) {
                this.tN = "3.0";
                this.DSW = true;
            }
            this.AlY = jSONObject2;
            this.f10278vc = jSONObject3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.adsdk.ugeno.core.wN.YFl YFl(org.json.JSONObject r11, com.bytedance.adsdk.ugeno.core.wN.YFl r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "type"
            boolean r2 = r11.has(r1)
            java.lang.String r3 = "name"
            if (r2 == 0) goto L13
            java.lang.String r2 = r11.optString(r1)
            goto L17
        L13:
            java.lang.String r2 = r11.optString(r3)
        L17:
            java.lang.String r4 = "id"
            java.lang.String r5 = r11.optString(r4)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.util.Iterator r7 = r11.keys()
        L26:
            boolean r8 = r7.hasNext()
            java.lang.String r9 = "children"
            if (r8 == 0) goto L42
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = android.text.TextUtils.equals(r8, r9)
            if (r9 != 0) goto L26
            java.lang.Object r9 = r11.opt(r8)     // Catch: org.json.JSONException -> L26
            r6.put(r8, r9)     // Catch: org.json.JSONException -> L26
            goto L26
        L42:
            com.bytedance.adsdk.ugeno.core.wN$YFl r7 = new com.bytedance.adsdk.ugeno.core.wN$YFl
            r7.<init>()
            com.bytedance.adsdk.ugeno.core.wN.YFl.YFl(r7, r5)
            boolean r5 = r10.DSW
            if (r5 == 0) goto L6b
            java.lang.String r5 = "Video"
            boolean r5 = android.text.TextUtils.equals(r5, r2)
            if (r5 == 0) goto L6b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r8 = "V3"
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.bytedance.adsdk.ugeno.core.wN.YFl.Sg(r7, r5)
            goto L6e
        L6b:
            com.bytedance.adsdk.ugeno.core.wN.YFl.Sg(r7, r2)
        L6e:
            com.bytedance.adsdk.ugeno.core.wN.YFl.YFl(r7, r6)
            com.bytedance.adsdk.ugeno.core.wN.YFl.YFl(r7, r12)
            java.lang.String r12 = r10.tN
            com.bytedance.adsdk.ugeno.core.wN.YFl.tN(r7, r12)
            java.lang.String r12 = r10.wN
            com.bytedance.adsdk.ugeno.core.wN.YFl.AlY(r7, r12)
            java.lang.String r12 = "CustomComponent"
            boolean r12 = android.text.TextUtils.equals(r2, r12)
            if (r12 == 0) goto L8d
            org.json.JSONObject r12 = com.bytedance.adsdk.ugeno.core.wN.YFl.Sg(r7)
            r10.YFl(r11, r12)
        L8d:
            org.json.JSONArray r12 = r11.optJSONArray(r9)
            if (r12 == 0) goto Ldd
            int r2 = r12.length()
            if (r2 > 0) goto L9a
            goto Ldd
        L9a:
            r2 = 0
        L9b:
            int r5 = r12.length()
            if (r2 >= r5) goto Ldd
            org.json.JSONObject r5 = r12.optJSONObject(r2)
            boolean r6 = r11.has(r1)
            if (r6 == 0) goto Lb0
            java.lang.String r6 = r11.optString(r1)
            goto Lb4
        Lb0:
            java.lang.String r6 = r11.optString(r3)
        Lb4:
            java.lang.String r8 = r5.optString(r4)
            org.json.JSONObject r9 = r10.AlY
            java.lang.String r8 = com.bytedance.adsdk.ugeno.tN.Sg.YFl(r8, r9)
            java.lang.String r9 = "Template"
            boolean r6 = android.text.TextUtils.equals(r6, r9)
            if (r6 == 0) goto Ld1
            org.json.JSONObject r5 = r10.Sg
            if (r5 == 0) goto Lcf
            org.json.JSONObject r5 = r5.optJSONObject(r8)
            goto Ld1
        Lcf:
            r5 = r0
            goto Ld5
        Ld1:
            com.bytedance.adsdk.ugeno.core.wN$YFl r5 = r10.YFl(r5, r7)
        Ld5:
            if (r5 == 0) goto Lda
            r7.YFl(r5)
        Lda:
            int r2 = r2 + 1
            goto L9b
        Ldd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.core.wN.YFl(org.json.JSONObject, com.bytedance.adsdk.ugeno.core.wN$YFl):com.bytedance.adsdk.ugeno.core.wN$YFl");
    }

    private void YFl(JSONObject jSONObject, JSONObject jSONObject2) {
        if (this.f10278vc == null || jSONObject2 == null) {
            return;
        }
        try {
            String optString = this.f10278vc.optString(jSONObject2.optString("targetId"));
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject(optString);
            JSONObject optJSONObject = jSONObject2.optJSONObject("targetProps");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = optJSONObject.opt(next);
                    if (TextUtils.equals(next, "events") && jSONObject3.has("events")) {
                        if (opt instanceof JSONArray) {
                            com.bytedance.adsdk.ugeno.DSW.Sg.YFl(jSONObject3.optJSONArray("events"), (JSONArray) opt);
                        }
                    } else {
                        jSONObject3.put(next, opt);
                    }
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("children");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                optJSONArray.put(jSONObject3);
                if (jSONObject.has("children")) {
                    return;
                }
                jSONObject.put("children", optJSONArray);
            }
        } catch (JSONException unused) {
        }
    }

    public static boolean YFl(YFl yFl) {
        return (yFl == null || yFl.tN == null) ? false : true;
    }
}

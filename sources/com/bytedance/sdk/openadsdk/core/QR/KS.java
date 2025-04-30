package com.bytedance.sdk.openadsdk.core.QR;

import com.bytedance.sdk.openadsdk.core.QR.KS.zp;
import com.bytedance.sdk.openadsdk.core.QR.lMd.KS;
import com.bytedance.sdk.openadsdk.core.model.woN;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class KS {
    protected String COT;
    protected List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> HWF;
    protected zp.EnumC0100zp KS;
    protected List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> QR;
    private String dT;
    protected zp.lMd jU;
    protected String ku;
    protected int lMd;
    private woN vDp;
    protected int zp;
    private final AtomicBoolean Bj = new AtomicBoolean(false);
    protected String YW = "endcard_click";

    /* renamed from: com.bytedance.sdk.openadsdk.core.QR.KS$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zp;

        static {
            int[] iArr = new int[zp.lMd.values().length];
            zp = iArr;
            try {
                iArr[zp.lMd.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zp[zp.lMd.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zp[zp.lMd.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public KS(int i9, int i10, zp.EnumC0100zp enumC0100zp, zp.lMd lmd, String str, List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list, List<com.bytedance.sdk.openadsdk.core.QR.lMd.KS> list2, String str2) {
        this.HWF = new ArrayList();
        this.QR = new ArrayList();
        this.zp = i9;
        this.lMd = i10;
        this.KS = enumC0100zp;
        this.jU = lmd;
        this.COT = str;
        this.HWF = list;
        this.QR = list2;
        this.ku = str2;
    }

    public String COT() {
        if (this.jU == zp.lMd.STATIC_RESOURCE && this.KS == zp.EnumC0100zp.IMAGE) {
            return this.COT;
        }
        return null;
    }

    public String HWF() {
        return this.COT;
    }

    public int KS() {
        return this.lMd;
    }

    public String jU() {
        int i9 = AnonymousClass1.zp[this.jU.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    StringBuilder sb = new StringBuilder("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"");
                    sb.append(this.zp);
                    sb.append("\" height=\"");
                    sb.append(this.lMd);
                    sb.append("\" src=\"");
                    return AbstractC2914a.h(sb, this.COT, "\"></iframe>");
                }
                return null;
            }
            return this.COT;
        }
        zp.EnumC0100zp enumC0100zp = this.KS;
        if (enumC0100zp == zp.EnumC0100zp.IMAGE) {
            return AbstractC2914a.h(new StringBuilder("<html><head></head><body style=\"margin:0;padding:0\"><img src=\""), this.COT, "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>");
        }
        if (enumC0100zp == zp.EnumC0100zp.JAVASCRIPT) {
            return AbstractC2914a.h(new StringBuilder("<script src=\""), this.COT, "\"></script>");
        }
        return null;
    }

    public int lMd() {
        return this.zp;
    }

    public void zp(long j7) {
        com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(this.HWF, null, j7, this.dT, new KS.lMd(this.YW, this.vDp));
    }

    public static float zp(int i9, int i10, int i11, int i12, zp.lMd lmd, zp.EnumC0100zp enumC0100zp) {
        if (i10 == 0 || i12 == 0) {
            return 0.0f;
        }
        float f9 = i9;
        float f10 = i11;
        return zp(lmd, enumC0100zp) / ((Math.abs((f9 - f10) / f9) + Math.abs((f9 / i10) - (f10 / i12))) + 1.0f);
    }

    public void lMd(long j7) {
        if (this.Bj.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.QR.lMd.KS.lMd(this.QR, null, j7, this.dT);
        }
    }

    public static KS lMd(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        String optString = jSONObject.optString("creativeType", zp.EnumC0100zp.NONE.toString());
        String optString2 = jSONObject.optString("resourceType", zp.lMd.HTML_RESOURCE.toString());
        String optString3 = jSONObject.optString("contentUrl");
        String optString4 = jSONObject.optString("clickThroughUri");
        JSONArray optJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < optJSONArray.length(); i9++) {
            arrayList.add(new KS.zp(optJSONArray.optString(i9)).zp());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
            arrayList2.add(new KS.zp(optJSONArray2.optString(i10)).zp());
        }
        return new KS(optInt, optInt2, zp.EnumC0100zp.valueOf(optString), zp.lMd.valueOf(optString2), optString3, arrayList, arrayList2, optString4);
    }

    private static float zp(zp.lMd lmd, zp.EnumC0100zp enumC0100zp) {
        int i9 = AnonymousClass1.zp[lmd.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                return i9 != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (zp.EnumC0100zp.JAVASCRIPT.equals(enumC0100zp)) {
            return 1.0f;
        }
        return zp.EnumC0100zp.IMAGE.equals(enumC0100zp) ? 0.8f : 0.0f;
    }

    public void zp(String str) {
        this.dT = str;
    }

    public JSONObject zp() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.zp);
        jSONObject.put("height", this.lMd);
        jSONObject.put("creativeType", this.KS.toString());
        jSONObject.put("resourceType", this.jU.toString());
        jSONObject.put("contentUrl", this.COT);
        jSONObject.put("clickThroughUri", this.ku);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(this.HWF));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.QR.lMd.KS.zp(this.QR));
        return jSONObject;
    }

    public void zp(woN won) {
        this.vDp = won;
    }
}

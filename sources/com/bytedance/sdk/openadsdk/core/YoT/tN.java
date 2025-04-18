package com.bytedance.sdk.openadsdk.core.YoT;

import com.bytedance.sdk.openadsdk.core.YoT.Sg.tN;
import com.bytedance.sdk.openadsdk.core.YoT.tN.YFl;
import com.bytedance.sdk.openadsdk.core.model.Wwa;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vd.e;

/* loaded from: classes.dex */
public class tN {
    protected YFl.Sg AlY;
    protected List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> DSW;
    protected int Sg;
    protected int YFl;
    private Wwa YoT;

    /* renamed from: nc, reason: collision with root package name */
    private String f10659nc;
    protected String qsH;
    protected YFl.EnumC0119YFl tN;

    /* renamed from: vc, reason: collision with root package name */
    protected List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> f10660vc;
    protected String wN;
    private final AtomicBoolean eT = new AtomicBoolean(false);
    protected String NjR = "endcard_click";

    /* renamed from: com.bytedance.sdk.openadsdk.core.YoT.tN$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] YFl;

        static {
            int[] iArr = new int[YFl.Sg.values().length];
            YFl = iArr;
            try {
                iArr[YFl.Sg.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                YFl[YFl.Sg.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                YFl[YFl.Sg.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public tN(int i10, int i11, YFl.EnumC0119YFl enumC0119YFl, YFl.Sg sg2, String str, List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list, List<com.bytedance.sdk.openadsdk.core.YoT.Sg.tN> list2, String str2) {
        this.f10660vc = new ArrayList();
        this.DSW = new ArrayList();
        this.YFl = i10;
        this.Sg = i11;
        this.tN = enumC0119YFl;
        this.AlY = sg2;
        this.wN = str;
        this.f10660vc = list;
        this.DSW = list2;
        this.qsH = str2;
    }

    public String AlY() {
        int i10 = AnonymousClass1.YFl[this.AlY.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    StringBuilder sb2 = new StringBuilder("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"");
                    sb2.append(this.YFl);
                    sb2.append("\" height=\"");
                    sb2.append(this.Sg);
                    sb2.append("\" src=\"");
                    return e.h(sb2, this.wN, "\"></iframe>");
                }
                return null;
            }
            return this.wN;
        }
        YFl.EnumC0119YFl enumC0119YFl = this.tN;
        if (enumC0119YFl == YFl.EnumC0119YFl.IMAGE) {
            return e.h(new StringBuilder("<html><head></head><body style=\"margin:0;padding:0\"><img src=\""), this.wN, "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>");
        }
        if (enumC0119YFl == YFl.EnumC0119YFl.JAVASCRIPT) {
            return e.h(new StringBuilder("<script src=\""), this.wN, "\"></script>");
        }
        return null;
    }

    public int Sg() {
        return this.YFl;
    }

    public void YFl(long j3) {
        com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(this.f10660vc, null, j3, this.f10659nc, new tN.Sg(this.NjR, this.YoT));
    }

    public int tN() {
        return this.Sg;
    }

    public String vc() {
        return this.wN;
    }

    public String wN() {
        if (this.AlY == YFl.Sg.STATIC_RESOURCE && this.tN == YFl.EnumC0119YFl.IMAGE) {
            return this.wN;
        }
        return null;
    }

    public static float YFl(int i10, int i11, int i12, int i13, YFl.Sg sg2, YFl.EnumC0119YFl enumC0119YFl) {
        if (i11 == 0 || i13 == 0) {
            return 0.0f;
        }
        float f10 = i10;
        float f11 = i12;
        return YFl(sg2, enumC0119YFl) / ((Math.abs((f10 - f11) / f10) + Math.abs((f10 / i11) - (f11 / i13))) + 1.0f);
    }

    public void Sg(long j3) {
        if (this.eT.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.Sg(this.DSW, null, j3, this.f10659nc);
        }
    }

    public static tN Sg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        String optString = jSONObject.optString("creativeType", YFl.EnumC0119YFl.NONE.toString());
        String optString2 = jSONObject.optString("resourceType", YFl.Sg.HTML_RESOURCE.toString());
        String optString3 = jSONObject.optString("contentUrl");
        String optString4 = jSONObject.optString("clickThroughUri");
        JSONArray optJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            arrayList.add(new tN.YFl(optJSONArray.optString(i10)).YFl());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
            arrayList2.add(new tN.YFl(optJSONArray2.optString(i11)).YFl());
        }
        return new tN(optInt, optInt2, YFl.EnumC0119YFl.valueOf(optString), YFl.Sg.valueOf(optString2), optString3, arrayList, arrayList2, optString4);
    }

    private static float YFl(YFl.Sg sg2, YFl.EnumC0119YFl enumC0119YFl) {
        int i10 = AnonymousClass1.YFl[sg2.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (YFl.EnumC0119YFl.JAVASCRIPT.equals(enumC0119YFl)) {
            return 1.0f;
        }
        return YFl.EnumC0119YFl.IMAGE.equals(enumC0119YFl) ? 0.8f : 0.0f;
    }

    public void YFl(String str) {
        this.f10659nc = str;
    }

    public JSONObject YFl() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.YFl);
        jSONObject.put("height", this.Sg);
        jSONObject.put("creativeType", this.tN.toString());
        jSONObject.put("resourceType", this.AlY.toString());
        jSONObject.put("contentUrl", this.wN);
        jSONObject.put("clickThroughUri", this.qsH);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(this.f10660vc));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.YoT.Sg.tN.YFl(this.DSW));
        return jSONObject;
    }

    public void YFl(Wwa wwa) {
        this.YoT = wwa;
    }
}

package com.mbridge.msdk.click;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.LoadingActivity;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f14740a = false;
    public static Map<String, Long> b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static Set<String> f14741c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private String f14742d;

    /* renamed from: e, reason: collision with root package name */
    private long f14743e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.db.g f14744f;

    /* renamed from: g, reason: collision with root package name */
    private Context f14745g;

    /* renamed from: h, reason: collision with root package name */
    private d f14746h;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.h f14748j;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.c.g f14749k;
    private boolean l;

    /* renamed from: o, reason: collision with root package name */
    private boolean f14751o;

    /* renamed from: p, reason: collision with root package name */
    private i f14752p;

    /* renamed from: i, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f14747i = null;
    private boolean m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f14750n = true;

    public a(Context context, String str) {
        this.f14744f = null;
        this.f14745g = null;
        com.mbridge.msdk.c.g b8 = com.mbridge.msdk.c.h.a().b(str);
        this.f14749k = b8;
        if (b8 == null) {
            com.mbridge.msdk.c.h.a();
            this.f14749k = com.mbridge.msdk.c.i.a();
        }
        this.l = this.f14749k.aH();
        Context applicationContext = context.getApplicationContext();
        this.f14745g = applicationContext;
        this.f14742d = str;
        if (this.f14744f == null) {
            this.f14744f = com.mbridge.msdk.foundation.db.g.a(applicationContext);
        }
        this.f14748j = new com.mbridge.msdk.foundation.same.report.h(this.f14745g);
    }

    public static /* synthetic */ void f(a aVar) {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            aVar.f14745g.sendBroadcast(intent);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonClickControl", "Exception", e4);
            }
        }
    }

    private boolean b(CampaignEx campaignEx) {
        Long l;
        if (campaignEx == null) {
            return true;
        }
        try {
            if (2 != campaignEx.getLinkType() && 3 != campaignEx.getLinkType()) {
                return true;
            }
            String id = campaignEx.getId();
            Map<String, Long> map = b;
            if (map == null) {
                return true;
            }
            if (map.containsKey(id) && (l = b.get(id)) != null) {
                if (l.longValue() > System.currentTimeMillis() || f14741c.contains(campaignEx.getId())) {
                    return false;
                }
            }
            b.put(campaignEx.getId(), Long.valueOf(System.currentTimeMillis() + (campaignEx.getClickTimeOutInterval() * 1000)));
            return true;
        } catch (Exception e4) {
            if (!MBridgeConstans.DEBUG) {
                return true;
            }
            e4.printStackTrace();
            return true;
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, boolean z8, boolean z9) {
        if (context == null) {
            return;
        }
        new d(context.getApplicationContext()).a(str, campaignEx, null, str2, z8, z9, com.mbridge.msdk.click.a.a.f14770f);
    }

    public static void a(Context context, final CampaignEx campaignEx, String str, final String str2, boolean z8, boolean z9, final int i9) {
        if (context == null) {
            return;
        }
        final int i10 = TextUtils.isEmpty(str2) ? -1 : str2.startsWith("tcp") ? 1 : 0;
        new d(context.getApplicationContext()).a(str, campaignEx, new f() { // from class: com.mbridge.msdk.click.a.1
            @Override // com.mbridge.msdk.click.f
            public final void a(Object obj) {
            }

            @Override // com.mbridge.msdk.click.f
            public final void b(Object obj) {
                try {
                    com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar.a("result", 2);
                    dVar.a("net_ty", String.valueOf(i10));
                    if (obj != null && (obj instanceof JumpLoaderResult)) {
                        JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                        String str3 = jumpLoaderResult.getStatusCode() + "";
                        dVar.a("status_code", str3);
                        if (str3.startsWith(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                            dVar.a("result", 1);
                        } else {
                            String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                            if (TextUtils.isEmpty(exceptionMsg)) {
                                exceptionMsg = "UNKNOWN EXCEPTION and Status Code is : ".concat(str3);
                            }
                            dVar.a("failingURL", ao.d(str2));
                            dVar.a("reason", exceptionMsg);
                        }
                    }
                    com.mbridge.msdk.foundation.same.report.d.c.a().a(a.a(i9), campaignEx, dVar);
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CommonClickControl", e4.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.click.f
            public final void a(Object obj, String str3) {
                try {
                    String a6 = a.a(i9);
                    com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar.a("result", 2);
                    if (obj instanceof JumpLoaderResult) {
                        JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                        String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                        if (!TextUtils.isEmpty(exceptionMsg)) {
                            str3 = exceptionMsg;
                        }
                        dVar.a("reason", str3);
                        dVar.a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                    }
                    dVar.a("code", "");
                    dVar.a("failingURL", ao.d(str2));
                    dVar.a("net_ty", String.valueOf(i10));
                    com.mbridge.msdk.foundation.same.report.d.c.a().a(a6, campaignEx, dVar);
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CommonClickControl", e4.getMessage());
                    }
                }
            }
        }, str2, z8, z9, i9);
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String[] strArr, boolean z8, boolean z9) {
        if (context == null || campaignEx == null || TextUtils.isEmpty(str) || strArr == null) {
            return;
        }
        d dVar = new d(context.getApplicationContext());
        for (String str2 : strArr) {
            dVar.a(str, campaignEx, new f() { // from class: com.mbridge.msdk.click.a.2
                @Override // com.mbridge.msdk.click.f
                public final void a(Object obj) {
                }

                @Override // com.mbridge.msdk.click.f
                public final void b(Object obj) {
                }

                @Override // com.mbridge.msdk.click.f
                public final void a(Object obj, String str3) {
                }
            }, str2, z8, z9, com.mbridge.msdk.click.a.a.f14770f);
        }
    }

    private int b() {
        try {
            com.mbridge.msdk.c.g gVar = this.f14749k;
            if (gVar != null) {
                return gVar.V();
            }
            return 1;
        } catch (Exception e4) {
            e4.printStackTrace();
            return 1;
        }
    }

    public final void a(String str) {
        this.f14742d = str;
    }

    public final void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f14747i = nativeTrackingListener;
    }

    public final void a(i iVar) {
        this.f14752p = iVar;
    }

    public final void a(boolean z8) {
        this.f14750n = z8;
    }

    public final void a() {
        try {
            this.f14747i = null;
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final void a(CampaignEx campaignEx, NativeListener.NativeAdListener nativeAdListener) {
        if (nativeAdListener != null && campaignEx != null) {
            nativeAdListener.onAdClick(campaignEx);
        }
        a(campaignEx);
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02a4 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:6:0x0009, B:9:0x0010, B:11:0x0033, B:13:0x0039, B:14:0x0040, B:15:0x0048, B:18:0x0062, B:20:0x007a, B:22:0x007e, B:23:0x0085, B:25:0x009f, B:26:0x00a6, B:28:0x00aa, B:29:0x00c0, B:31:0x00c9, B:33:0x00cd, B:34:0x00d4, B:36:0x00e4, B:40:0x00ee, B:42:0x00f4, B:44:0x00fa, B:46:0x0106, B:48:0x010a, B:49:0x0111, B:51:0x0115, B:53:0x011f, B:56:0x0126, B:58:0x012a, B:59:0x0131, B:61:0x014b, B:64:0x0153, B:65:0x0163, B:67:0x0169, B:69:0x016d, B:70:0x0174, B:72:0x017e, B:74:0x0184, B:76:0x018a, B:78:0x0194, B:79:0x019c, B:81:0x01a0, B:82:0x01a7, B:84:0x01b1, B:86:0x01b7, B:87:0x01be, B:89:0x01c4, B:91:0x01d0, B:93:0x01df, B:94:0x01e8, B:96:0x01ec, B:97:0x01f3, B:99:0x01f9, B:100:0x0202, B:102:0x0206, B:105:0x01ff, B:106:0x0213, B:109:0x0223, B:116:0x023a, B:118:0x0244, B:120:0x024c, B:122:0x0254, B:124:0x025d, B:125:0x0264, B:127:0x0272, B:129:0x0279, B:130:0x0280, B:132:0x0284, B:134:0x0299, B:139:0x02a4, B:141:0x02ac, B:142:0x02af, B:144:0x02b5, B:146:0x02b9, B:147:0x02bc, B:150:0x02c2, B:152:0x02c8, B:154:0x02d2, B:156:0x02d6, B:158:0x02da, B:159:0x02dd, B:160:0x02f6, B:162:0x02e8, B:164:0x02f3, B:166:0x02fc, B:168:0x030a, B:173:0x0312, B:174:0x031a, B:175:0x0321, B:177:0x0325, B:178:0x0328, B:181:0x032f, B:183:0x0335, B:185:0x033b, B:189:0x0342, B:191:0x034d, B:193:0x0356, B:195:0x035a, B:197:0x0362, B:198:0x0365, B:200:0x036b, B:202:0x036f, B:203:0x0372, B:205:0x0376, B:207:0x037a, B:208:0x037d, B:210:0x038a, B:212:0x038e), top: B:5:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x032d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.mbridge.msdk.foundation.entity.CampaignEx r18) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.entity.CampaignEx):void");
    }

    private AppletSchemeCallBack a(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        return new g(nativeTrackingListener, campaignEx, appletsModel, aVar);
    }

    private void a(Context context, CampaignEx campaignEx, List<String> list) {
        if (context == null) {
            com.mbridge.msdk.foundation.same.report.i.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx, 2, "context is null", this.f14742d);
            return;
        }
        boolean z8 = z.z() == 1;
        boolean z9 = z.u(context) == 1;
        if (z8 && z9) {
            String ghId = campaignEx.getGhId();
            String ghPath = campaignEx.getGhPath();
            String bindId = campaignEx.getBindId();
            String h6 = com.mbridge.msdk.foundation.controller.c.m().h();
            if (!TextUtils.isEmpty(ghId)) {
                try {
                    if (!TextUtils.isEmpty(h6)) {
                        bindId = h6;
                    }
                    Object b8 = z.b(bindId);
                    Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
                    Object newInstance = cls.newInstance();
                    cls.getField("userName").set(newInstance, ghId);
                    cls.getField(MBridgeConstans.DYNAMIC_VIEW_WX_PATH).set(newInstance, ghPath);
                    cls.getField("miniprogramType").set(newInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
                    Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(b8, newInstance);
                    com.mbridge.msdk.foundation.same.report.i.a(context, campaignEx, 1, "", this.f14742d);
                    return;
                } catch (Throwable th) {
                    com.mbridge.msdk.foundation.same.report.i.a(context, campaignEx, 2, th.getMessage(), this.f14742d);
                    a(campaignEx, list);
                    return;
                }
            }
            a(campaignEx, list);
            com.mbridge.msdk.foundation.same.report.i.a(context, campaignEx, 2, "ghid is empty", this.f14742d);
            return;
        }
        com.mbridge.msdk.foundation.same.report.i.a(context, campaignEx, 2, "integrated:" + z8 + "-hasWx:" + z9, this.f14742d);
        a(campaignEx, list);
    }

    private void a(CampaignEx campaignEx, List<String> list) {
        if (b() == 2) {
            ah.a(this.f14745g, campaignEx.getClickURL(), campaignEx, this.f14747i, list);
        } else {
            ah.a(this.f14745g, campaignEx.getClickURL(), this.f14747i, campaignEx, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0102 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:3:0x0009, B:6:0x0016, B:7:0x002a, B:10:0x0036, B:11:0x0046, B:12:0x004b, B:14:0x005d, B:18:0x0063, B:21:0x007a, B:23:0x007f, B:25:0x00ed, B:27:0x0102, B:28:0x0105, B:30:0x0109, B:32:0x0113, B:34:0x0117, B:37:0x0124, B:39:0x0128, B:40:0x012f, B:42:0x0091, B:44:0x009d, B:46:0x00a7, B:49:0x00b0, B:51:0x00ca, B:53:0x00d1, B:54:0x00d4, B:57:0x00da, B:58:0x00e3, B:60:0x00e8), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0128 A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:3:0x0009, B:6:0x0016, B:7:0x002a, B:10:0x0036, B:11:0x0046, B:12:0x004b, B:14:0x005d, B:18:0x0063, B:21:0x007a, B:23:0x007f, B:25:0x00ed, B:27:0x0102, B:28:0x0105, B:30:0x0109, B:32:0x0113, B:34:0x0117, B:37:0x0124, B:39:0x0128, B:40:0x012f, B:42:0x0091, B:44:0x009d, B:46:0x00a7, B:49:0x00b0, B:51:0x00ca, B:53:0x00d1, B:54:0x00d4, B:57:0x00da, B:58:0x00e3, B:60:0x00e8), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(final com.mbridge.msdk.foundation.entity.CampaignEx r16, final boolean r17, final java.lang.Boolean r18, final java.util.List<java.lang.String> r19) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.entity.CampaignEx, boolean, java.lang.Boolean, java.util.List):void");
    }

    public final void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, int i9, boolean z8) {
        if (campaignEx == null || jumpLoaderResult == null) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.f14743e;
            com.mbridge.msdk.foundation.entity.e eVar = new com.mbridge.msdk.foundation.entity.e();
            int l = z.l(this.f14745g);
            eVar.a(l);
            eVar.c(z.a(this.f14745g, l));
            eVar.b(campaignEx.getRequestId());
            eVar.k(campaignEx.getRequestIdNotice());
            eVar.b(i9);
            eVar.i(currentTimeMillis + "");
            eVar.j(campaignEx.getId());
            eVar.c(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.h(URLEncoder.encode(jumpLoaderResult.getUrl(), "utf-8"));
            }
            eVar.e((this.f14743e / 1000) + "");
            eVar.d(Integer.parseInt(campaignEx.getLandingType()));
            eVar.e(campaignEx.getLinkType());
            eVar.a(this.f14742d);
            eVar.c(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.h(URLEncoder.encode(jumpLoaderResult.getUrl(), "utf-8"));
            }
            if (this.l) {
                eVar.f(jumpLoaderResult.getStatusCode());
                if (!TextUtils.isEmpty(jumpLoaderResult.getHeader())) {
                    eVar.f(URLEncoder.encode(jumpLoaderResult.getHeader(), "utf-8"));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                    eVar.g(URLEncoder.encode(jumpLoaderResult.getContent(), "UTF-8"));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getExceptionMsg())) {
                    eVar.d(URLEncoder.encode(jumpLoaderResult.getExceptionMsg(), "utf-8"));
                }
            }
            try {
                if (z8) {
                    StringBuilder sb = new StringBuilder();
                    String j7 = eVar.j();
                    if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                        sb.append("rid=" + eVar.b());
                        sb.append("&rid_n=" + eVar.c());
                        sb.append("&network_type=" + eVar.d());
                        sb.append("&network_str=" + eVar.e());
                        sb.append("&click_type=" + eVar.g());
                        sb.append("&type=" + eVar.h());
                        sb.append("&cid=" + eVar.f());
                        sb.append("&click_duration=" + eVar.i());
                        sb.append("&key=2000012");
                        sb.append("&unit_id=" + eVar.a());
                        sb.append("&last_url=" + j7);
                        sb.append("&code=" + eVar.k());
                        sb.append("&exception=" + eVar.l());
                        sb.append("&landing_type=" + eVar.m());
                        sb.append("&link_type=" + eVar.n());
                        sb.append("&click_time=" + eVar.o() + "\n");
                    } else {
                        sb.append("rid=" + eVar.b());
                        sb.append("&rid_n=" + eVar.c());
                        sb.append("&click_type=" + eVar.g());
                        sb.append("&type=" + eVar.h());
                        sb.append("&cid=" + eVar.f());
                        sb.append("&click_duration=" + eVar.i());
                        sb.append("&key=2000012");
                        sb.append("&unit_id=" + eVar.a());
                        sb.append("&last_url=" + j7);
                        sb.append("&code=" + eVar.k());
                        sb.append("&exception=" + eVar.l());
                        sb.append("&landing_type=" + eVar.m());
                        sb.append("&link_type=" + eVar.n());
                        sb.append("&click_time=" + eVar.o() + "\n");
                    }
                    String sb2 = sb.toString();
                    if (!TextUtils.isEmpty(sb2)) {
                        com.mbridge.msdk.foundation.same.report.d.c.a().d(sb2);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(eVar);
                    String a6 = com.mbridge.msdk.foundation.entity.e.a(arrayList);
                    if (an.b(a6)) {
                        try {
                            new com.mbridge.msdk.foundation.same.report.h(this.f14745g, 0);
                            com.mbridge.msdk.foundation.same.report.d.c.a().d(a6);
                        } catch (Throwable th) {
                            th = th;
                            th.printStackTrace();
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void a(Campaign campaign, String str) {
        try {
            if (!TextUtils.isEmpty(str) && campaign != null) {
                CampaignEx campaignEx = campaign instanceof CampaignEx ? (CampaignEx) campaign : null;
                if ((!str.startsWith("market://") && !str.startsWith("https://play.google.com/")) || ah.a.a(this.f14745g, str, this.f14747i) || campaignEx == null) {
                    return;
                }
                if (!TextUtils.isEmpty(campaignEx.getPackageName())) {
                    ah.a.a(this.f14745g, "market://details?id=" + campaignEx.getPackageName(), this.f14747i);
                    return;
                }
                if (b() == 2) {
                    ah.a(this.f14745g, campaignEx.getClickURL(), campaignEx, this.f14747i, new ArrayList());
                } else {
                    ah.a(this.f14745g, campaignEx.getClickURL(), this.f14747i, campaignEx, new ArrayList());
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, boolean z8) {
        a(jumpLoaderResult, campaignEx, 1, z8);
    }

    private void a(int i9, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (i9 == 2) {
                    ah.a(this.f14745g, str, campaignEx, nativeTrackingListener, list);
                } else {
                    ah.a(this.f14745g, str, nativeTrackingListener, campaignEx, list);
                }
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonClickControl", th.getMessage(), th);
            }
        }
    }

    private boolean a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z8, int i9, List<String> list) {
        boolean z9 = true;
        boolean z10 = false;
        if (z8) {
            try {
                int parseInt = Integer.parseInt(campaignEx.getLandingType());
                if (parseInt == 1) {
                    ah.a(this.f14745g, jumpLoaderResult.getUrl(), this.f14747i, campaignEx, list);
                } else if (parseInt == 2) {
                    ah.a(this.f14745g, jumpLoaderResult.getUrl(), campaignEx, this.f14747i, list);
                } else if (campaignEx.getPackageName() != null) {
                    if (ah.a.a(this.f14745g, "market://details?id=" + campaignEx.getPackageName(), this.f14747i)) {
                        if (list != null) {
                            try {
                                list.add("google_play");
                            } catch (Throwable th) {
                                th = th;
                                if (MBridgeConstans.DEBUG) {
                                    ad.b("CommonClickControl", th.getMessage(), th);
                                }
                                return z9;
                            }
                        }
                        a(campaignEx, 1, 1, list);
                    } else {
                        a(i9, jumpLoaderResult.getUrl(), campaignEx, this.f14747i, list);
                    }
                } else {
                    a(i9, jumpLoaderResult.getUrl(), campaignEx, this.f14747i, list);
                }
                z10 = true;
            } catch (Throwable th2) {
                th = th2;
                z9 = false;
            }
        }
        if (z10) {
            a(jumpLoaderResult, campaignEx, true);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f14747i;
            if (nativeTrackingListener == null) {
                return z10;
            }
            nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
            return z10;
        }
        a(jumpLoaderResult, campaignEx, true);
        NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f14747i;
        if (nativeTrackingListener2 == null || !z8) {
            return z10;
        }
        nativeTrackingListener2.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
        return z10;
    }

    private boolean a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z8, List<String> list) {
        boolean z9 = false;
        if (z8) {
            try {
                if (com.mbridge.msdk.e.b.a()) {
                    b.a(this.f14745g, this.f14742d, campaignEx, campaignEx.getNoticeUrl(), com.mbridge.msdk.foundation.same.a.f15665L);
                }
                ah.a(this.f14745g, campaignEx.getClickURL(), this.f14747i, campaignEx, list);
                z9 = true;
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CommonClickControl", th.getMessage(), th);
                }
            }
        }
        a(jumpLoaderResult, campaignEx, true);
        if (z9) {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f14747i;
            if (nativeTrackingListener != null) {
                nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
            }
        } else {
            if (com.mbridge.msdk.e.b.a()) {
                a(jumpLoaderResult, campaignEx, true);
            }
            NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f14747i;
            if (nativeTrackingListener2 != null) {
                nativeTrackingListener2.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cd, code lost:
    
        if (com.mbridge.msdk.foundation.tools.ah.a.a(r16.f14745g, "market://details?id=" + r17.getPackageName(), r16.f14747i) == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.mbridge.msdk.foundation.entity.CampaignEx r17, com.mbridge.msdk.click.entity.JumpLoaderResult r18, boolean r19, boolean r20, java.lang.Boolean r21, java.util.List<java.lang.String> r22) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.click.entity.JumpLoaderResult, boolean, boolean, java.lang.Boolean, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0012, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            if (r4 != r0) goto Le
            boolean r4 = com.mbridge.msdk.foundation.tools.ah.a.b(r5)     // Catch: java.lang.Exception -> Lc
            if (r4 == 0) goto L15
            goto L16
        Lc:
            r4 = move-exception
            goto L18
        Le:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> Lc
            if (r4 != 0) goto L15
            goto L16
        L15:
            r1 = r2
        L16:
            r2 = r1
            goto L1b
        L18:
            r4.printStackTrace()
        L1b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(int, java.lang.String):boolean");
    }

    private void a(CampaignEx campaignEx, int i9, int i10, List<String> list) {
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("type", Integer.valueOf(i9));
            dVar.a("result", Integer.valueOf(i10));
            if (list != null) {
                dVar.a("click_path", list.toString());
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", campaignEx, dVar);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonClickControl", e4.getMessage());
            }
        }
    }

    public static /* synthetic */ String a(int i9) {
        if (i9 == 1) {
            return "2000136";
        }
        if (i9 == 2) {
            return "2000137";
        }
        if (i9 == 3) {
            return "2000139";
        }
        if (i9 != 4) {
            return "";
        }
        return "2000138";
    }

    public static /* synthetic */ void a(a aVar, CampaignEx campaignEx) {
        try {
            Intent intent = new Intent(aVar.f14745g, (Class<?>) LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            aVar.f14745g.startActivity(intent);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonClickControl", "Exception", e4);
            }
        }
    }

    public static /* synthetic */ void a(a aVar, final boolean z8, final Campaign campaign) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.mbridge.msdk.click.a.5
            @Override // java.lang.Runnable
            public final void run() {
                if (z8 && !a.f14740a && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                    a.f(a.this);
                }
                if (a.this.f14747i != null && !a.f14740a && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                    a.this.f14747i.onDismissLoading(campaign);
                }
            }
        });
    }
}

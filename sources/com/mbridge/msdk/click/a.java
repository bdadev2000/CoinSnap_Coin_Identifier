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

/* loaded from: classes4.dex */
public final class a {
    public static boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Map<String, Long> f12447b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static Set<String> f12448c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private String f12449d;

    /* renamed from: e, reason: collision with root package name */
    private long f12450e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.foundation.db.g f12451f;

    /* renamed from: g, reason: collision with root package name */
    private Context f12452g;

    /* renamed from: h, reason: collision with root package name */
    private d f12453h;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.h f12455j;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.c.g f12456k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12457l;

    /* renamed from: o, reason: collision with root package name */
    private boolean f12460o;

    /* renamed from: p, reason: collision with root package name */
    private i f12461p;

    /* renamed from: i, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f12454i = null;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12458m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f12459n = true;

    public a(Context context, String str) {
        this.f12451f = null;
        this.f12452g = null;
        com.mbridge.msdk.c.g b3 = com.mbridge.msdk.c.h.a().b(str);
        this.f12456k = b3;
        if (b3 == null) {
            com.mbridge.msdk.c.h.a();
            this.f12456k = com.mbridge.msdk.c.i.a();
        }
        this.f12457l = this.f12456k.aH();
        Context applicationContext = context.getApplicationContext();
        this.f12452g = applicationContext;
        this.f12449d = str;
        if (this.f12451f == null) {
            this.f12451f = com.mbridge.msdk.foundation.db.g.a(applicationContext);
        }
        this.f12455j = new com.mbridge.msdk.foundation.same.report.h(this.f12452g);
    }

    public static /* synthetic */ String a(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "" : "2000138" : "2000139" : "2000137" : "2000136";
    }

    public static /* synthetic */ void f(a aVar) {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            aVar.f12452g.sendBroadcast(intent);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonClickControl", "Exception", e2);
            }
        }
    }

    private boolean b(CampaignEx campaignEx) {
        Long l10;
        if (campaignEx == null) {
            return true;
        }
        try {
            if (2 != campaignEx.getLinkType() && 3 != campaignEx.getLinkType()) {
                return true;
            }
            String id2 = campaignEx.getId();
            Map<String, Long> map = f12447b;
            if (map == null) {
                return true;
            }
            if (map.containsKey(id2) && (l10 = f12447b.get(id2)) != null) {
                if (l10.longValue() > System.currentTimeMillis() || f12448c.contains(campaignEx.getId())) {
                    return false;
                }
            }
            f12447b.put(campaignEx.getId(), Long.valueOf(System.currentTimeMillis() + (campaignEx.getClickTimeOutInterval() * 1000)));
            return true;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return true;
            }
            e2.printStackTrace();
            return true;
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, boolean z10, boolean z11) {
        if (context == null) {
            return;
        }
        new d(context.getApplicationContext()).a(str, campaignEx, null, str2, z10, z11, com.mbridge.msdk.click.a.a.f12479f);
    }

    public static void a(Context context, final CampaignEx campaignEx, String str, final String str2, boolean z10, boolean z11, final int i10) {
        if (context == null) {
            return;
        }
        final int i11 = TextUtils.isEmpty(str2) ? -1 : str2.startsWith("tcp") ? 1 : 0;
        new d(context.getApplicationContext()).a(str, campaignEx, new f() { // from class: com.mbridge.msdk.click.a.1
            @Override // com.mbridge.msdk.click.f
            public final void a(Object obj) {
            }

            @Override // com.mbridge.msdk.click.f
            public final void b(Object obj) {
                try {
                    com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar.a("result", 2);
                    dVar.a("net_ty", String.valueOf(i11));
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
                    com.mbridge.msdk.foundation.same.report.d.c.a().a(a.a(i10), campaignEx, dVar);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CommonClickControl", e2.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.click.f
            public final void a(Object obj, String str3) {
                try {
                    String a10 = a.a(i10);
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
                    dVar.a("net_ty", String.valueOf(i11));
                    com.mbridge.msdk.foundation.same.report.d.c.a().a(a10, campaignEx, dVar);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("CommonClickControl", e2.getMessage());
                    }
                }
            }
        }, str2, z10, z11, i10);
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String[] strArr, boolean z10, boolean z11) {
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
            }, str2, z10, z11, com.mbridge.msdk.click.a.a.f12479f);
        }
    }

    private int b() {
        try {
            com.mbridge.msdk.c.g gVar = this.f12456k;
            if (gVar != null) {
                return gVar.V();
            }
            return 1;
        } catch (Exception e2) {
            e2.printStackTrace();
            return 1;
        }
    }

    public final void a(String str) {
        this.f12449d = str;
    }

    public final void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f12454i = nativeTrackingListener;
    }

    public final void a(i iVar) {
        this.f12461p = iVar;
    }

    public final void a(boolean z10) {
        this.f12459n = z10;
    }

    public final void a() {
        try {
            this.f12454i = null;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void a(CampaignEx campaignEx, NativeListener.NativeAdListener nativeAdListener) {
        if (nativeAdListener != null && campaignEx != null) {
            nativeAdListener.onAdClick(campaignEx);
        }
        a(campaignEx);
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02a0 A[Catch: all -> 0x038e, TryCatch #0 {all -> 0x038e, blocks: (B:6:0x0009, B:9:0x0010, B:11:0x0033, B:13:0x0039, B:14:0x003c, B:15:0x0044, B:18:0x005e, B:20:0x0076, B:22:0x007a, B:23:0x0081, B:25:0x009b, B:26:0x00a2, B:28:0x00a6, B:29:0x00bc, B:31:0x00c5, B:33:0x00c9, B:34:0x00d0, B:36:0x00e0, B:40:0x00ea, B:42:0x00f0, B:44:0x00f6, B:46:0x0102, B:48:0x0106, B:49:0x010d, B:51:0x0111, B:53:0x011b, B:56:0x0122, B:58:0x0126, B:59:0x012d, B:61:0x0147, B:64:0x014f, B:65:0x015f, B:67:0x0165, B:69:0x0169, B:70:0x0170, B:72:0x017a, B:74:0x0180, B:76:0x0186, B:78:0x0190, B:79:0x0198, B:81:0x019c, B:82:0x01a3, B:84:0x01ad, B:86:0x01b3, B:87:0x01ba, B:89:0x01c0, B:91:0x01cc, B:93:0x01db, B:94:0x01e4, B:96:0x01e8, B:97:0x01ef, B:99:0x01f5, B:100:0x01fe, B:102:0x0202, B:105:0x01fb, B:106:0x020f, B:109:0x021f, B:116:0x0236, B:118:0x0240, B:120:0x0248, B:122:0x0250, B:124:0x0259, B:125:0x0260, B:127:0x026e, B:129:0x0275, B:130:0x027c, B:132:0x0280, B:134:0x0295, B:139:0x02a0, B:141:0x02a8, B:142:0x02ab, B:144:0x02b1, B:146:0x02b5, B:147:0x02b8, B:150:0x02be, B:152:0x02c4, B:154:0x02ce, B:156:0x02d2, B:158:0x02d6, B:159:0x02d9, B:160:0x02f2, B:162:0x02e4, B:164:0x02ef, B:166:0x02f8, B:168:0x0306, B:173:0x030e, B:174:0x0316, B:175:0x031d, B:177:0x0321, B:178:0x0324, B:181:0x032b, B:183:0x0331, B:185:0x0337, B:189:0x033e, B:191:0x0349, B:193:0x0352, B:195:0x0356, B:197:0x035e, B:198:0x0361, B:200:0x0367, B:202:0x036b, B:203:0x036e, B:205:0x0372, B:207:0x0376, B:208:0x0379, B:210:0x0386, B:212:0x038a), top: B:5:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0329  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.mbridge.msdk.foundation.entity.CampaignEx r18) {
        /*
            Method dump skipped, instructions count: 923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.entity.CampaignEx):void");
    }

    private AppletSchemeCallBack a(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        return new g(nativeTrackingListener, campaignEx, appletsModel, aVar);
    }

    private void a(Context context, CampaignEx campaignEx, List<String> list) {
        if (context == null) {
            com.mbridge.msdk.foundation.same.report.i.a(com.mbridge.msdk.foundation.controller.c.m().c(), campaignEx, 2, "context is null", this.f12449d);
            return;
        }
        boolean z10 = z.z() == 1;
        boolean z11 = z.u(context) == 1;
        if (z10 && z11) {
            String ghId = campaignEx.getGhId();
            String ghPath = campaignEx.getGhPath();
            String bindId = campaignEx.getBindId();
            String h10 = com.mbridge.msdk.foundation.controller.c.m().h();
            if (!TextUtils.isEmpty(ghId)) {
                try {
                    if (!TextUtils.isEmpty(h10)) {
                        bindId = h10;
                    }
                    Object b3 = z.b(bindId);
                    Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
                    Object newInstance = cls.newInstance();
                    cls.getField("userName").set(newInstance, ghId);
                    cls.getField(MBridgeConstans.DYNAMIC_VIEW_WX_PATH).set(newInstance, ghPath);
                    cls.getField("miniprogramType").set(newInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
                    Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(b3, newInstance);
                    com.mbridge.msdk.foundation.same.report.i.a(context, campaignEx, 1, "", this.f12449d);
                    return;
                } catch (Throwable th2) {
                    com.mbridge.msdk.foundation.same.report.i.a(context, campaignEx, 2, th2.getMessage(), this.f12449d);
                    a(campaignEx, list);
                    return;
                }
            }
            a(campaignEx, list);
            com.mbridge.msdk.foundation.same.report.i.a(context, campaignEx, 2, "ghid is empty", this.f12449d);
            return;
        }
        com.mbridge.msdk.foundation.same.report.i.a(context, campaignEx, 2, "integrated:" + z10 + "-hasWx:" + z11, this.f12449d);
        a(campaignEx, list);
    }

    private void a(CampaignEx campaignEx, List<String> list) {
        if (b() == 2) {
            ah.a(this.f12452g, campaignEx.getClickURL(), campaignEx, this.f12454i, list);
        } else {
            ah.a(this.f12452g, campaignEx.getClickURL(), this.f12454i, campaignEx, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00fe A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:3:0x0009, B:6:0x0016, B:7:0x0027, B:10:0x0033, B:11:0x0043, B:12:0x0048, B:14:0x005a, B:18:0x0060, B:21:0x0077, B:23:0x007c, B:25:0x00e9, B:27:0x00fe, B:28:0x0101, B:30:0x0105, B:32:0x010f, B:34:0x0113, B:37:0x0120, B:39:0x0124, B:40:0x012b, B:42:0x008d, B:44:0x0099, B:46:0x00a3, B:49:0x00ac, B:51:0x00c6, B:53:0x00cd, B:54:0x00d0, B:57:0x00d6, B:58:0x00df, B:60:0x00e4), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0124 A[Catch: Exception -> 0x0148, TryCatch #0 {Exception -> 0x0148, blocks: (B:3:0x0009, B:6:0x0016, B:7:0x0027, B:10:0x0033, B:11:0x0043, B:12:0x0048, B:14:0x005a, B:18:0x0060, B:21:0x0077, B:23:0x007c, B:25:0x00e9, B:27:0x00fe, B:28:0x0101, B:30:0x0105, B:32:0x010f, B:34:0x0113, B:37:0x0120, B:39:0x0124, B:40:0x012b, B:42:0x008d, B:44:0x0099, B:46:0x00a3, B:49:0x00ac, B:51:0x00c6, B:53:0x00cd, B:54:0x00d0, B:57:0x00d6, B:58:0x00df, B:60:0x00e4), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(final com.mbridge.msdk.foundation.entity.CampaignEx r16, final boolean r17, final java.lang.Boolean r18, final java.util.List<java.lang.String> r19) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.entity.CampaignEx, boolean, java.lang.Boolean, java.util.List):void");
    }

    public final void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, int i10, boolean z10) {
        if (campaignEx == null || jumpLoaderResult == null) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.f12450e;
            com.mbridge.msdk.foundation.entity.e eVar = new com.mbridge.msdk.foundation.entity.e();
            int l10 = z.l(this.f12452g);
            eVar.a(l10);
            eVar.c(z.a(this.f12452g, l10));
            eVar.b(campaignEx.getRequestId());
            eVar.k(campaignEx.getRequestIdNotice());
            eVar.b(i10);
            eVar.i(currentTimeMillis + "");
            eVar.j(campaignEx.getId());
            eVar.c(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.h(URLEncoder.encode(jumpLoaderResult.getUrl(), "utf-8"));
            }
            eVar.e((this.f12450e / 1000) + "");
            eVar.d(Integer.parseInt(campaignEx.getLandingType()));
            eVar.e(campaignEx.getLinkType());
            eVar.a(this.f12449d);
            eVar.c(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.h(URLEncoder.encode(jumpLoaderResult.getUrl(), "utf-8"));
            }
            if (this.f12457l) {
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
                if (z10) {
                    StringBuilder sb2 = new StringBuilder();
                    String j3 = eVar.j();
                    if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.j().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                        sb2.append("rid=" + eVar.b());
                        sb2.append("&rid_n=" + eVar.c());
                        sb2.append("&network_type=" + eVar.d());
                        sb2.append("&network_str=" + eVar.e());
                        sb2.append("&click_type=" + eVar.g());
                        sb2.append("&type=" + eVar.h());
                        sb2.append("&cid=" + eVar.f());
                        sb2.append("&click_duration=" + eVar.i());
                        sb2.append("&key=2000012");
                        sb2.append("&unit_id=" + eVar.a());
                        sb2.append("&last_url=" + j3);
                        sb2.append("&code=" + eVar.k());
                        sb2.append("&exception=" + eVar.l());
                        sb2.append("&landing_type=" + eVar.m());
                        sb2.append("&link_type=" + eVar.n());
                        sb2.append("&click_time=" + eVar.o() + "\n");
                    } else {
                        sb2.append("rid=" + eVar.b());
                        sb2.append("&rid_n=" + eVar.c());
                        sb2.append("&click_type=" + eVar.g());
                        sb2.append("&type=" + eVar.h());
                        sb2.append("&cid=" + eVar.f());
                        sb2.append("&click_duration=" + eVar.i());
                        sb2.append("&key=2000012");
                        sb2.append("&unit_id=" + eVar.a());
                        sb2.append("&last_url=" + j3);
                        sb2.append("&code=" + eVar.k());
                        sb2.append("&exception=" + eVar.l());
                        sb2.append("&landing_type=" + eVar.m());
                        sb2.append("&link_type=" + eVar.n());
                        sb2.append("&click_time=" + eVar.o() + "\n");
                    }
                    String sb3 = sb2.toString();
                    if (!TextUtils.isEmpty(sb3)) {
                        com.mbridge.msdk.foundation.same.report.d.c.a().d(sb3);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(eVar);
                    String a10 = com.mbridge.msdk.foundation.entity.e.a(arrayList);
                    if (an.b(a10)) {
                        try {
                            new com.mbridge.msdk.foundation.same.report.h(this.f12452g, 0);
                            com.mbridge.msdk.foundation.same.report.d.c.a().d(a10);
                        } catch (Throwable th2) {
                            th = th2;
                            th.printStackTrace();
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void a(Campaign campaign, String str) {
        try {
            if (!TextUtils.isEmpty(str) && campaign != null) {
                CampaignEx campaignEx = campaign instanceof CampaignEx ? (CampaignEx) campaign : null;
                if ((!str.startsWith("market://") && !str.startsWith("https://play.google.com/")) || ah.a.a(this.f12452g, str, this.f12454i) || campaignEx == null) {
                    return;
                }
                if (!TextUtils.isEmpty(campaignEx.getPackageName())) {
                    ah.a.a(this.f12452g, "market://details?id=" + campaignEx.getPackageName(), this.f12454i);
                    return;
                }
                if (b() == 2) {
                    ah.a(this.f12452g, campaignEx.getClickURL(), campaignEx, this.f12454i, new ArrayList());
                } else {
                    ah.a(this.f12452g, campaignEx.getClickURL(), this.f12454i, campaignEx, new ArrayList());
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, boolean z10) {
        a(jumpLoaderResult, campaignEx, 1, z10);
    }

    private void a(int i10, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (i10 == 2) {
                    ah.a(this.f12452g, str, campaignEx, nativeTrackingListener, list);
                } else {
                    ah.a(this.f12452g, str, nativeTrackingListener, campaignEx, list);
                }
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonClickControl", th2.getMessage(), th2);
            }
        }
    }

    private boolean a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z10, int i10, List<String> list) {
        boolean z11 = true;
        boolean z12 = false;
        if (z10) {
            try {
                int parseInt = Integer.parseInt(campaignEx.getLandingType());
                if (parseInt == 1) {
                    ah.a(this.f12452g, jumpLoaderResult.getUrl(), this.f12454i, campaignEx, list);
                } else if (parseInt == 2) {
                    ah.a(this.f12452g, jumpLoaderResult.getUrl(), campaignEx, this.f12454i, list);
                } else if (campaignEx.getPackageName() != null) {
                    if (ah.a.a(this.f12452g, "market://details?id=" + campaignEx.getPackageName(), this.f12454i)) {
                        if (list != null) {
                            try {
                                list.add("google_play");
                            } catch (Throwable th2) {
                                th = th2;
                                if (MBridgeConstans.DEBUG) {
                                    ad.b("CommonClickControl", th.getMessage(), th);
                                }
                                return z11;
                            }
                        }
                        a(campaignEx, 1, 1, list);
                    } else {
                        a(i10, jumpLoaderResult.getUrl(), campaignEx, this.f12454i, list);
                    }
                } else {
                    a(i10, jumpLoaderResult.getUrl(), campaignEx, this.f12454i, list);
                }
                z12 = true;
            } catch (Throwable th3) {
                th = th3;
                z11 = false;
            }
        }
        if (z12) {
            a(jumpLoaderResult, campaignEx, true);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f12454i;
            if (nativeTrackingListener == null) {
                return z12;
            }
            nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
            return z12;
        }
        a(jumpLoaderResult, campaignEx, true);
        NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f12454i;
        if (nativeTrackingListener2 == null || !z10) {
            return z12;
        }
        nativeTrackingListener2.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
        return z12;
    }

    private boolean a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z10, List<String> list) {
        boolean z11 = false;
        if (z10) {
            try {
                if (com.mbridge.msdk.e.b.a()) {
                    b.a(this.f12452g, this.f12449d, campaignEx, campaignEx.getNoticeUrl(), com.mbridge.msdk.foundation.same.a.L);
                }
                ah.a(this.f12452g, campaignEx.getClickURL(), this.f12454i, campaignEx, list);
                z11 = true;
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("CommonClickControl", th2.getMessage(), th2);
                }
            }
        }
        a(jumpLoaderResult, campaignEx, true);
        if (z11) {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f12454i;
            if (nativeTrackingListener != null) {
                nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
            }
        } else {
            if (com.mbridge.msdk.e.b.a()) {
                a(jumpLoaderResult, campaignEx, true);
            }
            NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f12454i;
            if (nativeTrackingListener2 != null) {
                nativeTrackingListener2.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c8, code lost:
    
        if (com.mbridge.msdk.foundation.tools.ah.a.a(r16.f12452g, "market://details?id=" + r17.getPackageName(), r16.f12454i) == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.mbridge.msdk.foundation.entity.CampaignEx r17, com.mbridge.msdk.click.entity.JumpLoaderResult r18, boolean r19, boolean r20, java.lang.Boolean r21, java.util.List<java.lang.String> r22) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.click.entity.JumpLoaderResult, boolean, boolean, java.lang.Boolean, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0010, code lost:
    
        if (android.text.TextUtils.isEmpty(r5) == false) goto L11;
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
            if (r4 != r0) goto Lc
            boolean r4 = com.mbridge.msdk.foundation.tools.ah.a.b(r5)     // Catch: java.lang.Exception -> L16
            if (r4 == 0) goto L13
            goto L14
        Lc:
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L16
            if (r4 != 0) goto L13
            goto L14
        L13:
            r1 = r2
        L14:
            r2 = r1
            goto L1a
        L16:
            r4 = move-exception
            r4.printStackTrace()
        L1a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(int, java.lang.String):boolean");
    }

    private void a(CampaignEx campaignEx, int i10, int i11, List<String> list) {
        try {
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            dVar.a("type", Integer.valueOf(i10));
            dVar.a("result", Integer.valueOf(i11));
            if (list != null) {
                dVar.a("click_path", list.toString());
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a("2000150", campaignEx, dVar);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonClickControl", e2.getMessage());
            }
        }
    }

    public static /* synthetic */ void a(a aVar, CampaignEx campaignEx) {
        try {
            Intent intent = new Intent(aVar.f12452g, (Class<?>) LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            aVar.f12452g.startActivity(intent);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CommonClickControl", "Exception", e2);
            }
        }
    }

    public static /* synthetic */ void a(a aVar, final boolean z10, final Campaign campaign) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.mbridge.msdk.click.a.5
            @Override // java.lang.Runnable
            public final void run() {
                if (z10 && !a.a && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                    a.f(a.this);
                }
                if (a.this.f12454i != null && !a.a && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                    a.this.f12454i.onDismissLoading(campaign);
                }
            }
        });
    }
}

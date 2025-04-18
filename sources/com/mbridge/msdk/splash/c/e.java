package com.mbridge.msdk.splash.c;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.foundation.tools.m;
import com.mbridge.msdk.foundation.tools.n;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.splash.a.d;
import com.mbridge.msdk.splash.c.c;
import com.mbridge.msdk.splash.c.g;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class e {
    private static String a = "SplashLoadManager";

    /* renamed from: b, reason: collision with root package name */
    private String f15151b;

    /* renamed from: c, reason: collision with root package name */
    private String f15152c;

    /* renamed from: d, reason: collision with root package name */
    private long f15153d;

    /* renamed from: e, reason: collision with root package name */
    private long f15154e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.splash.d.b f15155f;

    /* renamed from: h, reason: collision with root package name */
    private MBSplashView f15157h;

    /* renamed from: i, reason: collision with root package name */
    private k f15158i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15159j;

    /* renamed from: k, reason: collision with root package name */
    private int f15160k;

    /* renamed from: l, reason: collision with root package name */
    private int f15161l;

    /* renamed from: m, reason: collision with root package name */
    private int f15162m;

    /* renamed from: n, reason: collision with root package name */
    private String f15163n;

    /* renamed from: o, reason: collision with root package name */
    private int f15164o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f15165p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f15166q;

    /* renamed from: r, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f15167r;

    /* renamed from: s, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f15168s;

    /* renamed from: t, reason: collision with root package name */
    private String f15169t;
    private int u;

    /* renamed from: w, reason: collision with root package name */
    private int f15171w;

    /* renamed from: x, reason: collision with root package name */
    private List<CampaignEx> f15172x;

    /* renamed from: v, reason: collision with root package name */
    private String f15170v = "";

    /* renamed from: y, reason: collision with root package name */
    private String f15173y = "";

    /* renamed from: z, reason: collision with root package name */
    private Handler f15174z = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.splash.c.e.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10;
            super.handleMessage(message);
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        Object obj = message.obj;
                        if (obj instanceof CampaignEx) {
                            e eVar = e.this;
                            eVar.b((CampaignEx) obj, eVar.f15164o);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Object obj2 = message.obj;
                try {
                    if (obj2 instanceof Bundle) {
                        int i12 = ((Bundle) obj2).getInt("type");
                        String string = ((Bundle) obj2).getString(NotificationCompat.CATEGORY_MESSAGE);
                        CampaignEx campaignEx = (CampaignEx) ((Bundle) obj2).getSerializable("campaignex");
                        if (i12 == 1) {
                            i10 = 880004;
                        } else if (i12 == 2) {
                            i10 = 880006;
                        } else {
                            i10 = 880027;
                        }
                        com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(i10);
                        bVar.a(string);
                        e eVar2 = e.this;
                        eVar2.a(bVar, eVar2.f15163n, e.this.f15164o, campaignEx);
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880024);
                    bVar2.a((Throwable) e2);
                    e eVar3 = e.this;
                    eVar3.a(bVar2, eVar3.f15163n, e.this.f15164o, (CampaignEx) null);
                    return;
                }
            }
            Object obj3 = message.obj;
            int i13 = message.arg1;
            if (obj3 instanceof CampaignEx) {
                CampaignEx campaignEx2 = (CampaignEx) obj3;
                e.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx2.getAdZip()), campaignEx2, i13);
            }
        }
    };
    private Runnable A = new Runnable() { // from class: com.mbridge.msdk.splash.c.e.4
        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880010);
            e eVar = e.this;
            eVar.a(bVar, eVar.f15163n, e.this.f15164o, (CampaignEx) null);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private Context f15156g = com.mbridge.msdk.foundation.controller.c.m().c();

    public e(String str, String str2, long j3) {
        this.f15152c = str;
        this.f15151b = str2;
        this.f15154e = j3;
    }

    private void d(final CampaignEx campaignEx, final int i10) {
        d.a(this.f15157h, campaignEx, new com.mbridge.msdk.splash.view.nativeview.a() { // from class: com.mbridge.msdk.splash.c.e.8
            @Override // com.mbridge.msdk.splash.view.nativeview.a
            public final void a() {
                if (campaignEx.isDynamicView() && e.this.f15157h != null) {
                    e.this.f15157h.setImageReady(true);
                    e.b(e.this, campaignEx, i10);
                }
                e.this.b(campaignEx, i10);
            }

            @Override // com.mbridge.msdk.splash.view.nativeview.a
            public final void b() {
                if (campaignEx.isDynamicView() && e.this.f15157h != null) {
                    e.this.f15157h.setImageReady(false);
                    com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880027);
                    e eVar = e.this;
                    eVar.a(bVar, eVar.f15163n, i10, campaignEx);
                }
            }
        });
    }

    private void e() {
        this.f15174z.removeCallbacks(this.A);
    }

    private void f(final CampaignEx campaignEx, final int i10) {
        if (campaignEx.isDynamicView()) {
            n.a(5, "", campaignEx.getAdZip(), new n.a() { // from class: com.mbridge.msdk.splash.c.e.9
                @Override // com.mbridge.msdk.foundation.tools.n.a
                public final void a(String str, String str2, String str3, String str4, boolean z10) {
                    if (z10) {
                        return;
                    }
                    e.a(e.this, campaignEx, str, true, "");
                }

                @Override // com.mbridge.msdk.foundation.tools.n.a
                public final void a(String str, DownloadError downloadError) {
                    String str2 = "";
                    if (downloadError != null) {
                        try {
                            if (downloadError.getException() != null) {
                                str2 = downloadError.getException().getMessage();
                            }
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                e2.printStackTrace();
                                return;
                            }
                            return;
                        }
                    }
                    e.a(e.this, campaignEx, str, false, str2);
                }
            }, campaignEx);
            return;
        }
        this.f15168s = new H5DownLoadManager.ZipDownloadListener() { // from class: com.mbridge.msdk.splash.c.e.10
            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
            public final void onFailed(String str, String str2) {
                com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880006);
                e eVar = e.this;
                eVar.a(bVar, eVar.f15163n, i10, campaignEx);
                Message obtain = Message.obtain();
                obtain.what = 2;
                Bundle bundle = new Bundle();
                bundle.putSerializable("campaignex", campaignEx);
                bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
                bundle.putInt("type", 2);
                obtain.obj = bundle;
                e.this.f15174z.sendMessage(obtain);
                e.a(e.this, campaignEx, str2, false, str);
            }

            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
            public final void onSuccess(String str, String str2, boolean z10) {
                String str3;
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = campaignEx;
                obtain.arg1 = i10;
                e.this.f15174z.sendMessage(obtain);
                if (!z10) {
                    CampaignEx campaignEx2 = campaignEx;
                    if (campaignEx2 == null) {
                        str3 = "";
                    } else {
                        str3 = campaignEx2.getAdZip();
                    }
                    e.a(e.this, campaignEx, str3, true, "");
                }
            }
        };
        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
        bVar.b(297);
        bVar.a(2);
        bVar.a(campaignEx);
        bVar.c(campaignEx.getAabEntity() != null ? campaignEx.getAabEntity().h3c : 0);
        H5DownLoadManager.getInstance().downloadH5Res(bVar, campaignEx.getAdZip(), this.f15168s);
    }

    private void g(final CampaignEx campaignEx, int i10) {
        this.f15167r = new com.mbridge.msdk.videocommon.listener.a() { // from class: com.mbridge.msdk.splash.c.e.3
            @Override // com.mbridge.msdk.videocommon.listener.a
            public final void a(String str) {
                e.this.f15157h.setVideoReady(true);
                Message obtain = Message.obtain();
                obtain.obj = campaignEx;
                obtain.what = 3;
                e.this.f15174z.sendMessage(obtain);
            }

            @Override // com.mbridge.msdk.videocommon.listener.a
            public final void a(String str, String str2) {
                e.this.f15157h.setVideoReady(false);
                com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880004);
                bVar.a(str);
                e eVar = e.this;
                eVar.a(bVar, eVar.f15163n, e.this.f15164o, campaignEx);
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putSerializable("campaignex", campaignEx);
                bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
                bundle.putInt("type", 1);
                obtain.obj = bundle;
                obtain.what = 2;
                e.this.f15174z.sendMessage(obtain);
            }
        };
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f15156g, this.f15151b, copyOnWriteArrayList, 297, this.f15167r);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().a(297, this.f15151b, campaignEx.isBidCampaign())) {
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.f15151b);
        } else {
            this.f15157h.setVideoReady(true);
            b(campaignEx, i10);
        }
    }

    public final void b(int i10) {
        this.f15171w = i10;
    }

    public final void c() {
        if (this.f15155f != null) {
            this.f15155f = null;
        }
        if (this.f15167r != null) {
            this.f15167r = null;
        }
        if (this.f15168s != null) {
            this.f15168s = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
    
        if (r5 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        if (r9.exists() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (r9.isFile() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
    
        if (r9.canRead() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cd, code lost:
    
        r11.setAdHtml(r9.getAbsolutePath());
        a("file:////" + r9.getAbsolutePath(), r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        a(new com.mbridge.msdk.foundation.c.b(880013), r10.f15163n, r12, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009a, code lost:
    
        if (r5 != null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(com.mbridge.msdk.foundation.entity.CampaignEx r11, int r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.c.e.e(com.mbridge.msdk.foundation.entity.CampaignEx, int):void");
    }

    public final String b() {
        return com.mbridge.msdk.foundation.same.c.a(this.f15172x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx, int i10) {
        if (!d.a(this.f15157h, campaignEx) || this.f15166q) {
            return;
        }
        e();
        if (this.f15165p) {
            d.a(campaignEx, this.f15151b);
        }
        this.f15166q = true;
        com.mbridge.msdk.splash.d.b bVar = this.f15155f;
        if (bVar != null) {
            bVar.a(campaignEx, i10);
        }
    }

    public final void a(k kVar) {
        this.f15158i = kVar;
    }

    private void c(CampaignEx campaignEx, int i10) {
        this.f15157h.clearResState();
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            f(campaignEx, i10);
        }
        if (campaignEx.isDynamicView()) {
            return;
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            e(campaignEx, i10);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            g(campaignEx, i10);
        }
        if (TextUtils.isEmpty(campaignEx.getImageUrl())) {
            return;
        }
        d(campaignEx, i10);
    }

    public final void a(MBSplashView mBSplashView) {
        this.f15157h = mBSplashView;
    }

    public final void a(boolean z10) {
        this.f15159j = z10;
    }

    public final void a(int i10) {
        this.f15160k = i10;
    }

    public static /* synthetic */ void b(e eVar, final CampaignEx campaignEx, final int i10) {
        if (campaignEx.isDynamicView()) {
            d.a aVar = new d.a();
            aVar.b(eVar.f15151b).a(eVar.f15152c).a(eVar.f15159j).a(campaignEx).a(eVar.f15160k).h(eVar.f15171w);
            try {
                if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
                    Uri parse = Uri.parse(campaignEx.getAdZip());
                    String queryParameter = parse.getQueryParameter("hdbtn");
                    String queryParameter2 = parse.getQueryParameter("alecfc");
                    String queryParameter3 = parse.getQueryParameter("hdinfo");
                    String queryParameter4 = parse.getQueryParameter("shake_show");
                    String queryParameter5 = parse.getQueryParameter("shake_strength");
                    String queryParameter6 = parse.getQueryParameter("shake_time");
                    String queryParameter7 = parse.getQueryParameter("n_logo");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        aVar.b(Integer.parseInt(queryParameter));
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        aVar.c(Integer.parseInt(queryParameter2));
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        aVar.d(Integer.parseInt(queryParameter3));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        aVar.e(Integer.parseInt(queryParameter4));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        aVar.f(Integer.parseInt(queryParameter5));
                    }
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        aVar.g(Integer.parseInt(queryParameter6));
                    }
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        aVar.i(Integer.parseInt(queryParameter7) == 0 ? 0 : 1);
                    }
                }
            } catch (Throwable th2) {
                ad.b(a, th2.getMessage());
            }
            c.a.a().a(eVar.f15157h, new com.mbridge.msdk.splash.a.d(aVar), new com.mbridge.msdk.splash.b.a() { // from class: com.mbridge.msdk.splash.c.e.11
                @Override // com.mbridge.msdk.splash.b.a
                public final void a(View view) {
                    if (e.this.f15157h != null) {
                        e.this.f15157h.setDynamicView(true);
                        e.this.f15157h.setSplashNativeView(view);
                        e.this.b(campaignEx, i10);
                    }
                }

                @Override // com.mbridge.msdk.splash.b.a
                public final void a(String str) {
                    com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880034);
                    bVar.a(str);
                    e eVar2 = e.this;
                    eVar2.a(bVar, eVar2.f15163n, i10, campaignEx);
                }
            });
        }
    }

    public final void a(int i10, int i11) {
        this.f15162m = i10;
        this.f15161l = i11;
    }

    public final String a() {
        return this.f15170v;
    }

    public final void a(String str, int i10) {
        this.f15166q = false;
        this.f15163n = str;
        this.f15164o = i10;
        CampaignEx a10 = d.a(this.f15157h, this.f15152c, this.f15151b, str, this.f15159j, this.f15160k, false, false);
        long timestamp = a10 != null ? a10.getTimestamp() : 0L;
        if (this.f15158i.m() == 1 && i10 != 1 && a10 != null) {
            a(a10, i10);
            return;
        }
        this.f15165p = true;
        if (i10 == 1) {
            List<Integer> c10 = this.f15158i.c();
            if (c10 != null && c10.size() > 0) {
                this.f15153d = c10.get(0).intValue() * 1000;
            } else {
                this.f15153d = 30000L;
            }
        } else {
            long j3 = this.f15154e;
            if (j3 <= 0) {
                this.f15153d = this.f15158i.r();
            } else {
                this.f15153d = j3;
            }
        }
        if (this.f15158i == null || timestamp <= 0 || !TextUtils.isEmpty(str)) {
            a(this.f15153d);
            a(this.f15156g, str, i10);
            return;
        }
        if (System.currentTimeMillis() - timestamp > this.f15158i.o() * 1000) {
            a(this.f15153d);
            a(this.f15156g, str, i10);
        } else {
            a(a10, i10);
        }
    }

    public static /* synthetic */ void c(e eVar, CampaignEx campaignEx, int i10) {
        if (eVar.f15157h.isH5Ready()) {
            return;
        }
        eVar.f15157h.setH5Ready(true);
        eVar.b(campaignEx, i10);
    }

    private void a(long j3) {
        this.f15174z.postDelayed(this.A, j3);
    }

    private void a(Context context, final String str, final int i10) {
        try {
            if (context == null) {
                a(new com.mbridge.msdk.foundation.c.b(880025), str, i10, (CampaignEx) null);
                return;
            }
            if (an.a(this.f15151b)) {
                a(new com.mbridge.msdk.foundation.c.b(880032), str, i10, (CampaignEx) null);
                return;
            }
            MBridgeIds mBridgeIds = new MBridgeIds(this.f15152c, this.f15151b);
            com.mbridge.msdk.splash.f.f fVar = new com.mbridge.msdk.splash.f.f();
            fVar.a(i10);
            fVar.b(this.u);
            fVar.a(this.f15169t);
            fVar.c(this.f15162m);
            fVar.d(this.f15161l);
            com.mbridge.msdk.foundation.same.net.f.e a10 = com.mbridge.msdk.splash.f.e.a(context, mBridgeIds, fVar);
            if (a10 == null) {
                a(new com.mbridge.msdk.foundation.c.b(880001), str, i10, (CampaignEx) null);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                a10.a(BidResponsed.KEY_TOKEN, str);
            }
            String d10 = ai.d(this.f15151b);
            if (!TextUtils.isEmpty(d10)) {
                a10.a("j", d10);
            }
            com.mbridge.msdk.splash.f.c cVar = new com.mbridge.msdk.splash.f.c(context);
            com.mbridge.msdk.splash.f.b bVar = new com.mbridge.msdk.splash.f.b(i10) { // from class: com.mbridge.msdk.splash.c.e.5
                @Override // com.mbridge.msdk.splash.f.b
                public final void a(CampaignUnit campaignUnit, int i11) {
                    try {
                        e eVar = e.this;
                        e.a(eVar, campaignUnit, i11, eVar.f15151b, str);
                        e.this.f15170v = campaignUnit.getRequestId();
                        e.this.f15172x = campaignUnit.getAds();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880003);
                        bVar2.a((Throwable) e2);
                        e.this.a(bVar2, str, i11, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
                        e.this.u = 0;
                    }
                }

                @Override // com.mbridge.msdk.splash.f.b
                public final void a(int i11, String str2) {
                    ad.b(e.a, str2);
                    com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880002);
                    bVar2.a(str2);
                    e.this.a(bVar2, str, i10, (CampaignEx) null);
                    e.this.u = 0;
                }
            };
            bVar.a(str);
            bVar.setUnitId(this.f15151b);
            bVar.setPlacementId(this.f15152c);
            bVar.setAdType(297);
            cVar.choiceV3OrV5BySetting(1, a10, bVar, str, com.mbridge.msdk.foundation.same.c.a(this.f15153d, 30000L));
        } catch (Exception e2) {
            ad.b(a, e2.getMessage());
            com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880020);
            bVar2.a((Throwable) e2);
            a(bVar2, str, i10, (CampaignEx) null);
            this.u = 0;
        }
    }

    public final void a(com.mbridge.msdk.splash.d.b bVar) {
        this.f15155f = bVar;
    }

    private void a(CampaignEx campaignEx, int i10) {
        MBSplashView mBSplashView = this.f15157h;
        if (mBSplashView != null) {
            mBSplashView.setDynamicView(false);
        }
        if (campaignEx.isDynamicView()) {
            d(campaignEx, i10);
        } else {
            MBSplashView mBSplashView2 = this.f15157h;
            if (mBSplashView2 != null) {
                mBSplashView2.setSplashWebView();
            }
        }
        if (d.a(this.f15157h, campaignEx)) {
            b(campaignEx, i10);
        } else {
            c(campaignEx, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.c.b bVar, String str, int i10, CampaignEx campaignEx) {
        if (this.f15165p) {
            this.f15165p = false;
            a(bVar, i10, str, campaignEx);
        } else {
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.c.b bVar, int i10, String str, CampaignEx campaignEx) {
        CampaignEx a10 = d.a(this.f15157h, this.f15152c, this.f15151b, str, this.f15159j, this.f15160k, true, false);
        if (a10 != null) {
            a(a10, i10);
        } else {
            a(bVar, i10, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.c.b bVar, int i10, CampaignEx campaignEx) {
        if (this.f15166q) {
            return;
        }
        e();
        this.f15166q = true;
        if (bVar != null) {
            bVar.a(campaignEx);
        }
        com.mbridge.msdk.splash.d.b bVar2 = this.f15155f;
        if (bVar2 != null) {
            bVar2.a(bVar, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final CampaignEx campaignEx, final int i10) {
        g.c cVar = new g.c();
        cVar.c(this.f15151b);
        cVar.b(this.f15152c);
        cVar.a(campaignEx);
        cVar.a(str);
        cVar.a(this.f15159j);
        cVar.a(this.f15160k);
        g.a.a().a(this.f15157h, cVar, new g.b() { // from class: com.mbridge.msdk.splash.c.e.2
            @Override // com.mbridge.msdk.splash.c.g.b
            public final void a() {
                if (campaignEx.isHasMBTplMark()) {
                    return;
                }
                e.c(e.this, campaignEx, i10);
            }

            @Override // com.mbridge.msdk.splash.c.g.b
            public final void a(String str2) {
                e.a(e.this, str2, i10, campaignEx);
            }

            @Override // com.mbridge.msdk.splash.c.g.b
            public final void a(int i11) {
                if (i11 == 1) {
                    e.c(e.this, campaignEx, i10);
                } else {
                    e.a(e.this, "readyState 2", i10, campaignEx);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.mbridge.msdk.foundation.same.report.d.a.a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.mbridge.msdk.foundation.entity.CampaignEx] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static /* synthetic */ void a(e eVar, CampaignUnit campaignUnit, int i10, String str, String str2) {
        ArrayList arrayList;
        com.mbridge.msdk.foundation.c.b bVar;
        final CampaignEx campaignEx = 0;
        campaignEx = 0;
        campaignEx = 0;
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            final CampaignEx campaignEx2 = campaignUnit.getAds().get(0);
            campaignEx2.setCampaignUnitId(eVar.f15151b);
            new Thread(new Runnable() { // from class: com.mbridge.msdk.splash.c.e.7
                @Override // java.lang.Runnable
                public final void run() {
                    j.a(com.mbridge.msdk.foundation.db.g.a(e.this.f15156g)).a();
                    m.a(e.this.f15156g, campaignEx2);
                }
            }).start();
            eVar.f15169t = campaignUnit.getSessionId();
            if (campaignEx2.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx2.getAdZip()) || !TextUtils.isEmpty(campaignEx2.getAdHtml()))) {
                if (ai.c(campaignEx2)) {
                    campaignEx2.setRtinsType(ai.c(eVar.f15156g, campaignEx2.getPackageName()) ? 1 : 2);
                }
                if (com.mbridge.msdk.foundation.same.c.a(eVar.f15156g, campaignEx2)) {
                    arrayList.add(campaignEx2);
                } else {
                    ai.a(eVar.f15151b, campaignEx2, com.mbridge.msdk.foundation.same.a.f13292x);
                    eVar.f15173y = "APP ALREADY INSTALLED";
                }
                try {
                    com.mbridge.msdk.foundation.same.c.a(campaignEx2, eVar.f15156g, null, new c.a() { // from class: com.mbridge.msdk.splash.c.e.6
                        @Override // com.mbridge.msdk.foundation.same.c.a
                        public final void a(String str3, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
                            try {
                                com.mbridge.msdk.foundation.same.report.d.c.a().a(str3, bVar2, campaignEx2, e.this.f15156g, campaignEx);
                            } catch (Exception e2) {
                                if (MBridgeConstans.DEBUG) {
                                    e2.printStackTrace();
                                }
                            }
                        }
                    });
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            try {
                int i11 = eVar.u + 1;
                eVar.u = i11;
                k kVar = eVar.f15158i;
                if (kVar == null || i11 > kVar.w()) {
                    eVar.u = 0;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            CampaignEx campaignEx3 = (CampaignEx) arrayList.get(0);
            if (TextUtils.isEmpty(campaignEx3.getAdZip()) && (TextUtils.isEmpty(campaignEx3.getAdHtml()) || !campaignEx3.getAdHtml().contains("<MBTPLMARK>"))) {
                campaignEx3.setHasMBTplMark(false);
                campaignEx3.setIsMraid(true);
            } else {
                campaignEx3.setHasMBTplMark(true);
                campaignEx3.setIsMraid(false);
            }
            eVar.a(campaignEx3, i10);
            return;
        }
        if (eVar.f15173y.contains("INSTALLED")) {
            bVar = new com.mbridge.msdk.foundation.c.b(880021, "APP ALREADY INSTALLED");
        } else {
            bVar = new com.mbridge.msdk.foundation.c.b(880003);
        }
        if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() != 0) {
            campaignEx = campaignUnit.getAds().get(0);
        }
        eVar.a(bVar, str2, i10, campaignEx);
    }

    public static /* synthetic */ void a(e eVar, CampaignEx campaignEx, String str, boolean z10, String str2) {
        try {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            nVar.e(2);
            nVar.a("m_download_end");
            if (campaignEx != null) {
                nVar.d(campaignEx.isMraid() ? com.mbridge.msdk.foundation.entity.n.a : com.mbridge.msdk.foundation.entity.n.f13247b);
                nVar.g(campaignEx.getRequestIdNotice());
            }
            nVar.a("url", str);
            nVar.a("scenes", "1");
            if (z10) {
                nVar.b(1);
            } else {
                nVar.b(3);
                nVar.h(str2);
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, campaignEx);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.b(a, e2.getMessage());
            }
        }
    }

    public static /* synthetic */ void a(e eVar, String str, int i10, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880009);
        bVar.a(str);
        eVar.a(bVar, eVar.f15163n, i10, campaignEx);
    }
}

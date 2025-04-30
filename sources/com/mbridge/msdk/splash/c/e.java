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

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static String f17841a = "SplashLoadManager";
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f17843c;

    /* renamed from: d, reason: collision with root package name */
    private long f17844d;

    /* renamed from: e, reason: collision with root package name */
    private long f17845e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.splash.d.b f17846f;

    /* renamed from: h, reason: collision with root package name */
    private MBSplashView f17848h;

    /* renamed from: i, reason: collision with root package name */
    private k f17849i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f17850j;

    /* renamed from: k, reason: collision with root package name */
    private int f17851k;
    private int l;
    private int m;

    /* renamed from: n, reason: collision with root package name */
    private String f17852n;

    /* renamed from: o, reason: collision with root package name */
    private int f17853o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f17854p;

    /* renamed from: q, reason: collision with root package name */
    private volatile boolean f17855q;

    /* renamed from: r, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f17856r;

    /* renamed from: s, reason: collision with root package name */
    private H5DownLoadManager.ZipDownloadListener f17857s;

    /* renamed from: t, reason: collision with root package name */
    private String f17858t;

    /* renamed from: u, reason: collision with root package name */
    private int f17859u;

    /* renamed from: w, reason: collision with root package name */
    private int f17861w;

    /* renamed from: x, reason: collision with root package name */
    private List<CampaignEx> f17862x;

    /* renamed from: v, reason: collision with root package name */
    private String f17860v = "";

    /* renamed from: y, reason: collision with root package name */
    private String f17863y = "";

    /* renamed from: z, reason: collision with root package name */
    private Handler f17864z = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.splash.c.e.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i9;
            super.handleMessage(message);
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Object obj = message.obj;
                        if (obj instanceof CampaignEx) {
                            e eVar = e.this;
                            eVar.b((CampaignEx) obj, eVar.f17853o);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Object obj2 = message.obj;
                try {
                    if (obj2 instanceof Bundle) {
                        int i11 = ((Bundle) obj2).getInt("type");
                        String string = ((Bundle) obj2).getString(NotificationCompat.CATEGORY_MESSAGE);
                        CampaignEx campaignEx = (CampaignEx) ((Bundle) obj2).getSerializable("campaignex");
                        if (i11 == 1) {
                            i9 = 880004;
                        } else if (i11 == 2) {
                            i9 = 880006;
                        } else {
                            i9 = 880027;
                        }
                        com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(i9);
                        bVar.a(string);
                        e eVar2 = e.this;
                        eVar2.a(bVar, eVar2.f17852n, e.this.f17853o, campaignEx);
                        return;
                    }
                    return;
                } catch (Exception e4) {
                    com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880024);
                    bVar2.a((Throwable) e4);
                    e eVar3 = e.this;
                    eVar3.a(bVar2, eVar3.f17852n, e.this.f17853o, (CampaignEx) null);
                    return;
                }
            }
            Object obj3 = message.obj;
            int i12 = message.arg1;
            if (obj3 instanceof CampaignEx) {
                CampaignEx campaignEx2 = (CampaignEx) obj3;
                e.this.a(H5DownLoadManager.getInstance().getH5ResAddress(campaignEx2.getAdZip()), campaignEx2, i12);
            }
        }
    };

    /* renamed from: A, reason: collision with root package name */
    private Runnable f17842A = new Runnable() { // from class: com.mbridge.msdk.splash.c.e.4
        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880010);
            e eVar = e.this;
            eVar.a(bVar, eVar.f17852n, e.this.f17853o, (CampaignEx) null);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private Context f17847g = com.mbridge.msdk.foundation.controller.c.m().c();

    public e(String str, String str2, long j7) {
        this.f17843c = str;
        this.b = str2;
        this.f17845e = j7;
    }

    private void d(final CampaignEx campaignEx, final int i9) {
        d.a(this.f17848h, campaignEx, new com.mbridge.msdk.splash.view.nativeview.a() { // from class: com.mbridge.msdk.splash.c.e.8
            @Override // com.mbridge.msdk.splash.view.nativeview.a
            public final void a() {
                if (campaignEx.isDynamicView() && e.this.f17848h != null) {
                    e.this.f17848h.setImageReady(true);
                    e.b(e.this, campaignEx, i9);
                }
                e.this.b(campaignEx, i9);
            }

            @Override // com.mbridge.msdk.splash.view.nativeview.a
            public final void b() {
                if (campaignEx.isDynamicView() && e.this.f17848h != null) {
                    e.this.f17848h.setImageReady(false);
                    com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880027);
                    e eVar = e.this;
                    eVar.a(bVar, eVar.f17852n, i9, campaignEx);
                }
            }
        });
    }

    private void e() {
        this.f17864z.removeCallbacks(this.f17842A);
    }

    private void f(final CampaignEx campaignEx, final int i9) {
        if (campaignEx.isDynamicView()) {
            n.a(5, "", campaignEx.getAdZip(), new n.a() { // from class: com.mbridge.msdk.splash.c.e.9
                @Override // com.mbridge.msdk.foundation.tools.n.a
                public final void a(String str, String str2, String str3, String str4, boolean z8) {
                    if (z8) {
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
                        } catch (Exception e4) {
                            if (MBridgeConstans.DEBUG) {
                                e4.printStackTrace();
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
        this.f17857s = new H5DownLoadManager.ZipDownloadListener() { // from class: com.mbridge.msdk.splash.c.e.10
            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
            public final void onFailed(String str, String str2) {
                com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880006);
                e eVar = e.this;
                eVar.a(bVar, eVar.f17852n, i9, campaignEx);
                Message obtain = Message.obtain();
                obtain.what = 2;
                Bundle bundle = new Bundle();
                bundle.putSerializable("campaignex", campaignEx);
                bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
                bundle.putInt("type", 2);
                obtain.obj = bundle;
                e.this.f17864z.sendMessage(obtain);
                e.a(e.this, campaignEx, str2, false, str);
            }

            @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
            public final void onSuccess(String str, String str2, boolean z8) {
                String str3;
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = campaignEx;
                obtain.arg1 = i9;
                e.this.f17864z.sendMessage(obtain);
                if (!z8) {
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
        H5DownLoadManager.getInstance().downloadH5Res(bVar, campaignEx.getAdZip(), this.f17857s);
    }

    private void g(final CampaignEx campaignEx, int i9) {
        this.f17856r = new com.mbridge.msdk.videocommon.listener.a() { // from class: com.mbridge.msdk.splash.c.e.3
            @Override // com.mbridge.msdk.videocommon.listener.a
            public final void a(String str) {
                e.this.f17848h.setVideoReady(true);
                Message obtain = Message.obtain();
                obtain.obj = campaignEx;
                obtain.what = 3;
                e.this.f17864z.sendMessage(obtain);
            }

            @Override // com.mbridge.msdk.videocommon.listener.a
            public final void a(String str, String str2) {
                e.this.f17848h.setVideoReady(false);
                com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880004);
                bVar.a(str);
                e eVar = e.this;
                eVar.a(bVar, eVar.f17852n, e.this.f17853o, campaignEx);
                Message obtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putSerializable("campaignex", campaignEx);
                bundle.putString(NotificationCompat.CATEGORY_MESSAGE, str);
                bundle.putInt("type", 1);
                obtain.obj = bundle;
                obtain.what = 2;
                e.this.f17864z.sendMessage(obtain);
            }
        };
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(campaignEx);
        com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.f17847g, this.b, copyOnWriteArrayList, 297, this.f17856r);
        if (!com.mbridge.msdk.videocommon.download.b.getInstance().a(297, this.b, campaignEx.isBidCampaign())) {
            com.mbridge.msdk.videocommon.download.b.getInstance().load(this.b);
        } else {
            this.f17848h.setVideoReady(true);
            b(campaignEx, i9);
        }
    }

    public final void b(int i9) {
        this.f17861w = i9;
    }

    public final void c() {
        if (this.f17846f != null) {
            this.f17846f = null;
        }
        if (this.f17856r != null) {
            this.f17856r = null;
        }
        if (this.f17857s != null) {
            this.f17857s = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        if (r5 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c3, code lost:
    
        if (r9.exists() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
    
        if (r9.isFile() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        if (r9.canRead() == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
    
        r11.setAdHtml(r9.getAbsolutePath());
        a("file:////" + r9.getAbsolutePath(), r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        a(new com.mbridge.msdk.foundation.c.b(880013), r10.f17852n, r12, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
    
        if (r5 != null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void e(com.mbridge.msdk.foundation.entity.CampaignEx r11, int r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.c.e.e(com.mbridge.msdk.foundation.entity.CampaignEx, int):void");
    }

    public final String b() {
        return com.mbridge.msdk.foundation.same.c.a(this.f17862x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx, int i9) {
        if (!d.a(this.f17848h, campaignEx) || this.f17855q) {
            return;
        }
        e();
        if (this.f17854p) {
            d.a(campaignEx, this.b);
        }
        this.f17855q = true;
        com.mbridge.msdk.splash.d.b bVar = this.f17846f;
        if (bVar != null) {
            bVar.a(campaignEx, i9);
        }
    }

    public final void a(k kVar) {
        this.f17849i = kVar;
    }

    private void c(CampaignEx campaignEx, int i9) {
        this.f17848h.clearResState();
        if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            f(campaignEx, i9);
        }
        if (campaignEx.isDynamicView()) {
            return;
        }
        if (!TextUtils.isEmpty(campaignEx.getAdHtml())) {
            e(campaignEx, i9);
        }
        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            g(campaignEx, i9);
        }
        if (TextUtils.isEmpty(campaignEx.getImageUrl())) {
            return;
        }
        d(campaignEx, i9);
    }

    public final void a(MBSplashView mBSplashView) {
        this.f17848h = mBSplashView;
    }

    public final void a(boolean z8) {
        this.f17850j = z8;
    }

    public final void a(int i9) {
        this.f17851k = i9;
    }

    public static /* synthetic */ void b(e eVar, final CampaignEx campaignEx, final int i9) {
        if (campaignEx.isDynamicView()) {
            d.a aVar = new d.a();
            aVar.b(eVar.b).a(eVar.f17843c).a(eVar.f17850j).a(campaignEx).a(eVar.f17851k).h(eVar.f17861w);
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
            } catch (Throwable th) {
                ad.b(f17841a, th.getMessage());
            }
            c.a.a().a(eVar.f17848h, new com.mbridge.msdk.splash.a.d(aVar), new com.mbridge.msdk.splash.b.a() { // from class: com.mbridge.msdk.splash.c.e.11
                @Override // com.mbridge.msdk.splash.b.a
                public final void a(View view) {
                    if (e.this.f17848h != null) {
                        e.this.f17848h.setDynamicView(true);
                        e.this.f17848h.setSplashNativeView(view);
                        e.this.b(campaignEx, i9);
                    }
                }

                @Override // com.mbridge.msdk.splash.b.a
                public final void a(String str) {
                    com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880034);
                    bVar.a(str);
                    e eVar2 = e.this;
                    eVar2.a(bVar, eVar2.f17852n, i9, campaignEx);
                }
            });
        }
    }

    public final void a(int i9, int i10) {
        this.m = i9;
        this.l = i10;
    }

    public final String a() {
        return this.f17860v;
    }

    public final void a(String str, int i9) {
        this.f17855q = false;
        this.f17852n = str;
        this.f17853o = i9;
        CampaignEx a6 = d.a(this.f17848h, this.f17843c, this.b, str, this.f17850j, this.f17851k, false, false);
        long timestamp = a6 != null ? a6.getTimestamp() : 0L;
        if (this.f17849i.m() == 1 && i9 != 1 && a6 != null) {
            a(a6, i9);
            return;
        }
        this.f17854p = true;
        if (i9 == 1) {
            List<Integer> c9 = this.f17849i.c();
            if (c9 != null && c9.size() > 0) {
                this.f17844d = c9.get(0).intValue() * 1000;
            } else {
                this.f17844d = 30000L;
            }
        } else {
            long j7 = this.f17845e;
            if (j7 <= 0) {
                this.f17844d = this.f17849i.r();
            } else {
                this.f17844d = j7;
            }
        }
        if (this.f17849i == null || timestamp <= 0 || !TextUtils.isEmpty(str)) {
            a(this.f17844d);
            a(this.f17847g, str, i9);
            return;
        }
        if (System.currentTimeMillis() - timestamp > this.f17849i.o() * 1000) {
            a(this.f17844d);
            a(this.f17847g, str, i9);
        } else {
            a(a6, i9);
        }
    }

    public static /* synthetic */ void c(e eVar, CampaignEx campaignEx, int i9) {
        if (eVar.f17848h.isH5Ready()) {
            return;
        }
        eVar.f17848h.setH5Ready(true);
        eVar.b(campaignEx, i9);
    }

    private void a(long j7) {
        this.f17864z.postDelayed(this.f17842A, j7);
    }

    private void a(Context context, final String str, final int i9) {
        try {
            if (context == null) {
                a(new com.mbridge.msdk.foundation.c.b(880025), str, i9, (CampaignEx) null);
                return;
            }
            if (an.a(this.b)) {
                a(new com.mbridge.msdk.foundation.c.b(880032), str, i9, (CampaignEx) null);
                return;
            }
            MBridgeIds mBridgeIds = new MBridgeIds(this.f17843c, this.b);
            com.mbridge.msdk.splash.f.f fVar = new com.mbridge.msdk.splash.f.f();
            fVar.a(i9);
            fVar.b(this.f17859u);
            fVar.a(this.f17858t);
            fVar.c(this.m);
            fVar.d(this.l);
            com.mbridge.msdk.foundation.same.net.f.e a6 = com.mbridge.msdk.splash.f.e.a(context, mBridgeIds, fVar);
            if (a6 == null) {
                a(new com.mbridge.msdk.foundation.c.b(880001), str, i9, (CampaignEx) null);
                return;
            }
            if (!TextUtils.isEmpty(str)) {
                a6.a(BidResponsed.KEY_TOKEN, str);
            }
            String d2 = ai.d(this.b);
            if (!TextUtils.isEmpty(d2)) {
                a6.a("j", d2);
            }
            com.mbridge.msdk.splash.f.c cVar = new com.mbridge.msdk.splash.f.c(context);
            com.mbridge.msdk.splash.f.b bVar = new com.mbridge.msdk.splash.f.b(i9) { // from class: com.mbridge.msdk.splash.c.e.5
                @Override // com.mbridge.msdk.splash.f.b
                public final void a(CampaignUnit campaignUnit, int i10) {
                    try {
                        e eVar = e.this;
                        e.a(eVar, campaignUnit, i10, eVar.b, str);
                        e.this.f17860v = campaignUnit.getRequestId();
                        e.this.f17862x = campaignUnit.getAds();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                        com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880003);
                        bVar2.a((Throwable) e4);
                        e.this.a(bVar2, str, i10, (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() == 0) ? null : campaignUnit.getAds().get(0));
                        e.this.f17859u = 0;
                    }
                }

                @Override // com.mbridge.msdk.splash.f.b
                public final void a(int i10, String str2) {
                    ad.b(e.f17841a, str2);
                    com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880002);
                    bVar2.a(str2);
                    e.this.a(bVar2, str, i9, (CampaignEx) null);
                    e.this.f17859u = 0;
                }
            };
            bVar.a(str);
            bVar.setUnitId(this.b);
            bVar.setPlacementId(this.f17843c);
            bVar.setAdType(297);
            cVar.choiceV3OrV5BySetting(1, a6, bVar, str, com.mbridge.msdk.foundation.same.c.a(this.f17844d, 30000L));
        } catch (Exception e4) {
            ad.b(f17841a, e4.getMessage());
            com.mbridge.msdk.foundation.c.b bVar2 = new com.mbridge.msdk.foundation.c.b(880020);
            bVar2.a((Throwable) e4);
            a(bVar2, str, i9, (CampaignEx) null);
            this.f17859u = 0;
        }
    }

    public final void a(com.mbridge.msdk.splash.d.b bVar) {
        this.f17846f = bVar;
    }

    private void a(CampaignEx campaignEx, int i9) {
        MBSplashView mBSplashView = this.f17848h;
        if (mBSplashView != null) {
            mBSplashView.setDynamicView(false);
        }
        if (campaignEx.isDynamicView()) {
            d(campaignEx, i9);
        } else {
            MBSplashView mBSplashView2 = this.f17848h;
            if (mBSplashView2 != null) {
                mBSplashView2.setSplashWebView();
            }
        }
        if (d.a(this.f17848h, campaignEx)) {
            b(campaignEx, i9);
        } else {
            c(campaignEx, i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.c.b bVar, String str, int i9, CampaignEx campaignEx) {
        if (this.f17854p) {
            this.f17854p = false;
            a(bVar, i9, str, campaignEx);
        } else {
            a(bVar, i9, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.c.b bVar, int i9, String str, CampaignEx campaignEx) {
        CampaignEx a6 = d.a(this.f17848h, this.f17843c, this.b, str, this.f17850j, this.f17851k, true, false);
        if (a6 != null) {
            a(a6, i9);
        } else {
            a(bVar, i9, campaignEx);
        }
    }

    private void a(com.mbridge.msdk.foundation.c.b bVar, int i9, CampaignEx campaignEx) {
        if (this.f17855q) {
            return;
        }
        e();
        this.f17855q = true;
        if (bVar != null) {
            bVar.a(campaignEx);
        }
        com.mbridge.msdk.splash.d.b bVar2 = this.f17846f;
        if (bVar2 != null) {
            bVar2.a(bVar, i9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, final CampaignEx campaignEx, final int i9) {
        g.c cVar = new g.c();
        cVar.c(this.b);
        cVar.b(this.f17843c);
        cVar.a(campaignEx);
        cVar.a(str);
        cVar.a(this.f17850j);
        cVar.a(this.f17851k);
        g.a.a().a(this.f17848h, cVar, new g.b() { // from class: com.mbridge.msdk.splash.c.e.2
            @Override // com.mbridge.msdk.splash.c.g.b
            public final void a() {
                if (campaignEx.isHasMBTplMark()) {
                    return;
                }
                e.c(e.this, campaignEx, i9);
            }

            @Override // com.mbridge.msdk.splash.c.g.b
            public final void a(String str2) {
                e.a(e.this, str2, i9, campaignEx);
            }

            @Override // com.mbridge.msdk.splash.c.g.b
            public final void a(int i10) {
                if (i10 == 1) {
                    e.c(e.this, campaignEx, i9);
                } else {
                    e.a(e.this, "readyState 2", i9, campaignEx);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.mbridge.msdk.foundation.same.report.d.a.a] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.mbridge.msdk.foundation.entity.CampaignEx] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static /* synthetic */ void a(e eVar, CampaignUnit campaignUnit, int i9, String str, String str2) {
        ArrayList arrayList;
        com.mbridge.msdk.foundation.c.b bVar;
        CampaignEx campaignEx;
        int i10;
        k kVar;
        final CampaignEx campaignEx2 = 0;
        campaignEx2 = 0;
        campaignEx2 = 0;
        if (campaignUnit == null || campaignUnit.getAds() == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            final CampaignEx campaignEx3 = campaignUnit.getAds().get(0);
            campaignEx3.setCampaignUnitId(eVar.b);
            new Thread(new Runnable() { // from class: com.mbridge.msdk.splash.c.e.7
                @Override // java.lang.Runnable
                public final void run() {
                    j.a(com.mbridge.msdk.foundation.db.g.a(e.this.f17847g)).a();
                    m.a(e.this.f17847g, campaignEx3);
                }
            }).start();
            eVar.f17858t = campaignUnit.getSessionId();
            if (campaignEx3.getOfferType() != 99 && (!TextUtils.isEmpty(campaignEx3.getAdZip()) || !TextUtils.isEmpty(campaignEx3.getAdHtml()))) {
                if (ai.c(campaignEx3)) {
                    campaignEx3.setRtinsType(ai.c(eVar.f17847g, campaignEx3.getPackageName()) ? 1 : 2);
                }
                if (com.mbridge.msdk.foundation.same.c.a(eVar.f17847g, campaignEx3)) {
                    arrayList.add(campaignEx3);
                } else {
                    ai.a(eVar.b, campaignEx3, com.mbridge.msdk.foundation.same.a.f15696x);
                    eVar.f17863y = "APP ALREADY INSTALLED";
                }
                try {
                    com.mbridge.msdk.foundation.same.c.a(campaignEx3, eVar.f17847g, null, new c.a() { // from class: com.mbridge.msdk.splash.c.e.6
                        @Override // com.mbridge.msdk.foundation.same.c.a
                        public final void a(String str3, com.mbridge.msdk.foundation.same.report.d.b bVar2) {
                            try {
                                com.mbridge.msdk.foundation.same.report.d.c.a().a(str3, bVar2, campaignEx3, e.this.f17847g, campaignEx2);
                            } catch (Exception e4) {
                                if (MBridgeConstans.DEBUG) {
                                    e4.printStackTrace();
                                }
                            }
                        }
                    });
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        e4.printStackTrace();
                    }
                }
            }
        }
        if (arrayList != null && arrayList.size() > 0) {
            try {
                i10 = eVar.f17859u + 1;
                eVar.f17859u = i10;
                kVar = eVar.f17849i;
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            if (kVar != null) {
                if (i10 > kVar.w()) {
                }
                campaignEx = (CampaignEx) arrayList.get(0);
                if (!TextUtils.isEmpty(campaignEx.getAdZip()) && (TextUtils.isEmpty(campaignEx.getAdHtml()) || !campaignEx.getAdHtml().contains("<MBTPLMARK>"))) {
                    campaignEx.setHasMBTplMark(false);
                    campaignEx.setIsMraid(true);
                } else {
                    campaignEx.setHasMBTplMark(true);
                    campaignEx.setIsMraid(false);
                }
                eVar.a(campaignEx, i9);
                return;
            }
            eVar.f17859u = 0;
            campaignEx = (CampaignEx) arrayList.get(0);
            if (!TextUtils.isEmpty(campaignEx.getAdZip())) {
            }
            campaignEx.setHasMBTplMark(true);
            campaignEx.setIsMraid(false);
            eVar.a(campaignEx, i9);
            return;
        }
        if (eVar.f17863y.contains("INSTALLED")) {
            bVar = new com.mbridge.msdk.foundation.c.b(880021, "APP ALREADY INSTALLED");
        } else {
            bVar = new com.mbridge.msdk.foundation.c.b(880003);
        }
        if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() != 0) {
            campaignEx2 = campaignUnit.getAds().get(0);
        }
        eVar.a(bVar, str2, i9, campaignEx2);
    }

    public static /* synthetic */ void a(e eVar, CampaignEx campaignEx, String str, boolean z8, String str2) {
        try {
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            nVar.e(2);
            nVar.a("m_download_end");
            if (campaignEx != null) {
                nVar.d(campaignEx.isMraid() ? com.mbridge.msdk.foundation.entity.n.f15616a : com.mbridge.msdk.foundation.entity.n.b);
                nVar.g(campaignEx.getRequestIdNotice());
            }
            nVar.a("url", str);
            nVar.a("scenes", "1");
            if (z8) {
                nVar.b(1);
            } else {
                nVar.b(3);
                nVar.h(str2);
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, campaignEx);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.b(f17841a, e4.getMessage());
            }
        }
    }

    public static /* synthetic */ void a(e eVar, String str, int i9, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(880009);
        bVar.a(str);
        eVar.a(bVar, eVar.f17852n, i9, campaignEx);
    }
}

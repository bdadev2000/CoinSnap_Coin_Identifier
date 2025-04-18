package com.mbridge.msdk.reward.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.o;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.n;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.videocommon.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b */
    private static ConcurrentHashMap<String, a> f14743b;
    private final h a;

    /* renamed from: c */
    private boolean f14744c;

    /* renamed from: d */
    private final String f14745d;

    /* renamed from: e */
    private final String f14746e;

    /* renamed from: f */
    private final String f14747f;

    /* renamed from: g */
    private volatile List<WindVaneWebView> f14748g;

    /* renamed from: com.mbridge.msdk.reward.adapter.b$1 */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ CopyOnWriteArrayList a;

        /* renamed from: b */
        final /* synthetic */ Context f14749b;

        /* renamed from: c */
        final /* synthetic */ String f14750c;

        /* renamed from: d */
        final /* synthetic */ int f14751d;

        /* renamed from: e */
        final /* synthetic */ String f14752e;

        /* renamed from: f */
        final /* synthetic */ String f14753f;

        /* renamed from: g */
        final /* synthetic */ i f14754g;

        public AnonymousClass1(CopyOnWriteArrayList copyOnWriteArrayList, Context context, String str, int i10, String str2, String str3, i iVar) {
            r2 = copyOnWriteArrayList;
            r3 = context;
            r4 = str;
            r5 = i10;
            r6 = str2;
            r7 = str3;
            r8 = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:130:0x0290 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:137:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:175:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01cd  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x023a  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x02bc  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0374  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 978
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass1.run():void");
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$3 */
    /* loaded from: classes4.dex */
    public class AnonymousClass3 implements H5DownLoadManager.ZipDownloadListener {
        final /* synthetic */ String a;

        /* renamed from: b */
        final /* synthetic */ String f14758b;

        /* renamed from: c */
        final /* synthetic */ String f14759c;

        /* renamed from: d */
        final /* synthetic */ i f14760d;

        /* renamed from: e */
        final /* synthetic */ Context f14761e;

        /* renamed from: f */
        final /* synthetic */ CampaignEx f14762f;

        public AnonymousClass3(String str, String str2, String str3, i iVar, Context context, CampaignEx campaignEx) {
            r2 = str;
            r3 = str2;
            r4 = str3;
            r5 = iVar;
            r6 = context;
            r7 = campaignEx;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onFailed(java.lang.String r19, java.lang.String r20) {
            /*
                Method dump skipped, instructions count: 262
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass3.onFailed(java.lang.String, java.lang.String):void");
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z10) {
            try {
                ad.a("RewardCampaignsResourceManager", "zip btl template download success");
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
                Message obtain = Message.obtain();
                obtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, r2);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, r3);
                bundle.putString("request_id", r4);
                bundle.putString("url", str);
                obtain.setData(bundle);
                b.this.a.sendMessage(obtain);
                i iVar = r5;
                if (iVar != null) {
                    iVar.a(r3, r2, r4, str);
                }
                if (!z10) {
                    b.a(b.this, r6, 1, r7, str, "", r2, str2);
                }
            } catch (Exception e2) {
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
                Message obtain2 = Message.obtain();
                obtain2.what = 205;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, r2);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, r3);
                bundle2.putString("request_id", r4);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                b.this.a.sendMessage(obtain2);
                if (r5 != null) {
                    try {
                        r5.a(str, r4, b.b(880005, new MBridgeIds(r3, r2, r4), "", e2, null));
                    } catch (Exception e10) {
                        ad.b("RewardCampaignsResourceManager", e10.getMessage());
                    }
                }
                b.a(b.this, r6, 3, r7, str, e2.getLocalizedMessage(), r2, str2);
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$4 */
    /* loaded from: classes4.dex */
    public class AnonymousClass4 implements Runnable {
        final /* synthetic */ CampaignEx a;

        /* renamed from: b */
        final /* synthetic */ Context f14764b;

        /* renamed from: c */
        final /* synthetic */ int f14765c;

        /* renamed from: d */
        final /* synthetic */ String f14766d;

        /* renamed from: e */
        final /* synthetic */ String f14767e;

        /* renamed from: f */
        final /* synthetic */ String f14768f;

        /* renamed from: g */
        final /* synthetic */ String f14769g;

        public AnonymousClass4(CampaignEx campaignEx, Context context, int i10, String str, String str2, String str3, String str4) {
            r2 = campaignEx;
            r3 = context;
            r4 = i10;
            r5 = str;
            r6 = str2;
            r7 = str3;
            r8 = str4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (r2 != null && r3 != null) {
                try {
                    n nVar = new n();
                    nVar.a("m_download_end");
                    Context context = r3;
                    if (context != null) {
                        nVar.a(z.l(context.getApplicationContext()));
                    }
                    nVar.b(r4);
                    CampaignEx campaignEx = r2;
                    if (campaignEx != null) {
                        nVar.e(campaignEx.getId());
                        nVar.f(r2.getRequestId());
                        nVar.s(r2.getCurrentLocalRid());
                        nVar.g(r2.getRequestIdNotice());
                    }
                    nVar.a("url", r5);
                    nVar.q(r5);
                    nVar.h(r6);
                    nVar.c(r7);
                    if (!TextUtils.isEmpty(r8)) {
                        nVar.t(r8);
                    }
                    nVar.e(1);
                    nVar.a("scenes", "1");
                    com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, r2);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$5 */
    /* loaded from: classes4.dex */
    public class AnonymousClass5 implements Runnable {
        final /* synthetic */ boolean a;

        /* renamed from: b */
        final /* synthetic */ WindVaneWebView f14771b;

        /* renamed from: c */
        final /* synthetic */ CampaignEx f14772c;

        /* renamed from: d */
        final /* synthetic */ CopyOnWriteArrayList f14773d;

        /* renamed from: e */
        final /* synthetic */ String f14774e;

        /* renamed from: f */
        final /* synthetic */ com.mbridge.msdk.videocommon.d.c f14775f;

        /* renamed from: g */
        final /* synthetic */ String f14776g;

        public AnonymousClass5(boolean z10, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, com.mbridge.msdk.videocommon.d.c cVar, String str2) {
            r2 = z10;
            r3 = windVaneWebView;
            r4 = campaignEx;
            r5 = copyOnWriteArrayList;
            r6 = str;
            r7 = cVar;
            r8 = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.mbridge.msdk.video.signal.a.k kVar;
            boolean z10 = r2;
            WindVaneWebView windVaneWebView = r3;
            String e2 = r4.getRewardTemplateMode().e();
            CampaignEx campaignEx = r4;
            CopyOnWriteArrayList copyOnWriteArrayList = r5;
            String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(r4.getRewardTemplateMode().e());
            String str = r6;
            com.mbridge.msdk.videocommon.d.c cVar = r7;
            String str2 = r8;
            boolean z11 = b.this.f14744c;
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 2);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000154", campaignEx, dVar);
                a.C0214a c0214a = new a.C0214a();
                WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.m().c());
                if (campaignEx != null) {
                    windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
                }
                windVaneWebView2.setTempTypeForMetrics(2);
                c0214a.a(windVaneWebView2);
                String str3 = "";
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    CopyOnWriteArrayList<CampaignEx> a = com.mbridge.msdk.videocommon.download.b.getInstance().a(str);
                    if (a != null && a.size() > 0) {
                        for (int i10 = 0; i10 < copyOnWriteArrayList.size(); i10++) {
                            CampaignEx campaignEx2 = (CampaignEx) copyOnWriteArrayList.get(i10);
                            for (CampaignEx campaignEx3 : a) {
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = a;
                                if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                    campaignEx2.setReady(true);
                                    copyOnWriteArrayList.set(i10, campaignEx2);
                                }
                                a = copyOnWriteArrayList2;
                            }
                        }
                    }
                    kVar = new com.mbridge.msdk.video.signal.a.k(null, campaignEx, copyOnWriteArrayList);
                    str3 = ((CampaignEx) copyOnWriteArrayList.get(0)).getRequestId();
                } else {
                    kVar = new com.mbridge.msdk.video.signal.a.k(null, campaignEx);
                    if (campaignEx != null) {
                        str3 = campaignEx.getRequestId();
                    }
                }
                String str4 = str3;
                kVar.a(0);
                kVar.a(str);
                kVar.c(str2);
                kVar.a(cVar);
                kVar.d(z10);
                windVaneWebView2.setWebViewListener(new l(str2, false, windVaneWebView, e2, str, c0214a, campaignEx, z11, str4));
                windVaneWebView2.setObject(kVar);
                windVaneWebView2.loadUrl(h5ResAddress);
                windVaneWebView2.setRid(str4);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class a {
        boolean a;

        /* renamed from: b */
        boolean f14778b;

        /* renamed from: c */
        int f14779c;

        /* renamed from: d */
        int f14780d;

        /* renamed from: e */
        String f14781e;

        /* renamed from: f */
        String f14782f;

        /* renamed from: g */
        int f14783g;

        /* renamed from: h */
        CopyOnWriteArrayList<CampaignEx> f14784h;

        /* renamed from: i */
        CopyOnWriteArrayList<CampaignEx> f14785i;

        public a(boolean z10, boolean z11, int i10, int i11, String str, String str2, int i12, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.a = z10;
            this.f14778b = z11;
            this.f14779c = i10;
            this.f14780d = i11;
            this.f14781e = str;
            this.f14782f = str2;
            this.f14783g = i12;
            this.f14784h = copyOnWriteArrayList;
            this.f14785i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList);

        void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.c.b bVar);
    }

    /* loaded from: classes4.dex */
    public static final class d implements H5DownLoadManager.IH5SourceDownloadListener {

        /* renamed from: b */
        private int f14805b;

        /* renamed from: c */
        private final String f14806c;

        /* renamed from: d */
        private final String f14807d;

        /* renamed from: e */
        private final String f14808e;

        /* renamed from: f */
        private CampaignEx f14809f;

        /* renamed from: g */
        private i f14810g;

        /* renamed from: h */
        private Handler f14811h;

        /* renamed from: i */
        private CopyOnWriteArrayList<CampaignEx> f14812i;
        private boolean a = false;

        /* renamed from: j */
        private final long f14813j = System.currentTimeMillis();

        /* renamed from: com.mbridge.msdk.reward.adapter.b$d$1 */
        /* loaded from: classes4.dex */
        public class AnonymousClass1 implements Runnable {
            final /* synthetic */ int a;

            /* renamed from: b */
            final /* synthetic */ long f14814b;

            /* renamed from: c */
            final /* synthetic */ String f14815c;

            /* renamed from: d */
            final /* synthetic */ String f14816d;

            /* renamed from: e */
            final /* synthetic */ String f14817e;

            public AnonymousClass1(int i10, long j3, String str, String str2, String str3) {
                r2 = i10;
                r3 = j3;
                r5 = str;
                r6 = str2;
                r7 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (d.this.f14809f == null) {
                    return;
                }
                try {
                    n nVar = new n("m_download_end", r2, r3 + "", r5, d.this.f14809f.getId(), d.this.f14807d, r6, MBridgeConstans.API_REUQEST_CATEGORY_APP);
                    nVar.f(d.this.f14809f.getRequestId());
                    nVar.s(d.this.f14809f.getCurrentLocalRid());
                    nVar.g(d.this.f14809f.getRequestIdNotice());
                    nVar.e(d.this.f14809f.getId());
                    nVar.c(d.this.f14809f.getAdSpaceT());
                    nVar.a("scenes", "1");
                    nVar.a("url", r5);
                    if (d.this.f14809f.getAdType() == 287) {
                        nVar.d("3");
                    } else if (d.this.f14809f.getAdType() == 94) {
                        nVar.d("1");
                    }
                    if (!TextUtils.isEmpty(r7)) {
                        nVar.t(r7);
                    }
                    b.a(nVar, d.this.f14809f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, d.this.f14807d, d.this.f14809f);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    }
                }
            }
        }

        public d(int i10, String str, String str2, String str3, CampaignEx campaignEx, i iVar, Handler handler, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f14805b = i10;
            this.f14806c = str;
            this.f14807d = str2;
            this.f14808e = str3;
            this.f14809f = campaignEx;
            this.f14810g = iVar;
            this.f14811h = handler;
            this.f14812i = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            int i10 = this.f14805b;
            if (i10 != 313) {
                if (i10 != 497) {
                    if (i10 == 859) {
                        Message obtain = Message.obtain();
                        obtain.what = 205;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f14807d);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f14806c);
                        bundle.putString("request_id", this.f14808e);
                        bundle.putString(PglCryptUtils.KEY_MESSAGE, str2);
                        obtain.setData(bundle);
                        this.f14811h.sendMessage(obtain);
                        if (this.f14810g != null) {
                            try {
                                this.f14810g.a(str, this.f14808e, b.b(880006, new MBridgeIds(this.f14806c, this.f14807d, this.f14808e), str2, null, null));
                                return;
                            } catch (Exception e2) {
                                ad.b("RewardCampaignsResourceManager", e2.getMessage());
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                Message obtain2 = Message.obtain();
                obtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f14807d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f14806c);
                bundle2.putString("request_id", this.f14808e);
                bundle2.putString("url", str);
                bundle2.putString(PglCryptUtils.KEY_MESSAGE, str2);
                obtain2.setData(bundle2);
                this.f14811h.sendMessage(obtain2);
                if (this.a) {
                    a(3, System.currentTimeMillis() - this.f14813j, str, "url download failed", "");
                    return;
                }
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 201;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f14807d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f14806c);
            bundle3.putString("request_id", this.f14808e);
            bundle3.putString("url", str);
            bundle3.putString(PglCryptUtils.KEY_MESSAGE, str2);
            obtain3.setData(bundle3);
            this.f14811h.sendMessage(obtain3);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z10) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            int i10 = this.f14805b;
            if (i10 != 313) {
                if (i10 != 497) {
                    if (i10 == 859) {
                        Message obtain = Message.obtain();
                        obtain.what = 105;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f14807d);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f14806c);
                        bundle.putString("request_id", this.f14808e);
                        obtain.setData(bundle);
                        this.f14811h.sendMessage(obtain);
                        i iVar = this.f14810g;
                        if (iVar != null) {
                            iVar.a(this.f14806c, this.f14807d, this.f14808e, str);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f14807d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f14806c);
                bundle2.putString("request_id", this.f14808e);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f14811h.sendMessage(obtain2);
                if (this.a) {
                    a(1, System.currentTimeMillis() - this.f14813j, str, "", str2);
                    return;
                }
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 101;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f14807d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f14806c);
            bundle3.putString("request_id", this.f14808e);
            bundle3.putString("url", str);
            obtain3.setData(bundle3);
            this.f14811h.sendMessage(obtain3);
        }

        public final void a(boolean z10) {
            this.a = z10;
        }

        private void a(int i10, long j3, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.d.1
                final /* synthetic */ int a;

                /* renamed from: b */
                final /* synthetic */ long f14814b;

                /* renamed from: c */
                final /* synthetic */ String f14815c;

                /* renamed from: d */
                final /* synthetic */ String f14816d;

                /* renamed from: e */
                final /* synthetic */ String f14817e;

                public AnonymousClass1(int i102, long j32, String str4, String str22, String str32) {
                    r2 = i102;
                    r3 = j32;
                    r5 = str4;
                    r6 = str22;
                    r7 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (d.this.f14809f == null) {
                        return;
                    }
                    try {
                        n nVar = new n("m_download_end", r2, r3 + "", r5, d.this.f14809f.getId(), d.this.f14807d, r6, MBridgeConstans.API_REUQEST_CATEGORY_APP);
                        nVar.f(d.this.f14809f.getRequestId());
                        nVar.s(d.this.f14809f.getCurrentLocalRid());
                        nVar.g(d.this.f14809f.getRequestIdNotice());
                        nVar.e(d.this.f14809f.getId());
                        nVar.c(d.this.f14809f.getAdSpaceT());
                        nVar.a("scenes", "1");
                        nVar.a("url", r5);
                        if (d.this.f14809f.getAdType() == 287) {
                            nVar.d("3");
                        } else if (d.this.f14809f.getAdType() == 94) {
                            nVar.d("1");
                        }
                        if (!TextUtils.isEmpty(r7)) {
                            nVar.t(r7);
                        }
                        b.a(nVar, d.this.f14809f);
                        com.mbridge.msdk.foundation.same.report.g.a(nVar, d.this.f14807d, d.this.f14809f);
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                        }
                    }
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements com.mbridge.msdk.foundation.same.c.c {
        private Handler a;

        /* renamed from: b */
        private int f14819b;

        /* renamed from: c */
        private String f14820c;

        /* renamed from: d */
        private String f14821d;

        /* renamed from: e */
        private String f14822e;

        /* renamed from: f */
        private CampaignEx f14823f;

        /* renamed from: com.mbridge.msdk.reward.adapter.b$e$1 */
        /* loaded from: classes4.dex */
        public class AnonymousClass1 implements Runnable {
            final /* synthetic */ String a;

            public AnonymousClass1(String str) {
                r2 = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (e.this.f14823f != null) {
                    try {
                        o a = o.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                        ad.a("RewardCampaignsResourceManager", "campaign is null");
                        n nVar = new n();
                        nVar.a("2000044");
                        nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
                        nVar.e(e.this.f14823f.getId());
                        nVar.p(e.this.f14823f.getImageUrl());
                        nVar.f(e.this.f14823f.getRequestId());
                        nVar.s(e.this.f14823f.getCurrentLocalRid());
                        nVar.g(e.this.f14823f.getRequestIdNotice());
                        nVar.c(e.this.f14820c);
                        nVar.h(r2);
                        nVar.a("scenes", "1");
                        a.a(nVar);
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        public e(Handler handler, int i10, String str, String str2, String str3, CampaignEx campaignEx) {
            this.a = handler;
            this.f14819b = i10;
            this.f14821d = str;
            this.f14820c = str2;
            this.f14822e = str3;
            this.f14823f = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
            int i10;
            Message obtain = Message.obtain();
            if (this.f14819b == 0) {
                i10 = 202;
            } else {
                i10 = 204;
            }
            obtain.what = i10;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f14820c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f14821d);
            bundle.putString("request_id", this.f14822e);
            obtain.setData(bundle);
            this.a.sendMessage(obtain);
            AnonymousClass1 anonymousClass1 = new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.e.1
                final /* synthetic */ String a;

                public AnonymousClass1(String str3) {
                    r2 = str3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (e.this.f14823f != null) {
                        try {
                            o a = o.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                            ad.a("RewardCampaignsResourceManager", "campaign is null");
                            n nVar = new n();
                            nVar.a("2000044");
                            nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
                            nVar.e(e.this.f14823f.getId());
                            nVar.p(e.this.f14823f.getImageUrl());
                            nVar.f(e.this.f14823f.getRequestId());
                            nVar.s(e.this.f14823f.getCurrentLocalRid());
                            nVar.g(e.this.f14823f.getRequestIdNotice());
                            nVar.c(e.this.f14820c);
                            nVar.h(r2);
                            nVar.a("scenes", "1");
                            a.a(nVar);
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                            }
                        }
                    }
                }
            };
            com.mbridge.msdk.foundation.controller.d.a();
            com.mbridge.msdk.foundation.same.f.b.b().execute(anonymousClass1);
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onSuccessLoad(Bitmap bitmap, String str) {
            int i10;
            ResDownloadCheckManager.getInstance().setImageDownloadDone(str, true);
            Message obtain = Message.obtain();
            if (this.f14819b == 0) {
                i10 = 102;
            } else {
                i10 = 104;
            }
            obtain.what = i10;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f14820c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f14821d);
            bundle.putString("request_id", this.f14822e);
            obtain.setData(bundle);
            this.a.sendMessage(obtain);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: b */
        private Context f14828b;

        /* renamed from: c */
        private String f14829c;

        /* renamed from: d */
        private String f14830d;

        /* renamed from: e */
        private String f14831e;

        /* renamed from: f */
        private CampaignEx f14832f;

        /* renamed from: g */
        private int f14833g;

        /* renamed from: h */
        private Handler f14834h;

        /* renamed from: i */
        private i f14835i;

        /* renamed from: j */
        private CopyOnWriteArrayList<CampaignEx> f14836j;
        private boolean a = false;

        /* renamed from: k */
        private long f14837k = System.currentTimeMillis();

        /* renamed from: com.mbridge.msdk.reward.adapter.b$g$1 */
        /* loaded from: classes4.dex */
        public class AnonymousClass1 implements Runnable {
            final /* synthetic */ int a;

            /* renamed from: b */
            final /* synthetic */ String f14838b;

            /* renamed from: c */
            final /* synthetic */ String f14839c;

            /* renamed from: d */
            final /* synthetic */ String f14840d;

            public AnonymousClass1(int i10, String str, String str2, String str3) {
                r2 = i10;
                r3 = str;
                r4 = str2;
                r5 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (g.this.f14832f != null && g.this.f14828b != null) {
                    try {
                        n nVar = new n();
                        nVar.a("m_download_end");
                        if (g.this.f14828b != null) {
                            nVar.a(z.l(g.this.f14828b.getApplicationContext()));
                        }
                        nVar.b(r2);
                        if (g.this.f14832f != null) {
                            nVar.e(g.this.f14832f.getId());
                            nVar.f(g.this.f14832f.getRequestId());
                            nVar.s(g.this.f14832f.getCurrentLocalRid());
                            nVar.g(g.this.f14832f.getRequestIdNotice());
                        }
                        nVar.q(r3);
                        nVar.h(r4);
                        nVar.c(g.this.f14829c);
                        if (!TextUtils.isEmpty(r5)) {
                            nVar.t(r5);
                        }
                        nVar.e(2);
                        nVar.a("scenes", "1");
                        nVar.a("url", r3);
                        b.a(nVar, g.this.f14832f);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, g.this.f14832f);
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        /* renamed from: com.mbridge.msdk.reward.adapter.b$g$2 */
        /* loaded from: classes4.dex */
        public class AnonymousClass2 implements Runnable {
            final /* synthetic */ int a;

            /* renamed from: b */
            final /* synthetic */ long f14842b;

            /* renamed from: c */
            final /* synthetic */ String f14843c;

            /* renamed from: d */
            final /* synthetic */ String f14844d;

            /* renamed from: e */
            final /* synthetic */ String f14845e;

            public AnonymousClass2(int i10, long j3, String str, String str2, String str3) {
                r2 = i10;
                r3 = j3;
                r5 = str;
                r6 = str2;
                r7 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (g.this.f14832f == null) {
                    return;
                }
                try {
                    n nVar = new n("m_download_end", r2, r3 + "", r5, g.this.f14832f.getId(), g.this.f14829c, r6, "1");
                    nVar.f(g.this.f14832f.getRequestId());
                    nVar.s(g.this.f14832f.getCurrentLocalRid());
                    nVar.g(g.this.f14832f.getRequestIdNotice());
                    nVar.e(g.this.f14832f.getId());
                    nVar.c(g.this.f14832f.getAdSpaceT());
                    nVar.t(r7);
                    nVar.a("scenes", "1");
                    if (g.this.f14832f.getAdType() == 287) {
                        nVar.d("3");
                    } else if (g.this.f14832f.getAdType() == 94) {
                        nVar.d("1");
                    }
                    nVar.a("url", r5);
                    nVar.e(3);
                    b.a(nVar, g.this.f14832f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, g.this.f14829c, g.this.f14832f);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    }
                }
            }
        }

        public g(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i10, Handler handler, i iVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f14828b = context;
            this.f14830d = str;
            this.f14829c = str2;
            this.f14831e = str3;
            this.f14832f = campaignEx;
            this.f14833g = i10;
            this.f14834h = handler;
            this.f14835i = iVar;
            this.f14836j = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
            long currentTimeMillis = System.currentTimeMillis() - this.f14837k;
            int i10 = this.f14833g;
            if (i10 != 313) {
                if (i10 != 497) {
                    if (i10 == 859) {
                        Message obtain = Message.obtain();
                        obtain.what = 203;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f14829c);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f14830d);
                        bundle.putString("request_id", this.f14831e);
                        bundle.putString("url", str2);
                        bundle.putString(PglCryptUtils.KEY_MESSAGE, str);
                        obtain.setData(bundle);
                        this.f14834h.sendMessage(obtain);
                        if (this.f14835i != null) {
                            try {
                                this.f14835i.a(str2, this.f14831e, b.b(880006, new MBridgeIds(this.f14830d, this.f14829c, this.f14831e), "", null, null));
                            } catch (Exception e2) {
                                ad.b("RewardCampaignsResourceManager", e2.getMessage());
                            }
                        }
                        a(3, str2, str, "");
                        return;
                    }
                    return;
                }
                Message obtain2 = Message.obtain();
                obtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f14829c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f14830d);
                bundle2.putString("request_id", this.f14831e);
                bundle2.putString("url", str2);
                bundle2.putString(PglCryptUtils.KEY_MESSAGE, str);
                obtain2.setData(bundle2);
                this.f14834h.sendMessage(obtain2);
                if (this.a) {
                    a(3, currentTimeMillis, str2, "zip download failed", "");
                    return;
                }
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 101;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f14829c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f14830d);
            bundle3.putString("request_id", this.f14831e);
            bundle3.putString("url", str2);
            bundle3.putString(PglCryptUtils.KEY_MESSAGE, str);
            obtain3.setData(bundle3);
            this.f14834h.sendMessage(obtain3);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z10) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            long currentTimeMillis = System.currentTimeMillis() - this.f14837k;
            int i10 = this.f14833g;
            if (i10 != 313) {
                if (i10 != 497) {
                    if (i10 == 859) {
                        Message obtain = Message.obtain();
                        obtain.what = 103;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f14829c);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f14830d);
                        bundle.putString("request_id", this.f14831e);
                        obtain.setData(bundle);
                        this.f14834h.sendMessage(obtain);
                        i iVar = this.f14835i;
                        if (iVar != null) {
                            iVar.a(this.f14830d, this.f14829c, this.f14831e, str);
                        }
                        if (!z10) {
                            a(1, str, "", str2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f14829c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f14830d);
                bundle2.putString("request_id", this.f14831e);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f14834h.sendMessage(obtain2);
                if (this.a) {
                    a(1, currentTimeMillis, str, "", str2);
                    return;
                }
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 101;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f14829c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f14830d);
            bundle3.putString("request_id", this.f14831e);
            bundle3.putString("url", str);
            obtain3.setData(bundle3);
            this.f14834h.sendMessage(obtain3);
        }

        public final void a(boolean z10) {
            this.a = z10;
        }

        private void a(int i10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.g.1
                final /* synthetic */ int a;

                /* renamed from: b */
                final /* synthetic */ String f14838b;

                /* renamed from: c */
                final /* synthetic */ String f14839c;

                /* renamed from: d */
                final /* synthetic */ String f14840d;

                public AnonymousClass1(int i102, String str4, String str22, String str32) {
                    r2 = i102;
                    r3 = str4;
                    r4 = str22;
                    r5 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (g.this.f14832f != null && g.this.f14828b != null) {
                        try {
                            n nVar = new n();
                            nVar.a("m_download_end");
                            if (g.this.f14828b != null) {
                                nVar.a(z.l(g.this.f14828b.getApplicationContext()));
                            }
                            nVar.b(r2);
                            if (g.this.f14832f != null) {
                                nVar.e(g.this.f14832f.getId());
                                nVar.f(g.this.f14832f.getRequestId());
                                nVar.s(g.this.f14832f.getCurrentLocalRid());
                                nVar.g(g.this.f14832f.getRequestIdNotice());
                            }
                            nVar.q(r3);
                            nVar.h(r4);
                            nVar.c(g.this.f14829c);
                            if (!TextUtils.isEmpty(r5)) {
                                nVar.t(r5);
                            }
                            nVar.e(2);
                            nVar.a("scenes", "1");
                            nVar.a("url", r3);
                            b.a(nVar, g.this.f14832f);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, g.this.f14832f);
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                            }
                        }
                    }
                }
            });
        }

        private void a(int i10, long j3, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.g.2
                final /* synthetic */ int a;

                /* renamed from: b */
                final /* synthetic */ long f14842b;

                /* renamed from: c */
                final /* synthetic */ String f14843c;

                /* renamed from: d */
                final /* synthetic */ String f14844d;

                /* renamed from: e */
                final /* synthetic */ String f14845e;

                public AnonymousClass2(int i102, long j32, String str4, String str22, String str32) {
                    r2 = i102;
                    r3 = j32;
                    r5 = str4;
                    r6 = str22;
                    r7 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (g.this.f14832f == null) {
                        return;
                    }
                    try {
                        n nVar = new n("m_download_end", r2, r3 + "", r5, g.this.f14832f.getId(), g.this.f14829c, r6, "1");
                        nVar.f(g.this.f14832f.getRequestId());
                        nVar.s(g.this.f14832f.getCurrentLocalRid());
                        nVar.g(g.this.f14832f.getRequestIdNotice());
                        nVar.e(g.this.f14832f.getId());
                        nVar.c(g.this.f14832f.getAdSpaceT());
                        nVar.t(r7);
                        nVar.a("scenes", "1");
                        if (g.this.f14832f.getAdType() == 287) {
                            nVar.d("3");
                        } else if (g.this.f14832f.getAdType() == 94) {
                            nVar.d("1");
                        }
                        nVar.a("url", r5);
                        nVar.e(3);
                        b.a(nVar, g.this.f14832f);
                        com.mbridge.msdk.foundation.same.report.g.a(nVar, g.this.f14829c, g.this.f14832f);
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                        }
                    }
                }
            });
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends Handler {
        private Context a;

        /* renamed from: b */
        private ConcurrentHashMap<String, c> f14847b;

        /* renamed from: c */
        private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f14848c;

        public h(Looper looper) {
            super(looper);
            this.f14847b = new ConcurrentHashMap<>();
            this.f14848c = new ConcurrentHashMap<>();
        }

        public final void a(String str, String str2, String str3, c cVar) {
            this.f14847b.put(str2 + "_" + str3, cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:243:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r14v1 */
        /* JADX WARN: Type inference failed for: r14v12 */
        /* JADX WARN: Type inference failed for: r14v13 */
        /* JADX WARN: Type inference failed for: r14v2 */
        /* JADX WARN: Type inference failed for: r14v3 */
        /* JADX WARN: Type inference failed for: r14v4 */
        /* JADX WARN: Type inference failed for: r14v6 */
        /* JADX WARN: Type inference failed for: r14v7 */
        /* JADX WARN: Type inference failed for: r14v8 */
        /* JADX WARN: Type inference failed for: r15v12 */
        /* JADX WARN: Type inference failed for: r15v13 */
        /* JADX WARN: Type inference failed for: r15v2 */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4 */
        /* JADX WARN: Type inference failed for: r15v5 */
        /* JADX WARN: Type inference failed for: r15v8 */
        /* JADX WARN: Type inference failed for: r15v9 */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r26) {
            /*
                Method dump skipped, instructions count: 1192
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.h.handleMessage(android.os.Message):void");
        }

        public final void a(Context context) {
            this.a = context;
        }

        public final void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f14848c.put(str, copyOnWriteArrayList);
        }
    }

    /* loaded from: classes4.dex */
    public interface i {
        void a(String str, String str2, com.mbridge.msdk.foundation.c.b bVar);

        void a(String str, String str2, String str3, String str4);
    }

    /* loaded from: classes4.dex */
    public interface j {
        void a(String str, String str2, String str3, a.C0214a c0214a, com.mbridge.msdk.foundation.c.b bVar);

        void a(String str, String str2, String str3, String str4, String str5, a.C0214a c0214a);
    }

    /* loaded from: classes4.dex */
    public static final class m {
        private static final b a = new b();
    }

    public /* synthetic */ b(AnonymousClass1 anonymousClass1) {
        this();
    }

    private b() {
        this.f14745d = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
        this.f14746e = "down_type";
        this.f14747f = "h3c";
        this.f14748g = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f14743b = new ConcurrentHashMap<>();
        handlerThread.start();
        this.a = new h(handlerThread.getLooper());
    }

    public static synchronized String b(int i10) {
        synchronized (b.class) {
            return i10 != 200 ? i10 != 201 ? i10 != 203 ? i10 != 205 ? AppLovinMediationProvider.UNKNOWN : "tpl" : "temp" : "zip/html" : MimeTypes.BASE_TYPE_VIDEO;
        }
    }

    public static b a() {
        return m.a;
    }

    public final synchronized void a(Context context, boolean z10, int i10, boolean z11, int i11, String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, c cVar, i iVar) {
        String str4 = str2 + "_" + str3;
        f14743b.put(str4, new a(z10, z11, i10, copyOnWriteArrayList.size(), str2, str3, i11, copyOnWriteArrayList));
        this.a.a(str, str2, str3, cVar);
        this.a.a(context);
        this.a.a(str4, copyOnWriteArrayList);
        this.a.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.1
            final /* synthetic */ CopyOnWriteArrayList a;

            /* renamed from: b */
            final /* synthetic */ Context f14749b;

            /* renamed from: c */
            final /* synthetic */ String f14750c;

            /* renamed from: d */
            final /* synthetic */ int f14751d;

            /* renamed from: e */
            final /* synthetic */ String f14752e;

            /* renamed from: f */
            final /* synthetic */ String f14753f;

            /* renamed from: g */
            final /* synthetic */ i f14754g;

            public AnonymousClass1(CopyOnWriteArrayList copyOnWriteArrayList2, Context context2, String str22, int i112, String str5, String str32, i iVar2) {
                r2 = copyOnWriteArrayList2;
                r3 = context2;
                r4 = str22;
                r5 = i112;
                r6 = str5;
                r7 = str32;
                r8 = iVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException
                    */
                /*
                    Method dump skipped, instructions count: 978
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass1.run():void");
            }
        });
    }

    public static com.mbridge.msdk.foundation.c.b b(int i10, MBridgeIds mBridgeIds, String str, Throwable th2, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(i10);
        bVar.a(mBridgeIds);
        bVar.a(th2);
        bVar.a(str);
        bVar.a(campaignEx);
        return bVar;
    }

    /* loaded from: classes4.dex */
    public static final class f implements com.mbridge.msdk.videocommon.listener.a {
        private Handler a;

        /* renamed from: b */
        private final String f14825b;

        /* renamed from: c */
        private final String f14826c;

        /* renamed from: d */
        private final String f14827d;

        public f(Handler handler, String str, String str2, String str3) {
            this.a = handler;
            this.f14826c = str;
            this.f14825b = str2;
            this.f14827d = str3;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str, true);
            Message obtain = Message.obtain();
            obtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f14825b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f14826c);
            bundle.putString("request_id", this.f14827d);
            bundle.putString("url", str);
            obtain.setData(bundle);
            this.a.sendMessage(obtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str, String str2) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str2, false);
            Message obtain = Message.obtain();
            obtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f14825b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f14826c);
            bundle.putString("request_id", this.f14827d);
            bundle.putString("url", str2);
            bundle.putString(PglCryptUtils.KEY_MESSAGE, str);
            obtain.setData(bundle);
            this.a.sendMessage(obtain);
        }
    }

    public void a(int i10, CampaignEx campaignEx, String str, String str2) {
        com.mbridge.msdk.foundation.tools.n.a(i10, str, str2, new n.a() { // from class: com.mbridge.msdk.reward.adapter.b.2
            final /* synthetic */ int a;

            /* renamed from: b */
            final /* synthetic */ CampaignEx f14756b;

            public AnonymousClass2(int i102, CampaignEx campaignEx2) {
                r2 = i102;
                r3 = campaignEx2;
            }

            @Override // com.mbridge.msdk.foundation.tools.n.a
            public final void a(String str3, String str4, String str5, String str6, boolean z10) {
                if (z10) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    int i11 = r2;
                    if (i11 == 0) {
                        nVar.e(1);
                        nVar.b(1);
                        nVar.a("m_download_end");
                    } else if (i11 == 1) {
                        nVar.e(2);
                        nVar.b(1);
                        nVar.a("m_download_end");
                    } else if (i11 == 2) {
                        nVar.e(3);
                        nVar.b(1);
                        nVar.a("m_download_end");
                        nVar.d(r3.isMraid() ? com.mbridge.msdk.foundation.entity.n.a : com.mbridge.msdk.foundation.entity.n.f13247b);
                        nVar.o("1");
                    }
                    nVar.g(r3.getRequestIdNotice());
                    nVar.a("url", str3);
                    nVar.a("scenes", "1");
                    com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, r3);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e2.getMessage());
                    }
                }
            }

            @Override // com.mbridge.msdk.foundation.tools.n.a
            public final void a(String str3, DownloadError downloadError) {
                String str4 = "";
                if (downloadError != null) {
                    try {
                        if (downloadError.getException() != null) {
                            str4 = downloadError.getException().getMessage();
                        }
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            e2.printStackTrace();
                            return;
                        }
                        return;
                    }
                }
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i11 = r2;
                if (i11 == 0) {
                    nVar.e(1);
                    nVar.b(3);
                    nVar.a("m_download_end");
                } else if (i11 == 1) {
                    nVar.e(2);
                    nVar.b(3);
                    nVar.a("m_download_end");
                } else if (i11 == 2) {
                    nVar.e(3);
                    nVar.b(3);
                    nVar.a("m_download_end");
                    nVar.d(r3.isMraid() ? com.mbridge.msdk.foundation.entity.n.a : com.mbridge.msdk.foundation.entity.n.f13247b);
                    nVar.o("1");
                }
                b.a(nVar, r3);
                nVar.g(r3.getRequestIdNotice());
                nVar.h(str4);
                nVar.a("scenes", "1");
                nVar.a("url", str3);
                com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, r3);
            }
        }, campaignEx2);
    }

    public final synchronized void a(Context context, CampaignEx campaignEx, String str, String str2, String str3, i iVar) {
        this.a.a(context);
        if (campaignEx != null) {
            String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
            if (campaignEx.isDynamicView()) {
                if (ai.a("dyview", cMPTEntryUrl)) {
                    a(0, campaignEx, campaignEx.getMof_tplid() + "", cMPTEntryUrl);
                }
                ResDownloadCheckManager.getInstance().setZipDownloadDone(cMPTEntryUrl, true);
                Message obtain = Message.obtain();
                obtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString("request_id", str3);
                bundle.putString("url", cMPTEntryUrl);
                obtain.setData(bundle);
                this.a.sendMessage(obtain);
                if (iVar != null) {
                    iVar.a(str, str2, str3, cMPTEntryUrl);
                }
                return;
            }
        }
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
            try {
                com.mbridge.msdk.foundation.same.report.d.b b3 = com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid());
                if (b3 == null) {
                    b3 = new com.mbridge.msdk.foundation.same.report.d.b();
                }
                com.mbridge.msdk.foundation.same.report.d.b bVar = b3;
                bVar.a(campaignEx);
                bVar.a(1);
                bVar.c(a(campaignEx));
                H5DownLoadManager.getInstance().downloadH5Res(bVar, campaignEx.getCMPTEntryUrl(), new H5DownLoadManager.ZipDownloadListener() { // from class: com.mbridge.msdk.reward.adapter.b.3
                    final /* synthetic */ String a;

                    /* renamed from: b */
                    final /* synthetic */ String f14758b;

                    /* renamed from: c */
                    final /* synthetic */ String f14759c;

                    /* renamed from: d */
                    final /* synthetic */ i f14760d;

                    /* renamed from: e */
                    final /* synthetic */ Context f14761e;

                    /* renamed from: f */
                    final /* synthetic */ CampaignEx f14762f;

                    public AnonymousClass3(String str22, String str4, String str32, i iVar2, Context context2, CampaignEx campaignEx2) {
                        r2 = str22;
                        r3 = str4;
                        r4 = str32;
                        r5 = iVar2;
                        r6 = context2;
                        r7 = campaignEx2;
                    }

                    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
                    public final void onFailed(String str4, String str5) {
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException
                            */
                        /*
                            Method dump skipped, instructions count: 262
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass3.onFailed(java.lang.String, java.lang.String):void");
                    }

                    @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
                    public final void onSuccess(String str4, String str22, boolean z10) {
                        try {
                            ad.a("RewardCampaignsResourceManager", "zip btl template download success");
                            ResDownloadCheckManager.getInstance().setZipDownloadDone(str4, true);
                            Message obtain2 = Message.obtain();
                            obtain2.what = 105;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, r2);
                            bundle2.putString(MBridgeConstans.PLACEMENT_ID, r3);
                            bundle2.putString("request_id", r4);
                            bundle2.putString("url", str4);
                            obtain2.setData(bundle2);
                            b.this.a.sendMessage(obtain2);
                            i iVar2 = r5;
                            if (iVar2 != null) {
                                iVar2.a(r3, r2, r4, str4);
                            }
                            if (!z10) {
                                b.a(b.this, r6, 1, r7, str4, "", r2, str22);
                            }
                        } catch (Exception e2) {
                            ResDownloadCheckManager.getInstance().setZipDownloadDone(str4, false);
                            Message obtain22 = Message.obtain();
                            obtain22.what = 205;
                            Bundle bundle22 = new Bundle();
                            bundle22.putString(MBridgeConstans.PROPERTIES_UNIT_ID, r2);
                            bundle22.putString(MBridgeConstans.PLACEMENT_ID, r3);
                            bundle22.putString("request_id", r4);
                            bundle22.putString("url", str4);
                            obtain22.setData(bundle22);
                            b.this.a.sendMessage(obtain22);
                            if (r5 != null) {
                                try {
                                    r5.a(str4, r4, b.b(880005, new MBridgeIds(r3, r2, r4), "", e2, null));
                                } catch (Exception e10) {
                                    ad.b("RewardCampaignsResourceManager", e10.getMessage());
                                }
                            }
                            b.a(b.this, r6, 3, r7, str4, e2.getLocalizedMessage(), r2, str22);
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                            }
                        }
                    }
                });
            } catch (Exception e2) {
                ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$2 */
    /* loaded from: classes4.dex */
    public class AnonymousClass2 implements n.a {
        final /* synthetic */ int a;

        /* renamed from: b */
        final /* synthetic */ CampaignEx f14756b;

        public AnonymousClass2(int i102, CampaignEx campaignEx2) {
            r2 = i102;
            r3 = campaignEx2;
        }

        @Override // com.mbridge.msdk.foundation.tools.n.a
        public final void a(String str3, String str4, String str5, String str6, boolean z10) {
            if (z10) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i11 = r2;
                if (i11 == 0) {
                    nVar.e(1);
                    nVar.b(1);
                    nVar.a("m_download_end");
                } else if (i11 == 1) {
                    nVar.e(2);
                    nVar.b(1);
                    nVar.a("m_download_end");
                } else if (i11 == 2) {
                    nVar.e(3);
                    nVar.b(1);
                    nVar.a("m_download_end");
                    nVar.d(r3.isMraid() ? com.mbridge.msdk.foundation.entity.n.a : com.mbridge.msdk.foundation.entity.n.f13247b);
                    nVar.o("1");
                }
                nVar.g(r3.getRequestIdNotice());
                nVar.a("url", str3);
                nVar.a("scenes", "1");
                com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, r3);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardCampaignsResourceManager", e2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.n.a
        public final void a(String str3, DownloadError downloadError) {
            String str4 = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        str4 = downloadError.getException().getMessage();
                    }
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        e2.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            int i11 = r2;
            if (i11 == 0) {
                nVar.e(1);
                nVar.b(3);
                nVar.a("m_download_end");
            } else if (i11 == 1) {
                nVar.e(2);
                nVar.b(3);
                nVar.a("m_download_end");
            } else if (i11 == 2) {
                nVar.e(3);
                nVar.b(3);
                nVar.a("m_download_end");
                nVar.d(r3.isMraid() ? com.mbridge.msdk.foundation.entity.n.a : com.mbridge.msdk.foundation.entity.n.f13247b);
                nVar.o("1");
            }
            b.a(nVar, r3);
            nVar.g(r3.getRequestIdNotice());
            nVar.h(str4);
            nVar.a("scenes", "1");
            nVar.a("url", str3);
            com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, r3);
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$b */
    /* loaded from: classes4.dex */
    public static class C0192b extends com.mbridge.msdk.mbsignalcommon.b.a {
        private final Handler a;

        /* renamed from: b */
        private final Runnable f14786b;

        /* renamed from: c */
        private final boolean f14787c;

        /* renamed from: d */
        private final boolean f14788d;

        /* renamed from: e */
        private int f14789e;

        /* renamed from: f */
        private String f14790f;

        /* renamed from: g */
        private String f14791g;

        /* renamed from: h */
        private String f14792h;

        /* renamed from: i */
        private String f14793i;

        /* renamed from: j */
        private a.C0214a f14794j;

        /* renamed from: k */
        private CampaignEx f14795k;

        /* renamed from: l */
        private CopyOnWriteArrayList<CampaignEx> f14796l;

        /* renamed from: m */
        private com.mbridge.msdk.videocommon.d.c f14797m;

        /* renamed from: n */
        private final j f14798n;

        /* renamed from: o */
        private boolean f14799o;

        /* renamed from: p */
        private boolean f14800p;

        /* renamed from: q */
        private boolean f14801q;

        /* renamed from: r */
        private int f14802r = 0;

        /* renamed from: s */
        private boolean f14803s;

        /* renamed from: t */
        private long f14804t;

        public C0192b(boolean z10, Handler handler, Runnable runnable, boolean z11, boolean z12, int i10, String str, String str2, String str3, String str4, a.C0214a c0214a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.d.c cVar, j jVar, boolean z13, long j3) {
            this.a = handler;
            this.f14786b = runnable;
            this.f14787c = z11;
            this.f14788d = z12;
            this.f14789e = i10;
            this.f14790f = str;
            this.f14792h = str2;
            this.f14791g = str3;
            this.f14793i = str4;
            this.f14794j = c0214a;
            this.f14795k = campaignEx;
            this.f14796l = copyOnWriteArrayList;
            this.f14797m = cVar;
            this.f14798n = jVar;
            this.f14799o = z13;
            this.f14803s = z10;
            this.f14804t = j3;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i10) {
            Runnable runnable;
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 1);
                dVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", this.f14795k, dVar);
            } catch (Throwable th2) {
                ad.b("RVWindVaneWebView", th2.getMessage());
            }
            if (this.f14801q) {
                return;
            }
            String str = this.f14791g + "_" + this.f14790f;
            if (i10 == 1) {
                if (this.f14799o) {
                    com.mbridge.msdk.videocommon.a.e(this.f14791g + "_" + this.f14793i);
                } else {
                    com.mbridge.msdk.videocommon.a.d(this.f14791g + "_" + this.f14793i);
                }
                com.mbridge.msdk.videocommon.a.a(this.f14791g + "_" + this.f14793i + "_" + this.f14790f, this.f14794j, true, this.f14799o);
                Handler handler = this.a;
                if (handler != null && (runnable = this.f14786b) != null) {
                    handler.removeCallbacks(runnable);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f14791g + "_" + this.f14793i + "_" + this.f14790f, true);
                a.C0214a c0214a = this.f14794j;
                if (c0214a != null) {
                    c0214a.a(true);
                }
                j jVar = this.f14798n;
                if (jVar != null) {
                    jVar.a(str, this.f14792h, this.f14791g, this.f14793i, this.f14790f, this.f14794j);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f14791g + "_" + this.f14793i + "_" + this.f14790f, false);
                a.C0214a c0214a2 = this.f14794j;
                if (c0214a2 != null) {
                    c0214a2.a(false);
                }
                if (this.f14798n != null) {
                    this.f14798n.a(str, this.f14793i, this.f14790f, this.f14794j, b.b(880008, new MBridgeIds(this.f14792h, this.f14791g, this.f14793i), eb.j.i("readyState:", i10), null, this.f14795k));
                }
            }
            this.f14801q = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a
        public final void a(WebView webView, String str, String str2, int i10, int i11) {
            boolean z10 = true;
            if (i10 == 1) {
                try {
                    com.mbridge.msdk.reward.b.a aVar = new com.mbridge.msdk.reward.b.a();
                    aVar.b(false);
                    if (i11 != 2) {
                        z10 = false;
                    }
                    aVar.a(z10);
                    aVar.b(str, str2);
                    aVar.a(new com.mbridge.msdk.video.bt.module.b.a(null));
                    aVar.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, i11, str2, true, 1));
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RVWindVaneWebView", e2.getMessage());
                    }
                }
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:8|(1:10)(1:60)|11|(3:14|15|(2:20|(9:22|23|24|25|26|27|28|29|31)(5:41|(1:47)(1:45)|46|29|31)))|52|53|54|46|29|31) */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x0129, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x012c, code lost:
        
            if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L116;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x012e, code lost:
        
            com.mbridge.msdk.foundation.tools.ad.b("RewardCampaignsResourceManager", r0.getLocalizedMessage());
         */
        @Override // com.mbridge.msdk.mbsignalcommon.b.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.lang.Object r18, java.lang.String r19) {
            /*
                Method dump skipped, instructions count: 334
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.C0192b.a(java.lang.Object, java.lang.String):void");
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            Runnable runnable;
            super.a(webView, str);
            if (this.f14800p) {
                return;
            }
            String str2 = this.f14791g + "_" + this.f14790f;
            if (!str.contains("wfr=1")) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f14791g + "_" + this.f14793i + "_" + this.f14790f, true);
                Handler handler = this.a;
                if (handler != null && (runnable = this.f14786b) != null) {
                    handler.removeCallbacks(runnable);
                }
                a.C0214a c0214a = this.f14794j;
                if (c0214a != null) {
                    c0214a.a(true);
                }
                j jVar = this.f14798n;
                if (jVar != null) {
                    jVar.a(str2, this.f14792h, this.f14791g, this.f14793i, this.f14790f, this.f14794j);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView);
            this.f14800p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i10, String str, String str2) {
            super.a(webView, i10, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f14791g + "_" + this.f14793i + "_" + this.f14790f, false);
            if (this.f14798n != null) {
                String str3 = this.f14791g + "_" + this.f14790f;
                a.C0214a c0214a = this.f14794j;
                if (c0214a != null) {
                    c0214a.a(false);
                }
                this.f14798n.a(str3, this.f14793i, this.f14790f, this.f14794j, b.b(880008, new MBridgeIds(this.f14792h, this.f14791g, this.f14793i), "onReceivedError： " + i10 + "  " + str, null, this.f14795k));
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView) {
            if (webView != null) {
                try {
                    try {
                        LinkedHashMap<String, View> b3 = com.mbridge.msdk.video.bt.a.d.c().b(this.f14791g, this.f14793i);
                        if (b3 != null && !b3.isEmpty()) {
                            for (View view : b3.values()) {
                                if (view instanceof MBridgeBTContainer) {
                                    ((MBridgeBTContainer) view).addNativeCloseButtonWhenWebViewCrash();
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        ad.b("OperateViews", th2.getMessage());
                    }
                } catch (Throwable th3) {
                    ad.b("RVWindVaneWebView", th3.getMessage());
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class l extends com.mbridge.msdk.mbsignalcommon.b.b {
        private String a;

        /* renamed from: b */
        private final boolean f14878b;

        /* renamed from: c */
        private final WindVaneWebView f14879c;

        /* renamed from: d */
        private final String f14880d;

        /* renamed from: e */
        private final String f14881e;

        /* renamed from: f */
        private final a.C0214a f14882f;

        /* renamed from: g */
        private final CampaignEx f14883g;

        /* renamed from: h */
        private boolean f14884h;

        /* renamed from: i */
        private String f14885i;

        /* renamed from: j */
        private boolean f14886j;

        /* renamed from: k */
        private boolean f14887k;

        public l(String str, boolean z10, WindVaneWebView windVaneWebView, String str2, String str3, a.C0214a c0214a, CampaignEx campaignEx, boolean z11, String str4) {
            this.f14878b = z10;
            this.f14879c = windVaneWebView;
            this.f14880d = str2;
            this.f14881e = str3;
            this.f14882f = c0214a;
            this.f14883g = campaignEx;
            this.a = str;
            this.f14884h = z11;
            this.f14885i = str4;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i10) {
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 2);
                dVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", this.f14883g, dVar);
            } catch (Throwable th2) {
                ad.b("WindVaneWebView", th2.getMessage());
            }
            if (this.f14887k) {
                return;
            }
            if (this.f14879c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i10);
                    jSONObject2.put("error", "");
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f14879c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("WindVaneWebView", e2.getLocalizedMessage());
                    }
                }
            }
            String str = this.f14881e + "_" + this.f14883g.getId() + "_" + this.f14883g.getRequestId() + "_" + this.f14880d;
            if (i10 == 1) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f14881e + "_" + this.f14885i + "_" + this.f14880d, true);
                a.C0214a c0214a = this.f14882f;
                if (c0214a != null) {
                    c0214a.a(true);
                }
                if (this.f14878b) {
                    if (this.f14883g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(str, this.f14882f, false, this.f14884h);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str, this.f14882f, false, this.f14884h);
                    }
                } else if (this.f14883g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(str, this.f14882f, false, this.f14884h);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str, this.f14882f, false, this.f14884h);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f14881e + "_" + this.f14885i + "_" + this.f14880d, false);
                a.C0214a c0214a2 = this.f14882f;
                if (c0214a2 != null) {
                    c0214a2.a(false);
                }
            }
            this.f14887k = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i10, String str, String str2) {
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f14881e + "_" + this.f14885i + "_" + this.f14880d, false);
            a.C0214a c0214a = this.f14882f;
            if (c0214a != null) {
                c0214a.a(false);
            }
            if (this.f14879c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f14879c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("WindVaneWebView", e2.getLocalizedMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            if (this.f14886j) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.f14879c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "");
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f14879c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WindVaneWebView", e2.getLocalizedMessage());
                        }
                    }
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f14881e + "_" + this.f14885i + "_" + this.f14880d, true);
                a.C0214a c0214a = this.f14882f;
                if (c0214a != null) {
                    c0214a.a(true);
                }
                String str2 = this.f14881e + "_" + this.f14883g.getId() + "_" + this.f14883g.getRequestId() + "_" + this.f14880d;
                if (this.f14878b) {
                    if (this.f14883g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(287, this.f14883g.getRequestIdNotice(), this.f14882f);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str2, this.f14882f, false, this.f14884h);
                    }
                } else if (this.f14883g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f14883g.getRequestIdNotice(), this.f14882f);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str2, this.f14882f, false, this.f14884h);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView);
            this.f14886j = true;
        }
    }

    /* loaded from: classes4.dex */
    public static class k extends com.mbridge.msdk.mbsignalcommon.b.b {
        private Handler a;

        /* renamed from: b */
        private Runnable f14849b;

        /* renamed from: c */
        private final boolean f14850c;

        /* renamed from: d */
        private final boolean f14851d;

        /* renamed from: e */
        private String f14852e;

        /* renamed from: f */
        private final j f14853f;

        /* renamed from: g */
        private final WindVaneWebView f14854g;

        /* renamed from: h */
        private final String f14855h;

        /* renamed from: i */
        private final String f14856i;

        /* renamed from: j */
        private final String f14857j;

        /* renamed from: k */
        private final a.C0214a f14858k;

        /* renamed from: l */
        private final CampaignEx f14859l;

        /* renamed from: m */
        private CopyOnWriteArrayList<CampaignEx> f14860m;

        /* renamed from: n */
        private long f14861n;

        /* renamed from: o */
        private boolean f14862o;

        /* renamed from: p */
        private boolean f14863p;

        /* renamed from: q */
        private final Runnable f14864q;

        /* renamed from: r */
        private final Runnable f14865r;

        /* renamed from: com.mbridge.msdk.reward.adapter.b$k$1 */
        /* loaded from: classes4.dex */
        public class AnonymousClass1 implements Runnable {
            final /* synthetic */ j a;

            /* renamed from: b */
            final /* synthetic */ a.C0214a f14866b;

            /* renamed from: c */
            final /* synthetic */ String f14867c;

            /* renamed from: d */
            final /* synthetic */ String f14868d;

            /* renamed from: e */
            final /* synthetic */ String f14869e;

            /* renamed from: f */
            final /* synthetic */ String f14870f;

            public AnonymousClass1(j jVar, a.C0214a c0214a, String str, String str2, String str3, String str4) {
                r2 = jVar;
                r3 = c0214a;
                r4 = str;
                r5 = str2;
                r6 = str3;
                r7 = str4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WindVaneWebView a;
                a.C0214a c0214a;
                if (r2 != null && (c0214a = r3) != null) {
                    c0214a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(r4 + "_" + r5 + "_" + r6, true);
                    j jVar = r2;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(r4);
                    sb2.append("_");
                    sb2.append(r6);
                    jVar.a(sb2.toString(), r7, r4, r5, r6, r3);
                }
                a.C0214a c0214a2 = r3;
                if (c0214a2 != null && (a = c0214a2.a()) != null) {
                    try {
                        a.release();
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WindVaneWebView", e2.getMessage());
                        }
                    }
                }
            }
        }

        /* renamed from: com.mbridge.msdk.reward.adapter.b$k$2 */
        /* loaded from: classes4.dex */
        public class AnonymousClass2 implements Runnable {
            final /* synthetic */ j a;

            /* renamed from: b */
            final /* synthetic */ a.C0214a f14872b;

            /* renamed from: c */
            final /* synthetic */ String f14873c;

            /* renamed from: d */
            final /* synthetic */ String f14874d;

            /* renamed from: e */
            final /* synthetic */ String f14875e;

            /* renamed from: f */
            final /* synthetic */ String f14876f;

            public AnonymousClass2(j jVar, a.C0214a c0214a, String str, String str2, String str3, String str4) {
                r2 = jVar;
                r3 = c0214a;
                r4 = str;
                r5 = str2;
                r6 = str3;
                r7 = str4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WindVaneWebView a;
                a.C0214a c0214a;
                if (r2 != null && (c0214a = r3) != null) {
                    c0214a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(r4 + "_" + r5 + "_" + r6, true);
                    j jVar = r2;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(r4);
                    sb2.append("_");
                    sb2.append(r6);
                    jVar.a(sb2.toString(), r7, r4, r5, r6, r3);
                }
                a.C0214a c0214a2 = r3;
                if (c0214a2 != null && (a = c0214a2.a()) != null) {
                    try {
                        a.release();
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WindVaneWebView", e2.getMessage());
                        }
                    }
                }
            }
        }

        public k(Handler handler, Runnable runnable, boolean z10, boolean z11, String str, j jVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, a.C0214a c0214a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, long j3) {
            this.a = handler;
            this.f14849b = runnable;
            this.f14850c = z10;
            this.f14851d = z11;
            this.f14852e = str;
            this.f14853f = jVar;
            this.f14854g = windVaneWebView;
            this.f14855h = str2;
            this.f14856i = str4;
            this.f14857j = str3;
            this.f14858k = c0214a;
            this.f14859l = campaignEx;
            this.f14860m = copyOnWriteArrayList;
            this.f14861n = j3;
            AnonymousClass1 anonymousClass1 = new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.k.1
                final /* synthetic */ j a;

                /* renamed from: b */
                final /* synthetic */ a.C0214a f14866b;

                /* renamed from: c */
                final /* synthetic */ String f14867c;

                /* renamed from: d */
                final /* synthetic */ String f14868d;

                /* renamed from: e */
                final /* synthetic */ String f14869e;

                /* renamed from: f */
                final /* synthetic */ String f14870f;

                public AnonymousClass1(j jVar2, a.C0214a c0214a2, String str42, String str5, String str22, String str32) {
                    r2 = jVar2;
                    r3 = c0214a2;
                    r4 = str42;
                    r5 = str5;
                    r6 = str22;
                    r7 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WindVaneWebView a;
                    a.C0214a c0214a2;
                    if (r2 != null && (c0214a2 = r3) != null) {
                        c0214a2.a(true);
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(r4 + "_" + r5 + "_" + r6, true);
                        j jVar2 = r2;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(r4);
                        sb2.append("_");
                        sb2.append(r6);
                        jVar2.a(sb2.toString(), r7, r4, r5, r6, r3);
                    }
                    a.C0214a c0214a22 = r3;
                    if (c0214a22 != null && (a = c0214a22.a()) != null) {
                        try {
                            a.release();
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("WindVaneWebView", e2.getMessage());
                            }
                        }
                    }
                }
            };
            this.f14865r = anonymousClass1;
            this.f14864q = new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.k.2
                final /* synthetic */ j a;

                /* renamed from: b */
                final /* synthetic */ a.C0214a f14872b;

                /* renamed from: c */
                final /* synthetic */ String f14873c;

                /* renamed from: d */
                final /* synthetic */ String f14874d;

                /* renamed from: e */
                final /* synthetic */ String f14875e;

                /* renamed from: f */
                final /* synthetic */ String f14876f;

                public AnonymousClass2(j jVar2, a.C0214a c0214a2, String str42, String str5, String str22, String str32) {
                    r2 = jVar2;
                    r3 = c0214a2;
                    r4 = str42;
                    r5 = str5;
                    r6 = str22;
                    r7 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WindVaneWebView a;
                    a.C0214a c0214a2;
                    if (r2 != null && (c0214a2 = r3) != null) {
                        c0214a2.a(true);
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(r4 + "_" + r5 + "_" + r6, true);
                        j jVar2 = r2;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(r4);
                        sb2.append("_");
                        sb2.append(r6);
                        jVar2.a(sb2.toString(), r7, r4, r5, r6, r3);
                    }
                    a.C0214a c0214a22 = r3;
                    if (c0214a22 != null && (a = c0214a22.a()) != null) {
                        try {
                            a.release();
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("WindVaneWebView", e2.getMessage());
                            }
                        }
                    }
                }
            };
            if (handler != null) {
                handler.postDelayed(anonymousClass1, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i10) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.a(webView, i10);
            Handler handler2 = this.a;
            if (handler2 != null && (runnable2 = this.f14864q) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.a;
            if (handler3 != null && (runnable = this.f14865r) != null) {
                handler3.removeCallbacks(runnable);
            }
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 2);
                dVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", this.f14859l, dVar);
            } catch (Throwable th2) {
                ad.b("WindVaneWebView", th2.getMessage());
            }
            if (this.f14863p) {
                return;
            }
            String str = this.f14856i + "_" + this.f14855h;
            if (i10 == 1) {
                Runnable runnable3 = this.f14849b;
                if (runnable3 != null && (handler = this.a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f14856i + "_" + this.f14852e + "_" + this.f14855h, true);
                a.C0214a c0214a = this.f14858k;
                if (c0214a != null) {
                    c0214a.a(true);
                }
                if (this.f14850c) {
                    if (this.f14851d) {
                        com.mbridge.msdk.videocommon.a.a(287, this.f14859l.getRequestIdNotice(), this.f14858k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(287, this.f14859l.getRequestIdNotice(), this.f14858k);
                    }
                } else if (this.f14851d) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f14859l.getRequestIdNotice(), this.f14858k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f14859l.getRequestIdNotice(), this.f14858k);
                }
                j jVar = this.f14853f;
                if (jVar != null) {
                    jVar.a(str, this.f14857j, this.f14856i, this.f14852e, this.f14855h, this.f14858k);
                }
            } else if (this.f14853f != null) {
                this.f14853f.a(str, this.f14852e, this.f14855h, this.f14858k, b.b(880009, new MBridgeIds(this.f14857j, this.f14856i, this.f14852e), eb.j.i("readyState:", i10), null, this.f14859l));
            }
            this.f14863p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i10, String str, String str2) {
            super.a(webView, i10, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f14856i + "_" + this.f14852e + "_" + this.f14855h, false);
            Handler handler = this.a;
            if (handler != null) {
                if (this.f14864q != null) {
                    handler.removeCallbacks(this.f14865r);
                }
                Runnable runnable = this.f14864q;
                if (runnable != null) {
                    this.a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.f14856i + "_" + this.f14855h;
                a.C0214a c0214a = this.f14858k;
                if (c0214a != null) {
                    c0214a.a(false);
                }
                if (this.f14853f != null) {
                    this.f14853f.a(str3, this.f14852e, str2, this.f14858k, b.b(880009, new MBridgeIds(this.f14857j, this.f14856i, this.f14852e), i10 + "#" + str, null, this.f14859l));
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("WindVaneWebView", e2.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.a(webView, sslErrorHandler, sslError);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f14856i + "_" + this.f14852e + "_" + this.f14855h, false);
            Handler handler = this.a;
            if (handler != null) {
                if (this.f14864q != null) {
                    handler.removeCallbacks(this.f14865r);
                }
                Runnable runnable = this.f14864q;
                if (runnable != null) {
                    this.a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.f14856i + "_" + this.f14855h;
                a.C0214a c0214a = this.f14858k;
                if (c0214a != null) {
                    c0214a.a(false);
                }
                if (this.f14853f != null) {
                    MBridgeIds mBridgeIds = new MBridgeIds(this.f14857j, this.f14856i, this.f14852e);
                    StringBuilder sb2 = new StringBuilder("onReceivedSslError:");
                    sb2.append(sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError()));
                    this.f14853f.a(str, this.f14852e, this.f14855h, this.f14858k, b.b(880009, mBridgeIds, sb2.toString(), null, this.f14859l));
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("WindVaneWebView", e2.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.a(webView, str);
            Handler handler2 = this.a;
            if (handler2 != null && (runnable2 = this.f14865r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (this.f14862o) {
                return;
            }
            if (!str.contains("wfr=1")) {
                String str2 = this.f14856i + "_" + this.f14855h;
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f14856i + "_" + this.f14852e + "_" + this.f14855h, true);
                Runnable runnable3 = this.f14849b;
                if (runnable3 != null && (handler = this.a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                a.C0214a c0214a = this.f14858k;
                if (c0214a != null) {
                    c0214a.a(true);
                }
                if (this.f14850c) {
                    if (this.f14859l.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(287, this.f14859l.getRequestIdNotice(), this.f14858k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(287, this.f14859l.getRequestIdNotice(), this.f14858k);
                    }
                } else if (this.f14859l.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f14859l.getRequestIdNotice(), this.f14858k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f14859l.getRequestIdNotice(), this.f14858k);
                }
                j jVar = this.f14853f;
                if (jVar != null) {
                    jVar.a(str2, this.f14857j, this.f14856i, this.f14852e, this.f14855h, this.f14858k);
                }
            } else {
                Handler handler3 = this.a;
                if (handler3 != null && (runnable = this.f14864q) != null) {
                    handler3.postDelayed(runnable, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView);
            this.f14862o = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01aa A[Catch: all -> 0x01d9, TryCatch #7 {, blocks: (B:4:0x000b, B:6:0x0023, B:9:0x002b, B:13:0x003d, B:26:0x0074, B:29:0x007a, B:31:0x0080, B:32:0x008b, B:35:0x00c4, B:37:0x00da, B:44:0x01a6, B:46:0x01aa, B:48:0x01b5, B:50:0x0086, B:55:0x0155, B:61:0x00f8, B:64:0x0108, B:66:0x011a), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b5 A[Catch: all -> 0x01d9, TRY_LEAVE, TryCatch #7 {, blocks: (B:4:0x000b, B:6:0x0023, B:9:0x002b, B:13:0x003d, B:26:0x0074, B:29:0x007a, B:31:0x0080, B:32:0x008b, B:35:0x00c4, B:37:0x00da, B:44:0x01a6, B:46:0x01aa, B:48:0x01b5, B:50:0x0086, B:55:0x0155, B:61:0x00f8, B:64:0x0108, B:66:0x011a), top: B:3:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(boolean r24, android.os.Handler r25, boolean r26, boolean r27, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r28, java.lang.String r29, int r30, com.mbridge.msdk.foundation.entity.CampaignEx r31, java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, com.mbridge.msdk.videocommon.d.c r38, com.mbridge.msdk.reward.adapter.b.j r39) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.a(boolean, android.os.Handler, boolean, boolean, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.concurrent.CopyOnWriteArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.reward.adapter.b$j):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01d3 A[Catch: all -> 0x0204, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x000d, B:7:0x0033, B:12:0x0047, B:14:0x007a, B:15:0x0081, B:17:0x009c, B:19:0x00a2, B:21:0x00ac, B:24:0x00b3, B:26:0x00b9, B:27:0x00c3, B:29:0x00c9, B:31:0x00dd, B:33:0x00eb, B:39:0x00f4, B:41:0x00f8, B:42:0x0105, B:45:0x0156, B:48:0x016a, B:51:0x018a, B:57:0x01d3, B:58:0x01f5, B:60:0x01f9, B:68:0x00ff), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f9 A[Catch: all -> 0x0204, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x000d, B:7:0x0033, B:12:0x0047, B:14:0x007a, B:15:0x0081, B:17:0x009c, B:19:0x00a2, B:21:0x00ac, B:24:0x00b3, B:26:0x00b9, B:27:0x00c3, B:29:0x00c9, B:31:0x00dd, B:33:0x00eb, B:39:0x00f4, B:41:0x00f8, B:42:0x0105, B:45:0x0156, B:48:0x016a, B:51:0x018a, B:57:0x01d3, B:58:0x01f5, B:60:0x01f9, B:68:0x00ff), top: B:3:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(boolean r27, android.os.Handler r28, boolean r29, boolean r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, com.mbridge.msdk.foundation.entity.CampaignEx r37, java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r38, java.lang.String r39, java.lang.String r40, com.mbridge.msdk.videocommon.d.c r41, com.mbridge.msdk.reward.adapter.b.j r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.a(boolean, android.os.Handler, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.concurrent.CopyOnWriteArrayList, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.reward.adapter.b$j, boolean):void");
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 0;
        }
        try {
            if (campaignEx.getAabEntity() != null) {
                return campaignEx.getAabEntity().h3c;
            }
            return 0;
        } catch (Throwable th2) {
            ad.b("RewardCampaignsResourceManager", th2.getMessage());
            return 0;
        }
    }

    public com.mbridge.msdk.foundation.same.report.d.b a(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.report.d.b b3 = campaignEx != null ? com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid()) : null;
        if (b3 == null) {
            b3 = new com.mbridge.msdk.foundation.same.report.d.b();
        }
        b3.a(campaignEx);
        b3.c(a(campaignEx));
        b3.a(i10);
        return b3;
    }

    public static /* synthetic */ void a(b bVar, Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, i iVar, CopyOnWriteArrayList copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.d.b a10 = bVar.a(campaignEx, 3);
        if (str4.contains(".zip") && str4.contains(ResourceManager.KEY_MD5FILENAME)) {
            boolean isEmpty = TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str4));
            try {
                g gVar = new g(context, str, str2, str3, campaignEx, 497, bVar.a, iVar, copyOnWriteArrayList);
                gVar.a(isEmpty);
                H5DownLoadManager.getInstance().downloadH5Res(a10, str4, gVar);
                return;
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean isEmpty2 = TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str4));
        try {
            d dVar = new d(497, str, str2, str3, campaignEx, iVar, bVar.a, copyOnWriteArrayList);
            dVar.a(isEmpty2);
            H5DownLoadManager.getInstance().downloadH5Res(a10, str4, dVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
            }
        }
    }

    public static /* synthetic */ void a(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.d.c a10 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), campaignEx.getCampaignUnitId());
            if (a10 != null) {
                nVar.v(a10.l());
            }
            com.mbridge.msdk.videocommon.d.a b3 = com.mbridge.msdk.videocommon.d.b.a().b();
            if (b3 != null) {
                nVar.u(b3.c());
            }
        } catch (Exception e2) {
            ad.b("RewardCampaignsResourceManager", e2.getMessage());
        }
    }

    public static /* synthetic */ void a(b bVar, Context context, int i10, CampaignEx campaignEx, String str, String str2, String str3, String str4) {
        com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.4
            final /* synthetic */ CampaignEx a;

            /* renamed from: b */
            final /* synthetic */ Context f14764b;

            /* renamed from: c */
            final /* synthetic */ int f14765c;

            /* renamed from: d */
            final /* synthetic */ String f14766d;

            /* renamed from: e */
            final /* synthetic */ String f14767e;

            /* renamed from: f */
            final /* synthetic */ String f14768f;

            /* renamed from: g */
            final /* synthetic */ String f14769g;

            public AnonymousClass4(CampaignEx campaignEx2, Context context2, int i102, String str5, String str22, String str32, String str42) {
                r2 = campaignEx2;
                r3 = context2;
                r4 = i102;
                r5 = str5;
                r6 = str22;
                r7 = str32;
                r8 = str42;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (r2 != null && r3 != null) {
                    try {
                        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                        nVar.a("m_download_end");
                        Context context2 = r3;
                        if (context2 != null) {
                            nVar.a(z.l(context2.getApplicationContext()));
                        }
                        nVar.b(r4);
                        CampaignEx campaignEx2 = r2;
                        if (campaignEx2 != null) {
                            nVar.e(campaignEx2.getId());
                            nVar.f(r2.getRequestId());
                            nVar.s(r2.getCurrentLocalRid());
                            nVar.g(r2.getRequestIdNotice());
                        }
                        nVar.a("url", r5);
                        nVar.q(r5);
                        nVar.h(r6);
                        nVar.c(r7);
                        if (!TextUtils.isEmpty(r8)) {
                            nVar.t(r8);
                        }
                        nVar.e(1);
                        nVar.a("scenes", "1");
                        com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, r2);
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                        }
                    }
                }
            }
        });
    }
}

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

/* loaded from: classes3.dex */
public final class b {
    private static ConcurrentHashMap<String, a> b;

    /* renamed from: a */
    private final h f17356a;

    /* renamed from: c */
    private boolean f17357c;

    /* renamed from: d */
    private final String f17358d;

    /* renamed from: e */
    private final String f17359e;

    /* renamed from: f */
    private final String f17360f;

    /* renamed from: g */
    private volatile List<WindVaneWebView> f17361g;

    /* renamed from: com.mbridge.msdk.reward.adapter.b$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CopyOnWriteArrayList f17362a;
        final /* synthetic */ Context b;

        /* renamed from: c */
        final /* synthetic */ String f17363c;

        /* renamed from: d */
        final /* synthetic */ int f17364d;

        /* renamed from: e */
        final /* synthetic */ String f17365e;

        /* renamed from: f */
        final /* synthetic */ String f17366f;

        /* renamed from: g */
        final /* synthetic */ i f17367g;

        public AnonymousClass1(CopyOnWriteArrayList copyOnWriteArrayList, Context context, String str, int i9, String str2, String str3, i iVar) {
            r2 = copyOnWriteArrayList;
            r3 = context;
            r4 = str;
            r5 = i9;
            r6 = str2;
            r7 = str3;
            r8 = iVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:130:0x028f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:137:0x025b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:175:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01cd  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x02bb  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0375  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 979
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass1.run():void");
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$3 */
    /* loaded from: classes3.dex */
    public class AnonymousClass3 implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: a */
        final /* synthetic */ String f17371a;
        final /* synthetic */ String b;

        /* renamed from: c */
        final /* synthetic */ String f17372c;

        /* renamed from: d */
        final /* synthetic */ i f17373d;

        /* renamed from: e */
        final /* synthetic */ Context f17374e;

        /* renamed from: f */
        final /* synthetic */ CampaignEx f17375f;

        public AnonymousClass3(String str, String str2, String str3, i iVar, Context context, CampaignEx campaignEx) {
            r2 = str;
            r3 = str2;
            r4 = str3;
            r5 = iVar;
            r6 = context;
            r7 = campaignEx;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00de A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onFailed(java.lang.String r21, java.lang.String r22) {
            /*
                Method dump skipped, instructions count: 269
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass3.onFailed(java.lang.String, java.lang.String):void");
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z8) {
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
                b.this.f17356a.sendMessage(obtain);
                i iVar = r5;
                if (iVar != null) {
                    iVar.a(r3, r2, r4, str);
                }
                if (!z8) {
                    b.a(b.this, r6, 1, r7, str, "", r2, str2);
                }
            } catch (Exception e4) {
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
                Message obtain2 = Message.obtain();
                obtain2.what = 205;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, r2);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, r3);
                bundle2.putString("request_id", r4);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                b.this.f17356a.sendMessage(obtain2);
                if (r5 != null) {
                    try {
                        r5.a(str, r4, b.b(880005, new MBridgeIds(r3, r2, r4), "", e4, null));
                    } catch (Exception e9) {
                        ad.b("RewardCampaignsResourceManager", e9.getMessage());
                    }
                }
                b.a(b.this, r6, 3, r7, str, e4.getLocalizedMessage(), r2, str2);
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardCampaignsResourceManager", e4.getLocalizedMessage());
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$4 */
    /* loaded from: classes3.dex */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CampaignEx f17377a;
        final /* synthetic */ Context b;

        /* renamed from: c */
        final /* synthetic */ int f17378c;

        /* renamed from: d */
        final /* synthetic */ String f17379d;

        /* renamed from: e */
        final /* synthetic */ String f17380e;

        /* renamed from: f */
        final /* synthetic */ String f17381f;

        /* renamed from: g */
        final /* synthetic */ String f17382g;

        public AnonymousClass4(CampaignEx campaignEx, Context context, int i9, String str, String str2, String str3, String str4) {
            r2 = campaignEx;
            r3 = context;
            r4 = i9;
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
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e4.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$5 */
    /* loaded from: classes3.dex */
    public class AnonymousClass5 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f17384a;
        final /* synthetic */ WindVaneWebView b;

        /* renamed from: c */
        final /* synthetic */ CampaignEx f17385c;

        /* renamed from: d */
        final /* synthetic */ CopyOnWriteArrayList f17386d;

        /* renamed from: e */
        final /* synthetic */ String f17387e;

        /* renamed from: f */
        final /* synthetic */ com.mbridge.msdk.videocommon.d.c f17388f;

        /* renamed from: g */
        final /* synthetic */ String f17389g;

        public AnonymousClass5(boolean z8, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, com.mbridge.msdk.videocommon.d.c cVar, String str2) {
            r2 = z8;
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
            boolean z8 = r2;
            WindVaneWebView windVaneWebView = r3;
            String e4 = r4.getRewardTemplateMode().e();
            CampaignEx campaignEx = r4;
            CopyOnWriteArrayList copyOnWriteArrayList = r5;
            String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(r4.getRewardTemplateMode().e());
            String str = r6;
            com.mbridge.msdk.videocommon.d.c cVar = r7;
            String str2 = r8;
            boolean z9 = b.this.f17357c;
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 2);
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000154", campaignEx, dVar);
                a.C0202a c0202a = new a.C0202a();
                WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.m().c());
                if (campaignEx != null) {
                    windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
                }
                windVaneWebView2.setTempTypeForMetrics(2);
                c0202a.a(windVaneWebView2);
                String str3 = "";
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    CopyOnWriteArrayList<CampaignEx> a6 = com.mbridge.msdk.videocommon.download.b.getInstance().a(str);
                    if (a6 != null && a6.size() > 0) {
                        for (int i9 = 0; i9 < copyOnWriteArrayList.size(); i9++) {
                            CampaignEx campaignEx2 = (CampaignEx) copyOnWriteArrayList.get(i9);
                            for (CampaignEx campaignEx3 : a6) {
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = a6;
                                if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                    campaignEx2.setReady(true);
                                    copyOnWriteArrayList.set(i9, campaignEx2);
                                }
                                a6 = copyOnWriteArrayList2;
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
                kVar.d(z8);
                windVaneWebView2.setWebViewListener(new l(str2, false, windVaneWebView, e4, str, c0202a, campaignEx, z9, str4));
                windVaneWebView2.setObject(kVar);
                windVaneWebView2.loadUrl(h5ResAddress);
                windVaneWebView2.setRid(str4);
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardCampaignsResourceManager", e9.getLocalizedMessage());
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        boolean f17391a;
        boolean b;

        /* renamed from: c */
        int f17392c;

        /* renamed from: d */
        int f17393d;

        /* renamed from: e */
        String f17394e;

        /* renamed from: f */
        String f17395f;

        /* renamed from: g */
        int f17396g;

        /* renamed from: h */
        CopyOnWriteArrayList<CampaignEx> f17397h;

        /* renamed from: i */
        CopyOnWriteArrayList<CampaignEx> f17398i;

        public a(boolean z8, boolean z9, int i9, int i10, String str, String str2, int i11, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f17391a = z8;
            this.b = z9;
            this.f17392c = i9;
            this.f17393d = i10;
            this.f17394e = str;
            this.f17395f = str2;
            this.f17396g = i11;
            this.f17397h = copyOnWriteArrayList;
            this.f17398i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList);

        void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.c.b bVar);
    }

    /* loaded from: classes3.dex */
    public static final class d implements H5DownLoadManager.IH5SourceDownloadListener {
        private int b;

        /* renamed from: c */
        private final String f17417c;

        /* renamed from: d */
        private final String f17418d;

        /* renamed from: e */
        private final String f17419e;

        /* renamed from: f */
        private CampaignEx f17420f;

        /* renamed from: g */
        private i f17421g;

        /* renamed from: h */
        private Handler f17422h;

        /* renamed from: i */
        private CopyOnWriteArrayList<CampaignEx> f17423i;

        /* renamed from: a */
        private boolean f17416a = false;

        /* renamed from: j */
        private final long f17424j = System.currentTimeMillis();

        /* renamed from: com.mbridge.msdk.reward.adapter.b$d$1 */
        /* loaded from: classes3.dex */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f17425a;
            final /* synthetic */ long b;

            /* renamed from: c */
            final /* synthetic */ String f17426c;

            /* renamed from: d */
            final /* synthetic */ String f17427d;

            /* renamed from: e */
            final /* synthetic */ String f17428e;

            public AnonymousClass1(int i9, long j7, String str, String str2, String str3) {
                r2 = i9;
                r3 = j7;
                r5 = str;
                r6 = str2;
                r7 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (d.this.f17420f == null) {
                    return;
                }
                try {
                    n nVar = new n("m_download_end", r2, r3 + "", r5, d.this.f17420f.getId(), d.this.f17418d, r6, MBridgeConstans.API_REUQEST_CATEGORY_APP);
                    nVar.f(d.this.f17420f.getRequestId());
                    nVar.s(d.this.f17420f.getCurrentLocalRid());
                    nVar.g(d.this.f17420f.getRequestIdNotice());
                    nVar.e(d.this.f17420f.getId());
                    nVar.c(d.this.f17420f.getAdSpaceT());
                    nVar.a("scenes", "1");
                    nVar.a("url", r5);
                    if (d.this.f17420f.getAdType() == 287) {
                        nVar.d("3");
                    } else if (d.this.f17420f.getAdType() == 94) {
                        nVar.d("1");
                    }
                    if (!TextUtils.isEmpty(r7)) {
                        nVar.t(r7);
                    }
                    b.a(nVar, d.this.f17420f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, d.this.f17418d, d.this.f17420f);
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e4.getLocalizedMessage());
                    }
                }
            }
        }

        public d(int i9, String str, String str2, String str3, CampaignEx campaignEx, i iVar, Handler handler, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.b = i9;
            this.f17417c = str;
            this.f17418d = str2;
            this.f17419e = str3;
            this.f17420f = campaignEx;
            this.f17421g = iVar;
            this.f17422h = handler;
            this.f17423i = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            int i9 = this.b;
            if (i9 != 313) {
                if (i9 != 497) {
                    if (i9 == 859) {
                        Message obtain = Message.obtain();
                        obtain.what = 205;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17418d);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f17417c);
                        bundle.putString("request_id", this.f17419e);
                        bundle.putString("message", str2);
                        obtain.setData(bundle);
                        this.f17422h.sendMessage(obtain);
                        if (this.f17421g != null) {
                            try {
                                this.f17421g.a(str, this.f17419e, b.b(880006, new MBridgeIds(this.f17417c, this.f17418d, this.f17419e), str2, null, null));
                                return;
                            } catch (Exception e4) {
                                ad.b("RewardCampaignsResourceManager", e4.getMessage());
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
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17418d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f17417c);
                bundle2.putString("request_id", this.f17419e);
                bundle2.putString("url", str);
                bundle2.putString("message", str2);
                obtain2.setData(bundle2);
                this.f17422h.sendMessage(obtain2);
                if (this.f17416a) {
                    a(3, System.currentTimeMillis() - this.f17424j, str, "url download failed", "");
                    return;
                }
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 201;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17418d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f17417c);
            bundle3.putString("request_id", this.f17419e);
            bundle3.putString("url", str);
            bundle3.putString("message", str2);
            obtain3.setData(bundle3);
            this.f17422h.sendMessage(obtain3);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z8) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            int i9 = this.b;
            if (i9 != 313) {
                if (i9 != 497) {
                    if (i9 == 859) {
                        Message obtain = Message.obtain();
                        obtain.what = 105;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17418d);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f17417c);
                        bundle.putString("request_id", this.f17419e);
                        obtain.setData(bundle);
                        this.f17422h.sendMessage(obtain);
                        i iVar = this.f17421g;
                        if (iVar != null) {
                            iVar.a(this.f17417c, this.f17418d, this.f17419e, str);
                            return;
                        }
                        return;
                    }
                    return;
                }
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17418d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f17417c);
                bundle2.putString("request_id", this.f17419e);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f17422h.sendMessage(obtain2);
                if (this.f17416a) {
                    a(1, System.currentTimeMillis() - this.f17424j, str, "", str2);
                    return;
                }
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 101;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17418d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f17417c);
            bundle3.putString("request_id", this.f17419e);
            bundle3.putString("url", str);
            obtain3.setData(bundle3);
            this.f17422h.sendMessage(obtain3);
        }

        public final void a(boolean z8) {
            this.f17416a = z8;
        }

        private void a(int i9, long j7, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.d.1

                /* renamed from: a */
                final /* synthetic */ int f17425a;
                final /* synthetic */ long b;

                /* renamed from: c */
                final /* synthetic */ String f17426c;

                /* renamed from: d */
                final /* synthetic */ String f17427d;

                /* renamed from: e */
                final /* synthetic */ String f17428e;

                public AnonymousClass1(int i92, long j72, String str4, String str22, String str32) {
                    r2 = i92;
                    r3 = j72;
                    r5 = str4;
                    r6 = str22;
                    r7 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (d.this.f17420f == null) {
                        return;
                    }
                    try {
                        n nVar = new n("m_download_end", r2, r3 + "", r5, d.this.f17420f.getId(), d.this.f17418d, r6, MBridgeConstans.API_REUQEST_CATEGORY_APP);
                        nVar.f(d.this.f17420f.getRequestId());
                        nVar.s(d.this.f17420f.getCurrentLocalRid());
                        nVar.g(d.this.f17420f.getRequestIdNotice());
                        nVar.e(d.this.f17420f.getId());
                        nVar.c(d.this.f17420f.getAdSpaceT());
                        nVar.a("scenes", "1");
                        nVar.a("url", r5);
                        if (d.this.f17420f.getAdType() == 287) {
                            nVar.d("3");
                        } else if (d.this.f17420f.getAdType() == 94) {
                            nVar.d("1");
                        }
                        if (!TextUtils.isEmpty(r7)) {
                            nVar.t(r7);
                        }
                        b.a(nVar, d.this.f17420f);
                        com.mbridge.msdk.foundation.same.report.g.a(nVar, d.this.f17418d, d.this.f17420f);
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e4.getLocalizedMessage());
                        }
                    }
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements com.mbridge.msdk.foundation.same.c.c {

        /* renamed from: a */
        private Handler f17430a;
        private int b;

        /* renamed from: c */
        private String f17431c;

        /* renamed from: d */
        private String f17432d;

        /* renamed from: e */
        private String f17433e;

        /* renamed from: f */
        private CampaignEx f17434f;

        /* renamed from: com.mbridge.msdk.reward.adapter.b$e$1 */
        /* loaded from: classes3.dex */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ String f17435a;

            public AnonymousClass1(String str) {
                r2 = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (e.this.f17434f != null) {
                    try {
                        o a6 = o.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                        ad.a("RewardCampaignsResourceManager", "campaign is null");
                        n nVar = new n();
                        nVar.a("2000044");
                        nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
                        nVar.e(e.this.f17434f.getId());
                        nVar.p(e.this.f17434f.getImageUrl());
                        nVar.f(e.this.f17434f.getRequestId());
                        nVar.s(e.this.f17434f.getCurrentLocalRid());
                        nVar.g(e.this.f17434f.getRequestIdNotice());
                        nVar.c(e.this.f17431c);
                        nVar.h(r2);
                        nVar.a("scenes", "1");
                        a6.a(nVar);
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e4.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        public e(Handler handler, int i9, String str, String str2, String str3, CampaignEx campaignEx) {
            this.f17430a = handler;
            this.b = i9;
            this.f17432d = str;
            this.f17431c = str2;
            this.f17433e = str3;
            this.f17434f = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.c.c
        public final void onFailedLoad(String str, String str2) {
            int i9;
            Message obtain = Message.obtain();
            if (this.b == 0) {
                i9 = 202;
            } else {
                i9 = 204;
            }
            obtain.what = i9;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17431c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f17432d);
            bundle.putString("request_id", this.f17433e);
            obtain.setData(bundle);
            this.f17430a.sendMessage(obtain);
            AnonymousClass1 anonymousClass1 = new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.e.1

                /* renamed from: a */
                final /* synthetic */ String f17435a;

                public AnonymousClass1(String str3) {
                    r2 = str3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (e.this.f17434f != null) {
                        try {
                            o a6 = o.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                            ad.a("RewardCampaignsResourceManager", "campaign is null");
                            n nVar = new n();
                            nVar.a("2000044");
                            nVar.a(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
                            nVar.e(e.this.f17434f.getId());
                            nVar.p(e.this.f17434f.getImageUrl());
                            nVar.f(e.this.f17434f.getRequestId());
                            nVar.s(e.this.f17434f.getCurrentLocalRid());
                            nVar.g(e.this.f17434f.getRequestIdNotice());
                            nVar.c(e.this.f17431c);
                            nVar.h(r2);
                            nVar.a("scenes", "1");
                            a6.a(nVar);
                        } catch (Exception e4) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardCampaignsResourceManager", e4.getLocalizedMessage());
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
            int i9;
            ResDownloadCheckManager.getInstance().setImageDownloadDone(str, true);
            Message obtain = Message.obtain();
            if (this.b == 0) {
                i9 = 102;
            } else {
                i9 = 104;
            }
            obtain.what = i9;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17431c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f17432d);
            bundle.putString("request_id", this.f17433e);
            obtain.setData(bundle);
            this.f17430a.sendMessage(obtain);
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements H5DownLoadManager.ZipDownloadListener {
        private Context b;

        /* renamed from: c */
        private String f17440c;

        /* renamed from: d */
        private String f17441d;

        /* renamed from: e */
        private String f17442e;

        /* renamed from: f */
        private CampaignEx f17443f;

        /* renamed from: g */
        private int f17444g;

        /* renamed from: h */
        private Handler f17445h;

        /* renamed from: i */
        private i f17446i;

        /* renamed from: j */
        private CopyOnWriteArrayList<CampaignEx> f17447j;

        /* renamed from: a */
        private boolean f17439a = false;

        /* renamed from: k */
        private long f17448k = System.currentTimeMillis();

        /* renamed from: com.mbridge.msdk.reward.adapter.b$g$1 */
        /* loaded from: classes3.dex */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f17449a;
            final /* synthetic */ String b;

            /* renamed from: c */
            final /* synthetic */ String f17450c;

            /* renamed from: d */
            final /* synthetic */ String f17451d;

            public AnonymousClass1(int i9, String str, String str2, String str3) {
                r2 = i9;
                r3 = str;
                r4 = str2;
                r5 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (g.this.f17443f != null && g.this.b != null) {
                    try {
                        n nVar = new n();
                        nVar.a("m_download_end");
                        if (g.this.b != null) {
                            nVar.a(z.l(g.this.b.getApplicationContext()));
                        }
                        nVar.b(r2);
                        if (g.this.f17443f != null) {
                            nVar.e(g.this.f17443f.getId());
                            nVar.f(g.this.f17443f.getRequestId());
                            nVar.s(g.this.f17443f.getCurrentLocalRid());
                            nVar.g(g.this.f17443f.getRequestIdNotice());
                        }
                        nVar.q(r3);
                        nVar.h(r4);
                        nVar.c(g.this.f17440c);
                        if (!TextUtils.isEmpty(r5)) {
                            nVar.t(r5);
                        }
                        nVar.e(2);
                        nVar.a("scenes", "1");
                        nVar.a("url", r3);
                        b.a(nVar, g.this.f17443f);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, g.this.f17443f);
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e4.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        /* renamed from: com.mbridge.msdk.reward.adapter.b$g$2 */
        /* loaded from: classes3.dex */
        public class AnonymousClass2 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f17453a;
            final /* synthetic */ long b;

            /* renamed from: c */
            final /* synthetic */ String f17454c;

            /* renamed from: d */
            final /* synthetic */ String f17455d;

            /* renamed from: e */
            final /* synthetic */ String f17456e;

            public AnonymousClass2(int i9, long j7, String str, String str2, String str3) {
                r2 = i9;
                r3 = j7;
                r5 = str;
                r6 = str2;
                r7 = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (g.this.f17443f == null) {
                    return;
                }
                try {
                    n nVar = new n("m_download_end", r2, r3 + "", r5, g.this.f17443f.getId(), g.this.f17440c, r6, "1");
                    nVar.f(g.this.f17443f.getRequestId());
                    nVar.s(g.this.f17443f.getCurrentLocalRid());
                    nVar.g(g.this.f17443f.getRequestIdNotice());
                    nVar.e(g.this.f17443f.getId());
                    nVar.c(g.this.f17443f.getAdSpaceT());
                    nVar.t(r7);
                    nVar.a("scenes", "1");
                    if (g.this.f17443f.getAdType() == 287) {
                        nVar.d("3");
                    } else if (g.this.f17443f.getAdType() == 94) {
                        nVar.d("1");
                    }
                    nVar.a("url", r5);
                    nVar.e(3);
                    b.a(nVar, g.this.f17443f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, g.this.f17440c, g.this.f17443f);
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e4.getLocalizedMessage());
                    }
                }
            }
        }

        public g(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i9, Handler handler, i iVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.b = context;
            this.f17441d = str;
            this.f17440c = str2;
            this.f17442e = str3;
            this.f17443f = campaignEx;
            this.f17444g = i9;
            this.f17445h = handler;
            this.f17446i = iVar;
            this.f17447j = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
            long currentTimeMillis = System.currentTimeMillis() - this.f17448k;
            int i9 = this.f17444g;
            if (i9 != 313) {
                if (i9 != 497) {
                    if (i9 == 859) {
                        Message obtain = Message.obtain();
                        obtain.what = 203;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17440c);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f17441d);
                        bundle.putString("request_id", this.f17442e);
                        bundle.putString("url", str2);
                        bundle.putString("message", str);
                        obtain.setData(bundle);
                        this.f17445h.sendMessage(obtain);
                        if (this.f17446i != null) {
                            try {
                                this.f17446i.a(str2, this.f17442e, b.b(880006, new MBridgeIds(this.f17441d, this.f17440c, this.f17442e), "", null, null));
                            } catch (Exception e4) {
                                ad.b("RewardCampaignsResourceManager", e4.getMessage());
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
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17440c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f17441d);
                bundle2.putString("request_id", this.f17442e);
                bundle2.putString("url", str2);
                bundle2.putString("message", str);
                obtain2.setData(bundle2);
                this.f17445h.sendMessage(obtain2);
                if (this.f17439a) {
                    a(3, currentTimeMillis, str2, "zip download failed", "");
                    return;
                }
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 101;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17440c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f17441d);
            bundle3.putString("request_id", this.f17442e);
            bundle3.putString("url", str2);
            bundle3.putString("message", str);
            obtain3.setData(bundle3);
            this.f17445h.sendMessage(obtain3);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public final void onSuccess(String str, String str2, boolean z8) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            long currentTimeMillis = System.currentTimeMillis() - this.f17448k;
            int i9 = this.f17444g;
            if (i9 != 313) {
                if (i9 != 497) {
                    if (i9 == 859) {
                        Message obtain = Message.obtain();
                        obtain.what = 103;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17440c);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f17441d);
                        bundle.putString("request_id", this.f17442e);
                        obtain.setData(bundle);
                        this.f17445h.sendMessage(obtain);
                        i iVar = this.f17446i;
                        if (iVar != null) {
                            iVar.a(this.f17441d, this.f17440c, this.f17442e, str);
                        }
                        if (!z8) {
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
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17440c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f17441d);
                bundle2.putString("request_id", this.f17442e);
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.f17445h.sendMessage(obtain2);
                if (this.f17439a) {
                    a(1, currentTimeMillis, str, "", str2);
                    return;
                }
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 101;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f17440c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f17441d);
            bundle3.putString("request_id", this.f17442e);
            bundle3.putString("url", str);
            obtain3.setData(bundle3);
            this.f17445h.sendMessage(obtain3);
        }

        public final void a(boolean z8) {
            this.f17439a = z8;
        }

        private void a(int i9, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.g.1

                /* renamed from: a */
                final /* synthetic */ int f17449a;
                final /* synthetic */ String b;

                /* renamed from: c */
                final /* synthetic */ String f17450c;

                /* renamed from: d */
                final /* synthetic */ String f17451d;

                public AnonymousClass1(int i92, String str4, String str22, String str32) {
                    r2 = i92;
                    r3 = str4;
                    r4 = str22;
                    r5 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (g.this.f17443f != null && g.this.b != null) {
                        try {
                            n nVar = new n();
                            nVar.a("m_download_end");
                            if (g.this.b != null) {
                                nVar.a(z.l(g.this.b.getApplicationContext()));
                            }
                            nVar.b(r2);
                            if (g.this.f17443f != null) {
                                nVar.e(g.this.f17443f.getId());
                                nVar.f(g.this.f17443f.getRequestId());
                                nVar.s(g.this.f17443f.getCurrentLocalRid());
                                nVar.g(g.this.f17443f.getRequestIdNotice());
                            }
                            nVar.q(r3);
                            nVar.h(r4);
                            nVar.c(g.this.f17440c);
                            if (!TextUtils.isEmpty(r5)) {
                                nVar.t(r5);
                            }
                            nVar.e(2);
                            nVar.a("scenes", "1");
                            nVar.a("url", r3);
                            b.a(nVar, g.this.f17443f);
                            com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, g.this.f17443f);
                        } catch (Exception e4) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("RewardCampaignsResourceManager", e4.getLocalizedMessage());
                            }
                        }
                    }
                }
            });
        }

        private void a(int i9, long j7, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.g.2

                /* renamed from: a */
                final /* synthetic */ int f17453a;
                final /* synthetic */ long b;

                /* renamed from: c */
                final /* synthetic */ String f17454c;

                /* renamed from: d */
                final /* synthetic */ String f17455d;

                /* renamed from: e */
                final /* synthetic */ String f17456e;

                public AnonymousClass2(int i92, long j72, String str4, String str22, String str32) {
                    r2 = i92;
                    r3 = j72;
                    r5 = str4;
                    r6 = str22;
                    r7 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (g.this.f17443f == null) {
                        return;
                    }
                    try {
                        n nVar = new n("m_download_end", r2, r3 + "", r5, g.this.f17443f.getId(), g.this.f17440c, r6, "1");
                        nVar.f(g.this.f17443f.getRequestId());
                        nVar.s(g.this.f17443f.getCurrentLocalRid());
                        nVar.g(g.this.f17443f.getRequestIdNotice());
                        nVar.e(g.this.f17443f.getId());
                        nVar.c(g.this.f17443f.getAdSpaceT());
                        nVar.t(r7);
                        nVar.a("scenes", "1");
                        if (g.this.f17443f.getAdType() == 287) {
                            nVar.d("3");
                        } else if (g.this.f17443f.getAdType() == 94) {
                            nVar.d("1");
                        }
                        nVar.a("url", r5);
                        nVar.e(3);
                        b.a(nVar, g.this.f17443f);
                        com.mbridge.msdk.foundation.same.report.g.a(nVar, g.this.f17440c, g.this.f17443f);
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e4.getLocalizedMessage());
                        }
                    }
                }
            });
        }
    }

    /* loaded from: classes3.dex */
    public static final class h extends Handler {

        /* renamed from: a */
        private Context f17458a;
        private ConcurrentHashMap<String, c> b;

        /* renamed from: c */
        private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f17459c;

        public h(Looper looper) {
            super(looper);
            this.b = new ConcurrentHashMap<>();
            this.f17459c = new ConcurrentHashMap<>();
        }

        public final void a(String str, String str2, String str3, c cVar) {
            this.b.put(str2 + "_" + str3, cVar);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(19:6|(1:8)|9|(1:(1:(1:(1:14)(1:233))(1:234))(1:235))(1:236)|15|(1:232)(1:19)|20|21|22|23|(3:68|69|(4:71|(6:(2:78|(1:(2:81|(2:83|(2:86|(1:88)(2:89|(2:93|(1:97))))(1:85))(2:98|(1:100)))(2:101|(1:103)))(2:104|(1:106)))|107|108|109|110|111)(7:115|(1:(2:118|(2:120|(1:(1:131)(2:129|130)))(1:(4:164|(4:167|(2:171|172)|173|165)|176|177)(2:162|163)))(1:(4:187|(6:190|(1:194)|195|(2:199|200)|201|188)|204|205)(2:185|186)))(5:(1:226)(2:211|(2:213|214))|215|(4:218|(2:220|221)(1:223)|222|216)|224|225)|132|133|134|135|(3:144|145|147)(2:137|(5:139|140|141|32|33)(1:143)))|66|67))|25|26|27|28|(1:30)(4:(2:41|(1:(2:44|(2:46|(1:51))(2:52|(1:54)))(2:55|(1:57)))(2:58|(1:60)))|61|62|63)|31|32|33) */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x03be, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x03bf, code lost:
        
            r10 = r15;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:249:0x0485  */
        /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r10v12 */
        /* JADX WARN: Type inference failed for: r10v19 */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Type inference failed for: r10v20 */
        /* JADX WARN: Type inference failed for: r10v21 */
        /* JADX WARN: Type inference failed for: r10v22 */
        /* JADX WARN: Type inference failed for: r10v3, types: [int] */
        /* JADX WARN: Type inference failed for: r10v4, types: [int] */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r15v11, types: [boolean] */
        /* JADX WARN: Type inference failed for: r15v8 */
        /* JADX WARN: Type inference failed for: r18v0, types: [com.mbridge.msdk.videocommon.download.b] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r31) {
            /*
                Method dump skipped, instructions count: 1214
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.h.handleMessage(android.os.Message):void");
        }

        public final void a(Context context) {
            this.f17458a = context;
        }

        public final void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f17459c.put(str, copyOnWriteArrayList);
        }
    }

    /* loaded from: classes3.dex */
    public interface i {
        void a(String str, String str2, com.mbridge.msdk.foundation.c.b bVar);

        void a(String str, String str2, String str3, String str4);
    }

    /* loaded from: classes3.dex */
    public interface j {
        void a(String str, String str2, String str3, a.C0202a c0202a, com.mbridge.msdk.foundation.c.b bVar);

        void a(String str, String str2, String str3, String str4, String str5, a.C0202a c0202a);
    }

    /* loaded from: classes3.dex */
    public static final class m {

        /* renamed from: a */
        private static final b f17497a = new b();
    }

    public /* synthetic */ b(AnonymousClass1 anonymousClass1) {
        this();
    }

    private b() {
        this.f17358d = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
        this.f17359e = "down_type";
        this.f17360f = "h3c";
        this.f17361g = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        b = new ConcurrentHashMap<>();
        handlerThread.start();
        this.f17356a = new h(handlerThread.getLooper());
    }

    public static synchronized String b(int i9) {
        synchronized (b.class) {
            if (i9 == 200) {
                return MimeTypes.BASE_TYPE_VIDEO;
            }
            if (i9 == 201) {
                return "zip/html";
            }
            if (i9 == 203) {
                return "temp";
            }
            if (i9 != 205) {
                return AppLovinMediationProvider.UNKNOWN;
            }
            return "tpl";
        }
    }

    public static b a() {
        return m.f17497a;
    }

    public final synchronized void a(Context context, boolean z8, int i9, boolean z9, int i10, String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, c cVar, i iVar) {
        String str4 = str2 + "_" + str3;
        b.put(str4, new a(z8, z9, i9, copyOnWriteArrayList.size(), str2, str3, i10, copyOnWriteArrayList));
        this.f17356a.a(str, str2, str3, cVar);
        this.f17356a.a(context);
        this.f17356a.a(str4, copyOnWriteArrayList);
        this.f17356a.post(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.1

            /* renamed from: a */
            final /* synthetic */ CopyOnWriteArrayList f17362a;
            final /* synthetic */ Context b;

            /* renamed from: c */
            final /* synthetic */ String f17363c;

            /* renamed from: d */
            final /* synthetic */ int f17364d;

            /* renamed from: e */
            final /* synthetic */ String f17365e;

            /* renamed from: f */
            final /* synthetic */ String f17366f;

            /* renamed from: g */
            final /* synthetic */ i f17367g;

            public AnonymousClass1(CopyOnWriteArrayList copyOnWriteArrayList2, Context context2, String str22, int i102, String str5, String str32, i iVar2) {
                r2 = copyOnWriteArrayList2;
                r3 = context2;
                r4 = str22;
                r5 = i102;
                r6 = str5;
                r7 = str32;
                r8 = iVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    Method dump skipped, instructions count: 979
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass1.run():void");
            }
        });
    }

    public static com.mbridge.msdk.foundation.c.b b(int i9, MBridgeIds mBridgeIds, String str, Throwable th, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.c.b bVar = new com.mbridge.msdk.foundation.c.b(i9);
        bVar.a(mBridgeIds);
        bVar.a(th);
        bVar.a(str);
        bVar.a(campaignEx);
        return bVar;
    }

    /* loaded from: classes3.dex */
    public static final class f implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a */
        private Handler f17436a;
        private final String b;

        /* renamed from: c */
        private final String f17437c;

        /* renamed from: d */
        private final String f17438d;

        public f(Handler handler, String str, String str2, String str3) {
            this.f17436a = handler;
            this.f17437c = str;
            this.b = str2;
            this.f17438d = str3;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str, true);
            Message obtain = Message.obtain();
            obtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f17437c);
            bundle.putString("request_id", this.f17438d);
            bundle.putString("url", str);
            obtain.setData(bundle);
            this.f17436a.sendMessage(obtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public final void a(String str, String str2) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str2, false);
            Message obtain = Message.obtain();
            obtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f17437c);
            bundle.putString("request_id", this.f17438d);
            bundle.putString("url", str2);
            bundle.putString("message", str);
            obtain.setData(bundle);
            this.f17436a.sendMessage(obtain);
        }
    }

    public void a(int i9, CampaignEx campaignEx, String str, String str2) {
        com.mbridge.msdk.foundation.tools.n.a(i9, str, str2, new n.a() { // from class: com.mbridge.msdk.reward.adapter.b.2

            /* renamed from: a */
            final /* synthetic */ int f17369a;
            final /* synthetic */ CampaignEx b;

            public AnonymousClass2(int i92, CampaignEx campaignEx2) {
                r2 = i92;
                r3 = campaignEx2;
            }

            @Override // com.mbridge.msdk.foundation.tools.n.a
            public final void a(String str3, String str4, String str5, String str6, boolean z8) {
                if (z8) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    int i10 = r2;
                    if (i10 == 0) {
                        nVar.e(1);
                        nVar.b(1);
                        nVar.a("m_download_end");
                    } else if (i10 == 1) {
                        nVar.e(2);
                        nVar.b(1);
                        nVar.a("m_download_end");
                    } else if (i10 == 2) {
                        nVar.e(3);
                        nVar.b(1);
                        nVar.a("m_download_end");
                        nVar.d(r3.isMraid() ? com.mbridge.msdk.foundation.entity.n.f15616a : com.mbridge.msdk.foundation.entity.n.b);
                        nVar.o("1");
                    }
                    nVar.g(r3.getRequestIdNotice());
                    nVar.a("url", str3);
                    nVar.a("scenes", "1");
                    com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, r3);
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RewardCampaignsResourceManager", e4.getMessage());
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
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            e4.printStackTrace();
                            return;
                        }
                        return;
                    }
                }
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i10 = r2;
                if (i10 == 0) {
                    nVar.e(1);
                    nVar.b(3);
                    nVar.a("m_download_end");
                } else if (i10 == 1) {
                    nVar.e(2);
                    nVar.b(3);
                    nVar.a("m_download_end");
                } else if (i10 == 2) {
                    nVar.e(3);
                    nVar.b(3);
                    nVar.a("m_download_end");
                    nVar.d(r3.isMraid() ? com.mbridge.msdk.foundation.entity.n.f15616a : com.mbridge.msdk.foundation.entity.n.b);
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
        try {
            this.f17356a.a(context);
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
                    this.f17356a.sendMessage(obtain);
                    if (iVar != null) {
                        iVar.a(str, str2, str3, cMPTEntryUrl);
                    }
                    return;
                }
            }
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                try {
                    com.mbridge.msdk.foundation.same.report.d.b b8 = com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid());
                    if (b8 == null) {
                        b8 = new com.mbridge.msdk.foundation.same.report.d.b();
                    }
                    com.mbridge.msdk.foundation.same.report.d.b bVar = b8;
                    bVar.a(campaignEx);
                    bVar.a(1);
                    bVar.c(a(campaignEx));
                    H5DownLoadManager.getInstance().downloadH5Res(bVar, campaignEx.getCMPTEntryUrl(), new H5DownLoadManager.ZipDownloadListener() { // from class: com.mbridge.msdk.reward.adapter.b.3

                        /* renamed from: a */
                        final /* synthetic */ String f17371a;
                        final /* synthetic */ String b;

                        /* renamed from: c */
                        final /* synthetic */ String f17372c;

                        /* renamed from: d */
                        final /* synthetic */ i f17373d;

                        /* renamed from: e */
                        final /* synthetic */ Context f17374e;

                        /* renamed from: f */
                        final /* synthetic */ CampaignEx f17375f;

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
                                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                */
                            /*
                                Method dump skipped, instructions count: 269
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.AnonymousClass3.onFailed(java.lang.String, java.lang.String):void");
                        }

                        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
                        public final void onSuccess(String str4, String str22, boolean z8) {
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
                                b.this.f17356a.sendMessage(obtain2);
                                i iVar2 = r5;
                                if (iVar2 != null) {
                                    iVar2.a(r3, r2, r4, str4);
                                }
                                if (!z8) {
                                    b.a(b.this, r6, 1, r7, str4, "", r2, str22);
                                }
                            } catch (Exception e4) {
                                ResDownloadCheckManager.getInstance().setZipDownloadDone(str4, false);
                                Message obtain22 = Message.obtain();
                                obtain22.what = 205;
                                Bundle bundle22 = new Bundle();
                                bundle22.putString(MBridgeConstans.PROPERTIES_UNIT_ID, r2);
                                bundle22.putString(MBridgeConstans.PLACEMENT_ID, r3);
                                bundle22.putString("request_id", r4);
                                bundle22.putString("url", str4);
                                obtain22.setData(bundle22);
                                b.this.f17356a.sendMessage(obtain22);
                                if (r5 != null) {
                                    try {
                                        r5.a(str4, r4, b.b(880005, new MBridgeIds(r3, r2, r4), "", e4, null));
                                    } catch (Exception e9) {
                                        ad.b("RewardCampaignsResourceManager", e9.getMessage());
                                    }
                                }
                                b.a(b.this, r6, 3, r7, str4, e4.getLocalizedMessage(), r2, str22);
                                if (MBridgeConstans.DEBUG) {
                                    ad.b("RewardCampaignsResourceManager", e4.getLocalizedMessage());
                                }
                            }
                        }
                    });
                } catch (Exception e4) {
                    ad.b("RewardCampaignsResourceManager", e4.getLocalizedMessage());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements n.a {

        /* renamed from: a */
        final /* synthetic */ int f17369a;
        final /* synthetic */ CampaignEx b;

        public AnonymousClass2(int i92, CampaignEx campaignEx2) {
            r2 = i92;
            r3 = campaignEx2;
        }

        @Override // com.mbridge.msdk.foundation.tools.n.a
        public final void a(String str3, String str4, String str5, String str6, boolean z8) {
            if (z8) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i10 = r2;
                if (i10 == 0) {
                    nVar.e(1);
                    nVar.b(1);
                    nVar.a("m_download_end");
                } else if (i10 == 1) {
                    nVar.e(2);
                    nVar.b(1);
                    nVar.a("m_download_end");
                } else if (i10 == 2) {
                    nVar.e(3);
                    nVar.b(1);
                    nVar.a("m_download_end");
                    nVar.d(r3.isMraid() ? com.mbridge.msdk.foundation.entity.n.f15616a : com.mbridge.msdk.foundation.entity.n.b);
                    nVar.o("1");
                }
                nVar.g(r3.getRequestIdNotice());
                nVar.a("url", str3);
                nVar.a("scenes", "1");
                com.mbridge.msdk.foundation.same.report.d.c.a().a(nVar, r3);
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardCampaignsResourceManager", e4.getMessage());
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
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        e4.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            int i10 = r2;
            if (i10 == 0) {
                nVar.e(1);
                nVar.b(3);
                nVar.a("m_download_end");
            } else if (i10 == 1) {
                nVar.e(2);
                nVar.b(3);
                nVar.a("m_download_end");
            } else if (i10 == 2) {
                nVar.e(3);
                nVar.b(3);
                nVar.a("m_download_end");
                nVar.d(r3.isMraid() ? com.mbridge.msdk.foundation.entity.n.f15616a : com.mbridge.msdk.foundation.entity.n.b);
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

    /* loaded from: classes3.dex */
    public static class l extends com.mbridge.msdk.mbsignalcommon.b.b {

        /* renamed from: a */
        private String f17487a;
        private final boolean b;

        /* renamed from: c */
        private final WindVaneWebView f17488c;

        /* renamed from: d */
        private final String f17489d;

        /* renamed from: e */
        private final String f17490e;

        /* renamed from: f */
        private final a.C0202a f17491f;

        /* renamed from: g */
        private final CampaignEx f17492g;

        /* renamed from: h */
        private boolean f17493h;

        /* renamed from: i */
        private String f17494i;

        /* renamed from: j */
        private boolean f17495j;

        /* renamed from: k */
        private boolean f17496k;

        public l(String str, boolean z8, WindVaneWebView windVaneWebView, String str2, String str3, a.C0202a c0202a, CampaignEx campaignEx, boolean z9, String str4) {
            this.b = z8;
            this.f17488c = windVaneWebView;
            this.f17489d = str2;
            this.f17490e = str3;
            this.f17491f = c0202a;
            this.f17492g = campaignEx;
            this.f17487a = str;
            this.f17493h = z9;
            this.f17494i = str4;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i9) {
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 2);
                dVar.a("result", Integer.valueOf(i9));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", this.f17492g, dVar);
            } catch (Throwable th) {
                ad.b("WindVaneWebView", th.getMessage());
            }
            if (this.f17496k) {
                return;
            }
            if (this.f17488c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f17487a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i9);
                    jSONObject2.put("error", "");
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f17488c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("WindVaneWebView", e4.getLocalizedMessage());
                    }
                }
            }
            String str = this.f17490e + "_" + this.f17492g.getId() + "_" + this.f17492g.getRequestId() + "_" + this.f17489d;
            if (i9 == 1) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f17490e + "_" + this.f17494i + "_" + this.f17489d, true);
                a.C0202a c0202a = this.f17491f;
                if (c0202a != null) {
                    c0202a.a(true);
                }
                if (this.b) {
                    if (this.f17492g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(str, this.f17491f, false, this.f17493h);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str, this.f17491f, false, this.f17493h);
                    }
                } else if (this.f17492g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(str, this.f17491f, false, this.f17493h);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str, this.f17491f, false, this.f17493h);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f17490e + "_" + this.f17494i + "_" + this.f17489d, false);
                a.C0202a c0202a2 = this.f17491f;
                if (c0202a2 != null) {
                    c0202a2.a(false);
                }
            }
            this.f17496k = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i9, String str, String str2) {
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f17490e + "_" + this.f17494i + "_" + this.f17489d, false);
            a.C0202a c0202a = this.f17491f;
            if (c0202a != null) {
                c0202a.a(false);
            }
            if (this.f17488c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f17487a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f17488c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("WindVaneWebView", e4.getLocalizedMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            if (this.f17495j) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.f17488c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f17487a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "");
                        jSONObject.put(DataSchemeDataSource.SCHEME_DATA, jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.g.a().a((WebView) this.f17488c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WindVaneWebView", e4.getLocalizedMessage());
                        }
                    }
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f17490e + "_" + this.f17494i + "_" + this.f17489d, true);
                a.C0202a c0202a = this.f17491f;
                if (c0202a != null) {
                    c0202a.a(true);
                }
                String str2 = this.f17490e + "_" + this.f17492g.getId() + "_" + this.f17492g.getRequestId() + "_" + this.f17489d;
                if (this.b) {
                    if (this.f17492g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(287, this.f17492g.getRequestIdNotice(), this.f17491f);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str2, this.f17491f, false, this.f17493h);
                    }
                } else if (this.f17492g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f17492g.getRequestIdNotice(), this.f17491f);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str2, this.f17491f, false, this.f17493h);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView);
            this.f17495j = true;
        }
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$b */
    /* loaded from: classes3.dex */
    public static class C0180b extends com.mbridge.msdk.mbsignalcommon.b.a {

        /* renamed from: a */
        private final Handler f17399a;
        private final Runnable b;

        /* renamed from: c */
        private final boolean f17400c;

        /* renamed from: d */
        private final boolean f17401d;

        /* renamed from: e */
        private int f17402e;

        /* renamed from: f */
        private String f17403f;

        /* renamed from: g */
        private String f17404g;

        /* renamed from: h */
        private String f17405h;

        /* renamed from: i */
        private String f17406i;

        /* renamed from: j */
        private a.C0202a f17407j;

        /* renamed from: k */
        private CampaignEx f17408k;
        private CopyOnWriteArrayList<CampaignEx> l;
        private com.mbridge.msdk.videocommon.d.c m;

        /* renamed from: n */
        private final j f17409n;

        /* renamed from: o */
        private boolean f17410o;

        /* renamed from: p */
        private boolean f17411p;

        /* renamed from: q */
        private boolean f17412q;

        /* renamed from: r */
        private int f17413r = 0;

        /* renamed from: s */
        private boolean f17414s;

        /* renamed from: t */
        private long f17415t;

        public C0180b(boolean z8, Handler handler, Runnable runnable, boolean z9, boolean z10, int i9, String str, String str2, String str3, String str4, a.C0202a c0202a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.d.c cVar, j jVar, boolean z11, long j7) {
            this.f17399a = handler;
            this.b = runnable;
            this.f17400c = z9;
            this.f17401d = z10;
            this.f17402e = i9;
            this.f17403f = str;
            this.f17405h = str2;
            this.f17404g = str3;
            this.f17406i = str4;
            this.f17407j = c0202a;
            this.f17408k = campaignEx;
            this.l = copyOnWriteArrayList;
            this.m = cVar;
            this.f17409n = jVar;
            this.f17410o = z11;
            this.f17414s = z8;
            this.f17415t = j7;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i9) {
            Runnable runnable;
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 1);
                dVar.a("result", Integer.valueOf(i9));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", this.f17408k, dVar);
            } catch (Throwable th) {
                ad.b("RVWindVaneWebView", th.getMessage());
            }
            if (this.f17412q) {
                return;
            }
            String str = this.f17404g + "_" + this.f17403f;
            if (i9 == 1) {
                if (this.f17410o) {
                    com.mbridge.msdk.videocommon.a.e(this.f17404g + "_" + this.f17406i);
                } else {
                    com.mbridge.msdk.videocommon.a.d(this.f17404g + "_" + this.f17406i);
                }
                com.mbridge.msdk.videocommon.a.a(this.f17404g + "_" + this.f17406i + "_" + this.f17403f, this.f17407j, true, this.f17410o);
                Handler handler = this.f17399a;
                if (handler != null && (runnable = this.b) != null) {
                    handler.removeCallbacks(runnable);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f17404g + "_" + this.f17406i + "_" + this.f17403f, true);
                a.C0202a c0202a = this.f17407j;
                if (c0202a != null) {
                    c0202a.a(true);
                }
                j jVar = this.f17409n;
                if (jVar != null) {
                    jVar.a(str, this.f17405h, this.f17404g, this.f17406i, this.f17403f, this.f17407j);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f17404g + "_" + this.f17406i + "_" + this.f17403f, false);
                a.C0202a c0202a2 = this.f17407j;
                if (c0202a2 != null) {
                    c0202a2.a(false);
                }
                if (this.f17409n != null) {
                    this.f17409n.a(str, this.f17406i, this.f17403f, this.f17407j, b.b(880008, new MBridgeIds(this.f17405h, this.f17404g, this.f17406i), com.mbridge.msdk.foundation.entity.o.h(i9, "readyState:"), null, this.f17408k));
                }
            }
            this.f17412q = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a
        public final void a(WebView webView, String str, String str2, int i9, int i10) {
            boolean z8 = true;
            if (i9 == 1) {
                try {
                    com.mbridge.msdk.reward.b.a aVar = new com.mbridge.msdk.reward.b.a();
                    aVar.b(false);
                    if (i10 != 2) {
                        z8 = false;
                    }
                    aVar.a(z8);
                    aVar.b(str, str2);
                    aVar.a(new com.mbridge.msdk.video.bt.module.b.a(null));
                    aVar.a(false, com.mbridge.msdk.foundation.same.report.d.c.a().a(0, i10, str2, true, 1));
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("RVWindVaneWebView", e4.getMessage());
                    }
                }
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:8|(1:10)(1:54)|11|(3:14|15|(5:20|(3:22|23|24)(2:36|(1:41)(1:40))|25|26|28))|46|47|48|25|26|28) */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0128, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x012b, code lost:
        
            if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x012d, code lost:
        
            com.mbridge.msdk.foundation.tools.ad.b("RewardCampaignsResourceManager", r0.getLocalizedMessage());
         */
        @Override // com.mbridge.msdk.mbsignalcommon.b.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(java.lang.Object r18, java.lang.String r19) {
            /*
                Method dump skipped, instructions count: 327
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.C0180b.a(java.lang.Object, java.lang.String):void");
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            Runnable runnable;
            super.a(webView, str);
            if (this.f17411p) {
                return;
            }
            String str2 = this.f17404g + "_" + this.f17403f;
            if (!str.contains("wfr=1")) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f17404g + "_" + this.f17406i + "_" + this.f17403f, true);
                Handler handler = this.f17399a;
                if (handler != null && (runnable = this.b) != null) {
                    handler.removeCallbacks(runnable);
                }
                a.C0202a c0202a = this.f17407j;
                if (c0202a != null) {
                    c0202a.a(true);
                }
                j jVar = this.f17409n;
                if (jVar != null) {
                    jVar.a(str2, this.f17405h, this.f17404g, this.f17406i, this.f17403f, this.f17407j);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView);
            this.f17411p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i9, String str, String str2) {
            super.a(webView, i9, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f17404g + "_" + this.f17406i + "_" + this.f17403f, false);
            if (this.f17409n != null) {
                String str3 = this.f17404g + "_" + this.f17403f;
                a.C0202a c0202a = this.f17407j;
                if (c0202a != null) {
                    c0202a.a(false);
                }
                this.f17409n.a(str3, this.f17406i, this.f17403f, this.f17407j, b.b(880008, new MBridgeIds(this.f17405h, this.f17404g, this.f17406i), "onReceivedError： " + i9 + "  " + str, null, this.f17408k));
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.a, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView) {
            if (webView != null) {
                try {
                    try {
                        LinkedHashMap<String, View> b = com.mbridge.msdk.video.bt.a.d.c().b(this.f17404g, this.f17406i);
                        if (b != null && !b.isEmpty()) {
                            for (View view : b.values()) {
                                if (view instanceof MBridgeBTContainer) {
                                    ((MBridgeBTContainer) view).addNativeCloseButtonWhenWebViewCrash();
                                }
                            }
                        }
                    } catch (Throwable th) {
                        ad.b("OperateViews", th.getMessage());
                    }
                } catch (Throwable th2) {
                    ad.b("RVWindVaneWebView", th2.getMessage());
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class k extends com.mbridge.msdk.mbsignalcommon.b.b {

        /* renamed from: a */
        private Handler f17460a;
        private Runnable b;

        /* renamed from: c */
        private final boolean f17461c;

        /* renamed from: d */
        private final boolean f17462d;

        /* renamed from: e */
        private String f17463e;

        /* renamed from: f */
        private final j f17464f;

        /* renamed from: g */
        private final WindVaneWebView f17465g;

        /* renamed from: h */
        private final String f17466h;

        /* renamed from: i */
        private final String f17467i;

        /* renamed from: j */
        private final String f17468j;

        /* renamed from: k */
        private final a.C0202a f17469k;
        private final CampaignEx l;
        private CopyOnWriteArrayList<CampaignEx> m;

        /* renamed from: n */
        private long f17470n;

        /* renamed from: o */
        private boolean f17471o;

        /* renamed from: p */
        private boolean f17472p;

        /* renamed from: q */
        private final Runnable f17473q;

        /* renamed from: r */
        private final Runnable f17474r;

        /* renamed from: com.mbridge.msdk.reward.adapter.b$k$1 */
        /* loaded from: classes3.dex */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ j f17475a;
            final /* synthetic */ a.C0202a b;

            /* renamed from: c */
            final /* synthetic */ String f17476c;

            /* renamed from: d */
            final /* synthetic */ String f17477d;

            /* renamed from: e */
            final /* synthetic */ String f17478e;

            /* renamed from: f */
            final /* synthetic */ String f17479f;

            public AnonymousClass1(j jVar, a.C0202a c0202a, String str, String str2, String str3, String str4) {
                r2 = jVar;
                r3 = c0202a;
                r4 = str;
                r5 = str2;
                r6 = str3;
                r7 = str4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WindVaneWebView a6;
                a.C0202a c0202a;
                if (r2 != null && (c0202a = r3) != null) {
                    c0202a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(r4 + "_" + r5 + "_" + r6, true);
                    j jVar = r2;
                    StringBuilder sb = new StringBuilder();
                    sb.append(r4);
                    sb.append("_");
                    sb.append(r6);
                    jVar.a(sb.toString(), r7, r4, r5, r6, r3);
                }
                a.C0202a c0202a2 = r3;
                if (c0202a2 != null && (a6 = c0202a2.a()) != null) {
                    try {
                        a6.release();
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WindVaneWebView", e4.getMessage());
                        }
                    }
                }
            }
        }

        /* renamed from: com.mbridge.msdk.reward.adapter.b$k$2 */
        /* loaded from: classes3.dex */
        public class AnonymousClass2 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ j f17481a;
            final /* synthetic */ a.C0202a b;

            /* renamed from: c */
            final /* synthetic */ String f17482c;

            /* renamed from: d */
            final /* synthetic */ String f17483d;

            /* renamed from: e */
            final /* synthetic */ String f17484e;

            /* renamed from: f */
            final /* synthetic */ String f17485f;

            public AnonymousClass2(j jVar, a.C0202a c0202a, String str, String str2, String str3, String str4) {
                r2 = jVar;
                r3 = c0202a;
                r4 = str;
                r5 = str2;
                r6 = str3;
                r7 = str4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WindVaneWebView a6;
                a.C0202a c0202a;
                if (r2 != null && (c0202a = r3) != null) {
                    c0202a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(r4 + "_" + r5 + "_" + r6, true);
                    j jVar = r2;
                    StringBuilder sb = new StringBuilder();
                    sb.append(r4);
                    sb.append("_");
                    sb.append(r6);
                    jVar.a(sb.toString(), r7, r4, r5, r6, r3);
                }
                a.C0202a c0202a2 = r3;
                if (c0202a2 != null && (a6 = c0202a2.a()) != null) {
                    try {
                        a6.release();
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("WindVaneWebView", e4.getMessage());
                        }
                    }
                }
            }
        }

        public k(Handler handler, Runnable runnable, boolean z8, boolean z9, String str, j jVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, a.C0202a c0202a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, long j7) {
            this.f17460a = handler;
            this.b = runnable;
            this.f17461c = z8;
            this.f17462d = z9;
            this.f17463e = str;
            this.f17464f = jVar;
            this.f17465g = windVaneWebView;
            this.f17466h = str2;
            this.f17467i = str4;
            this.f17468j = str3;
            this.f17469k = c0202a;
            this.l = campaignEx;
            this.m = copyOnWriteArrayList;
            this.f17470n = j7;
            AnonymousClass1 anonymousClass1 = new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.k.1

                /* renamed from: a */
                final /* synthetic */ j f17475a;
                final /* synthetic */ a.C0202a b;

                /* renamed from: c */
                final /* synthetic */ String f17476c;

                /* renamed from: d */
                final /* synthetic */ String f17477d;

                /* renamed from: e */
                final /* synthetic */ String f17478e;

                /* renamed from: f */
                final /* synthetic */ String f17479f;

                public AnonymousClass1(j jVar2, a.C0202a c0202a2, String str42, String str5, String str22, String str32) {
                    r2 = jVar2;
                    r3 = c0202a2;
                    r4 = str42;
                    r5 = str5;
                    r6 = str22;
                    r7 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WindVaneWebView a6;
                    a.C0202a c0202a2;
                    if (r2 != null && (c0202a2 = r3) != null) {
                        c0202a2.a(true);
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(r4 + "_" + r5 + "_" + r6, true);
                        j jVar2 = r2;
                        StringBuilder sb = new StringBuilder();
                        sb.append(r4);
                        sb.append("_");
                        sb.append(r6);
                        jVar2.a(sb.toString(), r7, r4, r5, r6, r3);
                    }
                    a.C0202a c0202a22 = r3;
                    if (c0202a22 != null && (a6 = c0202a22.a()) != null) {
                        try {
                            a6.release();
                        } catch (Exception e4) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("WindVaneWebView", e4.getMessage());
                            }
                        }
                    }
                }
            };
            this.f17474r = anonymousClass1;
            this.f17473q = new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.k.2

                /* renamed from: a */
                final /* synthetic */ j f17481a;
                final /* synthetic */ a.C0202a b;

                /* renamed from: c */
                final /* synthetic */ String f17482c;

                /* renamed from: d */
                final /* synthetic */ String f17483d;

                /* renamed from: e */
                final /* synthetic */ String f17484e;

                /* renamed from: f */
                final /* synthetic */ String f17485f;

                public AnonymousClass2(j jVar2, a.C0202a c0202a2, String str42, String str5, String str22, String str32) {
                    r2 = jVar2;
                    r3 = c0202a2;
                    r4 = str42;
                    r5 = str5;
                    r6 = str22;
                    r7 = str32;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WindVaneWebView a6;
                    a.C0202a c0202a2;
                    if (r2 != null && (c0202a2 = r3) != null) {
                        c0202a2.a(true);
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(r4 + "_" + r5 + "_" + r6, true);
                        j jVar2 = r2;
                        StringBuilder sb = new StringBuilder();
                        sb.append(r4);
                        sb.append("_");
                        sb.append(r6);
                        jVar2.a(sb.toString(), r7, r4, r5, r6, r3);
                    }
                    a.C0202a c0202a22 = r3;
                    if (c0202a22 != null && (a6 = c0202a22.a()) != null) {
                        try {
                            a6.release();
                        } catch (Exception e4) {
                            if (MBridgeConstans.DEBUG) {
                                ad.b("WindVaneWebView", e4.getMessage());
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
        public final void a(WebView webView, int i9) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.a(webView, i9);
            Handler handler2 = this.f17460a;
            if (handler2 != null && (runnable2 = this.f17473q) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f17460a;
            if (handler3 != null && (runnable = this.f17474r) != null) {
                handler3.removeCallbacks(runnable);
            }
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("type", 2);
                dVar.a("result", Integer.valueOf(i9));
                com.mbridge.msdk.foundation.same.report.d.c.a().a("2000155", this.l, dVar);
            } catch (Throwable th) {
                ad.b("WindVaneWebView", th.getMessage());
            }
            if (this.f17472p) {
                return;
            }
            String str = this.f17467i + "_" + this.f17466h;
            if (i9 == 1) {
                Runnable runnable3 = this.b;
                if (runnable3 != null && (handler = this.f17460a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f17467i + "_" + this.f17463e + "_" + this.f17466h, true);
                a.C0202a c0202a = this.f17469k;
                if (c0202a != null) {
                    c0202a.a(true);
                }
                if (this.f17461c) {
                    if (this.f17462d) {
                        com.mbridge.msdk.videocommon.a.a(287, this.l.getRequestIdNotice(), this.f17469k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(287, this.l.getRequestIdNotice(), this.f17469k);
                    }
                } else if (this.f17462d) {
                    com.mbridge.msdk.videocommon.a.a(94, this.l.getRequestIdNotice(), this.f17469k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.l.getRequestIdNotice(), this.f17469k);
                }
                j jVar = this.f17464f;
                if (jVar != null) {
                    jVar.a(str, this.f17468j, this.f17467i, this.f17463e, this.f17466h, this.f17469k);
                }
            } else if (this.f17464f != null) {
                this.f17464f.a(str, this.f17463e, this.f17466h, this.f17469k, b.b(880009, new MBridgeIds(this.f17468j, this.f17467i, this.f17463e), com.mbridge.msdk.foundation.entity.o.h(i9, "readyState:"), null, this.l));
            }
            this.f17472p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, int i9, String str, String str2) {
            super.a(webView, i9, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f17467i + "_" + this.f17463e + "_" + this.f17466h, false);
            Handler handler = this.f17460a;
            if (handler != null) {
                if (this.f17473q != null) {
                    handler.removeCallbacks(this.f17474r);
                }
                Runnable runnable = this.f17473q;
                if (runnable != null) {
                    this.f17460a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.f17467i + "_" + this.f17466h;
                a.C0202a c0202a = this.f17469k;
                if (c0202a != null) {
                    c0202a.a(false);
                }
                if (this.f17464f != null) {
                    this.f17464f.a(str3, this.f17463e, str2, this.f17469k, b.b(880009, new MBridgeIds(this.f17468j, this.f17467i, this.f17463e), i9 + "#" + str, null, this.l));
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("WindVaneWebView", e4.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.a(webView, sslErrorHandler, sslError);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f17467i + "_" + this.f17463e + "_" + this.f17466h, false);
            Handler handler = this.f17460a;
            if (handler != null) {
                if (this.f17473q != null) {
                    handler.removeCallbacks(this.f17474r);
                }
                Runnable runnable = this.f17473q;
                if (runnable != null) {
                    this.f17460a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.f17467i + "_" + this.f17466h;
                a.C0202a c0202a = this.f17469k;
                if (c0202a != null) {
                    c0202a.a(false);
                }
                if (this.f17464f != null) {
                    MBridgeIds mBridgeIds = new MBridgeIds(this.f17468j, this.f17467i, this.f17463e);
                    StringBuilder sb = new StringBuilder("onReceivedSslError:");
                    sb.append(sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError()));
                    this.f17464f.a(str, this.f17463e, this.f17466h, this.f17469k, b.b(880009, mBridgeIds, sb.toString(), null, this.l));
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("WindVaneWebView", e4.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.b.b, com.mbridge.msdk.mbsignalcommon.windvane.d
        public final void a(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.a(webView, str);
            Handler handler2 = this.f17460a;
            if (handler2 != null && (runnable2 = this.f17474r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (this.f17471o) {
                return;
            }
            if (!str.contains("wfr=1")) {
                String str2 = this.f17467i + "_" + this.f17466h;
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f17467i + "_" + this.f17463e + "_" + this.f17466h, true);
                Runnable runnable3 = this.b;
                if (runnable3 != null && (handler = this.f17460a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                a.C0202a c0202a = this.f17469k;
                if (c0202a != null) {
                    c0202a.a(true);
                }
                if (this.f17461c) {
                    if (this.l.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(287, this.l.getRequestIdNotice(), this.f17469k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(287, this.l.getRequestIdNotice(), this.f17469k);
                    }
                } else if (this.l.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.l.getRequestIdNotice(), this.f17469k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.l.getRequestIdNotice(), this.f17469k);
                }
                j jVar = this.f17464f;
                if (jVar != null) {
                    jVar.a(str2, this.f17468j, this.f17467i, this.f17463e, this.f17466h, this.f17469k);
                }
            } else {
                Handler handler3 = this.f17460a;
                if (handler3 != null && (runnable = this.f17473q) != null) {
                    handler3.postDelayed(runnable, DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.g.a().a(webView);
            this.f17471o = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01b4 A[Catch: all -> 0x003c, TryCatch #7 {, blocks: (B:4:0x000b, B:6:0x0023, B:9:0x002b, B:13:0x0047, B:26:0x008a, B:29:0x0090, B:31:0x0096, B:33:0x00a5, B:36:0x00db, B:38:0x00f1, B:45:0x01b0, B:47:0x01b4, B:49:0x01bf, B:51:0x009f, B:56:0x0166, B:62:0x010d, B:65:0x011d, B:67:0x012f), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bf A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #7 {, blocks: (B:4:0x000b, B:6:0x0023, B:9:0x002b, B:13:0x0047, B:26:0x008a, B:29:0x0090, B:31:0x0096, B:33:0x00a5, B:36:0x00db, B:38:0x00f1, B:45:0x01b0, B:47:0x01b4, B:49:0x01bf, B:51:0x009f, B:56:0x0166, B:62:0x010d, B:65:0x011d, B:67:0x012f), top: B:3:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(boolean r24, android.os.Handler r25, boolean r26, boolean r27, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView r28, java.lang.String r29, int r30, com.mbridge.msdk.foundation.entity.CampaignEx r31, java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, com.mbridge.msdk.videocommon.d.c r38, com.mbridge.msdk.reward.adapter.b.j r39) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.a(boolean, android.os.Handler, boolean, boolean, com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView, java.lang.String, int, com.mbridge.msdk.foundation.entity.CampaignEx, java.util.concurrent.CopyOnWriteArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.mbridge.msdk.videocommon.d.c, com.mbridge.msdk.reward.adapter.b$j):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01db A[Catch: all -> 0x0046, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x000d, B:7:0x0033, B:12:0x004b, B:14:0x007e, B:15:0x008b, B:17:0x00a6, B:19:0x00ac, B:21:0x00b6, B:24:0x00bd, B:26:0x00c3, B:27:0x00cd, B:29:0x00d3, B:31:0x00e7, B:33:0x00f5, B:39:0x00fe, B:41:0x0102, B:43:0x0113, B:46:0x0161, B:49:0x0175, B:52:0x0195, B:58:0x01db, B:59:0x01fd, B:61:0x0201, B:69:0x010c), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0201 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x000d, B:7:0x0033, B:12:0x004b, B:14:0x007e, B:15:0x008b, B:17:0x00a6, B:19:0x00ac, B:21:0x00b6, B:24:0x00bd, B:26:0x00c3, B:27:0x00cd, B:29:0x00d3, B:31:0x00e7, B:33:0x00f5, B:39:0x00fe, B:41:0x0102, B:43:0x0113, B:46:0x0161, B:49:0x0175, B:52:0x0195, B:58:0x01db, B:59:0x01fd, B:61:0x0201, B:69:0x010c), top: B:3:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(boolean r27, android.os.Handler r28, boolean r29, boolean r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, com.mbridge.msdk.foundation.entity.CampaignEx r37, java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r38, java.lang.String r39, java.lang.String r40, com.mbridge.msdk.videocommon.d.c r41, com.mbridge.msdk.reward.adapter.b.j r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 526
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
        } catch (Throwable th) {
            ad.b("RewardCampaignsResourceManager", th.getMessage());
            return 0;
        }
    }

    public com.mbridge.msdk.foundation.same.report.d.b a(CampaignEx campaignEx, int i9) {
        com.mbridge.msdk.foundation.same.report.d.b b8 = campaignEx != null ? com.mbridge.msdk.foundation.same.report.d.c.a().b(campaignEx.getCurrentLocalRid()) : null;
        if (b8 == null) {
            b8 = new com.mbridge.msdk.foundation.same.report.d.b();
        }
        b8.a(campaignEx);
        b8.c(a(campaignEx));
        b8.a(i9);
        return b8;
    }

    public static /* synthetic */ void a(b bVar, Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, i iVar, CopyOnWriteArrayList copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.d.b a6 = bVar.a(campaignEx, 3);
        if (str4.contains(".zip") && str4.contains(ResourceManager.KEY_MD5FILENAME)) {
            boolean isEmpty = TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str4));
            try {
                g gVar = new g(context, str, str2, str3, campaignEx, 497, bVar.f17356a, iVar, copyOnWriteArrayList);
                gVar.a(isEmpty);
                H5DownLoadManager.getInstance().downloadH5Res(a6, str4, gVar);
                return;
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("RewardCampaignsResourceManager", e4.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean isEmpty2 = TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str4));
        try {
            d dVar = new d(497, str, str2, str3, campaignEx, iVar, bVar.f17356a, copyOnWriteArrayList);
            dVar.a(isEmpty2);
            H5DownLoadManager.getInstance().downloadH5Res(a6, str4, dVar);
        } catch (Exception e9) {
            if (MBridgeConstans.DEBUG) {
                ad.b("RewardCampaignsResourceManager", e9.getLocalizedMessage());
            }
        }
    }

    public static /* synthetic */ void a(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.d.c a6 = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), campaignEx.getCampaignUnitId());
            if (a6 != null) {
                nVar.v(a6.l());
            }
            com.mbridge.msdk.videocommon.d.a b8 = com.mbridge.msdk.videocommon.d.b.a().b();
            if (b8 != null) {
                nVar.u(b8.c());
            }
        } catch (Exception e4) {
            ad.b("RewardCampaignsResourceManager", e4.getMessage());
        }
    }

    public static /* synthetic */ void a(b bVar, Context context, int i9, CampaignEx campaignEx, String str, String str2, String str3, String str4) {
        com.mbridge.msdk.foundation.same.f.b.e().execute(new Runnable() { // from class: com.mbridge.msdk.reward.adapter.b.4

            /* renamed from: a */
            final /* synthetic */ CampaignEx f17377a;
            final /* synthetic */ Context b;

            /* renamed from: c */
            final /* synthetic */ int f17378c;

            /* renamed from: d */
            final /* synthetic */ String f17379d;

            /* renamed from: e */
            final /* synthetic */ String f17380e;

            /* renamed from: f */
            final /* synthetic */ String f17381f;

            /* renamed from: g */
            final /* synthetic */ String f17382g;

            public AnonymousClass4(CampaignEx campaignEx2, Context context2, int i92, String str5, String str22, String str32, String str42) {
                r2 = campaignEx2;
                r3 = context2;
                r4 = i92;
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
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("RewardCampaignsResourceManager", e4.getLocalizedMessage());
                        }
                    }
                }
            }
        });
    }
}

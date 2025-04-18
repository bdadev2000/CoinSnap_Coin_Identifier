package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.db.o;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.mbnative.controller.NativeController;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.File;
import java.io.Serializable;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class a implements Serializable {
    private int A;
    private File B;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private k H;
    private com.mbridge.msdk.videocommon.d.c I;
    private k J;

    /* renamed from: b, reason: collision with root package name */
    private int f16385b;

    /* renamed from: c, reason: collision with root package name */
    private int f16386c;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f16388e;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f16390g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f16391h;

    /* renamed from: i, reason: collision with root package name */
    private CampaignEx f16392i;

    /* renamed from: j, reason: collision with root package name */
    private String f16393j;

    /* renamed from: k, reason: collision with root package name */
    private Context f16394k;

    /* renamed from: l, reason: collision with root package name */
    private long f16395l;

    /* renamed from: m, reason: collision with root package name */
    private String f16396m;

    /* renamed from: n, reason: collision with root package name */
    private String f16397n;

    /* renamed from: o, reason: collision with root package name */
    private long f16398o;

    /* renamed from: p, reason: collision with root package name */
    private String f16399p;

    /* renamed from: r, reason: collision with root package name */
    private long f16401r;
    private n u;

    /* renamed from: w, reason: collision with root package name */
    private String f16405w;

    /* renamed from: x, reason: collision with root package name */
    private DownloadRequest f16406x;

    /* renamed from: y, reason: collision with root package name */
    private int f16407y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f16408z;
    private boolean a = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16387d = false;

    /* renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<c> f16389f = new CopyOnWriteArrayList<>();

    /* renamed from: q, reason: collision with root package name */
    private boolean f16400q = false;

    /* renamed from: s, reason: collision with root package name */
    private int f16402s = 100;

    /* renamed from: t, reason: collision with root package name */
    private boolean f16403t = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f16404v = false;
    private int C = 1;
    private boolean K = false;
    private boolean L = false;
    private boolean M = false;
    private boolean N = false;
    private boolean O = false;
    private boolean P = false;
    private boolean Q = false;
    private OnDownloadStateListener R = new OnDownloadStateListener() { // from class: com.mbridge.msdk.videocommon.download.a.1
        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                ad.b("CampaignDownLoadTask", "onDownloadComplete callback : " + a.this.f16398o + "    " + a.this.f16395l);
                if (a.this.u == null) {
                    a.this.u = n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                }
                a.this.u.a(a.this.f16396m, a.this.f16398o, 5);
                if (downloadMessage != null) {
                    try {
                        str = (String) downloadMessage.getExtra("responseHeaders");
                    } catch (Throwable th2) {
                        ad.b("CampaignDownLoadTask", th2.getMessage());
                    }
                    a aVar = a.this;
                    aVar.a(aVar.f16398o, true, str);
                    a.this.u.a(a.this.f16396m, a.this.f16398o, 5);
                    a aVar2 = a.this;
                    aVar2.a(aVar2.f16398o, true, "");
                    a.a(a.this, 1, true, "");
                }
                str = "";
                a aVar3 = a.this;
                aVar3.a(aVar3.f16398o, true, str);
                a.this.u.a(a.this.f16396m, a.this.f16398o, 5);
                a aVar22 = a.this;
                aVar22.a(aVar22.f16398o, true, "");
                a.a(a.this, 1, true, "");
            } catch (Exception e2) {
                ad.b("CampaignDownLoadTask", e2.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            String str;
            if (a.this.f16406x != null && a.this.f16406x.getStatus() != DownloadStatus.CANCELLED) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("cache", a.this.f16406x.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP));
                a aVar = a.this;
                aVar.a(aVar.f16392i, dVar);
                if (downloadError != null && downloadError.getException() != null) {
                    str = downloadError.getException().getMessage();
                } else {
                    str = "Video Download Error";
                }
                a.this.v();
                a.this.a(3, str, "");
                a.this.a(str);
                a aVar2 = a.this;
                a.a(aVar2, 3, aVar2.f16408z, str);
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadStart(DownloadMessage downloadMessage) {
            a.this.f16388e = 1;
            if (a.this.u == null) {
                a.this.u = n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            }
            a.this.u.a(a.this.f16392i, a.this.f16395l, a.this.f16399p, a.this.f16388e);
        }
    };
    private OnProgressStateListener S = new OnProgressStateListener() { // from class: com.mbridge.msdk.videocommon.download.a.2
        @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
        public final void onProgress(DownloadMessage downloadMessage, DownloadProgress downloadProgress) {
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("cache", a.this.f16406x.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP));
                a aVar = a.this;
                aVar.a(aVar.f16392i, dVar);
                a.this.f16398o = downloadProgress.getCurrent();
                a.this.f16395l = downloadProgress.getTotal();
                a.this.f16407y = downloadProgress.getCurrentDownloadRate();
                if (a.this.f16402s != 100 && downloadProgress.getCurrentDownloadRate() >= a.this.f16402s) {
                    ad.b("CampaignDownLoadTask", "Rate : " + downloadProgress.getCurrentDownloadRate() + " ReadyRate & cdRate = " + a.this.f16402s + " " + a.this.f16386c);
                    if (!a.this.f16387d) {
                        a.this.f16387d = true;
                        if (!a.this.f16408z) {
                            a.a(a.this, 1, true, "");
                            a.this.a(downloadProgress.getCurrent(), false, "");
                        }
                        if (a.this.f16406x != null && a.this.C == 2 && !a.this.f16408z) {
                            a.this.f16406x.cancel(downloadMessage);
                        }
                    }
                }
            } catch (Exception e2) {
                ad.b("CampaignDownLoadTask", e2.getMessage());
            }
        }
    };

    public a(Context context, CampaignEx campaignEx, String str, int i10) {
        File file;
        File file2;
        this.f16385b = 1;
        this.f16388e = 0;
        this.f16398o = 0L;
        int i11 = 100;
        this.G = false;
        if (context == null && campaignEx == null) {
            return;
        }
        com.mbridge.msdk.c.g a = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        if (a != null) {
            this.G = a.aD();
        }
        this.D = com.mbridge.msdk.foundation.same.a.u;
        this.E = com.mbridge.msdk.foundation.same.a.f13290v;
        this.F = com.mbridge.msdk.foundation.same.a.f13289t;
        this.f16401r = System.currentTimeMillis();
        this.f16394k = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f16392i = campaignEx;
        this.f16393j = str;
        this.f16385b = i10;
        if (campaignEx != null) {
            this.f16396m = campaignEx.getVideoUrlEncode();
        }
        this.f16405w = ab.c(this.f16396m);
        this.f16397n = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_VC) + File.separator;
        this.f16399p = this.f16397n + this.f16405w;
        ad.c("CampaignDownLoadTask", this.f16392i.getAppName() + " videoLocalPath:" + this.f16399p + " videoUrl: " + this.f16392i.getVideoUrlEncode() + " " + this.f16402s);
        try {
            if (TextUtils.isEmpty(this.f16396m)) {
                return;
            }
            if (TextUtils.isEmpty(this.f16397n)) {
                file = null;
            } else {
                file = new File(this.f16397n);
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            if (file != null && file.exists() && ((file2 = this.B) == null || !file2.exists())) {
                File file3 = new File(file + "/.nomedia");
                this.B = file3;
                if (!file3.exists()) {
                    this.B.createNewFile();
                }
            }
            n a10 = n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            m a11 = a10.a(this.f16396m, "");
            if (a11 != null) {
                this.f16398o = a11.c();
                if (this.f16388e != 2) {
                    this.f16388e = a11.b();
                }
                if (this.f16388e == 1) {
                    this.f16388e = 2;
                }
                this.f16395l = a11.d();
                if (a11.a() > 0) {
                    this.f16401r = a11.a();
                }
                if (this.f16388e == 5) {
                    if (Objects.exists(new File(this.f16397n + this.f16405w), this.f16397n, this.f16405w)) {
                        this.f16399p = this.f16397n + this.f16405w;
                    } else {
                        u();
                    }
                } else if (this.f16388e != 0) {
                    this.f16399p = this.f16397n + this.f16405w;
                }
            } else {
                a10.a(this.f16396m, this.f16401r);
            }
            try {
                long j3 = this.f16395l;
                if (j3 > 0 && this.f16398o * 100 >= j3 * b(this.f16392i) && (b(this.f16392i) == 100 || this.f16388e == 5)) {
                    com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar.a("cache", 1);
                    a(this.f16392i, dVar);
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
            String str2 = this.f16396m;
            if (TextUtils.isEmpty(str2)) {
                this.f16391h.a("VideoUrl is NULL, Please check it.", "");
                return;
            }
            if (this.f16388e == 1) {
                ad.a("CampaignDownLoadTask", "Run : Task is RUNNING, Will return.");
                return;
            }
            if (this.f16388e == 5 && Utils.getDownloadRate(this.f16395l, this.f16398o) >= this.f16402s) {
                ad.a("CampaignDownLoadTask", "Run : Video Done, Will callback.");
                com.mbridge.msdk.videocommon.listener.a aVar = this.f16390g;
                if (aVar != null) {
                    aVar.a(this.f16396m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f16391h;
                if (aVar2 != null) {
                    aVar2.a(this.f16396m);
                }
                try {
                    File file4 = new File(this.f16399p);
                    if (Objects.exists(file4, this.f16397n, this.f16405w) && file4.isFile()) {
                        file4.setLastModified(System.currentTimeMillis());
                    }
                } catch (Exception e10) {
                    ad.b("CampaignDownLoadTask", e10.getMessage());
                }
                com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar2.a("cache", 1);
                a(this.f16392i, dVar2);
                return;
            }
            if (this.f16385b == 3) {
                ad.a("CampaignDownLoadTask", "Run : Dlnet is 3, Will callback.");
                a(0L, false, "");
                com.mbridge.msdk.foundation.same.report.d.d dVar3 = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar3.a("cache", 1);
                a(this.f16392i, dVar3);
                return;
            }
            try {
                i11 = b(this.f16392i);
            } catch (Exception unused) {
            }
            c(i11);
            if (i11 == 0) {
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f16390g;
                if (aVar3 != null) {
                    aVar3.a(this.f16396m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar4 = this.f16391h;
                if (aVar4 != null) {
                    aVar4.a(this.f16396m);
                }
            }
            DownloadMessage downloadMessage = new DownloadMessage(this.f16392i, str2, this.f16405w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
            downloadMessage.setUseCronetDownload(e(this.f16392i));
            downloadMessage.addExtra("resource_type", 4);
            this.f16406x = a(downloadMessage, this.R, this.S, "1");
        } catch (Exception e11) {
            ad.c("CampaignDownLoadTask", e11.getMessage());
        }
    }

    private void u() {
        if (this.u == null) {
            this.u = n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        }
        try {
            try {
                this.u.b(this.f16396m);
                if (!af.a().a("r_d_v_b_l", true)) {
                    File file = new File(this.f16399p);
                    if (file.exists() && file.isFile()) {
                        file.delete();
                    }
                }
            } finally {
                this.f16388e = 0;
            }
        } catch (Throwable unused) {
            ad.b("CampaignDownLoadTask", "del DB or file failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        try {
            String str = com.mbridge.msdk.reward.b.a.f14951b;
            com.mbridge.msdk.reward.b.a.class.getMethod("insertExcludeId", String.class, CampaignEx.class).invoke(com.mbridge.msdk.reward.b.a.class.newInstance(), this.f16393j, this.f16392i);
            Map<String, Long> map = NativeController.f13928b;
            NativeController.class.getMethod("insertExcludeId", String.class, CampaignEx.class).invoke(NativeController.class.newInstance(), this.f16393j, this.f16392i);
        } catch (Exception e2) {
            ad.b("CampaignDownLoadTask", e2.getMessage());
        }
    }

    public final void c(int i10) {
        com.applovin.impl.mediation.ads.e.y("set ready rate: ", i10, "CampaignDownLoadTask");
        this.f16402s = i10;
    }

    public final void o() {
        ad.b("CampaignDownLoadTask", "start()");
        try {
            if (TextUtils.isEmpty(this.f16396m)) {
                return;
            }
            if (this.f16396m != null) {
                ad.b("CampaignDownLoadTask", new URL(this.f16396m).getPath());
            }
            if (this.f16402s == 0 && this.C == 2) {
                ad.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                return;
            }
            DownloadRequest downloadRequest = this.f16406x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f16390g;
            if (aVar != null) {
                aVar.a("VideoUrl is not illegal, Please check it.", "");
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f16391h;
            if (aVar2 != null) {
                aVar2.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public final void p() {
        if (this.Q) {
            return;
        }
        try {
            this.f16408z = true;
            if (this.C == 1) {
                ad.b("CampaignDownLoadTask", "Can not call resume(), because videoCtnType = " + this.C);
            } else {
                if (this.f16385b == 3) {
                    ad.b("CampaignDownLoadTask", "Can not call resume(), because dlnet = " + this.f16385b);
                    return;
                }
                ad.b("CampaignDownLoadTask", "resume()");
                this.O = false;
                this.P = false;
                DownloadMessage downloadMessage = new DownloadMessage(new Object(), this.f16396m, this.f16405w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
                downloadMessage.setUseCronetDownload(e(this.f16392i));
                DownloadRequest<?> a = a(downloadMessage, this.R, this.S, MBridgeConstans.API_REUQEST_CATEGORY_APP);
                this.f16406x = a;
                a.start();
            }
        } catch (Exception e2) {
            ad.b("CampaignDownLoadTask", e2.getMessage());
        }
    }

    public final String q() {
        String str = "";
        if (this.f16385b == 3) {
            return "";
        }
        String str2 = this.f16397n + this.f16405w;
        File file = new File(str2);
        try {
            if (Objects.exists(file, this.f16397n, this.f16405w)) {
                if (file.isFile()) {
                    if (file.canRead()) {
                        if (file.length() > 0) {
                            this.f16399p = str2;
                        } else {
                            str = "file length is 0 ";
                        }
                    } else {
                        str = "file can not read ";
                    }
                } else {
                    str = "file is not file ";
                }
            } else {
                str = "file is not exist ";
            }
        } catch (Throwable th2) {
            ad.b("CampaignDownLoadTask", th2.getMessage());
            str = th2.getMessage();
        }
        if (this.f16388e == 5 && !TextUtils.isEmpty(str)) {
            u();
        }
        return str;
    }

    public final void r() {
        if (this.f16389f != null) {
            this.f16389f = null;
        }
    }

    public final void s() {
        CampaignEx campaignEx;
        try {
            try {
                u();
                campaignEx = this.f16392i;
            } catch (Exception unused) {
                ad.b("CampaignDownLoadTask", "del file is failed");
            }
            if (campaignEx != null && campaignEx.getPlayable_ads_without_video() == 2) {
                return;
            }
            com.mbridge.msdk.videocommon.a.a a = com.mbridge.msdk.videocommon.a.a.a();
            if (a != null) {
                a.a(this.f16392i);
            }
        } finally {
            this.f16388e = 0;
        }
    }

    public final String t() {
        if (this.Q) {
            try {
                File file = new File(this.f16399p);
                if (file.exists() && file.isFile()) {
                    return this.f16399p;
                }
                return this.f16396m;
            } catch (Exception e2) {
                ad.b("CampaignDownLoadTask", e2.getMessage());
                return this.f16396m;
            }
        }
        try {
            File file2 = new File(this.f16399p);
            if (Objects.exists(file2, this.f16397n, this.f16405w) && file2.isFile()) {
                return this.f16399p;
            }
        } catch (Exception e10) {
            ad.b("CampaignDownLoadTask", e10.getMessage());
        }
        return this.f16396m;
    }

    public final void d(boolean z10) {
        this.N = z10;
    }

    public final String e() {
        return this.f16396m;
    }

    public final boolean f() {
        return this.f16404v;
    }

    public final long g() {
        return this.f16401r;
    }

    public final String h() {
        return this.f16399p;
    }

    public final boolean i() {
        return this.Q;
    }

    public final long j() {
        return this.f16395l;
    }

    public final int k() {
        return this.f16388e;
    }

    public final CampaignEx l() {
        return this.f16392i;
    }

    public final long m() {
        return this.f16398o;
    }

    public final void n() {
        ad.b("CampaignDownLoadTask", "startForLoadRefactor()");
        try {
            if (TextUtils.isEmpty(this.f16396m)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f16390g;
                if (aVar != null) {
                    aVar.a(this.f16396m);
                    return;
                }
                return;
            }
            if (this.f16396m != null) {
                ad.b("CampaignDownLoadTask", new URL(this.f16396m).getPath());
            }
            if (this.f16385b == 3) {
                ad.b("CampaignDownLoadTask", "startForLoadRefactor: Dlnet is 3, Will callback.");
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f16390g;
                if (aVar2 != null) {
                    aVar2.a(this.f16396m);
                    return;
                }
                return;
            }
            if (this.f16402s == 0 && this.C == 2) {
                ad.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f16390g;
                if (aVar3 != null) {
                    aVar3.a(this.f16396m);
                    return;
                }
                return;
            }
            try {
                if (this.f16388e == 5 && Utils.getDownloadRate(this.f16395l, this.f16398o) >= this.f16402s) {
                    if (Objects.exists(new File(this.f16397n + this.f16405w), this.f16397n, this.f16405w)) {
                        this.f16399p = this.f16397n + this.f16405w;
                        com.mbridge.msdk.videocommon.listener.a aVar4 = this.f16390g;
                        if (aVar4 != null) {
                            aVar4.a(this.f16396m);
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e2) {
                com.applovin.impl.mediation.ads.e.p(e2, new StringBuilder("startForLoadRefactor: "), "CampaignDownLoadTask");
            }
            DownloadRequest downloadRequest = this.f16406x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar5 = this.f16390g;
            if (aVar5 != null) {
                aVar5.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public final boolean d() {
        return this.N;
    }

    public final void e(boolean z10) {
        this.f16404v = z10;
    }

    public final void f(boolean z10) {
        this.f16400q = z10;
    }

    public final void b(boolean z10) {
        this.L = z10;
    }

    public final void d(int i10) {
        this.A = i10;
    }

    public final void e(int i10) {
        this.C = i10;
    }

    private int d(CampaignEx campaignEx) {
        try {
            k kVar = this.J;
            if (kVar != null) {
                return kVar.p();
            }
            return 100;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            ad.b("CampaignDownLoadTask", e2.getMessage());
            return 100;
        }
    }

    private int e(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 0;
        }
        try {
            if (campaignEx.getAabEntity() != null) {
                return campaignEx.getAabEntity().h3c;
            }
            return 0;
        } catch (Throwable th2) {
            ad.b("CampaignDownLoadTask", th2.getMessage());
            return 0;
        }
    }

    public final boolean b() {
        return this.L;
    }

    public final void b(int i10) {
        this.f16386c = i10;
    }

    private int b(CampaignEx campaignEx) {
        int c10;
        if (campaignEx == null) {
            return 100;
        }
        if (campaignEx.getReady_rate() != -1) {
            c10 = campaignEx.getReady_rate();
            com.applovin.impl.mediation.ads.e.y("ready_rate(campaign): ", c10, "CampaignDownLoadTask");
        } else {
            c10 = c(campaignEx);
            com.applovin.impl.mediation.ads.e.y("ready_rate(reward_unit_setting): ", c10, "CampaignDownLoadTask");
        }
        try {
            return Math.max(c10, 0);
        } catch (Exception unused) {
            return 100;
        }
    }

    public final void a(boolean z10) {
        this.K = z10;
    }

    public final boolean a() {
        return this.K;
    }

    public final void c(boolean z10) {
        this.M = z10;
    }

    public final void d(String str) {
        this.f16396m = str;
    }

    public final void a(int i10) {
        this.f16385b = i10;
    }

    public final boolean c() {
        return this.M;
    }

    private int c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 100;
        }
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.H == null) {
                    this.H = com.mbridge.msdk.c.h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.f16393j);
                }
                return this.H.p();
            }
            if (campaignEx.getAdType() == 42) {
                if (this.J == null) {
                    this.J = com.mbridge.msdk.c.h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f16393j);
                }
                return d((CampaignEx) null);
            }
            if (this.I == null) {
                this.I = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f16393j, false);
            }
            return this.I.r();
        } catch (Throwable th2) {
            ad.b("CampaignDownLoadTask", th2.getMessage(), th2);
            return 100;
        }
    }

    public final void a(int i10, int i11) {
        this.f16388e = i10;
        if (this.u == null) {
            this.u = n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        }
        this.u.a(this.f16396m, i11, i10);
    }

    public final void a(CampaignEx campaignEx) {
        this.f16392i = campaignEx;
    }

    private DownloadRequest<?> a(DownloadMessage downloadMessage, OnDownloadStateListener onDownloadStateListener, OnProgressStateListener onProgressStateListener, String str) {
        return MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(this.D).withConnectTimeout(this.F).withWriteTimeout(this.E).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(this.f16397n).withDownloadStateListener(onDownloadStateListener).withProgressStateListener(onProgressStateListener).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("do_us_fi_re", Boolean.toString(this.G)).with("download_scene", "download_video").with(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f16402s)).with("scenes", str).build();
    }

    public final void b(String str) {
        v();
        a(2, str, "");
        this.f16388e = 4;
    }

    public final void c(String str) {
        this.f16399p = str;
    }

    public final void b(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f16391h = aVar;
    }

    public final void a(long j3, boolean z10, String str) {
        n nVar;
        ad.b("CampaignDownLoadTask", "setStateToDone 下载完成  ： mProgressSize" + this.f16398o + "  progressSize " + j3 + "  " + this.f16407y + "%   FileSize : " + this.f16395l + "  " + this.f16392i.getAppName());
        if (this.f16402s == 100 && this.f16385b != 3 && j3 != this.f16395l && !z10) {
            File file = new File(this.f16399p);
            long length = Objects.exists(file, this.f16397n, this.f16405w) ? file.length() : 0L;
            StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("progressSize = ", j3, " fileSize = ");
            o10.append(this.f16395l);
            o10.append(" ");
            o10.append(z10);
            o10.append(" absFileSize = ");
            o10.append(length);
            ad.b("CampaignDownLoadTask", o10.toString());
            a("File size is not match witch download size.");
            return;
        }
        this.f16388e = 5;
        if (j3 == this.f16395l) {
            a(1, "", str);
        }
        long j10 = this.f16395l;
        if (j10 != 0 && (nVar = this.u) != null) {
            nVar.b(this.f16396m, j10);
        }
        this.a = false;
        a(j3, this.f16388e);
    }

    public final void a(String str) {
        com.mbridge.msdk.videocommon.listener.a aVar = this.f16390g;
        if (aVar != null) {
            aVar.a(str, this.f16396m);
        }
        com.mbridge.msdk.videocommon.listener.a aVar2 = this.f16391h;
        if (aVar2 != null) {
            aVar2.a(str, this.f16396m);
        }
        com.applovin.impl.mediation.ads.e.z("Video download stop : ", str, "CampaignDownLoadTask");
        if (this.f16388e == 4 || this.f16388e == 2 || this.f16388e == 5) {
            return;
        }
        this.f16388e = 4;
        CampaignEx campaignEx = this.f16392i;
        if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && this.f16392i.getRsIgnoreCheckRule().size() > 0 && this.f16392i.getRsIgnoreCheckRule().contains(0)) {
            ad.c("CampaignDownLoadTask", "Is not check video download status");
        } else {
            a(this.f16398o, this.f16388e);
        }
    }

    public final void a(c cVar) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f16389f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(cVar);
        }
    }

    public final void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f16390g = aVar;
    }

    private void a(long j3, int i10) {
        this.f16398o = j3;
        int i11 = this.f16402s;
        if (100 * j3 >= i11 * this.f16395l && !this.f16403t && i10 != 4) {
            if (i11 == 100 && i10 != 5) {
                this.f16388e = 5;
                return;
            }
            this.f16403t = true;
            ad.b("CampaignDownLoadTask", "UpdateListener : state: " + i10 + " progress : " + j3);
            String q10 = q();
            if (TextUtils.isEmpty(q10)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f16390g;
                if (aVar != null) {
                    aVar.a(this.f16396m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f16391h;
                if (aVar2 != null) {
                    aVar2.a(this.f16396m);
                }
            } else {
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f16390g;
                if (aVar3 != null) {
                    aVar3.a(vd.e.e("file is not effective ", q10), this.f16396m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar4 = this.f16391h;
                if (aVar4 != null) {
                    aVar4.a(vd.e.e("file is not effective ", q10), this.f16396m);
                }
            }
        }
        if (!this.a && j3 > 0) {
            this.a = true;
            if (this.u == null) {
                this.u = n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            }
            this.u.a(this.f16396m, j3, this.f16388e);
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f16389f;
        if (copyOnWriteArrayList != null) {
            Iterator<c> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next != null) {
                    next.a(j3, i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str, String str2) {
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n(this.f16394k, this.f16392i, i10, Long.toString(this.f16401r != 0 ? System.currentTimeMillis() - this.f16401r : 0L), this.f16395l, this.A);
        nVar.e(this.f16392i.getId());
        nVar.m(this.f16392i.getVideoUrlEncode());
        nVar.h(str);
        nVar.f(this.f16392i.getRequestId());
        nVar.s(this.f16392i.getCurrentLocalRid());
        nVar.g(this.f16392i.getRequestIdNotice());
        nVar.c(this.f16393j);
        nVar.t(str2);
        nVar.a(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f16402s));
        nVar.a("url", this.f16392i.getVideoUrlEncode());
        nVar.e(4);
        DownloadRequest downloadRequest = this.f16406x;
        if (downloadRequest != null) {
            nVar.a("scenes", downloadRequest.get("scenes", ""));
            nVar.a("resumed_breakpoint", this.f16406x.get("resumed_breakpoint", ""));
        }
        int i11 = this.A;
        if (i11 == 94 || i11 == 287) {
            return;
        }
        o.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        if (this.O || campaignEx == null || dVar == null) {
            return;
        }
        this.O = true;
        try {
            dVar.a("resource_type", 4);
            DownloadRequest downloadRequest = this.f16406x;
            if (downloadRequest != null) {
                dVar.a("scenes", downloadRequest.get("scenes", "1"));
                dVar.a("resumed_breakpoint", this.f16406x.get("resumed_breakpoint", MBridgeConstans.API_REUQEST_CATEGORY_APP));
            } else {
                dVar.a("scenes", "1");
                dVar.a("resumed_breakpoint", "1");
            }
            dVar.a("url", campaignEx.getVideoUrlEncode());
            dVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(this.f16402s));
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", campaignEx, dVar);
        } catch (Exception e2) {
            ad.b("CampaignDownLoadTask", e2.getMessage());
        }
    }

    public static /* synthetic */ void a(a aVar, int i10, boolean z10, String str) {
        if (aVar.P) {
            return;
        }
        try {
            aVar.P = true;
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            DownloadRequest downloadRequest = aVar.f16406x;
            if (downloadRequest != null) {
                dVar.a("scenes", downloadRequest.get("scenes", ""));
                dVar.a("url", aVar.f16396m);
                dVar.a("resumed_breakpoint", aVar.f16406x.get("resumed_breakpoint", ""));
                dVar.a("h3c", "");
            }
            dVar.a("resource_type", 4);
            dVar.a("file_size", Long.valueOf(aVar.f16395l));
            dVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(aVar.f16402s));
            dVar.a("result", Integer.valueOf(i10));
            dVar.a("reason", str);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_end", aVar.f16392i, dVar);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }
}

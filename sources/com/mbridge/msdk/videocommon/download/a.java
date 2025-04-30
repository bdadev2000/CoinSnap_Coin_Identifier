package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.L;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.c.k;
import com.mbridge.msdk.foundation.db.n;
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
import com.mbridge.msdk.foundation.entity.o;
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
import x0.AbstractC2914a;
import y.AbstractC2933a;

/* loaded from: classes3.dex */
public final class a implements Serializable {

    /* renamed from: A, reason: collision with root package name */
    private int f19395A;

    /* renamed from: B, reason: collision with root package name */
    private File f19396B;

    /* renamed from: D, reason: collision with root package name */
    private int f19398D;

    /* renamed from: E, reason: collision with root package name */
    private int f19399E;

    /* renamed from: F, reason: collision with root package name */
    private int f19400F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f19401G;

    /* renamed from: H, reason: collision with root package name */
    private k f19402H;

    /* renamed from: I, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.d.c f19403I;

    /* renamed from: J, reason: collision with root package name */
    private k f19404J;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f19414c;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f19416e;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f19418g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f19419h;

    /* renamed from: i, reason: collision with root package name */
    private CampaignEx f19420i;

    /* renamed from: j, reason: collision with root package name */
    private String f19421j;

    /* renamed from: k, reason: collision with root package name */
    private Context f19422k;
    private long l;
    private String m;

    /* renamed from: n, reason: collision with root package name */
    private String f19423n;

    /* renamed from: o, reason: collision with root package name */
    private long f19424o;

    /* renamed from: p, reason: collision with root package name */
    private String f19425p;

    /* renamed from: r, reason: collision with root package name */
    private long f19427r;

    /* renamed from: u, reason: collision with root package name */
    private n f19430u;

    /* renamed from: w, reason: collision with root package name */
    private String f19432w;

    /* renamed from: x, reason: collision with root package name */
    private DownloadRequest f19433x;

    /* renamed from: y, reason: collision with root package name */
    private int f19434y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f19435z;

    /* renamed from: a, reason: collision with root package name */
    private boolean f19413a = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19415d = false;

    /* renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<c> f19417f = new CopyOnWriteArrayList<>();

    /* renamed from: q, reason: collision with root package name */
    private boolean f19426q = false;

    /* renamed from: s, reason: collision with root package name */
    private int f19428s = 100;

    /* renamed from: t, reason: collision with root package name */
    private boolean f19429t = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f19431v = false;

    /* renamed from: C, reason: collision with root package name */
    private int f19397C = 1;

    /* renamed from: K, reason: collision with root package name */
    private boolean f19405K = false;

    /* renamed from: L, reason: collision with root package name */
    private boolean f19406L = false;

    /* renamed from: M, reason: collision with root package name */
    private boolean f19407M = false;

    /* renamed from: N, reason: collision with root package name */
    private boolean f19408N = false;
    private boolean O = false;

    /* renamed from: P, reason: collision with root package name */
    private boolean f19409P = false;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f19410Q = false;

    /* renamed from: R, reason: collision with root package name */
    private OnDownloadStateListener f19411R = new OnDownloadStateListener() { // from class: com.mbridge.msdk.videocommon.download.a.1
        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                ad.b("CampaignDownLoadTask", "onDownloadComplete callback : " + a.this.f19424o + "    " + a.this.l);
                if (a.this.f19430u == null) {
                    a.this.f19430u = n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
                }
                a.this.f19430u.a(a.this.m, a.this.f19424o, 5);
                if (downloadMessage != null) {
                    try {
                        str = (String) downloadMessage.getExtra("responseHeaders");
                    } catch (Throwable th) {
                        ad.b("CampaignDownLoadTask", th.getMessage());
                    }
                    a aVar = a.this;
                    aVar.a(aVar.f19424o, true, str);
                    a.this.f19430u.a(a.this.m, a.this.f19424o, 5);
                    a aVar2 = a.this;
                    aVar2.a(aVar2.f19424o, true, "");
                    a.a(a.this, 1, true, "");
                }
                str = "";
                a aVar3 = a.this;
                aVar3.a(aVar3.f19424o, true, str);
                a.this.f19430u.a(a.this.m, a.this.f19424o, 5);
                a aVar22 = a.this;
                aVar22.a(aVar22.f19424o, true, "");
                a.a(a.this, 1, true, "");
            } catch (Exception e4) {
                ad.b("CampaignDownLoadTask", e4.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            String str;
            if (a.this.f19433x != null && a.this.f19433x.getStatus() != DownloadStatus.CANCELLED) {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("cache", a.this.f19433x.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP));
                a aVar = a.this;
                aVar.a(aVar.f19420i, dVar);
                if (downloadError != null && downloadError.getException() != null) {
                    str = downloadError.getException().getMessage();
                } else {
                    str = "Video Download Error";
                }
                a.this.v();
                a.this.a(3, str, "");
                a.this.a(str);
                a aVar2 = a.this;
                a.a(aVar2, 3, aVar2.f19435z, str);
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public final void onDownloadStart(DownloadMessage downloadMessage) {
            a.this.f19416e = 1;
            if (a.this.f19430u == null) {
                a.this.f19430u = n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            }
            a.this.f19430u.a(a.this.f19420i, a.this.l, a.this.f19425p, a.this.f19416e);
        }
    };

    /* renamed from: S, reason: collision with root package name */
    private OnProgressStateListener f19412S = new OnProgressStateListener() { // from class: com.mbridge.msdk.videocommon.download.a.2
        @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
        public final void onProgress(DownloadMessage downloadMessage, DownloadProgress downloadProgress) {
            try {
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a("cache", a.this.f19433x.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP));
                a aVar = a.this;
                aVar.a(aVar.f19420i, dVar);
                a.this.f19424o = downloadProgress.getCurrent();
                a.this.l = downloadProgress.getTotal();
                a.this.f19434y = downloadProgress.getCurrentDownloadRate();
                if (a.this.f19428s != 100 && downloadProgress.getCurrentDownloadRate() >= a.this.f19428s) {
                    ad.b("CampaignDownLoadTask", "Rate : " + downloadProgress.getCurrentDownloadRate() + " ReadyRate & cdRate = " + a.this.f19428s + " " + a.this.f19414c);
                    if (!a.this.f19415d) {
                        a.this.f19415d = true;
                        if (!a.this.f19435z) {
                            a.a(a.this, 1, true, "");
                            a.this.a(downloadProgress.getCurrent(), false, "");
                        }
                        if (a.this.f19433x != null && a.this.f19397C == 2 && !a.this.f19435z) {
                            a.this.f19433x.cancel(downloadMessage);
                        }
                    }
                }
            } catch (Exception e4) {
                ad.b("CampaignDownLoadTask", e4.getMessage());
            }
        }
    };

    public a(Context context, CampaignEx campaignEx, String str, int i9) {
        File file;
        File file2;
        this.b = 1;
        this.f19416e = 0;
        this.f19424o = 0L;
        int i10 = 100;
        this.f19401G = false;
        if (context == null && campaignEx == null) {
            return;
        }
        com.mbridge.msdk.c.g a6 = com.mbridge.msdk.c.h.a().a(com.mbridge.msdk.foundation.controller.c.m().k());
        if (a6 != null) {
            this.f19401G = a6.aD();
        }
        this.f19398D = com.mbridge.msdk.foundation.same.a.f15693u;
        this.f19399E = com.mbridge.msdk.foundation.same.a.f15694v;
        this.f19400F = com.mbridge.msdk.foundation.same.a.f15692t;
        this.f19427r = System.currentTimeMillis();
        this.f19422k = com.mbridge.msdk.foundation.controller.c.m().c();
        this.f19420i = campaignEx;
        this.f19421j = str;
        this.b = i9;
        if (campaignEx != null) {
            this.m = campaignEx.getVideoUrlEncode();
        }
        this.f19432w = ab.c(this.m);
        this.f19423n = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_VC) + File.separator;
        this.f19425p = this.f19423n + this.f19432w;
        ad.c("CampaignDownLoadTask", this.f19420i.getAppName() + " videoLocalPath:" + this.f19425p + " videoUrl: " + this.f19420i.getVideoUrlEncode() + " " + this.f19428s);
        try {
            if (TextUtils.isEmpty(this.m)) {
                return;
            }
            if (TextUtils.isEmpty(this.f19423n)) {
                file = null;
            } else {
                file = new File(this.f19423n);
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            if (file != null && file.exists() && ((file2 = this.f19396B) == null || !file2.exists())) {
                File file3 = new File(file + "/.nomedia");
                this.f19396B = file3;
                if (!file3.exists()) {
                    this.f19396B.createNewFile();
                }
            }
            n a9 = n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            m a10 = a9.a(this.m, "");
            if (a10 != null) {
                this.f19424o = a10.c();
                if (this.f19416e != 2) {
                    this.f19416e = a10.b();
                }
                if (this.f19416e == 1) {
                    this.f19416e = 2;
                }
                this.l = a10.d();
                if (a10.a() > 0) {
                    this.f19427r = a10.a();
                }
                if (this.f19416e == 5) {
                    if (Objects.exists(new File(this.f19423n + this.f19432w), this.f19423n, this.f19432w)) {
                        this.f19425p = this.f19423n + this.f19432w;
                    } else {
                        u();
                    }
                } else if (this.f19416e != 0) {
                    this.f19425p = this.f19423n + this.f19432w;
                }
            } else {
                a9.a(this.m, this.f19427r);
            }
            try {
                long j7 = this.l;
                if (j7 > 0) {
                    if (this.f19424o * 100 >= j7 * b(this.f19420i)) {
                        if (b(this.f19420i) != 100) {
                            if (this.f19416e == 5) {
                            }
                        }
                        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                        dVar.a("cache", 1);
                        a(this.f19420i, dVar);
                    }
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    e4.printStackTrace();
                }
            }
            String str2 = this.m;
            if (TextUtils.isEmpty(str2)) {
                this.f19419h.a("VideoUrl is NULL, Please check it.", "");
                return;
            }
            if (this.f19416e == 1) {
                ad.a("CampaignDownLoadTask", "Run : Task is RUNNING, Will return.");
                return;
            }
            if (this.f19416e == 5 && Utils.getDownloadRate(this.l, this.f19424o) >= this.f19428s) {
                ad.a("CampaignDownLoadTask", "Run : Video Done, Will callback.");
                com.mbridge.msdk.videocommon.listener.a aVar = this.f19418g;
                if (aVar != null) {
                    aVar.a(this.m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f19419h;
                if (aVar2 != null) {
                    aVar2.a(this.m);
                }
                try {
                    File file4 = new File(this.f19425p);
                    if (Objects.exists(file4, this.f19423n, this.f19432w) && file4.isFile()) {
                        file4.setLastModified(System.currentTimeMillis());
                    }
                } catch (Exception e9) {
                    ad.b("CampaignDownLoadTask", e9.getMessage());
                }
                com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar2.a("cache", 1);
                a(this.f19420i, dVar2);
                return;
            }
            if (this.b == 3) {
                ad.a("CampaignDownLoadTask", "Run : Dlnet is 3, Will callback.");
                a(0L, false, "");
                com.mbridge.msdk.foundation.same.report.d.d dVar3 = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar3.a("cache", 1);
                a(this.f19420i, dVar3);
                return;
            }
            try {
                i10 = b(this.f19420i);
            } catch (Exception unused) {
            }
            c(i10);
            if (i10 == 0) {
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f19418g;
                if (aVar3 != null) {
                    aVar3.a(this.m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar4 = this.f19419h;
                if (aVar4 != null) {
                    aVar4.a(this.m);
                }
            }
            DownloadMessage downloadMessage = new DownloadMessage(this.f19420i, str2, this.f19432w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
            downloadMessage.setUseCronetDownload(e(this.f19420i));
            downloadMessage.addExtra("resource_type", 4);
            this.f19433x = a(downloadMessage, this.f19411R, this.f19412S, "1");
        } catch (Exception e10) {
            ad.c("CampaignDownLoadTask", e10.getMessage());
        }
    }

    private void u() {
        if (this.f19430u == null) {
            this.f19430u = n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        }
        try {
            try {
                this.f19430u.b(this.m);
                if (!af.a().a("r_d_v_b_l", true)) {
                    File file = new File(this.f19425p);
                    if (file.exists() && file.isFile()) {
                        file.delete();
                    }
                }
            } finally {
                this.f19416e = 0;
            }
        } catch (Throwable unused) {
            ad.b("CampaignDownLoadTask", "del DB or file failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        try {
            String str = com.mbridge.msdk.reward.b.a.b;
            com.mbridge.msdk.reward.b.a.class.getMethod("insertExcludeId", String.class, CampaignEx.class).invoke(com.mbridge.msdk.reward.b.a.class.newInstance(), this.f19421j, this.f19420i);
            Map<String, Long> map = NativeController.b;
            NativeController.class.getMethod("insertExcludeId", String.class, CampaignEx.class).invoke(NativeController.class.newInstance(), this.f19421j, this.f19420i);
        } catch (Exception e4) {
            ad.b("CampaignDownLoadTask", e4.getMessage());
        }
    }

    public final void o() {
        ad.b("CampaignDownLoadTask", "start()");
        try {
            if (TextUtils.isEmpty(this.m)) {
                return;
            }
            if (this.m != null) {
                ad.b("CampaignDownLoadTask", new URL(this.m).getPath());
            }
            if (this.f19428s == 0 && this.f19397C == 2) {
                ad.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                return;
            }
            DownloadRequest downloadRequest = this.f19433x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f19418g;
            if (aVar != null) {
                aVar.a("VideoUrl is not illegal, Please check it.", "");
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f19419h;
            if (aVar2 != null) {
                aVar2.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public final void p() {
        if (this.f19410Q) {
            return;
        }
        try {
            this.f19435z = true;
            if (this.f19397C == 1) {
                ad.b("CampaignDownLoadTask", "Can not call resume(), because videoCtnType = " + this.f19397C);
            } else {
                if (this.b == 3) {
                    ad.b("CampaignDownLoadTask", "Can not call resume(), because dlnet = " + this.b);
                    return;
                }
                ad.b("CampaignDownLoadTask", "resume()");
                this.O = false;
                this.f19409P = false;
                DownloadMessage downloadMessage = new DownloadMessage(new Object(), this.m, this.f19432w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
                downloadMessage.setUseCronetDownload(e(this.f19420i));
                DownloadRequest<?> a6 = a(downloadMessage, this.f19411R, this.f19412S, MBridgeConstans.API_REUQEST_CATEGORY_APP);
                this.f19433x = a6;
                a6.start();
            }
        } catch (Exception e4) {
            ad.b("CampaignDownLoadTask", e4.getMessage());
        }
    }

    public final String q() {
        String str = "";
        if (this.b == 3) {
            return "";
        }
        String str2 = this.f19423n + this.f19432w;
        File file = new File(str2);
        try {
            if (Objects.exists(file, this.f19423n, this.f19432w)) {
                if (file.isFile()) {
                    if (file.canRead()) {
                        if (file.length() > 0) {
                            this.f19425p = str2;
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
        } catch (Throwable th) {
            ad.b("CampaignDownLoadTask", th.getMessage());
            str = th.getMessage();
        }
        if (this.f19416e == 5 && !TextUtils.isEmpty(str)) {
            u();
        }
        return str;
    }

    public final void r() {
        if (this.f19417f != null) {
            this.f19417f = null;
        }
    }

    public final void s() {
        CampaignEx campaignEx;
        try {
            try {
                u();
                campaignEx = this.f19420i;
            } catch (Exception unused) {
                ad.b("CampaignDownLoadTask", "del file is failed");
            }
            if (campaignEx != null && campaignEx.getPlayable_ads_without_video() == 2) {
                return;
            }
            com.mbridge.msdk.videocommon.a.a a6 = com.mbridge.msdk.videocommon.a.a.a();
            if (a6 != null) {
                a6.a(this.f19420i);
            }
        } finally {
            this.f19416e = 0;
        }
    }

    public final String t() {
        if (this.f19410Q) {
            try {
                File file = new File(this.f19425p);
                if (file.exists() && file.isFile()) {
                    return this.f19425p;
                }
                return this.m;
            } catch (Exception e4) {
                ad.b("CampaignDownLoadTask", e4.getMessage());
                return this.m;
            }
        }
        try {
            File file2 = new File(this.f19425p);
            if (Objects.exists(file2, this.f19423n, this.f19432w) && file2.isFile()) {
                return this.f19425p;
            }
        } catch (Exception e9) {
            ad.b("CampaignDownLoadTask", e9.getMessage());
        }
        return this.m;
    }

    public final void c(boolean z8) {
        this.f19407M = z8;
    }

    public final void d(boolean z8) {
        this.f19408N = z8;
    }

    public final String e() {
        return this.m;
    }

    public final boolean f() {
        return this.f19431v;
    }

    public final long g() {
        return this.f19427r;
    }

    public final String h() {
        return this.f19425p;
    }

    public final boolean i() {
        return this.f19410Q;
    }

    public final long j() {
        return this.l;
    }

    public final int k() {
        return this.f19416e;
    }

    public final CampaignEx l() {
        return this.f19420i;
    }

    public final long m() {
        return this.f19424o;
    }

    public final void n() {
        ad.b("CampaignDownLoadTask", "startForLoadRefactor()");
        try {
            if (TextUtils.isEmpty(this.m)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f19418g;
                if (aVar != null) {
                    aVar.a(this.m);
                    return;
                }
                return;
            }
            if (this.m != null) {
                ad.b("CampaignDownLoadTask", new URL(this.m).getPath());
            }
            if (this.b == 3) {
                ad.b("CampaignDownLoadTask", "startForLoadRefactor: Dlnet is 3, Will callback.");
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f19418g;
                if (aVar2 != null) {
                    aVar2.a(this.m);
                    return;
                }
                return;
            }
            if (this.f19428s == 0 && this.f19397C == 2) {
                ad.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f19418g;
                if (aVar3 != null) {
                    aVar3.a(this.m);
                    return;
                }
                return;
            }
            try {
                if (this.f19416e == 5 && Utils.getDownloadRate(this.l, this.f19424o) >= this.f19428s) {
                    if (Objects.exists(new File(this.f19423n + this.f19432w), this.f19423n, this.f19432w)) {
                        this.f19425p = this.f19423n + this.f19432w;
                        com.mbridge.msdk.videocommon.listener.a aVar4 = this.f19418g;
                        if (aVar4 != null) {
                            aVar4.a(this.m);
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e4) {
                L.s(e4, new StringBuilder("startForLoadRefactor: "), "CampaignDownLoadTask");
            }
            DownloadRequest downloadRequest = this.f19433x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar5 = this.f19418g;
            if (aVar5 != null) {
                aVar5.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public final boolean c() {
        return this.f19407M;
    }

    public final boolean d() {
        return this.f19408N;
    }

    public final void e(boolean z8) {
        this.f19431v = z8;
    }

    public final void f(boolean z8) {
        this.f19426q = z8;
    }

    public final void b(boolean z8) {
        this.f19406L = z8;
    }

    public final void c(int i9) {
        o.s(i9, "set ready rate: ", "CampaignDownLoadTask");
        this.f19428s = i9;
    }

    public final void d(int i9) {
        this.f19395A = i9;
    }

    public final void e(int i9) {
        this.f19397C = i9;
    }

    private int d(CampaignEx campaignEx) {
        try {
            k kVar = this.f19404J;
            if (kVar != null) {
                return kVar.p();
            }
            return 100;
        } catch (Exception e4) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            ad.b("CampaignDownLoadTask", e4.getMessage());
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
        } catch (Throwable th) {
            ad.b("CampaignDownLoadTask", th.getMessage());
            return 0;
        }
    }

    public final boolean b() {
        return this.f19406L;
    }

    public final void b(int i9) {
        this.f19414c = i9;
    }

    private int b(CampaignEx campaignEx) {
        int c9;
        if (campaignEx == null) {
            return 100;
        }
        if (campaignEx.getReady_rate() != -1) {
            c9 = campaignEx.getReady_rate();
            o.s(c9, "ready_rate(campaign): ", "CampaignDownLoadTask");
        } else {
            c9 = c(campaignEx);
            o.s(c9, "ready_rate(reward_unit_setting): ", "CampaignDownLoadTask");
        }
        try {
            return Math.max(c9, 0);
        } catch (Exception unused) {
            return 100;
        }
    }

    public final void a(boolean z8) {
        this.f19405K = z8;
    }

    public final boolean a() {
        return this.f19405K;
    }

    public final void d(String str) {
        this.m = str;
    }

    public final void a(int i9) {
        this.b = i9;
    }

    public final void a(int i9, int i10) {
        this.f19416e = i9;
        if (this.f19430u == null) {
            this.f19430u = n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
        }
        this.f19430u.a(this.m, i10, i9);
    }

    private int c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 100;
        }
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.f19402H == null) {
                    this.f19402H = com.mbridge.msdk.c.h.a().c(com.mbridge.msdk.foundation.controller.c.m().k(), this.f19421j);
                }
                return this.f19402H.p();
            }
            if (campaignEx.getAdType() == 42) {
                if (this.f19404J == null) {
                    this.f19404J = com.mbridge.msdk.c.h.a().d(com.mbridge.msdk.foundation.controller.c.m().k(), this.f19421j);
                }
                return d((CampaignEx) null);
            }
            if (this.f19403I == null) {
                this.f19403I = com.mbridge.msdk.videocommon.d.b.a().a(com.mbridge.msdk.foundation.controller.c.m().k(), this.f19421j, false);
            }
            return this.f19403I.r();
        } catch (Throwable th) {
            ad.b("CampaignDownLoadTask", th.getMessage(), th);
            return 100;
        }
    }

    public final void a(CampaignEx campaignEx) {
        this.f19420i = campaignEx;
    }

    private DownloadRequest<?> a(DownloadMessage downloadMessage, OnDownloadStateListener onDownloadStateListener, OnProgressStateListener onProgressStateListener, String str) {
        return MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(this.f19398D).withConnectTimeout(this.f19400F).withWriteTimeout(this.f19399E).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(this.f19423n).withDownloadStateListener(onDownloadStateListener).withProgressStateListener(onProgressStateListener).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("do_us_fi_re", Boolean.toString(this.f19401G)).with("download_scene", "download_video").with(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f19428s)).with("scenes", str).build();
    }

    public final void c(String str) {
        this.f19425p = str;
    }

    public final void b(String str) {
        v();
        a(2, str, "");
        this.f19416e = 4;
    }

    public final void b(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f19419h = aVar;
    }

    public final void a(long j7, boolean z8, String str) {
        n nVar;
        ad.b("CampaignDownLoadTask", "setStateToDone 下载完成  ： mProgressSize" + this.f19424o + "  progressSize " + j7 + "  " + this.f19434y + "%   FileSize : " + this.l + "  " + this.f19420i.getAppName());
        if (this.f19428s == 100 && this.b != 3 && j7 != this.l && !z8) {
            File file = new File(this.f19425p);
            long length = Objects.exists(file, this.f19423n, this.f19432w) ? file.length() : 0L;
            StringBuilder a6 = AbstractC2933a.a("progressSize = ", j7, " fileSize = ");
            a6.append(this.l);
            a6.append(" ");
            a6.append(z8);
            a6.append(" absFileSize = ");
            a6.append(length);
            ad.b("CampaignDownLoadTask", a6.toString());
            a("File size is not match witch download size.");
            return;
        }
        this.f19416e = 5;
        if (j7 == this.l) {
            a(1, "", str);
        }
        long j9 = this.l;
        if (j9 != 0 && (nVar = this.f19430u) != null) {
            nVar.b(this.m, j9);
        }
        this.f19413a = false;
        a(j7, this.f19416e);
    }

    public final void a(String str) {
        com.mbridge.msdk.videocommon.listener.a aVar = this.f19418g;
        if (aVar != null) {
            aVar.a(str, this.m);
        }
        com.mbridge.msdk.videocommon.listener.a aVar2 = this.f19419h;
        if (aVar2 != null) {
            aVar2.a(str, this.m);
        }
        L.B("Video download stop : ", str, "CampaignDownLoadTask");
        if (this.f19416e == 4 || this.f19416e == 2 || this.f19416e == 5) {
            return;
        }
        this.f19416e = 4;
        CampaignEx campaignEx = this.f19420i;
        if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && this.f19420i.getRsIgnoreCheckRule().size() > 0 && this.f19420i.getRsIgnoreCheckRule().contains(0)) {
            ad.c("CampaignDownLoadTask", "Is not check video download status");
        } else {
            a(this.f19424o, this.f19416e);
        }
    }

    public final void a(c cVar) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f19417f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(cVar);
        }
    }

    public final void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f19418g = aVar;
    }

    private void a(long j7, int i9) {
        this.f19424o = j7;
        int i10 = this.f19428s;
        if (100 * j7 >= i10 * this.l && !this.f19429t && i9 != 4) {
            if (i10 == 100 && i9 != 5) {
                this.f19416e = 5;
                return;
            }
            this.f19429t = true;
            ad.b("CampaignDownLoadTask", "UpdateListener : state: " + i9 + " progress : " + j7);
            String q9 = q();
            if (TextUtils.isEmpty(q9)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f19418g;
                if (aVar != null) {
                    aVar.a(this.m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f19419h;
                if (aVar2 != null) {
                    aVar2.a(this.m);
                }
            } else {
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f19418g;
                if (aVar3 != null) {
                    aVar3.a(AbstractC2914a.d("file is not effective ", q9), this.m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar4 = this.f19419h;
                if (aVar4 != null) {
                    aVar4.a(AbstractC2914a.d("file is not effective ", q9), this.m);
                }
            }
        }
        if (!this.f19413a && j7 > 0) {
            this.f19413a = true;
            if (this.f19430u == null) {
                this.f19430u = n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c()));
            }
            this.f19430u.a(this.m, j7, this.f19416e);
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f19417f;
        if (copyOnWriteArrayList != null) {
            Iterator<c> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next != null) {
                    next.a(j7, i9);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i9, String str, String str2) {
        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n(this.f19422k, this.f19420i, i9, Long.toString(this.f19427r != 0 ? System.currentTimeMillis() - this.f19427r : 0L), this.l, this.f19395A);
        nVar.e(this.f19420i.getId());
        nVar.m(this.f19420i.getVideoUrlEncode());
        nVar.h(str);
        nVar.f(this.f19420i.getRequestId());
        nVar.s(this.f19420i.getCurrentLocalRid());
        nVar.g(this.f19420i.getRequestIdNotice());
        nVar.c(this.f19421j);
        nVar.t(str2);
        nVar.a(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f19428s));
        nVar.a("url", this.f19420i.getVideoUrlEncode());
        nVar.e(4);
        DownloadRequest downloadRequest = this.f19433x;
        if (downloadRequest != null) {
            nVar.a("scenes", downloadRequest.get("scenes", ""));
            nVar.a("resumed_breakpoint", this.f19433x.get("resumed_breakpoint", ""));
        }
        int i10 = this.f19395A;
        if (i10 == 94 || i10 == 287) {
            return;
        }
        com.mbridge.msdk.foundation.db.o.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.d.d dVar) {
        if (this.O || campaignEx == null || dVar == null) {
            return;
        }
        this.O = true;
        try {
            dVar.a("resource_type", 4);
            DownloadRequest downloadRequest = this.f19433x;
            if (downloadRequest != null) {
                dVar.a("scenes", downloadRequest.get("scenes", "1"));
                dVar.a("resumed_breakpoint", this.f19433x.get("resumed_breakpoint", MBridgeConstans.API_REUQEST_CATEGORY_APP));
            } else {
                dVar.a("scenes", "1");
                dVar.a("resumed_breakpoint", "1");
            }
            dVar.a("url", campaignEx.getVideoUrlEncode());
            dVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(this.f19428s));
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_start", campaignEx, dVar);
        } catch (Exception e4) {
            ad.b("CampaignDownLoadTask", e4.getMessage());
        }
    }

    public static /* synthetic */ void a(a aVar, int i9, boolean z8, String str) {
        if (aVar.f19409P) {
            return;
        }
        try {
            aVar.f19409P = true;
            com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
            DownloadRequest downloadRequest = aVar.f19433x;
            if (downloadRequest != null) {
                dVar.a("scenes", downloadRequest.get("scenes", ""));
                dVar.a("url", aVar.m);
                dVar.a("resumed_breakpoint", aVar.f19433x.get("resumed_breakpoint", ""));
                dVar.a("h3c", "");
            }
            dVar.a("resource_type", 4);
            dVar.a("file_size", Long.valueOf(aVar.l));
            dVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(aVar.f19428s));
            dVar.a("result", Integer.valueOf(i9));
            dVar.a("reason", str);
            com.mbridge.msdk.foundation.same.report.d.c.a().a("m_download_end", aVar.f19420i, dVar);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }
}

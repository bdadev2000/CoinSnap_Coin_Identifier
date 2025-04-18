package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.File;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class y extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0185a {
    private final com.mbridge.msdk.newreward.function.d.a.b a;

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.a f14629b;

    /* renamed from: c, reason: collision with root package name */
    private final n f14630c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14631d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14632e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14633f;

    /* renamed from: g, reason: collision with root package name */
    private DownloadMessage f14634g;

    /* renamed from: i, reason: collision with root package name */
    private int f14636i;

    /* renamed from: j, reason: collision with root package name */
    private DownloadRequest f14637j;

    /* renamed from: k, reason: collision with root package name */
    private String f14638k;

    /* renamed from: l, reason: collision with root package name */
    private x f14639l;

    /* renamed from: m, reason: collision with root package name */
    private String f14640m;

    /* renamed from: o, reason: collision with root package name */
    private boolean f14642o;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14635h = false;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f14641n = false;

    public y(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, n nVar, int i10) {
        this.f14642o = false;
        this.a = bVar;
        this.f14629b = aVar;
        this.f14630c = nVar;
        this.f14636i = i10;
        String j3 = nVar.j();
        this.f14631d = j3;
        String str = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_VC) + File.separator;
        this.f14632e = str;
        String a = com.mbridge.msdk.newreward.function.h.a.a(j3);
        this.f14633f = a;
        this.f14640m = eb.j.k(str, a);
        nVar.a(new File(this.f14640m));
        nVar.a(true);
        File file = new File(this.f14640m);
        if (file.exists() && file.isFile()) {
            this.f14642o = true;
            nVar.a(1);
            nVar.b(true);
            nVar.a(false);
        }
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i10, x xVar) {
        int i11;
        this.f14639l = xVar;
        if (TextUtils.isEmpty(this.f14631d)) {
            if (this.f14630c.c()) {
                x xVar2 = this.f14639l;
                if (xVar2 != null) {
                    xVar2.a(this.a, this.f14629b, this);
                    this.f14639l.b(this.a, this.f14629b, this);
                    return;
                }
                return;
            }
            x xVar3 = this.f14639l;
            if (xVar3 != null) {
                xVar3.a(this.a, this.f14629b, this);
                this.f14639l.a(this.a, this.f14629b, this, new MBridgeError(5, MBridgeError.ERROR_MESSAGE_DOWNLOAD_RESOURCE_URL_ERROR));
                return;
            }
            return;
        }
        if (this.f14642o) {
            x xVar4 = this.f14639l;
            if (xVar4 != null) {
                xVar4.a(this.a, this.f14629b, this);
                this.f14639l.b(this.a, this.f14629b, this);
                return;
            }
            return;
        }
        this.f14641n = false;
        int v10 = this.a.v();
        this.f14638k = UUID.randomUUID().toString();
        int videoCtnType = this.f14629b.g().getVideoCtnType();
        if (i10 == 1 || (i11 = this.f14636i) == 100) {
            this.f14635h = false;
            this.f14634g = new DownloadMessage(this.a, this.f14631d, this.f14633f, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        } else if (videoCtnType == 1) {
            this.f14635h = false;
            this.f14634g = new DownloadMessage(this.a, this.f14631d, this.f14633f, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        } else {
            this.f14635h = true;
            this.f14634g = new DownloadMessage(this.a, this.f14631d, this.f14633f, i11, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f14638k, v10, this);
        DownloadRequest build = MBDownloadManager.getInstance().download(this.f14634g).withReadTimeout(10000L).withConnectTimeout(10000L).withWriteTimeout(10000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.f14632e).withDownloadStateListener(this).withProgressStateListener(this).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("download_scene", "download_video").with("do_us_fi_re", Boolean.toString(true)).build();
        this.f14637j = build;
        build.start();
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload taskID: " + this.f14638k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f14638k);
        if (this.f14641n) {
            x xVar = this.f14639l;
            if (xVar != null) {
                xVar.b(this.a, this.f14629b, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
                return;
            }
            return;
        }
        x xVar2 = this.f14639l;
        if (xVar2 != null) {
            xVar2.a(this.a, this.f14629b, this, new MBridgeError(2, MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        int i10;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadComplete taskID: " + this.f14638k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f14638k);
        String str = this.f14637j.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
        n nVar = this.f14630c;
        int i11 = 2;
        if (TextUtils.equals(str, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        nVar.a(i10);
        this.f14630c.b(true);
        this.f14630c.a(false);
        n nVar2 = this.f14630c;
        if (!TextUtils.equals(this.f14637j.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP), MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            i11 = 1;
        }
        nVar2.a(i11);
        x xVar = this.f14639l;
        if (xVar != null) {
            xVar.b(this.a, this.f14629b, this);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        int i10;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadError taskID: " + this.f14638k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f14638k);
        String str = this.f14637j.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
        n nVar = this.f14630c;
        if (TextUtils.equals(str, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        nVar.a(i10);
        this.f14630c.b(false);
        this.f14630c.a(false);
        MBridgeError mBridgeError = new MBridgeError(2, MBridgeError.ERROR_MESSAGE_DOWNLOAD_VIDEO_ERROR);
        mBridgeError.setException(downloadError.getException());
        x xVar = this.f14639l;
        if (xVar != null) {
            xVar.a(this.a, this.f14629b, this, mBridgeError);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadStart taskID: " + this.f14638k);
        }
        x xVar = this.f14639l;
        if (xVar != null) {
            xVar.a(this.a, this.f14629b, this);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public final void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
        int i10;
        if (downloadProgress.getCurrentDownloadRate() >= this.f14636i) {
            String str = this.f14637j.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
            n nVar = this.f14630c;
            if (TextUtils.equals(str, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            nVar.a(i10);
            this.f14630c.b(true);
            this.f14630c.a(false);
            if (this.f14635h) {
                this.f14637j.cancel(downloadMessage);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0185a
    public final void a(String str, long j3) {
        if (MBridgeConstans.DEBUG) {
            com.applovin.impl.mediation.ads.e.A("onTimeout taskID: ", str, "MBridgeDownloader");
        }
        if (this.f14637j != null) {
            this.f14641n = true;
            this.f14637j.cancel(this.f14634g);
        }
    }
}

package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;
import com.applovin.impl.L;
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

/* loaded from: classes3.dex */
public final class y extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0173a {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.b f17256a;
    private final com.mbridge.msdk.newreward.function.d.a.a b;

    /* renamed from: c, reason: collision with root package name */
    private final n f17257c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17258d;

    /* renamed from: e, reason: collision with root package name */
    private final String f17259e;

    /* renamed from: f, reason: collision with root package name */
    private final String f17260f;

    /* renamed from: g, reason: collision with root package name */
    private DownloadMessage f17261g;

    /* renamed from: i, reason: collision with root package name */
    private int f17263i;

    /* renamed from: j, reason: collision with root package name */
    private DownloadRequest f17264j;

    /* renamed from: k, reason: collision with root package name */
    private String f17265k;
    private x l;
    private String m;

    /* renamed from: o, reason: collision with root package name */
    private boolean f17267o;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17262h = false;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f17266n = false;

    public y(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, n nVar, int i9) {
        this.f17267o = false;
        this.f17256a = bVar;
        this.b = aVar;
        this.f17257c = nVar;
        this.f17263i = i9;
        String j7 = nVar.j();
        this.f17258d = j7;
        String str = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_VC) + File.separator;
        this.f17259e = str;
        String a6 = com.mbridge.msdk.newreward.function.h.a.a(j7);
        this.f17260f = a6;
        this.m = com.mbridge.msdk.foundation.entity.o.j(str, a6);
        nVar.a(new File(this.m));
        nVar.a(true);
        File file = new File(this.m);
        if (file.exists() && file.isFile()) {
            this.f17267o = true;
            nVar.a(1);
            nVar.b(true);
            nVar.a(false);
        }
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i9, x xVar) {
        int i10;
        this.l = xVar;
        if (TextUtils.isEmpty(this.f17258d)) {
            if (this.f17257c.c()) {
                x xVar2 = this.l;
                if (xVar2 != null) {
                    xVar2.a(this.f17256a, this.b, this);
                    this.l.b(this.f17256a, this.b, this);
                    return;
                }
                return;
            }
            x xVar3 = this.l;
            if (xVar3 != null) {
                xVar3.a(this.f17256a, this.b, this);
                this.l.a(this.f17256a, this.b, this, new MBridgeError(5, MBridgeError.ERROR_MESSAGE_DOWNLOAD_RESOURCE_URL_ERROR));
                return;
            }
            return;
        }
        if (this.f17267o) {
            x xVar4 = this.l;
            if (xVar4 != null) {
                xVar4.a(this.f17256a, this.b, this);
                this.l.b(this.f17256a, this.b, this);
                return;
            }
            return;
        }
        this.f17266n = false;
        int v6 = this.f17256a.v();
        this.f17265k = UUID.randomUUID().toString();
        int videoCtnType = this.b.g().getVideoCtnType();
        if (i9 == 1 || (i10 = this.f17263i) == 100) {
            this.f17262h = false;
            this.f17261g = new DownloadMessage(this.f17256a, this.f17258d, this.f17260f, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        } else if (videoCtnType == 1) {
            this.f17262h = false;
            this.f17261g = new DownloadMessage(this.f17256a, this.f17258d, this.f17260f, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        } else {
            this.f17262h = true;
            this.f17261g = new DownloadMessage(this.f17256a, this.f17258d, this.f17260f, i10, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f17265k, v6, this);
        DownloadRequest build = MBDownloadManager.getInstance().download(this.f17261g).withReadTimeout(10000L).withConnectTimeout(10000L).withWriteTimeout(10000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.f17259e).withDownloadStateListener(this).withProgressStateListener(this).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("download_scene", "download_video").with("do_us_fi_re", Boolean.toString(true)).build();
        this.f17264j = build;
        build.start();
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload taskID: " + this.f17265k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f17265k);
        if (this.f17266n) {
            x xVar = this.l;
            if (xVar != null) {
                xVar.b(this.f17256a, this.b, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
                return;
            }
            return;
        }
        x xVar2 = this.l;
        if (xVar2 != null) {
            xVar2.a(this.f17256a, this.b, this, new MBridgeError(2, MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        int i9;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadComplete taskID: " + this.f17265k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f17265k);
        String str = this.f17264j.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
        n nVar = this.f17257c;
        int i10 = 2;
        if (TextUtils.equals(str, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            i9 = 2;
        } else {
            i9 = 1;
        }
        nVar.a(i9);
        this.f17257c.b(true);
        this.f17257c.a(false);
        n nVar2 = this.f17257c;
        if (!TextUtils.equals(this.f17264j.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP), MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            i10 = 1;
        }
        nVar2.a(i10);
        x xVar = this.l;
        if (xVar != null) {
            xVar.b(this.f17256a, this.b, this);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        int i9;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadError taskID: " + this.f17265k);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f17265k);
        String str = this.f17264j.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
        n nVar = this.f17257c;
        if (TextUtils.equals(str, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            i9 = 2;
        } else {
            i9 = 1;
        }
        nVar.a(i9);
        this.f17257c.b(false);
        this.f17257c.a(false);
        MBridgeError mBridgeError = new MBridgeError(2, MBridgeError.ERROR_MESSAGE_DOWNLOAD_VIDEO_ERROR);
        mBridgeError.setException(downloadError.getException());
        x xVar = this.l;
        if (xVar != null) {
            xVar.a(this.f17256a, this.b, this, mBridgeError);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadStart taskID: " + this.f17265k);
        }
        x xVar = this.l;
        if (xVar != null) {
            xVar.a(this.f17256a, this.b, this);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public final void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
        int i9;
        if (downloadProgress.getCurrentDownloadRate() >= this.f17263i) {
            String str = this.f17264j.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
            n nVar = this.f17257c;
            if (TextUtils.equals(str, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                i9 = 2;
            } else {
                i9 = 1;
            }
            nVar.a(i9);
            this.f17257c.b(true);
            this.f17257c.a(false);
            if (this.f17262h) {
                this.f17264j.cancel(downloadMessage);
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0173a
    public final void a(String str, long j7) {
        if (MBridgeConstans.DEBUG) {
            L.C("onTimeout taskID: ", str, "MBridgeDownloader");
        }
        if (this.f17264j != null) {
            this.f17266n = true;
            this.f17264j.cancel(this.f17261g);
        }
    }
}

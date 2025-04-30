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
import com.mbridge.msdk.foundation.download.core.RequestBuilder;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ao;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.UUID;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class v extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0173a {

    /* renamed from: a, reason: collision with root package name */
    private final String f17243a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17244c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f17245d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.a f17246e;

    /* renamed from: f, reason: collision with root package name */
    private c f17247f;

    /* renamed from: g, reason: collision with root package name */
    private String f17248g;

    /* renamed from: h, reason: collision with root package name */
    private DownloadMessage f17249h;

    /* renamed from: i, reason: collision with root package name */
    private DownloadRequest f17250i;

    /* renamed from: j, reason: collision with root package name */
    private String f17251j;

    /* renamed from: k, reason: collision with root package name */
    private x f17252k;
    private boolean l;
    private String m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f17253n;

    public v(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, c cVar) {
        com.mbridge.msdk.foundation.same.b.c cVar2;
        String htmlContentFromUrl;
        boolean z8;
        this.l = false;
        this.f17253n = false;
        this.f17245d = bVar;
        this.f17246e = aVar;
        this.f17247f = cVar;
        String j7 = cVar.j();
        this.f17248g = j7;
        if (!TextUtils.isEmpty(j7)) {
            if (this.f17248g.contains(".zip") && this.f17248g.contains(ResourceManager.KEY_MD5FILENAME)) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.f17253n = z8;
        }
        if (this.f17253n) {
            cVar2 = com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES;
        } else {
            cVar2 = com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML;
        }
        String a6 = com.mbridge.msdk.foundation.same.b.e.a(cVar2);
        String md5 = SameMD5.getMD5(ao.b(this.f17248g));
        this.f17243a = md5;
        this.b = com.mbridge.msdk.foundation.entity.o.j(a6, "/");
        this.f17244c = com.mbridge.msdk.foundation.entity.o.k(a6, "/", md5);
        this.f17247f.a(true);
        if (this.f17253n) {
            htmlContentFromUrl = ResourceManager.getinstance().getResDirFromCampaign(this.f17248g);
        } else {
            htmlContentFromUrl = HTMLResourceManager.getInstance().getHtmlContentFromUrl(this.f17248g);
        }
        if (!TextUtils.isEmpty(htmlContentFromUrl)) {
            this.l = true;
            this.f17247f.a(1);
            this.f17247f.a(htmlContentFromUrl);
            this.f17247f.b(true);
            this.f17247f.a(false);
        }
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i9, x xVar) {
        StringBuilder sb;
        String str;
        String str2;
        String str3;
        this.f17252k = xVar;
        int v6 = this.f17245d.v();
        this.f17251j = UUID.randomUUID().toString();
        if (xVar != null) {
            xVar.a(this.f17245d, this.f17246e, this);
        }
        if (this.l) {
            x xVar2 = this.f17252k;
            if (xVar2 != null) {
                xVar2.b(this.f17245d, this.f17246e, this);
                return;
            }
            return;
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f17251j, v6, this);
        if (this.f17253n) {
            sb = new StringBuilder();
            str = this.f17243a;
            str2 = ".zip";
        } else {
            sb = new StringBuilder();
            str = this.f17243a;
            str2 = ".html";
        }
        String h6 = AbstractC2914a.h(sb, str, str2);
        this.m = AbstractC2914a.h(new StringBuilder(), this.b, h6);
        this.f17249h = new DownloadMessage(this.f17245d, this.f17248g, h6, 100, this.f17253n ? DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP : DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_HTML);
        RequestBuilder withTimeout = MBDownloadManager.getInstance().download(this.f17249h).withReadTimeout(10000L).withConnectTimeout(10000L).withWriteTimeout(10000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.b).withDownloadStateListener(this).withProgressStateListener(this).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        c cVar = this.f17247f;
        if (cVar != null) {
            int h9 = cVar.h();
            if (h9 == 2) {
                str3 = "download_template";
            } else if (h9 == 3) {
                str3 = "download_big_template";
            } else if (h9 == 4) {
                str3 = "download_end_card";
            }
            DownloadRequest build = withTimeout.with("download_scene", str3).with("do_us_fi_re", Boolean.toString(true)).build();
            this.f17250i = build;
            build.start();
        }
        str3 = "un_known";
        DownloadRequest build2 = withTimeout.with("download_scene", str3).with("do_us_fi_re", Boolean.toString(true)).build();
        this.f17250i = build2;
        build2.start();
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        int i9;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload: " + downloadMessage);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f17251j);
        String str = this.f17250i.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
        c cVar = this.f17247f;
        if (TextUtils.equals(str, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            i9 = 2;
        } else {
            i9 = 1;
        }
        cVar.a(i9);
        this.f17247f.b(false);
        this.f17247f.a(false);
        if (this.f17247f.c()) {
            x xVar = this.f17252k;
            if (xVar != null) {
                xVar.b(this.f17245d, this.f17246e, this);
                return;
            }
            return;
        }
        x xVar2 = this.f17252k;
        if (xVar2 != null) {
            xVar2.a(this.f17245d, this.f17246e, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        x xVar;
        String htmlContentFromUrl;
        String str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadComplete: " + downloadMessage);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f17251j);
        Exception exc = null;
        try {
            try {
                if (this.f17253n) {
                    MBResourceManager.getInstance().unZip(this.m, this.f17244c);
                }
                if (this.f17253n) {
                    htmlContentFromUrl = ResourceManager.getinstance().getResDirFromCampaign(this.f17248g);
                } else {
                    htmlContentFromUrl = HTMLResourceManager.getInstance().getHtmlContentFromUrl(this.f17248g);
                }
                int i9 = 1;
                this.f17247f.b(true);
                this.f17247f.a(false);
                String str2 = this.f17250i.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
                c cVar = this.f17247f;
                if (TextUtils.equals(str2, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                    i9 = 2;
                }
                cVar.a(i9);
                this.f17247f.a(2);
                this.f17247f.a(htmlContentFromUrl);
            } catch (Exception e4) {
                exc = e4;
                if (MBridgeConstans.DEBUG) {
                    ad.a("MBridgeDownloader", "onDownloadComplete.unZip: " + exc.getMessage());
                }
                if (this.f17247f.c()) {
                    xVar = this.f17252k;
                    if (xVar == null) {
                        return;
                    }
                } else {
                    if (this.f17252k != null) {
                        this.f17252k.a(this.f17245d, this.f17246e, this, new MBridgeError(6, "unzip error:" + exc.getMessage()));
                        return;
                    }
                    return;
                }
            }
            if (this.f17247f.c()) {
                xVar = this.f17252k;
                if (xVar == null) {
                    return;
                }
                xVar.b(this.f17245d, this.f17246e, this);
                return;
            }
            x xVar2 = this.f17252k;
            if (xVar2 != null) {
                xVar2.a(this.f17245d, this.f17246e, this, new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR));
            }
        } catch (Throwable th) {
            if (this.f17247f.c()) {
                x xVar3 = this.f17252k;
                if (xVar3 != null) {
                    xVar3.b(this.f17245d, this.f17246e, this);
                }
            } else if (this.f17252k != null) {
                if (exc != null) {
                    str = "unzip error:" + exc.getMessage();
                }
                this.f17252k.a(this.f17245d, this.f17246e, this, new MBridgeError(6, str));
            }
            throw th;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        int i9;
        String str;
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f17251j);
        String str2 = this.f17250i.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
        c cVar = this.f17247f;
        if (TextUtils.equals(str2, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            i9 = 2;
        } else {
            i9 = 1;
        }
        cVar.a(i9);
        this.f17247f.b(false);
        this.f17247f.a(false);
        if (this.f17247f.c()) {
            x xVar = this.f17252k;
            if (xVar != null) {
                xVar.b(this.f17245d, this.f17246e, this);
                return;
            }
            return;
        }
        if (this.f17252k != null) {
            c cVar2 = this.f17247f;
            if (cVar2 != null) {
                int h6 = cVar2.h();
                if (h6 != 2) {
                    if (h6 != 3) {
                        if (h6 == 4) {
                            str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_EC_TEMPLATE_ERROR;
                        }
                    } else {
                        str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_BIG_TEMPLATE_ERROR;
                    }
                } else {
                    str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_VIDEO_TEMPLATE_ERROR;
                }
                MBridgeError mBridgeError = new MBridgeError(2, str);
                mBridgeError.setException(downloadError.getException());
                this.f17252k.a(this.f17245d, this.f17246e, this, mBridgeError);
            }
            str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR;
            MBridgeError mBridgeError2 = new MBridgeError(2, str);
            mBridgeError2.setException(downloadError.getException());
            this.f17252k.a(this.f17245d, this.f17246e, this, mBridgeError2);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public final void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0173a
    public final void a(String str, long j7) {
        if (MBridgeConstans.DEBUG) {
            L.C("onTimeout: ", str, "MBridgeDownloader");
        }
        DownloadRequest downloadRequest = this.f17250i;
        if (downloadRequest != null) {
            downloadRequest.cancel(this.f17249h);
        }
    }
}

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

/* loaded from: classes4.dex */
public final class v extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0185a {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14614b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14615c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f14616d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.a f14617e;

    /* renamed from: f, reason: collision with root package name */
    private c f14618f;

    /* renamed from: g, reason: collision with root package name */
    private String f14619g;

    /* renamed from: h, reason: collision with root package name */
    private DownloadMessage f14620h;

    /* renamed from: i, reason: collision with root package name */
    private DownloadRequest f14621i;

    /* renamed from: j, reason: collision with root package name */
    private String f14622j;

    /* renamed from: k, reason: collision with root package name */
    private x f14623k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14624l;

    /* renamed from: m, reason: collision with root package name */
    private String f14625m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f14626n;

    public v(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, c cVar) {
        com.mbridge.msdk.foundation.same.b.c cVar2;
        String htmlContentFromUrl;
        boolean z10;
        this.f14624l = false;
        this.f14626n = false;
        this.f14616d = bVar;
        this.f14617e = aVar;
        this.f14618f = cVar;
        String j3 = cVar.j();
        this.f14619g = j3;
        if (!TextUtils.isEmpty(j3)) {
            if (this.f14619g.contains(".zip") && this.f14619g.contains(ResourceManager.KEY_MD5FILENAME)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f14626n = z10;
        }
        if (this.f14626n) {
            cVar2 = com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES;
        } else {
            cVar2 = com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_HTML;
        }
        String a = com.mbridge.msdk.foundation.same.b.e.a(cVar2);
        String md5 = SameMD5.getMD5(ao.b(this.f14619g));
        this.a = md5;
        this.f14614b = eb.j.k(a, "/");
        this.f14615c = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(a, "/", md5);
        this.f14618f.a(true);
        if (this.f14626n) {
            htmlContentFromUrl = ResourceManager.getinstance().getResDirFromCampaign(this.f14619g);
        } else {
            htmlContentFromUrl = HTMLResourceManager.getInstance().getHtmlContentFromUrl(this.f14619g);
        }
        if (!TextUtils.isEmpty(htmlContentFromUrl)) {
            this.f14624l = true;
            this.f14618f.a(1);
            this.f14618f.a(htmlContentFromUrl);
            this.f14618f.b(true);
            this.f14618f.a(false);
        }
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i10, x xVar) {
        StringBuilder sb2;
        String str;
        String str2;
        this.f14623k = xVar;
        int v10 = this.f14616d.v();
        this.f14622j = UUID.randomUUID().toString();
        if (xVar != null) {
            xVar.a(this.f14616d, this.f14617e, this);
        }
        if (this.f14624l) {
            x xVar2 = this.f14623k;
            if (xVar2 != null) {
                xVar2.b(this.f14616d, this.f14617e, this);
                return;
            }
            return;
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f14622j, v10, this);
        if (this.f14626n) {
            sb2 = new StringBuilder();
            sb2.append(this.a);
            str = ".zip";
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.a);
            str = ".html";
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        this.f14625m = vd.e.h(new StringBuilder(), this.f14614b, sb3);
        this.f14620h = new DownloadMessage(this.f14616d, this.f14619g, sb3, 100, this.f14626n ? DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP : DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_HTML);
        RequestBuilder withTimeout = MBDownloadManager.getInstance().download(this.f14620h).withReadTimeout(10000L).withConnectTimeout(10000L).withWriteTimeout(10000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.f14614b).withDownloadStateListener(this).withProgressStateListener(this).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        c cVar = this.f14618f;
        if (cVar != null) {
            int h10 = cVar.h();
            if (h10 == 2) {
                str2 = "download_template";
            } else if (h10 == 3) {
                str2 = "download_big_template";
            } else if (h10 == 4) {
                str2 = "download_end_card";
            }
            DownloadRequest build = withTimeout.with("download_scene", str2).with("do_us_fi_re", Boolean.toString(true)).build();
            this.f14621i = build;
            build.start();
        }
        str2 = "un_known";
        DownloadRequest build2 = withTimeout.with("download_scene", str2).with("do_us_fi_re", Boolean.toString(true)).build();
        this.f14621i = build2;
        build2.start();
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        int i10;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload: " + downloadMessage);
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f14622j);
        String str = this.f14621i.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
        c cVar = this.f14618f;
        if (TextUtils.equals(str, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        cVar.a(i10);
        this.f14618f.b(false);
        this.f14618f.a(false);
        if (this.f14618f.c()) {
            x xVar = this.f14623k;
            if (xVar != null) {
                xVar.b(this.f14616d, this.f14617e, this);
                return;
            }
            return;
        }
        x xVar2 = this.f14623k;
        if (xVar2 != null) {
            xVar2.a(this.f14616d, this.f14617e, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
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
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f14622j);
        Exception exc = null;
        try {
            try {
                if (this.f14626n) {
                    MBResourceManager.getInstance().unZip(this.f14625m, this.f14615c);
                }
                if (this.f14626n) {
                    htmlContentFromUrl = ResourceManager.getinstance().getResDirFromCampaign(this.f14619g);
                } else {
                    htmlContentFromUrl = HTMLResourceManager.getInstance().getHtmlContentFromUrl(this.f14619g);
                }
                int i10 = 1;
                this.f14618f.b(true);
                this.f14618f.a(false);
                String str2 = this.f14621i.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
                c cVar = this.f14618f;
                if (TextUtils.equals(str2, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                    i10 = 2;
                }
                cVar.a(i10);
                this.f14618f.a(2);
                this.f14618f.a(htmlContentFromUrl);
            } catch (Exception e2) {
                exc = e2;
                if (MBridgeConstans.DEBUG) {
                    ad.a("MBridgeDownloader", "onDownloadComplete.unZip: " + exc.getMessage());
                }
                if (this.f14618f.c()) {
                    xVar = this.f14623k;
                    if (xVar == null) {
                        return;
                    }
                } else {
                    if (this.f14623k != null) {
                        this.f14623k.a(this.f14616d, this.f14617e, this, new MBridgeError(6, "unzip error:" + exc.getMessage()));
                        return;
                    }
                    return;
                }
            }
            if (this.f14618f.c()) {
                xVar = this.f14623k;
                if (xVar == null) {
                    return;
                }
                xVar.b(this.f14616d, this.f14617e, this);
                return;
            }
            x xVar2 = this.f14623k;
            if (xVar2 != null) {
                xVar2.a(this.f14616d, this.f14617e, this, new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR));
            }
        } catch (Throwable th2) {
            if (this.f14618f.c()) {
                x xVar3 = this.f14623k;
                if (xVar3 != null) {
                    xVar3.b(this.f14616d, this.f14617e, this);
                }
            } else if (this.f14623k != null) {
                if (exc != null) {
                    str = "unzip error:" + exc.getMessage();
                }
                this.f14623k.a(this.f14616d, this.f14617e, this, new MBridgeError(6, str));
            }
            throw th2;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        int i10;
        String str;
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f14622j);
        String str2 = this.f14621i.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
        c cVar = this.f14618f;
        if (TextUtils.equals(str2, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        cVar.a(i10);
        this.f14618f.b(false);
        this.f14618f.a(false);
        if (this.f14618f.c()) {
            x xVar = this.f14623k;
            if (xVar != null) {
                xVar.b(this.f14616d, this.f14617e, this);
                return;
            }
            return;
        }
        if (this.f14623k != null) {
            c cVar2 = this.f14618f;
            if (cVar2 != null) {
                int h10 = cVar2.h();
                if (h10 != 2) {
                    if (h10 != 3) {
                        if (h10 == 4) {
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
                this.f14623k.a(this.f14616d, this.f14617e, this, mBridgeError);
            }
            str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR;
            MBridgeError mBridgeError2 = new MBridgeError(2, str);
            mBridgeError2.setException(downloadError.getException());
            this.f14623k.a(this.f14616d, this.f14617e, this, mBridgeError2);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public final void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0185a
    public final void a(String str, long j3) {
        if (MBridgeConstans.DEBUG) {
            com.applovin.impl.mediation.ads.e.A("onTimeout: ", str, "MBridgeDownloader");
        }
        DownloadRequest downloadRequest = this.f14621i;
        if (downloadRequest != null) {
            downloadRequest.cancel(this.f14620h);
        }
    }
}

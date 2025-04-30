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
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.a.c.a;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.File;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
abstract class r extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0173a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.b f17233a;
    private com.mbridge.msdk.newreward.function.d.a.a b;

    /* renamed from: c, reason: collision with root package name */
    private b f17234c;

    /* renamed from: d, reason: collision with root package name */
    private String f17235d;

    /* renamed from: e, reason: collision with root package name */
    private String f17236e;

    /* renamed from: f, reason: collision with root package name */
    private DownloadMessage f17237f;

    /* renamed from: g, reason: collision with root package name */
    private DownloadRequest f17238g;

    /* renamed from: h, reason: collision with root package name */
    private String f17239h;

    /* renamed from: i, reason: collision with root package name */
    private String f17240i;

    /* renamed from: j, reason: collision with root package name */
    private x f17241j;

    /* renamed from: k, reason: collision with root package name */
    private String f17242k = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_XML) + File.separator;
    private boolean l;

    public r(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, b bVar2) {
        this.l = false;
        this.f17233a = bVar;
        this.b = aVar;
        this.f17234c = bVar2;
        this.f17235d = bVar2.j();
        String a6 = com.mbridge.msdk.newreward.function.h.a.a(this.f17235d);
        this.f17236e = a6;
        this.f17240i = AbstractC2914a.h(new StringBuilder(), this.f17242k, a6.replace(".zip", "").replace(".xml", ""));
        this.f17234c.a(true);
        File a9 = a(this.f17240i);
        if (a9 != null && a9.exists()) {
            this.l = true;
            this.f17234c.a(1);
            this.f17234c.a(a9);
            this.f17234c.b(true);
            this.f17234c.a(false);
        }
    }

    private File b(String str) {
        JSONArray jSONArray;
        String a6 = com.mbridge.msdk.newreward.function.h.a.a(new File(AbstractC2914a.h(AbstractC2965e.b(str), File.separator, "template_config.json")));
        if (TextUtils.isEmpty(a6)) {
            return null;
        }
        try {
            jSONArray = new JSONArray(a6);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                ad.a("MBridgeDownloader", "findTemplateFile: " + e4.getMessage());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i9);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("xml_type", "");
                if (!TextUtils.isEmpty(optString) && TextUtils.equals(optString, b())) {
                    File file = new File(str + File.separator + optJSONObject.optString("name", ""));
                    if (file.exists()) {
                        return file;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public void a(int i9, x xVar) {
        this.f17241j = xVar;
        if (xVar != null) {
            xVar.a(this.f17233a, this.b, this);
        }
        if (a()) {
            if (xVar != null) {
                xVar.b(this.f17233a, this.b, this);
                return;
            }
            return;
        }
        if (this.l) {
            if (xVar != null) {
                xVar.b(this.f17233a, this.b, this);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(this.f17235d)) {
            if (this.f17234c.c()) {
                if (xVar != null) {
                    xVar.b(this.f17233a, this.b, this);
                    return;
                }
                return;
            } else {
                if (xVar != null) {
                    xVar.a(this.f17233a, this.b, this, new MBridgeError(5, MBridgeError.ERROR_MESSAGE_DOWNLOAD_RESOURCE_URL_ERROR));
                    return;
                }
                return;
            }
        }
        int v6 = this.f17233a.v();
        this.f17239h = UUID.randomUUID().toString();
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f17239h, v6, this);
        this.f17237f = new DownloadMessage(this.f17233a, this.f17235d, this.f17236e, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP);
        DownloadRequest build = MBDownloadManager.getInstance().download(this.f17237f).withReadTimeout(10000L).withConnectTimeout(10000L).withWriteTimeout(10000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.f17242k).withDownloadStateListener(this).withProgressStateListener(this).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("download_scene", "download_dynamic_view").with("do_us_fi_re", Boolean.toString(true)).build();
        this.f17238g = build;
        build.start();
    }

    public abstract boolean a();

    public abstract String b();

    public com.mbridge.msdk.newreward.function.d.a.a c() {
        return this.b;
    }

    public com.mbridge.msdk.newreward.function.d.a.b d() {
        return this.f17233a;
    }

    public a<?> e() {
        return this.f17234c;
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        int i9;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload:  " + e().j());
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f17239h);
        String str = this.f17238g.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
        b bVar = this.f17234c;
        if (TextUtils.equals(str, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            i9 = 2;
        } else {
            i9 = 1;
        }
        bVar.a(i9);
        this.f17234c.b(false);
        this.f17234c.a(false);
        if (this.f17234c.c()) {
            x xVar = this.f17241j;
            if (xVar != null) {
                xVar.b(this.f17233a, this.b, this);
                return;
            }
            return;
        }
        x xVar2 = this.f17241j;
        if (xVar2 != null) {
            xVar2.a(this.f17233a, this.b, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        x xVar;
        com.mbridge.msdk.newreward.function.d.a.b bVar;
        com.mbridge.msdk.newreward.function.d.a.a aVar;
        MBridgeError mBridgeError;
        x xVar2;
        int i9;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadComplete:  " + e().j() + " " + downloadMessage.getSaveFilePath());
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f17239h);
        try {
            try {
                MBResourceManager.getInstance().unZip(downloadMessage.getSaveFilePath(), this.f17242k);
                String str = this.f17238g.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
                b bVar2 = this.f17234c;
                if (TextUtils.equals(str, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                    i9 = 2;
                } else {
                    i9 = 1;
                }
                bVar2.a(i9);
                this.f17234c.b(true);
                this.f17234c.a(false);
                this.f17234c.a(a(this.f17240i));
                this.f17234c.a(2);
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("MBridgeDownloader", "onDownloadComplete.unZip: " + e4.getMessage());
                }
                if (this.f17234c.c()) {
                    xVar2 = this.f17241j;
                    if (xVar2 == null) {
                        return;
                    }
                } else {
                    xVar = this.f17241j;
                    if (xVar != null) {
                        bVar = this.f17233a;
                        aVar = this.b;
                        mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                    } else {
                        return;
                    }
                }
            }
            if (this.f17234c.c()) {
                xVar2 = this.f17241j;
                if (xVar2 == null) {
                    return;
                }
                xVar2.b(this.f17233a, this.b, this);
                return;
            }
            xVar = this.f17241j;
            if (xVar != null) {
                bVar = this.f17233a;
                aVar = this.b;
                mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                xVar.a(bVar, aVar, this, mBridgeError);
            }
        } catch (Throwable th) {
            if (this.f17234c.c()) {
                x xVar3 = this.f17241j;
                if (xVar3 != null) {
                    xVar3.b(this.f17233a, this.b, this);
                }
            } else {
                x xVar4 = this.f17241j;
                if (xVar4 != null) {
                    xVar4.a(this.f17233a, this.b, this, new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR));
                }
            }
            throw th;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        int i9;
        String str;
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f17239h);
        String str2 = this.f17238g.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
        b bVar = this.f17234c;
        if (TextUtils.equals(str2, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            i9 = 2;
        } else {
            i9 = 1;
        }
        bVar.a(i9);
        this.f17234c.b(false);
        this.f17234c.a(false);
        if (this.f17241j != null) {
            b bVar2 = this.f17234c;
            if (bVar2 != null) {
                int h6 = bVar2.h();
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
                this.f17241j.a(this.f17233a, this.b, this, mBridgeError);
            }
            str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR;
            MBridgeError mBridgeError2 = new MBridgeError(2, str);
            mBridgeError2.setException(downloadError.getException());
            this.f17241j.a(this.f17233a, this.b, this, mBridgeError2);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0173a
    public void a(String str, long j7) {
        if (MBridgeConstans.DEBUG) {
            StringBuilder n2 = com.mbridge.msdk.foundation.entity.o.n("onTimeout: ", str, " ");
            n2.append(e().j());
            ad.a("MBridgeDownloader", n2.toString());
        }
        DownloadRequest downloadRequest = this.f17238g;
        if (downloadRequest != null) {
            downloadRequest.cancel(this.f17237f);
        }
    }

    private File a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(com.mbridge.msdk.foundation.entity.o.j(str, ".xml"));
        return (file.isFile() && file.exists()) ? file : b(str);
    }
}

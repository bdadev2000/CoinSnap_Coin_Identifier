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

/* loaded from: classes4.dex */
abstract class r extends q implements OnDownloadStateListener<com.mbridge.msdk.newreward.function.d.a.b>, OnProgressStateListener<com.mbridge.msdk.newreward.function.d.a.b>, a.InterfaceC0185a {
    private com.mbridge.msdk.newreward.function.d.a.b a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.d.a.a f14603b;

    /* renamed from: c, reason: collision with root package name */
    private b f14604c;

    /* renamed from: d, reason: collision with root package name */
    private String f14605d;

    /* renamed from: e, reason: collision with root package name */
    private String f14606e;

    /* renamed from: f, reason: collision with root package name */
    private DownloadMessage f14607f;

    /* renamed from: g, reason: collision with root package name */
    private DownloadRequest f14608g;

    /* renamed from: h, reason: collision with root package name */
    private String f14609h;

    /* renamed from: i, reason: collision with root package name */
    private String f14610i;

    /* renamed from: j, reason: collision with root package name */
    private x f14611j;

    /* renamed from: k, reason: collision with root package name */
    private String f14612k = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_XML) + File.separator;

    /* renamed from: l, reason: collision with root package name */
    private boolean f14613l;

    public r(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, b bVar2) {
        this.f14613l = false;
        this.a = bVar;
        this.f14603b = aVar;
        this.f14604c = bVar2;
        this.f14605d = bVar2.j();
        String a = com.mbridge.msdk.newreward.function.h.a.a(this.f14605d);
        this.f14606e = a;
        this.f14610i = vd.e.h(new StringBuilder(), this.f14612k, a.replace(".zip", "").replace(".xml", ""));
        this.f14604c.a(true);
        File a10 = a(this.f14610i);
        if (a10 != null && a10.exists()) {
            this.f14613l = true;
            this.f14604c.a(1);
            this.f14604c.a(a10);
            this.f14604c.b(true);
            this.f14604c.a(false);
        }
    }

    private File b(String str) {
        JSONArray jSONArray;
        String a = com.mbridge.msdk.newreward.function.h.a.a(new File(vd.e.h(eb.j.m(str), File.separator, "template_config.json")));
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        try {
            jSONArray = new JSONArray(a);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                ad.a("MBridgeDownloader", "findTemplateFile: " + e2.getMessage());
            }
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
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
    public void a(int i10, x xVar) {
        this.f14611j = xVar;
        if (xVar != null) {
            xVar.a(this.a, this.f14603b, this);
        }
        if (a()) {
            if (xVar != null) {
                xVar.b(this.a, this.f14603b, this);
                return;
            }
            return;
        }
        if (this.f14613l) {
            if (xVar != null) {
                xVar.b(this.a, this.f14603b, this);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(this.f14605d)) {
            if (this.f14604c.c()) {
                if (xVar != null) {
                    xVar.b(this.a, this.f14603b, this);
                    return;
                }
                return;
            } else {
                if (xVar != null) {
                    xVar.a(this.a, this.f14603b, this, new MBridgeError(5, MBridgeError.ERROR_MESSAGE_DOWNLOAD_RESOURCE_URL_ERROR));
                    return;
                }
                return;
            }
        }
        int v10 = this.a.v();
        this.f14609h = UUID.randomUUID().toString();
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f14609h, v10, this);
        this.f14607f = new DownloadMessage(this.a, this.f14605d, this.f14606e, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_ZIP);
        DownloadRequest build = MBDownloadManager.getInstance().download(this.f14607f).withReadTimeout(10000L).withConnectTimeout(10000L).withWriteTimeout(10000L).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(5).withDirectoryPathInternal(this.f14612k).withDownloadStateListener(this).withProgressStateListener(this).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("download_scene", "download_dynamic_view").with("do_us_fi_re", Boolean.toString(true)).build();
        this.f14608g = build;
        build.start();
    }

    public abstract boolean a();

    public abstract String b();

    public com.mbridge.msdk.newreward.function.d.a.a c() {
        return this.f14603b;
    }

    public com.mbridge.msdk.newreward.function.d.a.b d() {
        return this.a;
    }

    public a<?> e() {
        return this.f14604c;
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        int i10;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onCancelDownload:  " + e().j());
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f14609h);
        String str = this.f14608g.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
        b bVar = this.f14604c;
        if (TextUtils.equals(str, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        bVar.a(i10);
        this.f14604c.b(false);
        this.f14604c.a(false);
        if (this.f14604c.c()) {
            x xVar = this.f14611j;
            if (xVar != null) {
                xVar.b(this.a, this.f14603b, this);
                return;
            }
            return;
        }
        x xVar2 = this.f14611j;
        if (xVar2 != null) {
            xVar2.a(this.a, this.f14603b, this, new MBridgeError(4, MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT));
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        x xVar;
        com.mbridge.msdk.newreward.function.d.a.b bVar;
        com.mbridge.msdk.newreward.function.d.a.a aVar;
        MBridgeError mBridgeError;
        x xVar2;
        int i10;
        if (MBridgeConstans.DEBUG) {
            ad.a("MBridgeDownloader", "onDownloadComplete:  " + e().j() + " " + downloadMessage.getSaveFilePath());
        }
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f14609h);
        try {
            try {
                MBResourceManager.getInstance().unZip(downloadMessage.getSaveFilePath(), this.f14612k);
                String str = this.f14608g.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
                b bVar2 = this.f14604c;
                if (TextUtils.equals(str, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                bVar2.a(i10);
                this.f14604c.b(true);
                this.f14604c.a(false);
                this.f14604c.a(a(this.f14610i));
                this.f14604c.a(2);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.a("MBridgeDownloader", "onDownloadComplete.unZip: " + e2.getMessage());
                }
                if (this.f14604c.c()) {
                    xVar2 = this.f14611j;
                    if (xVar2 == null) {
                        return;
                    }
                } else {
                    xVar = this.f14611j;
                    if (xVar != null) {
                        bVar = this.a;
                        aVar = this.f14603b;
                        mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                    } else {
                        return;
                    }
                }
            }
            if (this.f14604c.c()) {
                xVar2 = this.f14611j;
                if (xVar2 == null) {
                    return;
                }
                xVar2.b(this.a, this.f14603b, this);
                return;
            }
            xVar = this.f14611j;
            if (xVar != null) {
                bVar = this.a;
                aVar = this.f14603b;
                mBridgeError = new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR);
                xVar.a(bVar, aVar, this, mBridgeError);
            }
        } catch (Throwable th2) {
            if (this.f14604c.c()) {
                x xVar3 = this.f14611j;
                if (xVar3 != null) {
                    xVar3.b(this.a, this.f14603b, this);
                }
            } else {
                x xVar4 = this.f14611j;
                if (xVar4 != null) {
                    xVar4.a(this.a, this.f14603b, this, new MBridgeError(6, MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR));
                }
            }
            throw th2;
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        int i10;
        String str;
        com.mbridge.msdk.newreward.a.c.a.a().a(this.f14609h);
        String str2 = this.f14608g.get("cache", MBridgeConstans.API_REUQEST_CATEGORY_APP);
        b bVar = this.f14604c;
        if (TextUtils.equals(str2, MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        bVar.a(i10);
        this.f14604c.b(false);
        this.f14604c.a(false);
        if (this.f14611j != null) {
            b bVar2 = this.f14604c;
            if (bVar2 != null) {
                int h10 = bVar2.h();
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
                this.f14611j.a(this.a, this.f14603b, this, mBridgeError);
            }
            str = MBridgeError.ERROR_MESSAGE_DOWNLOAD_NETWORK_ERROR;
            MBridgeError mBridgeError2 = new MBridgeError(2, str);
            mBridgeError2.setException(downloadError.getException());
            this.f14611j.a(this.a, this.f14603b, this, mBridgeError2);
        }
    }

    @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
    }

    @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
    public void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
    }

    @Override // com.mbridge.msdk.newreward.a.c.a.InterfaceC0185a
    public void a(String str, long j3) {
        if (MBridgeConstans.DEBUG) {
            StringBuilder o10 = a4.j.o("onTimeout: ", str, " ");
            o10.append(e().j());
            ad.a("MBridgeDownloader", o10.toString());
        }
        DownloadRequest downloadRequest = this.f14608g;
        if (downloadRequest != null) {
            downloadRequest.cancel(this.f14607f);
        }
    }

    private File a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(eb.j.k(str, ".xml"));
        return (file.isFile() && file.exists()) ? file : b(str);
    }
}

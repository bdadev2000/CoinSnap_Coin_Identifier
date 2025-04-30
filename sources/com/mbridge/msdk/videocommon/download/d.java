package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.videocommon.download.e;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    private static d f19443c;

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f19444a;
    private ConcurrentMap<String, Object> b;

    /* renamed from: d, reason: collision with root package name */
    private g f19445d;

    /* renamed from: e, reason: collision with root package name */
    private e f19446e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19447f;

    /* renamed from: g, reason: collision with root package name */
    private final String f19448g = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;

    /* renamed from: h, reason: collision with root package name */
    private final String f19449h = "down_type";

    private d() {
        this.f19447f = false;
        try {
            this.f19445d = g.a();
            this.f19446e = e.a.f19452a;
            this.f19444a = new CopyOnWriteArrayList<>();
            this.b = new ConcurrentHashMap();
            com.mbridge.msdk.c.g b = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b != null) {
                this.f19447f = b.y(1);
            }
        } catch (Throwable th) {
            ad.b("H5DownLoadManager", th.getMessage(), th);
        }
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            try {
                if (f19443c == null) {
                    f19443c = new d();
                }
                dVar = f19443c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final String a(String str) {
        try {
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        if (!Patterns.WEB_URL.matcher(str).matches()) {
            if (URLUtil.isValidUrl(str)) {
            }
            return str;
        }
        Uri parse = Uri.parse(str);
        String path = parse.getPath();
        if (TextUtils.isEmpty(path) || !TextUtils.isEmpty(parse.getQueryParameter("urlDebug"))) {
            return str;
        }
        if (path.toLowerCase().endsWith(".zip")) {
            g gVar = this.f19445d;
            if (gVar != null) {
                return gVar.a(str);
            }
            return null;
        }
        e eVar = this.f19446e;
        return eVar != null ? eVar.a(str) : str;
    }
}

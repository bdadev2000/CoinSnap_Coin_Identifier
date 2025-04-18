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

/* loaded from: classes4.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    private static d f16414c;
    private CopyOnWriteArrayList<String> a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentMap<String, Object> f16415b;

    /* renamed from: d, reason: collision with root package name */
    private g f16416d;

    /* renamed from: e, reason: collision with root package name */
    private e f16417e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16418f;

    /* renamed from: g, reason: collision with root package name */
    private final String f16419g = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;

    /* renamed from: h, reason: collision with root package name */
    private final String f16420h = "down_type";

    private d() {
        this.f16418f = false;
        try {
            this.f16416d = g.a();
            this.f16417e = e.a.a;
            this.a = new CopyOnWriteArrayList<>();
            this.f16415b = new ConcurrentHashMap();
            com.mbridge.msdk.c.g b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b3 != null) {
                this.f16418f = b3.y(1);
            }
        } catch (Throwable th2) {
            ad.b("H5DownLoadManager", th2.getMessage(), th2);
        }
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f16414c == null) {
                f16414c = new d();
            }
            dVar = f16414c;
        }
        return dVar;
    }

    public final String a(String str) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                Uri parse = Uri.parse(str);
                String path = parse.getPath();
                if (TextUtils.isEmpty(path) || !TextUtils.isEmpty(parse.getQueryParameter("urlDebug"))) {
                    return str;
                }
                if (path.toLowerCase().endsWith(".zip")) {
                    g gVar = this.f16416d;
                    if (gVar != null) {
                        return gVar.a(str);
                    }
                    return null;
                }
                e eVar = this.f16417e;
                return eVar != null ? eVar.a(str) : str;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return str;
    }
}

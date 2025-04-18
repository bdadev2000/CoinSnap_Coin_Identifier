package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.StringUtils;

/* loaded from: classes.dex */
public class iq {

    /* renamed from: a, reason: collision with root package name */
    private a f24525a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f24526b;

    /* renamed from: c, reason: collision with root package name */
    private String f24527c;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private iq() {
    }

    public String a() {
        return this.f24527c;
    }

    public Uri b() {
        return this.f24526b;
    }

    public a c() {
        return this.f24525a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq)) {
            return false;
        }
        iq iqVar = (iq) obj;
        if (this.f24525a != iqVar.f24525a) {
            return false;
        }
        Uri uri = this.f24526b;
        if (uri == null ? iqVar.f24526b != null : !uri.equals(iqVar.f24526b)) {
            return false;
        }
        String str = this.f24527c;
        String str2 = iqVar.f24527c;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        a aVar = this.f24525a;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Uri uri = this.f24526b;
        int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.f24527c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VastNonVideoResource{type=");
        sb.append(this.f24525a);
        sb.append(", resourceUri=");
        sb.append(this.f24526b);
        sb.append(", resourceContents='");
        return android.support.v4.media.d.r(sb, this.f24527c, "'}");
    }

    public void a(Uri uri) {
        this.f24526b = uri;
    }

    public void a(String str) {
        this.f24527c = str;
    }

    public static iq a(es esVar, iq iqVar, com.applovin.impl.sdk.j jVar) {
        if (esVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (jVar != null) {
            if (iqVar == null) {
                try {
                    iqVar = new iq();
                } catch (Throwable th) {
                    jVar.J();
                    if (com.applovin.impl.sdk.n.a()) {
                        jVar.J().a("VastNonVideoResource", "Error occurred while initializing", th);
                    }
                    jVar.E().a("VastNonVideoResource", th);
                    return null;
                }
            }
            if (iqVar.f24526b == null && !StringUtils.isValidString(iqVar.f24527c)) {
                String a2 = a(esVar, "StaticResource");
                if (URLUtil.isValidUrl(a2)) {
                    iqVar.f24526b = Uri.parse(a2);
                    iqVar.f24525a = a.STATIC;
                    return iqVar;
                }
                String a3 = a(esVar, "IFrameResource");
                if (StringUtils.isValidString(a3)) {
                    iqVar.f24525a = a.IFRAME;
                    if (URLUtil.isValidUrl(a3)) {
                        iqVar.f24526b = Uri.parse(a3);
                    } else {
                        iqVar.f24527c = a3;
                    }
                    return iqVar;
                }
                String a4 = a(esVar, "HTMLResource");
                if (StringUtils.isValidString(a4)) {
                    iqVar.f24525a = a.HTML;
                    if (URLUtil.isValidUrl(a4)) {
                        iqVar.f24526b = Uri.parse(a4);
                    } else {
                        iqVar.f24527c = a4;
                    }
                }
            }
            return iqVar;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    private static String a(es esVar, String str) {
        es c2 = esVar.c(str);
        if (c2 != null) {
            return c2.d();
        }
        return null;
    }
}

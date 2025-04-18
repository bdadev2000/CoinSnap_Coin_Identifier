package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.StringUtils;

/* loaded from: classes.dex */
public class jq {
    private a a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f5531b;

    /* renamed from: c, reason: collision with root package name */
    private String f5532c;

    /* loaded from: classes.dex */
    public enum a {
        UNSPECIFIED,
        STATIC,
        IFRAME,
        HTML
    }

    private jq() {
    }

    public static jq a(fs fsVar, jq jqVar, com.applovin.impl.sdk.k kVar) {
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar != null) {
            if (jqVar == null) {
                try {
                    jqVar = new jq();
                } catch (Throwable th2) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().a("VastNonVideoResource", "Error occurred while initializing", th2);
                    }
                    kVar.B().a("VastNonVideoResource", th2);
                    return null;
                }
            }
            if (jqVar.f5531b == null && !StringUtils.isValidString(jqVar.f5532c)) {
                String a10 = a(fsVar, "StaticResource");
                if (URLUtil.isValidUrl(a10)) {
                    jqVar.f5531b = Uri.parse(a10);
                    jqVar.a = a.STATIC;
                    return jqVar;
                }
                String a11 = a(fsVar, "IFrameResource");
                if (StringUtils.isValidString(a11)) {
                    jqVar.a = a.IFRAME;
                    if (URLUtil.isValidUrl(a11)) {
                        jqVar.f5531b = Uri.parse(a11);
                    } else {
                        jqVar.f5532c = a11;
                    }
                    return jqVar;
                }
                String a12 = a(fsVar, "HTMLResource");
                if (StringUtils.isValidString(a12)) {
                    jqVar.a = a.HTML;
                    if (URLUtil.isValidUrl(a12)) {
                        jqVar.f5531b = Uri.parse(a12);
                    } else {
                        jqVar.f5532c = a12;
                    }
                }
            }
            return jqVar;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public Uri b() {
        return this.f5531b;
    }

    public a c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq)) {
            return false;
        }
        jq jqVar = (jq) obj;
        if (this.a != jqVar.a) {
            return false;
        }
        Uri uri = this.f5531b;
        if (uri == null ? jqVar.f5531b != null : !uri.equals(jqVar.f5531b)) {
            return false;
        }
        String str = this.f5532c;
        String str2 = jqVar.f5532c;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int i11;
        a aVar = this.a;
        int i12 = 0;
        if (aVar != null) {
            i10 = aVar.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Uri uri = this.f5531b;
        if (uri != null) {
            i11 = uri.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str = this.f5532c;
        if (str != null) {
            i12 = str.hashCode();
        }
        return i14 + i12;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("VastNonVideoResource{type=");
        sb2.append(this.a);
        sb2.append(", resourceUri=");
        sb2.append(this.f5531b);
        sb2.append(", resourceContents='");
        return vd.e.h(sb2, this.f5532c, "'}");
    }

    public String a() {
        return this.f5532c;
    }

    public void a(String str) {
        this.f5532c = str;
    }

    public void a(Uri uri) {
        this.f5531b = uri;
    }

    private static String a(fs fsVar, String str) {
        fs c10 = fsVar.c(str);
        if (c10 != null) {
            return c10.d();
        }
        return null;
    }
}

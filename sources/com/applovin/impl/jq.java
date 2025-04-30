package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.StringUtils;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class jq {

    /* renamed from: a, reason: collision with root package name */
    private a f8490a;
    private Uri b;

    /* renamed from: c, reason: collision with root package name */
    private String f8491c;

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
                } catch (Throwable th) {
                    kVar.L();
                    if (com.applovin.impl.sdk.t.a()) {
                        kVar.L().a("VastNonVideoResource", "Error occurred while initializing", th);
                    }
                    kVar.B().a("VastNonVideoResource", th);
                    return null;
                }
            }
            if (jqVar.b == null && !StringUtils.isValidString(jqVar.f8491c)) {
                String a6 = a(fsVar, "StaticResource");
                if (URLUtil.isValidUrl(a6)) {
                    jqVar.b = Uri.parse(a6);
                    jqVar.f8490a = a.STATIC;
                    return jqVar;
                }
                String a9 = a(fsVar, "IFrameResource");
                if (StringUtils.isValidString(a9)) {
                    jqVar.f8490a = a.IFRAME;
                    if (URLUtil.isValidUrl(a9)) {
                        jqVar.b = Uri.parse(a9);
                    } else {
                        jqVar.f8491c = a9;
                    }
                    return jqVar;
                }
                String a10 = a(fsVar, "HTMLResource");
                if (StringUtils.isValidString(a10)) {
                    jqVar.f8490a = a.HTML;
                    if (URLUtil.isValidUrl(a10)) {
                        jqVar.b = Uri.parse(a10);
                    } else {
                        jqVar.f8491c = a10;
                    }
                }
            }
            return jqVar;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public Uri b() {
        return this.b;
    }

    public a c() {
        return this.f8490a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq)) {
            return false;
        }
        jq jqVar = (jq) obj;
        if (this.f8490a != jqVar.f8490a) {
            return false;
        }
        Uri uri = this.b;
        if (uri == null ? jqVar.b != null : !uri.equals(jqVar.b)) {
            return false;
        }
        String str = this.f8491c;
        String str2 = jqVar.f8491c;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i9;
        int i10;
        a aVar = this.f8490a;
        int i11 = 0;
        if (aVar != null) {
            i9 = aVar.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = i9 * 31;
        Uri uri = this.b;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str = this.f8491c;
        if (str != null) {
            i11 = str.hashCode();
        }
        return i13 + i11;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VastNonVideoResource{type=");
        sb.append(this.f8490a);
        sb.append(", resourceUri=");
        sb.append(this.b);
        sb.append(", resourceContents='");
        return AbstractC2914a.h(sb, this.f8491c, "'}");
    }

    public String a() {
        return this.f8491c;
    }

    public void a(String str) {
        this.f8491c = str;
    }

    public void a(Uri uri) {
        this.b = uri;
    }

    private static String a(fs fsVar, String str) {
        fs c9 = fsVar.c(str);
        if (c9 != null) {
            return c9.d();
        }
        return null;
    }
}

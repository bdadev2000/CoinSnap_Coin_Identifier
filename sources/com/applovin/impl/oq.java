package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public class oq {

    /* renamed from: a, reason: collision with root package name */
    private Uri f25927a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f25928b;

    /* renamed from: c, reason: collision with root package name */
    private a f25929c;
    private String d;
    private int e;

    /* renamed from: f, reason: collision with root package name */
    private int f25930f;

    /* renamed from: g, reason: collision with root package name */
    private long f25931g;

    /* loaded from: classes2.dex */
    public enum a {
        Progressive,
        Streaming
    }

    private oq() {
    }

    public long a() {
        return this.f25931g;
    }

    public String b() {
        return this.d;
    }

    public Uri c() {
        return this.f25927a;
    }

    public Uri d() {
        return this.f25928b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq)) {
            return false;
        }
        oq oqVar = (oq) obj;
        if (this.e != oqVar.e || this.f25930f != oqVar.f25930f || this.f25931g != oqVar.f25931g) {
            return false;
        }
        Uri uri = this.f25927a;
        if (uri == null ? oqVar.f25927a != null : !uri.equals(oqVar.f25927a)) {
            return false;
        }
        Uri uri2 = this.f25928b;
        if (uri2 == null ? oqVar.f25928b != null : !uri2.equals(oqVar.f25928b)) {
            return false;
        }
        if (this.f25929c != oqVar.f25929c) {
            return false;
        }
        String str = this.d;
        String str2 = oqVar.d;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        Uri uri = this.f25927a;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.f25928b;
        int hashCode2 = (hashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        a aVar = this.f25929c;
        int hashCode3 = (hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        String str = this.d;
        return Long.valueOf(this.f25931g).hashCode() + ((((((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.e) * 31) + this.f25930f) * 31);
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f25927a + ", videoUri=" + this.f25928b + ", deliveryType=" + this.f25929c + ", fileType='" + this.d + "', width=" + this.e + ", height=" + this.f25930f + ", bitrate=" + this.f25931g + '}';
    }

    public void a(Uri uri) {
        this.f25928b = uri;
    }

    public static oq a(es esVar, com.applovin.impl.sdk.j jVar) {
        if (esVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (jVar != null) {
            try {
                String d = esVar.d();
                if (URLUtil.isValidUrl(d)) {
                    Uri parse = Uri.parse(d);
                    oq oqVar = new oq();
                    oqVar.f25927a = parse;
                    oqVar.f25928b = parse;
                    oqVar.f25931g = a(esVar);
                    oqVar.f25929c = a((String) esVar.a().get("delivery"));
                    oqVar.f25930f = StringUtils.parseInt((String) esVar.a().get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY));
                    oqVar.e = StringUtils.parseInt((String) esVar.a().get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY));
                    oqVar.d = ((String) esVar.a().get("type")).toLowerCase(Locale.ENGLISH);
                    return oqVar;
                }
                jVar.J();
                if (!com.applovin.impl.sdk.n.a()) {
                    return null;
                }
                jVar.J().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            } catch (Throwable th) {
                jVar.J();
                if (com.applovin.impl.sdk.n.a()) {
                    jVar.J().a("VastVideoFile", "Error occurred while initializing", th);
                }
                jVar.E().a("VastVideoFile", th);
                return null;
            }
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    private static long a(es esVar) {
        Map a2 = esVar.a();
        long parseLong = StringUtils.parseLong((String) a2.get("bitrate"), 0L);
        if (parseLong != 0) {
            return parseLong;
        }
        return (StringUtils.parseLong((String) a2.get("maxBitrate"), 0L) + StringUtils.parseLong((String) a2.get("minBitrate"), 0L)) / 2;
    }

    private static a a(String str) {
        if (StringUtils.isValidString(str)) {
            if ("progressive".equalsIgnoreCase(str)) {
                return a.Progressive;
            }
            if ("streaming".equalsIgnoreCase(str)) {
                return a.Streaming;
            }
        }
        return a.Progressive;
    }
}

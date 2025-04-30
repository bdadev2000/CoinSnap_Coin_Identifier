package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class pq {

    /* renamed from: a, reason: collision with root package name */
    private Uri f10070a;
    private Uri b;

    /* renamed from: c, reason: collision with root package name */
    private a f10071c;

    /* renamed from: d, reason: collision with root package name */
    private String f10072d;

    /* renamed from: e, reason: collision with root package name */
    private int f10073e;

    /* renamed from: f, reason: collision with root package name */
    private int f10074f;

    /* renamed from: g, reason: collision with root package name */
    private long f10075g;

    /* loaded from: classes.dex */
    public enum a {
        Progressive,
        Streaming
    }

    private pq() {
    }

    public static pq a(fs fsVar, com.applovin.impl.sdk.k kVar) {
        if (fsVar == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar != null) {
            try {
                String d2 = fsVar.d();
                if (URLUtil.isValidUrl(d2)) {
                    Uri parse = Uri.parse(d2);
                    pq pqVar = new pq();
                    pqVar.f10070a = parse;
                    pqVar.b = parse;
                    pqVar.f10075g = a(fsVar);
                    pqVar.f10071c = a((String) fsVar.a().get("delivery"));
                    pqVar.f10074f = StringUtils.parseInt((String) fsVar.a().get("height"));
                    pqVar.f10073e = StringUtils.parseInt((String) fsVar.a().get("width"));
                    pqVar.f10072d = ((String) fsVar.a().get("type")).toLowerCase(Locale.ENGLISH);
                    return pqVar;
                }
                kVar.L();
                if (!com.applovin.impl.sdk.t.a()) {
                    return null;
                }
                kVar.L().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            } catch (Throwable th) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("VastVideoFile", "Error occurred while initializing", th);
                }
                kVar.B().a("VastVideoFile", th);
                return null;
            }
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public String b() {
        return this.f10072d;
    }

    public Uri c() {
        return this.f10070a;
    }

    public Uri d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq)) {
            return false;
        }
        pq pqVar = (pq) obj;
        if (this.f10073e != pqVar.f10073e || this.f10074f != pqVar.f10074f || this.f10075g != pqVar.f10075g) {
            return false;
        }
        Uri uri = this.f10070a;
        if (uri == null ? pqVar.f10070a != null : !uri.equals(pqVar.f10070a)) {
            return false;
        }
        Uri uri2 = this.b;
        if (uri2 == null ? pqVar.b != null : !uri2.equals(pqVar.b)) {
            return false;
        }
        if (this.f10071c != pqVar.f10071c) {
            return false;
        }
        String str = this.f10072d;
        String str2 = pqVar.f10072d;
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
        int i11;
        Uri uri = this.f10070a;
        int i12 = 0;
        if (uri != null) {
            i9 = uri.hashCode();
        } else {
            i9 = 0;
        }
        int i13 = i9 * 31;
        Uri uri2 = this.b;
        if (uri2 != null) {
            i10 = uri2.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        a aVar = this.f10071c;
        if (aVar != null) {
            i11 = aVar.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        String str = this.f10072d;
        if (str != null) {
            i12 = str.hashCode();
        }
        return Long.valueOf(this.f10075g).hashCode() + ((((((i15 + i12) * 31) + this.f10073e) * 31) + this.f10074f) * 31);
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.f10070a + ", videoUri=" + this.b + ", deliveryType=" + this.f10071c + ", fileType='" + this.f10072d + "', width=" + this.f10073e + ", height=" + this.f10074f + ", bitrate=" + this.f10075g + '}';
    }

    public long a() {
        return this.f10075g;
    }

    private static long a(fs fsVar) {
        Map a6 = fsVar.a();
        long parseLong = StringUtils.parseLong((String) a6.get("bitrate"), 0L);
        if (parseLong != 0) {
            return parseLong;
        }
        return (StringUtils.parseLong((String) a6.get("maxBitrate"), 0L) + StringUtils.parseLong((String) a6.get("minBitrate"), 0L)) / 2;
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

    public void a(Uri uri) {
        this.b = uri;
    }
}

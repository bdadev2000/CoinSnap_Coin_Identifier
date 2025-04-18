package com.applovin.impl;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class pq {
    private Uri a;

    /* renamed from: b, reason: collision with root package name */
    private Uri f7005b;

    /* renamed from: c, reason: collision with root package name */
    private a f7006c;

    /* renamed from: d, reason: collision with root package name */
    private String f7007d;

    /* renamed from: e, reason: collision with root package name */
    private int f7008e;

    /* renamed from: f, reason: collision with root package name */
    private int f7009f;

    /* renamed from: g, reason: collision with root package name */
    private long f7010g;

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
                String d10 = fsVar.d();
                if (URLUtil.isValidUrl(d10)) {
                    Uri parse = Uri.parse(d10);
                    pq pqVar = new pq();
                    pqVar.a = parse;
                    pqVar.f7005b = parse;
                    pqVar.f7010g = a(fsVar);
                    pqVar.f7006c = a((String) fsVar.a().get("delivery"));
                    pqVar.f7009f = StringUtils.parseInt((String) fsVar.a().get("height"));
                    pqVar.f7008e = StringUtils.parseInt((String) fsVar.a().get("width"));
                    pqVar.f7007d = ((String) fsVar.a().get("type")).toLowerCase(Locale.ENGLISH);
                    return pqVar;
                }
                kVar.L();
                if (!com.applovin.impl.sdk.t.a()) {
                    return null;
                }
                kVar.L().b("VastVideoFile", "Unable to create video file. Could not find URL.");
                return null;
            } catch (Throwable th2) {
                kVar.L();
                if (com.applovin.impl.sdk.t.a()) {
                    kVar.L().a("VastVideoFile", "Error occurred while initializing", th2);
                }
                kVar.B().a("VastVideoFile", th2);
                return null;
            }
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    public String b() {
        return this.f7007d;
    }

    public Uri c() {
        return this.a;
    }

    public Uri d() {
        return this.f7005b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq)) {
            return false;
        }
        pq pqVar = (pq) obj;
        if (this.f7008e != pqVar.f7008e || this.f7009f != pqVar.f7009f || this.f7010g != pqVar.f7010g) {
            return false;
        }
        Uri uri = this.a;
        if (uri == null ? pqVar.a != null : !uri.equals(pqVar.a)) {
            return false;
        }
        Uri uri2 = this.f7005b;
        if (uri2 == null ? pqVar.f7005b != null : !uri2.equals(pqVar.f7005b)) {
            return false;
        }
        if (this.f7006c != pqVar.f7006c) {
            return false;
        }
        String str = this.f7007d;
        String str2 = pqVar.f7007d;
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
        int i12;
        Uri uri = this.a;
        int i13 = 0;
        if (uri != null) {
            i10 = uri.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = i10 * 31;
        Uri uri2 = this.f7005b;
        if (uri2 != null) {
            i11 = uri2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 31;
        a aVar = this.f7006c;
        if (aVar != null) {
            i12 = aVar.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        String str = this.f7007d;
        if (str != null) {
            i13 = str.hashCode();
        }
        return Long.valueOf(this.f7010g).hashCode() + ((((((i16 + i13) * 31) + this.f7008e) * 31) + this.f7009f) * 31);
    }

    public String toString() {
        return "VastVideoFile{sourceVideoUri=" + this.a + ", videoUri=" + this.f7005b + ", deliveryType=" + this.f7006c + ", fileType='" + this.f7007d + "', width=" + this.f7008e + ", height=" + this.f7009f + ", bitrate=" + this.f7010g + AbstractJsonLexerKt.END_OBJ;
    }

    public long a() {
        return this.f7010g;
    }

    private static long a(fs fsVar) {
        Map a10 = fsVar.a();
        long parseLong = StringUtils.parseLong((String) a10.get("bitrate"), 0L);
        if (parseLong != 0) {
            return parseLong;
        }
        return (StringUtils.parseLong((String) a10.get("maxBitrate"), 0L) + StringUtils.parseLong((String) a10.get("minBitrate"), 0L)) / 2;
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
        this.f7005b = uri;
    }
}

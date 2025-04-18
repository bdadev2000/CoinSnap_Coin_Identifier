package kd;

import java.net.URL;

/* loaded from: classes4.dex */
public final class h {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final URL f20667b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20668c;

    public h(String str, URL url, String str2) {
        this.a = str;
        this.f20667b = url;
        this.f20668c = str2;
    }

    public static h a(String str, URL url, String str2) {
        com.facebook.internal.i.c(str, "VendorKey is null or empty");
        com.facebook.internal.i.c(str2, "VerificationParameters is null or empty");
        return new h(str, url, str2);
    }
}

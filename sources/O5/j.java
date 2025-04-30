package O5;

import java.net.URL;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f2227a;
    public final URL b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2228c;

    public j(String str, URL url, String str2) {
        this.f2227a = str;
        this.b = url;
        this.f2228c = str2;
    }

    public static j a(String str, URL url, String str2) {
        R2.b.d(str, "VendorKey is null or empty");
        R2.b.d(str2, "VerificationParameters is null or empty");
        return new j(str, url, str2);
    }
}

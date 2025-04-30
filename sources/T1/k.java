package T1;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class k implements N1.f {
    public final l b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f2976c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2977d;

    /* renamed from: e, reason: collision with root package name */
    public String f2978e;

    /* renamed from: f, reason: collision with root package name */
    public URL f2979f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f2980g;

    /* renamed from: h, reason: collision with root package name */
    public int f2981h;

    public k(URL url) {
        o oVar = l.f2982a;
        j2.g.c(url, "Argument must not be null");
        this.f2976c = url;
        this.f2977d = null;
        j2.g.c(oVar, "Argument must not be null");
        this.b = oVar;
    }

    @Override // N1.f
    public final void b(MessageDigest messageDigest) {
        if (this.f2980g == null) {
            this.f2980g = c().getBytes(N1.f.f2087a);
        }
        messageDigest.update(this.f2980g);
    }

    public final String c() {
        String str = this.f2977d;
        if (str == null) {
            URL url = this.f2976c;
            j2.g.c(url, "Argument must not be null");
            return url.toString();
        }
        return str;
    }

    public final URL d() {
        if (this.f2979f == null) {
            if (TextUtils.isEmpty(this.f2978e)) {
                String str = this.f2977d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f2976c;
                    j2.g.c(url, "Argument must not be null");
                    str = url.toString();
                }
                this.f2978e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f2979f = new URL(this.f2978e);
        }
        return this.f2979f;
    }

    @Override // N1.f
    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!c().equals(kVar.c()) || !this.b.equals(kVar.b)) {
            return false;
        }
        return true;
    }

    @Override // N1.f
    public final int hashCode() {
        if (this.f2981h == 0) {
            int hashCode = c().hashCode();
            this.f2981h = hashCode;
            this.f2981h = this.b.hashCode() + (hashCode * 31);
        }
        return this.f2981h;
    }

    public final String toString() {
        return c();
    }

    public k(String str) {
        o oVar = l.f2982a;
        this.f2976c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f2977d = str;
            j2.g.c(oVar, "Argument must not be null");
            this.b = oVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}

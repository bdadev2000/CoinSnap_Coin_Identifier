package k4;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class p implements e4.j {

    /* renamed from: b, reason: collision with root package name */
    public final q f20253b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f20254c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20255d;

    /* renamed from: e, reason: collision with root package name */
    public String f20256e;

    /* renamed from: f, reason: collision with root package name */
    public URL f20257f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f20258g;

    /* renamed from: h, reason: collision with root package name */
    public int f20259h;

    public p(URL url) {
        t tVar = q.a;
        com.bumptech.glide.c.l(url);
        this.f20254c = url;
        this.f20255d = null;
        com.bumptech.glide.c.l(tVar);
        this.f20253b = tVar;
    }

    @Override // e4.j
    public final void b(MessageDigest messageDigest) {
        if (this.f20258g == null) {
            this.f20258g = c().getBytes(e4.j.a);
        }
        messageDigest.update(this.f20258g);
    }

    public final String c() {
        String str = this.f20255d;
        if (str != null) {
            return str;
        }
        URL url = this.f20254c;
        com.bumptech.glide.c.l(url);
        return url.toString();
    }

    public final URL d() {
        if (this.f20257f == null) {
            if (TextUtils.isEmpty(this.f20256e)) {
                String str = this.f20255d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f20254c;
                    com.bumptech.glide.c.l(url);
                    str = url.toString();
                }
                this.f20256e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f20257f = new URL(this.f20256e);
        }
        return this.f20257f;
    }

    @Override // e4.j
    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!c().equals(pVar.c()) || !this.f20253b.equals(pVar.f20253b)) {
            return false;
        }
        return true;
    }

    @Override // e4.j
    public final int hashCode() {
        if (this.f20259h == 0) {
            int hashCode = c().hashCode();
            this.f20259h = hashCode;
            this.f20259h = this.f20253b.hashCode() + (hashCode * 31);
        }
        return this.f20259h;
    }

    public final String toString() {
        return c();
    }

    public p(String str) {
        t tVar = q.a;
        this.f20254c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f20255d = str;
            com.bumptech.glide.c.l(tVar);
            this.f20253b = tVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}

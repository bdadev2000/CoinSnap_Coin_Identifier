package a5;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class m extends n {

    /* renamed from: n, reason: collision with root package name */
    public final int f209n;

    /* renamed from: o, reason: collision with root package name */
    public final k f210o;

    /* renamed from: p, reason: collision with root package name */
    public final m f211p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f212q;

    /* renamed from: r, reason: collision with root package name */
    public volatile r f213r;

    /* renamed from: s, reason: collision with root package name */
    public volatile d5.b f214s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(a5.l r3) {
        /*
            r2 = this;
            va.b r0 = r3.f203d
            r1 = 0
            r3.getClass()
            r2.<init>(r0, r1)
            int r0 = r3.f205f
            r2.f209n = r0
            a5.k r0 = r3.f207h
            r2.f210o = r0
            r2.f211p = r2
            java.lang.String r0 = r3.a
            r2.f220g = r0
            java.lang.String r0 = r3.f201b
            r2.f221h = r0
            java.util.List r0 = r3.f204e
            r2.f219f = r0
            a5.p r0 = r3.f202c
            r2.f223j = r0
            h.c r0 = r3.f206g
            r2.f222i = r0
            java.lang.Object r3 = r3.f208i
            r2.f212q = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.m.<init>(a5.l):void");
    }

    public final void i(o oVar) {
        long length = this.f216b.t(this.f221h).length();
        int i10 = this.f209n;
        if (i10 > 0 && length >= i10) {
            if (v.a) {
                Log.i("TAG_PROXY_DownloadTask", "no necessary to download for " + this.f221h + ", cache file size: " + length + ", max: " + this.f209n);
                return;
            }
            return;
        }
        g();
        throw null;
    }

    public final void j() {
        boolean z10;
        while (true) {
            p pVar = this.f223j;
            if (pVar.f230d < pVar.f231e) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                h();
                o a = this.f223j.a();
                try {
                    i(a);
                    return;
                } catch (r e2) {
                    this.f213r = e2;
                    a();
                    return;
                } catch (d5.b e10) {
                    this.f214s = e10;
                    return;
                } catch (d5.d unused) {
                    p.f226f.add(a.a);
                    a();
                } catch (IOException e11) {
                    if (e11 instanceof SocketTimeoutException) {
                        p.f227g.add(a.a);
                    }
                    if (!b()) {
                        a();
                    }
                } catch (Throwable unused2) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f216b.c(this.f221h);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            j();
        } catch (Throwable unused) {
        }
        this.f218d.set(SystemClock.elapsedRealtime() - elapsedRealtime);
        this.f216b.b(this.f221h);
        k kVar = this.f210o;
        if (kVar != null) {
            kVar.g(this);
        }
    }
}

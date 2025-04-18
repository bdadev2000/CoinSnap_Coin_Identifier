package a5;

import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.p0;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class g extends n {

    /* renamed from: n, reason: collision with root package name */
    public final Socket f192n;

    /* renamed from: o, reason: collision with root package name */
    public final f.a f193o;

    /* renamed from: p, reason: collision with root package name */
    public final e f194p;

    /* renamed from: q, reason: collision with root package name */
    public volatile m f195q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f196r;

    public g(s2.h hVar) {
        super((va.b) hVar.f24169b, (b5.b) hVar.f24170c);
        this.f196r = true;
        this.f192n = (Socket) hVar.f24171d;
        this.f193o = (f.a) hVar.f24172f;
        this.f194p = e.c();
    }

    @Override // a5.n
    public final void d() {
        super.d();
        m mVar = this.f195q;
        this.f195q = null;
        if (mVar != null) {
            mVar.d();
        }
    }

    public final void i(androidx.appcompat.widget.a aVar) {
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
                    j(aVar, a);
                    return;
                } catch (r e2) {
                    if (v.a) {
                        Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e2));
                    }
                    this.f196r = false;
                    a();
                } catch (d5.a e10) {
                    if (v.a) {
                        Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e10));
                        return;
                    }
                    return;
                } catch (d5.b e11) {
                    if (v.a) {
                        Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e11));
                        return;
                    }
                    return;
                } catch (d5.d unused) {
                    p.f226f.add(a.a);
                    a();
                } catch (IOException e12) {
                    if (e12 instanceof SocketTimeoutException) {
                        p.f227g.add(a.a);
                    }
                    if (b()) {
                        if (v.a) {
                            if ("Canceled".equalsIgnoreCase(e12.getMessage())) {
                                Log.w("TAG_PROXY_ProxyTask", "okhttp call canceled");
                            } else {
                                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e12));
                            }
                        }
                    } else {
                        a();
                    }
                } catch (Exception e13) {
                    if (v.a) {
                        Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e13));
                    }
                }
            } else {
                return;
            }
        }
    }

    public final void j(androidx.appcompat.widget.a aVar, o oVar) {
        if (!"HEAD".equalsIgnoreCase(((j) this.f222i.f18523c).f198b)) {
            if (!this.f196r) {
                m mVar = this.f195q;
                this.f195q = null;
                if (mVar != null) {
                    mVar.d();
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                h.c c10 = c(oVar, aVar.f799b, ((p0) this.f222i.f18525f).f1221e, "GET");
                if (c10 == null) {
                    return;
                }
                int i10 = 0;
                try {
                    String f10 = i5.a.f(c10, false, true);
                    if (f10 == null) {
                        try {
                            g();
                            throw null;
                        } catch (Throwable th2) {
                            th = th2;
                            i10 = 0;
                        }
                    } else {
                        try {
                            throw new d5.d(f10 + ", rawKey: " + this.f220g + ", url: " + oVar);
                        } catch (Throwable th3) {
                            th = th3;
                            i10 = 0;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                i5.a.j(c10.j());
                this.f217c.addAndGet(i10);
                this.f218d.addAndGet(SystemClock.elapsedRealtime() - elapsedRealtime);
                throw th;
            }
            this.f216b.t(this.f221h).length();
            int i11 = ((p0) this.f222i.f18525f).f1218b;
            throw null;
        }
        int i12 = ((p0) this.f222i.f18525f).f1218b;
        throw null;
    }

    public final byte[] k(b5.a aVar, androidx.appcompat.widget.a aVar2, o oVar) {
        if (aVar != null) {
            if (v.a) {
                Log.i("TAG_PROXY_ProxyTask", "get header from db");
            }
            return i5.a.d(aVar, aVar2.f799b).getBytes(i5.a.f19154b);
        }
        h.c c10 = c(oVar, 0, -1, "HEAD");
        if (c10 == null) {
            return null;
        }
        try {
            String f10 = i5.a.f(c10, false, false);
            if (f10 == null) {
                b5.a c11 = i5.a.c(c10, null, this.f221h, ((p0) this.f222i.f18525f).f1218b);
                if (v.a) {
                    Log.w("TAG_PROXY_ProxyTask", "get header from network");
                }
                return i5.a.d(c11, aVar2.f799b).getBytes(i5.a.f19154b);
            }
            throw new d5.d(f10 + ", rawKey: " + this.f220g + ", url: " + oVar);
        } finally {
            i5.a.j(c10.j());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f222i = h.c.m(this.f192n.getInputStream());
            this.f192n.getOutputStream();
            int i10 = ((p0) this.f222i.f18525f).f1218b;
            boolean z10 = v.a;
            if (v.a) {
                Log.e("TAG_PROXY_ProxyTask", "cache is null");
            }
        } catch (h e2) {
            i5.a.k(this.f192n);
            if (v.a) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e2));
            }
            if (this.f216b != null) {
                a();
            }
        } catch (IOException e10) {
            i5.a.k(this.f192n);
            if (v.a) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e10));
            }
            if (this.f216b != null) {
                a();
            }
        }
    }
}

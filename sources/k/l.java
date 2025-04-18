package k;

import android.graphics.Bitmap;
import android.webkit.MimeTypeMap;
import com.google.common.net.HttpHeaders;
import d0.b0;
import h.p;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.q;
import okhttp3.CacheControl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.FileSystem;
import okio.Okio;
import okio.Path;

/* loaded from: classes3.dex */
public final class l implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final CacheControl f30885f = new CacheControl.Builder().noCache().noStore().build();

    /* renamed from: g, reason: collision with root package name */
    public static final CacheControl f30886g = new CacheControl.Builder().noCache().onlyIfCached().build();

    /* renamed from: a, reason: collision with root package name */
    public final String f30887a;

    /* renamed from: b, reason: collision with root package name */
    public final q.n f30888b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.h f30889c;
    public final d0.h d;
    public final boolean e;

    public l(String str, q.n nVar, d0.h hVar, d0.h hVar2, boolean z2) {
        this.f30887a = str;
        this.f30888b = nVar;
        this.f30889c = hVar;
        this.d = hVar2;
        this.e = z2;
    }

    public static String d(String str, MediaType mediaType) {
        String b2;
        String mediaType2 = mediaType != null ? mediaType.toString() : null;
        if ((mediaType2 == null || z0.m.q1(mediaType2, "text/plain", false)) && (b2 = v.g.b(MimeTypeMap.getSingleton(), str)) != null) {
            return b2;
        }
        if (mediaType2 != null) {
            return z0.m.v1(mediaType2, ';');
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0136 A[Catch: Exception -> 0x00d2, TryCatch #4 {Exception -> 0x00d2, blocks: (B:29:0x022c, B:30:0x022f, B:39:0x015d, B:41:0x0230, B:42:0x0239, B:83:0x009a, B:85:0x00a5, B:88:0x00d6, B:90:0x00da, B:94:0x00f3, B:96:0x0143, B:100:0x010b, B:102:0x0117, B:103:0x0120, B:105:0x00ba, B:107:0x00c2, B:109:0x012a, B:110:0x0135, B:111:0x0136), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01ef A[Catch: Exception -> 0x021f, TryCatch #0 {Exception -> 0x021f, blocks: (B:16:0x01e7, B:18:0x01ef, B:20:0x0216, B:21:0x021b, B:24:0x0219, B:25:0x0222, B:26:0x022b), top: B:15:0x01e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0222 A[Catch: Exception -> 0x021f, TryCatch #0 {Exception -> 0x021f, blocks: (B:16:0x01e7, B:18:0x01ef, B:20:0x0216, B:21:0x021b, B:24:0x0219, B:25:0x0222, B:26:0x022b), top: B:15:0x01e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0230 A[Catch: Exception -> 0x00d2, TryCatch #4 {Exception -> 0x00d2, blocks: (B:29:0x022c, B:30:0x022f, B:39:0x015d, B:41:0x0230, B:42:0x0239, B:83:0x009a, B:85:0x00a5, B:88:0x00d6, B:90:0x00da, B:94:0x00f3, B:96:0x0143, B:100:0x010b, B:102:0x0117, B:103:0x0120, B:105:0x00ba, B:107:0x00c2, B:109:0x012a, B:110:0x0135, B:111:0x0136), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009a A[Catch: Exception -> 0x00d2, TRY_ENTER, TryCatch #4 {Exception -> 0x00d2, blocks: (B:29:0x022c, B:30:0x022f, B:39:0x015d, B:41:0x0230, B:42:0x0239, B:83:0x009a, B:85:0x00a5, B:88:0x00d6, B:90:0x00da, B:94:0x00f3, B:96:0x0143, B:100:0x010b, B:102:0x0117, B:103:0x0120, B:105:0x00ba, B:107:0x00c2, B:109:0x012a, B:110:0x0135, B:111:0x0136), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // k.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(h0.g r18) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.l.a(h0.g):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(okhttp3.Request r5, h0.g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof k.j
            if (r0 == 0) goto L13
            r0 = r6
            k.j r0 = (k.j) r0
            int r1 = r0.f30879c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30879c = r1
            goto L18
        L13:
            k.j r0 = new k.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f30877a
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f30879c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.jvm.internal.q.m(r6)
            goto L8b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.jvm.internal.q.m(r6)
            android.graphics.Bitmap$Config[] r6 = v.g.f31378a
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r6 = p0.a.g(r6, r2)
            d0.h r2 = r4.f30889c
            if (r6 == 0) goto L61
            q.n r6 = r4.f30888b
            q.b r6 = r6.f31326o
            boolean r6 = r6.f31236a
            if (r6 != 0) goto L5b
            java.lang.Object r6 = r2.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.newCall(r5)
            okhttp3.Response r5 = r5.execute()
            goto L8e
        L5b:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L61:
            java.lang.Object r6 = r2.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.newCall(r5)
            r0.f30879c = r3
            b1.l r6 = new b1.l
            h0.g r0 = b1.f0.r(r0)
            r6.<init>(r3, r0)
            r6.p()
            v.h r0 = new v.h
            r0.<init>(r5, r6)
            r5.enqueue(r0)
            r6.z(r0)
            java.lang.Object r6 = r6.o()
            if (r6 != r1) goto L8b
            return r1
        L8b:
            r5 = r6
            okhttp3.Response r5 = (okhttp3.Response) r5
        L8e:
            boolean r6 = r5.isSuccessful()
            if (r6 != 0) goto Lc9
            int r6 = r5.code()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto Lc9
            okhttp3.ResponseBody r6 = r5.body()
            if (r6 == 0) goto La5
            v.g.a(r6)
        La5:
            d0.e r6 = new d0.e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HTTP "
            r0.<init>(r1)
            int r1 = r5.code()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r5 = r5.message()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        Lc9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k.l.b(okhttp3.Request, h0.g):java.lang.Object");
    }

    public final FileSystem c() {
        Object value = this.d.getValue();
        p0.a.p(value);
        return ((i.n) ((i.c) value)).f30804a;
    }

    public final Request e() {
        Request.Builder url = new Request.Builder().url(this.f30887a);
        q.n nVar = this.f30888b;
        Request.Builder headers = url.headers(nVar.f31321j);
        for (Map.Entry entry : nVar.f31322k.f31338a.entrySet()) {
            Object key = entry.getKey();
            p0.a.q(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            headers.tag((Class) key, entry.getValue());
        }
        q.b bVar = nVar.f31325n;
        boolean z2 = bVar.f31236a;
        boolean z3 = nVar.f31326o.f31236a;
        if (!z3 && z2) {
            headers.cacheControl(CacheControl.FORCE_CACHE);
        } else if (!z3 || z2) {
            if (!z3 && !z2) {
                headers.cacheControl(f30886g);
            }
        } else if (bVar.f31237b) {
            headers.cacheControl(CacheControl.FORCE_NETWORK);
        } else {
            headers.cacheControl(f30885f);
        }
        return headers.build();
    }

    public final p.c f(i.m mVar) {
        Throwable th;
        p.c cVar;
        try {
            FileSystem c2 = c();
            i.f fVar = mVar.f30803a;
            if (!(!fVar.f30779b)) {
                throw new IllegalStateException("snapshot is closed".toString());
            }
            BufferedSource buffer = Okio.buffer(c2.source((Path) fVar.f30778a.f30773c.get(0)));
            try {
                cVar = new p.c(buffer);
                try {
                    buffer.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (buffer != null) {
                    try {
                        buffer.close();
                    } catch (Throwable th4) {
                        q.a(th3, th4);
                    }
                }
                th = th3;
                cVar = null;
            }
            if (th != null) {
                throw th;
            }
            p0.a.p(cVar);
            return cVar;
        } catch (IOException unused) {
            return null;
        }
    }

    public final p g(i.m mVar) {
        i.f fVar = mVar.f30803a;
        if (!(!fVar.f30779b)) {
            throw new IllegalStateException("snapshot is closed".toString());
        }
        Path path = (Path) fVar.f30778a.f30773c.get(1);
        FileSystem c2 = c();
        String str = this.f30888b.f31320i;
        if (str == null) {
            str = this.f30887a;
        }
        return new p(path, c2, str, mVar);
    }

    public final i.m h(i.b bVar, Request request, Response response, p.c cVar) {
        i.l lVar;
        Throwable th;
        b0 b0Var;
        Long l2;
        b0 b0Var2;
        i.d e;
        Throwable th2 = null;
        if (!this.f30888b.f31325n.f31237b || (this.e && (request.cacheControl().noStore() || response.cacheControl().noStore() || p0.a.g(response.headers().get(HttpHeaders.VARY), "*")))) {
            if (bVar != null) {
                v.g.a(bVar);
            }
            return null;
        }
        if (bVar != null) {
            i.f fVar = ((i.m) bVar).f30803a;
            i.j jVar = fVar.f30780c;
            synchronized (jVar) {
                fVar.close();
                e = jVar.e(fVar.f30778a.f30771a);
            }
            if (e != null) {
                lVar = new i.l(e);
            }
            lVar = null;
        } else {
            i.c cVar2 = (i.c) this.d.getValue();
            if (cVar2 != null) {
                String str = this.f30888b.f31320i;
                if (str == null) {
                    str = this.f30887a;
                }
                i.d e2 = ((i.n) cVar2).f30805b.e(ByteString.Companion.encodeUtf8(str).sha256().hex());
                if (e2 != null) {
                    lVar = new i.l(e2);
                }
            }
            lVar = null;
        }
        if (lVar == null) {
            return null;
        }
        try {
            try {
                if (response.code() != 304 || cVar == null) {
                    BufferedSink buffer = Okio.buffer(c().sink(lVar.f30802a.b(0), false));
                    try {
                        new p.c(response).a(buffer);
                        b0Var = b0.f30125a;
                        try {
                            buffer.close();
                            th = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        if (buffer != null) {
                            try {
                                buffer.close();
                            } catch (Throwable th5) {
                                q.a(th4, th5);
                            }
                        }
                        th = th4;
                        b0Var = null;
                    }
                    if (th != null) {
                        throw th;
                    }
                    p0.a.p(b0Var);
                    BufferedSink buffer2 = Okio.buffer(c().sink(lVar.f30802a.b(1), false));
                    try {
                        ResponseBody body = response.body();
                        p0.a.p(body);
                        l2 = Long.valueOf(body.source().readAll(buffer2));
                        if (buffer2 != null) {
                            try {
                                buffer2.close();
                            } catch (Throwable th6) {
                                th2 = th6;
                            }
                        }
                    } catch (Throwable th7) {
                        if (buffer2 != null) {
                            try {
                                buffer2.close();
                            } catch (Throwable th8) {
                                q.a(th7, th8);
                            }
                        }
                        th2 = th7;
                        l2 = null;
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                    p0.a.p(l2);
                } else {
                    Response build = response.newBuilder().headers(p.d.a(cVar.f31214f, response.headers())).build();
                    BufferedSink buffer3 = Okio.buffer(c().sink(lVar.f30802a.b(0), false));
                    try {
                        new p.c(build).a(buffer3);
                        b0Var2 = b0.f30125a;
                        try {
                            buffer3.close();
                        } catch (Throwable th9) {
                            th2 = th9;
                        }
                    } catch (Throwable th10) {
                        if (buffer3 != null) {
                            try {
                                buffer3.close();
                            } catch (Throwable th11) {
                                q.a(th10, th11);
                            }
                        }
                        th2 = th10;
                        b0Var2 = null;
                    }
                    if (th2 != null) {
                        throw th2;
                    }
                    p0.a.p(b0Var2);
                }
                i.m a2 = lVar.a();
                v.g.a(response);
                return a2;
            } catch (Exception e3) {
                Bitmap.Config[] configArr = v.g.f31378a;
                try {
                    lVar.f30802a.a(false);
                } catch (Exception unused) {
                }
                throw e3;
            }
        } catch (Throwable th12) {
            v.g.a(response);
            throw th12;
        }
    }
}

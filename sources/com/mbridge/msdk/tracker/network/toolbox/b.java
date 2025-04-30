package com.mbridge.msdk.tracker.network.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.aa;
import com.mbridge.msdk.tracker.network.ab;
import com.mbridge.msdk.tracker.network.ac;
import com.mbridge.msdk.tracker.network.ad;
import com.mbridge.msdk.tracker.network.ae;
import com.mbridge.msdk.tracker.network.b;
import com.mbridge.msdk.tracker.network.p;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.r;
import com.mbridge.msdk.tracker.network.s;
import com.mbridge.msdk.tracker.network.toolbox.i;
import com.mbridge.msdk.tracker.network.u;
import com.mbridge.msdk.tracker.network.z;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b implements com.mbridge.msdk.tracker.network.n {

    /* renamed from: a, reason: collision with root package name */
    protected final c f18236a;
    private final a b;

    public b(a aVar) {
        this(aVar, new c(4096));
    }

    private static q b(u<?> uVar) {
        String str;
        if (uVar != null) {
            try {
                if (uVar.d() && !TextUtils.isEmpty(uVar.k())) {
                    if (uVar.i() == 0) {
                        str = "GET";
                    } else {
                        str = "POST";
                    }
                    q qVar = new q(uVar.f(), str);
                    qVar.d("queue");
                    qVar.c(uVar.d("local_id"));
                    qVar.b(uVar.d("ad_type"));
                    qVar.a(uVar.v());
                    uVar.a(qVar);
                    return qVar;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    @Override // com.mbridge.msdk.tracker.network.n
    public final r a(u<?> uVar) throws ad {
        g gVar;
        byte[] bArr;
        i.a aVar;
        z b;
        Map<String, String> map;
        byte[] bArr2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        q b8 = b(uVar);
        do {
            Collections.emptyList();
            try {
                b.a m = uVar.m();
                if (m == null) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    String str = m.b;
                    if (str != null) {
                        hashMap.put("If-None-Match", str);
                    }
                    long j7 = m.f18165d;
                    if (j7 > 0) {
                        hashMap.put("If-Modified-Since", f.a(j7));
                    }
                    map = hashMap;
                }
                gVar = this.b.a(uVar, map);
                try {
                    int a6 = gVar.a();
                    if (b8 != null) {
                        try {
                            b8.a(a6);
                        } catch (Exception unused) {
                        }
                    }
                    List<com.mbridge.msdk.tracker.network.h> b9 = gVar.b();
                    if (a6 == 304) {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        b.a m2 = uVar.m();
                        if (m2 == null) {
                            return new r(304, null, true, elapsedRealtime2, b9);
                        }
                        return new r(304, m2.f18163a, true, elapsedRealtime2, f.a(b9, m2));
                    }
                    InputStream d2 = gVar.d();
                    if (d2 != null) {
                        bArr2 = i.a(d2, gVar.c(), this.f18236a, b8);
                    } else {
                        bArr2 = new byte[0];
                    }
                    byte[] bArr3 = bArr2;
                    if (b8 != null && bArr3 != null) {
                        try {
                            b8.h(bArr3.length);
                        } catch (Exception unused2) {
                        }
                    }
                    try {
                        long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        if (elapsedRealtime3 > 3000) {
                            ae.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", uVar, Long.valueOf(elapsedRealtime3), bArr3 != null ? Integer.valueOf(bArr3.length) : "null", Integer.valueOf(a6), Integer.valueOf(uVar.b().c()));
                        }
                        if (a6 >= 200 && a6 <= 299) {
                            a(b8, 1, null);
                            return new r(a6, bArr3, false, SystemClock.elapsedRealtime() - elapsedRealtime, b9);
                        }
                        throw new IOException();
                    } catch (IOException e4) {
                        e = e4;
                        bArr = bArr3;
                        a(b8, TextUtils.equals(e.getMessage(), "timeout") ? 3 : 2, e);
                        if (e instanceof SocketTimeoutException) {
                            aVar = new i.a("socket", new ab());
                        } else {
                            if (e instanceof MalformedURLException) {
                                throw new com.mbridge.msdk.tracker.network.a("Bad URL " + uVar.k());
                            }
                            if (gVar != null) {
                                int a9 = gVar.a();
                                ae.c("Unexpected response code %d for %s", Integer.valueOf(a9), uVar.k());
                                if (bArr != null) {
                                    r rVar = new r(a9, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, gVar.b());
                                    if (a9 >= 400 && a9 <= 499) {
                                        com.mbridge.msdk.tracker.network.d dVar = new com.mbridge.msdk.tracker.network.d(rVar);
                                        dVar.a(a9);
                                        throw dVar;
                                    }
                                    aa aaVar = new aa(rVar);
                                    aaVar.a(a9);
                                    if (a9 < 500) {
                                        throw aaVar;
                                    }
                                    if (a9 <= 599) {
                                        if (uVar.s()) {
                                            aVar = new i.a("server", aaVar);
                                        } else {
                                            throw aaVar;
                                        }
                                    } else {
                                        throw aaVar;
                                    }
                                } else {
                                    p pVar = new p();
                                    pVar.a(a9);
                                    aVar = new i.a("network", pVar);
                                }
                            } else if (uVar.t()) {
                                aVar = new i.a("connection", new s());
                            } else {
                                throw new s(e);
                            }
                        }
                        if (uVar != null) {
                            b = uVar.b();
                            if (b == null) {
                                throw aVar.b;
                            }
                        } else {
                            throw new ac("request is null when retrying");
                        }
                    }
                } catch (IOException e9) {
                    e = e9;
                    bArr = null;
                }
            } catch (IOException e10) {
                e = e10;
                gVar = null;
                bArr = null;
            }
        } while (b.a(aVar.b));
        throw aVar.b;
    }

    private b(a aVar, c cVar) {
        this.b = aVar;
        this.f18236a = cVar;
    }

    private static void a(q qVar, int i9, Exception exc) {
        if (qVar != null) {
            try {
                qVar.a(exc);
                qVar.b(i9);
            } catch (Exception unused) {
            }
        }
    }
}

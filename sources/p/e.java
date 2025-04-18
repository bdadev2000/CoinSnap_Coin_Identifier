package p;

import android.graphics.Bitmap;
import com.google.android.gms.common.api.Api;
import com.google.common.net.HttpHeaders;
import java.util.Date;
import okhttp3.Headers;
import okhttp3.Request;
import z0.m;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Request f31215a;

    /* renamed from: b, reason: collision with root package name */
    public final c f31216b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f31217c;
    public final String d;
    public final Date e;

    /* renamed from: f, reason: collision with root package name */
    public final String f31218f;

    /* renamed from: g, reason: collision with root package name */
    public final Date f31219g;

    /* renamed from: h, reason: collision with root package name */
    public final long f31220h;

    /* renamed from: i, reason: collision with root package name */
    public final long f31221i;

    /* renamed from: j, reason: collision with root package name */
    public final String f31222j;

    /* renamed from: k, reason: collision with root package name */
    public final int f31223k;

    public e(Request request, c cVar) {
        int i2;
        this.f31215a = request;
        this.f31216b = cVar;
        this.f31223k = -1;
        if (cVar != null) {
            this.f31220h = cVar.f31213c;
            this.f31221i = cVar.d;
            Headers headers = cVar.f31214f;
            int size = headers.size();
            for (int i3 = 0; i3 < size; i3++) {
                String name = headers.name(i3);
                if (m.S0(name, HttpHeaders.DATE, true)) {
                    this.f31217c = headers.getDate(HttpHeaders.DATE);
                    this.d = headers.value(i3);
                } else if (m.S0(name, HttpHeaders.EXPIRES, true)) {
                    this.f31219g = headers.getDate(HttpHeaders.EXPIRES);
                } else if (m.S0(name, HttpHeaders.LAST_MODIFIED, true)) {
                    this.e = headers.getDate(HttpHeaders.LAST_MODIFIED);
                    this.f31218f = headers.value(i3);
                } else if (m.S0(name, HttpHeaders.ETAG, true)) {
                    this.f31222j = headers.value(i3);
                } else if (m.S0(name, HttpHeaders.AGE, true)) {
                    String value = headers.value(i3);
                    Bitmap.Config[] configArr = v.g.f31378a;
                    Long K0 = z0.j.K0(value);
                    if (K0 != null) {
                        long longValue = K0.longValue();
                        i2 = longValue > 2147483647L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : longValue < 0 ? 0 : (int) longValue;
                    } else {
                        i2 = -1;
                    }
                    this.f31223k = i2;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d9, code lost:
    
        if (r7 > 0) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p.f a() {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.a():p.f");
    }
}

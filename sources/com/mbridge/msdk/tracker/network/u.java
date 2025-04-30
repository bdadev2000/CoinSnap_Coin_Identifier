package com.mbridge.msdk.tracker.network;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.ae;
import com.mbridge.msdk.tracker.network.b;
import com.mbridge.msdk.tracker.network.w;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public abstract class u<T> implements Comparable<u<T>> {

    /* renamed from: a, reason: collision with root package name */
    private c f18250a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private volatile q f18251c;

    /* renamed from: d, reason: collision with root package name */
    private long f18252d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, String> f18253e;

    /* renamed from: f, reason: collision with root package name */
    private final ae.a f18254f;

    /* renamed from: g, reason: collision with root package name */
    private int f18255g;

    /* renamed from: h, reason: collision with root package name */
    private final String f18256h;

    /* renamed from: i, reason: collision with root package name */
    private final int f18257i;

    /* renamed from: j, reason: collision with root package name */
    private final String f18258j;

    /* renamed from: k, reason: collision with root package name */
    private final int f18259k;
    private final Object l;
    private w.a m;

    /* renamed from: n, reason: collision with root package name */
    private Integer f18260n;

    /* renamed from: o, reason: collision with root package name */
    private v f18261o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18262p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f18263q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f18264r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f18265s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f18266t;

    /* renamed from: u, reason: collision with root package name */
    private z f18267u;

    /* renamed from: v, reason: collision with root package name */
    private b.a f18268v;

    /* renamed from: w, reason: collision with root package name */
    private a f18269w;

    /* renamed from: x, reason: collision with root package name */
    private long f18270x;

    /* loaded from: classes3.dex */
    public interface a {
        void a(u<?> uVar);

        void a(u<?> uVar, w<?> wVar);
    }

    /* loaded from: classes3.dex */
    public enum b {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public u(int i9, String str) {
        this(i9, str, 0);
    }

    public abstract w<T> a(r rVar);

    public Map<String, String> a() {
        return null;
    }

    public abstract void a(T t9);

    public final void b(int i9) {
        v vVar = this.f18261o;
        if (vVar != null) {
            vVar.a(this, i9);
        }
    }

    public final void c(String str) {
        v vVar = this.f18261o;
        if (vVar != null) {
            vVar.b(this);
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        u uVar = (u) obj;
        b e4 = e();
        b e9 = uVar.e();
        if (e4 == e9) {
            return this.f18260n.intValue() - uVar.f18260n.intValue();
        }
        return e9.ordinal() - e4.ordinal();
    }

    public boolean d() {
        return false;
    }

    public b e() {
        return b.NORMAL;
    }

    public final String f() {
        return this.f18258j;
    }

    public final long g() {
        return SystemClock.elapsedRealtime() - this.f18252d;
    }

    public final int h() {
        return this.f18257i;
    }

    public final int i() {
        return this.f18255g;
    }

    public final int j() {
        return this.f18259k;
    }

    public final String k() {
        return this.f18256h;
    }

    public final String l() {
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        if (this.f18250a == null) {
            this.f18250a = new com.mbridge.msdk.tracker.network.toolbox.e();
        }
        String a6 = this.f18250a.a(this);
        this.b = a6;
        return a6;
    }

    public final b.a m() {
        return this.f18268v;
    }

    public final boolean n() {
        boolean z8;
        synchronized (this.l) {
            z8 = this.f18263q;
        }
        return z8;
    }

    public final String o() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public final byte[] p() {
        Map<String, String> a6 = a();
        if (a6 != null && a6.size() > 0) {
            byte[] a9 = a(a6, "UTF-8");
            this.f18270x = a9.length;
            return a9;
        }
        this.f18270x = 0L;
        return null;
    }

    public final long q() {
        return this.f18270x;
    }

    public final boolean r() {
        return this.f18262p;
    }

    public final boolean s() {
        return this.f18265s;
    }

    public final boolean t() {
        return this.f18266t;
    }

    public String toString() {
        String str;
        String str2 = "0x" + Integer.toHexString(this.f18259k);
        StringBuilder sb = new StringBuilder();
        if (n()) {
            str = "[X] ";
        } else {
            str = "[ ] ";
        }
        sb.append(str);
        AbstractC2914a.j(sb, this.f18256h, " ", str2, " ");
        sb.append(e());
        sb.append(" ");
        sb.append(this.f18260n);
        return sb.toString();
    }

    public final int u() {
        z b8 = b();
        if (b8 == null) {
            return 30000;
        }
        return b8.a();
    }

    public final long v() {
        z b8 = b();
        if (b8 == null) {
            return 30000L;
        }
        long b9 = b8.b();
        if (b9 < 0) {
            return 30000L;
        }
        return b9;
    }

    public final void w() {
        synchronized (this.l) {
            this.f18264r = true;
        }
    }

    public final boolean x() {
        boolean z8;
        synchronized (this.l) {
            z8 = this.f18264r;
        }
        return z8;
    }

    public final void y() {
        a aVar;
        synchronized (this.l) {
            aVar = this.f18269w;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public final q z() {
        return this.f18251c;
    }

    public u(int i9, String str, int i10) {
        this(i9, str, i10, "un_known");
    }

    public final void a(w.a aVar) {
        this.m = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u<?> d(boolean z8) {
        this.f18266t = z8;
        return this;
    }

    public u(int i9, String str, int i10, String str2) {
        Uri parse;
        String host;
        this.f18254f = null;
        this.l = new Object();
        int i11 = 0;
        this.f18262p = false;
        this.f18263q = false;
        this.f18264r = false;
        this.f18265s = false;
        this.f18266t = false;
        this.f18268v = null;
        this.f18270x = 0L;
        this.f18255g = i9;
        this.f18256h = str;
        this.f18257i = i10;
        this.f18258j = str2;
        this.f18267u = new e();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i11 = host.hashCode();
        }
        this.f18259k = i11;
        this.f18252d = SystemClock.elapsedRealtime();
    }

    public final void a(int i9) {
        this.f18255g = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u<?> b(boolean z8) {
        this.f18262p = z8;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u<?> c(int i9) {
        this.f18260n = Integer.valueOf(i9);
        return this;
    }

    public final String d(String str) {
        if (this.f18253e != null && !TextUtils.isEmpty(str)) {
            try {
                return this.f18253e.get(str);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u<?> a(v vVar) {
        this.f18261o = vVar;
        return this;
    }

    public z b() {
        return this.f18267u;
    }

    public Map<String, String> c() {
        return Collections.emptyMap();
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            int i9 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i9++;
                if (entry.getKey() != null) {
                    sb.append(URLEncoder.encode(entry.getKey(), str));
                    sb.append('=');
                    sb.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i9 <= map.size() - 1) {
                        sb.append('&');
                    }
                }
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e4) {
            throw new RuntimeException(AbstractC2914a.d("Encoding not supported: ", str), e4);
        }
    }

    public final void b(ad adVar) {
        w.a aVar;
        synchronized (this.l) {
            aVar = this.m;
        }
        if (aVar != null) {
            aVar.a(adVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u<?> c(boolean z8) {
        this.f18265s = z8;
        return this;
    }

    public final void c(String str, String str2) {
        if (this.f18253e == null) {
            this.f18253e = new HashMap();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                this.f18253e.put(str, str2);
            } catch (Exception unused) {
            }
        }
    }

    public final void a(w<?> wVar) {
        a aVar;
        synchronized (this.l) {
            aVar = this.f18269w;
        }
        if (aVar != null) {
            aVar.a(this, wVar);
        }
    }

    public final void a(q qVar) {
        this.f18251c = qVar;
    }
}

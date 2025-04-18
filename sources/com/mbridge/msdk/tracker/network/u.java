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
import kotlin.text.Typography;

/* loaded from: classes4.dex */
public abstract class u<T> implements Comparable<u<T>> {
    private c a;

    /* renamed from: b, reason: collision with root package name */
    private String f15487b;

    /* renamed from: c, reason: collision with root package name */
    private volatile q f15488c;

    /* renamed from: d, reason: collision with root package name */
    private long f15489d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, String> f15490e;

    /* renamed from: f, reason: collision with root package name */
    private final ae.a f15491f;

    /* renamed from: g, reason: collision with root package name */
    private int f15492g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15493h;

    /* renamed from: i, reason: collision with root package name */
    private final int f15494i;

    /* renamed from: j, reason: collision with root package name */
    private final String f15495j;

    /* renamed from: k, reason: collision with root package name */
    private final int f15496k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f15497l;

    /* renamed from: m, reason: collision with root package name */
    private w.a f15498m;

    /* renamed from: n, reason: collision with root package name */
    private Integer f15499n;

    /* renamed from: o, reason: collision with root package name */
    private v f15500o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f15501p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f15502q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f15503r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f15504s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f15505t;
    private z u;

    /* renamed from: v, reason: collision with root package name */
    private b.a f15506v;

    /* renamed from: w, reason: collision with root package name */
    private a f15507w;

    /* renamed from: x, reason: collision with root package name */
    private long f15508x;

    /* loaded from: classes4.dex */
    public interface a {
        void a(u<?> uVar);

        void a(u<?> uVar, w<?> wVar);
    }

    /* loaded from: classes4.dex */
    public enum b {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public u(int i10, String str) {
        this(i10, str, 0);
    }

    public abstract w<T> a(r rVar);

    public Map<String, String> a() {
        return null;
    }

    public abstract void a(T t5);

    public final void b(int i10) {
        v vVar = this.f15500o;
        if (vVar != null) {
            vVar.a(this, i10);
        }
    }

    public final void c(String str) {
        v vVar = this.f15500o;
        if (vVar != null) {
            vVar.b(this);
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        u uVar = (u) obj;
        b e2 = e();
        b e10 = uVar.e();
        if (e2 == e10) {
            return this.f15499n.intValue() - uVar.f15499n.intValue();
        }
        return e10.ordinal() - e2.ordinal();
    }

    public boolean d() {
        return false;
    }

    public b e() {
        return b.NORMAL;
    }

    public final String f() {
        return this.f15495j;
    }

    public final long g() {
        return SystemClock.elapsedRealtime() - this.f15489d;
    }

    public final int h() {
        return this.f15494i;
    }

    public final int i() {
        return this.f15492g;
    }

    public final int j() {
        return this.f15496k;
    }

    public final String k() {
        return this.f15493h;
    }

    public final String l() {
        if (!TextUtils.isEmpty(this.f15487b)) {
            return this.f15487b;
        }
        if (this.a == null) {
            this.a = new com.mbridge.msdk.tracker.network.toolbox.e();
        }
        String a10 = this.a.a(this);
        this.f15487b = a10;
        return a10;
    }

    public final b.a m() {
        return this.f15506v;
    }

    public final boolean n() {
        boolean z10;
        synchronized (this.f15497l) {
            z10 = this.f15502q;
        }
        return z10;
    }

    public final String o() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public final byte[] p() {
        Map<String, String> a10 = a();
        if (a10 != null && a10.size() > 0) {
            byte[] a11 = a(a10, "UTF-8");
            this.f15508x = a11.length;
            return a11;
        }
        this.f15508x = 0L;
        return null;
    }

    public final long q() {
        return this.f15508x;
    }

    public final boolean r() {
        return this.f15501p;
    }

    public final boolean s() {
        return this.f15504s;
    }

    public final boolean t() {
        return this.f15505t;
    }

    public String toString() {
        String str;
        String str2 = "0x" + Integer.toHexString(this.f15496k);
        StringBuilder sb2 = new StringBuilder();
        if (n()) {
            str = "[X] ";
        } else {
            str = "[ ] ";
        }
        sb2.append(str);
        sb2.append(this.f15493h);
        sb2.append(" ");
        sb2.append(str2);
        sb2.append(" ");
        sb2.append(e());
        sb2.append(" ");
        sb2.append(this.f15499n);
        return sb2.toString();
    }

    public final int u() {
        z b3 = b();
        if (b3 == null) {
            return 30000;
        }
        return b3.a();
    }

    public final long v() {
        z b3 = b();
        if (b3 == null) {
            return 30000L;
        }
        long b10 = b3.b();
        if (b10 < 0) {
            return 30000L;
        }
        return b10;
    }

    public final void w() {
        synchronized (this.f15497l) {
            this.f15503r = true;
        }
    }

    public final boolean x() {
        boolean z10;
        synchronized (this.f15497l) {
            z10 = this.f15503r;
        }
        return z10;
    }

    public final void y() {
        a aVar;
        synchronized (this.f15497l) {
            aVar = this.f15507w;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public final q z() {
        return this.f15488c;
    }

    public u(int i10, String str, int i11) {
        this(i10, str, i11, "un_known");
    }

    public final void a(w.a aVar) {
        this.f15498m = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u<?> d(boolean z10) {
        this.f15505t = z10;
        return this;
    }

    public u(int i10, String str, int i11, String str2) {
        Uri parse;
        String host;
        this.f15491f = null;
        this.f15497l = new Object();
        int i12 = 0;
        this.f15501p = false;
        this.f15502q = false;
        this.f15503r = false;
        this.f15504s = false;
        this.f15505t = false;
        this.f15506v = null;
        this.f15508x = 0L;
        this.f15492g = i10;
        this.f15493h = str;
        this.f15494i = i11;
        this.f15495j = str2;
        this.u = new e();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i12 = host.hashCode();
        }
        this.f15496k = i12;
        this.f15489d = SystemClock.elapsedRealtime();
    }

    public final void a(int i10) {
        this.f15492g = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u<?> b(boolean z10) {
        this.f15501p = z10;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u<?> c(int i10) {
        this.f15499n = Integer.valueOf(i10);
        return this;
    }

    public final String d(String str) {
        if (this.f15490e != null && !TextUtils.isEmpty(str)) {
            try {
                return this.f15490e.get(str);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u<?> a(v vVar) {
        this.f15500o = vVar;
        return this;
    }

    public z b() {
        return this.u;
    }

    public Map<String, String> c() {
        return Collections.emptyMap();
    }

    private byte[] a(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i10++;
                if (entry.getKey() != null) {
                    sb2.append(URLEncoder.encode(entry.getKey(), str));
                    sb2.append('=');
                    sb2.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i10 <= map.size() - 1) {
                        sb2.append(Typography.amp);
                    }
                }
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(vd.e.e("Encoding not supported: ", str), e2);
        }
    }

    public final void b(ad adVar) {
        w.a aVar;
        synchronized (this.f15497l) {
            aVar = this.f15498m;
        }
        if (aVar != null) {
            aVar.a(adVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u<?> c(boolean z10) {
        this.f15504s = z10;
        return this;
    }

    public final void c(String str, String str2) {
        if (this.f15490e == null) {
            this.f15490e = new HashMap();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                this.f15490e.put(str, str2);
            } catch (Exception unused) {
            }
        }
    }

    public final void a(w<?> wVar) {
        a aVar;
        synchronized (this.f15497l) {
            aVar = this.f15507w;
        }
        if (aVar != null) {
            aVar.a(this, wVar);
        }
    }

    public final void a(q qVar) {
        this.f15488c = qVar;
    }
}

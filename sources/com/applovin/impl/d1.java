package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.e1;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class d1 extends c1 {

    /* renamed from: f, reason: collision with root package name */
    private final String f4170f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f4171g;

    /* renamed from: h, reason: collision with root package name */
    private final List f4172h;

    /* renamed from: i, reason: collision with root package name */
    private final s2 f4173i;

    /* renamed from: j, reason: collision with root package name */
    private final c f4174j;

    /* renamed from: k, reason: collision with root package name */
    private StringBuffer f4175k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f4176l;

    /* renamed from: m, reason: collision with root package name */
    private final ExecutorService f4177m;

    /* renamed from: n, reason: collision with root package name */
    private List f4178n;

    /* loaded from: classes.dex */
    public class a implements e1.a {
        final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.applovin.impl.e1.a
        public void a(Uri uri) {
            if (uri != null) {
                synchronized (d1.this.f4176l) {
                    int indexOf = d1.this.f4175k.indexOf(this.a);
                    d1.this.f4175k.replace(indexOf, this.a.length() + indexOf, uri.toString());
                }
                d1.this.f4171g.a(uri);
                d1.this.f4173i.b();
                return;
            }
            com.applovin.impl.sdk.t tVar = d1.this.f3975c;
            if (com.applovin.impl.sdk.t.a()) {
                d1 d1Var = d1.this;
                d1Var.f3975c.a(d1Var.f3974b, "Failed to cache JavaScript resource " + this.a);
            }
            if (d1.this.f4174j != null) {
                d1.this.f4174j.a(d1.this.f4170f, true);
            }
            d1.this.f4173i.a();
        }
    }

    /* loaded from: classes.dex */
    public class b implements e1.a {
        final /* synthetic */ String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f4180b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f4181c;

        public b(String str, String str2, String str3) {
            this.a = str;
            this.f4180b = str2;
            this.f4181c = str3;
        }

        @Override // com.applovin.impl.e1.a
        public void a(Uri uri) {
            if (uri != null) {
                synchronized (d1.this.f4176l) {
                    int indexOf = d1.this.f4175k.indexOf(this.a);
                    d1.this.f4175k.replace(indexOf, this.a.length() + indexOf, uri.toString());
                }
                d1.this.f4171g.a(uri);
                d1.this.f4173i.b();
                return;
            }
            if (d1.this.f4171g.W().contains(this.f4180b + this.f4181c) && d1.this.f4174j != null) {
                d1.this.f4174j.a(d1.this.f4170f, true);
            }
            d1.this.f4173i.a();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(String str, boolean z10);
    }

    public d1(String str, com.applovin.impl.sdk.ad.b bVar, List list, s2 s2Var, ExecutorService executorService, com.applovin.impl.sdk.k kVar, c cVar) {
        super("AsyncTaskCacheHTMLResources", kVar);
        this.f4170f = str;
        this.f4171g = bVar;
        this.f4172h = list;
        this.f4173i = s2Var;
        this.f4177m = executorService;
        this.f4174j = cVar;
        this.f4175k = new StringBuffer(str);
        this.f4176l = new Object();
    }

    private void a(String str) {
        c cVar;
        if (this.f3977e.get() || (cVar = this.f4174j) == null) {
            return;
        }
        cVar.a(str, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.HashSet c() {
        /*
            r21 = this;
            r0 = r21
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Collection r2 = r21.e()
            java.util.List r3 = r0.f4172h
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lee
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            r6 = r5
            r7 = r6
        L20:
            java.lang.String r8 = r0.f4170f
            int r8 = r8.length()
            if (r6 >= r8) goto L11
            java.util.concurrent.atomic.AtomicBoolean r6 = r0.f3977e
            boolean r6 = r6.get()
            r8 = 0
            if (r6 == 0) goto L32
            return r8
        L32:
            java.lang.String r6 = r0.f4170f
            int r6 = r6.indexOf(r4, r7)
            r7 = -1
            if (r6 != r7) goto L3c
            goto L11
        L3c:
            java.lang.String r7 = r0.f4170f
            int r7 = r7.length()
            r9 = r6
        L43:
            java.lang.String r10 = r0.f4170f
            char r10 = r10.charAt(r9)
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            boolean r10 = r2.contains(r10)
            if (r10 != 0) goto L58
            if (r9 >= r7) goto L58
            int r9 = r9 + 1
            goto L43
        L58:
            if (r9 <= r6) goto Lde
            if (r9 == r7) goto Lde
            java.lang.String r7 = r0.f4170f
            int r8 = r4.length()
            int r8 = r8 + r6
            java.lang.String r7 = r7.substring(r8, r9)
            boolean r8 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r7)
            if (r8 == 0) goto Lcc
            com.applovin.impl.sdk.ad.b r8 = r0.f4171g
            boolean r8 = r8.I0()
            if (r8 == 0) goto La2
            com.applovin.impl.sdk.ad.b r8 = r0.f4171g
            java.lang.String r8 = r8.P()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto La2
            boolean r8 = com.applovin.impl.sdk.t.a()
            if (r8 == 0) goto Ldb
            com.applovin.impl.sdk.t r8 = r0.f3975c
            java.lang.String r10 = r0.f3974b
            java.lang.String r11 = "Postponing caching for \""
            java.lang.String r12 = "\" video resource"
            a4.j.x(r11, r7, r12, r8, r10)
            goto Ldb
        La2:
            java.lang.String r14 = eb.j.k(r4, r7)
            com.applovin.impl.e1 r8 = new com.applovin.impl.e1
            com.applovin.impl.sdk.ad.b r15 = r0.f4171g
            r10 = 1
            java.lang.String[] r10 = new java.lang.String[r10]
            r10[r5] = r4
            java.util.List r16 = java.util.Arrays.asList(r10)
            com.applovin.impl.s2 r10 = r0.f4173i
            com.applovin.impl.sdk.k r11 = r0.a
            com.applovin.impl.d1$b r12 = new com.applovin.impl.d1$b
            r12.<init>(r14, r4, r7)
            r17 = 1
            r13 = r8
            r18 = r10
            r19 = r11
            r20 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r1.add(r8)
            goto Ldb
        Lcc:
            boolean r8 = com.applovin.impl.sdk.t.a()
            if (r8 == 0) goto Ldb
            com.applovin.impl.sdk.t r8 = r0.f3975c
            java.lang.String r10 = r0.f3974b
            java.lang.String r11 = "Skip caching of non-resource "
            a4.j.v(r11, r7, r8, r10)
        Ldb:
            r7 = r9
            goto L20
        Lde:
            boolean r1 = com.applovin.impl.sdk.t.a()
            if (r1 == 0) goto Led
            com.applovin.impl.sdk.t r1 = r0.f3975c
            java.lang.String r2 = r0.f3974b
            java.lang.String r3 = "Unable to cache resource; ad HTML is invalid."
            r1.b(r2, r3)
        Led:
            return r8
        Lee:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.d1.c():java.util.HashSet");
    }

    private HashSet d() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f4170f, (String) this.a.a(oj.f6670h5)), 1)) {
            if (this.f3977e.get()) {
                return null;
            }
            if (!StringUtils.isValidString(str)) {
                if (com.applovin.impl.sdk.t.a()) {
                    a4.j.v("Skip caching of non-resource ", str, this.f3975c, this.f3974b);
                }
            } else {
                hashSet.add(new e1(str, this.f4171g, Collections.emptyList(), false, this.f4173i, this.a, new a(str)));
            }
        }
        return hashSet;
    }

    private Collection e() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.a.a(oj.X0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        HashSet d10;
        if (this.f3977e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f4170f)) {
            a(this.f4170f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.a.a(oj.Y0)).booleanValue()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3975c.a(this.f3974b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f4170f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet c10 = c();
        if (c10 != null) {
            hashSet.addAll(c10);
        }
        if (((Boolean) this.a.a(oj.f6662g5)).booleanValue() && (d10 = d()) != null) {
            hashSet.addAll(d10);
        }
        this.f4178n = new ArrayList(hashSet);
        if (this.f3977e.get()) {
            return Boolean.FALSE;
        }
        List list = this.f4178n;
        if (list != null && !list.isEmpty()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3975c.a(this.f3974b, "Executing " + this.f4178n.size() + " caching operations...");
            }
            this.f4177m.invokeAll(this.f4178n);
            synchronized (this.f4176l) {
                a(this.f4175k.toString());
            }
            return Boolean.TRUE;
        }
        a(this.f4170f);
        return Boolean.FALSE;
    }
}

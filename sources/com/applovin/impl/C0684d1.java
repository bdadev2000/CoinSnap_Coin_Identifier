package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.C0689e1;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.applovin.impl.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0684d1 extends AbstractCallableC0679c1 {

    /* renamed from: f, reason: collision with root package name */
    private final String f7150f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f7151g;

    /* renamed from: h, reason: collision with root package name */
    private final List f7152h;

    /* renamed from: i, reason: collision with root package name */
    private final C0748s2 f7153i;

    /* renamed from: j, reason: collision with root package name */
    private final c f7154j;

    /* renamed from: k, reason: collision with root package name */
    private StringBuffer f7155k;
    private final Object l;
    private final ExecutorService m;

    /* renamed from: n, reason: collision with root package name */
    private List f7156n;

    /* renamed from: com.applovin.impl.d1$a */
    /* loaded from: classes.dex */
    public class a implements C0689e1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7157a;

        public a(String str) {
            this.f7157a = str;
        }

        @Override // com.applovin.impl.C0689e1.a
        public void a(Uri uri) {
            if (uri != null) {
                synchronized (C0684d1.this.l) {
                    int indexOf = C0684d1.this.f7155k.indexOf(this.f7157a);
                    C0684d1.this.f7155k.replace(indexOf, this.f7157a.length() + indexOf, uri.toString());
                }
                C0684d1.this.f7151g.a(uri);
                C0684d1.this.f7153i.b();
                return;
            }
            com.applovin.impl.sdk.t tVar = C0684d1.this.f6945c;
            if (com.applovin.impl.sdk.t.a()) {
                C0684d1 c0684d1 = C0684d1.this;
                c0684d1.f6945c.a(c0684d1.b, "Failed to cache JavaScript resource " + this.f7157a);
            }
            if (C0684d1.this.f7154j != null) {
                C0684d1.this.f7154j.a(C0684d1.this.f7150f, true);
            }
            C0684d1.this.f7153i.a();
        }
    }

    /* renamed from: com.applovin.impl.d1$b */
    /* loaded from: classes.dex */
    public class b implements C0689e1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f7158a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f7159c;

        public b(String str, String str2, String str3) {
            this.f7158a = str;
            this.b = str2;
            this.f7159c = str3;
        }

        @Override // com.applovin.impl.C0689e1.a
        public void a(Uri uri) {
            if (uri != null) {
                synchronized (C0684d1.this.l) {
                    int indexOf = C0684d1.this.f7155k.indexOf(this.f7158a);
                    C0684d1.this.f7155k.replace(indexOf, this.f7158a.length() + indexOf, uri.toString());
                }
                C0684d1.this.f7151g.a(uri);
                C0684d1.this.f7153i.b();
                return;
            }
            if (C0684d1.this.f7151g.W().contains(this.b + this.f7159c) && C0684d1.this.f7154j != null) {
                C0684d1.this.f7154j.a(C0684d1.this.f7150f, true);
            }
            C0684d1.this.f7153i.a();
        }
    }

    /* renamed from: com.applovin.impl.d1$c */
    /* loaded from: classes.dex */
    public interface c {
        void a(String str, boolean z8);
    }

    public C0684d1(String str, com.applovin.impl.sdk.ad.b bVar, List list, C0748s2 c0748s2, ExecutorService executorService, com.applovin.impl.sdk.k kVar, c cVar) {
        super("AsyncTaskCacheHTMLResources", kVar);
        this.f7150f = str;
        this.f7151g = bVar;
        this.f7152h = list;
        this.f7153i = c0748s2;
        this.m = executorService;
        this.f7154j = cVar;
        this.f7155k = new StringBuffer(str);
        this.l = new Object();
    }

    private void a(String str) {
        c cVar;
        if (this.f6947e.get() || (cVar = this.f7154j) == null) {
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
            r20 = this;
            r0 = r20
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Collection r2 = r20.e()
            java.util.List r3 = r0.f7152h
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lec
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            r6 = r5
        L1f:
            java.lang.String r7 = r0.f7150f
            int r7 = r7.length()
            if (r5 >= r7) goto L11
            java.util.concurrent.atomic.AtomicBoolean r5 = r0.f6947e
            boolean r5 = r5.get()
            r7 = 0
            if (r5 == 0) goto L31
            return r7
        L31:
            java.lang.String r5 = r0.f7150f
            int r5 = r5.indexOf(r4, r6)
            r6 = -1
            if (r5 != r6) goto L3b
            goto L11
        L3b:
            java.lang.String r6 = r0.f7150f
            int r6 = r6.length()
            r8 = r5
        L42:
            java.lang.String r9 = r0.f7150f
            char r9 = r9.charAt(r8)
            java.lang.Character r9 = java.lang.Character.valueOf(r9)
            boolean r9 = r2.contains(r9)
            if (r9 != 0) goto L57
            if (r8 >= r6) goto L57
            int r8 = r8 + 1
            goto L42
        L57:
            if (r8 <= r5) goto Ldc
            if (r8 == r6) goto Ldc
            java.lang.String r6 = r0.f7150f
            int r7 = r4.length()
            int r7 = r7 + r5
            java.lang.String r6 = r6.substring(r7, r8)
            boolean r7 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r6)
            if (r7 == 0) goto Lca
            com.applovin.impl.sdk.ad.b r7 = r0.f7151g
            boolean r7 = r7.I0()
            if (r7 == 0) goto La1
            com.applovin.impl.sdk.ad.b r7 = r0.f7151g
            java.lang.String r7 = r7.P()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto La1
            boolean r7 = com.applovin.impl.sdk.t.a()
            if (r7 == 0) goto Ld9
            com.applovin.impl.sdk.t r7 = r0.f6945c
            java.lang.String r9 = r0.b
            java.lang.String r10 = "Postponing caching for \""
            java.lang.String r11 = "\" video resource"
            com.applovin.impl.L.v(r10, r6, r11, r7, r9)
            goto Ld9
        La1:
            java.lang.String r13 = com.mbridge.msdk.foundation.entity.o.j(r4, r6)
            com.applovin.impl.e1 r7 = new com.applovin.impl.e1
            com.applovin.impl.sdk.ad.b r14 = r0.f7151g
            java.lang.String[] r9 = new java.lang.String[]{r4}
            java.util.List r15 = java.util.Arrays.asList(r9)
            com.applovin.impl.s2 r9 = r0.f7153i
            com.applovin.impl.sdk.k r10 = r0.f6944a
            com.applovin.impl.d1$b r11 = new com.applovin.impl.d1$b
            r11.<init>(r13, r4, r6)
            r16 = 1
            r12 = r7
            r17 = r9
            r18 = r10
            r19 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r1.add(r7)
            goto Ld9
        Lca:
            boolean r7 = com.applovin.impl.sdk.t.a()
            if (r7 == 0) goto Ld9
            com.applovin.impl.sdk.t r7 = r0.f6945c
            java.lang.String r9 = r0.b
            java.lang.String r10 = "Skip caching of non-resource "
            Q7.n0.s(r10, r6, r7, r9)
        Ld9:
            r6 = r8
            goto L1f
        Ldc:
            boolean r1 = com.applovin.impl.sdk.t.a()
            if (r1 == 0) goto Leb
            com.applovin.impl.sdk.t r1 = r0.f6945c
            java.lang.String r2 = r0.b
            java.lang.String r3 = "Unable to cache resource; ad HTML is invalid."
            r1.b(r2, r3)
        Leb:
            return r7
        Lec:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C0684d1.c():java.util.HashSet");
    }

    private HashSet d() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f7150f, (String) this.f6944a.a(oj.f9775h5)), 1)) {
            if (this.f6947e.get()) {
                return null;
            }
            if (!StringUtils.isValidString(str)) {
                if (com.applovin.impl.sdk.t.a()) {
                    Q7.n0.s("Skip caching of non-resource ", str, this.f6945c, this.b);
                }
            } else {
                hashSet.add(new C0689e1(str, this.f7151g, Collections.emptyList(), false, this.f7153i, this.f6944a, new a(str)));
            }
        }
        return hashSet;
    }

    private Collection e() {
        HashSet hashSet = new HashSet();
        for (char c9 : ((String) this.f6944a.a(oj.f9702X0)).toCharArray()) {
            hashSet.add(Character.valueOf(c9));
        }
        hashSet.add('\"');
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        HashSet d2;
        if (this.f6947e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f7150f)) {
            a(this.f7150f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.f6944a.a(oj.f9709Y0)).booleanValue()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6945c.a(this.b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f7150f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet c9 = c();
        if (c9 != null) {
            hashSet.addAll(c9);
        }
        if (((Boolean) this.f6944a.a(oj.f9768g5)).booleanValue() && (d2 = d()) != null) {
            hashSet.addAll(d2);
        }
        this.f7156n = new ArrayList(hashSet);
        if (this.f6947e.get()) {
            return Boolean.FALSE;
        }
        List list = this.f7156n;
        if (list != null && !list.isEmpty()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6945c.a(this.b, "Executing " + this.f7156n.size() + " caching operations...");
            }
            this.m.invokeAll(this.f7156n);
            synchronized (this.l) {
                a(this.f7155k.toString());
            }
            return Boolean.TRUE;
        }
        a(this.f7150f);
        return Boolean.FALSE;
    }
}

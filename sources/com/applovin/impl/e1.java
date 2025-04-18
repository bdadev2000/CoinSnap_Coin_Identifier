package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import com.applovin.impl.f1;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class e1 extends d1 {

    /* renamed from: f, reason: collision with root package name */
    private final String f23549f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f23550g;

    /* renamed from: h, reason: collision with root package name */
    private final List f23551h;

    /* renamed from: i, reason: collision with root package name */
    private final u2 f23552i;

    /* renamed from: j, reason: collision with root package name */
    private final c f23553j;

    /* renamed from: k, reason: collision with root package name */
    private StringBuffer f23554k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f23555l;

    /* renamed from: m, reason: collision with root package name */
    private final ExecutorService f23556m;

    /* renamed from: n, reason: collision with root package name */
    private List f23557n;

    /* loaded from: classes3.dex */
    public class a implements f1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f23558a;

        public a(String str) {
            this.f23558a = str;
        }

        @Override // com.applovin.impl.f1.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) e1.this.f23397a.a(sj.f26945p1)).booleanValue()) {
                    synchronized (e1.this.f23555l) {
                        StringUtils.replaceAll(e1.this.f23554k, this.f23558a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(e1.this.f23554k, this.f23558a, uri.toString());
                }
                e1.this.f23550g.a(uri);
                e1.this.f23552i.d();
                return;
            }
            com.applovin.impl.sdk.n nVar = e1.this.f23399c;
            if (com.applovin.impl.sdk.n.a()) {
                e1 e1Var = e1.this;
                e1Var.f23399c.a(e1Var.f23398b, "Failed to cache JavaScript resource " + this.f23558a);
            }
            if (e1.this.f23553j != null) {
                e1.this.f23553j.a(e1.this.f23549f, true);
            }
            e1.this.f23552i.c();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements f1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f23560a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f23561b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f23562c;

        public b(String str, String str2, String str3) {
            this.f23560a = str;
            this.f23561b = str2;
            this.f23562c = str3;
        }

        @Override // com.applovin.impl.f1.a
        public void a(Uri uri) {
            if (uri != null) {
                if (((Boolean) e1.this.f23397a.a(sj.f26945p1)).booleanValue()) {
                    synchronized (e1.this.f23555l) {
                        StringUtils.replaceAll(e1.this.f23554k, this.f23560a, uri.toString());
                    }
                } else {
                    StringUtils.replaceAll(e1.this.f23554k, this.f23560a, uri.toString());
                }
                e1.this.f23550g.a(uri);
                e1.this.f23552i.d();
                return;
            }
            if (e1.this.f23550g.W().contains(this.f23561b + this.f23562c) && e1.this.f23553j != null) {
                e1.this.f23553j.a(e1.this.f23549f, true);
            }
            e1.this.f23552i.c();
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(String str, boolean z2);
    }

    public e1(String str, com.applovin.impl.sdk.ad.b bVar, List list, u2 u2Var, ExecutorService executorService, com.applovin.impl.sdk.j jVar, c cVar) {
        super("AsyncTaskCacheHTMLResources", jVar);
        this.f23549f = str;
        this.f23550g = bVar;
        this.f23551h = list;
        this.f23552i = u2Var;
        this.f23556m = executorService;
        this.f23553j = cVar;
        this.f23554k = new StringBuffer(str);
        this.f23555l = new Object();
    }

    private void a(String str) {
        c cVar;
        if (this.e.get() || (cVar = this.f23553j) == null) {
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
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.e1.c():java.util.HashSet");
    }

    private HashSet d() {
        HashSet hashSet = new HashSet();
        for (String str : StringUtils.getRegexMatches(StringUtils.match(this.f23549f, (String) this.f23397a.a(sj.m5)), 1)) {
            if (this.e.get()) {
                return null;
            }
            if (!StringUtils.isValidString(str)) {
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.adview.t.v("Skip caching of non-resource ", str, this.f23399c, this.f23398b);
                }
            } else {
                hashSet.add(new f1(str, this.f23550g, Collections.emptyList(), false, this.f23552i, this.f23397a, new a(str)));
            }
        }
        return hashSet;
    }

    private Collection e() {
        HashSet hashSet = new HashSet();
        for (char c2 : ((String) this.f23397a.a(sj.X0)).toCharArray()) {
            hashSet.add(Character.valueOf(c2));
        }
        hashSet.add('\"');
        return hashSet;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        HashSet d;
        if (this.e.get()) {
            return Boolean.FALSE;
        }
        if (TextUtils.isEmpty(this.f23549f)) {
            a(this.f23549f);
            return Boolean.FALSE;
        }
        if (!((Boolean) this.f23397a.a(sj.Y0)).booleanValue()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f23399c.a(this.f23398b, "Resource caching is disabled, skipping cache...");
            }
            a(this.f23549f);
            return Boolean.FALSE;
        }
        HashSet hashSet = new HashSet();
        HashSet c2 = c();
        if (c2 != null) {
            hashSet.addAll(c2);
        }
        if (((Boolean) this.f23397a.a(sj.k5)).booleanValue() && (d = d()) != null) {
            hashSet.addAll(d);
        }
        this.f23557n = new ArrayList(hashSet);
        if (this.e.get()) {
            return Boolean.FALSE;
        }
        List list = this.f23557n;
        if (list != null && !list.isEmpty()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f23399c.a(this.f23398b, "Executing " + this.f23557n.size() + " caching operations...");
            }
            this.f23556m.invokeAll(this.f23557n);
            if (((Boolean) this.f23397a.a(sj.f26945p1)).booleanValue()) {
                synchronized (this.f23555l) {
                    a(this.f23554k.toString());
                }
            } else {
                a(this.f23554k.toString());
            }
            return Boolean.TRUE;
        }
        a(this.f23549f);
        return Boolean.FALSE;
    }
}

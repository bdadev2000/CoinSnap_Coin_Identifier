package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public class f1 extends d1 {

    /* renamed from: f, reason: collision with root package name */
    private final String f23795f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f23796g;

    /* renamed from: h, reason: collision with root package name */
    private final List f23797h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f23798i;

    /* renamed from: j, reason: collision with root package name */
    private final u2 f23799j;

    /* renamed from: k, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f23800k;

    /* renamed from: l, reason: collision with root package name */
    private final a f23801l;

    /* loaded from: classes.dex */
    public interface a {
        void a(Uri uri);
    }

    public f1(String str, com.applovin.impl.sdk.ad.b bVar, u2 u2Var, com.applovin.impl.sdk.j jVar, a aVar) {
        this(str, bVar, bVar.X(), true, u2Var, jVar, aVar);
    }

    private void a(Uri uri) {
        a aVar;
        if (this.e.get() || (aVar = this.f23801l) == null) {
            return;
        }
        aVar.a(uri);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        if (this.e.get()) {
            return Boolean.FALSE;
        }
        String a2 = this.f23800k.B().a(a(), this.f23795f, this.f23796g.getCachePrefix(), this.f23797h, this.f23798i, this.f23799j, this.f23800k.B().a(this.f23795f, this.f23796g));
        if (TextUtils.isEmpty(a2)) {
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.e.get()) {
            return Boolean.FALSE;
        }
        File a3 = this.f23800k.B().a(a2, a());
        if (a3 == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f23399c.b(this.f23398b, "Unable to retrieve File for cached filename = " + a2);
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.e.get()) {
            return Boolean.FALSE;
        }
        Uri fromFile = Uri.fromFile(a3);
        if (fromFile == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f23399c.b(this.f23398b, "Unable to extract Uri from file");
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.e.get()) {
            return Boolean.FALSE;
        }
        a(fromFile);
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f23795f.equals(((f1) obj).f23795f);
    }

    public int hashCode() {
        String str = this.f23795f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public f1(String str, com.applovin.impl.sdk.ad.b bVar, List list, boolean z2, u2 u2Var, com.applovin.impl.sdk.j jVar, a aVar) {
        super("AsyncTaskCacheResource", jVar);
        this.f23795f = str;
        this.f23796g = bVar;
        this.f23797h = list;
        this.f23798i = z2;
        this.f23799j = u2Var;
        this.f23800k = jVar;
        this.f23801l = aVar;
    }
}

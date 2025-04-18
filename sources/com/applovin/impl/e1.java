package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public class e1 extends c1 {

    /* renamed from: f, reason: collision with root package name */
    private final String f4395f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f4396g;

    /* renamed from: h, reason: collision with root package name */
    private final List f4397h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f4398i;

    /* renamed from: j, reason: collision with root package name */
    private final s2 f4399j;

    /* renamed from: k, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4400k;

    /* renamed from: l, reason: collision with root package name */
    private final a f4401l;

    /* loaded from: classes.dex */
    public interface a {
        void a(Uri uri);
    }

    public e1(String str, com.applovin.impl.sdk.ad.b bVar, s2 s2Var, com.applovin.impl.sdk.k kVar, a aVar) {
        this(str, bVar, bVar.X(), true, s2Var, kVar, aVar);
    }

    private void a(Uri uri) {
        a aVar;
        if (!this.f3977e.get() && (aVar = this.f4401l) != null) {
            aVar.a(uri);
        }
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        if (this.f3977e.get()) {
            return Boolean.FALSE;
        }
        String a10 = this.f4400k.D().a(a(), this.f4395f, this.f4396g.getCachePrefix(), this.f4397h, this.f4398i, this.f4399j);
        if (TextUtils.isEmpty(a10)) {
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f3977e.get()) {
            return Boolean.FALSE;
        }
        File a11 = this.f4400k.D().a(a10, a());
        if (a11 == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3975c.b(this.f3974b, "Unable to retrieve File for cached filename = " + a10);
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f3977e.get()) {
            return Boolean.FALSE;
        }
        Uri fromFile = Uri.fromFile(a11);
        if (fromFile == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f3975c.b(this.f3974b, "Unable to extract Uri from file");
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f3977e.get()) {
            return Boolean.FALSE;
        }
        a(fromFile);
        return Boolean.TRUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f4395f.equals(((e1) obj).f4395f);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f4395f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public e1(String str, com.applovin.impl.sdk.ad.b bVar, List list, boolean z10, s2 s2Var, com.applovin.impl.sdk.k kVar, a aVar) {
        super("AsyncTaskCacheResource", kVar);
        this.f4395f = str;
        this.f4396g = bVar;
        this.f4397h = list;
        this.f4398i = z10;
        this.f4399j = s2Var;
        this.f4400k = kVar;
        this.f4401l = aVar;
    }
}

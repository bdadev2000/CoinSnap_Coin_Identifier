package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.List;

/* renamed from: com.applovin.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0689e1 extends AbstractCallableC0679c1 {

    /* renamed from: f, reason: collision with root package name */
    private final String f7368f;

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f7369g;

    /* renamed from: h, reason: collision with root package name */
    private final List f7370h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f7371i;

    /* renamed from: j, reason: collision with root package name */
    private final C0748s2 f7372j;

    /* renamed from: k, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7373k;
    private final a l;

    /* renamed from: com.applovin.impl.e1$a */
    /* loaded from: classes.dex */
    public interface a {
        void a(Uri uri);
    }

    public C0689e1(String str, com.applovin.impl.sdk.ad.b bVar, C0748s2 c0748s2, com.applovin.impl.sdk.k kVar, a aVar) {
        this(str, bVar, bVar.X(), true, c0748s2, kVar, aVar);
    }

    private void a(Uri uri) {
        a aVar;
        if (!this.f6947e.get() && (aVar = this.l) != null) {
            aVar.a(uri);
        }
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Boolean call() {
        if (this.f6947e.get()) {
            return Boolean.FALSE;
        }
        String a6 = this.f7373k.D().a(a(), this.f7368f, this.f7369g.getCachePrefix(), this.f7370h, this.f7371i, this.f7372j);
        if (TextUtils.isEmpty(a6)) {
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f6947e.get()) {
            return Boolean.FALSE;
        }
        File a9 = this.f7373k.D().a(a6, a());
        if (a9 == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6945c.b(this.b, "Unable to retrieve File for cached filename = " + a6);
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f6947e.get()) {
            return Boolean.FALSE;
        }
        Uri fromFile = Uri.fromFile(a9);
        if (fromFile == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f6945c.b(this.b, "Unable to extract Uri from file");
            }
            a((Uri) null);
            return Boolean.FALSE;
        }
        if (this.f6947e.get()) {
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
            return this.f7368f.equals(((C0689e1) obj).f7368f);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7368f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public C0689e1(String str, com.applovin.impl.sdk.ad.b bVar, List list, boolean z8, C0748s2 c0748s2, com.applovin.impl.sdk.k kVar, a aVar) {
        super("AsyncTaskCacheResource", kVar);
        this.f7368f = str;
        this.f7369g = bVar;
        this.f7370h = list;
        this.f7371i = z8;
        this.f7372j = c0748s2;
        this.f7373k = kVar;
        this.l = aVar;
    }
}

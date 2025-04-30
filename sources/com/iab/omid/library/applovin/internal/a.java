package com.iab.omid.library.applovin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f14412f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.applovin.utils.f f14413a = new com.iab.omid.library.applovin.utils.f();
    private Date b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14414c;

    /* renamed from: d, reason: collision with root package name */
    private d f14415d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14416e;

    private a(d dVar) {
        this.f14415d = dVar;
    }

    public static a a() {
        return f14412f;
    }

    private void c() {
        if (!this.f14414c || this.b == null) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a6 = this.f14413a.a();
        Date date = this.b;
        if (date == null || a6.after(date)) {
            this.b = a6;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f14414c) {
            return;
        }
        this.f14415d.a(context);
        this.f14415d.a(this);
        this.f14415d.e();
        this.f14416e = this.f14415d.c();
        this.f14414c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z8) {
        if (!this.f14416e && z8) {
            d();
        }
        this.f14416e = z8;
    }
}

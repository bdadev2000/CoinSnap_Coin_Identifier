package com.iab.omid.library.applovin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f12152f = new a(new d());
    protected com.iab.omid.library.applovin.utils.f a = new com.iab.omid.library.applovin.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f12153b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12154c;

    /* renamed from: d, reason: collision with root package name */
    private d f12155d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12156e;

    private a(d dVar) {
        this.f12155d = dVar;
    }

    public static a a() {
        return f12152f;
    }

    private void c() {
        if (!this.f12154c || this.f12153b == null) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f12153b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a = this.a.a();
        Date date = this.f12153b;
        if (date == null || a.after(date)) {
            this.f12153b = a;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f12154c) {
            return;
        }
        this.f12155d.a(context);
        this.f12155d.a(this);
        this.f12155d.e();
        this.f12156e = this.f12155d.c();
        this.f12154c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (!this.f12156e && z10) {
            d();
        }
        this.f12156e = z10;
    }
}

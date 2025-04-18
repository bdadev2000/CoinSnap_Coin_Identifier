package com.iab.omid.library.applovin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f28952f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.applovin.utils.f f28953a = new com.iab.omid.library.applovin.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f28954b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28955c;
    private d d;
    private boolean e;

    private a(d dVar) {
        this.d = dVar;
    }

    public static a a() {
        return f28952f;
    }

    private void c() {
        if (!this.f28955c || this.f28954b == null) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f28954b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a2 = this.f28953a.a();
        Date date = this.f28954b;
        if (date == null || a2.after(date)) {
            this.f28954b = a2;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f28955c) {
            return;
        }
        this.d.a(context);
        this.d.a(this);
        this.d.e();
        this.e = this.d.c();
        this.f28955c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z2) {
        if (!this.e && z2) {
            d();
        }
        this.e = z2;
    }
}

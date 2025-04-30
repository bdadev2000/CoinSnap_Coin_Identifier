package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f14514f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.bytedance2.utils.f f14515a = new com.iab.omid.library.bytedance2.utils.f();
    private Date b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14516c;

    /* renamed from: d, reason: collision with root package name */
    private d f14517d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14518e;

    private a(d dVar) {
        this.f14517d = dVar;
    }

    public static a a() {
        return f14514f;
    }

    private void c() {
        if (!this.f14516c || this.b == null) {
            return;
        }
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().a().iterator();
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
        Date a6 = this.f14515a.a();
        Date date = this.b;
        if (date == null || a6.after(date)) {
            this.b = a6;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f14516c) {
            return;
        }
        this.f14517d.a(context);
        this.f14517d.a(this);
        this.f14517d.e();
        this.f14518e = this.f14517d.c();
        this.f14516c = true;
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z8) {
        if (!this.f14518e && z8) {
            d();
        }
        this.f14518e = z8;
    }
}

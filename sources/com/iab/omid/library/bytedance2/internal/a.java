package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f12247f = new a(new d());
    protected com.iab.omid.library.bytedance2.utils.f a = new com.iab.omid.library.bytedance2.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f12248b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12249c;

    /* renamed from: d, reason: collision with root package name */
    private d f12250d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12251e;

    private a(d dVar) {
        this.f12250d = dVar;
    }

    public static a a() {
        return f12247f;
    }

    private void c() {
        if (!this.f12249c || this.f12248b == null) {
            return;
        }
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f12248b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a = this.a.a();
        Date date = this.f12248b;
        if (date == null || a.after(date)) {
            this.f12248b = a;
            c();
        }
    }

    public void a(@NonNull Context context) {
        if (this.f12249c) {
            return;
        }
        this.f12250d.a(context);
        this.f12250d.a(this);
        this.f12250d.e();
        this.f12251e = this.f12250d.c();
        this.f12249c = true;
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z10) {
        if (!this.f12251e && z10) {
            d();
        }
        this.f12251e = z10;
    }
}

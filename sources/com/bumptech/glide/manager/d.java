package com.bumptech.glide.manager;

import android.content.Context;
import java.util.Set;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    public final Context f9717b;

    /* renamed from: c, reason: collision with root package name */
    public final b f9718c;

    public d(Context context, com.bumptech.glide.n nVar) {
        this.f9717b = context.getApplicationContext();
        this.f9718c = nVar;
    }

    @Override // com.bumptech.glide.manager.h
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStart() {
        r f10 = r.f(this.f9717b);
        b bVar = this.f9718c;
        synchronized (f10) {
            ((Set) f10.f9742c).add(bVar);
            f10.h();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStop() {
        r f10 = r.f(this.f9717b);
        b bVar = this.f9718c;
        synchronized (f10) {
            ((Set) f10.f9742c).remove(bVar);
            f10.i();
        }
    }
}

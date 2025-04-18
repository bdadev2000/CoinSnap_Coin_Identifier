package k4;

import android.content.res.Resources;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k implements com.bumptech.glide.load.data.e {

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f20246b;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f20247c;

    /* renamed from: d, reason: collision with root package name */
    public final l f20248d;

    /* renamed from: f, reason: collision with root package name */
    public final int f20249f;

    /* renamed from: g, reason: collision with root package name */
    public Object f20250g;

    public k(Resources.Theme theme, Resources resources, l lVar, int i10) {
        this.f20246b = theme;
        this.f20247c = resources;
        this.f20248d = lVar;
        this.f20249f = i10;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f20248d.a();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        Object obj = this.f20250g;
        if (obj != null) {
            try {
                this.f20248d.b(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final e4.a d() {
        return e4.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d dVar) {
        try {
            Object e2 = this.f20248d.e(this.f20247c, this.f20249f, this.f20246b);
            this.f20250g = e2;
            dVar.f(e2);
        } catch (Resources.NotFoundException e10) {
            dVar.c(e10);
        }
    }
}

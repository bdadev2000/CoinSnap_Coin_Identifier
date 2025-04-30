package T1;

import android.content.res.Resources;
import java.io.IOException;

/* renamed from: T1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302h implements com.bumptech.glide.load.data.e {
    public final Resources.Theme b;

    /* renamed from: c, reason: collision with root package name */
    public final Resources f2972c;

    /* renamed from: d, reason: collision with root package name */
    public final i f2973d;

    /* renamed from: f, reason: collision with root package name */
    public final int f2974f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2975g;

    public C0302h(Resources.Theme theme, Resources resources, i iVar, int i9) {
        this.b = theme;
        this.f2972c = resources;
        this.f2973d = iVar;
        this.f2974f = i9;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f2973d.a();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        Object obj = this.f2975g;
        if (obj != null) {
            try {
                this.f2973d.e(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int d() {
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        try {
            Object c9 = this.f2973d.c(this.f2972c, this.f2974f, this.b);
            this.f2975g = c9;
            dVar.h(c9);
        } catch (Resources.NotFoundException e4) {
            dVar.c(e4);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }
}

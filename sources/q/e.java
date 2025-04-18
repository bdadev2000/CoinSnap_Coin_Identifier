package q;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e extends k {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f31264a;

    /* renamed from: b, reason: collision with root package name */
    public final j f31265b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f31266c;

    public e(Drawable drawable, j jVar, Throwable th) {
        this.f31264a = drawable;
        this.f31265b = jVar;
        this.f31266c = th;
    }

    @Override // q.k
    public final Drawable a() {
        return this.f31264a;
    }

    @Override // q.k
    public final j b() {
        return this.f31265b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (p0.a.g(this.f31264a, eVar.f31264a)) {
                if (p0.a.g(this.f31265b, eVar.f31265b) && p0.a.g(this.f31266c, eVar.f31266c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Drawable drawable = this.f31264a;
        return this.f31266c.hashCode() + ((this.f31265b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}

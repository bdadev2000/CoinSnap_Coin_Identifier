package r;

import android.content.Context;
import android.util.DisplayMetrics;
import f.l;

/* loaded from: classes3.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31341a;

    public c(Context context) {
        this.f31341a = context;
    }

    @Override // r.h
    public final Object c(l lVar) {
        DisplayMetrics displayMetrics = this.f31341a.getResources().getDisplayMetrics();
        a aVar = new a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new g(aVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            if (p0.a.g(this.f31341a, ((c) obj).f31341a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31341a.hashCode();
    }
}

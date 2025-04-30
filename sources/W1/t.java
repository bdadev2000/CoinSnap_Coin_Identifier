package W1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class t implements N1.m {
    public final N1.m b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3597c;

    public t(N1.m mVar, boolean z8) {
        this.b = mVar;
        this.f3597c = z8;
    }

    @Override // N1.m
    public final P1.B a(Context context, P1.B b, int i9, int i10) {
        Q1.a aVar = com.bumptech.glide.b.a(context).b;
        Drawable drawable = (Drawable) b.get();
        C0320d a6 = s.a(aVar, drawable, i9, i10);
        if (a6 == null) {
            if (!this.f3597c) {
                return b;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        P1.B a9 = this.b.a(context, a6, i9, i10);
        if (a9.equals(a6)) {
            a9.a();
            return b;
        }
        return new C0320d(context.getResources(), a9);
    }

    @Override // N1.f
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // N1.f
    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.b.equals(((t) obj).b);
        }
        return false;
    }

    @Override // N1.f
    public final int hashCode() {
        return this.b.hashCode();
    }
}

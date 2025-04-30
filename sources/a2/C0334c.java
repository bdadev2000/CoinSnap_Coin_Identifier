package a2;

import N1.m;
import P1.B;
import W1.C0320d;
import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: a2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0334c implements m {
    public final m b;

    public C0334c(m mVar) {
        j2.g.c(mVar, "Argument must not be null");
        this.b = mVar;
    }

    @Override // N1.m
    public final B a(Context context, B b, int i9, int i10) {
        C0333b c0333b = (C0333b) b.get();
        B c0320d = new C0320d(com.bumptech.glide.b.a(context).b, ((C0337f) c0333b.b.b).l);
        m mVar = this.b;
        B a6 = mVar.a(context, c0320d, i9, i10);
        if (!c0320d.equals(a6)) {
            c0320d.a();
        }
        ((C0337f) c0333b.b.b).c(mVar, (Bitmap) a6.get());
        return b;
    }

    @Override // N1.f
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // N1.f
    public final boolean equals(Object obj) {
        if (obj instanceof C0334c) {
            return this.b.equals(((C0334c) obj).b);
        }
        return false;
    }

    @Override // N1.f
    public final int hashCode() {
        return this.b.hashCode();
    }
}

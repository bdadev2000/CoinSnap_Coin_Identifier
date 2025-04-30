package Y1;

import N1.h;
import N1.i;
import N1.k;
import P1.B;
import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final class c implements k {
    public static final h b = new h("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, h.f2088e);

    /* renamed from: a, reason: collision with root package name */
    public final Context f3757a;

    public c(Context context) {
        this.f3757a = context.getApplicationContext();
    }

    @Override // N1.k
    public final boolean a(Object obj, i iVar) {
        String scheme = ((Uri) obj).getScheme();
        if (scheme != null && scheme.equals("android.resource")) {
            return true;
        }
        return false;
    }

    @Override // N1.k
    public final /* bridge */ /* synthetic */ B b(Object obj, int i9, int i10, i iVar) {
        return c((Uri) obj, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final P1.B c(android.net.Uri r9, N1.i r10) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.c.c(android.net.Uri, N1.i):P1.B");
    }
}

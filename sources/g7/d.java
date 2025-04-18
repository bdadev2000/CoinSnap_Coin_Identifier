package g7;

import android.content.Context;
import android.net.ConnectivityManager;
import d6.h;
import j7.i;
import java.net.MalformedURLException;
import java.net.URL;
import vd.e;
import y7.u;

/* loaded from: classes3.dex */
public final class d implements i {
    public final u a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f18237b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f18238c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f18239d;

    /* renamed from: e, reason: collision with root package name */
    public final q7.a f18240e;

    /* renamed from: f, reason: collision with root package name */
    public final q7.a f18241f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18242g;

    public d(Context context, q7.a aVar, q7.a aVar2) {
        xb.d dVar = new xb.d();
        h.f16897c.a(dVar);
        dVar.f27622d = true;
        this.a = new u(dVar);
        this.f18238c = context;
        this.f18237b = (ConnectivityManager) context.getSystemService("connectivity");
        String str = a.f18228c;
        try {
            this.f18239d = new URL(str);
            this.f18240e = aVar2;
            this.f18241f = aVar;
            this.f18242g = 130000;
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(e.e("Invalid url: ", str), e2);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(1:3)(1:25)|4|(1:6)(9:20|(1:22)(1:23)|8|(1:10)|11|12|13|14|15)|7|8|(0)|11|12|13|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f1, code lost:
    
        com.bumptech.glide.c.r("CctTransportBackend", "Unable to find version code for package", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (((h7.h0) h7.h0.f18802b.get(r0)) != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final i7.h a(i7.h r6) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.d.a(i7.h):i7.h");
    }
}

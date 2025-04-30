package i3;

import I4.d;
import android.content.Context;
import android.net.ConnectivityManager;
import j3.l;
import java.net.MalformedURLException;
import java.net.URL;
import l3.InterfaceC2443h;
import n1.C2475f;
import t3.C2707b;
import x0.AbstractC2914a;

/* renamed from: i3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2344c implements InterfaceC2443h {

    /* renamed from: a, reason: collision with root package name */
    public final C2475f f20650a;
    public final ConnectivityManager b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f20651c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f20652d;

    /* renamed from: e, reason: collision with root package name */
    public final C2707b f20653e;

    /* renamed from: f, reason: collision with root package name */
    public final C2707b f20654f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20655g;

    public C2344c(Context context, C2707b c2707b, C2707b c2707b2) {
        d dVar = new d();
        l.f21068a.a(dVar);
        dVar.f1462d = true;
        this.f20650a = new C2475f(dVar, 3);
        this.f20651c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f20652d = b(C2342a.f20643c);
        this.f20653e = c2707b2;
        this.f20654f = c2707b;
        this.f20655g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e4) {
            throw new IllegalArgumentException(AbstractC2914a.d("Invalid url: ", str), e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        if (((j3.H) j3.H.b.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k3.i a(k3.i r7) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C2344c.a(k3.i):k3.i");
    }
}

package f;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import b1.b2;
import b1.f0;
import b1.o0;
import d0.p;
import g1.u;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import q.q;

/* loaded from: classes.dex */
public final class o implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f30409a;

    /* renamed from: b, reason: collision with root package name */
    public final q.c f30410b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.h f30411c;
    public final v.k d;
    public final q e;

    /* renamed from: f, reason: collision with root package name */
    public final c f30412f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f30413g;

    public o(Context context, q.c cVar, p pVar, p pVar2, p pVar3, c cVar2, v.k kVar) {
        this.f30409a = context;
        this.f30410b = cVar;
        this.f30411c = pVar;
        this.d = kVar;
        b2 d = p0.a.d();
        h1.d dVar = o0.f22355a;
        p0.a.c(d.u(((c1.e) u.f30639a).f22411g).u(new n(this)));
        v.n nVar = new v.n(this);
        q qVar = new q(this, nVar);
        this.e = qVar;
        b bVar = new b(cVar2);
        bVar.b(new n.a(2), HttpUrl.class);
        bVar.b(new n.a(5), String.class);
        bVar.b(new n.a(1), Uri.class);
        bVar.b(new n.a(4), Uri.class);
        bVar.b(new n.a(3), Integer.class);
        bVar.b(new n.a(0), byte[].class);
        Object obj = new Object();
        ArrayList arrayList = bVar.f30379c;
        arrayList.add(new d0.k(obj, Uri.class));
        arrayList.add(new d0.k(new m.a(kVar.f31386a), File.class));
        bVar.a(new k.i(pVar3, pVar2, kVar.f31388c), Uri.class);
        bVar.a(new k.a(5), File.class);
        bVar.a(new k.a(0), Uri.class);
        bVar.a(new k.a(3), Uri.class);
        bVar.a(new k.a(6), Uri.class);
        bVar.a(new k.a(4), Drawable.class);
        bVar.a(new k.a(1), Bitmap.class);
        bVar.a(new k.a(2), ByteBuffer.class);
        h.c cVar3 = new h.c(kVar.d, kVar.e);
        ArrayList arrayList2 = bVar.e;
        arrayList2.add(cVar3);
        List G = f0.G(bVar.f30377a);
        this.f30412f = new c(G, f0.G(bVar.f30378b), f0.G(arrayList), f0.G(bVar.d), f0.G(arrayList2));
        this.f30413g = e0.u.Q0(G, new l.i(this, nVar, qVar));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(12:5|6|(5:(1:(1:(10:11|12|13|14|15|16|(4:18|(0)(1:27)|21|22)(2:28|(1:30))|23|24|25)(2:48|49))(7:50|51|52|53|54|55|(1:58)(7:57|15|16|(0)(0)|23|24|25)))(4:66|67|68|69)|65|35|36|(4:38|39|24|25)(2:40|41))(4:99|100|101|(3:103|(2:105|(1:107))|108)(2:109|110))|70|71|(3:73|(2:75|(1:77))(1:91)|(6:79|(1:81)(1:90)|82|(1:84)|85|(1:88)(4:87|54|55|(0)(0))))|92|(0)(0)|82|(0)|85|(0)(0)))|113|6|(0)(0)|70|71|(0)|92|(0)(0)|82|(0)|85|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x016d, code lost:
    
        if (r5 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00fd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00e4, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015f A[Catch: all -> 0x0187, TryCatch #5 {all -> 0x0187, blocks: (B:16:0x0159, B:18:0x015f, B:21:0x016f, B:22:0x017e, B:27:0x0173, B:28:0x0189, B:30:0x018d), top: B:15:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0189 A[Catch: all -> 0x0187, TryCatch #5 {all -> 0x0187, blocks: (B:16:0x0159, B:18:0x015f, B:21:0x016f, B:22:0x017e, B:27:0x0173, B:28:0x0189, B:30:0x018d), top: B:15:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b2 A[Catch: all -> 0x01c9, TRY_LEAVE, TryCatch #6 {all -> 0x01c9, blocks: (B:36:0x01ae, B:38:0x01b2, B:40:0x01cb, B:41:0x01d3), top: B:35:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cb A[Catch: all -> 0x01c9, TRY_ENTER, TryCatch #6 {all -> 0x01c9, blocks: (B:36:0x01ae, B:38:0x01b2, B:40:0x01cb, B:41:0x01d3), top: B:35:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1 A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:71:0x00c7, B:73:0x00d1, B:75:0x00d5, B:77:0x00dd, B:79:0x00eb, B:81:0x00f1, B:82:0x010b, B:84:0x010f, B:85:0x0112, B:90:0x00ff), top: B:70:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1 A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:71:0x00c7, B:73:0x00d1, B:75:0x00d5, B:77:0x00dd, B:79:0x00eb, B:81:0x00f1, B:82:0x010b, B:84:0x010f, B:85:0x0112, B:90:0x00ff), top: B:70:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010f A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:71:0x00c7, B:73:0x00d1, B:75:0x00d5, B:77:0x00dd, B:79:0x00eb, B:81:0x00f1, B:82:0x010b, B:84:0x010f, B:85:0x0112, B:90:0x00ff), top: B:70:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:71:0x00c7, B:73:0x00d1, B:75:0x00d5, B:77:0x00dd, B:79:0x00eb, B:81:0x00f1, B:82:0x010b, B:84:0x010f, B:85:0x0112, B:90:0x00ff), top: B:70:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0079  */
    /* JADX WARN: Type inference failed for: r1v13, types: [f.e] */
    /* JADX WARN: Type inference failed for: r1v19, types: [f.e] */
    /* JADX WARN: Type inference failed for: r4v16, types: [f.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(f.o r19, q.j r20, int r21, h0.g r22) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o.a(f.o, q.j, int, h0.g):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        if (r3 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(q.e r2, s.a r3, f.e r4) {
        /*
            q.j r2 = r2.f31265b
            boolean r0 = r3 instanceof g.u
            if (r0 != 0) goto L9
            if (r3 == 0) goto L16
            goto L13
        L9:
            u.b r0 = r2.f31301m
            r1 = r3
            g.u r1 = (g.u) r1
            u.a r0 = (u.a) r0
            r0.getClass()
        L13:
            r3.onError()
        L16:
            r4.getClass()
            q.i r2 = r2.d
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o.b(q.e, s.a, f.e):void");
    }
}

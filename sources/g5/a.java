package g5;

import android.content.Context;
import com.bumptech.glide.d;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import p5.c;

/* loaded from: classes.dex */
public final class a {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final c f18196b;

    /* renamed from: d, reason: collision with root package name */
    public final File f18198d;

    /* renamed from: e, reason: collision with root package name */
    public final File f18199e;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f18197c = false;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f18200f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f18201g = false;

    public a(Context context, c cVar) {
        this.f18198d = null;
        this.f18199e = null;
        this.a = context;
        this.f18196b = cVar;
        this.f18198d = d.a(cVar.Sg(), cVar.pDU());
        this.f18199e = d.G(cVar.Sg(), cVar.pDU());
    }

    public static void a(a aVar) {
        File file = aVar.f18198d;
        File file2 = aVar.f18199e;
        try {
            if (!file.renameTo(file2)) {
                throw new IOException("Error renaming file " + file + " to " + file2 + " for completion!");
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    public static void b(a aVar, Closeable closeable) {
        aVar.getClass();
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void c(a aVar, c cVar, int i10, String str) {
        aVar.getClass();
        synchronized (r5.b.class) {
            Iterator it = aVar.f18200f.iterator();
            while (it.hasNext()) {
                r5.b bVar = (r5.b) it.next();
                if (bVar != null) {
                    bVar.YFl(cVar, i10, str);
                }
            }
        }
    }

    public final void d(c cVar, int i10) {
        synchronized (r5.b.class) {
            Iterator it = this.f18200f.iterator();
            while (it.hasNext()) {
                r5.b bVar = (r5.b) it.next();
                if (bVar != null) {
                    bVar.YFl(cVar, i10);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r2.length() >= r13.YFl()) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(r5.b r13) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.e(r5.b):void");
    }
}

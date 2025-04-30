package com.mbridge.msdk.foundation.same.b;

import android.util.Log;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ag;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static e f15728a;
    private b b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<a> f15729c = new ArrayList<>();

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public File f15730a;
        public c b;

        public a(c cVar, File file) {
            this.b = cVar;
            this.f15730a = file;
        }
    }

    private e(b bVar) {
        this.b = bVar;
    }

    public static String a(c cVar) {
        File b = b(cVar);
        if (b != null) {
            return b.getAbsolutePath();
        }
        return null;
    }

    public static File b(c cVar) {
        try {
            if (a() == null || a().f15729c == null || a().f15729c.size() <= 0) {
                return null;
            }
            Iterator<a> it = a().f15729c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.b.equals(cVar)) {
                    return next.f15730a;
                }
            }
            return null;
        } catch (Throwable th) {
            ad.b("MBridgeDirManager", th.getMessage(), th);
            return null;
        }
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f15728a == null && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                    ag.a(com.mbridge.msdk.foundation.controller.c.m().c());
                }
                if (f15728a == null) {
                    Log.e("MBridgeDirManager", "mDirectoryManager == null");
                }
                eVar = f15728a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public final boolean b() {
        return a(this.b.b());
    }

    public static synchronized void a(b bVar) {
        synchronized (e.class) {
            if (f15728a == null) {
                f15728a = new e(bVar);
            }
        }
    }

    private boolean a(com.mbridge.msdk.foundation.same.b.a aVar) {
        String str;
        com.mbridge.msdk.foundation.same.b.a c9 = aVar.c();
        if (c9 == null) {
            str = aVar.b();
        } else {
            File b = b(c9.d());
            if (b == null) {
                return false;
            }
            str = b.getAbsolutePath() + File.separator + aVar.b();
        }
        File file = new File(str);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f15729c.add(new a(aVar.d(), file));
        List<com.mbridge.msdk.foundation.same.b.a> a6 = aVar.a();
        if (a6 != null) {
            Iterator<com.mbridge.msdk.foundation.same.b.a> it = a6.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}

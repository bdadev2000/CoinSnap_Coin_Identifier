package com.mbridge.msdk.foundation.same.b;

import android.util.Log;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ag;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class e {
    private static e a;

    /* renamed from: b, reason: collision with root package name */
    private b f13327b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList<a> f13328c = new ArrayList<>();

    /* loaded from: classes4.dex */
    public static final class a {
        public File a;

        /* renamed from: b, reason: collision with root package name */
        public c f13329b;

        public a(c cVar, File file) {
            this.f13329b = cVar;
            this.a = file;
        }
    }

    private e(b bVar) {
        this.f13327b = bVar;
    }

    public static String a(c cVar) {
        File b3 = b(cVar);
        if (b3 != null) {
            return b3.getAbsolutePath();
        }
        return null;
    }

    public static File b(c cVar) {
        try {
            if (a() == null || a().f13328c == null || a().f13328c.size() <= 0) {
                return null;
            }
            Iterator<a> it = a().f13328c.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f13329b.equals(cVar)) {
                    return next.a;
                }
            }
            return null;
        } catch (Throwable th2) {
            ad.b("MBridgeDirManager", th2.getMessage(), th2);
            return null;
        }
    }

    public static synchronized e a() {
        e eVar;
        synchronized (e.class) {
            if (a == null && com.mbridge.msdk.foundation.controller.c.m().c() != null) {
                ag.a(com.mbridge.msdk.foundation.controller.c.m().c());
            }
            if (a == null) {
                Log.e("MBridgeDirManager", "mDirectoryManager == null");
            }
            eVar = a;
        }
        return eVar;
    }

    public final boolean b() {
        return a(this.f13327b.b());
    }

    public static synchronized void a(b bVar) {
        synchronized (e.class) {
            if (a == null) {
                a = new e(bVar);
            }
        }
    }

    private boolean a(com.mbridge.msdk.foundation.same.b.a aVar) {
        String str;
        com.mbridge.msdk.foundation.same.b.a c10 = aVar.c();
        if (c10 == null) {
            str = aVar.b();
        } else {
            File b3 = b(c10.d());
            if (b3 == null) {
                return false;
            }
            str = b3.getAbsolutePath() + File.separator + aVar.b();
        }
        File file = new File(str);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f13328c.add(new a(aVar.d(), file));
        List<com.mbridge.msdk.foundation.same.b.a> a10 = aVar.a();
        if (a10 != null) {
            Iterator<com.mbridge.msdk.foundation.same.b.a> it = a10.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}

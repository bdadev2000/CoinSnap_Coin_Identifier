package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import g4.r;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* renamed from: j, reason: collision with root package name */
    public static volatile b f9604j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile boolean f9605k;

    /* renamed from: b, reason: collision with root package name */
    public final h4.d f9606b;

    /* renamed from: c, reason: collision with root package name */
    public final i4.e f9607c;

    /* renamed from: d, reason: collision with root package name */
    public final g f9608d;

    /* renamed from: f, reason: collision with root package name */
    public final h4.h f9609f;

    /* renamed from: g, reason: collision with root package name */
    public final com.bumptech.glide.manager.m f9610g;

    /* renamed from: h, reason: collision with root package name */
    public final z1.d f9611h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f9612i = new ArrayList();

    public b(Context context, r rVar, i4.e eVar, h4.d dVar, h4.h hVar, com.bumptech.glide.manager.m mVar, z1.d dVar2, int i10, v3.c cVar, r.b bVar, List list, ArrayList arrayList, s.a aVar, kc.c cVar2) {
        this.f9606b = dVar;
        this.f9609f = hVar;
        this.f9607c = eVar;
        this.f9610g = mVar;
        this.f9611h = dVar2;
        this.f9608d = new g(context, hVar, new h3.a(this, arrayList, aVar), new com.facebook.b(26), cVar, bVar, list, rVar, cVar2, i10);
    }

    public static b a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f9604j == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (InstantiationException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            }
            synchronized (b.class) {
                if (f9604j == null) {
                    if (!f9605k) {
                        f9605k = true;
                        try {
                            c(context, generatedAppGlideModule);
                            f9605k = false;
                        } catch (Throwable th2) {
                            f9605k = false;
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                }
            }
        }
        return f9604j;
    }

    public static com.bumptech.glide.manager.m b(Context context) {
        if (context != null) {
            return a(context).f9610g;
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0243  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r26, com.bumptech.glide.GeneratedAppGlideModule r27) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.c(android.content.Context, com.bumptech.glide.GeneratedAppGlideModule):void");
    }

    public static o e(Context context) {
        return b(context).b(context);
    }

    public static o f(Fragment fragment) {
        boolean z10;
        com.bumptech.glide.manager.m b3 = b(fragment.getContext());
        b3.getClass();
        if (fragment.getContext() != null) {
            char[] cArr = w4.m.a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return b3.b(fragment.getContext().getApplicationContext());
            }
            if (fragment.getActivity() != null) {
                fragment.getActivity();
                b3.f9735h.d();
            }
            FragmentManager childFragmentManager = fragment.getChildFragmentManager();
            Context context = fragment.getContext();
            return b3.f9736i.a(context, a(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
        }
        throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
    }

    public final void d(o oVar) {
        synchronized (this.f9612i) {
            if (this.f9612i.contains(oVar)) {
                this.f9612i.remove(oVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        w4.m.a();
        this.f9607c.e(0L);
        this.f9606b.e();
        h4.h hVar = this.f9609f;
        synchronized (hVar) {
            hVar.b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        long j3;
        w4.m.a();
        synchronized (this.f9612i) {
            Iterator it = this.f9612i.iterator();
            while (it.hasNext()) {
                ((o) it.next()).getClass();
            }
        }
        i4.e eVar = this.f9607c;
        eVar.getClass();
        if (i10 >= 40) {
            eVar.e(0L);
        } else if (i10 >= 20 || i10 == 15) {
            synchronized (eVar) {
                j3 = eVar.f26734b;
            }
            eVar.e(j3 / 2);
        }
        this.f9606b.d(i10);
        h4.h hVar = this.f9609f;
        synchronized (hVar) {
            try {
                if (i10 >= 40) {
                    synchronized (hVar) {
                        hVar.b(0);
                    }
                } else if (i10 >= 20 || i10 == 15) {
                    hVar.b(hVar.f18747e / 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

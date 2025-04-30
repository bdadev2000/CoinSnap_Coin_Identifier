package com.bumptech.glide;

import P1.n;
import a5.C0398b;
import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import c2.C0601l;
import c2.p;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import y2.AbstractC2947c;

/* loaded from: classes.dex */
public final class b implements ComponentCallbacks2 {

    /* renamed from: j, reason: collision with root package name */
    public static volatile b f12789j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile boolean f12790k;
    public final Q1.a b;

    /* renamed from: c, reason: collision with root package name */
    public final R1.d f12791c;

    /* renamed from: d, reason: collision with root package name */
    public final e f12792d;

    /* renamed from: f, reason: collision with root package name */
    public final Q1.f f12793f;

    /* renamed from: g, reason: collision with root package name */
    public final C0601l f12794g;

    /* renamed from: h, reason: collision with root package name */
    public final L4.f f12795h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f12796i = new ArrayList();

    public b(Context context, n nVar, R1.d dVar, Q1.a aVar, Q1.f fVar, C0601l c0601l, L4.f fVar2, C0398b c0398b, x.b bVar, List list, ArrayList arrayList, AbstractC2947c abstractC2947c, f fVar3) {
        this.b = aVar;
        this.f12793f = fVar;
        this.f12791c = dVar;
        this.f12794g = c0601l;
        this.f12795h = fVar2;
        this.f12792d = new e(context, fVar, new p(this, arrayList, abstractC2947c), new L4.f(24), c0398b, bVar, list, nVar, fVar3);
    }

    public static b a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f12789j == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            } catch (InstantiationException e9) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e9);
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            }
            synchronized (b.class) {
                if (f12789j == null) {
                    if (!f12790k) {
                        f12790k = true;
                        try {
                            b(context, generatedAppGlideModule);
                            f12790k = false;
                        } catch (Throwable th) {
                            f12790k = false;
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                }
            }
        }
        return f12789j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026c  */
    /* JADX WARN: Type inference failed for: r0v7, types: [S1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [x.l, x.b] */
    /* JADX WARN: Type inference failed for: r14v1, types: [S1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [S1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [S1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [R1.d, h5.g] */
    /* JADX WARN: Type inference failed for: r5v6, types: [Q1.a] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a5.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(android.content.Context r32, com.bumptech.glide.GeneratedAppGlideModule r33) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.b(android.content.Context, com.bumptech.glide.GeneratedAppGlideModule):void");
    }

    public static m d(View view) {
        boolean z8;
        Context context = view.getContext();
        j2.g.c(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        C0601l c0601l = a(context).f12794g;
        c0601l.getClass();
        char[] cArr = j2.n.f21025a;
        boolean z9 = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (!z8) {
            return c0601l.c(view.getContext().getApplicationContext());
        }
        j2.g.c(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity a6 = C0601l.a(view.getContext());
        if (a6 == null) {
            return c0601l.c(view.getContext().getApplicationContext());
        }
        if (a6 instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) a6;
            x.b bVar = c0601l.f5396d;
            bVar.clear();
            C0601l.b(fragmentActivity.getSupportFragmentManager().getFragments(), bVar);
            View findViewById = fragmentActivity.findViewById(R.id.content);
            Fragment fragment = null;
            while (!view.equals(findViewById) && (fragment = (Fragment) bVar.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            bVar.clear();
            if (fragment != null) {
                j2.g.c(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    z9 = true;
                }
                if (!z9) {
                    return c0601l.c(fragment.getContext().getApplicationContext());
                }
                if (fragment.getActivity() != null) {
                    c0601l.f5397f.b(fragment.getActivity());
                }
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                Context context2 = fragment.getContext();
                return c0601l.f5398g.n(context2, a(context2.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
            }
            return c0601l.d(fragmentActivity);
        }
        return c0601l.c(view.getContext().getApplicationContext());
    }

    public final void c(m mVar) {
        synchronized (this.f12796i) {
            try {
                if (this.f12796i.contains(mVar)) {
                    this.f12796i.remove(mVar);
                } else {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        j2.n.a();
        this.f12791c.e(0L);
        this.b.q();
        Q1.f fVar = this.f12793f;
        synchronized (fVar) {
            fVar.b(0);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i9) {
        long j7;
        j2.n.a();
        synchronized (this.f12796i) {
            try {
                Iterator it = this.f12796i.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).getClass();
                }
            } finally {
            }
        }
        R1.d dVar = this.f12791c;
        dVar.getClass();
        if (i9 >= 40) {
            dVar.e(0L);
        } else if (i9 >= 20 || i9 == 15) {
            synchronized (dVar) {
                j7 = dVar.f20607a;
            }
            dVar.e(j7 / 2);
        }
        this.b.o(i9);
        Q1.f fVar = this.f12793f;
        synchronized (fVar) {
            if (i9 >= 40) {
                synchronized (fVar) {
                    fVar.b(0);
                }
            } else if (i9 >= 20 || i9 == 15) {
                fVar.b(fVar.f2477e / 2);
            }
        }
    }
}

package k8;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.plantcare.ai.identifier.plantid.ui.component.main.MainActivity;
import com.plantcare.ai.identifier.plantid.ui.component.splash.SplashActivity;
import com.vungle.ads.a1;
import com.vungle.ads.internal.y0;
import com.vungle.ads.o0;
import ic.e0;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import s7.f0;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20305b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20306c;

    public /* synthetic */ f(Object obj, int i10) {
        this.f20305b = i10;
        this.f20306c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map unmodifiableMap;
        Map map = null;
        int i10 = 0;
        switch (this.f20305b) {
            case 0:
                g gVar = (g) this.f20306c;
                synchronized (gVar.a) {
                    if (!gVar.f20317l) {
                        long j3 = gVar.f20316k - 1;
                        gVar.f20316k = j3;
                        if (j3 <= 0) {
                            if (j3 < 0) {
                                IllegalStateException illegalStateException = new IllegalStateException();
                                synchronized (gVar.a) {
                                    gVar.f20318m = illegalStateException;
                                }
                                return;
                            }
                            gVar.a();
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 1:
                l9.e eVar = (l9.e) this.f20306c;
                int i11 = l9.e.P;
                eVar.d(false);
                return;
            case 2:
                p9.k kVar = (p9.k) this.f20306c;
                Surface surface = kVar.f23551j;
                if (surface != null) {
                    Iterator it = kVar.f23544b.iterator();
                    while (it.hasNext()) {
                        ((f0) it.next()).f24350b.N(null);
                    }
                }
                SurfaceTexture surfaceTexture = kVar.f23550i;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                kVar.f23550i = null;
                kVar.f23551j = null;
                return;
            case 3:
                ((CarouselLayoutManager) this.f20306c).w();
                return;
            case 4:
            default:
                com.vungle.ads.internal.util.h.m68configChangeRunnable$lambda0((com.vungle.ads.internal.util.h) this.f20306c);
                return;
            case 5:
                a4.h hVar = (a4.h) this.f20306c;
                hVar.f134c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) hVar.f136e;
                x0.d dVar = sideSheetBehavior.f11780i;
                if (dVar != null && dVar.g()) {
                    hVar.a(hVar.f133b);
                    return;
                } else {
                    if (sideSheetBehavior.f11779h == 2) {
                        sideSheetBehavior.y(hVar.f133b);
                        return;
                    }
                    return;
                }
            case 6:
                ((na.d) this.f20306c).t(true);
                return;
            case 7:
                na.j jVar = (na.j) this.f20306c;
                boolean isPopupShowing = jVar.f22622h.isPopupShowing();
                jVar.t(isPopupShowing);
                jVar.f22627m = isPopupShowing;
                return;
            case 8:
                ((TextInputLayout) this.f20306c).f11808f.requestLayout();
                return;
            case 9:
                h3.a aVar = (h3.a) this.f20306c;
                ((AtomicReference) aVar.f18724f).set(null);
                synchronized (aVar) {
                    try {
                        if (((AtomicMarkableReference) aVar.f18723d).isMarked()) {
                            lb.d dVar2 = (lb.d) ((AtomicMarkableReference) aVar.f18723d).getReference();
                            synchronized (dVar2) {
                                unmodifiableMap = Collections.unmodifiableMap(new HashMap(dVar2.a));
                            }
                            Object obj = aVar.f18723d;
                            ((AtomicMarkableReference) obj).set((lb.d) ((AtomicMarkableReference) obj).getReference(), false);
                            map = unmodifiableMap;
                        }
                    } finally {
                    }
                }
                if (map != null) {
                    ob.c cVar = (ob.c) aVar.f18725g;
                    ((lb.g) cVar.f23292b).g((String) cVar.a, map, aVar.f18722c);
                    return;
                }
                return;
            case 10:
                dc.d dVar3 = (dc.d) this.f20306c;
                Object obj2 = dc.d.f16973m;
                dVar3.a(false);
                return;
            case 11:
                a4.f fVar = (a4.f) this.f20306c;
                synchronized (((ArrayDeque) fVar.f113e)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) fVar.f112d).edit();
                    String str = (String) fVar.a;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it2 = ((ArrayDeque) fVar.f113e).iterator();
                    while (it2.hasNext()) {
                        sb2.append((String) it2.next());
                        sb2.append((String) fVar.f110b);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 12:
                e0 e0Var = (e0) this.f20306c;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + e0Var.a.getAction() + " finishing.");
                e0Var.f19539b.trySetResult(null);
                return;
            case 13:
                MainActivity this$0 = (MainActivity) this.f20306c;
                int i12 = MainActivity.f16644q;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                xg.b.a.a("load_consent_2");
                com.bumptech.glide.c.H(new ag.b(this$0, i10));
                return;
            case 14:
                sf.a dialogSuccess = (sf.a) this.f20306c;
                Intrinsics.checkNotNullParameter(dialogSuccess, "$dialogSuccess");
                dialogSuccess.cancel();
                return;
            case 15:
                SplashActivity this$02 = (SplashActivity) this.f20306c;
                int i13 = SplashActivity.f16739n;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.J();
                return;
            case 16:
                com.vungle.ads.s.m114init$lambda1((com.vungle.ads.internal.executor.l) this.f20306c);
                return;
            case 17:
                o0.b((o0) this.f20306c);
                return;
            case 18:
                y0.a((a1) this.f20306c);
                return;
            case 19:
                dh.d.a((dh.d) this.f20306c);
                return;
            case 20:
                gh.c.a((gh.c) this.f20306c);
                return;
        }
    }
}

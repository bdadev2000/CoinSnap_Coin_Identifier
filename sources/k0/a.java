package k0;

import a4.d0;
import a4.f0;
import a4.l;
import a4.n;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import androidx.work.o;
import androidx.work.p;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.collect.c1;
import com.otaliastudios.cameraview.CameraView;
import he.a0;
import he.s;
import he.v;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import m2.k;
import m2.m;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20184b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20185c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20186d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f20187f;

    public /* synthetic */ a(int i10, Object obj, Object obj2, Object obj3) {
        this.f20184b = i10;
        this.f20187f = obj;
        this.f20185c = obj2;
        this.f20186d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21, types: [m2.m] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj = null;
        boolean z10 = false;
        boolean z11 = true;
        switch (this.f20184b) {
            case 0:
                fb.c cVar = (fb.c) this.f20185c;
                Typeface typeface = (Typeface) this.f20186d;
                s.a aVar = (s.a) cVar.f17773c;
                if (aVar != null) {
                    aVar.o(typeface);
                    return;
                }
                return;
            case 1:
                ((m0.a) this.f20185c).accept(this.f20186d);
                return;
            case 2:
                try {
                    obj = ((Callable) this.f20185c).call();
                } catch (Exception unused) {
                }
                ((Handler) this.f20187f).post(new a((int) (1 == true ? 1 : 0), this, (m0.a) this.f20186d, obj));
                return;
            case 3:
                try {
                    z11 = ((Boolean) ((ua.b) this.f20187f).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused2) {
                }
                ((m2.a) this.f20185c).d((String) this.f20186d, z11);
                return;
            case 4:
                Object obj2 = this.f20186d;
                Object obj3 = this.f20187f;
                try {
                    ((ua.b) this.f20185c).get();
                    p.e().b(m.f21475v, String.format("Starting work for %s", ((m) obj3).f21480g.f25453c), new Throwable[0]);
                    ((m) obj3).f21493t = ((m) obj3).f21481h.startWork();
                    ((w2.j) obj2).j(((m) obj3).f21493t);
                    return;
                } catch (Throwable th2) {
                    ((w2.j) obj2).i(th2);
                    return;
                }
            case 5:
                Object obj4 = this.f20186d;
                ?? r22 = this.f20187f;
                try {
                    try {
                        o oVar = (o) ((w2.j) this.f20185c).get();
                        if (oVar == null) {
                            p.e().c(m.f21475v, String.format("%s returned a null result. Treating it as a failure.", ((m) r22).f21480g.f25453c), new Throwable[0]);
                        } else {
                            p.e().b(m.f21475v, String.format("%s returned a %s result.", ((m) r22).f21480g.f25453c, oVar), new Throwable[0]);
                            ((m) r22).f21483j = oVar;
                        }
                    } catch (InterruptedException e2) {
                        e = e2;
                        p.e().c(m.f21475v, String.format("%s failed because it threw an exception/error", (String) obj4), e);
                    } catch (CancellationException e10) {
                        p.e().f(m.f21475v, String.format("%s was cancelled", (String) obj4), e10);
                    } catch (ExecutionException e11) {
                        e = e11;
                        p.e().c(m.f21475v, String.format("%s failed because it threw an exception/error", (String) obj4), e);
                    }
                    return;
                } finally {
                    ((m) r22).c();
                }
            case 6:
                u2.j k10 = ((WorkDatabase) this.f20185c).h().k((String) this.f20186d);
                if (k10 != null && k10.b()) {
                    synchronized (((t2.c) this.f20187f).f25184f) {
                        ((t2.c) this.f20187f).f25187i.put((String) this.f20186d, k10);
                        ((t2.c) this.f20187f).f25188j.add(k10);
                        Object obj5 = this.f20187f;
                        ((t2.c) obj5).f25189k.b(((t2.c) obj5).f25188j);
                    }
                    return;
                }
                return;
            case 7:
                ((k) this.f20185c).f21463n.f((String) this.f20186d, (h.c) this.f20187f);
                return;
            case 8:
                c3.j jVar = (c3.j) this.f20187f;
                if (jVar.f2575k != null) {
                    z10 = true;
                }
                if (z10 && !jVar.f2571g) {
                    c3.j.b().e((h.m) this.f20185c, (jb.g) this.f20186d);
                    return;
                }
                return;
            case 9:
                a4.d dVar = (a4.d) this.f20185c;
                n nVar = (n) this.f20186d;
                a4.m mVar = (a4.m) this.f20187f;
                dVar.getClass();
                l lVar = f0.f124k;
                dVar.P(d0.a(24, 4, lVar));
                nVar.b(lVar, mVar.f153b);
                return;
            case 10:
                if (((View) this.f20186d) != null) {
                    ((t9.b) this.f20187f).getClass();
                    return;
                }
                return;
            case 11:
                pb.c cVar2 = (pb.c) this.f20187f;
                jb.a aVar2 = (jb.a) this.f20185c;
                cVar2.b(aVar2, (TaskCompletionSource) this.f20186d);
                ((AtomicInteger) cVar2.f23576i.f23737d).set(0);
                double min = Math.min(3600000.0d, Math.pow(cVar2.f23569b, cVar2.a()) * (60000.0d / cVar2.a));
                b6.a.f2288f.d("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + aVar2.f19873b, null);
                try {
                    Thread.sleep((long) min);
                    return;
                } catch (InterruptedException unused3) {
                    return;
                }
            case 12:
                b6.b bVar = (b6.b) this.f20187f;
                WebView webView = (WebView) this.f20185c;
                String str = (String) this.f20186d;
                bVar.getClass();
                b6.b.c(webView, str);
                return;
            case 13:
                ka.e eVar = (ka.e) this.f20187f;
                WebView webView2 = (WebView) this.f20185c;
                String str2 = (String) this.f20186d;
                eVar.getClass();
                ka.e.c(webView2, str2);
                return;
            case 14:
                c1 c1Var = (c1) this.f20187f;
                ue.b bVar2 = ((CameraView) c1Var.f11925d).A;
                PointF[] pointFArr = {(PointF) this.f20185c};
                View view = (View) bVar2.f25798b.get(1);
                if (view != null) {
                    view.clearAnimation();
                    PointF pointF = pointFArr[0];
                    float width = (int) (pointF.x - (view.getWidth() / 2));
                    float height = (int) (pointF.y - (view.getHeight() / 2));
                    view.setTranslationX(width);
                    view.setTranslationY(height);
                }
                ((CameraView) c1Var.f11925d).getClass();
                Iterator it = ((CameraView) c1Var.f11925d).f16492t.iterator();
                while (it.hasNext()) {
                    ((ng.c) it.next()).getClass();
                }
                return;
            case 15:
                Object obj6 = this.f20187f;
                s sVar = (s) obj6;
                CaptureRequest.Builder builder = sVar.Z;
                ge.g gVar = (ge.g) this.f20185c;
                boolean a02 = sVar.a0(builder, gVar);
                if (sVar.f19029d.f23631f == pe.f.PREVIEW) {
                    z10 = true;
                }
                if (z10) {
                    sVar.f19094n = ge.g.OFF;
                    sVar.a0(sVar.Z, gVar);
                    try {
                        ((s) obj6).Y.capture(((s) obj6).Z.build(), null, null);
                        sVar.f19094n = (ge.g) this.f20186d;
                        sVar.a0(sVar.Z, gVar);
                        sVar.d0();
                        return;
                    } catch (CameraAccessException e12) {
                        throw s.h0(e12);
                    }
                }
                if (a02) {
                    sVar.d0();
                    return;
                }
                return;
            case 16:
                v vVar = (v) this.f20187f;
                if (vVar.c((ge.f) this.f20185c)) {
                    vVar.o();
                    return;
                } else {
                    vVar.G = (ge.f) this.f20186d;
                    return;
                }
            default:
                try {
                    pe.e.f23610e.a(1, ((pe.d) this.f20185c).a.toUpperCase(), "- Executing.");
                    Task task = (Task) ((pe.d) this.f20185c).f23607c.call();
                    te.i iVar = (te.i) this.f20186d;
                    pe.b bVar3 = new pe.b(this);
                    if (task.isComplete()) {
                        he.c cVar3 = new he.c(bVar3, task, 7);
                        iVar.getClass();
                        if (Thread.currentThread() == iVar.f25393b) {
                            cVar3.run();
                        } else {
                            iVar.f25394c.post(cVar3);
                        }
                    } else {
                        task.addOnCompleteListener(iVar.f25395d, bVar3);
                    }
                    return;
                } catch (Exception e13) {
                    pe.e.f23610e.a(1, ((pe.d) this.f20185c).a.toUpperCase(), "- Finished with ERROR.", e13);
                    if (((pe.d) this.f20185c).f23608d) {
                        a0.b((a0) ((hb.d) ((pe.e) this.f20187f).a).f19011c, e13, false);
                    }
                    ((pe.d) this.f20185c).f23606b.trySetException(e13);
                    synchronized (((pe.e) this.f20187f).f23613d) {
                        pe.e.a((pe.e) this.f20187f, (pe.d) this.f20185c);
                        return;
                    }
                }
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.f20184b = i10;
        this.f20185c = obj;
        this.f20186d = obj2;
        this.f20187f = obj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(pb.c cVar, jb.a aVar, TaskCompletionSource taskCompletionSource) {
        this(11, cVar, aVar, taskCompletionSource);
        this.f20184b = 11;
    }
}

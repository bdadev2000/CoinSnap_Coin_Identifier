package he;

import android.hardware.Camera;
import android.hardware.camera2.CaptureRequest;
import android.location.Location;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.collect.c1;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* loaded from: classes4.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19032d;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f19030b = i10;
        this.f19031c = obj;
        this.f19032d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10;
        int i11;
        float f10;
        boolean z11;
        int i12 = this.f19030b;
        Object obj = this.f19031c;
        Object obj2 = this.f19032d;
        switch (i12) {
            case 0:
                g gVar = (g) obj;
                Camera.Parameters parameters = gVar.V.getParameters();
                if (gVar.d0(parameters, (ge.n) obj2)) {
                    gVar.V.setParameters(parameters);
                    return;
                }
                return;
            case 1:
                g gVar2 = (g) obj;
                Camera.Parameters parameters2 = gVar2.V.getParameters();
                if (gVar2.Z(parameters2, (ge.i) obj2)) {
                    gVar2.V.setParameters(parameters2);
                    return;
                }
                return;
            case 2:
                s sVar = (s) obj;
                CaptureRequest.Builder builder = sVar.Z;
                Location location = sVar.f19100t;
                if (location != null) {
                    builder.set(CaptureRequest.JPEG_GPS_LOCATION, location);
                }
                sVar.d0();
                return;
            case 3:
                s sVar2 = (s) obj;
                if (sVar2.f0(sVar2.Z, (ge.n) obj2)) {
                    sVar2.d0();
                    return;
                }
                return;
            case 4:
                s sVar3 = (s) obj;
                if (sVar3.b0(sVar3.Z, (ge.i) obj2)) {
                    sVar3.d0();
                    return;
                }
                return;
            case 5:
            default:
                Continuation intercepted = IntrinsicsKt.intercepted((Continuation) obj2);
                Result.Companion companion = Result.INSTANCE;
                intercepted.resumeWith(Result.m145constructorimpl(ResultKt.createFailure((Exception) obj)));
                return;
            case 6:
                Throwable th2 = (Throwable) obj2;
                if (th2 instanceof fe.a) {
                    fe.a aVar = (fe.a) th2;
                    int i13 = aVar.f17816b;
                    if (i13 != 1 && i13 != 2 && i13 != 3) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        a0.f19026e.a(3, "EXCEPTION:", "Got CameraException. Since it is unrecoverable, executing destroy(false).");
                        ((a0) obj).d(0, false);
                    }
                    a0.f19026e.a(3, "EXCEPTION:", "Got CameraException. Dispatching to callback.");
                    ((c1) ((a0) obj).f19028c).f(aVar);
                    return;
                }
                fe.c cVar = a0.f19026e;
                cVar.a(3, "EXCEPTION:", "Unexpected error! Executing destroy(true).");
                ((a0) obj).d(0, true);
                cVar.a(3, "EXCEPTION:", "Unexpected error! Throwing.");
                if (th2 instanceof RuntimeException) {
                    throw ((RuntimeException) th2);
                }
                throw new RuntimeException(th2);
            case 7:
                ((OnCompleteListener) obj2).onComplete((Task) obj);
                return;
            case 8:
                ((CountDownLatch) obj2).countDown();
                return;
            case 9:
                View f11 = ((ye.b) obj).f();
                ViewParent parent = f11.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(f11);
                }
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            case 10:
                ye.g gVar3 = (ye.g) obj;
                xe.m mVar = (xe.m) obj2;
                gVar3.f28191m.add(mVar);
                te.d dVar = gVar3.f28190l;
                if (dVar != null) {
                    mVar.b(dVar.a.f2227b);
                }
                mVar.a(gVar3.f28195q);
                return;
            case 11:
                ye.g gVar4 = (ye.g) obj;
                te.d dVar2 = gVar4.f28190l;
                if (dVar2 != null) {
                    dVar2.f25383d = (qe.a) obj2;
                }
                Iterator it = gVar4.f28191m.iterator();
                while (it.hasNext()) {
                    ((xe.m) it.next()).a((qe.a) obj2);
                }
                return;
            case 12:
                ye.l lVar = (ye.l) obj;
                if (lVar.f28181g != 0 && lVar.f28180f != 0 && (i10 = lVar.f28179e) != 0 && (i11 = lVar.f28178d) != 0) {
                    ze.a a = ze.a.a(i11, i10);
                    ze.a a10 = ze.a.a(lVar.f28180f, lVar.f28181g);
                    float f12 = 1.0f;
                    if (a.c() >= a10.c()) {
                        f10 = a.c() / a10.c();
                    } else {
                        float c10 = a10.c() / a.c();
                        f10 = 1.0f;
                        f12 = c10;
                    }
                    View view = lVar.f28176b;
                    ((TextureView) view).setScaleX(f12);
                    ((TextureView) view).setScaleY(f10);
                    if (f12 <= 1.02f && f10 <= 1.02f) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    lVar.f28177c = z11;
                    fe.c cVar2 = ye.b.f28175i;
                    cVar2.a(1, "crop:", "applied scaleX=", Float.valueOf(f12));
                    cVar2.a(1, "crop:", "applied scaleY=", Float.valueOf(f10));
                    a4.j.t(obj2);
                    return;
                }
                a4.j.t(obj2);
                return;
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, int i10) {
        this.f19030b = i10;
        this.f19032d = obj;
        this.f19031c = obj2;
    }
}

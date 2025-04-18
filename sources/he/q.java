package he;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class q extends ie.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19065e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f19066f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f19067g;

    public q(List list) {
        this.f19066f = new ArrayList(list);
        this.f19067g = new ArrayList(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ie.e) it.next()).b(new ie.c(this, 2));
        }
    }

    @Override // ie.e
    public final void d(ie.b bVar) {
        switch (this.f19065e) {
            case 1:
                for (ie.e eVar : (List) this.f19066f) {
                    if (!eVar.c()) {
                        eVar.d(bVar);
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // ie.e
    public final void e(s sVar, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10 = this.f19065e;
        Object obj = this.f19066f;
        switch (i10) {
            case 0:
                k(Integer.MAX_VALUE);
                ((TaskCompletionSource) obj).trySetResult(null);
                return;
            default:
                for (ie.e eVar : (List) obj) {
                    if (!eVar.c()) {
                        eVar.e(sVar, captureRequest, totalCaptureResult);
                    }
                }
                return;
        }
    }

    @Override // ie.e
    public final void f(s sVar, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f19065e) {
            case 1:
                for (ie.e eVar : (List) this.f19066f) {
                    if (!eVar.c()) {
                        eVar.f(sVar, captureRequest, captureResult);
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // ie.e
    public final void g(s sVar, CaptureRequest captureRequest) {
        switch (this.f19065e) {
            case 1:
                super.g(sVar, captureRequest);
                for (ie.e eVar : (List) this.f19066f) {
                    if (!eVar.c()) {
                        eVar.g(sVar, captureRequest);
                    }
                }
                return;
            default:
                super.g(sVar, captureRequest);
                return;
        }
    }

    @Override // ie.e
    public final void i(ie.b bVar) {
        switch (this.f19065e) {
            case 1:
                this.f19605c = bVar;
                for (ie.e eVar : (List) this.f19066f) {
                    if (!eVar.c()) {
                        eVar.i(bVar);
                    }
                }
                return;
            default:
                this.f19605c = bVar;
                return;
        }
    }

    public q(s sVar, TaskCompletionSource taskCompletionSource) {
        this.f19067g = sVar;
        this.f19066f = taskCompletionSource;
    }
}

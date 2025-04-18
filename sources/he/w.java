package he;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class w implements Callable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f19106b;

    public /* synthetic */ w(a0 a0Var, int i10) {
        this.a = i10;
        this.f19106b = a0Var;
    }

    public final Task a() {
        boolean z10 = true;
        int i10 = this.a;
        a0 a0Var = this.f19106b;
        switch (i10) {
            case 0:
                return a0Var.i();
            case 1:
                return a0Var.l();
            case 2:
                if (a0Var.c(((v) a0Var).G)) {
                    return a0Var.h();
                }
                a0.f19026e.a(3, "onStartEngine:", "No camera available for facing", ((v) a0Var).G);
                throw new fe.a(6);
            case 3:
                return a0Var.k();
            case 4:
                ye.b bVar = ((v) a0Var).f19086f;
                if (bVar != null) {
                    if (bVar.f28178d <= 0 || bVar.f28179e <= 0) {
                        z10 = false;
                    }
                    if (z10) {
                        return a0Var.g();
                    }
                }
                return Tasks.forCanceled();
            default:
                return a0Var.j();
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.a) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return a();
            case 3:
                return a();
            case 4:
                return a();
            default:
                return a();
        }
    }
}

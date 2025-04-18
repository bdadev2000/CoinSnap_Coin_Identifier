package dc;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final class h implements j {
    public final TaskCompletionSource a;

    public h(TaskCompletionSource taskCompletionSource) {
        this.a = taskCompletionSource;
    }

    @Override // dc.j
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // dc.j
    public final boolean b(ec.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        ec.c cVar = ec.c.UNREGISTERED;
        ec.c cVar2 = aVar.f17292b;
        if (cVar2 == cVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (cVar2 == ec.c.REGISTERED) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (cVar2 == ec.c.REGISTER_ERROR) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    return false;
                }
            }
        }
        this.a.trySetResult(aVar.a);
        return true;
    }
}

package pe;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import he.a0;
import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class b implements OnCompleteListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0.a f23605b;

    public b(k0.a aVar) {
        this.f23605b = aVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Exception exception = task.getException();
        if (exception != null) {
            e.f23610e.a(2, ((d) this.f23605b.f20185c).a.toUpperCase(), "- Finished with ERROR.", exception);
            k0.a aVar = this.f23605b;
            d dVar = (d) aVar.f20185c;
            if (dVar.f23608d) {
                c cVar = ((e) aVar.f20187f).a;
                String str = dVar.a;
                a0.b((a0) ((hb.d) cVar).f19011c, exception, false);
            }
            ((d) this.f23605b.f20185c).f23606b.trySetException(exception);
        } else if (task.isCanceled()) {
            e.f23610e.a(1, ((d) this.f23605b.f20185c).a.toUpperCase(), "- Finished because ABORTED.");
            ((d) this.f23605b.f20185c).f23606b.trySetException(new CancellationException());
        } else {
            e.f23610e.a(1, ((d) this.f23605b.f20185c).a.toUpperCase(), "- Finished.");
            ((d) this.f23605b.f20185c).f23606b.trySetResult(task.getResult());
        }
        synchronized (((e) this.f23605b.f20187f).f23613d) {
            k0.a aVar2 = this.f23605b;
            e.a((e) aVar2.f20187f, (d) aVar2.f20185c);
        }
    }
}

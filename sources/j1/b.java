package j1;

import b1.k;
import b1.l;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class b implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f30862a;

    public b(l lVar) {
        this.f30862a = lVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        Exception exception = task.getException();
        k kVar = this.f30862a;
        if (exception != null) {
            kVar.resumeWith(q.d(exception));
        } else if (task.isCanceled()) {
            kVar.A(null);
        } else {
            kVar.resumeWith(task.getResult());
        }
    }
}

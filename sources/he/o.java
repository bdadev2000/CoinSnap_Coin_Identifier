package he;

import android.view.SurfaceHolder;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class o implements Callable {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19063c;

    public /* synthetic */ o(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.f19063c = obj;
        this.f19062b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.a;
        Object obj = this.f19062b;
        switch (i10) {
            case 0:
                ze.b bVar = ((s) this.f19063c).f19090j;
                ((SurfaceHolder) obj).setFixedSize(bVar.f28749b, bVar.f28750c);
                return null;
            default:
                ((Runnable) obj).run();
                return Tasks.forResult(null);
        }
    }
}

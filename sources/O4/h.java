package O4;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f2192a;

    public h(TaskCompletionSource taskCompletionSource) {
        this.f2192a = taskCompletionSource;
    }

    @Override // O4.j
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // O4.j
    public final boolean b(P4.b bVar) {
        int i9 = bVar.b;
        if (i9 == 3 || i9 == 4 || i9 == 5) {
            this.f2192a.trySetResult(bVar.f2421a);
            return true;
        }
        return false;
    }
}

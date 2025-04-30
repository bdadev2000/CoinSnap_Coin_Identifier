package O4;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final k f2191a;
    public final TaskCompletionSource b;

    public g(k kVar, TaskCompletionSource taskCompletionSource) {
        this.f2191a = kVar;
        this.b = taskCompletionSource;
    }

    @Override // O4.j
    public final boolean a(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }

    @Override // O4.j
    public final boolean b(P4.b bVar) {
        if (bVar.b == 4 && !this.f2191a.a(bVar)) {
            String str = bVar.f2422c;
            if (str != null) {
                this.b.setResult(new a(str, bVar.f2424e, bVar.f2425f));
                return true;
            }
            throw new NullPointerException("Null token");
        }
        return false;
    }
}

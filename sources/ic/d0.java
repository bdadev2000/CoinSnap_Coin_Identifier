package ic;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final class d0 extends Binder {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f19537c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ka.f f19538b;

    public d0(ka.f fVar) {
        this.f19538b = fVar;
    }

    public final void a(e0 e0Var) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            Intent intent = e0Var.a;
            h hVar = (h) this.f19538b.f20532b;
            int i10 = h.f19548h;
            hVar.getClass();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            hVar.f19549b.execute(new androidx.emoji2.text.n(16, hVar, intent, taskCompletionSource));
            taskCompletionSource.getTask().addOnCompleteListener(new l.a(21), new androidx.core.app.h(e0Var, 1));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}

package U4;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import j5.C2400c;

/* loaded from: classes2.dex */
public final class J extends Binder {
    public final C2400c b;

    public J(C2400c c2400c) {
        this.b = c2400c;
    }

    public final void a(K k6) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            Intent intent = k6.f3276a;
            AbstractServiceC0312h abstractServiceC0312h = (AbstractServiceC0312h) this.b.f21107c;
            abstractServiceC0312h.getClass();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            abstractServiceC0312h.b.execute(new RunnableC0311g(abstractServiceC0312h, intent, taskCompletionSource, 0));
            taskCompletionSource.getTask().addOnCompleteListener(new A0.c(0), new F2.d(k6, 7));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}

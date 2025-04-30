package k5;

import M0.C0218i;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h4.C2319a;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import l5.C2451c;
import l5.n;
import m5.RunnableC2467a;
import o5.C2509d;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements SuccessContinuation, Continuation {
    public final /* synthetic */ b b;

    public /* synthetic */ a(b bVar) {
        this.b = bVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        b bVar = this.b;
        Task b = bVar.f21475d.b();
        Task b8 = bVar.f21476e.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{b, b8}).continueWithTask(bVar.f21474c, new C0218i(bVar, b, b8, 2));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z8;
        b bVar = this.b;
        bVar.getClass();
        if (task.isSuccessful()) {
            C2451c c2451c = bVar.f21475d;
            synchronized (c2451c) {
                c2451c.f21584c = Tasks.forResult(null);
            }
            n nVar = c2451c.b;
            synchronized (nVar) {
                nVar.f21637a.deleteFile(nVar.b);
            }
            l5.d dVar = (l5.d) task.getResult();
            if (dVar != null) {
                JSONArray jSONArray = dVar.f21588d;
                h4.c cVar = bVar.b;
                if (cVar != null) {
                    try {
                        cVar.c(b.f(jSONArray));
                    } catch (C2319a e4) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e4);
                    } catch (JSONException e9) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e9);
                    }
                }
                b1.h hVar = bVar.f21482k;
                hVar.getClass();
                try {
                    C2509d c9 = ((k8.c) hVar.f5270c).c(dVar);
                    Iterator it = ((Set) hVar.f5272f).iterator();
                    while (it.hasNext()) {
                        ((Executor) hVar.f5271d).execute(new RunnableC2467a((r4.b) it.next(), c9, 0));
                    }
                } catch (d e10) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z8 = true;
        } else {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }
}

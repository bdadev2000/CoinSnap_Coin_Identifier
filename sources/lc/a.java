package lc;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import mc.o;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements SuccessContinuation, Continuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f21326b;

    public /* synthetic */ a(b bVar) {
        this.f21326b = bVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        b bVar = this.f21326b;
        Task b3 = bVar.f21329d.b();
        Task b10 = bVar.f21330e.b();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{b3, b10}).continueWithTask(bVar.f21328c, new f2.i(8, bVar, b3, b10));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        b bVar = this.f21326b;
        bVar.getClass();
        boolean z10 = false;
        byte b3 = 0;
        if (task.isSuccessful()) {
            mc.d dVar = bVar.f21329d;
            synchronized (dVar) {
                dVar.f22160c = Tasks.forResult(null);
            }
            o oVar = dVar.f22159b;
            synchronized (oVar) {
                oVar.a.deleteFile(oVar.f22218b);
            }
            mc.f fVar = (mc.f) task.getResult();
            if (fVar != null) {
                JSONArray jSONArray = fVar.f22169d;
                wa.c cVar = bVar.f21327b;
                if (cVar != null) {
                    try {
                        cVar.c(b.d(jSONArray));
                    } catch (JSONException e2) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
                    } catch (wa.a e10) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
                    }
                }
                s2.h hVar = bVar.f21336k;
                hVar.getClass();
                try {
                    pc.e i10 = ((qa.a) hVar.f24170c).i(fVar);
                    Iterator it = ((Set) hVar.f24172f).iterator();
                    while (it.hasNext()) {
                        ((Executor) hVar.f24171d).execute(new nc.a((gb.c) it.next(), i10, b3 == true ? 1 : 0));
                    }
                } catch (d e11) {
                    Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e11);
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}

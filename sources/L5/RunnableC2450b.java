package l5;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;
import q.c1;

/* renamed from: l5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2450b implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f21579c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f21580d;

    public RunnableC2450b(c1 c1Var, int i9, long j7) {
        this.f21580d = c1Var;
        this.b = i9;
        this.f21579c = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final c1 c1Var = this.f21580d;
        int i9 = this.b;
        final long j7 = this.f21579c;
        synchronized (c1Var) {
            final int i10 = i9 - 1;
            final Task c9 = ((g) c1Var.f22637c).c(3 - i10);
            final Task b = ((C2451c) c1Var.f22638d).b();
            Tasks.whenAllComplete((Task<?>[]) new Task[]{c9, b}).continueWithTask((ScheduledExecutorService) c1Var.f22640f, new Continuation() { // from class: l5.a
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Boolean valueOf;
                    JSONObject jSONObject;
                    c1 c1Var2 = c1.this;
                    Task task2 = c9;
                    Task task3 = b;
                    long j9 = j7;
                    int i11 = i10;
                    c1Var2.getClass();
                    if (!task2.isSuccessful()) {
                        return Tasks.forException(new g4.h("Failed to auto-fetch config update.", task2.getException()));
                    }
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new g4.h("Failed to get activated config for auto-fetch", task3.getException()));
                    }
                    f fVar = (f) task2.getResult();
                    d dVar = (d) task3.getResult();
                    d dVar2 = fVar.b;
                    boolean z8 = false;
                    if (dVar2 != null) {
                        if (dVar2.f21590f >= j9) {
                            z8 = true;
                        }
                        valueOf = Boolean.valueOf(z8);
                    } else {
                        if (fVar.f21596a == 1) {
                            z8 = true;
                        }
                        valueOf = Boolean.valueOf(z8);
                    }
                    if (!valueOf.booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        c1Var2.a(i11, j9);
                        return Tasks.forResult(null);
                    }
                    if (fVar.b == null) {
                        Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return Tasks.forResult(null);
                    }
                    if (dVar == null) {
                        dVar = d.c().a();
                    }
                    d dVar3 = fVar.b;
                    d a6 = d.a(new JSONObject(dVar3.f21586a.toString()));
                    HashMap b8 = dVar.b();
                    HashMap b9 = dVar3.b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject2 = dVar.b;
                    Iterator<String> keys = jSONObject2.keys();
                    while (true) {
                        boolean hasNext = keys.hasNext();
                        jSONObject = a6.b;
                        if (!hasNext) {
                            break;
                        }
                        String next = keys.next();
                        JSONObject jSONObject3 = dVar3.b;
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (!jSONObject2.get(next).equals(jSONObject3.get(next))) {
                            hashSet.add(next);
                        } else {
                            JSONObject jSONObject4 = dVar.f21589e;
                            boolean has = jSONObject4.has(next);
                            JSONObject jSONObject5 = dVar3.f21589e;
                            if ((has && !jSONObject5.has(next)) || (!jSONObject4.has(next) && jSONObject5.has(next))) {
                                hashSet.add(next);
                            } else if (jSONObject4.has(next) && jSONObject5.has(next) && !jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) {
                                hashSet.add(next);
                            } else if (b8.containsKey(next) != b9.containsKey(next)) {
                                hashSet.add(next);
                            } else if (b8.containsKey(next) && b9.containsKey(next) && !((Map) b8.get(next)).equals(b9.get(next))) {
                                hashSet.add(next);
                            } else {
                                jSONObject.remove(next);
                            }
                        }
                    }
                    Iterator<String> keys2 = jSONObject.keys();
                    while (keys2.hasNext()) {
                        hashSet.add(keys2.next());
                    }
                    if (hashSet.isEmpty()) {
                        Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                        return Tasks.forResult(null);
                    }
                    synchronized (c1Var2) {
                        Iterator it = ((Set) c1Var2.f22636a).iterator();
                        while (it.hasNext()) {
                            ((l) it.next()).getClass();
                        }
                    }
                    return Tasks.forResult(null);
                }
            });
        }
    }
}

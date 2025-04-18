package mc;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22149c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f22150d;

    public b(c cVar, int i10, long j3) {
        this.f22150d = cVar;
        this.f22148b = i10;
        this.f22149c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final c cVar = this.f22150d;
        int i10 = this.f22148b;
        final long j3 = this.f22149c;
        synchronized (cVar) {
            final int i11 = i10 - 1;
            final Task c10 = cVar.f22152c.c(3 - i11);
            final Task b3 = cVar.f22153d.b();
            Tasks.whenAllComplete((Task<?>[]) new Task[]{c10, b3}).continueWithTask(cVar.f22155f, new Continuation() { // from class: mc.a
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    Boolean valueOf;
                    JSONObject jSONObject;
                    c cVar2 = c.this;
                    Task task2 = c10;
                    Task task3 = b3;
                    long j10 = j3;
                    int i12 = i11;
                    cVar2.getClass();
                    if (!task2.isSuccessful()) {
                        return Tasks.forException(new lc.c("Failed to auto-fetch config update.", task2.getException()));
                    }
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new lc.c("Failed to get activated config for auto-fetch", task3.getException()));
                    }
                    h hVar = (h) task2.getResult();
                    f fVar = (f) task3.getResult();
                    f fVar2 = hVar.f22178b;
                    boolean z10 = false;
                    if (fVar2 != null) {
                        if (fVar2.f22171f >= j10) {
                            z10 = true;
                        }
                        valueOf = Boolean.valueOf(z10);
                    } else {
                        if (hVar.a == 1) {
                            z10 = true;
                        }
                        valueOf = Boolean.valueOf(z10);
                    }
                    if (!valueOf.booleanValue()) {
                        Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                        cVar2.a(i12, j10);
                        return Tasks.forResult(null);
                    }
                    if (hVar.f22178b == null) {
                        Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                        return Tasks.forResult(null);
                    }
                    if (fVar == null) {
                        Date date = f.f22166h;
                        fVar = new e().a();
                    }
                    f fVar3 = hVar.f22178b;
                    f a = f.a(new JSONObject(fVar3.a.toString()));
                    HashMap b10 = fVar.b();
                    HashMap b11 = fVar3.b();
                    HashSet hashSet = new HashSet();
                    JSONObject jSONObject2 = fVar.f22167b;
                    Iterator<String> keys = jSONObject2.keys();
                    while (true) {
                        boolean hasNext = keys.hasNext();
                        jSONObject = a.f22167b;
                        if (!hasNext) {
                            break;
                        }
                        String next = keys.next();
                        JSONObject jSONObject3 = fVar3.f22167b;
                        if (!jSONObject3.has(next)) {
                            hashSet.add(next);
                        } else if (!jSONObject2.get(next).equals(jSONObject3.get(next))) {
                            hashSet.add(next);
                        } else {
                            JSONObject jSONObject4 = fVar.f22170e;
                            boolean has = jSONObject4.has(next);
                            JSONObject jSONObject5 = fVar3.f22170e;
                            if ((has && !jSONObject5.has(next)) || (!jSONObject4.has(next) && jSONObject5.has(next))) {
                                hashSet.add(next);
                            } else if (jSONObject4.has(next) && jSONObject5.has(next) && !jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) {
                                hashSet.add(next);
                            } else if (b10.containsKey(next) != b11.containsKey(next)) {
                                hashSet.add(next);
                            } else if (b10.containsKey(next) && b11.containsKey(next) && !((Map) b10.get(next)).equals(b11.get(next))) {
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
                    synchronized (cVar2) {
                        Iterator it = cVar2.a.iterator();
                        while (it.hasNext()) {
                            ((m) it.next()).getClass();
                        }
                    }
                    return Tasks.forResult(null);
                }
            });
        }
    }
}

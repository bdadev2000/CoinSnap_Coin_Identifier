package qb;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.w;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.atomic.AtomicReference;
import jb.g;
import m2.l;
import org.json.JSONObject;
import y7.q;

/* loaded from: classes3.dex */
public final class b implements SuccessContinuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kb.d f23743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f23744c;

    public b(l lVar, kb.d dVar) {
        this.f23744c = lVar;
        this.f23743b = dVar;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task then(Object obj) {
        FileWriter fileWriter;
        JSONObject jSONObject = (JSONObject) this.f23743b.f20635c.f20629b.submit(new w(this, 2)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            l lVar = this.f23744c;
            a e2 = ((q) lVar.f21469d).e(jSONObject);
            hb.d dVar = (hb.d) lVar.f21471f;
            long j3 = e2.f23739c;
            dVar.getClass();
            b6.a aVar = b6.a.f2288f;
            aVar.h("Writing settings to cache file...");
            try {
                jSONObject.put("expires_at", j3);
                fileWriter = new FileWriter((File) dVar.f19011c);
            } catch (Exception e10) {
                e = e10;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                g.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            try {
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Throwable th3) {
                    th = th3;
                    fileWriter2 = fileWriter;
                    g.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                aVar.e("Failed to cache settings", e);
                g.c(fileWriter, "Failed to close settings writer.");
                aVar.d("Loaded settings: " + jSONObject.toString(), null);
                String str = ((d) lVar.f21468c).f23749f;
                SharedPreferences.Editor edit = ((Context) lVar.f21467b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                edit.putString("existing_instance_identifier", str);
                edit.apply();
                ((AtomicReference) lVar.f21473h).set(e2);
                ((TaskCompletionSource) ((AtomicReference) lVar.f21474i).get()).trySetResult(e2);
                return Tasks.forResult(null);
            }
            g.c(fileWriter, "Failed to close settings writer.");
            aVar.d("Loaded settings: " + jSONObject.toString(), null);
            String str2 = ((d) lVar.f21468c).f23749f;
            SharedPreferences.Editor edit2 = ((Context) lVar.f21467b).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str2);
            edit2.apply();
            ((AtomicReference) lVar.f21473h).set(e2);
            ((TaskCompletionSource) ((AtomicReference) lVar.f21474i).get()).trySetResult(e2);
        }
        return Tasks.forResult(null);
    }
}

package u4;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* renamed from: u4.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2781z implements Continuation {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23185c;

    public /* synthetic */ C2781z(Object obj, int i9) {
        this.b = i9;
        this.f23185c = obj;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z8;
        switch (this.b) {
            case 0:
                ((U4.p) this.f23185c).getClass();
                if (task.isSuccessful()) {
                    C2756a c2756a = (C2756a) task.getResult();
                    r4.d dVar = r4.d.f22842a;
                    dVar.c("Crashlytics report successfully enqueued to DataTransport: " + c2756a.b);
                    File file = c2756a.f23110c;
                    if (file.delete()) {
                        dVar.c("Deleted report file: " + file.getPath());
                    } else {
                        dVar.g("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                    z8 = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            default:
                ((CountDownLatch) this.f23185c).countDown();
                return null;
        }
    }
}

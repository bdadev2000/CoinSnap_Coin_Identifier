package u4;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: u4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2763h implements SuccessContinuation {

    /* renamed from: f, reason: collision with root package name */
    public static final L2.e f23119f = new L2.e(5);

    /* renamed from: g, reason: collision with root package name */
    public static final M2.b f23120g = new M2.b(4);
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f23121c;

    /* renamed from: d, reason: collision with root package name */
    public Object f23122d;

    public C2763h(z4.c cVar) {
        this.b = null;
        this.f23122d = null;
        this.f23121c = cVar;
    }

    public static void a(z4.c cVar, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                cVar.b(str, "aqs.".concat(str2)).createNewFile();
            } catch (IOException e4) {
                Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e4);
            }
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        String str = null;
        if (((B4.b) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        CallableC2765j callableC2765j = (CallableC2765j) this.f23122d;
        Task b = C2769n.b(callableC2765j.f23128f);
        U4.p pVar = callableC2765j.f23128f.m;
        if (callableC2765j.f23127e) {
            str = this.b;
        }
        return Tasks.whenAll((Task<?>[]) new Task[]{b, pVar.r(str, (Executor) this.f23121c)});
    }

    public C2763h(CallableC2765j callableC2765j, Executor executor, String str) {
        this.f23122d = callableC2765j;
        this.f23121c = executor;
        this.b = str;
    }
}

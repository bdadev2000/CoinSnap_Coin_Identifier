package ic;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: i, reason: collision with root package name */
    public static final long f19592i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f19593j = 0;
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final com.facebook.i f19594b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.appcompat.widget.v f19595c;

    /* renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f19596d;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f19598f;

    /* renamed from: h, reason: collision with root package name */
    public final x f19600h;

    /* renamed from: e, reason: collision with root package name */
    public final r.b f19597e = new r.b();

    /* renamed from: g, reason: collision with root package name */
    public boolean f19599g = false;

    public z(FirebaseMessaging firebaseMessaging, com.facebook.i iVar, x xVar, androidx.appcompat.widget.v vVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f19596d = firebaseMessaging;
        this.f19594b = iVar;
        this.f19600h = xVar;
        this.f19595c = vVar;
        this.a = context;
        this.f19598f = scheduledExecutorService;
    }

    public static void a(Task task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e10);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e11) {
            e = e11;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public static boolean d() {
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    public final void b(String str) {
        String a = this.f19596d.a();
        androidx.appcompat.widget.v vVar = this.f19595c;
        vVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(vVar.d(vVar.k(bundle, a, "/topics/" + str)));
    }

    public final void c(String str) {
        String a = this.f19596d.a();
        androidx.appcompat.widget.v vVar = this.f19595c;
        vVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(vVar.d(vVar.k(bundle, a, "/topics/" + str)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x000e, code lost:
    
        if (d() == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0010, code lost:
    
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0018, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0087 A[Catch: IOException -> 0x00a3, TryCatch #2 {IOException -> 0x00a3, blocks: (B:8:0x0023, B:17:0x004f, B:19:0x0055, B:56:0x006b, B:58:0x0074, B:59:0x0087, B:61:0x0090, B:62:0x0032, B:65:0x003c), top: B:7:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.z.e():boolean");
    }

    public final void f(long j3) {
        this.f19598f.schedule(new b0(this, this.a, this.f19594b, Math.min(Math.max(30L, 2 * j3), f19592i)), j3, TimeUnit.SECONDS);
        synchronized (this) {
            this.f19599g = true;
        }
    }
}

package m9;

import android.os.Looper;
import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class n0 implements o0 {

    /* renamed from: f, reason: collision with root package name */
    public static final j8.e f21691f;

    /* renamed from: g, reason: collision with root package name */
    public static final j8.e f21692g;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f21693b;

    /* renamed from: c, reason: collision with root package name */
    public j0 f21694c;

    /* renamed from: d, reason: collision with root package name */
    public IOException f21695d;

    static {
        long j3 = C.TIME_UNSET;
        int i10 = 0;
        f21691f = new j8.e(2, j3, i10);
        f21692g = new j8.e(3, j3, i10);
    }

    public n0(String str) {
        String concat = "ExoPlayer:Loader:".concat(str);
        int i10 = n9.h0.a;
        this.f21693b = Executors.newSingleThreadExecutor(new androidx.emoji2.text.a(concat, 1));
    }

    public final boolean a() {
        return this.f21694c != null;
    }

    public final void b(l0 l0Var) {
        j0 j0Var = this.f21694c;
        if (j0Var != null) {
            j0Var.a(true);
        }
        ExecutorService executorService = this.f21693b;
        if (l0Var != null) {
            executorService.execute(new androidx.activity.i(l0Var, 21));
        }
        executorService.shutdown();
    }

    public final long c(k0 k0Var, i0 i0Var, int i10) {
        Looper myLooper = Looper.myLooper();
        v8.u0.p(myLooper);
        this.f21695d = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new j0(this, myLooper, k0Var, i0Var, i10, elapsedRealtime).b(0L);
        return elapsedRealtime;
    }

    @Override // m9.o0
    public final void maybeThrowError() {
        IOException iOException;
        IOException iOException2 = this.f21695d;
        if (iOException2 == null) {
            j0 j0Var = this.f21694c;
            if (j0Var != null && (iOException = j0Var.f21678g) != null && j0Var.f21679h > j0Var.f21674b) {
                throw iOException;
            }
            return;
        }
        throw iOException2;
    }
}

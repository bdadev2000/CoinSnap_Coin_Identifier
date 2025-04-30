package f5;

import a5.C0397a;
import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.v1.CpuMetricReading;
import h5.i;
import i5.C2357l;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final C0397a f20331g = C0397a.d();

    /* renamed from: h, reason: collision with root package name */
    public static final long f20332h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: e, reason: collision with root package name */
    public ScheduledFuture f20336e = null;

    /* renamed from: f, reason: collision with root package name */
    public long f20337f = -1;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f20333a = new ConcurrentLinkedQueue();
    public final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c, reason: collision with root package name */
    public final String f20334c = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* renamed from: d, reason: collision with root package name */
    public final long f20335d = Os.sysconf(OsConstants._SC_CLK_TCK);

    public final synchronized void a(long j7, i iVar) {
        this.f20337f = j7;
        try {
            this.f20336e = this.b.scheduleAtFixedRate(new a(this, iVar, 0), 0L, j7, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e4) {
            f20331g.f("Unable to start collecting Cpu Metrics: " + e4.getMessage());
        }
    }

    public final CpuMetricReading b(i iVar) {
        BufferedReader bufferedReader;
        long parseLong;
        long parseLong2;
        C2357l newBuilder;
        double d2;
        long j7;
        long j9 = this.f20335d;
        C0397a c0397a = f20331g;
        if (iVar == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f20334c));
            try {
                long c9 = iVar.c() + iVar.b;
                String[] split = bufferedReader2.readLine().split(" ");
                parseLong = Long.parseLong(split[13]);
                parseLong2 = Long.parseLong(split[15]);
                long parseLong3 = Long.parseLong(split[14]);
                long parseLong4 = Long.parseLong(split[16]);
                newBuilder = CpuMetricReading.newBuilder();
                newBuilder.a(c9);
                d2 = (parseLong3 + parseLong4) / j9;
                j7 = f20332h;
                bufferedReader = bufferedReader2;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
            }
            try {
                newBuilder.b(Math.round(d2 * j7));
                newBuilder.c(Math.round(((parseLong + parseLong2) / j9) * j7));
                CpuMetricReading cpuMetricReading = (CpuMetricReading) newBuilder.build();
                bufferedReader.close();
                return cpuMetricReading;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    bufferedReader.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException e4) {
            c0397a.f("Unable to read 'proc/[pid]/stat' file: " + e4.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e9) {
            e = e9;
            c0397a.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NullPointerException e10) {
            e = e10;
            c0397a.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        } catch (NumberFormatException e11) {
            e = e11;
            c0397a.f("Unexpected '/proc/[pid]/stat' file format encountered: " + e.getMessage());
            return null;
        }
    }
}

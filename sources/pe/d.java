package pe;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class d {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f23606b = new TaskCompletionSource();

    /* renamed from: c, reason: collision with root package name */
    public final Callable f23607c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23608d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23609e;

    public d(String str, Callable callable, boolean z10, long j3) {
        this.a = str;
        this.f23607c = callable;
        this.f23608d = z10;
        this.f23609e = j3;
    }
}

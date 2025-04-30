package p4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class l implements Executor {
    public static final l b;

    /* renamed from: c, reason: collision with root package name */
    public static final Handler f22243c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l[] f22244d;

    /* JADX WARN: Type inference failed for: r0v0, types: [p4.l, java.lang.Enum] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        b = r02;
        f22244d = new l[]{r02};
        f22243c = new Handler(Looper.getMainLooper());
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f22244d.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f22243c.post(runnable);
    }
}

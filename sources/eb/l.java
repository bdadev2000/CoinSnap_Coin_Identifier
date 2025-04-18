package eb;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class l implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final l f17288b;

    /* renamed from: c, reason: collision with root package name */
    public static final Handler f17289c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ l[] f17290d;

    static {
        l lVar = new l();
        f17288b = lVar;
        f17290d = new l[]{lVar};
        f17289c = new Handler(Looper.getMainLooper());
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f17290d.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f17289c.post(runnable);
    }
}

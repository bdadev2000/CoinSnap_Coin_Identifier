package eb;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final h f17277b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h[] f17278c;

    static {
        h hVar = new h();
        f17277b = hVar;
        f17278c = new h[]{hVar};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f17278c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}

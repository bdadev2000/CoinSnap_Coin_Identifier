package p4;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class j implements Executor {
    public static final j b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ j[] f22237c;

    /* JADX WARN: Type inference failed for: r0v0, types: [p4.j, java.lang.Enum] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        b = r02;
        f22237c = new j[]{r02};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f22237c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}

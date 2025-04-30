package f1;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: f1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2261j implements Executor {
    public static final EnumC2261j b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC2261j[] f20266c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, f1.j] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        b = r02;
        f20266c = new EnumC2261j[]{r02};
    }

    public static EnumC2261j valueOf(String str) {
        return (EnumC2261j) Enum.valueOf(EnumC2261j.class, str);
    }

    public static EnumC2261j[] values() {
        return (EnumC2261j[]) f20266c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}

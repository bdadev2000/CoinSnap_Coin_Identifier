package androidx.concurrent.futures;

import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@RestrictTo
/* loaded from: classes4.dex */
public final class DirectExecutor implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final DirectExecutor f17733a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ DirectExecutor[] f17734b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.concurrent.futures.DirectExecutor] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f17733a = r02;
        f17734b = new DirectExecutor[]{r02};
    }

    public static DirectExecutor valueOf(String str) {
        return (DirectExecutor) Enum.valueOf(DirectExecutor.class, str);
    }

    public static DirectExecutor[] values() {
        return (DirectExecutor[]) f17734b.clone();
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

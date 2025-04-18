package h;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p0 implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18642b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f18643c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f18644d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f18645f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f18646g;

    public p0(Executor executor, int i10) {
        this.f18642b = i10;
        if (i10 != 1) {
            this.f18645f = new Object();
            this.f18646g = new ArrayDeque();
            this.f18643c = executor;
        } else {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f18643c = executor;
            this.f18646g = new ArrayDeque();
            this.f18645f = new Object();
        }
    }

    public final void a() {
        switch (this.f18642b) {
            case 0:
                synchronized (this.f18645f) {
                    Runnable runnable = (Runnable) this.f18646g.poll();
                    this.f18644d = runnable;
                    if (runnable != null) {
                        this.f18643c.execute(runnable);
                    }
                }
                return;
            default:
                synchronized (this.f18645f) {
                    Object poll = this.f18646g.poll();
                    Runnable runnable2 = (Runnable) poll;
                    this.f18644d = runnable2;
                    if (poll != null) {
                        this.f18643c.execute(runnable2);
                    }
                    Unit unit = Unit.INSTANCE;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        switch (this.f18642b) {
            case 0:
                synchronized (this.f18645f) {
                    this.f18646g.add(new o0(0, this, command));
                    if (this.f18644d == null) {
                        a();
                    }
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(command, "command");
                synchronized (this.f18645f) {
                    this.f18646g.offer(new o0(this, command));
                    if (this.f18644d == null) {
                        a();
                    }
                    Unit unit = Unit.INSTANCE;
                }
                return;
        }
    }
}

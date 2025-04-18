package androidx.lifecycle;

import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class DispatchQueue {

    /* renamed from: b, reason: collision with root package name */
    public boolean f19958b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19959c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f19957a = true;
    public final ArrayDeque d = new ArrayDeque();

    public final void a() {
        if (this.f19959c) {
            return;
        }
        try {
            this.f19959c = true;
            while (true) {
                ArrayDeque arrayDeque = this.d;
                if (!(!arrayDeque.isEmpty()) || (!this.f19958b && this.f19957a)) {
                    break;
                }
                Runnable runnable = (Runnable) arrayDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.f19959c = false;
        }
    }
}

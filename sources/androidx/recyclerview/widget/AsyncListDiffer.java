package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.DiffUtil;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class AsyncListDiffer<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: androidx.recyclerview.widget.AsyncListDiffer$1$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        class AnonymousClass2 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.AsyncListDiffer$1$1] */
        @Override // java.lang.Runnable
        public final void run() {
            new DiffUtil.Callback() { // from class: androidx.recyclerview.widget.AsyncListDiffer.1.1
                public final int a() {
                    AnonymousClass1.this.getClass();
                    throw null;
                }
            }.a();
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public interface ListListener<T> {
    }

    /* loaded from: classes.dex */
    public static class MainThreadExecutor implements Executor {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f20925a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f20925a.post(runnable);
        }
    }

    static {
        new MainThreadExecutor();
    }
}

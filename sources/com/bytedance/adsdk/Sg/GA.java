package com.bytedance.adsdk.Sg;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class GA<T> {
    public static Executor YFl = Executors.newCachedThreadPool();
    private final Handler AlY;
    private final Set<eT<T>> Sg;
    private final Set<eT<Throwable>> tN;
    private volatile YoT<T> wN;

    /* loaded from: classes.dex */
    public class YFl extends FutureTask<YoT<T>> {
        public YFl(Callable<YoT<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (!isCancelled()) {
                try {
                    GA.this.YFl((YoT) get());
                } catch (InterruptedException | ExecutionException e2) {
                    GA.this.YFl(new YoT(e2));
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public GA(Callable<YoT<T>> callable) {
        this(callable, false);
    }

    public synchronized GA<T> AlY(eT<Throwable> eTVar) {
        this.tN.remove(eTVar);
        return this;
    }

    public synchronized GA<T> Sg(eT<T> eTVar) {
        this.Sg.remove(eTVar);
        return this;
    }

    public synchronized GA<T> tN(eT<Throwable> eTVar) {
        YoT<T> yoT = this.wN;
        if (yoT != null && yoT.Sg() != null) {
            eTVar.YFl(yoT.Sg());
        }
        this.tN.add(eTVar);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public GA(Callable<YoT<T>> callable, boolean z10) {
        this.Sg = new LinkedHashSet(1);
        this.tN = new LinkedHashSet(1);
        this.AlY = new Handler(Looper.getMainLooper());
        this.wN = null;
        if (z10) {
            try {
                YFl((YoT) callable.call());
                return;
            } catch (Throwable th2) {
                YFl((YoT) new YoT<>(th2));
                return;
            }
        }
        YFl.execute(new YFl(callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void YFl(YoT<T> yoT) {
        if (this.wN == null) {
            this.wN = yoT;
            YFl();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized GA<T> YFl(eT<T> eTVar) {
        YoT<T> yoT = this.wN;
        if (yoT != null && yoT.YFl() != null) {
            eTVar.YFl(yoT.YFl());
        }
        this.Sg.add(eTVar);
        return this;
    }

    private void YFl() {
        this.AlY.post(new Runnable() { // from class: com.bytedance.adsdk.Sg.GA.1
            @Override // java.lang.Runnable
            public void run() {
                YoT yoT = GA.this.wN;
                if (yoT == null) {
                    return;
                }
                if (yoT.YFl() != null) {
                    GA.this.YFl((GA) yoT.YFl());
                } else {
                    GA.this.YFl(yoT.Sg());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void YFl(T t5) {
        Iterator it = new ArrayList(this.Sg).iterator();
        while (it.hasNext()) {
            ((eT) it.next()).YFl(t5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void YFl(Throwable th2) {
        ArrayList arrayList = new ArrayList(this.tN);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((eT) it.next()).YFl(th2);
        }
    }
}

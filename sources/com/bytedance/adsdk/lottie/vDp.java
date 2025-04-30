package com.bytedance.adsdk.lottie;

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
public class vDp<T> {
    public static Executor zp = Executors.newCachedThreadPool();
    private volatile Bj<T> COT;
    private final Set<dT<Throwable>> KS;
    private final Handler jU;
    private final Set<dT<T>> lMd;

    /* loaded from: classes.dex */
    public class zp extends FutureTask<Bj<T>> {
        public zp(Callable<Bj<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (!isCancelled()) {
                try {
                    vDp.this.zp((Bj) get());
                } catch (InterruptedException | ExecutionException e4) {
                    vDp.this.zp(new Bj(e4));
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public vDp(Callable<Bj<T>> callable) {
        this(callable, false);
    }

    public synchronized vDp<T> KS(dT<Throwable> dTVar) {
        try {
            Bj<T> bj = this.COT;
            if (bj != null && bj.lMd() != null) {
                dTVar.zp(bj.lMd());
            }
            this.KS.add(dTVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized vDp<T> jU(dT<Throwable> dTVar) {
        this.KS.remove(dTVar);
        return this;
    }

    public synchronized vDp<T> lMd(dT<T> dTVar) {
        this.lMd.remove(dTVar);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public vDp(Callable<Bj<T>> callable, boolean z8) {
        this.lMd = new LinkedHashSet(1);
        this.KS = new LinkedHashSet(1);
        this.jU = new Handler(Looper.getMainLooper());
        this.COT = null;
        if (z8) {
            try {
                zp((Bj) callable.call());
                return;
            } catch (Throwable th) {
                zp((Bj) new Bj<>(th));
                return;
            }
        }
        zp.execute(new zp(callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(Bj<T> bj) {
        if (this.COT == null) {
            this.COT = bj;
            zp();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized vDp<T> zp(dT<T> dTVar) {
        try {
            Bj<T> bj = this.COT;
            if (bj != null && bj.zp() != null) {
                dTVar.zp(bj.zp());
            }
            this.lMd.add(dTVar);
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    private void zp() {
        this.jU.post(new Runnable() { // from class: com.bytedance.adsdk.lottie.vDp.1
            @Override // java.lang.Runnable
            public void run() {
                Bj bj = vDp.this.COT;
                if (bj == null) {
                    return;
                }
                if (bj.zp() != null) {
                    vDp.this.zp((vDp) bj.zp());
                } else {
                    vDp.this.zp(bj.lMd());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void zp(T t9) {
        Iterator it = new ArrayList(this.lMd).iterator();
        while (it.hasNext()) {
            ((dT) it.next()).zp(t9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void zp(Throwable th) {
        ArrayList arrayList = new ArrayList(this.KS);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((dT) it.next()).zp(th);
        }
    }
}

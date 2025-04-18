package com.adjust.sdk.scheduler;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class AsyncTaskExecutor<Params, Result> {

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Object[] a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Handler f2898b;

        /* renamed from: com.adjust.sdk.scheduler.AsyncTaskExecutor$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0000a implements Runnable {
            public final /* synthetic */ Object a;

            public RunnableC0000a(Object obj) {
                this.a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                AsyncTaskExecutor.this.onPostExecute(this.a);
            }
        }

        public a(Object[] objArr, Handler handler) {
            this.a = objArr;
            this.f2898b = handler;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.f2898b.post(new RunnableC0000a(AsyncTaskExecutor.this.doInBackground(this.a)));
        }
    }

    public abstract Result doInBackground(Params[] paramsArr);

    @SafeVarargs
    public final AsyncTaskExecutor<Params, Result> execute(Params... paramsArr) {
        onPreExecute();
        Executors.newSingleThreadExecutor().execute(new a(paramsArr, new Handler(Looper.getMainLooper())));
        return this;
    }

    public void onPostExecute(Result result) {
    }

    public void onPreExecute() {
    }
}

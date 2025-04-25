package com.adjust.sdk.scheduler;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;

/* loaded from: classes7.dex */
public abstract class AsyncTaskExecutor<Params, Result> {

    /* loaded from: classes7.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object[] f262a;
        public final /* synthetic */ Handler b;

        /* renamed from: com.adjust.sdk.scheduler.AsyncTaskExecutor$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public class RunnableC0086a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f263a;

            public RunnableC0086a(Object obj) {
                this.f263a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                AsyncTaskExecutor.this.onPostExecute(this.f263a);
            }
        }

        public a(Object[] objArr, Handler handler) {
            this.f262a = objArr;
            this.b = handler;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            this.b.post(new RunnableC0086a(AsyncTaskExecutor.this.doInBackground(this.f262a)));
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

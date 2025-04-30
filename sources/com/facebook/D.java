package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class D extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final E f13400a;
    public Exception b;

    public D(E e4) {
        G7.j.e(e4, "requests");
        this.f13400a = e4;
    }

    public final void a(List list) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            if (O2.a.b(this)) {
                return;
            }
            try {
                if (O2.a.b(this)) {
                    return;
                }
                try {
                    G7.j.e(list, "result");
                    super.onPostExecute(list);
                    Exception exc = this.b;
                    if (exc != null) {
                        String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                        r rVar = r.f13801a;
                    }
                } catch (Throwable th) {
                    O2.a.a(this, th);
                }
            } catch (Throwable th2) {
                O2.a.a(this, th2);
            }
        } catch (Throwable th3) {
            O2.a.a(this, th3);
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        ArrayList arrayList = null;
        if (O2.a.b(this)) {
            return null;
        }
        try {
            if (O2.a.b(this)) {
                return null;
            }
            try {
                if (O2.a.b(this)) {
                    return null;
                }
                try {
                    Void[] voidArr = (Void[]) objArr;
                    if (!O2.a.b(this)) {
                        try {
                            if (!O2.a.b(this)) {
                                try {
                                    if (!O2.a.b(this)) {
                                        try {
                                            G7.j.e(voidArr, "params");
                                            try {
                                                E e4 = this.f13400a;
                                                e4.getClass();
                                                String str = C.f13380j;
                                                arrayList = R3.e.r(e4);
                                            } catch (Exception e9) {
                                                this.b = e9;
                                            }
                                        } catch (Throwable th) {
                                            O2.a.a(this, th);
                                        }
                                    }
                                } catch (Throwable th2) {
                                    O2.a.a(this, th2);
                                }
                            }
                        } catch (Throwable th3) {
                            O2.a.a(this, th3);
                        }
                    }
                    return arrayList;
                } catch (Throwable th4) {
                    O2.a.a(this, th4);
                    return arrayList;
                }
            } catch (Throwable th5) {
                O2.a.a(this, th5);
                return arrayList;
            }
        } catch (Throwable th6) {
            O2.a.a(this, th6);
            return arrayList;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (O2.a.b(this)) {
            return;
        }
        try {
            if (O2.a.b(this)) {
                return;
            }
            try {
                if (O2.a.b(this)) {
                    return;
                }
                try {
                    a((List) obj);
                } catch (Throwable th) {
                    O2.a.a(this, th);
                }
            } catch (Throwable th2) {
                O2.a.a(this, th2);
            }
        } catch (Throwable th3) {
            O2.a.a(this, th3);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        Handler handler;
        E e4 = this.f13400a;
        if (O2.a.b(this)) {
            return;
        }
        try {
            if (O2.a.b(this)) {
                return;
            }
            try {
                if (O2.a.b(this)) {
                    return;
                }
                try {
                    super.onPreExecute();
                    r rVar = r.f13801a;
                    if (e4.b == null) {
                        if (Thread.currentThread() instanceof HandlerThread) {
                            handler = new Handler();
                        } else {
                            handler = new Handler(Looper.getMainLooper());
                        }
                        e4.b = handler;
                    }
                } catch (Throwable th) {
                    O2.a.a(this, th);
                }
            } catch (Throwable th2) {
                O2.a.a(this, th2);
            }
        } catch (Throwable th3) {
            O2.a.a(this, th3);
        }
    }

    public final String toString() {
        String str = "{RequestAsyncTask:  connection: null, requests: " + this.f13400a + "}";
        G7.j.d(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}

package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes.dex */
public final class h0 extends AsyncTask {
    public final j0 a;

    /* renamed from: b, reason: collision with root package name */
    public Exception f11013b;

    public h0(j0 requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.a = requests;
    }

    public final void a(List result) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            if (m6.a.b(this)) {
                return;
            }
            try {
                if (m6.a.b(this)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(result, "result");
                    super.onPostExecute(result);
                    Exception exc = this.f11013b;
                    if (exc != null) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        Intrinsics.checkNotNullExpressionValue(String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1)), "java.lang.String.format(format, *args)");
                        x xVar = x.a;
                    }
                } catch (Throwable th2) {
                    m6.a.a(this, th2);
                }
            } catch (Throwable th3) {
                m6.a.a(this, th3);
            }
        } catch (Throwable th4) {
            m6.a.a(this, th4);
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        ArrayList arrayList = null;
        if (m6.a.b(this)) {
            return null;
        }
        try {
            if (m6.a.b(this)) {
                return null;
            }
            try {
                if (m6.a.b(this)) {
                    return null;
                }
                try {
                    Void[] params = (Void[]) objArr;
                    if (!m6.a.b(this)) {
                        try {
                            if (!m6.a.b(this)) {
                                try {
                                    if (!m6.a.b(this)) {
                                        try {
                                            Intrinsics.checkNotNullParameter(params, "params");
                                            try {
                                                j0 j0Var = this.a;
                                                j0Var.getClass();
                                                String str = g0.f11000j;
                                                arrayList = c.n(j0Var);
                                            } catch (Exception e2) {
                                                this.f11013b = e2;
                                            }
                                        } catch (Throwable th2) {
                                            m6.a.a(this, th2);
                                        }
                                    }
                                } catch (Throwable th3) {
                                    m6.a.a(this, th3);
                                }
                            }
                        } catch (Throwable th4) {
                            m6.a.a(this, th4);
                        }
                    }
                    return arrayList;
                } catch (Throwable th5) {
                    m6.a.a(this, th5);
                    return arrayList;
                }
            } catch (Throwable th6) {
                m6.a.a(this, th6);
                return arrayList;
            }
        } catch (Throwable th7) {
            m6.a.a(this, th7);
            return arrayList;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (m6.a.b(this)) {
            return;
        }
        try {
            if (m6.a.b(this)) {
                return;
            }
            try {
                if (m6.a.b(this)) {
                    return;
                }
                try {
                    a((List) obj);
                } catch (Throwable th2) {
                    m6.a.a(this, th2);
                }
            } catch (Throwable th3) {
                m6.a.a(this, th3);
            }
        } catch (Throwable th4) {
            m6.a.a(this, th4);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        Handler handler;
        j0 j0Var = this.a;
        if (m6.a.b(this)) {
            return;
        }
        try {
            if (m6.a.b(this)) {
                return;
            }
            try {
                if (m6.a.b(this)) {
                    return;
                }
                try {
                    super.onPreExecute();
                    x xVar = x.a;
                    if (j0Var.f11152b == null) {
                        if (Thread.currentThread() instanceof HandlerThread) {
                            handler = new Handler();
                        } else {
                            handler = new Handler(Looper.getMainLooper());
                        }
                        j0Var.f11152b = handler;
                    }
                } catch (Throwable th2) {
                    m6.a.a(this, th2);
                }
            } catch (Throwable th3) {
                m6.a.a(this, th3);
            }
        } catch (Throwable th4) {
            m6.a.a(this, th4);
        }
    }

    public final String toString() {
        String str = "{RequestAsyncTask:  connection: null, requests: " + this.a + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}

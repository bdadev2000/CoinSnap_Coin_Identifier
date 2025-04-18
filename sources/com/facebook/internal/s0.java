package com.facebook.internal;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class s0 extends AsyncTask {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f11075b;

    /* renamed from: c, reason: collision with root package name */
    public Exception[] f11076c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v0 f11077d;

    public s0(v0 this$0, String action, Bundle parameters) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f11077d = this$0;
        this.a = action;
        this.f11075b = parameters;
        this.f11076c = new Exception[0];
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [com.facebook.internal.r0] */
    public final String[] a(Void... p02) {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            if (m6.a.b(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(p02, "p0");
                String[] stringArray = this.f11075b.getStringArray("media");
                if (stringArray == null) {
                    return null;
                }
                final String[] strArr = new String[stringArray.length];
                this.f11076c = new Exception[stringArray.length];
                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                Date date = com.facebook.a.f10880n;
                com.facebook.a n10 = z1.d.n();
                try {
                    int length = stringArray.length - 1;
                    if (length >= 0) {
                        final int i10 = 0;
                        while (true) {
                            int i11 = i10 + 1;
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((com.facebook.h0) it.next()).cancel(true);
                                }
                                return null;
                            }
                            Uri uri = Uri.parse(stringArray[i10]);
                            if (m0.A(uri)) {
                                strArr[i10] = uri.toString();
                                countDownLatch.countDown();
                            } else {
                                ?? r10 = new com.facebook.b0() { // from class: com.facebook.internal.r0
                                    @Override // com.facebook.b0
                                    public final void a(com.facebook.k0 response) {
                                        com.facebook.u uVar;
                                        String str;
                                        int i12 = i10;
                                        String[] results = strArr;
                                        Intrinsics.checkNotNullParameter(results, "$results");
                                        s0 this$0 = this;
                                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                                        CountDownLatch latch = countDownLatch;
                                        Intrinsics.checkNotNullParameter(latch, "$latch");
                                        Intrinsics.checkNotNullParameter(response, "response");
                                        try {
                                            uVar = response.f11168c;
                                            str = "Error staging photo.";
                                        } catch (Exception e2) {
                                            this$0.f11076c[i12] = e2;
                                        }
                                        if (uVar != null) {
                                            String c10 = uVar.c();
                                            if (c10 != null) {
                                                str = c10;
                                            }
                                            throw new com.facebook.r(response, str);
                                        }
                                        JSONObject jSONObject = response.f11167b;
                                        if (jSONObject != null) {
                                            String optString = jSONObject.optString("uri");
                                            if (optString != null) {
                                                results[i12] = optString;
                                                latch.countDown();
                                                return;
                                            }
                                            throw new com.facebook.q("Error staging photo.");
                                        }
                                        throw new com.facebook.q("Error staging photo.");
                                    }
                                };
                                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                                concurrentLinkedQueue.add(com.bumptech.glide.c.J(n10, uri, r10).d());
                            }
                            if (i11 > length) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    countDownLatch.await();
                    return strArr;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((com.facebook.h0) it2.next()).cancel(true);
                    }
                    return null;
                }
            } catch (Throwable th2) {
                m6.a.a(this, th2);
                return null;
            }
        } catch (Throwable th3) {
            m6.a.a(this, th3);
            return null;
        }
    }

    public final void b(String[] strArr) {
        Bundle bundle = this.f11075b;
        v0 v0Var = this.f11077d;
        if (m6.a.b(this)) {
            return;
        }
        try {
            if (m6.a.b(this)) {
                return;
            }
            try {
                ProgressDialog progressDialog = v0Var.f11109g;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                Exception[] excArr = this.f11076c;
                int length = excArr.length;
                int i10 = 0;
                while (i10 < length) {
                    Exception exc = excArr[i10];
                    i10++;
                    if (exc != null) {
                        v0Var.d(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    v0Var.d(new com.facebook.q("Failed to stage photos for web dialog"));
                    return;
                }
                List asList = ArraysKt.asList(strArr);
                if (asList.contains(null)) {
                    v0Var.d(new com.facebook.q("Failed to stage photos for web dialog"));
                    return;
                }
                m0.G(bundle, new JSONArray((Collection) asList));
                v0Var.f11105b = m0.b(bundle, w5.d.c(), com.facebook.x.d() + "/dialog/" + this.a).toString();
                ImageView imageView = v0Var.f11110h;
                if (imageView != null) {
                    v0Var.e((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (Throwable th2) {
                m6.a.a(this, th2);
            }
        } catch (Throwable th3) {
            m6.a.a(this, th3);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            if (m6.a.b(this)) {
                return null;
            }
            try {
                return a((Void[]) objArr);
            } catch (Throwable th2) {
                m6.a.a(this, th2);
                return null;
            }
        } catch (Throwable th3) {
            m6.a.a(this, th3);
            return null;
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
                b((String[]) obj);
            } catch (Throwable th2) {
                m6.a.a(this, th2);
            }
        } catch (Throwable th3) {
            m6.a.a(this, th3);
        }
    }
}

package com.facebook.internal;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ImageView;
import com.facebook.C0785a;
import com.facebook.C1849l;
import com.facebook.C1853m;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import u7.AbstractC2815f;

/* loaded from: classes.dex */
public final class L extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final String f13590a;
    public final Bundle b;

    /* renamed from: c, reason: collision with root package name */
    public Exception[] f13591c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f13592d;

    public L(O o3, String str, Bundle bundle) {
        G7.j.e(o3, "this$0");
        this.f13592d = o3;
        this.f13590a = str;
        this.b = bundle;
        this.f13591c = new Exception[0];
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [com.facebook.internal.K] */
    public final String[] a(Void... voidArr) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            if (O2.a.b(this)) {
                return null;
            }
            try {
                G7.j.e(voidArr, "p0");
                String[] stringArray = this.b.getStringArray("media");
                if (stringArray == null) {
                    return null;
                }
                final String[] strArr = new String[stringArray.length];
                this.f13591c = new Exception[stringArray.length];
                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                Date date = C0785a.f13439n;
                C0785a m = com.facebook.appevents.g.m();
                try {
                    int length = stringArray.length - 1;
                    if (length >= 0) {
                        final int i9 = 0;
                        while (true) {
                            int i10 = i9 + 1;
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((com.facebook.D) it.next()).cancel(true);
                                }
                                return null;
                            }
                            Uri parse = Uri.parse(stringArray[i9]);
                            if (H.C(parse)) {
                                strArr[i9] = parse.toString();
                                countDownLatch.countDown();
                            } else {
                                ?? r10 = new com.facebook.v() { // from class: com.facebook.internal.K
                                    @Override // com.facebook.v
                                    public final void a(com.facebook.F f9) {
                                        com.facebook.p pVar;
                                        String str;
                                        int i11 = i9;
                                        String[] strArr2 = strArr;
                                        G7.j.e(strArr2, "$results");
                                        L l = this;
                                        G7.j.e(l, "this$0");
                                        CountDownLatch countDownLatch2 = countDownLatch;
                                        G7.j.e(countDownLatch2, "$latch");
                                        try {
                                            pVar = f9.f13407c;
                                            str = "Error staging photo.";
                                        } catch (Exception e4) {
                                            l.f13591c[i11] = e4;
                                        }
                                        if (pVar != null) {
                                            String c9 = pVar.c();
                                            if (c9 != null) {
                                                str = c9;
                                            }
                                            throw new C1853m(f9, str);
                                        }
                                        JSONObject jSONObject = f9.b;
                                        if (jSONObject != null) {
                                            String optString = jSONObject.optString("uri");
                                            if (optString != null) {
                                                strArr2[i11] = optString;
                                                countDownLatch2.countDown();
                                                return;
                                            }
                                            throw new C1849l("Error staging photo.");
                                        }
                                        throw new C1849l("Error staging photo.");
                                    }
                                };
                                G7.j.d(parse, "uri");
                                concurrentLinkedQueue.add(com.facebook.appevents.i.m(m, parse, r10).d());
                            }
                            if (i10 > length) {
                                break;
                            }
                            i9 = i10;
                        }
                    }
                    countDownLatch.await();
                    return strArr;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((com.facebook.D) it2.next()).cancel(true);
                    }
                    return null;
                }
            } catch (Throwable th) {
                O2.a.a(this, th);
                return null;
            }
        } catch (Throwable th2) {
            O2.a.a(this, th2);
            return null;
        }
    }

    public final void b(String[] strArr) {
        Bundle bundle = this.b;
        O o3 = this.f13592d;
        if (O2.a.b(this)) {
            return;
        }
        try {
            if (O2.a.b(this)) {
                return;
            }
            try {
                ProgressDialog progressDialog = o3.f13598g;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                Exception[] excArr = this.f13591c;
                int length = excArr.length;
                int i9 = 0;
                while (i9 < length) {
                    Exception exc = excArr[i9];
                    i9++;
                    if (exc != null) {
                        o3.e(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    o3.e(new C1849l("Failed to stage photos for web dialog"));
                    return;
                }
                List t9 = AbstractC2815f.t(strArr);
                if (t9.contains(null)) {
                    o3.e(new C1849l("Failed to stage photos for web dialog"));
                    return;
                }
                H.H(bundle, new JSONArray((Collection) t9));
                o3.b = H.a(H.o(), com.facebook.r.d() + "/dialog/" + this.f13590a, bundle).toString();
                ImageView imageView = o3.f13599h;
                if (imageView != null) {
                    o3.f((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (Throwable th) {
                O2.a.a(this, th);
            }
        } catch (Throwable th2) {
            O2.a.a(this, th2);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            if (O2.a.b(this)) {
                return null;
            }
            try {
                return a((Void[]) objArr);
            } catch (Throwable th) {
                O2.a.a(this, th);
                return null;
            }
        } catch (Throwable th2) {
            O2.a.a(this, th2);
            return null;
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
                b((String[]) obj);
            } catch (Throwable th) {
                O2.a.a(this, th);
            }
        } catch (Throwable th2) {
            O2.a.a(this, th2);
        }
    }
}

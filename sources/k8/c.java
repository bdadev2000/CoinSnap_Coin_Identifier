package k8;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import androidx.cardview.widget.CardView;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import p5.C2549D;
import t7.y;
import u4.AbstractC2762g;
import u4.C2769n;
import u4.CallableC2766k;
import x0.AbstractC2914a;
import x7.EnumC2928a;

/* loaded from: classes3.dex */
public final class c implements T7.b, SuccessContinuation {
    public Object b;

    /* renamed from: c, reason: collision with root package name */
    public Object f21500c;

    public /* synthetic */ c(Object obj, Object obj2) {
        this.b = obj;
        this.f21500c = obj2;
    }

    public void a() {
        String str = (String) this.b;
        try {
            z4.c cVar = (z4.c) this.f21500c;
            cVar.getClass();
            new File((File) cVar.f24546c, str).createNewFile();
        } catch (IOException e4) {
            Log.e("FirebaseCrashlytics", "Error creating marker: " + str, e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.datatransport.cct.CctBackendFactory b(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.c.b(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[Catch: JSONException -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {JSONException -> 0x003a, blocks: (B:5:0x0014, B:7:0x002a, B:8:0x003d, B:13:0x0057, B:22:0x006d, B:24:0x0076, B:26:0x0080, B:28:0x0084, B:30:0x009a, B:31:0x00a1, B:34:0x00a2, B:35:0x00a9, B:37:0x00aa, B:38:0x00b1), top: B:4:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[Catch: JSONException -> 0x003a, TryCatch #1 {JSONException -> 0x003a, blocks: (B:5:0x0014, B:7:0x002a, B:8:0x003d, B:13:0x0057, B:22:0x006d, B:24:0x0076, B:26:0x0080, B:28:0x0084, B:30:0x009a, B:31:0x00a1, B:34:0x00a2, B:35:0x00a9, B:37:0x00aa, B:38:0x00b1), top: B:4:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2, types: [o5.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o5.C2509d c(l5.d r14) {
        /*
            r13 = this;
            r0 = 1
            java.lang.String r1 = ""
            org.json.JSONArray r2 = r14.f21591g
            long r3 = r14.f21590f
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            r5 = 0
            r6 = r5
        Le:
            int r7 = r2.length()
            if (r6 >= r7) goto Lba
            org.json.JSONObject r7 = r2.getJSONObject(r6)     // Catch: org.json.JSONException -> L3a
            java.lang.String r8 = "rolloutId"
            java.lang.String r8 = r7.getString(r8)     // Catch: org.json.JSONException -> L3a
            java.lang.String r9 = "affectedParameterKeys"
            org.json.JSONArray r9 = r7.getJSONArray(r9)     // Catch: org.json.JSONException -> L3a
            int r10 = r9.length()     // Catch: org.json.JSONException -> L3a
            if (r10 <= r0) goto L3d
            java.lang.String r10 = "FirebaseRemoteConfig"
            java.lang.String r11 = "Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s"
            java.lang.Object[] r12 = new java.lang.Object[]{r8, r9}     // Catch: org.json.JSONException -> L3a
            java.lang.String r11 = java.lang.String.format(r11, r12)     // Catch: org.json.JSONException -> L3a
            android.util.Log.w(r10, r11)     // Catch: org.json.JSONException -> L3a
            goto L3d
        L3a:
            r14 = move-exception
            goto Lb2
        L3d:
            java.lang.String r9 = r9.optString(r5, r1)     // Catch: org.json.JSONException -> L3a
            java.lang.Object r10 = r13.b     // Catch: org.json.JSONException -> L3a
            l5.c r10 = (l5.C2451c) r10     // Catch: org.json.JSONException -> L3a
            l5.d r10 = r10.c()     // Catch: org.json.JSONException -> L3a
            r11 = 0
            if (r10 != 0) goto L4e
        L4c:
            r10 = r11
            goto L54
        L4e:
            org.json.JSONObject r10 = r10.b     // Catch: org.json.JSONException -> L4c
            java.lang.String r10 = r10.getString(r9)     // Catch: org.json.JSONException -> L4c
        L54:
            if (r10 == 0) goto L57
            goto L6d
        L57:
            java.lang.Object r10 = r13.f21500c     // Catch: org.json.JSONException -> L3a
            l5.c r10 = (l5.C2451c) r10     // Catch: org.json.JSONException -> L3a
            l5.d r10 = r10.c()     // Catch: org.json.JSONException -> L3a
            if (r10 != 0) goto L62
            goto L68
        L62:
            org.json.JSONObject r10 = r10.b     // Catch: org.json.JSONException -> L68
            java.lang.String r11 = r10.getString(r9)     // Catch: org.json.JSONException -> L68
        L68:
            if (r11 == 0) goto L6c
            r10 = r11
            goto L6d
        L6c:
            r10 = r1
        L6d:
            int r11 = o5.AbstractC2510e.f21986a     // Catch: org.json.JSONException -> L3a
            o5.b r11 = new o5.b     // Catch: org.json.JSONException -> L3a
            r11.<init>()     // Catch: org.json.JSONException -> L3a
            if (r8 == 0) goto Laa
            r11.f21976a = r8     // Catch: org.json.JSONException -> L3a
            java.lang.String r8 = "variantId"
            java.lang.String r7 = r7.getString(r8)     // Catch: org.json.JSONException -> L3a
            if (r7 == 0) goto La2
            r11.b = r7     // Catch: org.json.JSONException -> L3a
            if (r9 == 0) goto L9a
            r11.f21977c = r9     // Catch: org.json.JSONException -> L3a
            r11.f21978d = r10     // Catch: org.json.JSONException -> L3a
            r11.f21979e = r3     // Catch: org.json.JSONException -> L3a
            byte r7 = r11.f21980f     // Catch: org.json.JSONException -> L3a
            r7 = r7 | r0
            byte r7 = (byte) r7     // Catch: org.json.JSONException -> L3a
            r11.f21980f = r7     // Catch: org.json.JSONException -> L3a
            o5.c r7 = r11.a()     // Catch: org.json.JSONException -> L3a
            r14.add(r7)     // Catch: org.json.JSONException -> L3a
            int r6 = r6 + r0
            goto Le
        L9a:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "Null parameterKey"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3a
            throw r14     // Catch: org.json.JSONException -> L3a
        La2:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "Null variantId"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3a
            throw r14     // Catch: org.json.JSONException -> L3a
        Laa:
            java.lang.NullPointerException r14 = new java.lang.NullPointerException     // Catch: org.json.JSONException -> L3a
            java.lang.String r0 = "Null rolloutId"
            r14.<init>(r0)     // Catch: org.json.JSONException -> L3a
            throw r14     // Catch: org.json.JSONException -> L3a
        Lb2:
            k5.c r0 = new k5.c
            java.lang.String r1 = "Exception parsing rollouts metadata to create RolloutsState."
            r0.<init>(r1, r14)
            throw r0
        Lba:
            o5.d r0 = new o5.d
            r0.<init>(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.c.c(l5.d):o5.d");
    }

    public void d(int i9, int i10, int i11, int i12) {
        CardView cardView = (CardView) this.f21500c;
        cardView.f4324f.set(i9, i10, i11, i12);
        Rect rect = cardView.f4323d;
        super/*android.view.View*/.setPadding(i9 + rect.left, i10 + rect.top, i11 + rect.right, i12 + rect.bottom);
    }

    @Override // T7.b
    public Object k(T7.c cVar, w7.f fVar) {
        Object k6 = ((T7.b) this.b).k(new T7.h(cVar, (C2549D) this.f21500c, 1), fVar);
        if (k6 == EnumC2928a.b) {
            return k6;
        }
        return y.f23029a;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        if (((B4.b) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        CallableC2766k callableC2766k = (CallableC2766k) this.f21500c;
        C2769n.b((C2769n) ((r4.c) callableC2766k.f23130c).f22841d);
        r4.c cVar = (r4.c) callableC2766k.f23130c;
        ((C2769n) cVar.f22841d).m.r(null, (Executor) this.b);
        ((C2769n) cVar.f22841d).f23148q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public c(r4.c cVar) {
        int e4 = AbstractC2762g.e((Context) cVar.f22840c, "com.google.firebase.crashlytics.unity_version", "string");
        Context context = (Context) cVar.f22840c;
        if (e4 != 0) {
            this.b = "Unity";
            String string = context.getResources().getString(e4);
            this.f21500c = string;
            String d2 = AbstractC2914a.d("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", d2, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.b = "Flutter";
                this.f21500c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.b = null;
                this.f21500c = null;
            }
        }
        this.b = null;
        this.f21500c = null;
    }
}

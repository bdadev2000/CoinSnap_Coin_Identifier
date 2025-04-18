package com.facebook.internal;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class m implements k8.x, m9.p0, m9.o0, m9.k0, hb.a, lb.c, qb.c {

    /* renamed from: b, reason: collision with root package name */
    public static m f11048b;

    public /* synthetic */ m() {
    }

    public static qb.a j(ni.a aVar) {
        ef.b bVar = new ef.b(8, 4);
        g4.l lVar = new g4.l(true, false, false);
        aVar.getClass();
        return new qb.a(System.currentTimeMillis() + Constants.ONE_HOUR, bVar, lVar, 10.0d, 1.2d, 60);
    }

    public static t k(int i10) {
        t[] valuesCustom = t.valuesCustom();
        int length = valuesCustom.length;
        int i11 = 0;
        while (i11 < length) {
            t tVar = valuesCustom[i11];
            i11++;
            if (tVar.f11100b == i10) {
                return tVar;
            }
        }
        return t.Unknown;
    }

    public static p m() {
        return new p(null, MapsKt.hashMapOf(TuplesKt.to(2, null), TuplesKt.to(4, null), TuplesKt.to(9, null), TuplesKt.to(17, null), TuplesKt.to(341, null)), MapsKt.hashMapOf(TuplesKt.to(102, null), TuplesKt.to(190, null), TuplesKt.to(Integer.valueOf(TTAdConstant.IMAGE_URL_CODE), null)), null, null, null);
    }

    public static void n(com.facebook.m0 behavior, String tag, String string) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(string, "string");
        p(behavior, tag, string);
    }

    public static void o(com.facebook.m0 behavior, String tag, String format, Object... args) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        com.facebook.x.i(behavior);
    }

    public static void p(com.facebook.m0 behavior, String tag, String string) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(string, "string");
        com.facebook.x.i(behavior);
    }

    public static void q(Uri url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ReentrantLock reentrantLock = com.facebook.login.c.f11192d;
        reentrantLock.lock();
        reentrantLock.unlock();
        reentrantLock.lock();
        o.s sVar = com.facebook.login.c.f11191c;
        if (sVar != null) {
            Bundle a = sVar.a(null);
            try {
                ((b.c) sVar.f22950b).e(sVar.f22951c, url, a, null);
            } catch (RemoteException unused) {
            }
        }
        reentrantLock.unlock();
    }

    public static HashMap r(JSONObject jSONObject) {
        int optInt;
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int length = optJSONArray.length();
        if (length > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        hashSet = new HashSet();
                        int length2 = optJSONArray2.length();
                        if (length2 > 0) {
                            int i12 = 0;
                            while (true) {
                                int i13 = i12 + 1;
                                int optInt2 = optJSONArray2.optInt(i12);
                                if (optInt2 != 0) {
                                    hashSet.add(Integer.valueOf(optInt2));
                                }
                                if (i13 >= length2) {
                                    break;
                                }
                                i12 = i13;
                            }
                        }
                    } else {
                        hashSet = null;
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        return hashMap;
    }

    @Override // lb.c
    public final void a() {
    }

    @Override // k8.x
    public final boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && MimeTypes.VIDEO_H264.equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // k8.x
    public final boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // m9.k0
    public final void cancelLoad() {
    }

    @Override // m9.p0
    public final Object d(Uri uri, m9.n nVar) {
        return Long.valueOf(n9.h0.K(new BufferedReader(new InputStreamReader(nVar)).readLine()));
    }

    @Override // lb.c
    public final String e() {
        return null;
    }

    @Override // hb.a
    public final void f(Bundle bundle) {
        b6.a.f2288f.d("Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
    }

    @Override // qb.c
    public final qb.a g(ni.a aVar, JSONObject jSONObject) {
        return j(aVar);
    }

    @Override // k8.x
    public final int getCodecCount() {
        return MediaCodecList.getCodecCount();
    }

    @Override // k8.x
    public final MediaCodecInfo getCodecInfoAt(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // lb.c
    public final void h(long j3, String str) {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(1:(7:11|12|13|14|15|16|17)(2:22|23))(2:24|25))(5:36|37|38|39|(1:41)(1:42))|26|27|28|(1:30)(5:31|14|15|16|17)))|48|6|7|(0)(0)|26|27|28|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        r7 = r10;
        r10 = r9;
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0072, code lost:
    
        r10 = r9;
        r9 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, dc.d] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(dc.e r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof qc.r
            if (r0 == 0) goto L13
            r0 = r10
            qc.r r0 = (qc.r) r0
            int r1 = r0.f23867f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23867f = r1
            goto L18
        L13:
            qc.r r0 = new qc.r
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f23865c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f23867f
            java.lang.String r3 = ""
            java.lang.String r4 = "InstallationId"
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L48
            if (r2 == r6) goto L40
            if (r2 != r5) goto L38
            java.lang.Object r9 = r0.f23864b
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L35
            goto L95
        L35:
            r10 = move-exception
            goto La2
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            java.lang.Object r9 = r0.f23864b
            dc.e r9 = (dc.e) r9
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L71
            goto L65
        L48:
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r9
            dc.d r10 = (dc.d) r10     // Catch: java.lang.Exception -> L71
            com.google.android.gms.tasks.Task r9 = r10.d()     // Catch: java.lang.Exception -> L71
            java.lang.String r2 = "firebaseInstallations.getToken(false)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)     // Catch: java.lang.Exception -> L6f
            r0.f23864b = r10     // Catch: java.lang.Exception -> L6f
            r0.f23867f = r6     // Catch: java.lang.Exception -> L6f
            java.lang.Object r9 = kotlinx.coroutines.tasks.TasksKt.await(r9, r0)     // Catch: java.lang.Exception -> L6f
            if (r9 != r1) goto L62
            return r1
        L62:
            r7 = r10
            r10 = r9
            r9 = r7
        L65:
            dc.a r10 = (dc.a) r10     // Catch: java.lang.Exception -> L71
            java.lang.String r10 = r10.a     // Catch: java.lang.Exception -> L71
            java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r2)     // Catch: java.lang.Exception -> L71
            goto L7c
        L6f:
            r9 = move-exception
            goto L75
        L71:
            r10 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L75:
            java.lang.String r2 = "Error getting authentication token."
            android.util.Log.w(r4, r2, r9)
            r9 = r10
            r10 = r3
        L7c:
            dc.d r9 = (dc.d) r9     // Catch: java.lang.Exception -> L9e
            com.google.android.gms.tasks.Task r9 = r9.c()     // Catch: java.lang.Exception -> L9e
            java.lang.String r2 = "firebaseInstallations.id"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)     // Catch: java.lang.Exception -> L9e
            r0.f23864b = r10     // Catch: java.lang.Exception -> L9e
            r0.f23867f = r5     // Catch: java.lang.Exception -> L9e
            java.lang.Object r9 = kotlinx.coroutines.tasks.TasksKt.await(r9, r0)     // Catch: java.lang.Exception -> L9e
            if (r9 != r1) goto L92
            return r1
        L92:
            r7 = r10
            r10 = r9
            r9 = r7
        L95:
            java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)     // Catch: java.lang.Exception -> L35
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L35
            r3 = r10
            goto La7
        L9e:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        La2:
            java.lang.String r0 = "Error getting Firebase installation id ."
            android.util.Log.w(r4, r0, r10)
        La7:
            qc.s r10 = new qc.s
            r10.<init>(r3, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.m.i(dc.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final synchronized p l() {
        p pVar;
        if (p.f11066e == null) {
            p.f11066e = m();
        }
        pVar = p.f11066e;
        if (pVar == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
        }
        return pVar;
    }

    @Override // m9.k0
    public final void load() {
        synchronized (n9.a0.a) {
            Object obj = n9.a0.f22513b;
            synchronized (obj) {
                try {
                    if (n9.a0.f22514c) {
                        return;
                    }
                    long a = n9.a0.a();
                    synchronized (obj) {
                        n9.a0.f22515d = a;
                        n9.a0.f22514c = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // m9.o0
    public final void maybeThrowError() {
    }

    public final synchronized void s(String original) {
        Intrinsics.checkNotNullParameter(original, "accessToken");
        com.facebook.x xVar = com.facebook.x.a;
        com.facebook.x.i(com.facebook.m0.INCLUDE_ACCESS_TOKENS);
        synchronized (this) {
            Intrinsics.checkNotNullParameter(original, "original");
            Intrinsics.checkNotNullParameter("ACCESS_TOKEN_REMOVED", "replace");
            d0.f11031e.put(original, "ACCESS_TOKEN_REMOVED");
        }
    }

    @Override // k8.x
    public final boolean secureDecodersExplicit() {
        return false;
    }

    public /* synthetic */ m(com.applovin.impl.mediation.ads.e eVar) {
    }

    public /* synthetic */ m(k kVar) {
    }

    public /* synthetic */ m(l lVar) {
    }

    public /* synthetic */ m(Object obj) {
    }
}

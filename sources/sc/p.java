package sc;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final c1.e f24985c;

    /* renamed from: d, reason: collision with root package name */
    public static final c1.e f24986d;

    /* renamed from: e, reason: collision with root package name */
    public static final c1.e f24987e;

    /* renamed from: f, reason: collision with root package name */
    public static final c1.e f24988f;

    /* renamed from: g, reason: collision with root package name */
    public static final c1.e f24989g;
    public final y0.j a;

    /* renamed from: b, reason: collision with root package name */
    public i f24990b;

    static {
        Intrinsics.checkNotNullParameter("firebase_sessions_enabled", "name");
        f24985c = new c1.e("firebase_sessions_enabled");
        Intrinsics.checkNotNullParameter("firebase_sessions_sampling_rate", "name");
        f24986d = new c1.e("firebase_sessions_sampling_rate");
        Intrinsics.checkNotNullParameter("firebase_sessions_restart_timeout", "name");
        f24987e = new c1.e("firebase_sessions_restart_timeout");
        Intrinsics.checkNotNullParameter("firebase_sessions_cache_duration", "name");
        f24988f = new c1.e("firebase_sessions_cache_duration");
        Intrinsics.checkNotNullParameter("firebase_sessions_cache_updated_time", "name");
        f24989g = new c1.e("firebase_sessions_cache_updated_time");
    }

    public p(y0.j dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.a = dataStore;
        BuildersKt__BuildersKt.runBlocking$default(null, new m(this, null), 1, null);
    }

    public static final void a(p pVar, c1.a aVar) {
        pVar.getClass();
        pVar.f24990b = new i((Boolean) aVar.b(f24985c), (Double) aVar.b(f24986d), (Integer) aVar.b(f24987e), (Integer) aVar.b(f24988f), (Long) aVar.b(f24989g));
    }

    public final boolean b() {
        i iVar = this.f24990b;
        i iVar2 = null;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            iVar = null;
        }
        Long l10 = iVar.f24967e;
        i iVar3 = this.f24990b;
        if (iVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
        } else {
            iVar2 = iVar3;
        }
        Integer num = iVar2.f24966d;
        if (l10 != null && num != null && (System.currentTimeMillis() - l10.longValue()) / 1000 < num.intValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(c1.e r6, java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof sc.n
            if (r0 == 0) goto L13
            r0 = r8
            sc.n r0 = (sc.n) r0
            int r1 = r0.f24980d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24980d = r1
            goto L18
        L13:
            sc.n r0 = new sc.n
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f24978b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f24980d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r8)     // Catch: java.io.IOException -> L4a
            goto L5e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.ResultKt.throwOnFailure(r8)
            y0.j r8 = r5.a     // Catch: java.io.IOException -> L4a
            sc.o r2 = new sc.o     // Catch: java.io.IOException -> L4a
            r4 = 0
            r2.<init>(r6, r5, r7, r4)     // Catch: java.io.IOException -> L4a
            r0.f24980d = r3     // Catch: java.io.IOException -> L4a
            c1.h r6 = new c1.h     // Catch: java.io.IOException -> L4a
            r6.<init>(r2, r4)     // Catch: java.io.IOException -> L4a
            java.lang.Object r6 = r8.a(r6, r0)     // Catch: java.io.IOException -> L4a
            if (r6 != r1) goto L5e
            return r1
        L4a:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to update cache config value: "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5e:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.p.c(c1.e, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

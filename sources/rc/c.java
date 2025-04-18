package rc;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {
    public static final c a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f24084b = Collections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map dependencies = f24084b;
        Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
        Object obj = dependencies.get(dVar);
        if (obj != null) {
            Intrinsics.checkNotNullExpressionValue(obj, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return (a) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2 A[Catch: all -> 0x00cb, TRY_ENTER, TryCatch #0 {all -> 0x00cb, blocks: (B:11:0x009d, B:22:0x00b2, B:23:0x00ca), top: B:10:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009c -> B:10:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof rc.b
            if (r0 == 0) goto L13
            r0 = r11
            rc.b r0 = (rc.b) r0
            int r1 = r0.f24083k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24083k = r1
            goto L18
        L13:
            rc.b r0 = new rc.b
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f24081i
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f24083k
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 != r4) goto L3a
            java.lang.Object r2 = r0.f24080h
            java.util.Map r5 = r0.f24079g
            java.util.Map r5 = (java.util.Map) r5
            kotlinx.coroutines.sync.Mutex r6 = r0.f24078f
            rc.d r7 = r0.f24077d
            java.util.Iterator r8 = r0.f24076c
            java.util.Map r9 = r0.f24075b
            java.util.Map r9 = (java.util.Map) r9
            kotlin.ResultKt.throwOnFailure(r11)
            goto L9d
        L3a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L42:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.Map r11 = rc.c.f24084b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = kotlin.collections.MapsKt.mapCapacity(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L65:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Ld0
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            rc.d r7 = (rc.d) r7
            java.lang.Object r11 = r11.getValue()
            rc.a r11 = (rc.a) r11
            kotlinx.coroutines.sync.Mutex r6 = r11.a
            r11 = r5
            java.util.Map r11 = (java.util.Map) r11
            r0.f24075b = r11
            r0.f24076c = r8
            r0.f24077d = r7
            r0.f24078f = r6
            r0.f24079g = r11
            r0.f24080h = r2
            r0.f24083k = r4
            java.lang.Object r11 = r6.lock(r3, r0)
            if (r11 != r1) goto L9c
            return r1
        L9c:
            r9 = r5
        L9d:
            java.lang.String r11 = "subscriberName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r11)     // Catch: java.lang.Throwable -> Lcb
            rc.a r11 = a(r7)     // Catch: java.lang.Throwable -> Lcb
            jb.i r11 = r11.f24074b     // Catch: java.lang.Throwable -> Lcb
            if (r11 == 0) goto Lb2
            r6.unlock(r3)
            r5.put(r2, r11)
            r5 = r9
            goto L65
        Lb2:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = "Subscriber "
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lcb
            r0.append(r7)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = " has not been registered."
            r0.append(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lcb
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Lcb
            throw r11     // Catch: java.lang.Throwable -> Lcb
        Lcb:
            r11 = move-exception
            r6.unlock(r3)
            throw r11
        Ld0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.c.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}

package androidx.datastore.core;

/* loaded from: classes.dex */
public final class DataMigrationInitializer<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f18952a = new Object();

    /* loaded from: classes.dex */
    public static final class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0088 -> B:13:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008b -> B:13:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object a(androidx.datastore.core.DataMigrationInitializer.Companion r5, java.util.List r6, androidx.datastore.core.InitializerApi r7, h0.g r8) {
            /*
                r5.getClass()
                boolean r0 = r8 instanceof androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                if (r0 == 0) goto L16
                r0 = r8
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1) r0
                int r1 = r0.f18959f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L16
                int r1 = r1 - r2
                r0.f18959f = r1
                goto L1b
            L16:
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                r0.<init>(r5, r8)
            L1b:
                java.lang.Object r5 = r0.f18958c
                i0.a r8 = i0.a.f30806a
                int r1 = r0.f18959f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L45
                if (r1 == r3) goto L3d
                if (r1 != r2) goto L35
                java.util.Iterator r6 = r0.f18957b
                java.io.Serializable r7 = r0.f18956a
                kotlin.jvm.internal.f0 r7 = (kotlin.jvm.internal.f0) r7
                kotlin.jvm.internal.q.m(r5)     // Catch: java.lang.Throwable -> L33
                goto L6b
            L33:
                r5 = move-exception
                goto L84
            L35:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L3d:
                java.io.Serializable r6 = r0.f18956a
                java.util.List r6 = (java.util.List) r6
                kotlin.jvm.internal.q.m(r5)
                goto L5f
            L45:
                kotlin.jvm.internal.q.m(r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r1 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
                r4 = 0
                r1.<init>(r6, r5, r4)
                r0.f18956a = r5
                r0.f18959f = r3
                java.lang.Object r6 = r7.a(r1, r0)
                if (r6 != r8) goto L5e
                goto L99
            L5e:
                r6 = r5
            L5f:
                kotlin.jvm.internal.f0 r5 = new kotlin.jvm.internal.f0
                r5.<init>()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
                r7 = r5
            L6b:
                boolean r5 = r6.hasNext()
                if (r5 == 0) goto L91
                java.lang.Object r5 = r6.next()
                q0.l r5 = (q0.l) r5
                r0.f18956a = r7     // Catch: java.lang.Throwable -> L33
                r0.f18957b = r6     // Catch: java.lang.Throwable -> L33
                r0.f18959f = r2     // Catch: java.lang.Throwable -> L33
                java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L33
                if (r5 != r8) goto L6b
                goto L99
            L84:
                java.lang.Object r1 = r7.f30930a
                if (r1 != 0) goto L8b
                r7.f30930a = r5
                goto L6b
            L8b:
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                kotlin.jvm.internal.q.a(r1, r5)
                goto L6b
            L91:
                java.lang.Object r5 = r7.f30930a
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 != 0) goto L9a
                d0.b0 r8 = d0.b0.f30125a
            L99:
                return r8
            L9a:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer.Companion.a(androidx.datastore.core.DataMigrationInitializer$Companion, java.util.List, androidx.datastore.core.InitializerApi, h0.g):java.lang.Object");
        }
    }
}

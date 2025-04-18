package jb;

import java.util.ArrayList;
import java.util.Map;
import ki.b0;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19952b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19953c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19954d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f19955e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f19956f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f19957g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f19958h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f19959i;

    public t(boolean z10, boolean z11, b0 b0Var, Long l10, Long l11, Long l12, Long l13, Map extras) {
        this.a = 1;
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f19952b = z10;
        this.f19953c = z11;
        this.f19954d = b0Var;
        this.f19955e = l10;
        this.f19956f = l11;
        this.f19957g = l12;
        this.f19958h = l13;
        this.f19959i = MapsKt.toMap(extras);
    }

    public final synchronized boolean a() {
        boolean z10;
        Object obj = this.f19959i;
        if (((Boolean) obj) != null) {
            z10 = ((Boolean) obj).booleanValue();
        } else {
            try {
                z10 = ((va.g) this.f19955e).h();
            } catch (IllegalStateException unused) {
                z10 = false;
            }
        }
        b(z10);
        return z10;
    }

    public final void b(boolean z10) {
        String str;
        String str2;
        if (z10) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (((Boolean) this.f19959i) == null) {
            str2 = "global Firebase setting";
        } else if (this.f19953c) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        b6.a.f2288f.d(String.format("Crashlytics automatic data collection %s by %s.", str, str2), null);
    }

    public final String toString() {
        String joinToString$default;
        switch (this.a) {
            case 1:
                ArrayList arrayList = new ArrayList();
                if (this.f19952b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f19953c) {
                    arrayList.add("isDirectory");
                }
                Long l10 = (Long) this.f19955e;
                if (l10 != null) {
                    arrayList.add("byteCount=" + l10);
                }
                Long l11 = (Long) this.f19956f;
                if (l11 != null) {
                    arrayList.add("createdAt=" + l11);
                }
                Long l12 = (Long) this.f19957g;
                if (l12 != null) {
                    arrayList.add("lastModifiedAt=" + l12);
                }
                Long l13 = (Long) this.f19958h;
                if (l13 != null) {
                    arrayList.add("lastAccessedAt=" + l13);
                }
                Map map = (Map) this.f19959i;
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
                return joinToString$default;
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public t(va.g r7) {
        /*
            r6 = this;
            r0 = 0
            r6.a = r0
            r6.<init>()
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r6.f19956f = r1
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            r6.f19957g = r1
            r6.f19952b = r0
            r6.f19953c = r0
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            r6.f19958h = r1
            r7.a()
            android.content.Context r1 = r7.a
            r6.f19955e = r7
            java.lang.String r7 = "com.google.firebase.crashlytics"
            android.content.SharedPreferences r7 = r1.getSharedPreferences(r7, r0)
            r6.f19954d = r7
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r7.contains(r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L43
            r6.f19953c = r0
            boolean r7 = r7.getBoolean(r2, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L44
        L43:
            r7 = r5
        L44:
            if (r7 != 0) goto L8a
            java.lang.String r7 = "firebase_crashlytics_collection_enabled"
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            if (r2 == 0) goto L77
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            if (r1 == 0) goto L77
            android.os.Bundle r2 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            if (r2 == 0) goto L77
            boolean r2 = r2.containsKey(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            if (r2 == 0) goto L77
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            boolean r7 = r1.getBoolean(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6f
            goto L78
        L6f:
            r7 = move-exception
            b6.a r1 = b6.a.f2288f
            java.lang.String r2 = "Could not read data collection permission from manifest"
            r1.e(r2, r7)
        L77:
            r7 = r5
        L78:
            if (r7 != 0) goto L7e
            r6.f19953c = r0
            r7 = r5
            goto L8a
        L7e:
            r6.f19953c = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = r0.equals(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L8a:
            r6.f19959i = r7
            java.lang.Object r7 = r6.f19956f
            monitor-enter(r7)
            boolean r0 = r6.a()     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r6.f19957g     // Catch: java.lang.Throwable -> La0
            com.google.android.gms.tasks.TaskCompletionSource r0 = (com.google.android.gms.tasks.TaskCompletionSource) r0     // Catch: java.lang.Throwable -> La0
            r0.trySetResult(r5)     // Catch: java.lang.Throwable -> La0
            r6.f19952b = r4     // Catch: java.lang.Throwable -> La0
        L9e:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> La0
            return
        La0:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> La0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.t.<init>(va.g):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(boolean z10, boolean z11, b0 b0Var, Long l10, Long l11, Long l12, Long l13) {
        this(z10, z11, b0Var, l10, l11, l12, l13, MapsKt.emptyMap());
        this.a = 1;
    }
}

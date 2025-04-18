package com.facebook.internal;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g0 {
    public static final g0 a;

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f11035b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f11036c;

    /* renamed from: d, reason: collision with root package name */
    public static final Integer[] f11037d;

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.g0.<clinit>():void");
    }

    public static final int b(TreeSet treeSet, int i10, int[] versionSpec) {
        if (m6.a.b(g0.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(versionSpec, "versionSpec");
            if (treeSet == null) {
                return -1;
            }
            int length = versionSpec.length - 1;
            Iterator descendingIterator = treeSet.descendingIterator();
            int i11 = -1;
            while (descendingIterator.hasNext()) {
                Integer fbAppVersion = (Integer) descendingIterator.next();
                Intrinsics.checkNotNullExpressionValue(fbAppVersion, "fbAppVersion");
                i11 = Math.max(i11, fbAppVersion.intValue());
                while (length >= 0 && versionSpec[length] > fbAppVersion.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (versionSpec[length] == fbAppVersion.intValue()) {
                    if (length % 2 != 0) {
                        return -1;
                    }
                    return Math.min(i11, i10);
                }
            }
            return -1;
        } catch (Throwable th2) {
            m6.a.a(g0.class, th2);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[LOOP:0: B:7:0x0015->B:16:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.content.Intent d(android.content.Context r7) {
        /*
            java.lang.String r0 = "context"
            java.lang.Class<com.facebook.internal.g0> r1 = com.facebook.internal.g0.class
            boolean r2 = m6.a.b(r1)
            r3 = 0
            if (r2 == 0) goto Lc
            return r3
        Lc:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)     // Catch: java.lang.Throwable -> L6a
            java.util.ArrayList r2 = com.facebook.internal.g0.f11035b     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L6a
        L15:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L69
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L6a
            com.facebook.internal.f0 r4 = (com.facebook.internal.f0) r4     // Catch: java.lang.Throwable -> L6a
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L6a
            java.lang.String r6 = "com.facebook.platform.PLATFORM_SERVICE"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = r4.b()     // Catch: java.lang.Throwable -> L6a
            android.content.Intent r4 = r5.setPackage(r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r5 = "android.intent.category.DEFAULT"
            android.content.Intent r4 = r4.addCategory(r5)     // Catch: java.lang.Throwable -> L6a
            boolean r5 = m6.a.b(r1)     // Catch: java.lang.Throwable -> L6a
            if (r5 == 0) goto L3d
            goto L65
        L3d:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)     // Catch: java.lang.Throwable -> L61
            if (r4 != 0) goto L43
            goto L65
        L43:
            android.content.pm.PackageManager r5 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L61
            r6 = 0
            android.content.pm.ResolveInfo r5 = r5.resolveService(r4, r6)     // Catch: java.lang.Throwable -> L61
            if (r5 != 0) goto L4f
            goto L65
        L4f:
            java.util.HashSet r6 = com.facebook.internal.q.a     // Catch: java.lang.Throwable -> L61
            android.content.pm.ServiceInfo r5 = r5.serviceInfo     // Catch: java.lang.Throwable -> L61
            java.lang.String r5 = r5.packageName     // Catch: java.lang.Throwable -> L61
            java.lang.String r6 = "resolveInfo.serviceInfo.packageName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)     // Catch: java.lang.Throwable -> L61
            boolean r5 = com.facebook.internal.q.a(r7, r5)     // Catch: java.lang.Throwable -> L61
            if (r5 != 0) goto L66
            goto L65
        L61:
            r4 = move-exception
            m6.a.a(r1, r4)     // Catch: java.lang.Throwable -> L6a
        L65:
            r4 = r3
        L66:
            if (r4 == 0) goto L15
            return r4
        L69:
            return r3
        L6a:
            r7 = move-exception
            m6.a.a(r1, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.g0.d(android.content.Context):android.content.Intent");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[Catch: all -> 0x009e, TryCatch #3 {all -> 0x009e, blocks: (B:6:0x000a, B:21:0x004b, B:23:0x0067, B:26:0x0090, B:33:0x008c, B:34:0x0093, B:36:0x0098, B:44:0x0044, B:11:0x001d, B:13:0x0027, B:15:0x002d, B:18:0x003c, B:42:0x0034, B:28:0x0071, B:30:0x0083), top: B:5:0x000a, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.content.Intent e(android.content.Intent r8, android.os.Bundle r9, com.facebook.q r10) {
        /*
            java.lang.Class<com.facebook.internal.g0> r0 = com.facebook.internal.g0.class
            boolean r1 = m6.a.b(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.lang.String r1 = "requestIntent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)     // Catch: java.lang.Throwable -> L9e
            boolean r1 = m6.a.b(r0)     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = "action_id"
            java.lang.String r4 = "com.facebook.platform.protocol.BRIDGE_ARGS"
            if (r1 == 0) goto L1a
            goto L41
        L1a:
            if (r8 != 0) goto L1d
            goto L41
        L1d:
            int r1 = i(r8)     // Catch: java.lang.Throwable -> L43
            boolean r1 = j(r1)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L34
            android.os.Bundle r1 = r8.getBundleExtra(r4)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L32
            java.lang.String r1 = r1.getString(r3)     // Catch: java.lang.Throwable -> L43
            goto L3a
        L32:
            r1 = r2
            goto L3a
        L34:
            java.lang.String r1 = "com.facebook.platform.protocol.CALL_ID"
            java.lang.String r1 = r8.getStringExtra(r1)     // Catch: java.lang.Throwable -> L43
        L3a:
            if (r1 == 0) goto L41
            java.util.UUID r1 = java.util.UUID.fromString(r1)     // Catch: java.lang.IllegalArgumentException -> L41 java.lang.Throwable -> L43
            goto L48
        L41:
            r1 = r2
            goto L48
        L43:
            r1 = move-exception
            m6.a.a(r0, r1)     // Catch: java.lang.Throwable -> L9e
            goto L41
        L48:
            if (r1 != 0) goto L4b
            return r2
        L4b:
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L9e
            r5.<init>()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r6 = "com.facebook.platform.protocol.PROTOCOL_VERSION"
            int r8 = i(r8)     // Catch: java.lang.Throwable -> L9e
            r5.putExtra(r6, r8)     // Catch: java.lang.Throwable -> L9e
            android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L9e
            r8.<init>()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9e
            r8.putString(r3, r1)     // Catch: java.lang.Throwable -> L9e
            if (r10 == 0) goto L93
            java.lang.String r1 = "error"
            boolean r3 = m6.a.b(r0)     // Catch: java.lang.Throwable -> L9e
            if (r3 == 0) goto L71
        L6f:
            r3 = r2
            goto L90
        L71:
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Throwable -> L8b
            r3.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = "error_description"
            java.lang.String r7 = r10.toString()     // Catch: java.lang.Throwable -> L8b
            r3.putString(r6, r7)     // Catch: java.lang.Throwable -> L8b
            boolean r10 = r10 instanceof com.facebook.s     // Catch: java.lang.Throwable -> L8b
            if (r10 == 0) goto L90
            java.lang.String r10 = "error_type"
            java.lang.String r6 = "UserCanceled"
            r3.putString(r10, r6)     // Catch: java.lang.Throwable -> L8b
            goto L90
        L8b:
            r10 = move-exception
            m6.a.a(r0, r10)     // Catch: java.lang.Throwable -> L9e
            goto L6f
        L90:
            r8.putBundle(r1, r3)     // Catch: java.lang.Throwable -> L9e
        L93:
            r5.putExtra(r4, r8)     // Catch: java.lang.Throwable -> L9e
            if (r9 == 0) goto L9d
            java.lang.String r8 = "com.facebook.platform.protocol.RESULT_ARGS"
            r5.putExtra(r8, r9)     // Catch: java.lang.Throwable -> L9e
        L9d:
            return r5
        L9e:
            r8 = move-exception
            m6.a.a(r0, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.g0.e(android.content.Intent, android.os.Bundle, com.facebook.q):android.content.Intent");
    }

    public static final Bundle h(Intent intent) {
        if (m6.a.b(g0.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            if (!j(i(intent))) {
                return intent.getExtras();
            }
            return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th2) {
            m6.a.a(g0.class, th2);
            return null;
        }
    }

    public static final int i(Intent intent) {
        if (m6.a.b(g0.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th2) {
            m6.a.a(g0.class, th2);
            return 0;
        }
    }

    public static final boolean j(int i10) {
        if (m6.a.b(g0.class)) {
            return false;
        }
        try {
            if (!ArraysKt.contains(f11037d, Integer.valueOf(i10)) || i10 < 20140701) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            m6.a.a(g0.class, th2);
            return false;
        }
    }

    public static final void k() {
        if (m6.a.b(g0.class)) {
            return;
        }
        try {
            if (!f11036c.compareAndSet(false, true)) {
                return;
            }
            com.facebook.x.c().execute(new com.applovin.impl.sdk.g0(15));
        } catch (Throwable th2) {
            m6.a.a(g0.class, th2);
        }
    }

    public final ArrayList a() {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            return CollectionsKt.arrayListOf(new e0(2), new e0(4));
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:6:0x0008, B:7:0x000d, B:11:0x001a, B:13:0x003f, B:18:0x004b, B:19:0x0059, B:21:0x005f, B:22:0x0065, B:23:0x0072, B:25:0x007a, B:27:0x008d, B:28:0x0095, B:30:0x00a6, B:31:0x00ab, B:33:0x00bb, B:35:0x00c6), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:6:0x0008, B:7:0x000d, B:11:0x001a, B:13:0x003f, B:18:0x004b, B:19:0x0059, B:21:0x005f, B:22:0x0065, B:23:0x0072, B:25:0x007a, B:27:0x008d, B:28:0x0095, B:30:0x00a6, B:31:0x00ab, B:33:0x00bb, B:35:0x00c6), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:6:0x0008, B:7:0x000d, B:11:0x001a, B:13:0x003f, B:18:0x004b, B:19:0x0059, B:21:0x005f, B:22:0x0065, B:23:0x0072, B:25:0x007a, B:27:0x008d, B:28:0x0095, B:30:0x00a6, B:31:0x00ab, B:33:0x00bb, B:35:0x00c6), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6 A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:6:0x0008, B:7:0x000d, B:11:0x001a, B:13:0x003f, B:18:0x004b, B:19:0x0059, B:21:0x005f, B:22:0x0065, B:23:0x0072, B:25:0x007a, B:27:0x008d, B:28:0x0095, B:30:0x00a6, B:31:0x00ab, B:33:0x00bb, B:35:0x00c6), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb A[Catch: all -> 0x00cc, TryCatch #0 {all -> 0x00cc, blocks: (B:6:0x0008, B:7:0x000d, B:11:0x001a, B:13:0x003f, B:18:0x004b, B:19:0x0059, B:21:0x005f, B:22:0x0065, B:23:0x0072, B:25:0x007a, B:27:0x008d, B:28:0x0095, B:30:0x00a6, B:31:0x00ab, B:33:0x00bb, B:35:0x00c6), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6 A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #0 {all -> 0x00cc, blocks: (B:6:0x0008, B:7:0x000d, B:11:0x001a, B:13:0x003f, B:18:0x004b, B:19:0x0059, B:21:0x005f, B:22:0x0065, B:23:0x0072, B:25:0x007a, B:27:0x008d, B:28:0x0095, B:30:0x00a6, B:31:0x00ab, B:33:0x00bb, B:35:0x00c6), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Intent c(com.facebook.internal.f0 r7, java.lang.String r8, java.util.Collection r9, java.lang.String r10, boolean r11, com.facebook.login.d r12, java.lang.String r13, java.lang.String r14, boolean r15, java.lang.String r16, boolean r17, com.facebook.login.b0 r18, boolean r19, boolean r20, java.lang.String r21) {
        /*
            r6 = this;
            boolean r0 = m6.a.b(r6)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = r7
            com.facebook.internal.e0 r0 = (com.facebook.internal.e0) r0     // Catch: java.lang.Throwable -> Lcc
            int r0 = r0.f11034b     // Catch: java.lang.Throwable -> Lcc
            switch(r0) {
                case 0: goto L16;
                case 1: goto L13;
                case 2: goto L10;
                case 3: goto L16;
                default: goto L10;
            }     // Catch: java.lang.Throwable -> Lcc
        L10:
            java.lang.String r0 = "com.facebook.katana.ProxyAuth"
            goto L17
        L13:
            java.lang.String r0 = "com.instagram.platform.AppAuthorizeActivity"
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 != 0) goto L1a
            return r1
        L1a:
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> Lcc
            r2.<init>()     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r3 = r7.b()     // Catch: java.lang.Throwable -> Lcc
            android.content.Intent r0 = r2.setClassName(r3, r0)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r2 = "client_id"
            r3 = r8
            android.content.Intent r0 = r0.putExtra(r2, r8)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r2 = "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r2 = "facebook_sdk_version"
            com.facebook.x r3 = com.facebook.x.a     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r3 = "16.1.3"
            r0.putExtra(r2, r3)     // Catch: java.lang.Throwable -> Lcc
            r2 = 1
            if (r9 == 0) goto L48
            boolean r3 = r9.isEmpty()     // Catch: java.lang.Throwable -> Lcc
            if (r3 == 0) goto L46
            goto L48
        L46:
            r3 = 0
            goto L49
        L48:
            r3 = r2
        L49:
            if (r3 != 0) goto L59
            java.lang.String r3 = "scope"
            java.lang.String r4 = ","
            r5 = r9
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r4 = android.text.TextUtils.join(r4, r5)     // Catch: java.lang.Throwable -> Lcc
            r0.putExtra(r3, r4)     // Catch: java.lang.Throwable -> Lcc
        L59:
            boolean r3 = com.facebook.internal.m0.z(r10)     // Catch: java.lang.Throwable -> Lcc
            if (r3 != 0) goto L65
            java.lang.String r3 = "e2e"
            r4 = r10
            r0.putExtra(r3, r10)     // Catch: java.lang.Throwable -> Lcc
        L65:
            java.lang.String r3 = "state"
            r4 = r13
            r0.putExtra(r3, r13)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r3 = "response_type"
            r4 = r7
            com.facebook.internal.e0 r4 = (com.facebook.internal.e0) r4     // Catch: java.lang.Throwable -> Lcc
            int r4 = r4.f11034b     // Catch: java.lang.Throwable -> Lcc
            switch(r4) {
                case 1: goto L78;
                default: goto L75;
            }     // Catch: java.lang.Throwable -> Lcc
        L75:
            java.lang.String r4 = "id_token,token,signed_request,graph_domain"
            goto L7a
        L78:
            java.lang.String r4 = "token,signed_request,graph_domain,granted_scopes"
        L7a:
            r0.putExtra(r3, r4)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r3 = "nonce"
            r4 = r21
            r0.putExtra(r3, r4)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r3 = "return_scopes"
            java.lang.String r4 = "true"
            r0.putExtra(r3, r4)     // Catch: java.lang.Throwable -> Lcc
            if (r11 == 0) goto L95
            java.lang.String r3 = "default_audience"
            r4 = r12
            java.lang.String r4 = r4.f11196b     // Catch: java.lang.Throwable -> Lcc
            r0.putExtra(r3, r4)     // Catch: java.lang.Throwable -> Lcc
        L95:
            java.lang.String r3 = "legacy_override"
            java.lang.String r4 = com.facebook.x.d()     // Catch: java.lang.Throwable -> Lcc
            r0.putExtra(r3, r4)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r3 = "auth_type"
            r4 = r14
            r0.putExtra(r3, r14)     // Catch: java.lang.Throwable -> Lcc
            if (r15 == 0) goto Lab
            java.lang.String r3 = "fail_on_logged_out"
            r0.putExtra(r3, r2)     // Catch: java.lang.Throwable -> Lcc
        Lab:
            java.lang.String r3 = "messenger_page_id"
            r4 = r16
            r0.putExtra(r3, r4)     // Catch: java.lang.Throwable -> Lcc
            java.lang.String r3 = "reset_messenger_state"
            r4 = r17
            r0.putExtra(r3, r4)     // Catch: java.lang.Throwable -> Lcc
            if (r19 == 0) goto Lc4
            java.lang.String r3 = "fx_app"
            r4 = r18
            java.lang.String r4 = r4.f11190b     // Catch: java.lang.Throwable -> Lcc
            r0.putExtra(r3, r4)     // Catch: java.lang.Throwable -> Lcc
        Lc4:
            if (r20 == 0) goto Lcb
            java.lang.String r3 = "skip_dedupe"
            r0.putExtra(r3, r2)     // Catch: java.lang.Throwable -> Lcc
        Lcb:
            return r0
        Lcc:
            r0 = move-exception
            r2 = r6
            m6.a.a(r6, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.g0.c(com.facebook.internal.f0, java.lang.String, java.util.Collection, java.lang.String, boolean, com.facebook.login.d, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, com.facebook.login.b0, boolean, boolean, java.lang.String):android.content.Intent");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(11:46|47|48|9|10|11|12|13|(4:15|16|17|(2:(3:25|22|23)|26))(1:39)|(1:20)|21)|9|10|11|12|13|(0)(0)|(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0066, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0067, code lost:
    
        android.util.Log.e("com.facebook.internal.g0", "Failed to query content resolver.", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2 A[Catch: all -> 0x00af, TRY_ENTER, TryCatch #7 {all -> 0x00af, blocks: (B:6:0x000e, B:32:0x00ae, B:33:0x00ab, B:20:0x00a2, B:51:0x004a, B:47:0x0029), top: B:5:0x000e, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083 A[EXC_TOP_SPLITTER, LOOP:0: B:22:0x0083->B:25:0x0089, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab A[Catch: all -> 0x00af, TryCatch #7 {all -> 0x00af, blocks: (B:6:0x000e, B:32:0x00ae, B:33:0x00ab, B:20:0x00a2, B:51:0x004a, B:47:0x0029), top: B:5:0x000e, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.TreeSet f(com.facebook.internal.f0 r14) {
        /*
            r13 = this;
            java.lang.String r0 = "version"
            java.lang.String r1 = "Failed to query content resolver."
            java.lang.String r2 = "com.facebook.internal.g0"
            boolean r3 = m6.a.b(r13)
            r4 = 0
            if (r3 == 0) goto Le
            return r4
        Le:
            java.util.TreeSet r3 = new java.util.TreeSet     // Catch: java.lang.Throwable -> Laf
            r3.<init>()     // Catch: java.lang.Throwable -> Laf
            android.content.Context r5 = com.facebook.x.a()     // Catch: java.lang.Throwable -> Laf
            android.content.ContentResolver r6 = r5.getContentResolver()     // Catch: java.lang.Throwable -> Laf
            java.lang.String[] r8 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> Laf
            java.lang.String r5 = "content://"
            boolean r7 = m6.a.b(r13)     // Catch: java.lang.Throwable -> Laf
            if (r7 == 0) goto L29
        L27:
            r7 = r4
            goto L4e
        L29:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r14.b()     // Catch: java.lang.Throwable -> L49
            r7.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = ".provider.PlatformProvider/versions"
            r7.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L49
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r7)     // Catch: java.lang.Throwable -> L49
            r7 = r5
            goto L4e
        L49:
            r5 = move-exception
            m6.a.a(r13, r5)     // Catch: java.lang.Throwable -> Laf
            goto L27
        L4e:
            android.content.Context r5 = com.facebook.x.a()     // Catch: java.lang.Throwable -> La6
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> La6
            java.lang.String r14 = r14.b()     // Catch: java.lang.Throwable -> La6
            java.lang.String r9 = ".provider.PlatformProvider"
            java.lang.String r14 = kotlin.jvm.internal.Intrinsics.stringPlus(r14, r9)     // Catch: java.lang.Throwable -> La6
            r9 = 0
            android.content.pm.ProviderInfo r14 = r5.resolveContentProvider(r14, r9)     // Catch: java.lang.RuntimeException -> L66 java.lang.Throwable -> La6
            goto L6b
        L66:
            r14 = move-exception
            android.util.Log.e(r2, r1, r14)     // Catch: java.lang.Throwable -> La6
            r14 = r4
        L6b:
            if (r14 == 0) goto L9e
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r14 = r6.query(r7, r8, r9, r10, r11)     // Catch: java.lang.IllegalArgumentException -> L75 java.lang.SecurityException -> L79 java.lang.NullPointerException -> L7d java.lang.Throwable -> La6
            goto L81
        L75:
            android.util.Log.e(r2, r1)     // Catch: java.lang.Throwable -> La6
            goto L80
        L79:
            android.util.Log.e(r2, r1)     // Catch: java.lang.Throwable -> La6
            goto L80
        L7d:
            android.util.Log.e(r2, r1)     // Catch: java.lang.Throwable -> La6
        L80:
            r14 = r4
        L81:
            if (r14 == 0) goto L9f
        L83:
            boolean r1 = r14.moveToNext()     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L9f
            int r1 = r14.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L99
            int r1 = r14.getInt(r1)     // Catch: java.lang.Throwable -> L99
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L99
            r3.add(r1)     // Catch: java.lang.Throwable -> L99
            goto L83
        L99:
            r0 = move-exception
            r12 = r0
            r0 = r14
            r14 = r12
            goto La8
        L9e:
            r14 = r4
        L9f:
            if (r14 != 0) goto La2
            goto La5
        La2:
            r14.close()     // Catch: java.lang.Throwable -> Laf
        La5:
            return r3
        La6:
            r14 = move-exception
            r0 = r4
        La8:
            if (r0 != 0) goto Lab
            goto Lae
        Lab:
            r0.close()     // Catch: java.lang.Throwable -> Laf
        Lae:
            throw r14     // Catch: java.lang.Throwable -> Laf
        Laf:
            r14 = move-exception
            m6.a.a(r13, r14)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.g0.f(com.facebook.internal.f0):java.util.TreeSet");
    }

    public final androidx.work.p g(ArrayList arrayList, int[] iArr) {
        if (m6.a.b(this)) {
            return null;
        }
        try {
            k();
            if (arrayList == null) {
                androidx.work.p pVar = new androidx.work.p();
                pVar.f2227b = -1;
                return pVar;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f0 f0Var = (f0) it.next();
                TreeSet treeSet = f0Var.a;
                int i10 = 0;
                if (treeSet == null || !Intrinsics.areEqual(Boolean.valueOf(treeSet.isEmpty()), Boolean.FALSE)) {
                    f0Var.a(false);
                }
                TreeSet treeSet2 = f0Var.a;
                if (!m6.a.b(g0.class)) {
                    try {
                        i10 = f11037d[0].intValue();
                    } catch (Throwable th2) {
                        m6.a.a(g0.class, th2);
                    }
                }
                int b3 = b(treeSet2, i10, iArr);
                if (b3 != -1) {
                    androidx.work.p pVar2 = new androidx.work.p();
                    pVar2.f2227b = b3;
                    return pVar2;
                }
            }
            androidx.work.p pVar3 = new androidx.work.p();
            pVar3.f2227b = -1;
            return pVar3;
        } catch (Throwable th3) {
            m6.a.a(this, th3);
            return null;
        }
    }
}

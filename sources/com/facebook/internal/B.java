package com.facebook.internal;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import u7.AbstractC2815f;
import u7.AbstractC2817h;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public static final B f13569a;
    public static final ArrayList b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f13570c;

    /* renamed from: d, reason: collision with root package name */
    public static final Integer[] f13571d;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.facebook.internal.B] */
    static {
        ?? obj = new Object();
        f13569a = obj;
        b = obj.a();
        ArrayList arrayList = null;
        if (!O2.a.b(obj)) {
            try {
                ArrayList y4 = AbstractC2817h.y(new A(0));
                y4.addAll(obj.a());
                arrayList = y4;
            } catch (Throwable th) {
                O2.a.a(obj, th);
            }
        }
        B b8 = f13569a;
        if (!O2.a.b(b8)) {
            try {
                HashMap hashMap = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new A(3));
                ArrayList arrayList3 = b;
                hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList2);
                hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList2);
                hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayList);
                hashMap.put("com.facebook.platform.action.request.SHARE_STORY", arrayList3);
            } catch (Throwable th2) {
                O2.a.a(b8, th2);
            }
        }
        f13570c = new AtomicBoolean(false);
        f13571d = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    public static final int b(TreeSet treeSet, int i9, int[] iArr) {
        if (O2.a.b(B.class)) {
            return 0;
        }
        if (treeSet == null) {
            return -1;
        }
        try {
            int length = iArr.length - 1;
            Iterator descendingIterator = treeSet.descendingIterator();
            int i10 = -1;
            while (descendingIterator.hasNext()) {
                Integer num = (Integer) descendingIterator.next();
                G7.j.d(num, "fbAppVersion");
                i10 = Math.max(i10, num.intValue());
                while (length >= 0 && iArr[length] > num.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (iArr[length] == num.intValue()) {
                    if (length % 2 != 0) {
                        return -1;
                    }
                    return Math.min(i10, i9);
                }
            }
            return -1;
        } catch (Throwable th) {
            O2.a.a(B.class, th);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[LOOP:0: B:7:0x0015->B:16:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.content.Intent d(android.content.Context r6) {
        /*
            java.lang.Class<com.facebook.internal.B> r0 = com.facebook.internal.B.class
            boolean r1 = O2.a.b(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.lang.String r1 = "context"
            G7.j.e(r6, r1)     // Catch: java.lang.Throwable -> L67
            java.util.ArrayList r1 = com.facebook.internal.B.b     // Catch: java.lang.Throwable -> L67
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L67
        L15:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L69
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L67
            com.facebook.internal.A r3 = (com.facebook.internal.A) r3     // Catch: java.lang.Throwable -> L67
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = "com.facebook.platform.PLATFORM_SERVICE"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = r3.c()     // Catch: java.lang.Throwable -> L67
            android.content.Intent r3 = r4.setPackage(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "android.intent.category.DEFAULT"
            android.content.Intent r3 = r3.addCategory(r4)     // Catch: java.lang.Throwable -> L67
            boolean r4 = O2.a.b(r0)     // Catch: java.lang.Throwable -> L67
            if (r4 == 0) goto L3e
        L3c:
            r3 = r2
            goto L64
        L3e:
            if (r3 != 0) goto L41
            goto L3c
        L41:
            android.content.pm.PackageManager r4 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L5f
            r5 = 0
            android.content.pm.ResolveInfo r4 = r4.resolveService(r3, r5)     // Catch: java.lang.Throwable -> L5f
            if (r4 != 0) goto L4d
            goto L3c
        L4d:
            java.util.HashSet r5 = com.facebook.internal.AbstractC1844m.f13621a     // Catch: java.lang.Throwable -> L5f
            android.content.pm.ServiceInfo r4 = r4.serviceInfo     // Catch: java.lang.Throwable -> L5f
            java.lang.String r4 = r4.packageName     // Catch: java.lang.Throwable -> L5f
            java.lang.String r5 = "resolveInfo.serviceInfo.packageName"
            G7.j.d(r4, r5)     // Catch: java.lang.Throwable -> L5f
            boolean r4 = com.facebook.internal.AbstractC1844m.a(r6, r4)     // Catch: java.lang.Throwable -> L5f
            if (r4 != 0) goto L64
            goto L3c
        L5f:
            r3 = move-exception
            O2.a.a(r0, r3)     // Catch: java.lang.Throwable -> L67
            goto L3c
        L64:
            if (r3 == 0) goto L15
            return r3
        L67:
            r6 = move-exception
            goto L6a
        L69:
            return r2
        L6a:
            O2.a.a(r0, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.B.d(android.content.Context):android.content.Intent");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043 A[Catch: all -> 0x008c, TryCatch #3 {all -> 0x008c, blocks: (B:6:0x000a, B:12:0x0043, B:14:0x005f, B:17:0x0088, B:24:0x0084, B:25:0x008e, B:27:0x0093, B:45:0x003c, B:19:0x0069, B:21:0x007b, B:31:0x0016, B:33:0x0020, B:35:0x0026, B:38:0x0037, B:42:0x002f), top: B:5:0x000a, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final android.content.Intent e(android.content.Intent r8, android.os.Bundle r9, com.facebook.C1849l r10) {
        /*
            java.lang.Class<com.facebook.internal.B> r0 = com.facebook.internal.B.class
            boolean r1 = O2.a.b(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = O2.a.b(r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.String r3 = "action_id"
            java.lang.String r4 = "com.facebook.platform.protocol.BRIDGE_ARGS"
            if (r1 == 0) goto L16
        L14:
            r1 = r2
            goto L40
        L16:
            int r1 = i(r8)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = j(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2f
            android.os.Bundle r1 = r8.getBundleExtra(r4)     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2d
            java.lang.String r1 = r1.getString(r3)     // Catch: java.lang.Throwable -> L2b
            goto L35
        L2b:
            r1 = move-exception
            goto L3c
        L2d:
            r1 = r2
            goto L35
        L2f:
            java.lang.String r1 = "com.facebook.platform.protocol.CALL_ID"
            java.lang.String r1 = r8.getStringExtra(r1)     // Catch: java.lang.Throwable -> L2b
        L35:
            if (r1 == 0) goto L14
            java.util.UUID r1 = java.util.UUID.fromString(r1)     // Catch: java.lang.IllegalArgumentException -> L14 java.lang.Throwable -> L2b
            goto L40
        L3c:
            O2.a.a(r0, r1)     // Catch: java.lang.Throwable -> L8c
            goto L14
        L40:
            if (r1 != 0) goto L43
            return r2
        L43:
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L8c
            r5.<init>()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r6 = "com.facebook.platform.protocol.PROTOCOL_VERSION"
            int r8 = i(r8)     // Catch: java.lang.Throwable -> L8c
            r5.putExtra(r6, r8)     // Catch: java.lang.Throwable -> L8c
            android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L8c
            r8.<init>()     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L8c
            r8.putString(r3, r1)     // Catch: java.lang.Throwable -> L8c
            if (r10 == 0) goto L8e
            java.lang.String r1 = "error"
            boolean r3 = O2.a.b(r0)     // Catch: java.lang.Throwable -> L8c
            if (r3 == 0) goto L69
        L67:
            r3 = r2
            goto L88
        L69:
            android.os.Bundle r3 = new android.os.Bundle     // Catch: java.lang.Throwable -> L83
            r3.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = "error_description"
            java.lang.String r7 = r10.toString()     // Catch: java.lang.Throwable -> L83
            r3.putString(r6, r7)     // Catch: java.lang.Throwable -> L83
            boolean r10 = r10 instanceof com.facebook.C1854n     // Catch: java.lang.Throwable -> L83
            if (r10 == 0) goto L88
            java.lang.String r10 = "error_type"
            java.lang.String r6 = "UserCanceled"
            r3.putString(r10, r6)     // Catch: java.lang.Throwable -> L83
            goto L88
        L83:
            r10 = move-exception
            O2.a.a(r0, r10)     // Catch: java.lang.Throwable -> L8c
            goto L67
        L88:
            r8.putBundle(r1, r3)     // Catch: java.lang.Throwable -> L8c
            goto L8e
        L8c:
            r8 = move-exception
            goto L99
        L8e:
            r5.putExtra(r4, r8)     // Catch: java.lang.Throwable -> L8c
            if (r9 == 0) goto L98
            java.lang.String r8 = "com.facebook.platform.protocol.RESULT_ARGS"
            r5.putExtra(r8, r9)     // Catch: java.lang.Throwable -> L8c
        L98:
            return r5
        L99:
            O2.a.a(r0, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.B.e(android.content.Intent, android.os.Bundle, com.facebook.l):android.content.Intent");
    }

    public static final Bundle h(Intent intent) {
        if (O2.a.b(B.class)) {
            return null;
        }
        try {
            if (!j(i(intent))) {
                return intent.getExtras();
            }
            return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            O2.a.a(B.class, th);
            return null;
        }
    }

    public static final int i(Intent intent) {
        if (O2.a.b(B.class)) {
            return 0;
        }
        try {
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            O2.a.a(B.class, th);
            return 0;
        }
    }

    public static final boolean j(int i9) {
        if (O2.a.b(B.class)) {
            return false;
        }
        try {
            Integer[] numArr = f13571d;
            Integer valueOf = Integer.valueOf(i9);
            G7.j.e(numArr, "<this>");
            if (AbstractC2815f.A(numArr, valueOf) < 0 || i9 < 20140701) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            O2.a.a(B.class, th);
            return false;
        }
    }

    public static final void k() {
        if (O2.a.b(B.class)) {
            return;
        }
        try {
            if (!f13570c.compareAndSet(false, true)) {
                return;
            }
            com.facebook.r.c().execute(new C2.b(15));
        } catch (Throwable th) {
            O2.a.a(B.class, th);
        }
    }

    public final ArrayList a() {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            return AbstractC2817h.y(new A(2), new A(4));
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    public final Intent c(A a6, String str, Collection collection, String str2, boolean z8, com.facebook.login.d dVar, String str3, String str4, boolean z9, String str5, boolean z10, com.facebook.login.A a9, boolean z11, boolean z12, String str6) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            String b8 = a6.b();
            if (b8 == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(a6.c(), b8).putExtra("client_id", str);
            G7.j.d(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            com.facebook.r rVar = com.facebook.r.f13801a;
            putExtra.putExtra("facebook_sdk_version", "16.1.3");
            if (collection != null && !collection.isEmpty()) {
                putExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!H.B(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", a6.d());
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra("return_scopes", "true");
            if (z8) {
                putExtra.putExtra("default_audience", dVar.b);
            }
            putExtra.putExtra("legacy_override", com.facebook.r.d());
            putExtra.putExtra("auth_type", str4);
            if (z9) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z10);
            if (z11) {
                putExtra.putExtra("fx_app", a9.b);
            }
            if (z12) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(11:46|47|48|9|10|11|12|13|(4:15|16|17|(2:(3:25|22|23)|26))(1:39)|(1:20)|21)|9|10|11|12|13|(0)(0)|(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0069, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006a, code lost:
    
        android.util.Log.e("com.facebook.internal.B", "Failed to query content resolver.", r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006d, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #3 {all -> 0x00aa, blocks: (B:6:0x000e, B:32:0x00b2, B:33:0x00af, B:20:0x00a6, B:51:0x004a, B:47:0x0029), top: B:5:0x000e, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087 A[EXC_TOP_SPLITTER, LOOP:0: B:22:0x0087->B:25:0x008d, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.TreeSet f(com.facebook.internal.A r14) {
        /*
            r13 = this;
            java.lang.String r0 = "version"
            java.lang.String r1 = "Failed to query content resolver."
            java.lang.String r2 = "com.facebook.internal.B"
            boolean r3 = O2.a.b(r13)
            r4 = 0
            if (r3 == 0) goto Le
            return r4
        Le:
            java.util.TreeSet r3 = new java.util.TreeSet     // Catch: java.lang.Throwable -> Laa
            r3.<init>()     // Catch: java.lang.Throwable -> Laa
            android.content.Context r5 = com.facebook.r.a()     // Catch: java.lang.Throwable -> Laa
            android.content.ContentResolver r6 = r5.getContentResolver()     // Catch: java.lang.Throwable -> Laa
            java.lang.String[] r8 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> Laa
            java.lang.String r5 = "content://"
            boolean r7 = O2.a.b(r13)     // Catch: java.lang.Throwable -> Laa
            if (r7 == 0) goto L29
        L27:
            r7 = r4
            goto L4e
        L29:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r14.c()     // Catch: java.lang.Throwable -> L49
            r7.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = ".provider.PlatformProvider/versions"
            r7.append(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> L49
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L49
            java.lang.String r7 = "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)"
            G7.j.d(r5, r7)     // Catch: java.lang.Throwable -> L49
            r7 = r5
            goto L4e
        L49:
            r5 = move-exception
            O2.a.a(r13, r5)     // Catch: java.lang.Throwable -> Laa
            goto L27
        L4e:
            android.content.Context r5 = com.facebook.r.a()     // Catch: java.lang.Throwable -> L66
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L66
            java.lang.String r14 = r14.c()     // Catch: java.lang.Throwable -> L66
            java.lang.String r9 = ".provider.PlatformProvider"
            java.lang.String r14 = G7.j.j(r9, r14)     // Catch: java.lang.Throwable -> L66
            r9 = 0
            android.content.pm.ProviderInfo r14 = r5.resolveContentProvider(r14, r9)     // Catch: java.lang.Throwable -> L66 java.lang.RuntimeException -> L69
            goto L6e
        L66:
            r14 = move-exception
            r0 = r4
            goto Lac
        L69:
            r14 = move-exception
            android.util.Log.e(r2, r1, r14)     // Catch: java.lang.Throwable -> L66
            r14 = r4
        L6e:
            if (r14 == 0) goto La2
            r11 = 0
            r9 = 0
            r10 = 0
            android.database.Cursor r14 = r6.query(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L66 java.lang.IllegalArgumentException -> L78 java.lang.SecurityException -> L7d java.lang.NullPointerException -> L81
            goto L85
        L78:
            android.util.Log.e(r2, r1)     // Catch: java.lang.Throwable -> L66
        L7b:
            r14 = r4
            goto L85
        L7d:
            android.util.Log.e(r2, r1)     // Catch: java.lang.Throwable -> L66
            goto L7b
        L81:
            android.util.Log.e(r2, r1)     // Catch: java.lang.Throwable -> L66
            goto L7b
        L85:
            if (r14 == 0) goto La3
        L87:
            boolean r1 = r14.moveToNext()     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto La3
            int r1 = r14.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L9d
            int r1 = r14.getInt(r1)     // Catch: java.lang.Throwable -> L9d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L9d
            r3.add(r1)     // Catch: java.lang.Throwable -> L9d
            goto L87
        L9d:
            r0 = move-exception
            r12 = r0
            r0 = r14
            r14 = r12
            goto Lac
        La2:
            r14 = r4
        La3:
            if (r14 != 0) goto La6
            goto La9
        La6:
            r14.close()     // Catch: java.lang.Throwable -> Laa
        La9:
            return r3
        Laa:
            r14 = move-exception
            goto Lb3
        Lac:
            if (r0 != 0) goto Laf
            goto Lb2
        Laf:
            r0.close()     // Catch: java.lang.Throwable -> Laa
        Lb2:
            throw r14     // Catch: java.lang.Throwable -> Laa
        Lb3:
            O2.a.a(r13, r14)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.B.f(com.facebook.internal.A):java.util.TreeSet");
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, androidx.work.o] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, androidx.work.o] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, androidx.work.o] */
    public final androidx.work.o g(int[] iArr) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            k();
            ArrayList<A> arrayList = b;
            if (arrayList == null) {
                ?? obj = new Object();
                obj.b = -1;
                return obj;
            }
            for (A a6 : arrayList) {
                TreeSet treeSet = a6.f13568a;
                int i9 = 0;
                if (treeSet == null || !Boolean.valueOf(treeSet.isEmpty()).equals(Boolean.FALSE)) {
                    a6.a(false);
                }
                TreeSet treeSet2 = a6.f13568a;
                if (!O2.a.b(B.class)) {
                    try {
                        i9 = f13571d[0].intValue();
                    } catch (Throwable th) {
                        O2.a.a(B.class, th);
                    }
                }
                int b8 = b(treeSet2, i9, iArr);
                if (b8 != -1) {
                    ?? obj2 = new Object();
                    obj2.b = b8;
                    return obj2;
                }
            }
            ?? obj3 = new Object();
            obj3.b = -1;
            return obj3;
        } catch (Throwable th2) {
            O2.a.a(this, th2);
            return null;
        }
    }
}

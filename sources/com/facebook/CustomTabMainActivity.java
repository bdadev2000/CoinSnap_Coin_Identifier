package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "<init>", "()V", "com/facebook/c", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class CustomTabMainActivity extends Activity {

    /* renamed from: d, reason: collision with root package name */
    public static final String f10870d = Intrinsics.stringPlus("CustomTabMainActivity", ".extra_action");

    /* renamed from: f, reason: collision with root package name */
    public static final String f10871f = Intrinsics.stringPlus("CustomTabMainActivity", ".extra_params");

    /* renamed from: g, reason: collision with root package name */
    public static final String f10872g = Intrinsics.stringPlus("CustomTabMainActivity", ".extra_chromePackage");

    /* renamed from: h, reason: collision with root package name */
    public static final String f10873h = Intrinsics.stringPlus("CustomTabMainActivity", ".extra_url");

    /* renamed from: i, reason: collision with root package name */
    public static final String f10874i = Intrinsics.stringPlus("CustomTabMainActivity", ".extra_targetApp");

    /* renamed from: j, reason: collision with root package name */
    public static final String f10875j = Intrinsics.stringPlus("CustomTabMainActivity", ".action_refresh");

    /* renamed from: k, reason: collision with root package name */
    public static final String f10876k = Intrinsics.stringPlus("CustomTabMainActivity", ".no_activity_exception");

    /* renamed from: b, reason: collision with root package name */
    public boolean f10877b = true;

    /* renamed from: c, reason: collision with root package name */
    public h.c0 f10878c;

    public final void a(int i10, Intent intent) {
        Bundle bundle;
        h.c0 c0Var = this.f10878c;
        if (c0Var != null) {
            m1.b.a(this).d(c0Var);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f10873h);
            if (stringExtra != null) {
                Uri parse = Uri.parse(stringExtra);
                bundle = com.facebook.internal.m0.F(parse.getQuery());
                bundle.putAll(com.facebook.internal.m0.F(parse.getFragment()));
            } else {
                bundle = new Bundle();
            }
            com.facebook.internal.g0 g0Var = com.facebook.internal.g0.a;
            Intent intent2 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent2, "intent");
            Intent e2 = com.facebook.internal.g0.e(intent2, bundle, null);
            if (e2 != null) {
                intent = e2;
            }
            setResult(i10, intent);
        } else {
            com.facebook.internal.g0 g0Var2 = com.facebook.internal.g0.a;
            Intent intent3 = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent3, "intent");
            setResult(i10, com.facebook.internal.g0.e(intent3, null, null));
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            java.lang.String r0 = com.facebook.CustomTabActivity.f10867c
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r1 = r1.getAction()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r1 = 0
            if (r0 == 0) goto L1b
            r9.setResult(r1)
            r9.finish()
            return
        L1b:
            if (r10 != 0) goto Ld3
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = com.facebook.CustomTabMainActivity.f10870d
            java.lang.String r10 = r10.getStringExtra(r0)
            if (r10 != 0) goto L2a
            return
        L2a:
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r2 = com.facebook.CustomTabMainActivity.f10871f
            android.os.Bundle r0 = r0.getBundleExtra(r2)
            android.content.Intent r2 = r9.getIntent()
            java.lang.String r3 = com.facebook.CustomTabMainActivity.f10872g
            java.lang.String r2 = r2.getStringExtra(r3)
            android.content.Intent r3 = r9.getIntent()
            java.lang.String r4 = com.facebook.CustomTabMainActivity.f10874i
            java.lang.String r3 = r3.getStringExtra(r4)
            com.facebook.login.b0[] r4 = com.facebook.login.b0.valuesCustom()
            int r5 = r4.length
            r6 = r1
        L4e:
            if (r6 >= r5) goto L5d
            r7 = r4[r6]
            int r6 = r6 + 1
            java.lang.String r8 = r7.f11190b
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r3)
            if (r8 == 0) goto L4e
            goto L5f
        L5d:
            com.facebook.login.b0 r7 = com.facebook.login.b0.FACEBOOK
        L5f:
            int[] r3 = com.facebook.o.a
            int r4 = r7.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 != r4) goto L70
            com.facebook.internal.b0 r3 = new com.facebook.internal.b0
            r3.<init>(r10, r0)
            goto L75
        L70:
            com.facebook.internal.h r3 = new com.facebook.internal.h
            r3.<init>(r10, r0)
        L75:
            boolean r10 = m6.a.b(r3)
            if (r10 == 0) goto L7c
            goto La7
        L7c:
            java.lang.String r10 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r10)     // Catch: java.lang.Throwable -> La3
            java.util.concurrent.locks.ReentrantLock r10 = com.facebook.login.c.f11192d     // Catch: java.lang.Throwable -> La3
            r10.lock()     // Catch: java.lang.Throwable -> La3
            o.s r0 = com.facebook.login.c.f11191c     // Catch: java.lang.Throwable -> La3
            r5 = 0
            com.facebook.login.c.f11191c = r5     // Catch: java.lang.Throwable -> La3
            r10.unlock()     // Catch: java.lang.Throwable -> La3
            o.l r10 = new o.l     // Catch: java.lang.Throwable -> La3
            r10.<init>(r0)     // Catch: java.lang.Throwable -> La3
            o.m r10 = r10.a()     // Catch: java.lang.Throwable -> La3
            android.content.Intent r0 = r10.a     // Catch: java.lang.Throwable -> La3
            r0.setPackage(r2)     // Catch: java.lang.Throwable -> La3
            android.net.Uri r0 = r3.a     // Catch: java.lang.Throwable -> La3 android.content.ActivityNotFoundException -> La7
            r10.a(r9, r0)     // Catch: java.lang.Throwable -> La3 android.content.ActivityNotFoundException -> La7
            r10 = r4
            goto La8
        La3:
            r10 = move-exception
            m6.a.a(r3, r10)
        La7:
            r10 = r1
        La8:
            r9.f10877b = r1
            if (r10 != 0) goto Lbd
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = com.facebook.CustomTabMainActivity.f10876k
            android.content.Intent r10 = r10.putExtra(r0, r4)
            r9.setResult(r1, r10)
            r9.finish()
            return
        Lbd:
            h.c0 r10 = new h.c0
            r0 = 5
            r10.<init>(r9, r0)
            r9.f10878c = r10
            m1.b r0 = m1.b.a(r9)
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = com.facebook.CustomTabActivity.f10867c
            r1.<init>(r2)
            r0.b(r10, r1)
        Ld3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.CustomTabMainActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (Intrinsics.areEqual(f10875j, intent.getAction())) {
            m1.b.a(this).c(new Intent(CustomTabActivity.f10868d));
            a(-1, intent);
        } else if (Intrinsics.areEqual(CustomTabActivity.f10867c, intent.getAction())) {
            a(-1, intent);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f10877b) {
            a(0, null);
        }
        this.f10877b = true;
    }
}

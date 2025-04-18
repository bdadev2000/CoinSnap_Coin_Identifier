package androidx.privacysandbox.ads.adservices.appsetid;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresExtension;

/* loaded from: classes2.dex */
public abstract class AppSetIdManager {

    @RequiresExtension
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    /* loaded from: classes2.dex */
    public static final class Api33Ext4Impl extends AppSetIdManager {
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @androidx.annotation.DoNotInline
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(@org.jetbrains.annotations.NotNull h0.g r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1
                if (r0 == 0) goto L13
                r0 = r5
                androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1 r0 = (androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.d = r1
                goto L18
            L13:
                androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1 r0 = new androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl$getAppSetId$1
                r0.<init>(r4, r5)
            L18:
                java.lang.Object r5 = r0.f20814b
                i0.a r1 = i0.a.f30806a
                int r1 = r0.d
                r2 = 1
                if (r1 == 0) goto L5c
                if (r1 != r2) goto L54
                java.lang.Object r0 = r0.f20813a
                androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager$Api33Ext4Impl r0 = (androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager.Api33Ext4Impl) r0
                kotlin.jvm.internal.q.m(r5)
                android.adservices.appsetid.AppSetId r5 = androidx.compose.foundation.text.input.internal.e.h(r5)
                r0.getClass()
                int r0 = androidx.compose.foundation.text.input.internal.e.a(r5)
                java.lang.String r1 = "response.id"
                if (r0 != r2) goto L46
                androidx.privacysandbox.ads.adservices.appsetid.AppSetId r0 = new androidx.privacysandbox.ads.adservices.appsetid.AppSetId
                java.lang.String r5 = androidx.compose.foundation.text.input.internal.e.r(r5)
                p0.a.r(r5, r1)
                r0.<init>(r5, r2)
                goto L53
            L46:
                androidx.privacysandbox.ads.adservices.appsetid.AppSetId r0 = new androidx.privacysandbox.ads.adservices.appsetid.AppSetId
                java.lang.String r5 = androidx.compose.foundation.text.input.internal.e.r(r5)
                p0.a.r(r5, r1)
                r1 = 2
                r0.<init>(r5, r1)
            L53:
                return r0
            L54:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L5c:
                kotlin.jvm.internal.q.m(r5)
                r0.f20813a = r4
                r0.d = r2
                b1.l r5 = new b1.l
                h0.g r0 = b1.f0.r(r0)
                r5.<init>(r2, r0)
                r5.p()
                androidx.arch.core.executor.a r0 = new androidx.arch.core.executor.a
                r1 = 5
                r0.<init>(r1)
                android.os.OutcomeReceiver r5 = androidx.core.os.OutcomeReceiverKt.a(r5)
                androidx.compose.foundation.text.input.a.w(r0, r5)
                r5 = 0
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager.Api33Ext4Impl.a(h0.g):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }
}

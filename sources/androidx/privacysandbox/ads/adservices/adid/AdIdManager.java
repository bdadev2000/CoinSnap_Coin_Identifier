package androidx.privacysandbox.ads.adservices.adid;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresExtension;

/* loaded from: classes3.dex */
public abstract class AdIdManager {

    @RequiresExtension
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    /* loaded from: classes3.dex */
    public static final class Api33Ext4Impl extends AdIdManager {
        /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @androidx.annotation.RequiresPermission
        @androidx.annotation.DoNotInline
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(@org.jetbrains.annotations.NotNull h0.g r5) {
            /*
                r4 = this;
                boolean r0 = r5 instanceof androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1
                if (r0 == 0) goto L13
                r0 = r5
                androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1 r0 = (androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1) r0
                int r1 = r0.d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.d = r1
                goto L18
            L13:
                androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1 r0 = new androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$getAdId$1
                r0.<init>(r4, r5)
            L18:
                java.lang.Object r5 = r0.f20806b
                i0.a r1 = i0.a.f30806a
                int r1 = r0.d
                r2 = 1
                if (r1 == 0) goto L4c
                if (r1 != r2) goto L44
                java.lang.Object r0 = r0.f20805a
                androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl r0 = (androidx.privacysandbox.ads.adservices.adid.AdIdManager.Api33Ext4Impl) r0
                kotlin.jvm.internal.q.m(r5)
                android.adservices.adid.AdId r5 = androidx.compose.foundation.text.input.internal.e.f(r5)
                r0.getClass()
                androidx.privacysandbox.ads.adservices.adid.AdId r0 = new androidx.privacysandbox.ads.adservices.adid.AdId
                java.lang.String r1 = androidx.compose.foundation.text.input.internal.e.q(r5)
                java.lang.String r2 = "response.adId"
                p0.a.r(r1, r2)
                boolean r5 = androidx.compose.foundation.text.input.internal.e.v(r5)
                r0.<init>(r1, r5)
                return r0
            L44:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L4c:
                kotlin.jvm.internal.q.m(r5)
                r0.f20805a = r4
                r0.d = r2
                b1.l r5 = new b1.l
                h0.g r0 = b1.f0.r(r0)
                r5.<init>(r2, r0)
                r5.p()
                androidx.arch.core.executor.a r0 = new androidx.arch.core.executor.a
                r1 = 2
                r0.<init>(r1)
                android.os.OutcomeReceiver r5 = androidx.core.os.OutcomeReceiverKt.a(r5)
                androidx.compose.foundation.text.input.a.w(r0, r5)
                r5 = 0
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adid.AdIdManager.Api33Ext4Impl.a(h0.g):java.lang.Object");
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
    }
}

package androidx.privacysandbox.ads.adservices.adselection;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.compose.foundation.text.input.internal.e;
import b1.f0;
import b1.l;
import h0.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class AdSelectionManager {

    @RequiresExtension
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    /* loaded from: classes3.dex */
    public static final class Api33Ext4Impl extends AdSelectionManager {
        @RequiresPermission
        @DoNotInline
        @Nullable
        public Object a(@NotNull ReportImpressionRequest reportImpressionRequest, @NotNull g gVar) {
            new l(1, f0.r(gVar)).p();
            e.C();
            reportImpressionRequest.getClass();
            e.B();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @androidx.annotation.RequiresPermission
        @androidx.annotation.DoNotInline
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object b(@org.jetbrains.annotations.NotNull androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig r5, @org.jetbrains.annotations.NotNull h0.g r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1 r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1) r0
                int r1 = r0.f20810c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f20810c = r1
                goto L18
            L13:
                androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1 r0 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager$Api33Ext4Impl$selectAds$1
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f20808a
                i0.a r1 = i0.a.f30806a
                int r0 = r0.f20810c
                r1 = 0
                if (r0 == 0) goto L33
                r5 = 1
                if (r0 != r5) goto L2b
                kotlin.jvm.internal.q.m(r6)
                androidx.compose.foundation.text.input.internal.e.g(r6)
                throw r1
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L33:
                kotlin.jvm.internal.q.m(r6)
                androidx.compose.foundation.text.input.internal.e.B()
                r5.getClass()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager.Api33Ext4Impl.b(androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig, h0.g):java.lang.Object");
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
    }
}

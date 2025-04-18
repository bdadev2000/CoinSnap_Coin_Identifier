package androidx.privacysandbox.ads.adservices.java.adselection;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome;
import androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import b1.o0;
import com.google.common.util.concurrent.ListenableFuture;
import d0.b0;
import kotlin.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes.dex */
public abstract class AdSelectionManagerFutures {

    /* loaded from: classes.dex */
    public static final class Api33Ext4JavaImpl extends AdSelectionManagerFutures {
        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<b0> a(@NotNull ReportImpressionRequest reportImpressionRequest) {
            a.s(reportImpressionRequest, "reportImpressionRequest");
            return CoroutineAdapterKt.a(e.f(a.c(o0.f22355a), null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1(this, reportImpressionRequest, null), 3));
        }

        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<AdSelectionOutcome> b(@NotNull AdSelectionConfig adSelectionConfig) {
            a.s(adSelectionConfig, "adSelectionConfig");
            return CoroutineAdapterKt.a(e.f(a.c(o0.f22355a), null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1(this, adSelectionConfig, null), 3));
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
    }
}

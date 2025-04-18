package androidx.privacysandbox.ads.adservices.java.adid;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.adid.AdId;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import b1.o0;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes2.dex */
public abstract class AdIdManagerFutures {

    /* loaded from: classes2.dex */
    public static final class Api33Ext4JavaImpl extends AdIdManagerFutures {
        @RequiresPermission
        @DoNotInline
        @NotNull
        public ListenableFuture<AdId> a() {
            return CoroutineAdapterKt.a(e.f(a.c(o0.f22355a), null, new AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1(this, null), 3));
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }
}

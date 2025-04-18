package androidx.privacysandbox.ads.adservices.java.appsetid;

import androidx.annotation.DoNotInline;
import androidx.privacysandbox.ads.adservices.appsetid.AppSetId;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import b1.o0;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes2.dex */
public abstract class AppSetIdManagerFutures {

    /* loaded from: classes2.dex */
    public static final class Api33Ext4JavaImpl extends AppSetIdManagerFutures {
        @DoNotInline
        @NotNull
        public ListenableFuture<AppSetId> a() {
            return CoroutineAdapterKt.a(e.f(a.c(o0.f22355a), null, new AppSetIdManagerFutures$Api33Ext4JavaImpl$getAppSetIdAsync$1(this, null), 3));
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }
}

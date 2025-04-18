package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import b1.j0;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public final class CoroutineAdapterKt {
    public static ListenableFuture a(j0 j0Var) {
        return CallbackToFutureAdapter.a(new a(0, j0Var, "Deferred.asListenableFuture"));
    }
}

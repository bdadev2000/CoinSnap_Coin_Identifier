package com.glority.network;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.network.NetworkChangedRequest;
import com.glority.android.core.route.network.PingServerRequest;
import com.glority.android.core.utils.data.DiffLiveData;
import com.glority.network.model.NetworkMode;
import com.glority.utils.device.NetworkUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: NetworkTracker.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000e\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0003J\b\u0010\u0013\u001a\u00020\u0012H\u0003J\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\u0006\u0010\u0017\u001a\u00020\u000fJ\u0006\u0010\u0018\u001a\u00020\u000fR\u0016\u0010\u0006\u001a\u00020\u00078BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/glority/network/NetworkTracker;", "Landroidx/lifecycle/Observer;", "Lcom/glority/network/model/NetworkMode;", "builder", "Lcom/glority/network/NetworkTracker$Builder;", "(Lcom/glority/network/NetworkTracker$Builder;)V", "delayGap", "", "getDelayGap", "()I", "isReconnecting", "Ljava/util/concurrent/atomic/AtomicBoolean;", "retryPolicy", "Lcom/glority/network/RetryPolicy;", "doReconnect", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isApiAvailable", "", "isPingAvailable", "onChanged", "mode", "reconnect", "start", "stop", "Builder", "Companion", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class NetworkTracker implements Observer<NetworkMode> {
    private static final int MAX_DELAY_GAP = 15;
    private static final String TAG = "NetworkTracker";
    private int delayGap;
    private final AtomicBoolean isReconnecting;
    private final RetryPolicy retryPolicy;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final DiffLiveData<NetworkMode> networkMode = new DiffLiveData<>(NetworkMode.NORMAL);
    private static final String PUBLIC_SERVER = AppContext.INSTANCE.getConfig("PING_HOST");

    /* compiled from: NetworkTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RetryPolicy.values().length];
            try {
                iArr[RetryPolicy.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RetryPolicy.INCREASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ NetworkTracker(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    private NetworkTracker(Builder builder) {
        this.isReconnecting = new AtomicBoolean(false);
        this.retryPolicy = builder.getRetryPolicy();
        this.delayGap = 3;
    }

    private final int getDelayGap() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.retryPolicy.ordinal()];
        if (i == 1) {
            return 15;
        }
        if (i == 2) {
            int i2 = this.delayGap;
            if (i2 >= 15) {
                return 15;
            }
            this.delayGap = i2 + 2;
            return i2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void start() {
        networkMode.observeForever(this);
    }

    public final void stop() {
        networkMode.removeObserver(this);
    }

    @Override // androidx.lifecycle.Observer
    public void onChanged(NetworkMode mode) {
        Log.d(TAG, "on ServerMode changed: " + mode);
        if (mode != null) {
            new NetworkChangedRequest(mode.getValue()).post();
            if (mode != NetworkMode.NORMAL) {
                reconnect();
            }
        }
    }

    private final void reconnect() {
        if (this.isReconnecting.compareAndSet(false, true)) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new NetworkTracker$reconnect$1(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object doReconnect(kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.network.NetworkTracker.doReconnect(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final boolean isPingAvailable() {
        return NetworkUtils.isAvailableByPing(PUBLIC_SERVER);
    }

    private final boolean isApiAvailable() {
        return Intrinsics.areEqual((Object) new PingServerRequest().toResult(), (Object) true);
    }

    /* compiled from: NetworkTracker.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/glority/network/NetworkTracker$Builder;", "", "()V", "retryPolicy", "Lcom/glority/network/RetryPolicy;", "getRetryPolicy", "()Lcom/glority/network/RetryPolicy;", "setRetryPolicy", "(Lcom/glority/network/RetryPolicy;)V", "build", "Lcom/glority/network/NetworkTracker;", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes9.dex */
    public static final class Builder {
        private RetryPolicy retryPolicy = RetryPolicy.DEFAULT;

        public final RetryPolicy getRetryPolicy() {
            return this.retryPolicy;
        }

        public final void setRetryPolicy(RetryPolicy retryPolicy) {
            Intrinsics.checkNotNullParameter(retryPolicy, "<set-?>");
            this.retryPolicy = retryPolicy;
        }

        public final Builder retryPolicy(RetryPolicy retryPolicy) {
            Intrinsics.checkNotNullParameter(retryPolicy, "retryPolicy");
            this.retryPolicy = retryPolicy;
            return this;
        }

        public final NetworkTracker build() {
            return new NetworkTracker(this, null);
        }
    }

    /* compiled from: NetworkTracker.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/glority/network/NetworkTracker$Companion;", "", "()V", "MAX_DELAY_GAP", "", "PUBLIC_SERVER", "", "TAG", "networkMode", "Lcom/glority/android/core/utils/data/DiffLiveData;", "Lcom/glority/network/model/NetworkMode;", "getNetworkMode", "()Lcom/glority/android/core/utils/data/DiffLiveData;", "isNetworkAvailable", "", "isServerAvailable", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DiffLiveData<NetworkMode> getNetworkMode() {
            return NetworkTracker.networkMode;
        }

        public final boolean isServerAvailable() {
            return getNetworkMode().getValue() == NetworkMode.NORMAL;
        }

        public final boolean isNetworkAvailable() {
            return isServerAvailable() && NetworkUtils.isConnected();
        }
    }
}

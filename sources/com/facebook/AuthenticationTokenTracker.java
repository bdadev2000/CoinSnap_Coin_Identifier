package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public abstract class AuthenticationTokenTracker {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AuthenticationTokenTracker";

    @NotNull
    private final LocalBroadcastManager broadcastManager;
    private boolean isTracking;

    @NotNull
    private final BroadcastReceiver receiver;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public final class CurrentAuthenticationTokenBroadcastReceiver extends BroadcastReceiver {
        final /* synthetic */ AuthenticationTokenTracker this$0;

        public CurrentAuthenticationTokenBroadcastReceiver(AuthenticationTokenTracker authenticationTokenTracker) {
            p0.a.s(authenticationTokenTracker, "this$0");
            this.this$0 = authenticationTokenTracker;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@NotNull Context context, @NotNull Intent intent) {
            p0.a.s(context, "context");
            p0.a.s(intent, SDKConstants.PARAM_INTENT);
            if (p0.a.g(AuthenticationTokenManager.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED, intent.getAction())) {
                Utility utility = Utility.INSTANCE;
                Utility.logd(AuthenticationTokenTracker.TAG, "AuthenticationTokenChanged");
                this.this$0.onCurrentAuthenticationTokenChanged((AuthenticationToken) intent.getParcelableExtra(AuthenticationTokenManager.EXTRA_OLD_AUTHENTICATION_TOKEN), (AuthenticationToken) intent.getParcelableExtra(AuthenticationTokenManager.EXTRA_NEW_AUTHENTICATION_TOKEN));
            }
        }
    }

    public AuthenticationTokenTracker() {
        Validate.sdkInitialized();
        this.receiver = new CurrentAuthenticationTokenBroadcastReceiver(this);
        LocalBroadcastManager a2 = LocalBroadcastManager.a(FacebookSdk.getApplicationContext());
        p0.a.r(a2, "getInstance(FacebookSdk.getApplicationContext())");
        this.broadcastManager = a2;
        startTracking();
    }

    private final void addBroadcastReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(AuthenticationTokenManager.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED);
        this.broadcastManager.b(this.receiver, intentFilter);
    }

    public final boolean isTracking() {
        return this.isTracking;
    }

    public abstract void onCurrentAuthenticationTokenChanged(@Nullable AuthenticationToken authenticationToken, @Nullable AuthenticationToken authenticationToken2);

    public final void startTracking() {
        if (this.isTracking) {
            return;
        }
        addBroadcastReceiver();
        this.isTracking = true;
    }

    public final void stopTracking() {
        if (this.isTracking) {
            this.broadcastManager.d(this.receiver);
            this.isTracking = false;
        }
    }
}

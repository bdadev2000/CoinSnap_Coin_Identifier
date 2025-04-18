package com.facebook.internal;

import android.content.Intent;
import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class CallbackManagerImpl implements CallbackManager {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Map<Integer, Callback> staticCallbacks = new HashMap();

    @NotNull
    private final Map<Integer, Callback> callbacks = new HashMap();

    /* loaded from: classes2.dex */
    public interface Callback {
        boolean onActivityResult(int i2, @Nullable Intent intent);
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        private final synchronized Callback getStaticCallback(int i2) {
            return (Callback) CallbackManagerImpl.staticCallbacks.get(Integer.valueOf(i2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean runStaticCallback(int i2, int i3, Intent intent) {
            Callback staticCallback = getStaticCallback(i2);
            if (staticCallback == null) {
                return false;
            }
            return staticCallback.onActivityResult(i3, intent);
        }

        public final synchronized void registerStaticCallback(int i2, @NotNull Callback callback) {
            p0.a.s(callback, "callback");
            if (CallbackManagerImpl.staticCallbacks.containsKey(Integer.valueOf(i2))) {
                return;
            }
            CallbackManagerImpl.staticCallbacks.put(Integer.valueOf(i2), callback);
        }
    }

    /* loaded from: classes2.dex */
    public enum RequestCodeOffset {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8),
        GamingFriendFinder(9),
        GamingGroupIntegration(10),
        Referral(11),
        GamingContextCreate(12),
        GamingContextSwitch(13),
        GamingContextChoose(14),
        TournamentShareDialog(15),
        TournamentJoinDialog(16);

        private final int offset;

        RequestCodeOffset(int i2) {
            this.offset = i2;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static RequestCodeOffset[] valuesCustom() {
            RequestCodeOffset[] valuesCustom = values();
            return (RequestCodeOffset[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final int toRequestCode() {
            return FacebookSdk.getCallbackRequestCodeOffset() + this.offset;
        }
    }

    public static final synchronized void registerStaticCallback(int i2, @NotNull Callback callback) {
        synchronized (CallbackManagerImpl.class) {
            Companion.registerStaticCallback(i2, callback);
        }
    }

    @Override // com.facebook.CallbackManager
    public boolean onActivityResult(int i2, int i3, @Nullable Intent intent) {
        Callback callback = this.callbacks.get(Integer.valueOf(i2));
        return callback == null ? Companion.runStaticCallback(i2, i3, intent) : callback.onActivityResult(i3, intent);
    }

    public final void registerCallback(int i2, @NotNull Callback callback) {
        p0.a.s(callback, "callback");
        this.callbacks.put(Integer.valueOf(i2), callback);
    }

    public final void unregisterCallback(int i2) {
        this.callbacks.remove(Integer.valueOf(i2));
    }
}

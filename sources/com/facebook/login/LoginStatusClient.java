package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PlatformServiceClient;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class LoginStatusClient extends PlatformServiceClient {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_TOAST_DURATION_MS = 5000;

    @NotNull
    private final String graphApiVersion;

    @NotNull
    private final String loggerRef;
    private final long toastDurationMs;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @NotNull
        public final LoginStatusClient newInstance$facebook_common_release(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, long j2, @Nullable String str4) {
            p0.a.s(context, "context");
            p0.a.s(str, "applicationId");
            p0.a.s(str2, "loggerRef");
            p0.a.s(str3, "graphApiVersion");
            return new LoginStatusClient(context, str, str2, str3, j2, str4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginStatusClient(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, long j2, @Nullable String str4) {
        super(context, NativeProtocol.MESSAGE_GET_LOGIN_STATUS_REQUEST, NativeProtocol.MESSAGE_GET_LOGIN_STATUS_REPLY, NativeProtocol.PROTOCOL_VERSION_20170411, str, str4);
        p0.a.s(context, "context");
        p0.a.s(str, "applicationId");
        p0.a.s(str2, "loggerRef");
        p0.a.s(str3, "graphApiVersion");
        this.loggerRef = str2;
        this.graphApiVersion = str3;
        this.toastDurationMs = j2;
    }

    @Override // com.facebook.internal.PlatformServiceClient
    public void populateRequestBundle(@NotNull Bundle bundle) {
        p0.a.s(bundle, "data");
        bundle.putString(NativeProtocol.EXTRA_LOGGER_REF, this.loggerRef);
        bundle.putString(NativeProtocol.EXTRA_GRAPH_API_VERSION, this.graphApiVersion);
        bundle.putLong(NativeProtocol.EXTRA_TOAST_DURATION_MS, this.toastDurationMs);
    }
}

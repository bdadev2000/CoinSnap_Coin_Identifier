package com.facebook.login;

import android.net.Uri;
import b1.f0;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.LoginClient;
import d0.h;
import java.util.Collection;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import x0.n;

/* loaded from: classes.dex */
public final class DeviceLoginManager extends LoginManager {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final h instance$delegate = f0.t(DeviceLoginManager$Companion$instance$2.INSTANCE);

    @Nullable
    private String deviceAuthTargetUserId;

    @Nullable
    private Uri deviceRedirectUri;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ n[] $$delegatedProperties;

        static {
            a0 a0Var = new a0(kotlin.jvm.internal.h.NO_RECEIVER, g0.a(Companion.class).a(), "instance", "getInstance()Lcom/facebook/login/DeviceLoginManager;", 0);
            g0.f30932a.getClass();
            $$delegatedProperties = new n[]{a0Var};
        }

        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        @NotNull
        public final DeviceLoginManager getInstance() {
            return (DeviceLoginManager) DeviceLoginManager.access$getInstance$delegate$cp().getValue();
        }
    }

    public static final /* synthetic */ h access$getInstance$delegate$cp() {
        if (CrashShieldHandler.isObjectCrashing(DeviceLoginManager.class)) {
            return null;
        }
        try {
            return instance$delegate;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, DeviceLoginManager.class);
            return null;
        }
    }

    @Override // com.facebook.login.LoginManager
    @NotNull
    public LoginClient.Request createLoginRequest(@Nullable Collection<String> collection) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            LoginClient.Request createLoginRequest = super.createLoginRequest(collection);
            Uri uri = this.deviceRedirectUri;
            if (uri != null) {
                createLoginRequest.setDeviceRedirectUriString(uri.toString());
            }
            String str = this.deviceAuthTargetUserId;
            if (str != null) {
                createLoginRequest.setDeviceAuthTargetUserId(str);
            }
            return createLoginRequest;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @Nullable
    public final String getDeviceAuthTargetUserId() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.deviceAuthTargetUserId;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @Nullable
    public final Uri getDeviceRedirectUri() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.deviceRedirectUri;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final void setDeviceAuthTargetUserId(@Nullable String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.deviceAuthTargetUserId = str;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setDeviceRedirectUri(@Nullable Uri uri) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.deviceRedirectUri = uri;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}

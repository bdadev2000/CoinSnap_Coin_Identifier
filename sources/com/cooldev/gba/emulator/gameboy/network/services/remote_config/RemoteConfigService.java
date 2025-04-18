package com.cooldev.gba.emulator.gameboy.network.services.remote_config;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.ktx.RemoteConfigKt;
import d0.b0;
import h0.g;
import h0.n;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class RemoteConfigService {

    @NotNull
    private final AdSettingsConfig adSettingsConfig;

    @NotNull
    private final FeatureFlagsConfig featureFlagsConfig;

    @NotNull
    private final PaywallSettingsConfig paywallSettingsConfig;

    @NotNull
    private final FirebaseRemoteConfig remoteConfig;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String LOG_TAG = "RemoteConfigService";

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public RemoteConfigService() {
        FirebaseRemoteConfig remoteConfig = RemoteConfigKt.getRemoteConfig(Firebase.INSTANCE);
        remoteConfig.setConfigSettingsAsync(RemoteConfigKt.remoteConfigSettings(RemoteConfigService$remoteConfig$1$settings$1.INSTANCE));
        remoteConfig.setDefaultsAsync(R.xml.remote_config_defaults);
        this.remoteConfig = remoteConfig;
        this.featureFlagsConfig = new FeatureFlagsConfig(this);
        this.adSettingsConfig = new AdSettingsConfig(this);
        this.paywallSettingsConfig = new PaywallSettingsConfig(this);
    }

    @Nullable
    public final Object fetchAndActivate(@NotNull g gVar) {
        final n nVar = new n(f0.r(gVar));
        this.remoteConfig.fetchAndActivate().addOnCompleteListener(new OnCompleteListener() { // from class: com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService$fetchAndActivate$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(@NotNull Task<Boolean> task) {
                String str;
                String str2;
                a.s(task, "task");
                if (task.isSuccessful()) {
                    str2 = RemoteConfigService.LOG_TAG;
                    Log.d(str2, "Config fetch and activation succeeded");
                } else {
                    Exception exception = task.getException();
                    if (exception != null) {
                        str = RemoteConfigService.LOG_TAG;
                        Log.e(str, "Config fetch failed", exception);
                    }
                }
                g.this.resumeWith(b0.f30125a);
            }
        });
        Object a2 = nVar.a();
        return a2 == i0.a.f30806a ? a2 : b0.f30125a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[Catch: Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:11:0x002f, B:12:0x0059, B:14:0x005d, B:15:0x0096, B:19:0x0068, B:21:0x006c, B:22:0x0078, B:24:0x007c, B:25:0x008a, B:27:0x008e, B:32:0x003e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[Catch: Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:11:0x002f, B:12:0x0059, B:14:0x005d, B:15:0x0096, B:19:0x0068, B:21:0x006c, B:22:0x0078, B:24:0x007c, B:25:0x008a, B:27:0x008e, B:32:0x003e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object fetchConfigValue(@org.jetbrains.annotations.NotNull java.lang.String r6, T r7, @org.jetbrains.annotations.NotNull h0.g r8) {
        /*
            r5 = this;
            java.lang.String r0 = "Fetched "
            boolean r1 = r8 instanceof com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService$fetchConfigValue$1
            if (r1 == 0) goto L15
            r1 = r8
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService$fetchConfigValue$1 r1 = (com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService$fetchConfigValue$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService$fetchConfigValue$1 r1 = new com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService$fetchConfigValue$1
            r1.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r1.result
            i0.a r2 = i0.a.f30806a
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L3b
            if (r3 != r4) goto L33
            java.lang.Object r7 = r1.L$2
            java.lang.Object r6 = r1.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r1 = r1.L$0
            com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService r1 = (com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService) r1
            kotlin.jvm.internal.q.m(r8)     // Catch: java.lang.Exception -> Lb0
            goto L59
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.jvm.internal.q.m(r8)
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r8 = r5.remoteConfig     // Catch: java.lang.Exception -> Lb0
            com.google.android.gms.tasks.Task r8 = r8.fetchAndActivate()     // Catch: java.lang.Exception -> Lb0
            java.lang.String r3 = "fetchAndActivate(...)"
            p0.a.r(r8, r3)     // Catch: java.lang.Exception -> Lb0
            r1.L$0 = r5     // Catch: java.lang.Exception -> Lb0
            r1.L$1 = r6     // Catch: java.lang.Exception -> Lb0
            r1.L$2 = r7     // Catch: java.lang.Exception -> Lb0
            r1.label = r4     // Catch: java.lang.Exception -> Lb0
            java.lang.Object r8 = e1.t0.e(r8, r1)     // Catch: java.lang.Exception -> Lb0
            if (r8 != r2) goto L58
            return r2
        L58:
            r1 = r5
        L59:
            boolean r8 = r7 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> Lb0
            if (r8 == 0) goto L68
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r8 = r1.remoteConfig     // Catch: java.lang.Exception -> Lb0
            boolean r8 = r8.getBoolean(r6)     // Catch: java.lang.Exception -> Lb0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Exception -> Lb0
            goto L96
        L68:
            boolean r8 = r7 instanceof java.lang.Long     // Catch: java.lang.Exception -> Lb0
            if (r8 == 0) goto L78
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r8 = r1.remoteConfig     // Catch: java.lang.Exception -> Lb0
            long r1 = r8.getLong(r6)     // Catch: java.lang.Exception -> Lb0
            java.lang.Long r8 = new java.lang.Long     // Catch: java.lang.Exception -> Lb0
            r8.<init>(r1)     // Catch: java.lang.Exception -> Lb0
            goto L96
        L78:
            boolean r8 = r7 instanceof java.lang.Integer     // Catch: java.lang.Exception -> Lb0
            if (r8 == 0) goto L8a
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r8 = r1.remoteConfig     // Catch: java.lang.Exception -> Lb0
            long r1 = r8.getLong(r6)     // Catch: java.lang.Exception -> Lb0
            int r8 = (int) r1     // Catch: java.lang.Exception -> Lb0
            java.lang.Integer r1 = new java.lang.Integer     // Catch: java.lang.Exception -> Lb0
            r1.<init>(r8)     // Catch: java.lang.Exception -> Lb0
            r8 = r1
            goto L96
        L8a:
            boolean r8 = r7 instanceof java.lang.String     // Catch: java.lang.Exception -> Lb0
            if (r8 == 0) goto L95
            com.google.firebase.remoteconfig.FirebaseRemoteConfig r8 = r1.remoteConfig     // Catch: java.lang.Exception -> Lb0
            java.lang.String r8 = r8.getString(r6)     // Catch: java.lang.Exception -> Lb0
            goto L96
        L95:
            r8 = r7
        L96:
            java.lang.String r1 = com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService.LOG_TAG     // Catch: java.lang.Exception -> Lb0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb0
            r2.<init>(r0)     // Catch: java.lang.Exception -> Lb0
            r2.append(r6)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r0 = ": "
            r2.append(r0)     // Catch: java.lang.Exception -> Lb0
            r2.append(r8)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> Lb0
            android.util.Log.d(r1, r0)     // Catch: java.lang.Exception -> Lb0
            goto Lcc
        Lb0:
            java.lang.String r8 = com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService.LOG_TAG
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error fetching "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = ", returning default value: "
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            android.util.Log.e(r8, r6)
            r8 = r7
        Lcc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService.fetchConfigValue(java.lang.String, java.lang.Object, h0.g):java.lang.Object");
    }

    @NotNull
    public final AdSettingsConfig getAdSettingsConfig() {
        return this.adSettingsConfig;
    }

    @NotNull
    public final FeatureFlagsConfig getFeatureFlagsConfig() {
        return this.featureFlagsConfig;
    }

    @NotNull
    public final PaywallSettingsConfig getPaywallSettingsConfig() {
        return this.paywallSettingsConfig;
    }
}

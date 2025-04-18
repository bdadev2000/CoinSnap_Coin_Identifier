package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zacd implements OnCompleteListener {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey zac;
    private final long zad;
    private final long zae;

    public zacd(GoogleApiManager googleApiManager, int i10, ApiKey apiKey, long j3, long j10, @Nullable String str, @Nullable String str2) {
        this.zaa = googleApiManager;
        this.zab = i10;
        this.zac = apiKey;
        this.zad = j3;
        this.zae = j10;
    }

    @Nullable
    public static zacd zaa(GoogleApiManager googleApiManager, int i10, ApiKey apiKey) {
        boolean z10;
        long j3;
        long j10;
        if (googleApiManager.zaD()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if (config != null) {
                if (config.getMethodInvocationTelemetryEnabled()) {
                    z10 = config.getMethodTimingTelemetryEnabled();
                    zabq zai = googleApiManager.zai(apiKey);
                    if (zai != null) {
                        if (zai.zaf() instanceof BaseGmsClient) {
                            BaseGmsClient baseGmsClient = (BaseGmsClient) zai.zaf();
                            if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                                ConnectionTelemetryConfiguration zab = zab(zai, baseGmsClient, i10);
                                if (zab != null) {
                                    zai.zaq();
                                    z10 = zab.getMethodTimingTelemetryEnabled();
                                } else {
                                    return null;
                                }
                            }
                        } else {
                            return null;
                        }
                    }
                } else {
                    return null;
                }
            } else {
                z10 = true;
            }
            if (z10) {
                j3 = System.currentTimeMillis();
            } else {
                j3 = 0;
            }
            if (z10) {
                j10 = SystemClock.elapsedRealtime();
            } else {
                j10 = 0;
            }
            return new zacd(googleApiManager, i10, apiKey, j3, j10, null, null);
        }
        return null;
    }

    @Nullable
    private static ConnectionTelemetryConfiguration zab(zabq zabqVar, BaseGmsClient baseGmsClient, int i10) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i10) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i10))) || zabqVar.zac() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        zabq zai;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int errorCode;
        long j3;
        long j10;
        int i13;
        if (this.zaa.zaD()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zai = this.zaa.zai(this.zac)) != null && (zai.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zai.zaf();
                boolean z11 = true;
                int i14 = 0;
                if (this.zad > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                int i15 = 100;
                if (config != null) {
                    z10 &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    i10 = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration zab = zab(zai, baseGmsClient, this.zab);
                        if (zab != null) {
                            if (!zab.getMethodTimingTelemetryEnabled() || this.zad <= 0) {
                                z11 = false;
                            }
                            maxMethodInvocationsInBatch = zab.getMaxMethodInvocationsLogged();
                            z10 = z11;
                        } else {
                            return;
                        }
                    }
                    i12 = batchPeriodMillis;
                    i11 = maxMethodInvocationsInBatch;
                } else {
                    i10 = 0;
                    i11 = 100;
                    i12 = 5000;
                }
                GoogleApiManager googleApiManager = this.zaa;
                if (task.isSuccessful()) {
                    errorCode = 0;
                } else {
                    if (!task.isCanceled()) {
                        Exception exception = task.getException();
                        if (exception instanceof ApiException) {
                            Status status = ((ApiException) exception).getStatus();
                            i15 = status.getStatusCode();
                            ConnectionResult connectionResult = status.getConnectionResult();
                            if (connectionResult != null) {
                                errorCode = connectionResult.getErrorCode();
                                i14 = i15;
                            }
                        } else {
                            i14 = 101;
                            errorCode = -1;
                        }
                    }
                    i14 = i15;
                    errorCode = -1;
                }
                if (z10) {
                    long j11 = this.zad;
                    long j12 = this.zae;
                    long currentTimeMillis = System.currentTimeMillis();
                    i13 = (int) (SystemClock.elapsedRealtime() - j12);
                    j10 = currentTimeMillis;
                    j3 = j11;
                } else {
                    j3 = 0;
                    j10 = 0;
                    i13 = -1;
                }
                googleApiManager.zaw(new MethodInvocation(this.zab, i14, errorCode, j3, j10, null, null, gCoreServiceId, i13), i10, i12, i11);
            }
        }
    }
}

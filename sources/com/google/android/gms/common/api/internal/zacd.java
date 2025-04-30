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
/* loaded from: classes2.dex */
public final class zacd implements OnCompleteListener {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey zac;
    private final long zad;
    private final long zae;

    public zacd(GoogleApiManager googleApiManager, int i9, ApiKey apiKey, long j7, long j9, @Nullable String str, @Nullable String str2) {
        this.zaa = googleApiManager;
        this.zab = i9;
        this.zac = apiKey;
        this.zad = j7;
        this.zae = j9;
    }

    @Nullable
    public static zacd zaa(GoogleApiManager googleApiManager, int i9, ApiKey apiKey) {
        boolean z8;
        long j7;
        long j9;
        if (googleApiManager.zaD()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if (config != null) {
                if (config.getMethodInvocationTelemetryEnabled()) {
                    z8 = config.getMethodTimingTelemetryEnabled();
                    zabq zai = googleApiManager.zai(apiKey);
                    if (zai != null) {
                        if (zai.zaf() instanceof BaseGmsClient) {
                            BaseGmsClient baseGmsClient = (BaseGmsClient) zai.zaf();
                            if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                                ConnectionTelemetryConfiguration zab = zab(zai, baseGmsClient, i9);
                                if (zab != null) {
                                    zai.zaq();
                                    z8 = zab.getMethodTimingTelemetryEnabled();
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
                z8 = true;
            }
            if (z8) {
                j7 = System.currentTimeMillis();
            } else {
                j7 = 0;
            }
            if (z8) {
                j9 = SystemClock.elapsedRealtime();
            } else {
                j9 = 0;
            }
            return new zacd(googleApiManager, i9, apiKey, j7, j9, null, null);
        }
        return null;
    }

    @Nullable
    private static ConnectionTelemetryConfiguration zab(zabq zabqVar, BaseGmsClient baseGmsClient, int i9) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i9) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i9))) || zabqVar.zac() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task task) {
        zabq zai;
        boolean z8;
        int i9;
        int i10;
        int i11;
        int errorCode;
        long j7;
        long j9;
        int i12;
        if (this.zaa.zaD()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zai = this.zaa.zai(this.zac)) != null && (zai.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zai.zaf();
                boolean z9 = true;
                int i13 = 0;
                if (this.zad > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                int i14 = 100;
                if (config != null) {
                    z8 &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    i9 = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration zab = zab(zai, baseGmsClient, this.zab);
                        if (zab != null) {
                            if (!zab.getMethodTimingTelemetryEnabled() || this.zad <= 0) {
                                z9 = false;
                            }
                            maxMethodInvocationsInBatch = zab.getMaxMethodInvocationsLogged();
                            z8 = z9;
                        } else {
                            return;
                        }
                    }
                    i11 = batchPeriodMillis;
                    i10 = maxMethodInvocationsInBatch;
                } else {
                    i9 = 0;
                    i10 = 100;
                    i11 = 5000;
                }
                GoogleApiManager googleApiManager = this.zaa;
                if (task.isSuccessful()) {
                    errorCode = 0;
                } else {
                    if (!task.isCanceled()) {
                        Exception exception = task.getException();
                        if (exception instanceof ApiException) {
                            Status status = ((ApiException) exception).getStatus();
                            i14 = status.getStatusCode();
                            ConnectionResult connectionResult = status.getConnectionResult();
                            if (connectionResult != null) {
                                errorCode = connectionResult.getErrorCode();
                                i13 = i14;
                            }
                        } else {
                            i13 = 101;
                            errorCode = -1;
                        }
                    }
                    i13 = i14;
                    errorCode = -1;
                }
                if (z8) {
                    long j10 = this.zad;
                    long j11 = this.zae;
                    long currentTimeMillis = System.currentTimeMillis();
                    i12 = (int) (SystemClock.elapsedRealtime() - j11);
                    j9 = currentTimeMillis;
                    j7 = j10;
                } else {
                    j7 = 0;
                    j9 = 0;
                    i12 = -1;
                }
                googleApiManager.zaw(new MethodInvocation(this.zab, i13, errorCode, j7, j9, null, null, gCoreServiceId, i12), i9, i11, i10);
            }
        }
    }
}

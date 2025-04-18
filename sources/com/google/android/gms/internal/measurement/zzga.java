package com.google.android.gms.internal.measurement;

import kotlin.text.Typography;

/* loaded from: classes3.dex */
public enum zzga implements zzjy {
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN(0),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED(1),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED(2),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED(3),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED(4),
    AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED(5);

    private final int zzh;

    zzga(int i10) {
        this.zzh = i10;
    }

    public static zzjx zzb() {
        return zzfz.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzga.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzh + " name=" + name() + Typography.greater;
    }

    @Override // com.google.android.gms.internal.measurement.zzjy
    public final int zza() {
        return this.zzh;
    }

    public static zzga zza(int i10) {
        if (i10 == 0) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_UNKNOWN;
        }
        if (i10 == 1) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_RESTRICTED;
        }
        if (i10 == 2) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_DENIED;
        }
        if (i10 == 3) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_AUTHORIZED;
        }
        if (i10 == 4) {
            return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_DETERMINED;
        }
        if (i10 != 5) {
            return null;
        }
        return AT_TRACKING_MANAGER_AUTHORIZATION_STATUS_NOT_CONFIGURED;
    }
}

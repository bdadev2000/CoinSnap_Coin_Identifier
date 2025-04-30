package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzfqz implements zzhbs {
    UNKNOWN(0),
    PROVIDENCE(1),
    INTENT_OPERATION(2),
    BROADCAST_RECEIVER(3),
    CONTENT_PROVIDER(4),
    ACTIVITY(5),
    SERVICE(6),
    BINDER(7),
    SYNC_ADAPTER(8),
    GCM_TASK(9),
    INTENT_SERVICE(10),
    SERVICE_CONNECTION(11),
    GCM_LISTENER(12),
    CALLBACKS(13),
    ALARM_LISTENER(14),
    CUSTOM_EVENT_LOOP(15),
    SENSOR_EVENT_LISTENER(16),
    BLE_SCAN_CALLBACK(17),
    BINDER_BY_INTERCEPTOR(18),
    CONTENT_OBSERVER(19),
    BACKUP_AGENT(20),
    SLICE_PROVIDER(21),
    LOCATION_LISTENER(22),
    GMS_APPLICATION(23),
    OAUTH(24),
    LOCATION_CALLBACKS(25),
    BT_ADAPTER(26),
    NETWORK_CALLBACK(27),
    JOB_SERVICE(28);

    private static final zzhbt zzD = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzfqy
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            zzfqz zzfqzVar = zzfqz.UNKNOWN;
            switch (i9) {
                case 0:
                    return zzfqz.UNKNOWN;
                case 1:
                    return zzfqz.PROVIDENCE;
                case 2:
                    return zzfqz.INTENT_OPERATION;
                case 3:
                    return zzfqz.BROADCAST_RECEIVER;
                case 4:
                    return zzfqz.CONTENT_PROVIDER;
                case 5:
                    return zzfqz.ACTIVITY;
                case 6:
                    return zzfqz.SERVICE;
                case 7:
                    return zzfqz.BINDER;
                case 8:
                    return zzfqz.SYNC_ADAPTER;
                case 9:
                    return zzfqz.GCM_TASK;
                case 10:
                    return zzfqz.INTENT_SERVICE;
                case 11:
                    return zzfqz.SERVICE_CONNECTION;
                case 12:
                    return zzfqz.GCM_LISTENER;
                case 13:
                    return zzfqz.CALLBACKS;
                case 14:
                    return zzfqz.ALARM_LISTENER;
                case 15:
                    return zzfqz.CUSTOM_EVENT_LOOP;
                case 16:
                    return zzfqz.SENSOR_EVENT_LISTENER;
                case 17:
                    return zzfqz.BLE_SCAN_CALLBACK;
                case 18:
                    return zzfqz.BINDER_BY_INTERCEPTOR;
                case 19:
                    return zzfqz.CONTENT_OBSERVER;
                case 20:
                    return zzfqz.BACKUP_AGENT;
                case 21:
                    return zzfqz.SLICE_PROVIDER;
                case 22:
                    return zzfqz.LOCATION_LISTENER;
                case 23:
                    return zzfqz.GMS_APPLICATION;
                case 24:
                    return zzfqz.OAUTH;
                case 25:
                    return zzfqz.LOCATION_CALLBACKS;
                case 26:
                    return zzfqz.BT_ADAPTER;
                case 27:
                    return zzfqz.NETWORK_CALLBACK;
                case 28:
                    return zzfqz.JOB_SERVICE;
                default:
                    return null;
            }
        }
    };
    private final int zzF;

    zzfqz(int i9) {
        this.zzF = i9;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzF);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzF;
    }
}

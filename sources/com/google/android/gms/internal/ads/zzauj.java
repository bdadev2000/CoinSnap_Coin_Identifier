package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentTransaction;

/* loaded from: classes2.dex */
public enum zzauj implements zzhbs {
    ERROR_ENCODE_SIZE_FAIL(1),
    ERROR_UNKNOWN(3),
    ERROR_NO_SIGNALS(5),
    ERROR_ENCRYPTION(7),
    ERROR_MEMORY(9),
    ERROR_SIMULATOR(11),
    ERROR_SERVICE(13),
    ERROR_THREAD(15),
    ERROR_COLLECTION_TIMEOUT(17),
    PSN_WEB64_FAIL(2),
    PSN_DECRYPT_SIZE_FAIL(4),
    PSN_MD5_CHECK_FAIL(8),
    PSN_MD5_SIZE_FAIL(16),
    PSN_MD5_FAIL(32),
    PSN_DECODE_FAIL(64),
    PSN_SALT_FAIL(128),
    PSN_BITSLICER_FAIL(NotificationCompat.FLAG_LOCAL_ONLY),
    PSN_REQUEST_TYPE_FAIL(512),
    PSN_INVALID_ERROR_CODE(1024),
    PSN_TIMESTAMP_EXPIRED(2048),
    PSN_ENCODE_SIZE_FAIL(4096),
    PSN_BLANK_VALUE(FragmentTransaction.TRANSIT_EXIT_MASK),
    PSN_INITIALIZATION_FAIL(16384),
    PSN_GASS_CLIENT_FAIL(32768),
    PSN_SIGNALS_TIMEOUT(65536),
    PSN_TINK_FAIL(131072);

    private static final zzhbt zzA = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzaui
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            zzauj zzaujVar = zzauj.ERROR_ENCODE_SIZE_FAIL;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 4) {
                            if (i9 != 5) {
                                if (i9 != 7) {
                                    if (i9 != 8) {
                                        if (i9 != 9) {
                                            switch (i9) {
                                                case 11:
                                                    return zzauj.ERROR_SIMULATOR;
                                                case 13:
                                                    return zzauj.ERROR_SERVICE;
                                                case 32:
                                                    return zzauj.PSN_MD5_FAIL;
                                                case 64:
                                                    return zzauj.PSN_DECODE_FAIL;
                                                case 128:
                                                    return zzauj.PSN_SALT_FAIL;
                                                case NotificationCompat.FLAG_LOCAL_ONLY /* 256 */:
                                                    return zzauj.PSN_BITSLICER_FAIL;
                                                case 512:
                                                    return zzauj.PSN_REQUEST_TYPE_FAIL;
                                                case 1024:
                                                    return zzauj.PSN_INVALID_ERROR_CODE;
                                                case 2048:
                                                    return zzauj.PSN_TIMESTAMP_EXPIRED;
                                                case 4096:
                                                    return zzauj.PSN_ENCODE_SIZE_FAIL;
                                                case FragmentTransaction.TRANSIT_EXIT_MASK /* 8192 */:
                                                    return zzauj.PSN_BLANK_VALUE;
                                                case 16384:
                                                    return zzauj.PSN_INITIALIZATION_FAIL;
                                                case 32768:
                                                    return zzauj.PSN_GASS_CLIENT_FAIL;
                                                case 65536:
                                                    return zzauj.PSN_SIGNALS_TIMEOUT;
                                                case 131072:
                                                    return zzauj.PSN_TINK_FAIL;
                                                default:
                                                    switch (i9) {
                                                        case 15:
                                                            return zzauj.ERROR_THREAD;
                                                        case 16:
                                                            return zzauj.PSN_MD5_SIZE_FAIL;
                                                        case 17:
                                                            return zzauj.ERROR_COLLECTION_TIMEOUT;
                                                        default:
                                                            return null;
                                                    }
                                            }
                                        }
                                        return zzauj.ERROR_MEMORY;
                                    }
                                    return zzauj.PSN_MD5_CHECK_FAIL;
                                }
                                return zzauj.ERROR_ENCRYPTION;
                            }
                            return zzauj.ERROR_NO_SIGNALS;
                        }
                        return zzauj.PSN_DECRYPT_SIZE_FAIL;
                    }
                    return zzauj.ERROR_UNKNOWN;
                }
                return zzauj.PSN_WEB64_FAIL;
            }
            return zzauj.ERROR_ENCODE_SIZE_FAIL;
        }
    };
    private final int zzC;

    zzauj(int i9) {
        this.zzC = i9;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzC);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzC;
    }
}

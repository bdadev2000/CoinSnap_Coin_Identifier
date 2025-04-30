package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* loaded from: classes2.dex */
final class zzc extends zzb {
    private final Context zza;

    public zzc(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean z8;
        try {
            z8 = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.zza);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e4) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to get isAdIdFakeForDebugLogging", e4);
            z8 = false;
        }
        com.google.android.gms.ads.internal.util.client.zzl.zzj(z8);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Update ad debug logging enablement as " + z8);
    }
}

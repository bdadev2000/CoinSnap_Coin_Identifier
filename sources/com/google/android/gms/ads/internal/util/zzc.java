package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* loaded from: classes3.dex */
final class zzc extends zzb {
    private final Context zza;

    public zzc(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        boolean z10;
        try {
            z10 = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(this.zza);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to get isAdIdFakeForDebugLogging", e2);
            z10 = false;
        }
        com.google.android.gms.ads.internal.util.client.zzl.zzj(z10);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Update ad debug logging enablement as " + z10);
    }
}

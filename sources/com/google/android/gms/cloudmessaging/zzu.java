package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;

/* loaded from: classes3.dex */
final class zzu extends zzs {
    public zzu(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    public final void zza(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(DataSchemeDataSource.SCHEME_DATA);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        zzd(bundle2);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    public final boolean zzb() {
        return false;
    }
}

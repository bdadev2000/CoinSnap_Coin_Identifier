package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.Api;

/* loaded from: classes3.dex */
final class zzdy extends zzea {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzdy(byte[] bArr, int i2, int i3, boolean z2, zzdx zzdxVar) {
        super(null);
        this.zze = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i2) throws zzff {
        int i3 = this.zze;
        this.zze = 0;
        int i4 = this.zzc + this.zzd;
        this.zzc = i4;
        if (i4 > 0) {
            this.zzd = i4;
            this.zzc = i4 - i4;
        } else {
            this.zzd = 0;
        }
        return i3;
    }
}

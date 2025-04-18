package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class zzge extends zzfz {

    @Nullable
    private zzgm zza;

    @Nullable
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzge() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        int i4 = this.zzd;
        if (i4 == 0) {
            return -1;
        }
        int min = Math.min(i3, i4);
        byte[] bArr2 = this.zzb;
        int i5 = zzeu.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i2, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(zzgm zzgmVar) throws IOException {
        zzi(zzgmVar);
        this.zza = zzgmVar;
        Uri normalizeScheme = zzgmVar.zza.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zzdi.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i2 = zzeu.zza;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw zzbo.zzb("Unexpected URI format: ".concat(String.valueOf(normalizeScheme)), null);
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw zzbo.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
            }
        } else {
            this.zzb = URLDecoder.decode(str, zzfxo.zza.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = zzgmVar.zze;
        int length = this.zzb.length;
        if (j2 > length) {
            this.zzb = null;
            throw new zzgh(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i3 = (int) j2;
        this.zzc = i3;
        int i4 = length - i3;
        this.zzd = i4;
        long j3 = zzgmVar.zzf;
        if (j3 != -1) {
            this.zzd = (int) Math.min(i4, j3);
        }
        zzj(zzgmVar);
        long j4 = zzgmVar.zzf;
        return j4 != -1 ? j4 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    @Nullable
    public final Uri zzc() {
        zzgm zzgmVar = this.zza;
        if (zzgmVar != null) {
            return zzgmVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}

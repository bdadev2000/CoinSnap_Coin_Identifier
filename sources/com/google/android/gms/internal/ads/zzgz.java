package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.IOException;
import java.net.URLDecoder;

/* loaded from: classes2.dex */
public final class zzgz extends zzgv {

    @Nullable
    private zzhh zza;

    @Nullable
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzgz() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.zzd;
        if (i11 == 0) {
            return -1;
        }
        int min = Math.min(i10, i11);
        byte[] bArr2 = this.zzb;
        int i12 = zzgd.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i9, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhh zzhhVar) throws IOException {
        zzi(zzhhVar);
        this.zza = zzhhVar;
        Uri normalizeScheme = zzhhVar.zza.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zzeq.zze(DataSchemeDataSource.SCHEME_DATA.equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i9 = zzgd.zza;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.zzb = Base64.decode(str, 0);
                } catch (IllegalArgumentException e4) {
                    throw zzch.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e4);
                }
            } else {
                this.zzb = URLDecoder.decode(str, zzfxs.zza.name()).getBytes(zzfxs.zzc);
            }
            long j7 = zzhhVar.zze;
            int length = this.zzb.length;
            if (j7 <= length) {
                int i10 = (int) j7;
                this.zzc = i10;
                int i11 = length - i10;
                this.zzd = i11;
                long j9 = zzhhVar.zzf;
                if (j9 != -1) {
                    this.zzd = (int) Math.min(i11, j9);
                }
                zzj(zzhhVar);
                long j10 = zzhhVar.zzf;
                if (j10 != -1) {
                    return j10;
                }
                return this.zzd;
            }
            this.zzb = null;
            throw new zzhc(2008);
        }
        throw zzch.zzb("Unexpected URI format: ".concat(String.valueOf(normalizeScheme)), null);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        zzhh zzhhVar = this.zza;
        if (zzhhVar != null) {
            return zzhhVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}

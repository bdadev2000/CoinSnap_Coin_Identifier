package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public final class zzgb extends zzfw {

    @Nullable
    private zzgi zza;

    @Nullable
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzgb() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzd;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        byte[] bArr2 = this.zzb;
        int i13 = zzen.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i10, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws IOException {
        zzi(zzgiVar);
        this.zza = zzgiVar;
        Uri normalizeScheme = zzgiVar.zza.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zzdb.zze(DataSchemeDataSource.SCHEME_DATA.equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i10 = zzen.zza;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.zzb = Base64.decode(str, 0);
                } catch (IllegalArgumentException e2) {
                    throw zzbh.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e2);
                }
            } else {
                this.zzb = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long j3 = zzgiVar.zze;
            int length = this.zzb.length;
            if (j3 <= length) {
                int i11 = (int) j3;
                this.zzc = i11;
                int i12 = length - i11;
                this.zzd = i12;
                long j10 = zzgiVar.zzf;
                if (j10 != -1) {
                    this.zzd = (int) Math.min(i12, j10);
                }
                zzj(zzgiVar);
                long j11 = zzgiVar.zzf;
                if (j11 != -1) {
                    return j11;
                }
                return this.zzd;
            }
            this.zzb = null;
            throw new zzge(2008);
        }
        throw zzbh.zzb("Unexpected URI format: ".concat(String.valueOf(normalizeScheme)), null);
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    @Nullable
    public final Uri zzc() {
        zzgi zzgiVar = this.zza;
        if (zzgiVar != null) {
            return zzgiVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}

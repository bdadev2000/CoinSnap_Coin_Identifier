package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgk implements zzgd {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzgd zzc;

    @Nullable
    private zzgd zzd;

    @Nullable
    private zzgd zze;

    @Nullable
    private zzgd zzf;

    @Nullable
    private zzgd zzg;

    @Nullable
    private zzgd zzh;

    @Nullable
    private zzgd zzi;

    @Nullable
    private zzgd zzj;

    @Nullable
    private zzgd zzk;

    public zzgk(Context context, zzgd zzgdVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzgdVar;
    }

    private final zzgd zzg() {
        if (this.zze == null) {
            zzfv zzfvVar = new zzfv(this.zza);
            this.zze = zzfvVar;
            zzh(zzfvVar);
        }
        return this.zze;
    }

    private final void zzh(zzgd zzgdVar) {
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzgdVar.zzf((zzhd) this.zzb.get(i10));
        }
    }

    private static final void zzi(@Nullable zzgd zzgdVar, zzhd zzhdVar) {
        if (zzgdVar != null) {
            zzgdVar.zzf(zzhdVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        zzgd zzgdVar = this.zzk;
        zzgdVar.getClass();
        return zzgdVar.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws IOException {
        boolean z10;
        zzgd zzgdVar;
        if (this.zzk == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdb.zzf(z10);
        String scheme = zzgiVar.zza.getScheme();
        Uri uri = zzgiVar.zza;
        int i10 = zzen.zza;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            if ("asset".equals(scheme)) {
                this.zzk = zzg();
            } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
                if (this.zzf == null) {
                    zzga zzgaVar = new zzga(this.zza);
                    this.zzf = zzgaVar;
                    zzh(zzgaVar);
                }
                this.zzk = this.zzf;
            } else if ("rtmp".equals(scheme)) {
                if (this.zzg == null) {
                    try {
                        zzgd zzgdVar2 = (zzgd) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                        this.zzg = zzgdVar2;
                        zzh(zzgdVar2);
                    } catch (ClassNotFoundException unused) {
                        zzdt.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e2) {
                        throw new RuntimeException("Error instantiating RTMP extension", e2);
                    }
                    if (this.zzg == null) {
                        this.zzg = this.zzc;
                    }
                }
                this.zzk = this.zzg;
            } else if ("udp".equals(scheme)) {
                if (this.zzh == null) {
                    zzhf zzhfVar = new zzhf(2000);
                    this.zzh = zzhfVar;
                    zzh(zzhfVar);
                }
                this.zzk = this.zzh;
            } else if (DataSchemeDataSource.SCHEME_DATA.equals(scheme)) {
                if (this.zzi == null) {
                    zzgb zzgbVar = new zzgb();
                    this.zzi = zzgbVar;
                    zzh(zzgbVar);
                }
                this.zzk = this.zzi;
            } else {
                if (!RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) && !"android.resource".equals(scheme)) {
                    zzgdVar = this.zzc;
                } else {
                    if (this.zzj == null) {
                        zzhb zzhbVar = new zzhb(this.zza);
                        this.zzj = zzhbVar;
                        zzh(zzhbVar);
                    }
                    zzgdVar = this.zzj;
                }
                this.zzk = zzgdVar;
            }
        } else {
            String path = zzgiVar.zza.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.zzk = zzg();
            } else {
                if (this.zzd == null) {
                    zzgs zzgsVar = new zzgs();
                    this.zzd = zzgsVar;
                    zzh(zzgsVar);
                }
                this.zzk = this.zzd;
            }
        }
        return this.zzk.zzb(zzgiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    @Nullable
    public final Uri zzc() {
        zzgd zzgdVar = this.zzk;
        if (zzgdVar == null) {
            return null;
        }
        return zzgdVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() throws IOException {
        zzgd zzgdVar = this.zzk;
        if (zzgdVar != null) {
            try {
                zzgdVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final Map zze() {
        zzgd zzgdVar = this.zzk;
        return zzgdVar == null ? Collections.emptyMap() : zzgdVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzf(zzhd zzhdVar) {
        zzhdVar.getClass();
        this.zzc.zzf(zzhdVar);
        this.zzb.add(zzhdVar);
        zzi(this.zzd, zzhdVar);
        zzi(this.zze, zzhdVar);
        zzi(this.zzf, zzhdVar);
        zzi(this.zzg, zzhdVar);
        zzi(this.zzh, zzhdVar);
        zzi(this.zzi, zzhdVar);
        zzi(this.zzj, zzhdVar);
    }
}

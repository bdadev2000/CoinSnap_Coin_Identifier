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

/* loaded from: classes2.dex */
public final class zzhj implements zzhb {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzhb zzc;

    @Nullable
    private zzhb zzd;

    @Nullable
    private zzhb zze;

    @Nullable
    private zzhb zzf;

    @Nullable
    private zzhb zzg;

    @Nullable
    private zzhb zzh;

    @Nullable
    private zzhb zzi;

    @Nullable
    private zzhb zzj;

    @Nullable
    private zzhb zzk;

    public zzhj(Context context, zzhb zzhbVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzhbVar;
    }

    private final zzhb zzg() {
        if (this.zze == null) {
            zzgu zzguVar = new zzgu(this.zza);
            this.zze = zzguVar;
            zzh(zzguVar);
        }
        return this.zze;
    }

    private final void zzh(zzhb zzhbVar) {
        for (int i9 = 0; i9 < this.zzb.size(); i9++) {
            zzhbVar.zzf((zzie) this.zzb.get(i9));
        }
    }

    private static final void zzi(@Nullable zzhb zzhbVar, zzie zzieVar) {
        if (zzhbVar != null) {
            zzhbVar.zzf(zzieVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i9, int i10) throws IOException {
        zzhb zzhbVar = this.zzk;
        zzhbVar.getClass();
        return zzhbVar.zza(bArr, i9, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhh zzhhVar) throws IOException {
        boolean z8;
        zzhb zzhbVar;
        if (this.zzk == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzf(z8);
        String scheme = zzhhVar.zza.getScheme();
        Uri uri = zzhhVar.zza;
        int i9 = zzgd.zza;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            if ("asset".equals(scheme)) {
                this.zzk = zzg();
            } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
                if (this.zzf == null) {
                    zzgy zzgyVar = new zzgy(this.zza);
                    this.zzf = zzgyVar;
                    zzh(zzgyVar);
                }
                this.zzk = this.zzf;
            } else if ("rtmp".equals(scheme)) {
                if (this.zzg == null) {
                    try {
                        zzhb zzhbVar2 = (zzhb) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.zzg = zzhbVar2;
                        zzh(zzhbVar2);
                    } catch (ClassNotFoundException unused) {
                        zzfk.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e4) {
                        throw new RuntimeException("Error instantiating RTMP extension", e4);
                    }
                    if (this.zzg == null) {
                        this.zzg = this.zzc;
                    }
                }
                this.zzk = this.zzg;
            } else if ("udp".equals(scheme)) {
                if (this.zzh == null) {
                    zzig zzigVar = new zzig(2000);
                    this.zzh = zzigVar;
                    zzh(zzigVar);
                }
                this.zzk = this.zzh;
            } else if (DataSchemeDataSource.SCHEME_DATA.equals(scheme)) {
                if (this.zzi == null) {
                    zzgz zzgzVar = new zzgz();
                    this.zzi = zzgzVar;
                    zzh(zzgzVar);
                }
                this.zzk = this.zzi;
            } else {
                if (!RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) && !"android.resource".equals(scheme)) {
                    zzhbVar = this.zzc;
                } else {
                    if (this.zzj == null) {
                        zzic zzicVar = new zzic(this.zza);
                        this.zzj = zzicVar;
                        zzh(zzicVar);
                    }
                    zzhbVar = this.zzj;
                }
                this.zzk = zzhbVar;
            }
        } else {
            String path = zzhhVar.zza.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.zzk = zzg();
            } else {
                if (this.zzd == null) {
                    zzhs zzhsVar = new zzhs();
                    this.zzd = zzhsVar;
                    zzh(zzhsVar);
                }
                this.zzk = this.zzd;
            }
        }
        return this.zzk.zzb(zzhhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        zzhb zzhbVar = this.zzk;
        if (zzhbVar == null) {
            return null;
        }
        return zzhbVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws IOException {
        zzhb zzhbVar = this.zzk;
        if (zzhbVar != null) {
            try {
                zzhbVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Map zze() {
        zzhb zzhbVar = this.zzk;
        if (zzhbVar == null) {
            return Collections.emptyMap();
        }
        return zzhbVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzf(zzie zzieVar) {
        zzieVar.getClass();
        this.zzc.zzf(zzieVar);
        this.zzb.add(zzieVar);
        zzi(this.zzd, zzieVar);
        zzi(this.zze, zzieVar);
        zzi(this.zzf, zzieVar);
        zzi(this.zzg, zzieVar);
        zzi(this.zzh, zzieVar);
        zzi(this.zzi, zzieVar);
        zzi(this.zzj, zzieVar);
    }
}

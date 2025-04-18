package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdzj {
    private final zzges zza;
    private final zzdyn zzb;
    private final zzhfr zzc;
    private final zzfko zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;

    public zzdzj(zzges zzgesVar, zzdyn zzdynVar, zzhfr zzhfrVar, zzfko zzfkoVar, Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = zzgesVar;
        this.zzb = zzdynVar;
        this.zzc = zzhfrVar;
        this.zzd = zzfkoVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
    }

    private final ua.b zzh(final zzbvx zzbvxVar, zzdzi zzdziVar, final zzdzi zzdziVar2, final zzgdp zzgdpVar) {
        ua.b zzf;
        String str = zzbvxVar.zzd;
        com.google.android.gms.ads.internal.zzv.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzC(str)) {
            zzf = zzgei.zzg(new zzdyw(1));
        } else {
            zzf = zzgei.zzf(zzdziVar.zza(zzbvxVar), ExecutionException.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzh
                @Override // com.google.android.gms.internal.ads.zzgdp
                public final ua.b zza(Object obj) {
                    Throwable th2 = (ExecutionException) obj;
                    if (th2.getCause() != null) {
                        th2 = th2.getCause();
                    }
                    return zzgei.zzg(th2);
                }
            }, this.zza);
        }
        return (zzgdz) zzgei.zzf((zzgdz) zzgei.zzn((zzgdz) zzgei.zzn(zzgdz.zzu(zzf), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzf
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzgei.zzh(((zzdyx) obj).zzb());
            }
        }, this.zza), zzgdpVar, this.zza), zzdyw.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzg
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzdzj.this.zzc(zzdziVar2, zzbvxVar, zzgdpVar, (zzdyw) obj);
            }
        }, this.zza);
    }

    public final ua.b zza(final zzbvx zzbvxVar) {
        zzgdp zzgdpVar = new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdzc
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                String str = new String(zzgce.zzb((InputStream) obj), StandardCharsets.UTF_8);
                zzbvx zzbvxVar2 = zzbvx.this;
                zzbvxVar2.zzj = str;
                return zzgei.zzh(zzbvxVar2);
            }
        };
        final zzdyn zzdynVar = this.zzb;
        Objects.requireNonNull(zzdynVar);
        return zzh(zzbvxVar, new zzdzi() { // from class: com.google.android.gms.internal.ads.zzdzd
            @Override // com.google.android.gms.internal.ads.zzdzi
            public final ua.b zza(zzbvx zzbvxVar2) {
                return zzdyn.this.zza(zzbvxVar2);
            }
        }, new zzdzi() { // from class: com.google.android.gms.internal.ads.zzdze
            @Override // com.google.android.gms.internal.ads.zzdzi
            public final ua.b zza(zzbvx zzbvxVar2) {
                return zzdzj.this.zzd(zzbvxVar2);
            }
        }, zzgdpVar);
    }

    public final ua.b zzb(JSONObject jSONObject) {
        return (zzgdz) zzgei.zzn(zzgdz.zzu(zzgei.zzh(jSONObject)), com.google.android.gms.ads.internal.zzv.zzg().zza(this.zze, this.zzf, this.zzd).zza("AFMA_getAdDictionary", zzbof.zza, new zzboa() { // from class: com.google.android.gms.internal.ads.zzdyy
            @Override // com.google.android.gms.internal.ads.zzboa
            public final Object zza(JSONObject jSONObject2) {
                return new zzbvz(jSONObject2);
            }
        }), this.zza);
    }

    public final /* synthetic */ ua.b zzc(zzdzi zzdziVar, zzbvx zzbvxVar, zzgdp zzgdpVar, zzdyw zzdywVar) throws Exception {
        return zzgei.zzn(zzdziVar.zza(zzbvxVar), zzgdpVar, this.zza);
    }

    public final /* synthetic */ ua.b zzd(zzbvx zzbvxVar) {
        return ((zzebg) this.zzc.zzb()).zzb(zzbvxVar, Binder.getCallingUid());
    }

    public final /* synthetic */ ua.b zze(zzbvx zzbvxVar) {
        return this.zzb.zzd(zzbvxVar.zzh);
    }

    public final /* synthetic */ ua.b zzf(zzbvx zzbvxVar) {
        return ((zzebg) this.zzc.zzb()).zzj(zzbvxVar.zzh);
    }

    public final ua.b zzg(zzbvx zzbvxVar) {
        return zzh(zzbvxVar, new zzdzi() { // from class: com.google.android.gms.internal.ads.zzdza
            @Override // com.google.android.gms.internal.ads.zzdzi
            public final ua.b zza(zzbvx zzbvxVar2) {
                return zzdzj.this.zze(zzbvxVar2);
            }
        }, new zzdzi() { // from class: com.google.android.gms.internal.ads.zzdzb
            @Override // com.google.android.gms.internal.ads.zzdzi
            public final ua.b zza(zzbvx zzbvxVar2) {
                return zzdzj.this.zzf(zzbvxVar2);
            }
        }, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdyz
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzgei.zzh(null);
            }
        });
    }
}

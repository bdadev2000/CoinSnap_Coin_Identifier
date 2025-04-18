package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.measurement.internal.zzje;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import r.b;
import r.f;

/* loaded from: classes3.dex */
public final class zzhl extends zznr implements zzai {
    final f zza;
    final com.google.android.gms.internal.measurement.zzv zzb;
    private final Map<String, Map<String, String>> zzc;
    private final Map<String, Set<String>> zzd;
    private final Map<String, Map<String, Boolean>> zze;
    private final Map<String, Map<String, Boolean>> zzf;
    private final Map<String, zzfr.zzd> zzh;
    private final Map<String, Map<String, Integer>> zzi;
    private final Map<String, String> zzj;
    private final Map<String, String> zzk;
    private final Map<String, String> zzl;

    public zzhl(zznv zznvVar) {
        super(zznvVar);
        this.zzc = new b();
        this.zzd = new b();
        this.zze = new b();
        this.zzf = new b();
        this.zzh = new b();
        this.zzj = new b();
        this.zzk = new b();
        this.zzl = new b();
        this.zzi = new b();
        this.zza = new zzho(this, 20);
        this.zzb = new zzhr(this);
    }

    private final void zzu(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        if (this.zzh.get(str) == null) {
            zzan zzf = zzh().zzf(str);
            if (zzf == null) {
                this.zzc.put(str, null);
                this.zze.put(str, null);
                this.zzd.put(str, null);
                this.zzf.put(str, null);
                this.zzh.put(str, null);
                this.zzj.put(str, null);
                this.zzk.put(str, null);
                this.zzl.put(str, null);
                this.zzi.put(str, null);
                return;
            }
            zzfr.zzd.zza zzcd = zza(str, zzf.zza).zzcd();
            zza(str, zzcd);
            this.zzc.put(str, zza((zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai())));
            this.zzh.put(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai()));
            zza(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai()));
            this.zzj.put(str, zzcd.zzc());
            this.zzk.put(str, zzf.zzb);
            this.zzl.put(str, zzf.zzc);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzoo g_() {
        return super.g_();
    }

    public final int zzb(String str, String str2) {
        Integer num;
        zzt();
        zzu(str);
        Map<String, Integer> map = this.zzi.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    public final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzt zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzal zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzhl zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzmw zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zznu zzo() {
        return super.zzo();
    }

    public final boolean zzp(String str) {
        zzt();
        zzu(str);
        if (this.zzd.get(str) != null) {
            if (this.zzd.get(str).contains("device_model") || this.zzd.get(str).contains("device_info")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final long zza(String str) {
        String zza = zza(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(zza)) {
            return 0L;
        }
        try {
            return Long.parseLong(zza);
        } catch (NumberFormatException e2) {
            zzj().zzu().zza("Unable to parse timezone offset. appId", zzgo.zza(str), e2);
            return 0L;
        }
    }

    public final zzfr.zzd zzc(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzu(str);
        return this.zzh.get(str);
    }

    public final String zzd(String str) {
        zzt();
        return this.zzl.get(str);
    }

    public final String zze(String str) {
        zzt();
        return this.zzk.get(str);
    }

    public final String zzf(String str) {
        zzt();
        zzu(str);
        return this.zzj.get(str);
    }

    public final Set<String> zzg(String str) {
        zzt();
        zzu(str);
        return this.zzd.get(str);
    }

    public final SortedSet<String> zzh(String str) {
        zzt();
        zzu(str);
        TreeSet treeSet = new TreeSet();
        zzfr.zza zzb = zzb(str);
        if (zzb == null) {
            return treeSet;
        }
        Iterator<zzfr.zza.zzf> it = zzb.zzc().iterator();
        while (it.hasNext()) {
            treeSet.add(it.next().zzb());
        }
        return treeSet;
    }

    public final void zzi(String str) {
        zzt();
        this.zzk.put(str, null);
    }

    public final void zzj(String str) {
        zzt();
        this.zzh.remove(str);
    }

    public final boolean zzk(String str) {
        zzfr.zzd zzdVar;
        return (TextUtils.isEmpty(str) || (zzdVar = this.zzh.get(str)) == null || zzdVar.zza() == 0) ? false : true;
    }

    public final boolean zzl(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean zzm(String str) {
        zzt();
        zzu(str);
        zzfr.zza zzb = zzb(str);
        return zzb == null || !zzb.zzh() || zzb.zzg();
    }

    public final boolean zzn(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    public final boolean zzo(String str) {
        zzt();
        zzu(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("app_instance_id");
    }

    public final boolean zzq(String str) {
        zzt();
        zzu(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("enhanced_user_id");
    }

    public final boolean zzr(String str) {
        zzt();
        zzu(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("google_signals");
    }

    public final boolean zzs(String str) {
        zzt();
        zzu(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains("os_version") || this.zzd.get(str).contains("device_info");
        }
        return false;
    }

    public final boolean zzt(String str) {
        zzt();
        zzu(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("user_id");
    }

    public final boolean zzd(String str, String str2) {
        Boolean bool;
        zzt();
        zzu(str);
        if (zzl(str) && zzos.zzg(str2)) {
            return true;
        }
        if (zzn(str) && zzos.zzh(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zze.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public final zzje.zza zzb(String str, zzje.zza zzaVar) {
        zzt();
        zzu(str);
        zzfr.zza zzb = zzb(str);
        if (zzb == null) {
            return null;
        }
        for (zzfr.zza.zzc zzcVar : zzb.zze()) {
            if (zzaVar == zza(zzcVar.zzc())) {
                return zza(zzcVar.zzb());
            }
        }
        return null;
    }

    public final boolean zzc(String str, zzje.zza zzaVar) {
        zzt();
        zzu(str);
        zzfr.zza zzb = zzb(str);
        if (zzb == null) {
            return false;
        }
        Iterator<zzfr.zza.C0148zza> it = zzb.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfr.zza.C0148zza next = it.next();
            if (zzaVar == zza(next.zzc())) {
                if (next.zzb() == zzfr.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static /* synthetic */ com.google.android.gms.internal.measurement.zzb zza(zzhl zzhlVar, String str) {
        zzhlVar.zzal();
        Preconditions.checkNotEmpty(str);
        if (!zzhlVar.zzk(str)) {
            return null;
        }
        if (zzhlVar.zzh.containsKey(str) && zzhlVar.zzh.get(str) != null) {
            zzhlVar.zza(str, zzhlVar.zzh.get(str));
        } else {
            zzhlVar.zzu(str);
        }
        return (com.google.android.gms.internal.measurement.zzb) zzhlVar.zza.snapshot().get(str);
    }

    public final zzfr.zza zzb(String str) {
        zzt();
        zzu(str);
        zzfr.zzd zzc = zzc(str);
        if (zzc == null || !zzc.zzo()) {
            return null;
        }
        return zzc.zzd();
    }

    public final boolean zzc(String str, String str2) {
        Boolean bool;
        zzt();
        zzu(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zzf.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final zzjh zza(String str, zzje.zza zzaVar) {
        zzt();
        zzu(str);
        zzfr.zza zzb = zzb(str);
        if (zzb == null) {
            return zzjh.UNINITIALIZED;
        }
        for (zzfr.zza.C0148zza c0148zza : zzb.zzf()) {
            if (zza(c0148zza.zzc()) == zzaVar) {
                int i10 = zzht.zzc[c0148zza.zzb().ordinal()];
                if (i10 == 1) {
                    return zzjh.DENIED;
                }
                if (i10 != 2) {
                    return zzjh.UNINITIALIZED;
                }
                return zzjh.GRANTED;
            }
        }
        return zzjh.UNINITIALIZED;
    }

    private static zzje.zza zza(zzfr.zza.zze zzeVar) {
        int i10 = zzht.zzb[zzeVar.ordinal()];
        if (i10 == 1) {
            return zzje.zza.AD_STORAGE;
        }
        if (i10 == 2) {
            return zzje.zza.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return zzje.zza.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return zzje.zza.AD_PERSONALIZATION;
    }

    private final zzfr.zzd zza(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfr.zzd.zzg();
        }
        try {
            zzfr.zzd zzdVar = (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) ((zzfr.zzd.zza) zzoo.zza(zzfr.zzd.zze(), bArr)).zzai());
            zzj().zzp().zza("Parsed config. version, gmp_app_id", zzdVar.zzr() ? Long.valueOf(zzdVar.zzc()) : null, zzdVar.zzp() ? zzdVar.zzi() : null);
            return zzdVar;
        } catch (com.google.android.gms.internal.measurement.zzkb e2) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzgo.zza(str), e2);
            return zzfr.zzd.zzg();
        } catch (RuntimeException e10) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzgo.zza(str), e10);
            return zzfr.zzd.zzg();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzai
    public final String zza(String str, String str2) {
        zzt();
        zzu(str);
        Map<String, String> map = this.zzc.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    private static Map<String, String> zza(zzfr.zzd zzdVar) {
        b bVar = new b();
        if (zzdVar != null) {
            for (zzfr.zzh zzhVar : zzdVar.zzn()) {
                bVar.put(zzhVar.zzb(), zzhVar.zzc());
            }
        }
        return bVar;
    }

    private final void zza(String str, zzfr.zzd.zza zzaVar) {
        HashSet hashSet = new HashSet();
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        if (zzaVar != null) {
            Iterator<zzfr.zzb> it = zzaVar.zze().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().zzb());
            }
            for (int i10 = 0; i10 < zzaVar.zza(); i10++) {
                zzfr.zzc.zza zzcd = zzaVar.zza(i10).zzcd();
                if (zzcd.zzb().isEmpty()) {
                    zzj().zzu().zza("EventConfig contained null event name");
                } else {
                    String zzb = zzcd.zzb();
                    String zzb2 = zzji.zzb(zzcd.zzb());
                    if (!TextUtils.isEmpty(zzb2)) {
                        zzcd = zzcd.zza(zzb2);
                        zzaVar.zza(i10, zzcd);
                    }
                    if (zzcd.zze() && zzcd.zzc()) {
                        bVar.put(zzb, Boolean.TRUE);
                    }
                    if (zzcd.zzf() && zzcd.zzd()) {
                        bVar2.put(zzcd.zzb(), Boolean.TRUE);
                    }
                    if (zzcd.zzg()) {
                        if (zzcd.zza() >= 2 && zzcd.zza() <= 65535) {
                            bVar3.put(zzcd.zzb(), Integer.valueOf(zzcd.zza()));
                        } else {
                            zzj().zzu().zza("Invalid sampling rate. Event name, sample rate", zzcd.zzb(), Integer.valueOf(zzcd.zza()));
                        }
                    }
                }
            }
        }
        this.zzd.put(str, hashSet);
        this.zze.put(str, bVar);
        this.zzf.put(str, bVar2);
        this.zzi.put(str, bVar3);
    }

    private final void zza(final String str, zzfr.zzd zzdVar) {
        if (zzdVar.zza() == 0) {
            this.zza.remove(str);
            return;
        }
        zzj().zzp().zza("EES programs found", Integer.valueOf(zzdVar.zza()));
        zzgd.zzc zzcVar = zzdVar.zzm().get(0);
        try {
            com.google.android.gms.internal.measurement.zzb zzbVar = new com.google.android.gms.internal.measurement.zzb();
            zzbVar.zza("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzm("internal.remoteConfig", new zzhq(zzhl.this, str));
                }
            });
            zzbVar.zza("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzhl zzhlVar = zzhl.this;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzx("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhk
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzhl zzhlVar2 = zzhl.this;
                            String str3 = str2;
                            zzg zze = zzhlVar2.zzh().zze(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put(CampaignEx.JSON_KEY_PACKAGE_NAME, str3);
                            hashMap.put("gmp_version", 106000L);
                            if (zze != null) {
                                String zzaf = zze.zzaf();
                                if (zzaf != null) {
                                    hashMap.put("app_version", zzaf);
                                }
                                hashMap.put("app_version_int", Long.valueOf(zze.zze()));
                                hashMap.put("dynamite_version", Long.valueOf(zze.zzo()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            zzbVar.zza("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzhp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzr(zzhl.this.zzb);
                }
            });
            zzbVar.zza(zzcVar);
            this.zza.put(str, zzbVar);
            zzj().zzp().zza("EES program loaded for appId, activities", str, Integer.valueOf(zzcVar.zza().zza()));
            Iterator<zzgd.zzb> it = zzcVar.zza().zzd().iterator();
            while (it.hasNext()) {
                zzj().zzp().zza("EES program activity", it.next().zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzc unused) {
            zzj().zzg().zza("Failed to load EES program. appId", str);
        }
    }

    public final boolean zza(String str, byte[] bArr, String str2, String str3) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzfr.zzd.zza zzcd = zza(str, bArr).zzcd();
        if (zzcd == null) {
            return false;
        }
        zza(str, zzcd);
        zza(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai()));
        this.zzh.put(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai()));
        this.zzj.put(str, zzcd.zzc());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzc.put(str, zza((zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai())));
        zzh().zza(str, new ArrayList(zzcd.zzd()));
        try {
            zzcd.zzb();
            bArr = ((zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai())).zzca();
        } catch (RuntimeException e2) {
            zzj().zzu().zza("Unable to serialize reduced-size config. Storing full config instead. appId", zzgo.zza(str), e2);
        }
        zzal zzh = zzh();
        Preconditions.checkNotEmpty(str);
        zzh.zzt();
        zzh.zzal();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (zzh.e_().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzh.zzj().zzg().zza("Failed to update remote config (got 0). appId", zzgo.zza(str));
            }
        } catch (SQLiteException e10) {
            zzh.zzj().zzg().zza("Error storing remote config. appId", zzgo.zza(str), e10);
        }
        this.zzh.put(str, (zzfr.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzcd.zzai()));
        return true;
    }
}

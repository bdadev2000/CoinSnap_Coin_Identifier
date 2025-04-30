package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.measurement.internal.zzin;
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
import x.g;
import x.l;

/* loaded from: classes2.dex */
public final class zzgt extends zzmx implements zzai {
    final g zza;
    final com.google.android.gms.internal.measurement.zzv zzb;
    private final Map<String, Map<String, String>> zzc;
    private final Map<String, Set<String>> zzd;
    private final Map<String, Map<String, Boolean>> zze;
    private final Map<String, Map<String, Boolean>> zzg;
    private final Map<String, zzfi.zzd> zzh;
    private final Map<String, Map<String, Integer>> zzi;
    private final Map<String, String> zzj;
    private final Map<String, String> zzk;
    private final Map<String, String> zzl;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>, x.l] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map<java.lang.String, java.util.Set<java.lang.String>>, x.l] */
    /* JADX WARN: Type inference failed for: r2v3, types: [x.l, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>>] */
    /* JADX WARN: Type inference failed for: r2v4, types: [x.l, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>>] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.zzfi$zzd>, x.l] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Map<java.lang.String, java.lang.String>, x.l] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Map<java.lang.String, java.lang.String>, x.l] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Map<java.lang.String, java.lang.String>, x.l] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>>, x.l] */
    public zzgt(zznc zzncVar) {
        super(zzncVar);
        this.zzc = new l();
        this.zzd = new l();
        this.zze = new l();
        this.zzg = new l();
        this.zzh = new l();
        this.zzj = new l();
        this.zzk = new l();
        this.zzl = new l();
        this.zzi = new l();
        this.zza = new zzgz(this, 20);
        this.zzb = new zzgy(this);
    }

    private final void zzv(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        if (this.zzh.get(str) == null) {
            zzan zzf = zzh().zzf(str);
            if (zzf == null) {
                this.zzc.put(str, null);
                this.zze.put(str, null);
                this.zzd.put(str, null);
                this.zzg.put(str, null);
                this.zzh.put(str, null);
                this.zzj.put(str, null);
                this.zzk.put(str, null);
                this.zzl.put(str, null);
                this.zzi.put(str, null);
                return;
            }
            zzfi.zzd.zza zzcc = zza(str, zzf.zza).zzcc();
            zza(str, zzcc);
            this.zzc.put(str, zza((zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai())));
            this.zzh.put(str, (zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai()));
            zza(str, (zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai()));
            this.zzj.put(str, zzcc.zzc());
            this.zzk.put(str, zzf.zzb);
            this.zzl.put(str, zzf.zzc);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zznl g_() {
        return super.g_();
    }

    public final int zzb(String str, String str2) {
        Integer num;
        zzt();
        zzv(str);
        Map<String, Integer> map = this.zzi.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzmx
    public final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzu zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzal zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzfr zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzfw zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzgh zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzhc zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzgt zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzmc zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzmy
    public final /* bridge */ /* synthetic */ zzna zzo() {
        return super.zzo();
    }

    public final boolean zzp(String str) {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null && this.zzd.get(str).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zznp zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final boolean zzu(String str) {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null && this.zzd.get(str).contains("user_id")) {
            return true;
        }
        return false;
    }

    public final long zza(String str) {
        String zza = zza(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(zza)) {
            return 0L;
        }
        try {
            return Long.parseLong(zza);
        } catch (NumberFormatException e4) {
            zzj().zzu().zza("Unable to parse timezone offset. appId", zzfw.zza(str), e4);
            return 0L;
        }
    }

    public final zzfi.zzd zzc(String str) {
        zzal();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzv(str);
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
        zzv(str);
        return this.zzj.get(str);
    }

    public final Set<String> zzg(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str);
    }

    public final SortedSet<String> zzh(String str) {
        zzt();
        zzv(str);
        TreeSet treeSet = new TreeSet();
        zzfi.zza zzb = zzb(str);
        if (zzb == null) {
            return treeSet;
        }
        Iterator<zzfi.zza.zzf> it = zzb.zzc().iterator();
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
        zzt();
        zzfi.zzd zzc = zzc(str);
        if (zzc == null) {
            return false;
        }
        return zzc.zzo();
    }

    public final boolean zzl(String str) {
        zzfi.zzd zzdVar;
        return (TextUtils.isEmpty(str) || (zzdVar = this.zzh.get(str)) == null || zzdVar.zza() == 0) ? false : true;
    }

    public final boolean zzm(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean zzn(String str) {
        zzt();
        zzv(str);
        zzfi.zza zzb = zzb(str);
        return zzb == null || !zzb.zzh() || zzb.zzg();
    }

    public final boolean zzo(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    public final boolean zzq(String str) {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains("device_model") || this.zzd.get(str).contains("device_info");
        }
        return false;
    }

    public final boolean zzr(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("enhanced_user_id");
    }

    public final boolean zzs(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("google_signals");
    }

    public final boolean zzt(String str) {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains("os_version") || this.zzd.get(str).contains("device_info");
        }
        return false;
    }

    public final boolean zzd(String str, String str2) {
        Boolean bool;
        zzt();
        zzv(str);
        if (zzm(str) && zznp.zzg(str2)) {
            return true;
        }
        if (zzo(str) && zznp.zzh(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zze.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public final zzin.zza zzb(String str, zzin.zza zzaVar) {
        zzt();
        zzv(str);
        zzfi.zza zzb = zzb(str);
        if (zzb == null) {
            return null;
        }
        for (zzfi.zza.zzc zzcVar : zzb.zze()) {
            if (zzaVar == zza(zzcVar.zzc())) {
                return zza(zzcVar.zzb());
            }
        }
        return null;
    }

    public final boolean zzc(String str, zzin.zza zzaVar) {
        zzt();
        zzv(str);
        zzfi.zza zzb = zzb(str);
        if (zzb == null) {
            return false;
        }
        Iterator<zzfi.zza.C0136zza> it = zzb.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfi.zza.C0136zza next = it.next();
            if (zzaVar == zza(next.zzc())) {
                if (next.zzb() == zzfi.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static /* synthetic */ com.google.android.gms.internal.measurement.zzb zza(zzgt zzgtVar, String str) {
        zzgtVar.zzal();
        Preconditions.checkNotEmpty(str);
        if (!zzgtVar.zzl(str)) {
            return null;
        }
        if (zzgtVar.zzh.containsKey(str) && zzgtVar.zzh.get(str) != null) {
            zzgtVar.zza(str, zzgtVar.zzh.get(str));
        } else {
            zzgtVar.zzv(str);
        }
        return (com.google.android.gms.internal.measurement.zzb) zzgtVar.zza.snapshot().get(str);
    }

    public final zzfi.zza zzb(String str) {
        zzt();
        zzv(str);
        zzfi.zzd zzc = zzc(str);
        if (zzc == null || !zzc.zzp()) {
            return null;
        }
        return zzc.zzd();
    }

    public final boolean zzc(String str, String str2) {
        Boolean bool;
        zzt();
        zzv(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zzg.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final zzim zza(String str, zzin.zza zzaVar) {
        zzt();
        zzv(str);
        zzfi.zza zzb = zzb(str);
        if (zzb == null) {
            return zzim.UNINITIALIZED;
        }
        for (zzfi.zza.C0136zza c0136zza : zzb.zzf()) {
            if (zza(c0136zza.zzc()) == zzaVar) {
                int i9 = zzha.zzc[c0136zza.zzb().ordinal()];
                if (i9 == 1) {
                    return zzim.DENIED;
                }
                if (i9 != 2) {
                    return zzim.UNINITIALIZED;
                }
                return zzim.GRANTED;
            }
        }
        return zzim.UNINITIALIZED;
    }

    private static zzin.zza zza(zzfi.zza.zze zzeVar) {
        int i9 = zzha.zzb[zzeVar.ordinal()];
        if (i9 == 1) {
            return zzin.zza.AD_STORAGE;
        }
        if (i9 == 2) {
            return zzin.zza.ANALYTICS_STORAGE;
        }
        if (i9 == 3) {
            return zzin.zza.AD_USER_DATA;
        }
        if (i9 != 4) {
            return null;
        }
        return zzin.zza.AD_PERSONALIZATION;
    }

    private final zzfi.zzd zza(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfi.zzd.zzg();
        }
        try {
            zzfi.zzd zzdVar = (zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) ((zzfi.zzd.zza) zznl.zza(zzfi.zzd.zze(), bArr)).zzai());
            zzj().zzp().zza("Parsed config. version, gmp_app_id", zzdVar.zzs() ? Long.valueOf(zzdVar.zzc()) : null, zzdVar.zzq() ? zzdVar.zzi() : null);
            return zzdVar;
        } catch (com.google.android.gms.internal.measurement.zzjs e4) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzfw.zza(str), e4);
            return zzfi.zzd.zzg();
        } catch (RuntimeException e9) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzfw.zza(str), e9);
            return zzfi.zzd.zzg();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzai
    public final String zza(String str, String str2) {
        zzt();
        zzv(str);
        Map<String, String> map = this.zzc.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, java.lang.String>, x.l] */
    private static Map<String, String> zza(zzfi.zzd zzdVar) {
        ?? lVar = new l();
        if (zzdVar != null) {
            for (zzfi.zzg zzgVar : zzdVar.zzn()) {
                lVar.put(zzgVar.zzb(), zzgVar.zzc());
            }
        }
        return lVar;
    }

    private final void zza(String str, zzfi.zzd.zza zzaVar) {
        HashSet hashSet = new HashSet();
        l lVar = new l();
        l lVar2 = new l();
        l lVar3 = new l();
        if (zzaVar != null) {
            Iterator<zzfi.zzb> it = zzaVar.zze().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().zzb());
            }
            for (int i9 = 0; i9 < zzaVar.zza(); i9++) {
                zzfi.zzc.zza zzcc = zzaVar.zza(i9).zzcc();
                if (zzcc.zzb().isEmpty()) {
                    zzj().zzu().zza("EventConfig contained null event name");
                } else {
                    String zzb = zzcc.zzb();
                    String zzb2 = zziq.zzb(zzcc.zzb());
                    if (!TextUtils.isEmpty(zzb2)) {
                        zzcc = zzcc.zza(zzb2);
                        zzaVar.zza(i9, zzcc);
                    }
                    if (zzcc.zze() && zzcc.zzc()) {
                        lVar.put(zzb, Boolean.TRUE);
                    }
                    if (zzcc.zzf() && zzcc.zzd()) {
                        lVar2.put(zzcc.zzb(), Boolean.TRUE);
                    }
                    if (zzcc.zzg()) {
                        if (zzcc.zza() >= 2 && zzcc.zza() <= 65535) {
                            lVar3.put(zzcc.zzb(), Integer.valueOf(zzcc.zza()));
                        } else {
                            zzj().zzu().zza("Invalid sampling rate. Event name, sample rate", zzcc.zzb(), Integer.valueOf(zzcc.zza()));
                        }
                    }
                }
            }
        }
        this.zzd.put(str, hashSet);
        this.zze.put(str, lVar);
        this.zzg.put(str, lVar2);
        this.zzi.put(str, lVar3);
    }

    private final void zza(final String str, zzfi.zzd zzdVar) {
        if (zzdVar.zza() == 0) {
            this.zza.remove(str);
            return;
        }
        zzj().zzp().zza("EES programs found", Integer.valueOf(zzdVar.zza()));
        zzft.zzc zzcVar = zzdVar.zzm().get(0);
        try {
            com.google.android.gms.internal.measurement.zzb zzbVar = new com.google.android.gms.internal.measurement.zzb();
            zzbVar.zza("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzgu
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzm("internal.remoteConfig", new zzhb(zzgt.this, str));
                }
            });
            zzbVar.zza("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzgx
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzgt zzgtVar = zzgt.this;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzx("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzgv
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzgt zzgtVar2 = zzgt.this;
                            String str3 = str2;
                            zzg zze = zzgtVar2.zzh().zze(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put(CampaignEx.JSON_KEY_PACKAGE_NAME, str3);
                            hashMap.put("gmp_version", 97001L);
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
            zzbVar.zza("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzgw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzr(zzgt.this.zzb);
                }
            });
            zzbVar.zza(zzcVar);
            this.zza.put(str, zzbVar);
            zzj().zzp().zza("EES program loaded for appId, activities", str, Integer.valueOf(zzcVar.zza().zza()));
            Iterator<zzft.zzb> it = zzcVar.zza().zzd().iterator();
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
        zzfi.zzd.zza zzcc = zza(str, bArr).zzcc();
        if (zzcc == null) {
            return false;
        }
        zza(str, zzcc);
        zza(str, (zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai()));
        this.zzh.put(str, (zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai()));
        this.zzj.put(str, zzcc.zzc());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzc.put(str, zza((zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai())));
        zzh().zza(str, new ArrayList(zzcc.zzd()));
        try {
            zzcc.zzb();
            bArr = ((zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai())).zzbz();
        } catch (RuntimeException e4) {
            zzj().zzu().zza("Unable to serialize reduced-size config. Storing full config instead. appId", zzfw.zza(str), e4);
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
                zzh.zzj().zzg().zza("Failed to update remote config (got 0). appId", zzfw.zza(str));
            }
        } catch (SQLiteException e9) {
            zzh.zzj().zzg().zza("Error storing remote config. appId", zzfw.zza(str), e9);
        }
        this.zzh.put(str, (zzfi.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzcc.zzai()));
        return true;
    }
}

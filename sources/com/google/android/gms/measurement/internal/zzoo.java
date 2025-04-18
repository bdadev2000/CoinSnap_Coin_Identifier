package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpo;
import com.google.android.gms.internal.measurement.zzpu;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import eb.j;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class zzoo extends zznr {
    public zzoo(zznv zznvVar) {
        super(zznvVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzns
    public final /* bridge */ /* synthetic */ zzoo g_() {
        return super.g_();
    }

    public final String zza(zzfo.zzb zzbVar) {
        if (zzbVar == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder m10 = j.m("\nevent_filter {\n");
        if (zzbVar.zzl()) {
            zza(m10, 0, "filter_id", Integer.valueOf(zzbVar.zzb()));
        }
        zza(m10, 0, "event_name", zzi().zza(zzbVar.zzf()));
        String zza = zza(zzbVar.zzh(), zzbVar.zzi(), zzbVar.zzj());
        if (!zza.isEmpty()) {
            zza(m10, 0, "filter_type", zza);
        }
        if (zzbVar.zzk()) {
            zza(m10, 1, "event_count_filter", zzbVar.zze());
        }
        if (zzbVar.zza() > 0) {
            m10.append("  filters {\n");
            Iterator<zzfo.zzc> it = zzbVar.zzg().iterator();
            while (it.hasNext()) {
                zza(m10, 2, it.next());
            }
        }
        zza(m10, 1);
        m10.append("}\n}\n");
        return m10.toString();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
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

    public final List<Integer> zzu() {
        Map<String, String> zza = zzbh.zza(this.zzg.zza());
        if (zza == null || zza.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = zzbh.zzar.zza(null).intValue();
        for (Map.Entry<String, String> entry : zza.entrySet()) {
            if (entry.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            zzj().zzu().zza("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e2) {
                    zzj().zzu().zza("Experiment ID NumberFormatException", e2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static Object zzb(zzfy.zzf zzfVar, String str) {
        zzfy.zzh zza = zza(zzfVar, str);
        if (zza == null) {
            return null;
        }
        if (zza.zzn()) {
            return zza.zzh();
        }
        if (zza.zzl()) {
            return Long.valueOf(zza.zzd());
        }
        if (zza.zzj()) {
            return Double.valueOf(zza.zza());
        }
        if (zza.zzc() > 0) {
            return zzb(zza.zzi());
        }
        return null;
    }

    public final byte[] zzc(byte[] bArr) throws IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e2) {
            zzj().zzg().zza("Failed to ungzip content", e2);
            throw e2;
        }
    }

    public static boolean zzb(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public final byte[] zzb(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            zzj().zzg().zza("Failed to gzip content", e2);
            throw e2;
        }
    }

    public static Bundle[] zzb(List<zzfy.zzh> list) {
        ArrayList arrayList = new ArrayList();
        for (zzfy.zzh zzhVar : list) {
            if (zzhVar != null) {
                Bundle bundle = new Bundle();
                for (zzfy.zzh zzhVar2 : zzhVar.zzi()) {
                    if (zzhVar2.zzn()) {
                        bundle.putString(zzhVar2.zzg(), zzhVar2.zzh());
                    } else if (zzhVar2.zzl()) {
                        bundle.putLong(zzhVar2.zzg(), zzhVar2.zzd());
                    } else if (zzhVar2.zzj()) {
                        bundle.putDouble(zzhVar2.zzg(), zzhVar2.zza());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final String zza(zzfo.zze zzeVar) {
        if (zzeVar == null) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder m10 = j.m("\nproperty_filter {\n");
        if (zzeVar.zzi()) {
            zza(m10, 0, "filter_id", Integer.valueOf(zzeVar.zza()));
        }
        zza(m10, 0, "property_name", zzi().zzc(zzeVar.zze()));
        String zza = zza(zzeVar.zzf(), zzeVar.zzg(), zzeVar.zzh());
        if (!zza.isEmpty()) {
            zza(m10, 0, "filter_type", zza);
        }
        zza(m10, 1, zzeVar.zzb());
        m10.append("}\n");
        return m10.toString();
    }

    public final String zza(zzfy.zzj zzjVar) {
        zzfy.zzc zzv;
        if (zzjVar == null) {
            return "";
        }
        StringBuilder m10 = j.m("\nbatch {\n");
        if (zzpu.zza() && zze().zza(zzbh.zzbx) && zzjVar.zza() > 0) {
            zzq();
            if (zzos.zzf(zzjVar.zza(0).zzz())) {
                if (zzjVar.zzh()) {
                    zza(m10, 0, "upload_subdomain", zzjVar.zze());
                }
                if (zzjVar.zzg()) {
                    zza(m10, 0, "sgtm_join_id", zzjVar.zzd());
                }
            }
        }
        for (zzfy.zzk zzkVar : zzjVar.zzf()) {
            if (zzkVar != null) {
                zza(m10, 1);
                m10.append("bundle {\n");
                if (zzkVar.zzbp()) {
                    zza(m10, 1, "protocol_version", Integer.valueOf(zzkVar.zzf()));
                }
                if (zzpo.zza() && zze().zze(zzkVar.zzz(), zzbh.zzbw) && zzkVar.zzbs()) {
                    zza(m10, 1, "session_stitching_token", zzkVar.zzao());
                }
                zza(m10, 1, "platform", zzkVar.zzam());
                if (zzkVar.zzbk()) {
                    zza(m10, 1, "gmp_version", Long.valueOf(zzkVar.zzn()));
                }
                if (zzkVar.zzbx()) {
                    zza(m10, 1, "uploading_gmp_version", Long.valueOf(zzkVar.zzt()));
                }
                if (zzkVar.zzbi()) {
                    zza(m10, 1, "dynamite_version", Long.valueOf(zzkVar.zzl()));
                }
                if (zzkVar.zzbb()) {
                    zza(m10, 1, "config_version", Long.valueOf(zzkVar.zzj()));
                }
                zza(m10, 1, "gmp_app_id", zzkVar.zzaj());
                zza(m10, 1, "admob_app_id", zzkVar.zzy());
                zza(m10, 1, MBridgeConstans.APP_ID, zzkVar.zzz());
                zza(m10, 1, "app_version", zzkVar.zzac());
                if (zzkVar.zzay()) {
                    zza(m10, 1, "app_version_major", Integer.valueOf(zzkVar.zzb()));
                }
                zza(m10, 1, "firebase_instance_id", zzkVar.zzai());
                if (zzkVar.zzbg()) {
                    zza(m10, 1, "dev_cert_hash", Long.valueOf(zzkVar.zzk()));
                }
                zza(m10, 1, "app_store", zzkVar.zzab());
                if (zzkVar.zzbw()) {
                    zza(m10, 1, "upload_timestamp_millis", Long.valueOf(zzkVar.zzs()));
                }
                if (zzkVar.zzbt()) {
                    zza(m10, 1, "start_timestamp_millis", Long.valueOf(zzkVar.zzq()));
                }
                if (zzkVar.zzbj()) {
                    zza(m10, 1, "end_timestamp_millis", Long.valueOf(zzkVar.zzm()));
                }
                if (zzkVar.zzbo()) {
                    zza(m10, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzkVar.zzp()));
                }
                if (zzkVar.zzbn()) {
                    zza(m10, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzkVar.zzo()));
                }
                zza(m10, 1, "app_instance_id", zzkVar.zzaa());
                zza(m10, 1, "resettable_device_id", zzkVar.zzan());
                zza(m10, 1, "ds_id", zzkVar.zzah());
                if (zzkVar.zzbm()) {
                    zza(m10, 1, "limited_ad_tracking", Boolean.valueOf(zzkVar.zzav()));
                }
                zza(m10, 1, "os_version", zzkVar.zzal());
                zza(m10, 1, "device_model", zzkVar.zzag());
                zza(m10, 1, "user_default_language", zzkVar.zzap());
                if (zzkVar.zzbv()) {
                    zza(m10, 1, "time_zone_offset_minutes", Integer.valueOf(zzkVar.zzh()));
                }
                if (zzkVar.zzba()) {
                    zza(m10, 1, "bundle_sequential_index", Integer.valueOf(zzkVar.zzc()));
                }
                if (zzpu.zza()) {
                    zzq();
                    if (zzos.zzf(zzkVar.zzz()) && zze().zza(zzbh.zzbx) && zzkVar.zzbf()) {
                        zza(m10, 1, "delivery_index", Integer.valueOf(zzkVar.zzd()));
                    }
                }
                if (zzkVar.zzbr()) {
                    zza(m10, 1, "service_upload", Boolean.valueOf(zzkVar.zzaw()));
                }
                zza(m10, 1, "health_monitor", zzkVar.zzak());
                if (zzkVar.zzbq()) {
                    zza(m10, 1, "retry_counter", Integer.valueOf(zzkVar.zzg()));
                }
                if (zzkVar.zzbd()) {
                    zza(m10, 1, "consent_signals", zzkVar.zzae());
                }
                if (zzkVar.zzbl()) {
                    zza(m10, 1, "is_dma_region", Boolean.valueOf(zzkVar.zzau()));
                }
                if (zzkVar.zzbe()) {
                    zza(m10, 1, "core_platform_services", zzkVar.zzaf());
                }
                if (zzkVar.zzbc()) {
                    zza(m10, 1, "consent_diagnostics", zzkVar.zzad());
                }
                if (zzkVar.zzbu()) {
                    zza(m10, 1, "target_os_version", Long.valueOf(zzkVar.zzr()));
                }
                if (zzpn.zza() && zze().zze(zzkVar.zzz(), zzbh.zzch)) {
                    zza(m10, 1, "ad_services_version", Integer.valueOf(zzkVar.zza()));
                    if (zzkVar.zzaz() && (zzv = zzkVar.zzv()) != null) {
                        zza(m10, 2);
                        m10.append("attribution_eligibility_status {\n");
                        zza(m10, 2, "eligible", Boolean.valueOf(zzv.zzf()));
                        zza(m10, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzv.zzh()));
                        zza(m10, 2, "pre_r", Boolean.valueOf(zzv.zzi()));
                        zza(m10, 2, "r_extensions_too_old", Boolean.valueOf(zzv.zzj()));
                        zza(m10, 2, "adservices_extension_too_old", Boolean.valueOf(zzv.zze()));
                        zza(m10, 2, "ad_storage_not_allowed", Boolean.valueOf(zzv.zzd()));
                        zza(m10, 2, "measurement_manager_disabled", Boolean.valueOf(zzv.zzg()));
                        zza(m10, 2);
                        m10.append("}\n");
                    }
                }
                if (zzov.zza() && zze().zza(zzbh.zzcu) && zzkVar.zzax()) {
                    zzfy.zza zzu = zzkVar.zzu();
                    zza(m10, 2);
                    m10.append("ad_campaign_info {\n");
                    if (zzu.zzn()) {
                        zza(m10, 2, "deep_link_gclid", zzu.zzh());
                    }
                    if (zzu.zzm()) {
                        zza(m10, 2, "deep_link_gbraid", zzu.zzg());
                    }
                    if (zzu.zzl()) {
                        zza(m10, 2, "deep_link_gad_source", zzu.zzf());
                    }
                    if (zzu.zzo()) {
                        zza(m10, 2, "deep_link_session_millis", Long.valueOf(zzu.zza()));
                    }
                    if (zzu.zzs()) {
                        zza(m10, 2, "market_referrer_gclid", zzu.zzk());
                    }
                    if (zzu.zzr()) {
                        zza(m10, 2, "market_referrer_gbraid", zzu.zzj());
                    }
                    if (zzu.zzq()) {
                        zza(m10, 2, "market_referrer_gad_source", zzu.zzi());
                    }
                    if (zzu.zzp()) {
                        zza(m10, 2, "market_referrer_click_millis", Long.valueOf(zzu.zzb()));
                    }
                    zza(m10, 2);
                    m10.append("}\n");
                }
                List<zzfy.zzo> zzas = zzkVar.zzas();
                if (zzas != null) {
                    for (zzfy.zzo zzoVar : zzas) {
                        if (zzoVar != null) {
                            zza(m10, 2);
                            m10.append("user_property {\n");
                            zza(m10, 2, "set_timestamp_millis", zzoVar.zzl() ? Long.valueOf(zzoVar.zzd()) : null);
                            zza(m10, 2, "name", zzi().zzc(zzoVar.zzg()));
                            zza(m10, 2, "string_value", zzoVar.zzh());
                            zza(m10, 2, "int_value", zzoVar.zzk() ? Long.valueOf(zzoVar.zzc()) : null);
                            zza(m10, 2, "double_value", zzoVar.zzi() ? Double.valueOf(zzoVar.zza()) : null);
                            zza(m10, 2);
                            m10.append("}\n");
                        }
                    }
                }
                List<zzfy.zzd> zzaq = zzkVar.zzaq();
                zzkVar.zzz();
                if (zzaq != null) {
                    for (zzfy.zzd zzdVar : zzaq) {
                        if (zzdVar != null) {
                            zza(m10, 2);
                            m10.append("audience_membership {\n");
                            if (zzdVar.zzg()) {
                                zza(m10, 2, "audience_id", Integer.valueOf(zzdVar.zza()));
                            }
                            if (zzdVar.zzh()) {
                                zza(m10, 2, "new_audience", Boolean.valueOf(zzdVar.zzf()));
                            }
                            zza(m10, 2, "current_data", zzdVar.zzd());
                            if (zzdVar.zzi()) {
                                zza(m10, 2, "previous_data", zzdVar.zze());
                            }
                            zza(m10, 2);
                            m10.append("}\n");
                        }
                    }
                }
                List<zzfy.zzf> zzar = zzkVar.zzar();
                if (zzar != null) {
                    for (zzfy.zzf zzfVar : zzar) {
                        if (zzfVar != null) {
                            zza(m10, 2);
                            m10.append("event {\n");
                            zza(m10, 2, "name", zzi().zza(zzfVar.zzg()));
                            if (zzfVar.zzk()) {
                                zza(m10, 2, "timestamp_millis", Long.valueOf(zzfVar.zzd()));
                            }
                            if (zzfVar.zzj()) {
                                zza(m10, 2, "previous_timestamp_millis", Long.valueOf(zzfVar.zzc()));
                            }
                            if (zzfVar.zzi()) {
                                zza(m10, 2, "count", Integer.valueOf(zzfVar.zza()));
                            }
                            if (zzfVar.zzb() != 0) {
                                zza(m10, 2, zzfVar.zzh());
                            }
                            zza(m10, 2);
                            m10.append("}\n");
                        }
                    }
                }
                zza(m10, 1);
                m10.append("}\n");
            }
        }
        m10.append("} // End-of-batch\n");
        return m10.toString();
    }

    public static int zza(zzfy.zzk.zza zzaVar, String str) {
        if (zzaVar == null) {
            return -1;
        }
        for (int i10 = 0; i10 < zzaVar.zzd(); i10++) {
            if (str.equals(zzaVar.zzk(i10).zzg())) {
                return i10;
            }
        }
        return -1;
    }

    public final long zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return zza(str.getBytes(Charset.forName("UTF-8")));
    }

    public final long zza(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        zzq().zzt();
        MessageDigest zzu = zzos.zzu();
        if (zzu == null) {
            zzj().zzg().zza("Failed to get MD5");
            return 0L;
        }
        return zzos.zza(zzu.digest(bArr));
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static Bundle zza(List<zzfy.zzh> list) {
        Bundle bundle = new Bundle();
        for (zzfy.zzh zzhVar : list) {
            String zzg = zzhVar.zzg();
            if (zzhVar.zzj()) {
                bundle.putDouble(zzg, zzhVar.zza());
            } else if (zzhVar.zzk()) {
                bundle.putFloat(zzg, zzhVar.zzb());
            } else if (zzhVar.zzn()) {
                bundle.putString(zzg, zzhVar.zzh());
            } else if (zzhVar.zzl()) {
                bundle.putLong(zzg, zzhVar.zzd());
            }
        }
        return bundle;
    }

    private final Bundle zza(Map<String, Object> map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(zza((Map<String, Object>) obj2, false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public final <T extends Parcelable> T zza(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            zzj().zzg().zza("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    public final zzbf zza(com.google.android.gms.internal.measurement.zzad zzadVar) {
        Object obj;
        Bundle zza = zza(zzadVar.zzc(), true);
        String obj2 = (!zza.containsKey("_o") || (obj = zza.get("_o")) == null) ? MBridgeConstans.DYNAMIC_VIEW_WX_APP : obj.toString();
        String zzb = zzji.zzb(zzadVar.zzb());
        if (zzb == null) {
            zzb = zzadVar.zzb();
        }
        return new zzbf(zzb, new zzbe(zza), obj2, zzadVar.zza());
    }

    @TargetApi(30)
    public final zzno zza(String str, zzfy.zzk.zza zzaVar, zzfy.zzf.zza zzaVar2, String str2) {
        int indexOf;
        if (!zzpn.zza() || !zze().zze(str, zzbh.zzch)) {
            return null;
        }
        long currentTimeMillis = zzb().currentTimeMillis();
        String[] split = zze().zzd(str, zzbh.zzbg).split(",");
        HashSet hashSet = new HashSet(split.length);
        for (String str3 : split) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        zznu zzo = zzo();
        String zzf = zzo.zzm().zzf(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(zzo.zze().zzd(str, zzbh.zzaz));
        if (!TextUtils.isEmpty(zzf)) {
            builder.authority(zzf + "." + zzo.zze().zzd(str, zzbh.zzba));
        } else {
            builder.authority(zzo.zze().zzd(str, zzbh.zzba));
        }
        builder.path(zzo.zze().zzd(str, zzbh.zzbb));
        zza(builder, "gmp_app_id", zzaVar.zzx(), (Set<String>) unmodifiableSet);
        zza(builder, "gmp_version", "106000", (Set<String>) unmodifiableSet);
        String zzu = zzaVar.zzu();
        zzag zze = zze();
        zzfz<Boolean> zzfzVar = zzbh.zzck;
        if (zze.zze(str, zzfzVar) && zzm().zzo(str)) {
            zzu = "";
        }
        zza(builder, "app_instance_id", zzu, (Set<String>) unmodifiableSet);
        zza(builder, "rdid", zzaVar.zzz(), (Set<String>) unmodifiableSet);
        zza(builder, "bundle_id", zzaVar.zzt(), (Set<String>) unmodifiableSet);
        String zze2 = zzaVar2.zze();
        String zza = zzji.zza(zze2);
        if (!TextUtils.isEmpty(zza)) {
            zze2 = zza;
        }
        zza(builder, "app_event_name", zze2, (Set<String>) unmodifiableSet);
        zza(builder, "app_version", String.valueOf(zzaVar.zzb()), (Set<String>) unmodifiableSet);
        String zzy = zzaVar.zzy();
        if (zze().zze(str, zzfzVar) && zzm().zzs(str) && !TextUtils.isEmpty(zzy) && (indexOf = zzy.indexOf(".")) != -1) {
            zzy = zzy.substring(0, indexOf);
        }
        zza(builder, "os_version", zzy, (Set<String>) unmodifiableSet);
        zza(builder, CampaignEx.JSON_KEY_TIMESTAMP, String.valueOf(zzaVar2.zzc()), (Set<String>) unmodifiableSet);
        if (zzaVar.zzad()) {
            zza(builder, "lat", "1", (Set<String>) unmodifiableSet);
        }
        zza(builder, "privacy_sandbox_version", String.valueOf(zzaVar.zza()), (Set<String>) unmodifiableSet);
        zza(builder, "trigger_uri_source", "1", (Set<String>) unmodifiableSet);
        zza(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), (Set<String>) unmodifiableSet);
        zza(builder, "request_uuid", str2, (Set<String>) unmodifiableSet);
        List<zzfy.zzh> zzf2 = zzaVar2.zzf();
        Bundle bundle = new Bundle();
        for (zzfy.zzh zzhVar : zzf2) {
            String zzg = zzhVar.zzg();
            if (zzhVar.zzj()) {
                bundle.putString(zzg, String.valueOf(zzhVar.zza()));
            } else if (zzhVar.zzk()) {
                bundle.putString(zzg, String.valueOf(zzhVar.zzb()));
            } else if (zzhVar.zzn()) {
                bundle.putString(zzg, zzhVar.zzh());
            } else if (zzhVar.zzl()) {
                bundle.putString(zzg, String.valueOf(zzhVar.zzd()));
            }
        }
        zza(builder, zze().zzd(str, zzbh.zzbf).split("\\|"), bundle, (Set<String>) unmodifiableSet);
        List<zzfy.zzo> zzab = zzaVar.zzab();
        Bundle bundle2 = new Bundle();
        for (zzfy.zzo zzoVar : zzab) {
            String zzg2 = zzoVar.zzg();
            if (zzoVar.zzi()) {
                bundle2.putString(zzg2, String.valueOf(zzoVar.zza()));
            } else if (zzoVar.zzj()) {
                bundle2.putString(zzg2, String.valueOf(zzoVar.zzb()));
            } else if (zzoVar.zzm()) {
                bundle2.putString(zzg2, zzoVar.zzh());
            } else if (zzoVar.zzk()) {
                bundle2.putString(zzg2, String.valueOf(zzoVar.zzc()));
            }
        }
        zza(builder, zze().zzd(str, zzbh.zzbe).split("\\|"), bundle2, (Set<String>) unmodifiableSet);
        zza(builder, "dma", zzaVar.zzac() ? "1" : "0", (Set<String>) unmodifiableSet);
        if (!zzaVar.zzw().isEmpty()) {
            zza(builder, "dma_cps", zzaVar.zzw(), (Set<String>) unmodifiableSet);
        }
        if (zze().zza(zzbh.zzcm) && zzaVar.zzae()) {
            zzfy.zza zzg3 = zzaVar.zzg();
            if (!zzg3.zzh().isEmpty()) {
                zza(builder, "dl_gclid", zzg3.zzh(), (Set<String>) unmodifiableSet);
            }
            if (!zzg3.zzg().isEmpty()) {
                zza(builder, "dl_gbraid", zzg3.zzg(), (Set<String>) unmodifiableSet);
            }
            if (!zzg3.zzf().isEmpty()) {
                zza(builder, "dl_gs", zzg3.zzf(), (Set<String>) unmodifiableSet);
            }
            if (zzg3.zza() > 0) {
                zza(builder, "dl_ss_ts", String.valueOf(zzg3.zza()), (Set<String>) unmodifiableSet);
            }
            if (!zzg3.zzk().isEmpty()) {
                zza(builder, "mr_gclid", zzg3.zzk(), (Set<String>) unmodifiableSet);
            }
            if (!zzg3.zzj().isEmpty()) {
                zza(builder, "mr_gbraid", zzg3.zzj(), (Set<String>) unmodifiableSet);
            }
            if (!zzg3.zzi().isEmpty()) {
                zza(builder, "mr_gs", zzg3.zzi(), (Set<String>) unmodifiableSet);
            }
            if (zzg3.zzb() > 0) {
                zza(builder, "mr_click_ts", String.valueOf(zzg3.zzb()), (Set<String>) unmodifiableSet);
            }
        }
        return new zzno(builder.build().toString(), currentTimeMillis, 1);
    }

    public final zzfy.zzf zza(zzbc zzbcVar) {
        zzfy.zzf.zza zza = zzfy.zzf.zze().zza(zzbcVar.zze);
        Iterator<String> it = zzbcVar.zzf.iterator();
        while (it.hasNext()) {
            String next = it.next();
            zzfy.zzh.zza zza2 = zzfy.zzh.zze().zza(next);
            Object zzc = zzbcVar.zzf.zzc(next);
            Preconditions.checkNotNull(zzc);
            zza(zza2, zzc);
            zza.zza(zza2);
        }
        if (zze().zza(zzbh.zzdi) && !TextUtils.isEmpty(zzbcVar.zzc) && zzbcVar.zzf.zzc("_o") == null) {
            zza.zza((zzfy.zzh) ((com.google.android.gms.internal.measurement.zzjt) zzfy.zzh.zze().zza("_o").zzb(zzbcVar.zzc).zzai()));
        }
        return (zzfy.zzf) ((com.google.android.gms.internal.measurement.zzjt) zza.zzai());
    }

    public static zzfy.zzh zza(zzfy.zzf zzfVar, String str) {
        for (zzfy.zzh zzhVar : zzfVar.zzh()) {
            if (zzhVar.zzg().equals(str)) {
                return zzhVar;
            }
        }
        return null;
    }

    public static <BuilderT extends com.google.android.gms.internal.measurement.zzlb> BuilderT zza(BuilderT buildert, byte[] bArr) throws com.google.android.gms.internal.measurement.zzkb {
        com.google.android.gms.internal.measurement.zzjg zza = com.google.android.gms.internal.measurement.zzjg.zza();
        if (zza != null) {
            return (BuilderT) buildert.zza(bArr, zza);
        }
        return (BuilderT) buildert.zza(bArr);
    }

    public static Object zza(zzfy.zzf zzfVar, String str, Object obj) {
        Object zzb = zzb(zzfVar, str);
        return zzb == null ? obj : zzb;
    }

    private static String zza(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public final List<Long> zza(List<Long> list, List<Integer> list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                zzj().zzu().zza("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    zzj().zzu().zza("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    public static List<Long> zza(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j3 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 << 6) + i11;
                if (i12 < bitSet.length()) {
                    if (bitSet.get(i12)) {
                        j3 |= 1 << i11;
                    }
                }
            }
            arrayList.add(Long.valueOf(j3));
        }
        return arrayList;
    }

    public final Map<String, Object> zza(Bundle bundle, boolean z10) {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(zza((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(zza((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(zza((Bundle) obj, false));
                    }
                    hashMap.put(str, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(str, obj);
            }
        }
        return hashMap;
    }

    public static void zza(zzfy.zzf.zza zzaVar, String str, Object obj) {
        List<zzfy.zzh> zzf = zzaVar.zzf();
        int i10 = 0;
        while (true) {
            if (i10 >= zzf.size()) {
                i10 = -1;
                break;
            } else if (str.equals(zzf.get(i10).zzg())) {
                break;
            } else {
                i10++;
            }
        }
        zzfy.zzh.zza zza = zzfy.zzh.zze().zza(str);
        if (obj instanceof Long) {
            zza.zza(((Long) obj).longValue());
        } else if (obj instanceof String) {
            zza.zzb((String) obj);
        } else if (obj instanceof Double) {
            zza.zza(((Double) obj).doubleValue());
        }
        if (i10 >= 0) {
            zzaVar.zza(i10, zza);
        } else {
            zzaVar.zza(zza);
        }
    }

    private static void zza(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                zza(builder, str3, string, set);
            }
        }
    }

    private static void zza(StringBuilder sb2, int i10, String str, zzfy.zzm zzmVar) {
        if (zzmVar == null) {
            return;
        }
        zza(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzmVar.zzb() != 0) {
            zza(sb2, 4);
            sb2.append("results: ");
            int i11 = 0;
            for (Long l10 : zzmVar.zzi()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i11 = i12;
            }
            sb2.append('\n');
        }
        if (zzmVar.zzd() != 0) {
            zza(sb2, 4);
            sb2.append("status: ");
            int i13 = 0;
            for (Long l11 : zzmVar.zzk()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l11);
                i13 = i14;
            }
            sb2.append('\n');
        }
        if (zzmVar.zza() != 0) {
            zza(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i15 = 0;
            for (zzfy.zze zzeVar : zzmVar.zzh()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzeVar.zzf() ? Integer.valueOf(zzeVar.zza()) : null);
                sb2.append(":");
                sb2.append(zzeVar.zze() ? Long.valueOf(zzeVar.zzb()) : null);
                i15 = i16;
            }
            sb2.append("}\n");
        }
        if (zzmVar.zzc() != 0) {
            zza(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i17 = 0;
            for (zzfy.zzn zznVar : zzmVar.zzj()) {
                int i18 = i17 + 1;
                if (i17 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zznVar.zzf() ? Integer.valueOf(zznVar.zzb()) : null);
                sb2.append(": [");
                Iterator<Long> it = zznVar.zze().iterator();
                int i19 = 0;
                while (it.hasNext()) {
                    long longValue = it.next().longValue();
                    int i20 = i19 + 1;
                    if (i19 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(longValue);
                    i19 = i20;
                }
                sb2.append("]");
                i17 = i18;
            }
            sb2.append("}\n");
        }
        zza(sb2, 3);
        sb2.append("}\n");
    }

    private final void zza(StringBuilder sb2, int i10, List<zzfy.zzh> list) {
        if (list == null) {
            return;
        }
        int i11 = i10 + 1;
        for (zzfy.zzh zzhVar : list) {
            if (zzhVar != null) {
                zza(sb2, i11);
                sb2.append("param {\n");
                zza(sb2, i11, "name", zzhVar.zzm() ? zzi().zzb(zzhVar.zzg()) : null);
                zza(sb2, i11, "string_value", zzhVar.zzn() ? zzhVar.zzh() : null);
                zza(sb2, i11, "int_value", zzhVar.zzl() ? Long.valueOf(zzhVar.zzd()) : null);
                zza(sb2, i11, "double_value", zzhVar.zzj() ? Double.valueOf(zzhVar.zza()) : null);
                if (zzhVar.zzc() > 0) {
                    zza(sb2, i11, zzhVar.zzi());
                }
                zza(sb2, i11);
                sb2.append("}\n");
            }
        }
    }

    private final void zza(StringBuilder sb2, int i10, zzfo.zzc zzcVar) {
        if (zzcVar == null) {
            return;
        }
        zza(sb2, i10);
        sb2.append("filter {\n");
        if (zzcVar.zzg()) {
            zza(sb2, i10, "complement", Boolean.valueOf(zzcVar.zzf()));
        }
        if (zzcVar.zzi()) {
            zza(sb2, i10, "param_name", zzi().zzb(zzcVar.zze()));
        }
        if (zzcVar.zzj()) {
            int i11 = i10 + 1;
            zzfo.zzf zzd = zzcVar.zzd();
            if (zzd != null) {
                zza(sb2, i11);
                sb2.append("string_filter");
                sb2.append(" {\n");
                if (zzd.zzj()) {
                    zza(sb2, i11, "match_type", zzd.zzb().name());
                }
                if (zzd.zzi()) {
                    zza(sb2, i11, "expression", zzd.zze());
                }
                if (zzd.zzh()) {
                    zza(sb2, i11, "case_sensitive", Boolean.valueOf(zzd.zzg()));
                }
                if (zzd.zza() > 0) {
                    zza(sb2, i11 + 1);
                    sb2.append("expression_list {\n");
                    for (String str : zzd.zzf()) {
                        zza(sb2, i11 + 2);
                        sb2.append(str);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                zza(sb2, i11);
                sb2.append("}\n");
            }
        }
        if (zzcVar.zzh()) {
            zza(sb2, i10 + 1, "number_filter", zzcVar.zzc());
        }
        zza(sb2, i10);
        sb2.append("}\n");
    }

    private static void zza(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private static void zza(StringBuilder sb2, int i10, String str, zzfo.zzd zzdVar) {
        if (zzdVar == null) {
            return;
        }
        zza(sb2, i10);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzdVar.zzh()) {
            zza(sb2, i10, "comparison_type", zzdVar.zza().name());
        }
        if (zzdVar.zzj()) {
            zza(sb2, i10, "match_as_float", Boolean.valueOf(zzdVar.zzg()));
        }
        if (zzdVar.zzi()) {
            zza(sb2, i10, "comparison_value", zzdVar.zzd());
        }
        if (zzdVar.zzl()) {
            zza(sb2, i10, "min_comparison_value", zzdVar.zzf());
        }
        if (zzdVar.zzk()) {
            zza(sb2, i10, "max_comparison_value", zzdVar.zze());
        }
        zza(sb2, i10);
        sb2.append("}\n");
    }

    private static void zza(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static void zza(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zza(sb2, i10 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public final void zza(zzfy.zzh.zza zzaVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzaVar.zze().zzc().zzb().zzd();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    zzfy.zzh.zza zze = zzfy.zzh.zze();
                    for (String str : bundle.keySet()) {
                        zzfy.zzh.zza zza = zzfy.zzh.zze().zza(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            zza.zza(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            zza.zzb((String) obj2);
                        } else if (obj2 instanceof Double) {
                            zza.zza(((Double) obj2).doubleValue());
                        }
                        zze.zza(zza);
                    }
                    if (zze.zza() > 0) {
                        arrayList.add((zzfy.zzh) ((com.google.android.gms.internal.measurement.zzjt) zze.zzai()));
                    }
                }
            }
            zzaVar.zza(arrayList);
            return;
        }
        zzj().zzg().zza("Ignoring invalid (type) event param value", obj);
    }

    public final void zza(zzfy.zzo.zza zzaVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzaVar.zzc().zzb().zza();
        if (obj instanceof String) {
            zzaVar.zzb((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzaVar.zza(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzaVar.zza(((Double) obj).doubleValue());
        } else {
            zzj().zzg().zza("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public static boolean zza(zzbf zzbfVar, zzo zzoVar) {
        Preconditions.checkNotNull(zzbfVar);
        Preconditions.checkNotNull(zzoVar);
        return (TextUtils.isEmpty(zzoVar.zzb) && TextUtils.isEmpty(zzoVar.zzp)) ? false : true;
    }

    public static boolean zza(List<Long> list, int i10) {
        if (i10 < (list.size() << 6)) {
            return ((1 << (i10 % 64)) & list.get(i10 / 64).longValue()) != 0;
        }
        return false;
    }

    public final boolean zza(long j3, long j10) {
        return j3 == 0 || j10 <= 0 || Math.abs(zzb().currentTimeMillis() - j3) > j10;
    }
}

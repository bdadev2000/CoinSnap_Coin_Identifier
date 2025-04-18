package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzow;
import com.google.android.gms.internal.measurement.zzpb;
import com.google.android.gms.internal.measurement.zzpc;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpi;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpo;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.android.gms.internal.measurement.zzpu;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqa;
import com.google.android.gms.internal.measurement.zzqf;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.vungle.ads.internal.signals.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzbh {
    public static final zzfz<Long> zza;
    public static final zzfz<Long> zzaa;
    public static final zzfz<Long> zzab;
    public static final zzfz<Long> zzac;
    public static final zzfz<Integer> zzad;
    public static final zzfz<Long> zzae;
    public static final zzfz<Long> zzaf;
    public static final zzfz<Integer> zzag;
    public static final zzfz<Integer> zzah;
    public static final zzfz<Integer> zzai;
    public static final zzfz<Integer> zzaj;
    public static final zzfz<Integer> zzak;
    public static final zzfz<Long> zzal;
    public static final zzfz<Boolean> zzam;
    public static final zzfz<String> zzan;
    public static final zzfz<Long> zzao;
    public static final zzfz<Integer> zzap;
    public static final zzfz<Double> zzaq;
    public static final zzfz<Integer> zzar;
    public static final zzfz<Integer> zzas;
    public static final zzfz<Integer> zzat;
    public static final zzfz<Integer> zzau;
    public static final zzfz<Long> zzav;
    public static final zzfz<Long> zzaw;
    public static final zzfz<Integer> zzax;
    public static final zzfz<Integer> zzay;
    public static final zzfz<String> zzaz;
    public static final zzfz<Long> zzb;
    public static final zzfz<String> zzba;
    public static final zzfz<String> zzbb;
    public static final zzfz<Long> zzbc;
    public static final zzfz<String> zzbd;
    public static final zzfz<String> zzbe;
    public static final zzfz<String> zzbf;
    public static final zzfz<String> zzbg;
    public static final zzfz<Long> zzbh;
    public static final zzfz<Integer> zzbi;
    public static final zzfz<Boolean> zzbj;
    public static final zzfz<Boolean> zzbk;
    public static final zzfz<Boolean> zzbl;
    public static final zzfz<Boolean> zzbm;
    public static final zzfz<Boolean> zzbn;
    public static final zzfz<Boolean> zzbo;
    public static final zzfz<Boolean> zzbp;
    public static final zzfz<Boolean> zzbq;
    public static final zzfz<Boolean> zzbr;
    public static final zzfz<Boolean> zzbs;
    public static final zzfz<Integer> zzbt;
    public static final zzfz<Boolean> zzbu;
    public static final zzfz<Boolean> zzbv;
    public static final zzfz<Boolean> zzbw;
    public static final zzfz<Boolean> zzbx;
    public static final zzfz<Boolean> zzby;
    public static final zzfz<Boolean> zzbz;
    public static final zzfz<Long> zzc;
    public static final zzfz<String> zzca;
    public static final zzfz<Boolean> zzcb;
    public static final zzfz<Boolean> zzcc;
    public static final zzfz<Boolean> zzcd;
    public static final zzfz<Boolean> zzce;
    public static final zzfz<Boolean> zzcf;
    public static final zzfz<Boolean> zzcg;
    public static final zzfz<Boolean> zzch;
    public static final zzfz<Boolean> zzci;
    public static final zzfz<Boolean> zzcj;
    public static final zzfz<Boolean> zzck;
    public static final zzfz<Boolean> zzcl;
    public static final zzfz<Boolean> zzcm;
    public static final zzfz<Boolean> zzcn;
    public static final zzfz<Boolean> zzco;
    public static final zzfz<Boolean> zzcp;
    public static final zzfz<Boolean> zzcq;
    public static final zzfz<Boolean> zzcr;
    public static final zzfz<Boolean> zzcs;
    public static final zzfz<Boolean> zzct;
    public static final zzfz<Boolean> zzcu;
    public static final zzfz<Boolean> zzcv;
    public static final zzfz<Boolean> zzcw;
    public static final zzfz<Boolean> zzcx;
    public static final zzfz<Boolean> zzcy;
    public static final zzfz<Boolean> zzcz;
    public static final zzfz<Long> zzd;
    public static final zzfz<Boolean> zzda;
    public static final zzfz<Boolean> zzdb;
    public static final zzfz<Boolean> zzdc;
    public static final zzfz<Boolean> zzdd;
    public static final zzfz<Boolean> zzde;
    public static final zzfz<Boolean> zzdf;
    public static final zzfz<Boolean> zzdg;
    public static final zzfz<Boolean> zzdh;
    public static final zzfz<Boolean> zzdi;
    public static final zzfz<Boolean> zzdj;
    public static final zzfz<Boolean> zzdk;
    public static final zzfz<Boolean> zzdl;
    private static final List<zzfz<?>> zzdm = Collections.synchronizedList(new ArrayList());
    public static final zzfz<String> zze;
    public static final zzfz<String> zzf;
    public static final zzfz<Integer> zzg;
    public static final zzfz<Integer> zzh;
    public static final zzfz<Integer> zzi;
    public static final zzfz<Integer> zzj;
    public static final zzfz<Integer> zzk;
    public static final zzfz<Integer> zzl;
    public static final zzfz<Integer> zzm;
    public static final zzfz<Integer> zzn;
    public static final zzfz<Integer> zzo;
    public static final zzfz<Integer> zzp;
    public static final zzfz<String> zzq;
    public static final zzfz<String> zzr;
    public static final zzfz<Long> zzs;
    public static final zzfz<Long> zzt;
    public static final zzfz<Long> zzu;
    public static final zzfz<Long> zzv;
    public static final zzfz<Long> zzw;
    public static final zzfz<Long> zzx;
    public static final zzfz<Long> zzy;
    public static final zzfz<Long> zzz;

    static {
        Collections.synchronizedSet(new HashSet());
        zza = zzb("measurement.ad_id_cache_time", 10000L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzbj
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf;
                valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zza());
                return valueOf;
            }
        });
        zzb = zzb("measurement.app_uninstalled_additional_ad_id_cache_time", 3600000L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcz
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf;
                valueOf = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzb());
                return valueOf;
            }
        });
        Long valueOf = Long.valueOf(j.TWENTY_FOUR_HOURS_MILLIS);
        zzc = zzb("measurement.monitoring.sample_period_millis", valueOf, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdl
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf2;
                valueOf2 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzt());
                return valueOf2;
            }
        });
        zzd = zza("measurement.config.cache_time", valueOf, 3600000L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdx
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf2;
                valueOf2 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzd());
                return valueOf2;
            }
        }, false);
        zze = zzb("measurement.config.url_scheme", Constants.SCHEME, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzej
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                String zzas2;
                zzas2 = com.google.android.gms.internal.measurement.zzng.zzas();
                return zzas2;
            }
        });
        zzf = zzb("measurement.config.url_authority", "app-measurement.com", new zzfx() { // from class: com.google.android.gms.measurement.internal.zzev
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                String zzar2;
                zzar2 = com.google.android.gms.internal.measurement.zzng.zzar();
                return zzar2;
            }
        });
        zzg = zzb("measurement.upload.max_bundles", 100, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfh
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf2;
                valueOf2 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzaf());
                return valueOf2;
            }
        });
        Integer valueOf2 = Integer.valueOf(C.DEFAULT_BUFFER_SEGMENT_SIZE);
        zzh = zzb("measurement.upload.max_batch_size", valueOf2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzft
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf3;
                valueOf3 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzan());
                return valueOf3;
            }
        });
        zzi = zzb("measurement.upload.max_bundle_size", valueOf2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzbu
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf3;
                valueOf3 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzae());
                return valueOf3;
            }
        });
        zzj = zzb("measurement.upload.max_events_per_bundle", 1000, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcg
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf3;
                valueOf3 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzai());
                return valueOf3;
            }
        });
        Integer valueOf3 = Integer.valueOf(DefaultOggSeeker.MATCH_BYTE_RANGE);
        zzk = zzb("measurement.upload.max_events_per_day", valueOf3, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcf
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzaj());
                return valueOf4;
            }
        });
        zzl = zzb("measurement.upload.max_error_events_per_day", 1000, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcp
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzah());
                return valueOf4;
            }
        });
        zzm = zzb("measurement.upload.max_public_events_per_day", Integer.valueOf(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS), new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcs
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzak());
                return valueOf4;
            }
        });
        zzn = zzb("measurement.upload.max_conversions_per_day", 10000, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcr
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzag());
                return valueOf4;
            }
        });
        zzo = zzb("measurement.upload.max_realtime_events_per_day", 10, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcu
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzam());
                return valueOf4;
            }
        });
        zzp = zzb("measurement.store.max_stored_events_per_app", valueOf3, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzct
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzk());
                return valueOf4;
            }
        });
        zzq = zzb("measurement.upload.url", "https://app-measurement.com/a", new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcw
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                String zzbb2;
                zzbb2 = com.google.android.gms.internal.measurement.zzng.zzbb();
                return zzbb2;
            }
        });
        zzr = zzb("measurement.sgtm.google_signal.url", "https://app-measurement.com/s", new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcv
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                String zzau2;
                zzau2 = com.google.android.gms.internal.measurement.zzng.zzau();
                return zzau2;
            }
        });
        zzs = zzb("measurement.upload.backoff_period", 43200000L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcy
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzab());
                return valueOf4;
            }
        });
        zzt = zzb("measurement.upload.window_interval", 3600000L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcx
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzaq());
                return valueOf4;
            }
        });
        zzu = zzb("measurement.upload.interval", 3600000L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdc
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzad());
                return valueOf4;
            }
        });
        zzv = zzb("measurement.upload.realtime_upload_interval", 10000L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdb
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzu());
                return valueOf4;
            }
        });
        zzw = zzb("measurement.upload.debug_upload_interval", 1000L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzde
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zze());
                return valueOf4;
            }
        });
        zzx = zzb("measurement.upload.minimum_delay", 500L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdd
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzs());
                return valueOf4;
            }
        });
        zzy = zzb("measurement.alarm_manager.minimum_interval", Long.valueOf(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS), new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdg
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzr());
                return valueOf4;
            }
        });
        zzz = zzb("measurement.upload.stale_data_deletion_interval", valueOf, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdf
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzx());
                return valueOf4;
            }
        });
        zzaa = zzb("measurement.upload.refresh_blacklisted_config_interval", 604800000L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdi
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzv());
                return valueOf4;
            }
        });
        zzab = zzb("measurement.upload.initial_upload_delay_time", 15000L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdh
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzac());
                return valueOf4;
            }
        });
        zzac = zzb("measurement.upload.retry_time", 1800000L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdk
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzap());
                return valueOf4;
            }
        });
        zzad = zzb("measurement.upload.retry_count", 6, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdm
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzao());
                return valueOf4;
            }
        });
        zzae = zzb("measurement.upload.max_queue_time", 518400000L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdo
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzal());
                return valueOf4;
            }
        });
        zzaf = zzb("measurement.upload.google_signal_max_queue_time", 300000L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdn
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzg());
                return valueOf4;
            }
        });
        zzag = zzb("measurement.lifetimevalue.max_currency_tracked", 4, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdq
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzh());
                return valueOf4;
            }
        });
        zzah = zzb("measurement.audience.filter_result_max_count", 200, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdp
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzm());
                return valueOf4;
            }
        });
        zzai = zza("measurement.upload.max_public_user_properties", 100);
        zzaj = zza("measurement.upload.max_event_name_cardinality", 2000);
        zzak = zza("measurement.upload.max_public_event_params", 100);
        zzal = zzb("measurement.service_client.idle_disconnect_millis", Long.valueOf(DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS), new zzfx() { // from class: com.google.android.gms.measurement.internal.zzds
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzw());
                return valueOf4;
            }
        });
        Boolean bool = Boolean.FALSE;
        zzam = zzb("measurement.test.boolean_flag", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdr
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzph.zzf());
                return valueOf4;
            }
        });
        zzan = zzb("measurement.test.string_flag", "---", new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdu
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                String zze2;
                zze2 = zzph.zze();
                return zze2;
            }
        });
        zzao = zzb("measurement.test.long_flag", -1L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdt
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(zzph.zzd());
                return valueOf4;
            }
        });
        zza("measurement.test.cached_long_flag", -1L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdv
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(zzph.zzb());
                return valueOf4;
            }
        });
        zzap = zzb("measurement.test.int_flag", -2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdy
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) zzph.zzc());
                return valueOf4;
            }
        });
        zzaq = zzb("measurement.test.double_flag", Double.valueOf(-3.0d), new zzfx() { // from class: com.google.android.gms.measurement.internal.zzea
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Double valueOf4;
                valueOf4 = Double.valueOf(zzph.zza());
                return valueOf4;
            }
        });
        zzar = zzb("measurement.experiment.max_ids", 50, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdz
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzl());
                return valueOf4;
            }
        });
        zzas = zzb("measurement.upload.max_item_scoped_custom_parameters", 27, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzec
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzn());
                return valueOf4;
            }
        });
        zzat = zza("measurement.upload.max_event_parameter_value_length", 500, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzeb
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzj());
                return valueOf4;
            }
        });
        zzau = zzb("measurement.max_bundles_per_iteration", 100, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzee
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzc());
                return valueOf4;
            }
        });
        zzav = zzb("measurement.sdk.attribution.cache.ttl", 604800000L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzed
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzz());
                return valueOf4;
            }
        });
        zzaw = zzb("measurement.redaction.app_instance_id.ttl", 7200000L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzeg
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzaa());
                return valueOf4;
            }
        });
        zzax = zzb("measurement.rb.attribution.client.min_ad_services_version", 7, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzei
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzq());
                return valueOf4;
            }
        });
        zzay = zzb("measurement.dma_consent.max_daily_dcu_realtime_events", 1, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzeh
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzi());
                return valueOf4;
            }
        });
        zzaz = zzb("measurement.rb.attribution.uri_scheme", Constants.SCHEME, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzek
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                String zzba2;
                zzba2 = com.google.android.gms.internal.measurement.zzng.zzba();
                return zzba2;
            }
        });
        zzba = zzb("measurement.rb.attribution.uri_authority", "google-analytics.com", new zzfx() { // from class: com.google.android.gms.measurement.internal.zzem
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                String zzax2;
                zzax2 = com.google.android.gms.internal.measurement.zzng.zzax();
                return zzax2;
            }
        });
        zzbb = zzb("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion", new zzfx() { // from class: com.google.android.gms.measurement.internal.zzel
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                String zzay2;
                zzay2 = com.google.android.gms.internal.measurement.zzng.zzay();
                return zzay2;
            }
        });
        zzbc = zzb("measurement.session.engagement_interval", 3600000L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzeo
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzf());
                return valueOf4;
            }
        });
        zzbd = zzb("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword", new zzfx() { // from class: com.google.android.gms.measurement.internal.zzen
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                String zzav2;
                zzav2 = com.google.android.gms.internal.measurement.zzng.zzav();
                return zzav2;
            }
        });
        zzbe = zzb("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot", new zzfx() { // from class: com.google.android.gms.measurement.internal.zzeq
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                String zzbc2;
                zzbc2 = com.google.android.gms.internal.measurement.zzng.zzbc();
                return zzbc2;
            }
        });
        zzbf = zzb("measurement.rb.attribution.event_params", "value|currency", new zzfx() { // from class: com.google.android.gms.measurement.internal.zzep
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                String zzat2;
                zzat2 = com.google.android.gms.internal.measurement.zzng.zzat();
                return zzat2;
            }
        });
        zzbg = zzb("measurement.rb.attribution.query_parameters_to_remove", "", new zzfx() { // from class: com.google.android.gms.measurement.internal.zzer
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                String zzaz2;
                zzaz2 = com.google.android.gms.internal.measurement.zzng.zzaz();
                return zzaz2;
            }
        });
        zzbh = zzb("measurement.rb.attribution.max_queue_time", 1209600000L, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzeu
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Long valueOf4;
                valueOf4 = Long.valueOf(com.google.android.gms.internal.measurement.zzng.zzy());
                return valueOf4;
            }
        });
        zzb("measurement.rb.attribution.max_trigger_uris_queried_at_once", 0, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzet
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzp());
                return valueOf4;
            }
        });
        zzbi = zzb("measurement.rb.max_trigger_registrations_per_day", 0, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzew
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zzng.zzo());
                return valueOf4;
            }
        });
        Boolean bool2 = Boolean.TRUE;
        zzbj = zzb("measurement.config.bundle_for_all_apps_on_backgrounded", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzey
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzng.zzbd());
                return valueOf4;
            }
        });
        zzbk = zzb("measurement.config.notify_trigger_uris_on_backgrounded", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzex
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzng.zzbe());
                return valueOf4;
            }
        });
        zzbl = zzb("measurement.collection.log_event_and_bundle_v2", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfa
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpi.zza());
                return valueOf4;
            }
        });
        zzbm = zza("measurement.quality.checksum", bool);
        zzbn = zzb("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzez
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzoe.zzc());
                return valueOf4;
            }
        });
        zzbo = zzb("measurement.audience.refresh_event_count_filters_timestamp", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfc
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzoe.zzb());
                return valueOf4;
            }
        });
        zzbp = zza("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfe
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzoe.zzd());
                return valueOf4;
            }
        });
        zzbq = zzb("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfd
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpc.zza());
                return valueOf4;
            }
        });
        zzbr = zzb("measurement.integration.disable_firebase_instance_id", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfg
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpz.zzb());
                return valueOf4;
            }
        });
        zzbs = zzb("measurement.collection.service.update_with_analytics_fix", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzff
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzqa.zza());
                return valueOf4;
            }
        });
        zzbt = zzb("measurement.service.storage_consent_support_version", 203600, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfi
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Integer valueOf4;
                valueOf4 = Integer.valueOf((int) com.google.android.gms.internal.measurement.zznl.zza());
                return valueOf4;
            }
        });
        zzbu = zzb("measurement.service.store_null_safelist", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfk
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzny.zzb());
                return valueOf4;
            }
        });
        zzbv = zzb("measurement.service.store_safelist", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfj
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzny.zzc());
                return valueOf4;
            }
        });
        zzbw = zzb("measurement.session_stitching_token_enabled", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfm
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpo.zzb());
                return valueOf4;
            }
        });
        zzbx = zza("measurement.sgtm.service", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfl
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpu.zze());
                return valueOf4;
            }
        });
        zzby = zza("measurement.sgtm.preview_mode_enabled", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfn
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpu.zzc());
                return valueOf4;
            }
        });
        zzbz = zza("measurement.sgtm.rollout_percentage_fix", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfq
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpu.zzd());
                return valueOf4;
            }
        });
        zzca = zza("measurement.sgtm.app_allowlist", "de.zalando.mobile.internal,de.zalando.mobile.internal.debug,de.zalando.lounge.dev,grit.storytel.app,com.rbc.mobile.android,com.rbc.mobile.android,com.dylvian.mango.activities,com.home24.android,com.home24.android.staging,se.lf.mobile.android,se.lf.mobile.android.beta,se.lf.mobile.android.rc,se.lf.mobile.android.test,se.lf.mobile.android.test.debug,com.boots.flagship.android,com.boots.flagshiproi.android,de.zalando.mobile,com.trivago,com.getyourguide.android,es.mobail.meliarewards,se.nansen.coop.debug,se.nansen.coop,se.coop.coop.qa,com.booking,com.google.firebaseengage,com.mse.mseapp.dev,com.mse.mseapp,pl.eobuwie.eobuwieapp,br.com.eventim.mobile.app.Android,ch.ticketcorner.mobile.app.Android,de.eventim.mobile.app.Android,dk.billetlugen.mobile.app.Android,nl.eventim.mobile.app.Android,com.asos.app,com.blueshieldca.prod,dk.magnetix.tivoliapp,matas.matas.internal,nl.omoda,com.thetrainline,com.simo.androidtest,de.aboutyou.mobile.app,com.hometogo,de.casamundo.casamundomobile,it.casevacanz,eu.coolblue.shop,com.stihl.app,com.indeed.android.jobsearch,com.homeretailgroup.argos.android,com.dylvian.mango.activities.pre,se.nansen.coop.qa", new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfp
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                String zzaw2;
                zzaw2 = com.google.android.gms.internal.measurement.zzng.zzaw();
                return zzaw2;
            }
        });
        zzcb = zzb("measurement.sgtm.upload_queue", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfs
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpu.zzf());
                return valueOf4;
            }
        });
        zzcc = zzb("measurement.sgtm.google_signal.enable", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfr
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpu.zzb());
                return valueOf4;
            }
        });
        zzcd = zzb("measurement.gmscore_feature_tracking", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfu
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzow.zzb());
                return valueOf4;
            }
        });
        zzce = zzb("measurement.gmscore_client_telemetry", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfw
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                return Boolean.valueOf(zzow.zzc());
            }
        });
        zzcf = zzb("measurement.gmscore_network_migration", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfv
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpb.zzb());
                return valueOf4;
            }
        });
        zzcg = zza("measurement.fix_health_monitor_stack_trace", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfy
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzok.zzb());
                return valueOf4;
            }
        });
        zzch = zza("measurement.rb.attribution.service", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzbl
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpn.zzi());
                return valueOf4;
            }
        });
        zzci = zza("measurement.rb.attribution.client2", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzbo
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpn.zze());
                return valueOf4;
            }
        });
        zzcj = zzb("measurement.rb.attribution.uuid_generation", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzbn
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpn.zzk());
                return valueOf4;
            }
        });
        zzck = zzb("measurement.rb.attribution.enable_trigger_redaction", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzbq
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpn.zzj());
                return valueOf4;
            }
        });
        zzb("measurement.rb.attribution.followup1.service", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzbp
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpn.zzf());
                return valueOf4;
            }
        });
        zzcl = zzb("measurement.rb.attribution.retry_disposition", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzbs
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpn.zzh());
                return valueOf4;
            }
        });
        zzcm = zzb("measurement.rb.attribution.ad_campaign_info", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzbr
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpn.zzb());
                return valueOf4;
            }
        });
        zzcn = zza("measurement.rb.attribution.improved_retry", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzbt
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpn.zzl());
                return valueOf4;
            }
        });
        zzco = zzb("measurement.client.sessions.enable_fix_background_engagement", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzbw
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                return Boolean.valueOf(zzpt.zza());
            }
        });
        zzcp = zzb("measurement.client.sessions.enable_pause_engagement_in_background", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzby
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                return Boolean.valueOf(zzpt.zzb());
            }
        });
        zzcq = zzb("measurement.dma_consent.service_dcu_event2", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzbx
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznx.zzb());
                return valueOf4;
            }
        });
        zzcr = zzb("measurement.dma_consent.services_database_update_fix", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzca
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznx.zza());
                return valueOf4;
            }
        });
        zzcs = zzb("measurement.dma_consent.setting_npa_inline_fix", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzbz
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznx.zzc());
                return valueOf4;
            }
        });
        zzct = zza("measurement.gbraid_campaign.gbraid.client", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcc
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzov.zzb());
                return valueOf4;
            }
        });
        zzcu = zza("measurement.gbraid_campaign.gbraid.service", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcb
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzov.zzc());
                return valueOf4;
            }
        });
        zzcv = zzb("measurement.service.consent.pfo_on_fx", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzce
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzod.zzb());
                return valueOf4;
            }
        });
        zzcw = zzb("measurement.service.consent.params_on_fx", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcd
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzod.zza());
                return valueOf4;
            }
        });
        zzcx = zza("measurement.consent.stop_reset_on_storage_denied.client", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcn
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznm.zzb());
                return valueOf4;
            }
        });
        zzcy = zza("measurement.consent.stop_reset_on_storage_denied.service", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzda
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznm.zzc());
                return valueOf4;
            }
        });
        zzcz = zzb("measurement.consent.scrub_audience_data_analytics_consent", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdj
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznm.zzd());
                return valueOf4;
            }
        });
        zzda = zzb("measurement.consent.fix_first_open_count_from_snapshot", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzdw
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznm.zze());
                return valueOf4;
            }
        });
        zzdb = zzb("measurement.fix_engagement_on_reset_analytics_data", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzef
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzoj.zza());
                return valueOf4;
            }
        });
        zzdc = zzb("measurement.rb.attribution.service.bundle_on_backgrounded", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzes
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpn.zzd());
                return valueOf4;
            }
        });
        zzdd = zzb("measurement.rb.attribution.client.bundle_on_backgrounded", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfb
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpn.zzc());
                return valueOf4;
            }
        });
        zzde = zzb("measurement.set_default_event_parameters_propagate_clear.service.dev", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzfo
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzns.zzb());
                return valueOf4;
            }
        });
        zzdf = zzb("measurement.set_default_event_parameters_propagate_clear.client.dev", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzbm
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzns.zza());
                return valueOf4;
            }
        });
        zzdg = zzb("measurement.set_default_event_parameters_with_backfill.service", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzbv
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznr.zzd());
                return valueOf4;
            }
        });
        zzb("measurement.set_default_event_parameters_with_backfill.client.dev", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzci
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznr.zzb());
                return valueOf4;
            }
        });
        zzdh = zzb("measurement.defensively_copy_bundles_validate_default_params", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzch
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznr.zzc());
                return valueOf4;
            }
        });
        zzdi = zzb("measurement.fix_origin_in_upload_utils.service", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzck
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzop.zza());
                return valueOf4;
            }
        });
        zzb("measurement.chimera.parameter.service", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcj
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zznf.zza());
                return valueOf4;
            }
        });
        zzdj = zzb("measurement.service.ad_impression.convert_value_to_double", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcm
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzna.zza());
                return valueOf4;
            }
        });
        zzdk = zzb("measurement.persisted_config_defensive_copies", bool, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcl
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(com.google.android.gms.internal.measurement.zzoq.zza());
                return valueOf4;
            }
        });
        zzb("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzco
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzpn.zzg());
                return valueOf4;
            }
        });
        zzdl = zzb("measurement.currency.escape_underscore_fix", bool2, new zzfx() { // from class: com.google.android.gms.measurement.internal.zzcq
            @Override // com.google.android.gms.measurement.internal.zzfx
            public final Object zza() {
                Boolean valueOf4;
                valueOf4 = Boolean.valueOf(zzqf.zza());
                return valueOf4;
            }
        });
    }

    private static <V> zzfz<V> zza(String str, V v10, zzfx<V> zzfxVar) {
        return zza(str, v10, v10, zzfxVar, true);
    }

    private static <V> zzfz<V> zzb(String str, V v10, zzfx<V> zzfxVar) {
        return zza(str, v10, v10, zzfxVar, false);
    }

    private static <V> zzfz<V> zza(String str, V v10, V v11, zzfx<V> zzfxVar, boolean z10) {
        zzfz<V> zzfzVar = new zzfz<>(str, v10, v11, zzfxVar);
        if (z10) {
            zzdm.add(zzfzVar);
        }
        return zzfzVar;
    }

    private static <V> zzfz<V> zza(String str, V v10) {
        return zza(str, v10, v10, null, false);
    }

    public static Map<String, String> zza(Context context) {
        com.google.android.gms.internal.measurement.zzgu zza2 = com.google.android.gms.internal.measurement.zzgu.zza(context.getContentResolver(), com.google.android.gms.internal.measurement.zzhk.zza("com.google.android.gms.measurement"), new Runnable() { // from class: com.google.android.gms.measurement.internal.zzbk
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.measurement.zzhj.zzc();
            }
        });
        return zza2 == null ? Collections.emptyMap() : zza2.zza();
    }
}

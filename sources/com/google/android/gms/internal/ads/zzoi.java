package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@RequiresApi
/* loaded from: classes3.dex */
public final class zzoi implements zzmd, zzoj {
    private final Context zza;
    private final zzok zzb;
    private final PlaybackSession zzc;

    @Nullable
    private String zzi;

    @Nullable
    private PlaybackMetrics.Builder zzj;
    private int zzk;

    @Nullable
    private zzbp zzn;

    @Nullable
    private zzoh zzo;

    @Nullable
    private zzoh zzp;

    @Nullable
    private zzoh zzq;

    @Nullable
    private zzaf zzr;

    @Nullable
    private zzaf zzs;

    @Nullable
    private zzaf zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzcb zze = new zzcb();
    private final zzca zzf = new zzca();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzoi(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzog zzogVar = new zzog(zzog.zza);
        this.zzb = zzogVar;
        zzogVar.zzh(this);
    }

    @Nullable
    public static zzoi zzb(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager b2 = b.b(context.getSystemService("media_metrics"));
        if (b2 == null) {
            return null;
        }
        createPlaybackSession = b2.createPlaybackSession();
        return new zzoi(context, createPlaybackSession);
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzr(int i2) {
        switch (zzeu.zzk(i2)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l2 = (Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l3 = (Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l3 == null ? 0L : l3.longValue());
            this.zzj.setStreamSource((l3 == null || l3.longValue() <= 0) ? 0 : 1);
            PlaybackSession playbackSession = this.zzc;
            build = this.zzj.build();
            playbackSession.reportPlaybackMetrics(build);
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j2, @Nullable zzaf zzafVar, int i2) {
        if (Objects.equals(this.zzs, zzafVar)) {
            return;
        }
        int i3 = this.zzs == null ? 1 : 0;
        this.zzs = zzafVar;
        zzx(0, j2, zzafVar, i3);
    }

    private final void zzu(long j2, @Nullable zzaf zzafVar, int i2) {
        if (Objects.equals(this.zzt, zzafVar)) {
            return;
        }
        int i3 = this.zzt == null ? 1 : 0;
        this.zzt = zzafVar;
        zzx(2, j2, zzafVar, i3);
    }

    @RequiresNonNull({"metricsBuilder"})
    private final void zzv(zzcc zzccVar, @Nullable zzuy zzuyVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzuyVar == null || (zza = zzccVar.zza(zzuyVar.zza)) == -1) {
            return;
        }
        int i2 = 0;
        zzccVar.zzd(zza, this.zzf, false);
        zzccVar.zze(this.zzf.zzc, this.zze, 0L);
        zzax zzaxVar = this.zze.zzd.zzb;
        if (zzaxVar != null) {
            int zzn = zzeu.zzn(zzaxVar.zza);
            i2 = zzn != 0 ? zzn != 1 ? zzn != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i2);
        zzcb zzcbVar = this.zze;
        long j2 = zzcbVar.zzm;
        if (j2 != -9223372036854775807L && !zzcbVar.zzk && !zzcbVar.zzi && !zzcbVar.zzb()) {
            builder.setMediaDurationMillis(zzeu.zzu(j2));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j2, @Nullable zzaf zzafVar, int i2) {
        if (Objects.equals(this.zzr, zzafVar)) {
            return;
        }
        int i3 = this.zzr == null ? 1 : 0;
        this.zzr = zzafVar;
        zzx(1, j2, zzafVar, i3);
    }

    private final void zzx(int i2, long j2, @Nullable zzaf zzafVar, int i3) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        timeSinceCreatedMillis = c.m(i2).setTimeSinceCreatedMillis(j2 - this.zzd);
        if (zzafVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i3 != 1 ? 1 : 2);
            String str = zzafVar.zzm;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzafVar.zzn;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzafVar.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = zzafVar.zzi;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = zzafVar.zzt;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = zzafVar.zzu;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = zzafVar.zzB;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = zzafVar.zzC;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = zzafVar.zzd;
            if (str4 != null) {
                int i9 = zzeu.zza;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f2 = zzafVar.zzv;
            if (f2 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f2);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        PlaybackSession playbackSession = this.zzc;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzy(@Nullable zzoh zzohVar) {
        if (zzohVar != null) {
            return zzohVar.zzc.equals(this.zzb.zze());
        }
        return false;
    }

    public final LogSessionId zza() {
        LogSessionId sessionId;
        sessionId = this.zzc.getSessionId();
        return sessionId;
    }

    @Override // com.google.android.gms.internal.ads.zzoj
    public final void zzc(zzmb zzmbVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        zzuy zzuyVar = zzmbVar.zzd;
        if (zzuyVar == null || !zzuyVar.zzb()) {
            zzs();
            this.zzi = str;
            playerName = c.j().setPlayerName("AndroidXMedia3");
            playerVersion = playerName.setPlayerVersion("1.4.0");
            this.zzj = playerVersion;
            zzv(zzmbVar.zzb, zzmbVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoj
    public final void zzd(zzmb zzmbVar, String str, boolean z2) {
        zzuy zzuyVar = zzmbVar.zzd;
        if ((zzuyVar == null || !zzuyVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zze(zzmb zzmbVar, zzaf zzafVar, zzib zzibVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzf(zzmb zzmbVar, int i2, long j2, long j3) {
        zzuy zzuyVar = zzmbVar.zzd;
        if (zzuyVar != null) {
            String zzf = this.zzb.zzf(zzmbVar.zzb, zzuyVar);
            Long l2 = (Long) this.zzh.get(zzf);
            Long l3 = (Long) this.zzg.get(zzf);
            this.zzh.put(zzf, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j2));
            this.zzg.put(zzf, Long.valueOf((l3 != null ? l3.longValue() : 0L) + i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzg(zzmb zzmbVar, zzuu zzuuVar) {
        zzuy zzuyVar = zzmbVar.zzd;
        if (zzuyVar == null) {
            return;
        }
        zzaf zzafVar = zzuuVar.zzb;
        zzafVar.getClass();
        zzoh zzohVar = new zzoh(zzafVar, 0, this.zzb.zzf(zzmbVar.zzb, zzuyVar));
        int i2 = zzuuVar.zza;
        if (i2 != 0) {
            if (i2 == 1) {
                this.zzp = zzohVar;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.zzq = zzohVar;
                return;
            }
        }
        this.zzo = zzohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzh(zzmb zzmbVar, int i2, long j2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x01f1, code lost:
    
        if (r9 != 1) goto L139;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzmd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.gms.internal.ads.zzbw r19, com.google.android.gms.internal.ads.zzmc r20) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzoi.zzi(com.google.android.gms.internal.ads.zzbw, com.google.android.gms.internal.ads.zzmc):void");
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzj(zzmb zzmbVar, zzup zzupVar, zzuu zzuuVar, IOException iOException, boolean z2) {
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzk(zzmb zzmbVar, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzl(zzmb zzmbVar, zzbp zzbpVar) {
        this.zzn = zzbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzm(zzmb zzmbVar, zzbv zzbvVar, zzbv zzbvVar2, int i2) {
        if (i2 == 1) {
            this.zzu = true;
            i2 = 1;
        }
        this.zzk = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzn(zzmb zzmbVar, Object obj, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzo(zzmb zzmbVar, zzia zziaVar) {
        this.zzw += zziaVar.zzg;
        this.zzx += zziaVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final /* synthetic */ void zzp(zzmb zzmbVar, zzaf zzafVar, zzib zzibVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzq(zzmb zzmbVar, zzcp zzcpVar) {
        zzoh zzohVar = this.zzo;
        if (zzohVar != null) {
            zzaf zzafVar = zzohVar.zza;
            if (zzafVar.zzu == -1) {
                zzad zzb = zzafVar.zzb();
                zzb.zzae(zzcpVar.zzb);
                zzb.zzJ(zzcpVar.zzc);
                this.zzo = new zzoh(zzb.zzaf(), 0, zzohVar.zzc);
            }
        }
    }
}

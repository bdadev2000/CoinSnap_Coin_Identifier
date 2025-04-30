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
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.HashMap;

@RequiresApi(31)
/* loaded from: classes2.dex */
public final class zzpf implements zzna, zzpg {
    private final Context zza;
    private final zzph zzb;
    private final PlaybackSession zzc;

    @Nullable
    private String zzi;

    @Nullable
    private PlaybackMetrics.Builder zzj;
    private int zzk;

    @Nullable
    private zzcj zzn;

    @Nullable
    private zzpe zzo;

    @Nullable
    private zzpe zzp;

    @Nullable
    private zzpe zzq;

    @Nullable
    private zzan zzr;

    @Nullable
    private zzan zzs;

    @Nullable
    private zzan zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzdb zze = new zzdb();
    private final zzcz zzf = new zzcz();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzpf(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzpd zzpdVar = new zzpd(zzpd.zza);
        this.zzb = zzpdVar;
        zzpdVar.zzh(this);
    }

    @Nullable
    public static zzpf zzb(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager d2 = c.d(context.getSystemService("media_metrics"));
        if (d2 != null) {
            createPlaybackSession = d2.createPlaybackSession();
            return new zzpf(context, createPlaybackSession);
        }
        return null;
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzr(int i9) {
        switch (zzgd.zzj(i9)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case 6003:
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
        long longValue;
        long longValue2;
        int i9;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l = (Long) this.zzg.get(this.zzi);
            PlaybackMetrics.Builder builder2 = this.zzj;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l2 = (Long) this.zzh.get(this.zzi);
            PlaybackMetrics.Builder builder3 = this.zzj;
            if (l2 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l2.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.zzj;
            if (l2 != null && l2.longValue() > 0) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            builder4.setStreamSource(i9);
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

    private final void zzt(long j7, @Nullable zzan zzanVar, int i9) {
        int i10;
        if (zzgd.zzG(this.zzs, zzanVar)) {
            return;
        }
        if (this.zzs == null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = i10;
        this.zzs = zzanVar;
        zzx(0, j7, zzanVar, i11);
    }

    private final void zzu(long j7, @Nullable zzan zzanVar, int i9) {
        int i10;
        if (zzgd.zzG(this.zzt, zzanVar)) {
            return;
        }
        if (this.zzt == null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = i10;
        this.zzt = zzanVar;
        zzx(2, j7, zzanVar, i11);
    }

    private final void zzv(zzdc zzdcVar, @Nullable zzvo zzvoVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzvoVar != null && (zza = zzdcVar.zza(zzvoVar.zza)) != -1) {
            int i9 = 0;
            zzdcVar.zzd(zza, this.zzf, false);
            zzdcVar.zze(this.zzf.zzd, this.zze, 0L);
            zzbn zzbnVar = this.zze.zze.zzd;
            int i10 = 2;
            if (zzbnVar != null) {
                int zzn = zzgd.zzn(zzbnVar.zzb);
                if (zzn != 0) {
                    if (zzn != 1) {
                        if (zzn != 2) {
                            i9 = 1;
                        } else {
                            i9 = 4;
                        }
                    } else {
                        i9 = 5;
                    }
                } else {
                    i9 = 3;
                }
            }
            builder.setStreamType(i9);
            zzdb zzdbVar = this.zze;
            if (zzdbVar.zzo != C.TIME_UNSET && !zzdbVar.zzm && !zzdbVar.zzj && !zzdbVar.zzb()) {
                builder.setMediaDurationMillis(zzgd.zzu(this.zze.zzo));
            }
            if (true != this.zze.zzb()) {
                i10 = 1;
            }
            builder.setPlaybackType(i10);
            this.zzz = true;
        }
    }

    private final void zzw(long j7, @Nullable zzan zzanVar, int i9) {
        int i10;
        if (zzgd.zzG(this.zzr, zzanVar)) {
            return;
        }
        if (this.zzr == null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i11 = i10;
        this.zzr = zzanVar;
        zzx(1, j7, zzanVar, i11);
    }

    private final void zzx(int i9, long j7, @Nullable zzan zzanVar, int i10) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i11;
        String str;
        timeSinceCreatedMillis = c.l(i9).setTimeSinceCreatedMillis(j7 - this.zzd);
        if (zzanVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i10 != 1) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i11);
            String str2 = zzanVar.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = zzanVar.zzn;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = zzanVar.zzk;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i12 = zzanVar.zzj;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = zzanVar.zzs;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = zzanVar.zzt;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = zzanVar.zzA;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = zzanVar.zzB;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str5 = zzanVar.zze;
            if (str5 != null) {
                int i17 = zzgd.zza;
                String[] split = str5.split("-", -1);
                String str6 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str6, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f9 = zzanVar.zzu;
            if (f9 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f9);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        PlaybackSession playbackSession = this.zzc;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    private final boolean zzy(@Nullable zzpe zzpeVar) {
        if (zzpeVar != null) {
            if (zzpeVar.zzc.equals(this.zzb.zze())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final LogSessionId zza() {
        LogSessionId sessionId;
        sessionId = this.zzc.getSessionId();
        return sessionId;
    }

    @Override // com.google.android.gms.internal.ads.zzpg
    public final void zzc(zzmy zzmyVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        zzvo zzvoVar = zzmyVar.zzd;
        if (zzvoVar != null && zzvoVar.zzb()) {
            return;
        }
        zzs();
        this.zzi = str;
        playerName = c.g().setPlayerName("AndroidXMedia3");
        playerVersion = playerName.setPlayerVersion("1.4.0-alpha01");
        this.zzj = playerVersion;
        zzv(zzmyVar.zzb, zzmyVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzpg
    public final void zzd(zzmy zzmyVar, String str, boolean z8) {
        zzvo zzvoVar = zzmyVar.zzd;
        if ((zzvoVar == null || !zzvoVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zze(zzmy zzmyVar, zzan zzanVar, zziy zziyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzf(zzmy zzmyVar, int i9, long j7, long j9) {
        long longValue;
        zzvo zzvoVar = zzmyVar.zzd;
        if (zzvoVar != null) {
            zzph zzphVar = this.zzb;
            zzdc zzdcVar = zzmyVar.zzb;
            HashMap hashMap = this.zzh;
            String zzf = zzphVar.zzf(zzdcVar, zzvoVar);
            Long l = (Long) hashMap.get(zzf);
            Long l2 = (Long) this.zzg.get(zzf);
            HashMap hashMap2 = this.zzh;
            long j10 = 0;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            hashMap2.put(zzf, Long.valueOf(longValue + j7));
            HashMap hashMap3 = this.zzg;
            if (l2 != null) {
                j10 = l2.longValue();
            }
            hashMap3.put(zzf, Long.valueOf(j10 + i9));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzg(zzmy zzmyVar, zzvk zzvkVar) {
        zzvo zzvoVar = zzmyVar.zzd;
        if (zzvoVar != null) {
            zzan zzanVar = zzvkVar.zzb;
            zzanVar.getClass();
            zzpe zzpeVar = new zzpe(zzanVar, 0, this.zzb.zzf(zzmyVar.zzb, zzvoVar));
            int i9 = zzvkVar.zza;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            return;
                        }
                        this.zzq = zzpeVar;
                        return;
                    }
                } else {
                    this.zzp = zzpeVar;
                    return;
                }
            }
            this.zzo = zzpeVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzh(zzmy zzmyVar, int i9, long j7) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x01ee, code lost:
    
        if (r9 != 1) goto L139;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzna
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.gms.internal.ads.zzct r19, com.google.android.gms.internal.ads.zzmz r20) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpf.zzi(com.google.android.gms.internal.ads.zzct, com.google.android.gms.internal.ads.zzmz):void");
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzj(zzmy zzmyVar, zzvf zzvfVar, zzvk zzvkVar, IOException iOException, boolean z8) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzk(zzmy zzmyVar, int i9) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzl(zzmy zzmyVar, zzcj zzcjVar) {
        this.zzn = zzcjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzm(zzmy zzmyVar, zzcs zzcsVar, zzcs zzcsVar2, int i9) {
        if (i9 == 1) {
            this.zzu = true;
            i9 = 1;
        }
        this.zzk = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzn(zzmy zzmyVar, Object obj, long j7) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzo(zzmy zzmyVar, zzix zzixVar) {
        this.zzw += zzixVar.zzg;
        this.zzx += zzixVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final /* synthetic */ void zzp(zzmy zzmyVar, zzan zzanVar, zziy zziyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzna
    public final void zzq(zzmy zzmyVar, zzdv zzdvVar) {
        zzpe zzpeVar = this.zzo;
        if (zzpeVar != null) {
            zzan zzanVar = zzpeVar.zza;
            if (zzanVar.zzt == -1) {
                zzal zzb = zzanVar.zzb();
                zzb.zzac(zzdvVar.zzc);
                zzb.zzI(zzdvVar.zzd);
                this.zzo = new zzpe(zzb.zzad(), 0, zzpeVar.zzc);
            }
        }
    }
}

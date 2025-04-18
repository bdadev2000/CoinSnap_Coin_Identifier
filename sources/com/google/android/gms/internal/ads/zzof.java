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
import com.vungle.ads.internal.protos.n;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import t7.s;
import t7.t;

@RequiresApi(n.TEMPLATE_HTML_SIZE_VALUE)
/* loaded from: classes3.dex */
public final class zzof implements zzlz, zzog {
    private final Context zza;
    private final zzoh zzb;
    private final PlaybackSession zzc;

    @Nullable
    private String zzi;

    @Nullable
    private PlaybackMetrics.Builder zzj;
    private int zzk;

    @Nullable
    private zzbi zzn;

    @Nullable
    private zzoe zzo;

    @Nullable
    private zzoe zzp;

    @Nullable
    private zzoe zzq;

    @Nullable
    private zzad zzr;

    @Nullable
    private zzad zzs;

    @Nullable
    private zzad zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzbu zze = new zzbu();
    private final zzbt zzf = new zzbt();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzof(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzod zzodVar = new zzod(zzod.zza);
        this.zzb = zzodVar;
        zzodVar.zzh(this);
    }

    @Nullable
    public static zzof zzb(Context context) {
        PlaybackSession createPlaybackSession;
        MediaMetricsManager b3 = s.b(context.getSystemService("media_metrics"));
        if (b3 == null) {
            return null;
        }
        createPlaybackSession = b3.createPlaybackSession();
        return new zzof(context, createPlaybackSession);
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzr(int i10) {
        switch (zzen.zzl(i10)) {
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
        long longValue;
        long longValue2;
        int i10;
        PlaybackMetrics build;
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l10 = (Long) this.zzg.get(this.zzi);
            PlaybackMetrics.Builder builder2 = this.zzj;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l11 = (Long) this.zzh.get(this.zzi);
            PlaybackMetrics.Builder builder3 = this.zzj;
            if (l11 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l11.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.zzj;
            if (l11 != null && l11.longValue() > 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            builder4.setStreamSource(i10);
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

    private final void zzt(long j3, @Nullable zzad zzadVar, int i10) {
        int i11;
        if (Objects.equals(this.zzs, zzadVar)) {
            return;
        }
        if (this.zzs == null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        this.zzs = zzadVar;
        zzx(0, j3, zzadVar, i11);
    }

    private final void zzu(long j3, @Nullable zzad zzadVar, int i10) {
        int i11;
        if (Objects.equals(this.zzt, zzadVar)) {
            return;
        }
        if (this.zzt == null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        this.zzt = zzadVar;
        zzx(2, j3, zzadVar, i11);
    }

    private final void zzv(zzbv zzbvVar, @Nullable zzur zzurVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzurVar != null && (zza = zzbvVar.zza(zzurVar.zza)) != -1) {
            int i10 = 0;
            zzbvVar.zzd(zza, this.zzf, false);
            zzbvVar.zze(this.zzf.zzc, this.zze, 0L);
            zzar zzarVar = this.zze.zzd.zzb;
            int i11 = 2;
            if (zzarVar != null) {
                int zzo = zzen.zzo(zzarVar.zza);
                if (zzo != 0) {
                    if (zzo != 1) {
                        if (zzo != 2) {
                            i10 = 1;
                        } else {
                            i10 = 4;
                        }
                    } else {
                        i10 = 5;
                    }
                } else {
                    i10 = 3;
                }
            }
            builder.setStreamType(i10);
            zzbu zzbuVar = this.zze;
            long j3 = zzbuVar.zzm;
            if (j3 != C.TIME_UNSET && !zzbuVar.zzk && !zzbuVar.zzi && !zzbuVar.zzb()) {
                builder.setMediaDurationMillis(zzen.zzv(j3));
            }
            if (true != this.zze.zzb()) {
                i11 = 1;
            }
            builder.setPlaybackType(i11);
            this.zzz = true;
        }
    }

    private final void zzw(long j3, @Nullable zzad zzadVar, int i10) {
        int i11;
        if (Objects.equals(this.zzr, zzadVar)) {
            return;
        }
        if (this.zzr == null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        this.zzr = zzadVar;
        zzx(1, j3, zzadVar, i11);
    }

    private final void zzx(int i10, long j3, @Nullable zzad zzadVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis;
        TrackChangeEvent build;
        int i12;
        String str;
        t.A();
        timeSinceCreatedMillis = t.d(i10).setTimeSinceCreatedMillis(j3 - this.zzd);
        if (zzadVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i11 != 1) {
                i12 = 1;
            } else {
                i12 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i12);
            String str2 = zzadVar.zzn;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = zzadVar.zzo;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = zzadVar.zzk;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i13 = zzadVar.zzj;
            if (i13 != -1) {
                timeSinceCreatedMillis.setBitrate(i13);
            }
            int i14 = zzadVar.zzu;
            if (i14 != -1) {
                timeSinceCreatedMillis.setWidth(i14);
            }
            int i15 = zzadVar.zzv;
            if (i15 != -1) {
                timeSinceCreatedMillis.setHeight(i15);
            }
            int i16 = zzadVar.zzC;
            if (i16 != -1) {
                timeSinceCreatedMillis.setChannelCount(i16);
            }
            int i17 = zzadVar.zzD;
            if (i17 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i17);
            }
            String str5 = zzadVar.zzd;
            if (str5 != null) {
                int i18 = zzen.zza;
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
            float f10 = zzadVar.zzw;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        PlaybackSession playbackSession = this.zzc;
        build = timeSinceCreatedMillis.build();
        playbackSession.reportTrackChangeEvent(build);
    }

    private final boolean zzy(@Nullable zzoe zzoeVar) {
        if (zzoeVar != null) {
            return zzoeVar.zzc.equals(this.zzb.zze());
        }
        return false;
    }

    public final LogSessionId zza() {
        LogSessionId sessionId;
        sessionId = this.zzc.getSessionId();
        return sessionId;
    }

    @Override // com.google.android.gms.internal.ads.zzog
    public final void zzc(zzlx zzlxVar, String str) {
        PlaybackMetrics.Builder playerName;
        PlaybackMetrics.Builder playerVersion;
        zzur zzurVar = zzlxVar.zzd;
        if (zzurVar != null && zzurVar.zzb()) {
            return;
        }
        zzs();
        this.zzi = str;
        t.p();
        playerName = t.b().setPlayerName("AndroidXMedia3");
        playerVersion = playerName.setPlayerVersion("1.5.0-alpha01");
        this.zzj = playerVersion;
        zzv(zzlxVar.zzb, zzlxVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzog
    public final void zzd(zzlx zzlxVar, String str, boolean z10) {
        zzur zzurVar = zzlxVar.zzd;
        if ((zzurVar == null || !zzurVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zze(zzlx zzlxVar, zzad zzadVar, zzhy zzhyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzf(zzlx zzlxVar, int i10, long j3, long j10) {
        long longValue;
        zzur zzurVar = zzlxVar.zzd;
        if (zzurVar != null) {
            String zzf = this.zzb.zzf(zzlxVar.zzb, zzurVar);
            Long l10 = (Long) this.zzh.get(zzf);
            Long l11 = (Long) this.zzg.get(zzf);
            HashMap hashMap = this.zzh;
            long j11 = 0;
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            hashMap.put(zzf, Long.valueOf(longValue + j3));
            HashMap hashMap2 = this.zzg;
            if (l11 != null) {
                j11 = l11.longValue();
            }
            hashMap2.put(zzf, Long.valueOf(j11 + i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzg(zzlx zzlxVar, zzun zzunVar) {
        zzur zzurVar = zzlxVar.zzd;
        if (zzurVar != null) {
            zzad zzadVar = zzunVar.zzb;
            zzadVar.getClass();
            zzoe zzoeVar = new zzoe(zzadVar, 0, this.zzb.zzf(zzlxVar.zzb, zzurVar));
            int i10 = zzunVar.zza;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return;
                        }
                        this.zzq = zzoeVar;
                        return;
                    }
                } else {
                    this.zzp = zzoeVar;
                    return;
                }
            }
            this.zzo = zzoeVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzh(zzlx zzlxVar, int i10, long j3) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x02f8  */
    @Override // com.google.android.gms.internal.ads.zzlz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.gms.internal.ads.zzbp r18, com.google.android.gms.internal.ads.zzly r19) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzof.zzi(com.google.android.gms.internal.ads.zzbp, com.google.android.gms.internal.ads.zzly):void");
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzj(zzlx zzlxVar, zzui zzuiVar, zzun zzunVar, IOException iOException, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzk(zzlx zzlxVar, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzl(zzlx zzlxVar, zzbi zzbiVar) {
        this.zzn = zzbiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzm(zzlx zzlxVar, zzbn zzbnVar, zzbn zzbnVar2, int i10) {
        if (i10 == 1) {
            this.zzu = true;
            i10 = 1;
        }
        this.zzk = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzn(zzlx zzlxVar, Object obj, long j3) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzo(zzlx zzlxVar, zzhx zzhxVar) {
        this.zzw += zzhxVar.zzg;
        this.zzx += zzhxVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final /* synthetic */ void zzp(zzlx zzlxVar, zzad zzadVar, zzhy zzhyVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzq(zzlx zzlxVar, zzci zzciVar) {
        zzoe zzoeVar = this.zzo;
        if (zzoeVar != null) {
            zzad zzadVar = zzoeVar.zza;
            if (zzadVar.zzv == -1) {
                zzab zzb = zzadVar.zzb();
                zzb.zzae(zzciVar.zzb);
                zzb.zzJ(zzciVar.zzc);
                this.zzo = new zzoe(zzb.zzaf(), 0, zzoeVar.zzc);
            }
        }
    }
}

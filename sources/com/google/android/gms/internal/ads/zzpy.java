package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzpy {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private zzdc zzI;
    private final zzpx zza;
    private final long[] zzb;

    @Nullable
    private AudioTrack zzc;
    private int zzd;

    @Nullable
    private zzpw zze;
    private int zzf;
    private boolean zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;

    @Nullable
    private Method zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzpy(zzpx zzpxVar) {
        this.zza = zzpxVar;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzI = zzdc.zza;
    }

    private final long zzl() {
        long zzb = this.zzI.zzb();
        int i10 = 2;
        if (this.zzx != C.TIME_UNSET) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.zzz;
            }
            return Math.min(this.zzA, this.zzz + zzen.zzp(zzen.zzq(zzen.zzs(zzb) - this.zzx, this.zzi), this.zzf));
        }
        if (zzb - this.zzr >= 5) {
            AudioTrack audioTrack2 = this.zzc;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                long j3 = 0;
                if (this.zzg) {
                    if (playState == 2) {
                        if (playbackHeadPosition == 0) {
                            this.zzu = this.zzs;
                        }
                    } else {
                        i10 = playState;
                    }
                    playbackHeadPosition += this.zzu;
                    playState = i10;
                }
                if (zzen.zza <= 29) {
                    if (playbackHeadPosition == 0) {
                        if (this.zzs > 0 && playState == 3) {
                            if (this.zzy == C.TIME_UNSET) {
                                this.zzy = zzb;
                            }
                        }
                    } else {
                        j3 = playbackHeadPosition;
                    }
                    this.zzy = C.TIME_UNSET;
                    playbackHeadPosition = j3;
                }
                if (this.zzs > playbackHeadPosition) {
                    this.zzt++;
                }
                this.zzs = playbackHeadPosition;
            }
            this.zzr = zzb;
        }
        return this.zzs + this.zzH + (this.zzt << 32);
    }

    private final long zzm() {
        return zzen.zzt(zzl(), this.zzf);
    }

    private final void zzn() {
        this.zzk = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzl = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzj = false;
    }

    public final long zza(boolean z10) {
        long zzq;
        int i10;
        Method method;
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long zzc = this.zzI.zzc() / 1000;
            if (zzc - this.zzl >= 30000) {
                long zzm = zzm();
                if (zzm != 0) {
                    this.zzb[this.zzv] = zzen.zzr(zzm, this.zzi) - zzc;
                    this.zzv = (this.zzv + 1) % 10;
                    int i11 = this.zzw;
                    if (i11 < 10) {
                        this.zzw = i11 + 1;
                    }
                    this.zzl = zzc;
                    this.zzk = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = this.zzw;
                        if (i12 >= i13) {
                            break;
                        }
                        this.zzk = (this.zzb[i12] / i13) + this.zzk;
                        i12++;
                    }
                }
            }
            if (!this.zzg) {
                zzpw zzpwVar = this.zze;
                zzpwVar.getClass();
                if (!zzpwVar.zzg(zzc)) {
                    i10 = 0;
                } else {
                    long zzb = zzpwVar.zzb();
                    long zza = zzpwVar.zza();
                    long zzm2 = zzm();
                    if (Math.abs(zzb - zzc) > 5000000) {
                        i10 = 0;
                        this.zza.zzd(zza, zzb, zzc, zzm2);
                        zzpwVar.zzd();
                    } else {
                        i10 = 0;
                        if (Math.abs(zzen.zzt(zza, this.zzf) - zzm2) > 5000000) {
                            this.zza.zzc(zza, zzb, zzc, zzm2);
                            zzpwVar.zzd();
                        } else {
                            zzpwVar.zzc();
                        }
                    }
                }
                if (this.zzp && (method = this.zzm) != null && zzc - this.zzq >= 500000) {
                    try {
                        AudioTrack audioTrack2 = this.zzc;
                        audioTrack2.getClass();
                        Integer num = (Integer) method.invoke(audioTrack2, new Object[i10]);
                        int i14 = zzen.zza;
                        long intValue = (num.intValue() * 1000) - this.zzh;
                        this.zzn = intValue;
                        long max = Math.max(intValue, 0L);
                        this.zzn = max;
                        if (max > 5000000) {
                            this.zza.zza(max);
                            this.zzn = 0L;
                        }
                    } catch (Exception unused) {
                        this.zzm = null;
                    }
                    this.zzq = zzc;
                }
            }
        }
        long zzc2 = this.zzI.zzc() / 1000;
        zzpw zzpwVar2 = this.zze;
        zzpwVar2.getClass();
        boolean zzf = zzpwVar2.zzf();
        if (zzf) {
            zzq = zzen.zzq(zzc2 - zzpwVar2.zzb(), this.zzi) + zzen.zzt(zzpwVar2.zza(), this.zzf);
        } else {
            if (this.zzw == 0) {
                zzq = zzm();
            } else {
                zzq = zzen.zzq(this.zzk + zzc2, this.zzi);
            }
            if (!z10) {
                zzq = Math.max(0L, zzq - this.zzn);
            }
        }
        if (this.zzD != zzf) {
            this.zzF = this.zzC;
            this.zzE = this.zzB;
        }
        long j3 = zzc2 - this.zzF;
        if (j3 < 1000000) {
            long zzq2 = zzen.zzq(j3, this.zzi) + this.zzE;
            long j10 = (j3 * 1000) / 1000000;
            zzq = (((1000 - j10) * zzq2) + (zzq * j10)) / 1000;
        }
        if (!this.zzj) {
            long j11 = this.zzB;
            if (zzq > j11) {
                this.zzj = true;
                int i15 = zzen.zza;
                this.zza.zzb(this.zzI.zza() - zzen.zzv(zzen.zzr(zzen.zzv(zzq - j11), this.zzi)));
            }
        }
        this.zzC = zzc2;
        this.zzB = zzq;
        this.zzD = zzf;
        return zzq;
    }

    public final void zzb(long j3) {
        this.zzz = zzl();
        this.zzx = zzen.zzs(this.zzI.zzb());
        this.zzA = j3;
    }

    public final void zzc() {
        zzn();
        this.zzc = null;
        this.zze = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(android.media.AudioTrack r3, boolean r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            r2.zzc = r3
            r2.zzd = r7
            com.google.android.gms.internal.ads.zzpw r0 = new com.google.android.gms.internal.ads.zzpw
            r0.<init>(r3)
            r2.zze = r0
            int r3 = r3.getSampleRate()
            r2.zzf = r3
            r3 = 0
            if (r4 == 0) goto L23
            int r4 = com.google.android.gms.internal.ads.zzen.zza
            r0 = 23
            if (r4 >= r0) goto L23
            r4 = 5
            r0 = 1
            if (r5 == r4) goto L24
            r4 = 6
            if (r5 != r4) goto L23
            r5 = r4
            goto L24
        L23:
            r0 = r3
        L24:
            r2.zzg = r0
            boolean r4 = com.google.android.gms.internal.ads.zzen.zzJ(r5)
            r2.zzp = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r7 = r7 / r6
            long r4 = (long) r7
            int r6 = r2.zzf
            long r4 = com.google.android.gms.internal.ads.zzen.zzt(r4, r6)
            goto L3d
        L3c:
            r4 = r0
        L3d:
            r2.zzh = r4
            r4 = 0
            r2.zzs = r4
            r2.zzt = r4
            r2.zzG = r3
            r2.zzH = r4
            r2.zzu = r4
            r2.zzo = r3
            r2.zzx = r0
            r2.zzy = r0
            r2.zzq = r4
            r2.zzn = r4
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.zzi = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpy.zzd(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void zze(zzdc zzdcVar) {
        this.zzI = zzdcVar;
    }

    public final void zzf() {
        if (this.zzx != C.TIME_UNSET) {
            this.zzx = zzen.zzs(this.zzI.zzb());
        }
        zzpw zzpwVar = this.zze;
        zzpwVar.getClass();
        zzpwVar.zze();
    }

    public final boolean zzg(long j3) {
        if (j3 <= zzen.zzp(zza(false), this.zzf)) {
            if (this.zzg) {
                AudioTrack audioTrack = this.zzc;
                audioTrack.getClass();
                if (audioTrack.getPlayState() == 2 && zzl() == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            return true;
        }
        return false;
    }

    public final boolean zzi(long j3) {
        return this.zzy != C.TIME_UNSET && j3 > 0 && this.zzI.zzb() - this.zzy >= 200;
    }

    public final boolean zzj(long j3) {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzg) {
            if (playState == 2) {
                this.zzo = false;
                return false;
            }
            if (playState == 1) {
                if (zzl() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z10 = this.zzo;
        boolean zzg = zzg(j3);
        this.zzo = zzg;
        if (z10 && !zzg && playState != 1) {
            this.zza.zze(this.zzd, zzen.zzv(this.zzh));
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx == C.TIME_UNSET) {
            zzpw zzpwVar = this.zze;
            zzpwVar.getClass();
            zzpwVar.zze();
            return true;
        }
        this.zzz = zzl();
        return false;
    }
}

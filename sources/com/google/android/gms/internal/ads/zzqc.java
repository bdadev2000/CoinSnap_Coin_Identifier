package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzqc {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private zzdj zzI;
    private final zzqb zza;
    private final long[] zzb;

    @Nullable
    private AudioTrack zzc;
    private int zzd;

    @Nullable
    private zzqa zze;
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

    public zzqc(zzqb zzqbVar) {
        this.zza = zzqbVar;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzI = zzdj.zza;
    }

    private final long zzl() {
        long zzb = this.zzI.zzb();
        int i2 = 2;
        if (this.zzx != -9223372036854775807L) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.zzz;
            }
            return Math.min(this.zzA, this.zzz + zzeu.zzo(zzeu.zzp(zzeu.zzr(zzb) - this.zzx, this.zzi), this.zzf));
        }
        if (zzb - this.zzr >= 5) {
            AudioTrack audioTrack2 = this.zzc;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                long j2 = 0;
                if (this.zzg) {
                    if (playState != 2) {
                        i2 = playState;
                    } else if (playbackHeadPosition == 0) {
                        this.zzu = this.zzs;
                    }
                    playbackHeadPosition += this.zzu;
                    playState = i2;
                }
                if (zzeu.zza <= 29) {
                    if (playbackHeadPosition != 0) {
                        j2 = playbackHeadPosition;
                    } else if (this.zzs > 0 && playState == 3) {
                        if (this.zzy == -9223372036854775807L) {
                            this.zzy = zzb;
                        }
                    }
                    this.zzy = -9223372036854775807L;
                    playbackHeadPosition = j2;
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
        return zzeu.zzs(zzl(), this.zzf);
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

    public final long zza(boolean z2) {
        long zzm;
        int i2;
        Method method;
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long zzc = this.zzI.zzc() / 1000;
            if (zzc - this.zzl >= 30000) {
                long zzm2 = zzm();
                if (zzm2 != 0) {
                    this.zzb[this.zzv] = zzeu.zzq(zzm2, this.zzi) - zzc;
                    this.zzv = (this.zzv + 1) % 10;
                    int i3 = this.zzw;
                    if (i3 < 10) {
                        this.zzw = i3 + 1;
                    }
                    this.zzl = zzc;
                    this.zzk = 0L;
                    int i4 = 0;
                    while (true) {
                        int i5 = this.zzw;
                        if (i4 >= i5) {
                            break;
                        }
                        this.zzk = (this.zzb[i4] / i5) + this.zzk;
                        i4++;
                    }
                }
            }
            if (!this.zzg) {
                zzqa zzqaVar = this.zze;
                zzqaVar.getClass();
                if (zzqaVar.zzg(zzc)) {
                    long zzb = zzqaVar.zzb();
                    long zza = zzqaVar.zza();
                    long zzm3 = zzm();
                    if (Math.abs(zzb - zzc) > 5000000) {
                        i2 = 0;
                        this.zza.zzd(zza, zzb, zzc, zzm3);
                        zzqaVar.zzd();
                    } else {
                        i2 = 0;
                        if (Math.abs(zzeu.zzs(zza, this.zzf) - zzm3) > 5000000) {
                            this.zza.zzc(zza, zzb, zzc, zzm3);
                            zzqaVar.zzd();
                        } else {
                            zzqaVar.zzc();
                        }
                    }
                } else {
                    i2 = 0;
                }
                if (this.zzp && (method = this.zzm) != null && zzc - this.zzq >= 500000) {
                    try {
                        AudioTrack audioTrack2 = this.zzc;
                        audioTrack2.getClass();
                        Integer num = (Integer) method.invoke(audioTrack2, new Object[i2]);
                        int i6 = zzeu.zza;
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
        zzqa zzqaVar2 = this.zze;
        zzqaVar2.getClass();
        boolean zzf = zzqaVar2.zzf();
        if (zzf) {
            zzm = zzeu.zzp(zzc2 - zzqaVar2.zzb(), this.zzi) + zzeu.zzs(zzqaVar2.zza(), this.zzf);
        } else {
            zzm = this.zzw == 0 ? zzm() : zzeu.zzp(this.zzk + zzc2, this.zzi);
            if (!z2) {
                zzm = Math.max(0L, zzm - this.zzn);
            }
        }
        if (this.zzD != zzf) {
            this.zzF = this.zzC;
            this.zzE = this.zzB;
        }
        long j2 = zzc2 - this.zzF;
        if (j2 < 1000000) {
            long zzp = zzeu.zzp(j2, this.zzi) + this.zzE;
            long j3 = (j2 * 1000) / 1000000;
            zzm = (((1000 - j3) * zzp) + (zzm * j3)) / 1000;
        }
        if (!this.zzj) {
            long j4 = this.zzB;
            if (zzm > j4) {
                this.zzj = true;
                int i7 = zzeu.zza;
                this.zza.zzb(this.zzI.zza() - zzeu.zzu(zzeu.zzq(zzeu.zzu(zzm - j4), this.zzi)));
            }
        }
        this.zzC = zzc2;
        this.zzB = zzm;
        this.zzD = zzf;
        return zzm;
    }

    public final void zzb(long j2) {
        this.zzz = zzl();
        this.zzx = zzeu.zzr(this.zzI.zzb());
        this.zzA = j2;
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
            com.google.android.gms.internal.ads.zzqa r0 = new com.google.android.gms.internal.ads.zzqa
            r0.<init>(r3)
            r2.zze = r0
            int r3 = r3.getSampleRate()
            r2.zzf = r3
            r3 = 0
            if (r4 == 0) goto L23
            int r4 = com.google.android.gms.internal.ads.zzeu.zza
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
            boolean r4 = com.google.android.gms.internal.ads.zzeu.zzI(r5)
            r2.zzp = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r7 = r7 / r6
            long r4 = (long) r7
            int r6 = r2.zzf
            long r4 = com.google.android.gms.internal.ads.zzeu.zzs(r4, r6)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqc.zzd(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void zze(zzdj zzdjVar) {
        this.zzI = zzdjVar;
    }

    public final void zzf() {
        if (this.zzx != -9223372036854775807L) {
            this.zzx = zzeu.zzr(this.zzI.zzb());
        }
        zzqa zzqaVar = this.zze;
        zzqaVar.getClass();
        zzqaVar.zze();
    }

    public final boolean zzg(long j2) {
        if (j2 > zzeu.zzo(zza(false), this.zzf)) {
            return true;
        }
        if (this.zzg) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && zzl() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j2) {
        return this.zzy != -9223372036854775807L && j2 > 0 && this.zzI.zzb() - this.zzy >= 200;
    }

    public final boolean zzj(long j2) {
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
        boolean z2 = this.zzo;
        boolean zzg = zzg(j2);
        this.zzo = zzg;
        if (z2 && !zzg && playState != 1) {
            this.zza.zze(this.zzd, zzeu.zzu(this.zzh));
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx != -9223372036854775807L) {
            this.zzz = zzl();
            return false;
        }
        zzqa zzqaVar = this.zze;
        zzqaVar.getClass();
        zzqaVar.zze();
        return true;
    }
}

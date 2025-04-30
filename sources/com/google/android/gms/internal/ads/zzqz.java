package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;
import y.AbstractC2933a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzqz {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private zzer zzI;
    private final zzqy zza;
    private final long[] zzb;

    @Nullable
    private AudioTrack zzc;
    private int zzd;

    @Nullable
    private zzqx zze;
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

    public zzqz(zzqy zzqyVar) {
        this.zza = zzqyVar;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzI = zzer.zza;
    }

    private final long zzl() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i9 = 2;
        if (this.zzx != C.TIME_UNSET) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.zzz;
            }
            return Math.min(this.zzA, this.zzz + zzgd.zzo(zzgd.zzp(zzgd.zzr(elapsedRealtime) - this.zzx, this.zzi), this.zzf));
        }
        if (elapsedRealtime - this.zzr >= 5) {
            AudioTrack audioTrack2 = this.zzc;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack2.getPlaybackHeadPosition() & 4294967295L;
                long j7 = 0;
                if (this.zzg) {
                    if (playState == 2) {
                        if (playbackHeadPosition == 0) {
                            this.zzu = this.zzs;
                        }
                    } else {
                        i9 = playState;
                    }
                    playbackHeadPosition += this.zzu;
                    playState = i9;
                }
                if (zzgd.zza <= 29) {
                    if (playbackHeadPosition == 0) {
                        if (this.zzs > 0 && playState == 3) {
                            if (this.zzy == C.TIME_UNSET) {
                                this.zzy = elapsedRealtime;
                            }
                        }
                    } else {
                        j7 = playbackHeadPosition;
                    }
                    this.zzy = C.TIME_UNSET;
                    playbackHeadPosition = j7;
                }
                if (this.zzs > playbackHeadPosition) {
                    this.zzt++;
                }
                this.zzs = playbackHeadPosition;
            }
            this.zzr = elapsedRealtime;
        }
        return this.zzs + this.zzH + (this.zzt << 32);
    }

    private final long zzm() {
        return zzgd.zzs(zzl(), this.zzf);
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

    public final long zza(boolean z8) {
        long zzp;
        long j7;
        zzqs zzqsVar;
        zzqs zzqsVar2;
        zzqn zzqnVar;
        Method method;
        long zzL;
        long zzM;
        long zzL2;
        long zzM2;
        zzqz zzqzVar = this;
        AudioTrack audioTrack = zzqzVar.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long nanoTime = System.nanoTime() / 1000;
            if (nanoTime - zzqzVar.zzl >= 30000) {
                long zzm = zzm();
                if (zzm != 0) {
                    zzqzVar.zzb[zzqzVar.zzv] = zzgd.zzq(zzm, zzqzVar.zzi) - nanoTime;
                    zzqzVar.zzv = (zzqzVar.zzv + 1) % 10;
                    int i9 = zzqzVar.zzw;
                    if (i9 < 10) {
                        zzqzVar.zzw = i9 + 1;
                    }
                    zzqzVar.zzl = nanoTime;
                    zzqzVar.zzk = 0L;
                    int i10 = 0;
                    while (true) {
                        int i11 = zzqzVar.zzw;
                        if (i10 >= i11) {
                            break;
                        }
                        zzqzVar.zzk = (zzqzVar.zzb[i10] / i11) + zzqzVar.zzk;
                        i10++;
                    }
                }
            }
            if (!zzqzVar.zzg) {
                zzqx zzqxVar = zzqzVar.zze;
                zzqxVar.getClass();
                if (zzqxVar.zzg(nanoTime)) {
                    long zzb = zzqxVar.zzb();
                    long zza = zzqxVar.zza();
                    long zzm2 = zzm();
                    if (Math.abs(zzb - nanoTime) > 5000000) {
                        zzrz zzrzVar = ((zzru) zzqzVar.zza).zza;
                        zzL2 = zzrzVar.zzL();
                        zzM2 = zzrzVar.zzM();
                        StringBuilder a6 = AbstractC2933a.a("Spurious audio timestamp (system clock mismatch): ", zza, ", ");
                        a6.append(zzb);
                        a6.append(", ");
                        a6.append(nanoTime);
                        a6.append(", ");
                        a6.append(zzm2);
                        a6.append(", ");
                        a6.append(zzL2);
                        a6.append(", ");
                        a6.append(zzM2);
                        zzfk.zzf("DefaultAudioSink", a6.toString());
                        zzqxVar.zzd();
                        nanoTime = nanoTime;
                    } else {
                        if (Math.abs(zzgd.zzs(zza, zzqzVar.zzf) - zzm2) > 5000000) {
                            zzrz zzrzVar2 = ((zzru) zzqzVar.zza).zza;
                            zzL = zzrzVar2.zzL();
                            zzM = zzrzVar2.zzM();
                            StringBuilder a9 = AbstractC2933a.a("Spurious audio timestamp (frame position mismatch): ", zza, ", ");
                            a9.append(zzb);
                            a9.append(", ");
                            a9.append(nanoTime);
                            a9.append(", ");
                            a9.append(zzm2);
                            a9.append(", ");
                            a9.append(zzL);
                            a9.append(", ");
                            a9.append(zzM);
                            zzfk.zzf("DefaultAudioSink", a9.toString());
                            zzqxVar.zzd();
                        } else {
                            zzqxVar.zzc();
                        }
                        zzqzVar = this;
                    }
                }
                if (zzqzVar.zzp && (method = zzqzVar.zzm) != null && nanoTime - zzqzVar.zzq >= 500000) {
                    try {
                        AudioTrack audioTrack2 = zzqzVar.zzc;
                        audioTrack2.getClass();
                        Integer num = (Integer) method.invoke(audioTrack2, null);
                        int i12 = zzgd.zza;
                        long intValue = (num.intValue() * 1000) - zzqzVar.zzh;
                        zzqzVar.zzn = intValue;
                        long max = Math.max(intValue, 0L);
                        zzqzVar.zzn = max;
                        if (max > 5000000) {
                            zzfk.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + max);
                            zzqzVar.zzn = 0L;
                        }
                    } catch (Exception unused) {
                        zzqzVar.zzm = null;
                    }
                    zzqzVar.zzq = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zzqx zzqxVar2 = zzqzVar.zze;
        zzqxVar2.getClass();
        boolean zzf = zzqxVar2.zzf();
        if (zzf) {
            j7 = zzgd.zzp(nanoTime2 - zzqxVar2.zzb(), zzqzVar.zzi) + zzgd.zzs(zzqxVar2.zza(), zzqzVar.zzf);
        } else {
            if (zzqzVar.zzw == 0) {
                zzp = zzm();
            } else {
                zzp = zzgd.zzp(zzqzVar.zzk + nanoTime2, zzqzVar.zzi);
            }
            j7 = zzp;
            if (!z8) {
                j7 = Math.max(0L, j7 - zzqzVar.zzn);
            }
        }
        if (zzqzVar.zzD != zzf) {
            zzqzVar.zzF = zzqzVar.zzC;
            zzqzVar.zzE = zzqzVar.zzB;
        }
        long j9 = nanoTime2 - zzqzVar.zzF;
        if (j9 < 1000000) {
            long zzp2 = zzgd.zzp(j9, zzqzVar.zzi) + zzqzVar.zzE;
            long j10 = (j9 * 1000) / 1000000;
            j7 = (((1000 - j10) * zzp2) + (j7 * j10)) / 1000;
        }
        if (!zzqzVar.zzj) {
            long j11 = zzqzVar.zzB;
            if (j7 > j11) {
                zzqzVar.zzj = true;
                int i13 = zzgd.zza;
                long currentTimeMillis = System.currentTimeMillis() - zzgd.zzu(zzgd.zzq(zzgd.zzu(j7 - j11), zzqzVar.zzi));
                zzrz zzrzVar3 = ((zzru) zzqzVar.zza).zza;
                zzqsVar = zzrzVar3.zzq;
                if (zzqsVar != null) {
                    zzqsVar2 = zzrzVar3.zzq;
                    zzqnVar = ((zzse) zzqsVar2).zza.zzc;
                    zzqnVar.zzv(currentTimeMillis);
                }
            }
        }
        zzqzVar.zzC = nanoTime2;
        zzqzVar.zzB = j7;
        zzqzVar.zzD = zzf;
        return j7;
    }

    public final void zzb(long j7) {
        this.zzz = zzl();
        this.zzx = zzgd.zzr(SystemClock.elapsedRealtime());
        this.zzA = j7;
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
            com.google.android.gms.internal.ads.zzqx r0 = new com.google.android.gms.internal.ads.zzqx
            r0.<init>(r3)
            r2.zze = r0
            int r3 = r3.getSampleRate()
            r2.zzf = r3
            r3 = 0
            if (r4 == 0) goto L23
            int r4 = com.google.android.gms.internal.ads.zzgd.zza
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
            boolean r4 = com.google.android.gms.internal.ads.zzgd.zzK(r5)
            r2.zzp = r4
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L3c
            int r7 = r7 / r6
            long r4 = (long) r7
            int r6 = r2.zzf
            long r4 = com.google.android.gms.internal.ads.zzgd.zzs(r4, r6)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqz.zzd(android.media.AudioTrack, boolean, int, int, int):void");
    }

    public final void zze(zzer zzerVar) {
        this.zzI = zzerVar;
    }

    public final void zzf() {
        if (this.zzx != C.TIME_UNSET) {
            this.zzx = zzgd.zzr(SystemClock.elapsedRealtime());
        }
        zzqx zzqxVar = this.zze;
        zzqxVar.getClass();
        zzqxVar.zze();
    }

    public final boolean zzg(long j7) {
        if (j7 <= zzgd.zzo(zza(false), this.zzf)) {
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

    public final boolean zzi(long j7) {
        if (this.zzy != C.TIME_UNSET && j7 > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200) {
            return true;
        }
        return false;
    }

    public final boolean zzj(long j7) {
        zzqs zzqsVar;
        long j9;
        zzqs zzqsVar2;
        zzqn zzqnVar;
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
        boolean z8 = this.zzo;
        boolean zzg = zzg(j7);
        this.zzo = zzg;
        if (z8 && !zzg && playState != 1) {
            zzqy zzqyVar = this.zza;
            int i9 = this.zzd;
            long zzu = zzgd.zzu(this.zzh);
            zzru zzruVar = (zzru) zzqyVar;
            zzrz zzrzVar = zzruVar.zza;
            zzqsVar = zzrzVar.zzq;
            if (zzqsVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j9 = zzrzVar.zzW;
                zzqsVar2 = zzruVar.zza.zzq;
                zzqnVar = ((zzse) zzqsVar2).zza.zzc;
                zzqnVar.zzx(i9, zzu, elapsedRealtime - j9);
            }
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx == C.TIME_UNSET) {
            zzqx zzqxVar = this.zze;
            zzqxVar.getClass();
            zzqxVar.zze();
            return true;
        }
        this.zzz = zzl();
        return false;
    }
}

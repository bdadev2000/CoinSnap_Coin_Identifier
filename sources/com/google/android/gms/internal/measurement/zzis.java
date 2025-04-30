package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzis implements zzli {
    private final zzio zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzis(zzio zzioVar) {
        zzio zzioVar2 = (zzio) zzjm.zza(zzioVar, "input");
        this.zza = zzioVar2;
        zzioVar2.zzc = this;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final double zza() throws IOException {
        zzb(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final float zzb() throws IOException {
        zzb(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final int zzc() throws IOException {
        int i9 = this.zzd;
        if (i9 != 0) {
            this.zzb = i9;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i10 = this.zzb;
        if (i10 == 0 || i10 == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i10 >>> 3;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final int zze() throws IOException {
        zzb(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final int zzf() throws IOException {
        zzb(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final int zzg() throws IOException {
        zzb(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final int zzh() throws IOException {
        zzb(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final int zzi() throws IOException {
        zzb(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final int zzj() throws IOException {
        zzb(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final long zzk() throws IOException {
        zzb(1);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final long zzl() throws IOException {
        zzb(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final long zzm() throws IOException {
        zzb(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final long zzn() throws IOException {
        zzb(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final long zzo() throws IOException {
        zzb(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final zzia zzp() throws IOException {
        zzb(2);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final String zzq() throws IOException {
        zzb(2);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final String zzr() throws IOException {
        zzb(2);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final boolean zzs() throws IOException {
        zzb(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final boolean zzt() throws IOException {
        int i9;
        if (!this.zza.zzt() && (i9 = this.zzb) != this.zzc) {
            return this.zza.zzd(i9);
        }
        return false;
    }

    private final <T> void zzd(T t9, zzll<T> zzllVar, zzix zzixVar) throws IOException {
        int zzj = this.zza.zzj();
        zzio zzioVar = this.zza;
        if (zzioVar.zza < zzioVar.zzb) {
            int zza = zzioVar.zza(zzj);
            this.zza.zza++;
            zzllVar.zza(t9, this, zzixVar);
            this.zza.zzb(0);
            r5.zza--;
            this.zza.zzc(zza);
            return;
        }
        throw new zzjs("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static zzis zza(zzio zzioVar) {
        zzis zzisVar = zzioVar.zzc;
        return zzisVar != null ? zzisVar : new zzis(zzioVar);
    }

    private final <T> T zzb(zzll<T> zzllVar, zzix zzixVar) throws IOException {
        T zza = zzllVar.zza();
        zzd(zza, zzllVar, zzixVar);
        zzllVar.zzc(zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zze(List<Integer> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzjn) {
            zzjn zzjnVar = (zzjn) list;
            int i9 = this.zzb & 7;
            if (i9 != 2) {
                if (i9 != 5) {
                    throw zzjs.zza();
                }
                do {
                    zzjnVar.zzd(this.zza.zze());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            int zzj = this.zza.zzj();
            zzc(zzj);
            int zzc = this.zza.zzc() + zzj;
            do {
                zzjnVar.zzd(this.zza.zze());
            } while (this.zza.zzc() < zzc);
            return;
        }
        int i10 = this.zzb & 7;
        if (i10 != 2) {
            if (i10 != 5) {
                throw zzjs.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        int zzj2 = this.zza.zzj();
        zzc(zzj2);
        int zzc2 = this.zza.zzc() + zzj2;
        do {
            list.add(Integer.valueOf(this.zza.zze()));
        } while (this.zza.zzc() < zzc2);
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zzf(List<Long> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzke) {
            zzke zzkeVar = (zzke) list;
            int i9 = this.zzb & 7;
            if (i9 != 1) {
                if (i9 == 2) {
                    int zzj = this.zza.zzj();
                    zzd(zzj);
                    int zzc = this.zza.zzc() + zzj;
                    do {
                        zzkeVar.zza(this.zza.zzk());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw zzjs.zza();
            }
            do {
                zzkeVar.zza(this.zza.zzk());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i10 = this.zzb & 7;
        if (i10 != 1) {
            if (i10 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc2 = this.zza.zzc() + zzj2;
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            throw zzjs.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzk()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zzg(List<Float> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzjj) {
            zzjj zzjjVar = (zzjj) list;
            int i9 = this.zzb & 7;
            if (i9 != 2) {
                if (i9 != 5) {
                    throw zzjs.zza();
                }
                do {
                    zzjjVar.zza(this.zza.zzb());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            int zzj = this.zza.zzj();
            zzc(zzj);
            int zzc = this.zza.zzc() + zzj;
            do {
                zzjjVar.zza(this.zza.zzb());
            } while (this.zza.zzc() < zzc);
            return;
        }
        int i10 = this.zzb & 7;
        if (i10 != 2) {
            if (i10 != 5) {
                throw zzjs.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        int zzj2 = this.zza.zzj();
        zzc(zzj2);
        int zzc2 = this.zza.zzc() + zzj2;
        do {
            list.add(Float.valueOf(this.zza.zzb()));
        } while (this.zza.zzc() < zzc2);
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zzh(List<Integer> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzjn) {
            zzjn zzjnVar = (zzjn) list;
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 == 2) {
                    int zzc = this.zza.zzc() + this.zza.zzj();
                    do {
                        zzjnVar.zzd(this.zza.zzf());
                    } while (this.zza.zzc() < zzc);
                    zza(zzc);
                    return;
                }
                throw zzjs.zza();
            }
            do {
                zzjnVar.zzd(this.zza.zzf());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
                return;
            }
            throw zzjs.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzf()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zzi(List<Long> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzke) {
            zzke zzkeVar = (zzke) list;
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 == 2) {
                    int zzc = this.zza.zzc() + this.zza.zzj();
                    do {
                        zzkeVar.zza(this.zza.zzl());
                    } while (this.zza.zzc() < zzc);
                    zza(zzc);
                    return;
                }
                throw zzjs.zza();
            }
            do {
                zzkeVar.zza(this.zza.zzl());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
                return;
            }
            throw zzjs.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzl()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zzj(List<Integer> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzjn) {
            zzjn zzjnVar = (zzjn) list;
            int i9 = this.zzb & 7;
            if (i9 != 2) {
                if (i9 != 5) {
                    throw zzjs.zza();
                }
                do {
                    zzjnVar.zzd(this.zza.zzg());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            int zzj = this.zza.zzj();
            zzc(zzj);
            int zzc = this.zza.zzc() + zzj;
            do {
                zzjnVar.zzd(this.zza.zzg());
            } while (this.zza.zzc() < zzc);
            return;
        }
        int i10 = this.zzb & 7;
        if (i10 != 2) {
            if (i10 != 5) {
                throw zzjs.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        int zzj2 = this.zza.zzj();
        zzc(zzj2);
        int zzc2 = this.zza.zzc() + zzj2;
        do {
            list.add(Integer.valueOf(this.zza.zzg()));
        } while (this.zza.zzc() < zzc2);
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zzk(List<Long> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzke) {
            zzke zzkeVar = (zzke) list;
            int i9 = this.zzb & 7;
            if (i9 != 1) {
                if (i9 == 2) {
                    int zzj = this.zza.zzj();
                    zzd(zzj);
                    int zzc = this.zza.zzc() + zzj;
                    do {
                        zzkeVar.zza(this.zza.zzn());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw zzjs.zza();
            }
            do {
                zzkeVar.zza(this.zza.zzn());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i10 = this.zzb & 7;
        if (i10 != 1) {
            if (i10 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc2 = this.zza.zzc() + zzj2;
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            throw zzjs.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzn()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zzl(List<Integer> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzjn) {
            zzjn zzjnVar = (zzjn) list;
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 == 2) {
                    int zzc = this.zza.zzc() + this.zza.zzj();
                    do {
                        zzjnVar.zzd(this.zza.zzh());
                    } while (this.zza.zzc() < zzc);
                    zza(zzc);
                    return;
                }
                throw zzjs.zza();
            }
            do {
                zzjnVar.zzd(this.zza.zzh());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
                return;
            }
            throw zzjs.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzh()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zzm(List<Long> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzke) {
            zzke zzkeVar = (zzke) list;
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 == 2) {
                    int zzc = this.zza.zzc() + this.zza.zzj();
                    do {
                        zzkeVar.zza(this.zza.zzo());
                    } while (this.zza.zzc() < zzc);
                    zza(zzc);
                    return;
                }
                throw zzjs.zza();
            }
            do {
                zzkeVar.zza(this.zza.zzo());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
                return;
            }
            throw zzjs.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzo()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zzn(List<String> list) throws IOException {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zzo(List<String> list) throws IOException {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zzp(List<Integer> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzjn) {
            zzjn zzjnVar = (zzjn) list;
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 == 2) {
                    int zzc = this.zza.zzc() + this.zza.zzj();
                    do {
                        zzjnVar.zzd(this.zza.zzj());
                    } while (this.zza.zzc() < zzc);
                    zza(zzc);
                    return;
                }
                throw zzjs.zza();
            }
            do {
                zzjnVar.zzd(this.zza.zzj());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
                return;
            }
            throw zzjs.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzj()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zzq(List<Long> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzke) {
            zzke zzkeVar = (zzke) list;
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 == 2) {
                    int zzc = this.zza.zzc() + this.zza.zzj();
                    do {
                        zzkeVar.zza(this.zza.zzp());
                    } while (this.zza.zzc() < zzc);
                    zza(zzc);
                    return;
                }
                throw zzjs.zza();
            }
            do {
                zzkeVar.zza(this.zza.zzp());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
                return;
            }
            throw zzjs.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzp()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    private final Object zza(zzmn zzmnVar, Class<?> cls, zzix zzixVar) throws IOException {
        switch (zzir.zza[zzmnVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzlh.zza().zza((Class) cls), zzixVar);
            case 11:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final <T> void zzc(T t9, zzll<T> zzllVar, zzix zzixVar) throws IOException {
        int i9 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzllVar.zza(t9, this, zzixVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzjs.zzg();
            }
        } finally {
            this.zzc = i9;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final <T> void zzb(T t9, zzll<T> zzllVar, zzix zzixVar) throws IOException {
        zzb(2);
        zzd(t9, zzllVar, zzixVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zzb(List<zzia> list) throws IOException {
        int zzi;
        if ((this.zzb & 7) != 2) {
            throw zzjs.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zzd(List<Integer> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzjn) {
            zzjn zzjnVar = (zzjn) list;
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 == 2) {
                    int zzc = this.zza.zzc() + this.zza.zzj();
                    do {
                        zzjnVar.zzd(this.zza.zzd());
                    } while (this.zza.zzc() < zzc);
                    zza(zzc);
                    return;
                }
                throw zzjs.zza();
            }
            do {
                zzjnVar.zzd(this.zza.zzd());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
                return;
            }
            throw zzjs.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzd()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzli
    public final <T> void zzb(List<T> list, zzll<T> zzllVar, zzix zzixVar) throws IOException {
        int zzi;
        int i9 = this.zzb;
        if ((i9 & 7) != 2) {
            throw zzjs.zza();
        }
        do {
            list.add(zzb(zzllVar, zzixVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == i9);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zzc(List<Double> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zziv) {
            zziv zzivVar = (zziv) list;
            int i9 = this.zzb & 7;
            if (i9 != 1) {
                if (i9 == 2) {
                    int zzj = this.zza.zzj();
                    zzd(zzj);
                    int zzc = this.zza.zzc() + zzj;
                    do {
                        zzivVar.zza(this.zza.zza());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw zzjs.zza();
            }
            do {
                zzivVar.zza(this.zza.zza());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i10 = this.zzb & 7;
        if (i10 != 1) {
            if (i10 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc2 = this.zza.zzc() + zzj2;
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            throw zzjs.zza();
        }
        do {
            list.add(Double.valueOf(this.zza.zza()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    private final void zzb(int i9) throws IOException {
        if ((this.zzb & 7) != i9) {
            throw zzjs.zza();
        }
    }

    private final <T> T zza(zzll<T> zzllVar, zzix zzixVar) throws IOException {
        T zza = zzllVar.zza();
        zzc(zza, zzllVar, zzixVar);
        zzllVar.zzc(zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final <T> void zza(T t9, zzll<T> zzllVar, zzix zzixVar) throws IOException {
        zzb(3);
        zzc(t9, zzllVar, zzixVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final void zza(List<Boolean> list) throws IOException {
        int zzi;
        int zzi2;
        if (list instanceof zzhy) {
            zzhy zzhyVar = (zzhy) list;
            int i9 = this.zzb & 7;
            if (i9 != 0) {
                if (i9 == 2) {
                    int zzc = this.zza.zzc() + this.zza.zzj();
                    do {
                        zzhyVar.zza(this.zza.zzu());
                    } while (this.zza.zzc() < zzc);
                    zza(zzc);
                    return;
                }
                throw zzjs.zza();
            }
            do {
                zzhyVar.zza(this.zza.zzu());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i10 = this.zzb & 7;
        if (i10 != 0) {
            if (i10 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Boolean.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
                return;
            }
            throw zzjs.zza();
        }
        do {
            list.add(Boolean.valueOf(this.zza.zzu()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    private static void zzd(int i9) throws IOException {
        if ((i9 & 7) != 0) {
            throw zzjs.zzg();
        }
    }

    private static void zzc(int i9) throws IOException {
        if ((i9 & 3) != 0) {
            throw zzjs.zzg();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzli
    @Deprecated
    public final <T> void zza(List<T> list, zzll<T> zzllVar, zzix zzixVar) throws IOException {
        int zzi;
        int i9 = this.zzb;
        if ((i9 & 7) != 3) {
            throw zzjs.zza();
        }
        do {
            list.add(zza(zzllVar, zzixVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == i9);
        this.zzd = zzi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0060, code lost:
    
        r7.zza.zzc(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0065, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzli
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.measurement.zzkk<K, V> r9, com.google.android.gms.internal.measurement.zzix r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.zzb(r0)
            com.google.android.gms.internal.measurement.zzio r1 = r7.zza
            int r1 = r1.zzj()
            com.google.android.gms.internal.measurement.zzio r2 = r7.zza
            int r1 = r2.zza(r1)
            K r2 = r9.zzb
            V r3 = r9.zzd
        L14:
            int r4 = r7.zzc()     // Catch: java.lang.Throwable -> L39
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5d
            com.google.android.gms.internal.measurement.zzio r5 = r7.zza     // Catch: java.lang.Throwable -> L39
            boolean r5 = r5.zzt()     // Catch: java.lang.Throwable -> L39
            if (r5 != 0) goto L5d
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L48
            if (r4 == r0) goto L3b
            boolean r4 = r7.zzt()     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzjv -> L50
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.measurement.zzjs r4 = new com.google.android.gms.internal.measurement.zzjs     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzjv -> L50
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzjv -> L50
            throw r4     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzjv -> L50
        L39:
            r8 = move-exception
            goto L66
        L3b:
            com.google.android.gms.internal.measurement.zzmn r4 = r9.zzc     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzjv -> L50
            V r5 = r9.zzd     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzjv -> L50
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzjv -> L50
            java.lang.Object r3 = r7.zza(r4, r5, r10)     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzjv -> L50
            goto L14
        L48:
            com.google.android.gms.internal.measurement.zzmn r4 = r9.zza     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzjv -> L50
            r5 = 0
            java.lang.Object r2 = r7.zza(r4, r5, r5)     // Catch: java.lang.Throwable -> L39 com.google.android.gms.internal.measurement.zzjv -> L50
            goto L14
        L50:
            boolean r4 = r7.zzt()     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L57
            goto L14
        L57:
            com.google.android.gms.internal.measurement.zzjs r8 = new com.google.android.gms.internal.measurement.zzjs     // Catch: java.lang.Throwable -> L39
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L39
            throw r8     // Catch: java.lang.Throwable -> L39
        L5d:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.measurement.zzio r8 = r7.zza
            r8.zzc(r1)
            return
        L66:
            com.google.android.gms.internal.measurement.zzio r9 = r7.zza
            r9.zzc(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzis.zza(java.util.Map, com.google.android.gms.internal.measurement.zzkk, com.google.android.gms.internal.measurement.zzix):void");
    }

    private final void zza(List<String> list, boolean z8) throws IOException {
        int zzi;
        int zzi2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzka) && !z8) {
                zzka zzkaVar = (zzka) list;
                do {
                    zzkaVar.zza(zzp());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            do {
                list.add(z8 ? zzr() : zzq());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzjs.zza();
    }

    private final void zza(int i9) throws IOException {
        if (this.zza.zzc() != i9) {
            throw zzjs.zzh();
        }
    }
}

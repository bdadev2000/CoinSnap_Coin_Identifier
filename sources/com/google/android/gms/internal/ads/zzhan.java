package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhan implements zzhdr {
    private final zzham zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzhan(zzham zzhamVar) {
        zzhcb.zzc(zzhamVar, "input");
        this.zza = zzhamVar;
        zzhamVar.zzc = this;
    }

    private final Object zzR(zzhdz zzhdzVar, zzhay zzhayVar) throws IOException {
        Object zze = zzhdzVar.zze();
        zzT(zze, zzhdzVar, zzhayVar);
        zzhdzVar.zzf(zze);
        return zze;
    }

    private final Object zzS(zzhdz zzhdzVar, zzhay zzhayVar) throws IOException {
        Object zze = zzhdzVar.zze();
        zzU(zze, zzhdzVar, zzhayVar);
        zzhdzVar.zzf(zze);
        return zze;
    }

    private final void zzT(Object obj, zzhdz zzhdzVar, zzhay zzhayVar) throws IOException {
        int i9 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzhdzVar.zzh(obj, this, zzhayVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzhcd.zzg();
            }
        } finally {
            this.zzc = i9;
        }
    }

    private final void zzU(Object obj, zzhdz zzhdzVar, zzhay zzhayVar) throws IOException {
        zzham zzhamVar = this.zza;
        int zzn = zzhamVar.zzn();
        if (zzhamVar.zza < zzhamVar.zzb) {
            int zze = this.zza.zze(zzn);
            this.zza.zza++;
            zzhdzVar.zzh(obj, this, zzhayVar);
            this.zza.zzz(0);
            r4.zza--;
            this.zza.zzA(zze);
            return;
        }
        throw new zzhcd("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzV(int i9) throws IOException {
        if (this.zza.zzd() == i9) {
        } else {
            throw zzhcd.zzj();
        }
    }

    private final void zzW(int i9) throws IOException {
        if ((this.zzb & 7) == i9) {
        } else {
            throw zzhcd.zza();
        }
    }

    private static final void zzX(int i9) throws IOException {
        if ((i9 & 3) == 0) {
        } else {
            throw zzhcd.zzg();
        }
    }

    private static final void zzY(int i9) throws IOException {
        if ((i9 & 7) == 0) {
        } else {
            throw zzhcd.zzg();
        }
    }

    public static zzhan zzq(zzham zzhamVar) {
        zzhan zzhanVar = zzhamVar.zzc;
        if (zzhanVar != null) {
            return zzhanVar;
        }
        return new zzhan(zzhamVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzA(List list) throws IOException {
        int zzm;
        int i9;
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    zzham zzhamVar = this.zza;
                    int zzd = zzhamVar.zzd() + zzhamVar.zzn();
                    do {
                        zzhbpVar.zzi(this.zza.zzf());
                    } while (this.zza.zzd() < zzd);
                    zzV(zzd);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                zzhbpVar.zzi(this.zza.zzf());
                if (!this.zza.zzC()) {
                    i9 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i9 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzham zzhamVar2 = this.zza;
                    int zzd2 = zzhamVar2.zzd() + zzhamVar2.zzn();
                    do {
                        list.add(Integer.valueOf(this.zza.zzf()));
                    } while (this.zza.zzd() < zzd2);
                    zzV(zzd2);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i9 = zzm;
        }
        this.zzd = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzB(List list) throws IOException {
        int zzm;
        int i9;
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            int i10 = this.zzb & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    throw zzhcd.zza();
                }
                do {
                    zzhbpVar.zzi(this.zza.zzg());
                    if (!this.zza.zzC()) {
                        i9 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i9 == this.zzb);
            } else {
                int zzn = this.zza.zzn();
                zzX(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzhbpVar.zzi(this.zza.zzg());
                } while (this.zza.zzd() < zzd);
                return;
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 2) {
                if (i11 != 5) {
                    throw zzhcd.zza();
                }
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i9 = zzm;
            } else {
                int zzn2 = this.zza.zzn();
                zzX(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
        }
        this.zzd = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzC(List list) throws IOException {
        int zzm;
        int i9;
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zzn = this.zza.zzn();
                    zzY(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzhctVar.zzg(this.zza.zzo());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                zzhctVar.zzg(this.zza.zzo());
                if (!this.zza.zzC()) {
                    i9 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i9 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    int zzn2 = this.zza.zzn();
                    zzY(zzn2);
                    int zzd2 = this.zza.zzd() + zzn2;
                    do {
                        list.add(Long.valueOf(this.zza.zzo()));
                    } while (this.zza.zzd() < zzd2);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i9 = zzm;
        }
        this.zzd = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzD(List list) throws IOException {
        int zzm;
        int i9;
        if (list instanceof zzhbf) {
            zzhbf zzhbfVar = (zzhbf) list;
            int i10 = this.zzb & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    throw zzhcd.zza();
                }
                do {
                    zzhbfVar.zzh(this.zza.zzc());
                    if (!this.zza.zzC()) {
                        i9 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i9 == this.zzb);
            } else {
                int zzn = this.zza.zzn();
                zzX(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzhbfVar.zzh(this.zza.zzc());
                } while (this.zza.zzd() < zzd);
                return;
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 2) {
                if (i11 != 5) {
                    throw zzhcd.zza();
                }
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i9 = zzm;
            } else {
                int zzn2 = this.zza.zzn();
                zzX(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
        }
        this.zzd = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    @Deprecated
    public final void zzE(List list, zzhdz zzhdzVar, zzhay zzhayVar) throws IOException {
        int zzm;
        int i9 = this.zzb;
        if ((i9 & 7) != 3) {
            throw zzhcd.zza();
        }
        do {
            list.add(zzR(zzhdzVar, zzhayVar));
            if (!this.zza.zzC() && this.zzd == 0) {
                zzm = this.zza.zzm();
            } else {
                return;
            }
        } while (zzm == i9);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzF(List list) throws IOException {
        int zzm;
        int i9;
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    zzham zzhamVar = this.zza;
                    int zzd = zzhamVar.zzd() + zzhamVar.zzn();
                    do {
                        zzhbpVar.zzi(this.zza.zzh());
                    } while (this.zza.zzd() < zzd);
                    zzV(zzd);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                zzhbpVar.zzi(this.zza.zzh());
                if (!this.zza.zzC()) {
                    i9 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i9 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzham zzhamVar2 = this.zza;
                    int zzd2 = zzhamVar2.zzd() + zzhamVar2.zzn();
                    do {
                        list.add(Integer.valueOf(this.zza.zzh()));
                    } while (this.zza.zzd() < zzd2);
                    zzV(zzd2);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i9 = zzm;
        }
        this.zzd = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzG(List list) throws IOException {
        int zzm;
        int i9;
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    zzham zzhamVar = this.zza;
                    int zzd = zzhamVar.zzd() + zzhamVar.zzn();
                    do {
                        zzhctVar.zzg(this.zza.zzp());
                    } while (this.zza.zzd() < zzd);
                    zzV(zzd);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                zzhctVar.zzg(this.zza.zzp());
                if (!this.zza.zzC()) {
                    i9 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i9 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzham zzhamVar2 = this.zza;
                    int zzd2 = zzhamVar2.zzd() + zzhamVar2.zzn();
                    do {
                        list.add(Long.valueOf(this.zza.zzp()));
                    } while (this.zza.zzd() < zzd2);
                    zzV(zzd2);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i9 = zzm;
        }
        this.zzd = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzH(List list, zzhdz zzhdzVar, zzhay zzhayVar) throws IOException {
        int zzm;
        int i9 = this.zzb;
        if ((i9 & 7) != 2) {
            throw zzhcd.zza();
        }
        do {
            list.add(zzS(zzhdzVar, zzhayVar));
            if (!this.zza.zzC() && this.zzd == 0) {
                zzm = this.zza.zzm();
            } else {
                return;
            }
        } while (zzm == i9);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzI(List list) throws IOException {
        int zzm;
        int i9;
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            int i10 = this.zzb & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    throw zzhcd.zza();
                }
                do {
                    zzhbpVar.zzi(this.zza.zzk());
                    if (!this.zza.zzC()) {
                        i9 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i9 == this.zzb);
            } else {
                int zzn = this.zza.zzn();
                zzX(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzhbpVar.zzi(this.zza.zzk());
                } while (this.zza.zzd() < zzd);
                return;
            }
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 2) {
                if (i11 != 5) {
                    throw zzhcd.zza();
                }
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i9 = zzm;
            } else {
                int zzn2 = this.zza.zzn();
                zzX(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
        }
        this.zzd = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzJ(List list) throws IOException {
        int zzm;
        int i9;
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zzn = this.zza.zzn();
                    zzY(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzhctVar.zzg(this.zza.zzt());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                zzhctVar.zzg(this.zza.zzt());
                if (!this.zza.zzC()) {
                    i9 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i9 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    int zzn2 = this.zza.zzn();
                    zzY(zzn2);
                    int zzd2 = this.zza.zzd() + zzn2;
                    do {
                        list.add(Long.valueOf(this.zza.zzt()));
                    } while (this.zza.zzd() < zzd2);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i9 = zzm;
        }
        this.zzd = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzK(List list) throws IOException {
        int zzm;
        int i9;
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    zzham zzhamVar = this.zza;
                    int zzd = zzhamVar.zzd() + zzhamVar.zzn();
                    do {
                        zzhbpVar.zzi(this.zza.zzl());
                    } while (this.zza.zzd() < zzd);
                    zzV(zzd);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                zzhbpVar.zzi(this.zza.zzl());
                if (!this.zza.zzC()) {
                    i9 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i9 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzham zzhamVar2 = this.zza;
                    int zzd2 = zzhamVar2.zzd() + zzhamVar2.zzn();
                    do {
                        list.add(Integer.valueOf(this.zza.zzl()));
                    } while (this.zza.zzd() < zzd2);
                    zzV(zzd2);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i9 = zzm;
        }
        this.zzd = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzL(List list) throws IOException {
        int zzm;
        int i9;
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    zzham zzhamVar = this.zza;
                    int zzd = zzhamVar.zzd() + zzhamVar.zzn();
                    do {
                        zzhctVar.zzg(this.zza.zzu());
                    } while (this.zza.zzd() < zzd);
                    zzV(zzd);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                zzhctVar.zzg(this.zza.zzu());
                if (!this.zza.zzC()) {
                    i9 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i9 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzham zzhamVar2 = this.zza;
                    int zzd2 = zzhamVar2.zzd() + zzhamVar2.zzn();
                    do {
                        list.add(Long.valueOf(this.zza.zzu()));
                    } while (this.zza.zzd() < zzd2);
                    zzV(zzd2);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i9 = zzm;
        }
        this.zzd = i9;
    }

    public final void zzM(List list, boolean z8) throws IOException {
        String zzt;
        int zzm;
        int i9;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzhcm) && !z8) {
                zzhcm zzhcmVar = (zzhcm) list;
                do {
                    zzhcmVar.zzi(zzp());
                    if (!this.zza.zzC()) {
                        i9 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i9 == this.zzb);
            } else {
                do {
                    if (z8) {
                        zzt = zzu();
                    } else {
                        zzt = zzt();
                    }
                    list.add(zzt);
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm = this.zza.zzm();
                    }
                } while (zzm == this.zzb);
                i9 = zzm;
            }
            this.zzd = i9;
            return;
        }
        throw zzhcd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzN(List list) throws IOException {
        int zzm;
        int i9;
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    zzham zzhamVar = this.zza;
                    int zzd = zzhamVar.zzd() + zzhamVar.zzn();
                    do {
                        zzhbpVar.zzi(this.zza.zzn());
                    } while (this.zza.zzd() < zzd);
                    zzV(zzd);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                zzhbpVar.zzi(this.zza.zzn());
                if (!this.zza.zzC()) {
                    i9 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i9 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzham zzhamVar2 = this.zza;
                    int zzd2 = zzhamVar2.zzd() + zzhamVar2.zzn();
                    do {
                        list.add(Integer.valueOf(this.zza.zzn()));
                    } while (this.zza.zzd() < zzd2);
                    zzV(zzd2);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i9 = zzm;
        }
        this.zzd = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzO(List list) throws IOException {
        int zzm;
        int i9;
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    zzham zzhamVar = this.zza;
                    int zzd = zzhamVar.zzd() + zzhamVar.zzn();
                    do {
                        zzhctVar.zzg(this.zza.zzv());
                    } while (this.zza.zzd() < zzd);
                    zzV(zzd);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                zzhctVar.zzg(this.zza.zzv());
                if (!this.zza.zzC()) {
                    i9 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i9 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzham zzhamVar2 = this.zza;
                    int zzd2 = zzhamVar2.zzd() + zzhamVar2.zzn();
                    do {
                        list.add(Long.valueOf(this.zza.zzv()));
                    } while (this.zza.zzd() < zzd2);
                    zzV(zzd2);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                list.add(Long.valueOf(this.zza.zzv()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i9 = zzm;
        }
        this.zzd = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final boolean zzP() throws IOException {
        zzW(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final boolean zzQ() throws IOException {
        int i9;
        if (!this.zza.zzC() && (i9 = this.zzb) != this.zzc) {
            return this.zza.zzE(i9);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final double zza() throws IOException {
        zzW(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final float zzb() throws IOException {
        zzW(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final int zzc() throws IOException {
        int i9 = this.zzd;
        if (i9 != 0) {
            this.zzb = i9;
            this.zzd = 0;
        } else {
            i9 = this.zza.zzm();
            this.zzb = i9;
        }
        if (i9 != 0 && i9 != this.zzc) {
            return i9 >>> 3;
        }
        return Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final int zze() throws IOException {
        zzW(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final int zzf() throws IOException {
        zzW(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final int zzg() throws IOException {
        zzW(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final int zzh() throws IOException {
        zzW(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final int zzi() throws IOException {
        zzW(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final int zzj() throws IOException {
        zzW(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final long zzk() throws IOException {
        zzW(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final long zzl() throws IOException {
        zzW(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final long zzm() throws IOException {
        zzW(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final long zzn() throws IOException {
        zzW(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final long zzo() throws IOException {
        zzW(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final zzhac zzp() throws IOException {
        zzW(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    @Deprecated
    public final Object zzr(Class cls, zzhay zzhayVar) throws IOException {
        zzW(3);
        return zzR(zzhdo.zza().zzb(cls), zzhayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final Object zzs(Class cls, zzhay zzhayVar) throws IOException {
        zzW(2);
        return zzS(zzhdo.zza().zzb(cls), zzhayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final String zzt() throws IOException {
        zzW(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final String zzu() throws IOException {
        zzW(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzv(Object obj, zzhdz zzhdzVar, zzhay zzhayVar) throws IOException {
        zzW(3);
        zzT(obj, zzhdzVar, zzhayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzw(Object obj, zzhdz zzhdzVar, zzhay zzhayVar) throws IOException {
        zzW(2);
        zzU(obj, zzhdzVar, zzhayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzx(List list) throws IOException {
        int zzm;
        int i9;
        if (list instanceof zzgzp) {
            zzgzp zzgzpVar = (zzgzp) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    zzham zzhamVar = this.zza;
                    int zzd = zzhamVar.zzd() + zzhamVar.zzn();
                    do {
                        zzgzpVar.zzg(this.zza.zzD());
                    } while (this.zza.zzd() < zzd);
                    zzV(zzd);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                zzgzpVar.zzg(this.zza.zzD());
                if (!this.zza.zzC()) {
                    i9 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i9 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzham zzhamVar2 = this.zza;
                    int zzd2 = zzhamVar2.zzd() + zzhamVar2.zzn();
                    do {
                        list.add(Boolean.valueOf(this.zza.zzD()));
                    } while (this.zza.zzd() < zzd2);
                    zzV(zzd2);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i9 = zzm;
        }
        this.zzd = i9;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzy(List list) throws IOException {
        int zzm;
        if ((this.zzb & 7) != 2) {
            throw zzhcd.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    public final void zzz(List list) throws IOException {
        int zzm;
        int i9;
        if (list instanceof zzhav) {
            zzhav zzhavVar = (zzhav) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zzn = this.zza.zzn();
                    zzY(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzhavVar.zzh(this.zza.zzb());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                zzhavVar.zzh(this.zza.zzb());
                if (!this.zza.zzC()) {
                    i9 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i9 == this.zzb);
        } else {
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    int zzn2 = this.zza.zzn();
                    zzY(zzn2);
                    int zzd2 = this.zza.zzd() + zzn2;
                    do {
                        list.add(Double.valueOf(this.zza.zzb()));
                    } while (this.zza.zzd() < zzd2);
                    return;
                }
                throw zzhcd.zza();
            }
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i9 = zzm;
        }
        this.zzd = i9;
    }
}

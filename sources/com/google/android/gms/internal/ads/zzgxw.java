package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgxw implements zzhav {
    private final zzgxv zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgxw(zzgxv zzgxvVar) {
        zzgzk.zzc(zzgxvVar, "input");
        this.zza = zzgxvVar;
        zzgxvVar.zzc = this;
    }

    private final void zzO(Object obj, zzhbb zzhbbVar, zzgyh zzgyhVar) throws IOException {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzhbbVar.zzh(obj, this, zzgyhVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new zzgzm("Failed to parse the message.");
            }
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzP(Object obj, zzhbb zzhbbVar, zzgyh zzgyhVar) throws IOException {
        zzgxv zzgxvVar = this.zza;
        int zzm = zzgxvVar.zzm();
        if (zzgxvVar.zza < zzgxvVar.zzb) {
            int zzd = zzgxvVar.zzd(zzm);
            this.zza.zza++;
            zzhbbVar.zzh(obj, this, zzgyhVar);
            this.zza.zzy(0);
            r5.zza--;
            this.zza.zzz(zzd);
            return;
        }
        throw new zzgzm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    private final void zzQ(int i10) throws IOException {
        if (this.zza.zzc() == i10) {
        } else {
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzR(int i10) throws IOException {
        if ((this.zzb & 7) == i10) {
        } else {
            throw new zzgzl("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzS(int i10) throws IOException {
        if ((i10 & 3) == 0) {
        } else {
            throw new zzgzm("Failed to parse the message.");
        }
    }

    private static final void zzT(int i10) throws IOException {
        if ((i10 & 7) == 0) {
        } else {
            throw new zzgzm("Failed to parse the message.");
        }
    }

    public static zzgxw zzq(zzgxv zzgxvVar) {
        zzgxw zzgxwVar = zzgxvVar.zzc;
        if (zzgxwVar != null) {
            return zzgxwVar;
        }
        return new zzgxw(zzgxvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzA(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    int zzm = this.zza.zzm();
                    zzT(zzm);
                    int zzc = zzm + this.zza.zzc();
                    do {
                        zzgzxVar.zzg(this.zza.zzn());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                zzgzxVar.zzg(this.zza.zzn());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 1) {
                if (i12 == 2) {
                    int zzm2 = this.zza.zzm();
                    zzT(zzm2);
                    int zzc2 = zzm2 + this.zza.zzc();
                    do {
                        list.add(Long.valueOf(this.zza.zzn()));
                    } while (this.zza.zzc() < zzc2);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzB(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgyo) {
            zzgyo zzgyoVar = (zzgyo) list;
            int i11 = this.zzb & 7;
            if (i11 != 2) {
                if (i11 != 5) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                do {
                    zzgyoVar.zzh(this.zza.zzb());
                    if (!this.zza.zzA()) {
                        i10 = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgyoVar.zzh(this.zza.zzb());
                } while (this.zza.zzc() < zzc);
                return;
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 2) {
                if (i12 != 5) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i10 = zzl;
            } else {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    @Deprecated
    public final void zzC(List list, zzhbb zzhbbVar, zzgyh zzgyhVar) throws IOException {
        int zzl;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw new zzgzl("Protocol message tag had invalid wire type.");
        }
        do {
            Object zze = zzhbbVar.zze();
            zzO(zze, zzhbbVar, zzgyhVar);
            zzhbbVar.zzf(zze);
            list.add(zze);
            if (!this.zza.zzA() && this.zzd == 0) {
                zzl = this.zza.zzl();
            } else {
                return;
            }
        } while (zzl == i10);
        this.zzd = zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzD(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgxv zzgxvVar = this.zza;
                    int zzc = zzgxvVar.zzc() + zzgxvVar.zzm();
                    do {
                        zzgyyVar.zzi(this.zza.zzg());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                zzgyyVar.zzi(this.zza.zzg());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgxv zzgxvVar2 = this.zza;
                    int zzc2 = zzgxvVar2.zzc() + zzgxvVar2.zzm();
                    do {
                        list.add(Integer.valueOf(this.zza.zzg()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzE(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgxv zzgxvVar = this.zza;
                    int zzc = zzgxvVar.zzc() + zzgxvVar.zzm();
                    do {
                        zzgzxVar.zzg(this.zza.zzo());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                zzgzxVar.zzg(this.zza.zzo());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgxv zzgxvVar2 = this.zza;
                    int zzc2 = zzgxvVar2.zzc() + zzgxvVar2.zzm();
                    do {
                        list.add(Long.valueOf(this.zza.zzo()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzF(List list, zzhbb zzhbbVar, zzgyh zzgyhVar) throws IOException {
        int zzl;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw new zzgzl("Protocol message tag had invalid wire type.");
        }
        do {
            Object zze = zzhbbVar.zze();
            zzP(zze, zzhbbVar, zzgyhVar);
            zzhbbVar.zzf(zze);
            list.add(zze);
            if (!this.zza.zzA() && this.zzd == 0) {
                zzl = this.zza.zzl();
            } else {
                return;
            }
        } while (zzl == i10);
        this.zzd = zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzG(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i11 = this.zzb & 7;
            if (i11 != 2) {
                if (i11 != 5) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                do {
                    zzgyyVar.zzi(this.zza.zzj());
                    if (!this.zza.zzA()) {
                        i10 = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgyyVar.zzi(this.zza.zzj());
                } while (this.zza.zzc() < zzc);
                return;
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 2) {
                if (i12 != 5) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i10 = zzl;
            } else {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzH(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    int zzm = this.zza.zzm();
                    zzT(zzm);
                    int zzc = zzm + this.zza.zzc();
                    do {
                        zzgzxVar.zzg(this.zza.zzs());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                zzgzxVar.zzg(this.zza.zzs());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 1) {
                if (i12 == 2) {
                    int zzm2 = this.zza.zzm();
                    zzT(zzm2);
                    int zzc2 = zzm2 + this.zza.zzc();
                    do {
                        list.add(Long.valueOf(this.zza.zzs()));
                    } while (this.zza.zzc() < zzc2);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Long.valueOf(this.zza.zzs()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzI(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgxv zzgxvVar = this.zza;
                    int zzc = zzgxvVar.zzc() + zzgxvVar.zzm();
                    do {
                        zzgyyVar.zzi(this.zza.zzk());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                zzgyyVar.zzi(this.zza.zzk());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgxv zzgxvVar2 = this.zza;
                    int zzc2 = zzgxvVar2.zzc() + zzgxvVar2.zzm();
                    do {
                        list.add(Integer.valueOf(this.zza.zzk()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzJ(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgxv zzgxvVar = this.zza;
                    int zzc = zzgxvVar.zzc() + zzgxvVar.zzm();
                    do {
                        zzgzxVar.zzg(this.zza.zzt());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                zzgzxVar.zzg(this.zza.zzt());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgxv zzgxvVar2 = this.zza;
                    int zzc2 = zzgxvVar2.zzc() + zzgxvVar2.zzm();
                    do {
                        list.add(Long.valueOf(this.zza.zzt()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    public final void zzK(List list, boolean z10) throws IOException {
        String zzr;
        int zzl;
        int i10;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzgzu) && !z10) {
                zzgzu zzgzuVar = (zzgzu) list;
                do {
                    zzp();
                    zzgzuVar.zzb();
                    if (!this.zza.zzA()) {
                        i10 = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else {
                do {
                    if (z10) {
                        zzr = zzs();
                    } else {
                        zzr = zzr();
                    }
                    list.add(zzr);
                    if (this.zza.zzA()) {
                        return;
                    } else {
                        zzl = this.zza.zzl();
                    }
                } while (zzl == this.zzb);
                i10 = zzl;
            }
            this.zzd = i10;
            return;
        }
        throw new zzgzl("Protocol message tag had invalid wire type.");
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzL(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgxv zzgxvVar = this.zza;
                    int zzc = zzgxvVar.zzc() + zzgxvVar.zzm();
                    do {
                        zzgyyVar.zzi(this.zza.zzm());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                zzgyyVar.zzi(this.zza.zzm());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgxv zzgxvVar2 = this.zza;
                    int zzc2 = zzgxvVar2.zzc() + zzgxvVar2.zzm();
                    do {
                        list.add(Integer.valueOf(this.zza.zzm()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzm()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzM(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgxv zzgxvVar = this.zza;
                    int zzc = zzgxvVar.zzc() + zzgxvVar.zzm();
                    do {
                        zzgzxVar.zzg(this.zza.zzu());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                zzgzxVar.zzg(this.zza.zzu());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgxv zzgxvVar2 = this.zza;
                    int zzc2 = zzgxvVar2.zzc() + zzgxvVar2.zzm();
                    do {
                        list.add(Long.valueOf(this.zza.zzu()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final boolean zzN() throws IOException {
        zzR(0);
        return this.zza.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final double zza() throws IOException {
        zzR(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final float zzb() throws IOException {
        zzR(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final int zzc() throws IOException {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            i10 = this.zza.zzl();
            this.zzb = i10;
        }
        if (i10 == 0 || i10 == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i10 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final int zze() throws IOException {
        zzR(0);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final int zzf() throws IOException {
        zzR(5);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final int zzg() throws IOException {
        zzR(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final int zzh() throws IOException {
        zzR(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final int zzi() throws IOException {
        zzR(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final int zzj() throws IOException {
        zzR(0);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final long zzk() throws IOException {
        zzR(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final long zzl() throws IOException {
        zzR(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final long zzm() throws IOException {
        zzR(1);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final long zzn() throws IOException {
        zzR(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final long zzo() throws IOException {
        zzR(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final zzgxp zzp() throws IOException {
        zzR(2);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final String zzr() throws IOException {
        zzR(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final String zzs() throws IOException {
        zzR(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzt(Object obj, zzhbb zzhbbVar, zzgyh zzgyhVar) throws IOException {
        zzR(3);
        zzO(obj, zzhbbVar, zzgyhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzu(Object obj, zzhbb zzhbbVar, zzgyh zzgyhVar) throws IOException {
        zzR(2);
        zzP(obj, zzhbbVar, zzgyhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzv(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgxf) {
            zzgxf zzgxfVar = (zzgxf) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgxv zzgxvVar = this.zza;
                    int zzc = zzgxvVar.zzc() + zzgxvVar.zzm();
                    do {
                        zzgxfVar.zzg(this.zza.zzB());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxfVar.zzg(this.zza.zzB());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgxv zzgxvVar2 = this.zza;
                    int zzc2 = zzgxvVar2.zzc() + zzgxvVar2.zzm();
                    do {
                        list.add(Boolean.valueOf(this.zza.zzB()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzB()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzw(List list) throws IOException {
        int zzl;
        if ((this.zzb & 7) != 2) {
            throw new zzgzl("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzp());
            if (this.zza.zzA()) {
                return;
            } else {
                zzl = this.zza.zzl();
            }
        } while (zzl == this.zzb);
        this.zzd = zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzx(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgye) {
            zzgye zzgyeVar = (zzgye) list;
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    int zzm = this.zza.zzm();
                    zzT(zzm);
                    int zzc = zzm + this.zza.zzc();
                    do {
                        zzgyeVar.zzh(this.zza.zza());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                zzgyeVar.zzh(this.zza.zza());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 1) {
                if (i12 == 2) {
                    int zzm2 = this.zza.zzm();
                    zzT(zzm2);
                    int zzc2 = zzm2 + this.zza.zzc();
                    do {
                        list.add(Double.valueOf(this.zza.zza()));
                    } while (this.zza.zzc() < zzc2);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzy(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzgxv zzgxvVar = this.zza;
                    int zzc = zzgxvVar.zzc() + zzgxvVar.zzm();
                    do {
                        zzgyyVar.zzi(this.zza.zze());
                    } while (this.zza.zzc() < zzc);
                    zzQ(zzc);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                zzgyyVar.zzi(this.zza.zze());
                if (!this.zza.zzA()) {
                    i10 = this.zza.zzl();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzgxv zzgxvVar2 = this.zza;
                    int zzc2 = zzgxvVar2.zzc() + zzgxvVar2.zzm();
                    do {
                        list.add(Integer.valueOf(this.zza.zze()));
                    } while (this.zza.zzc() < zzc2);
                    zzQ(zzc2);
                    return;
                }
                throw new zzgzl("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (!this.zza.zzA()) {
                    zzl = this.zza.zzl();
                } else {
                    return;
                }
            } while (zzl == this.zzb);
            i10 = zzl;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    public final void zzz(List list) throws IOException {
        int zzl;
        int i10;
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            int i11 = this.zzb & 7;
            if (i11 != 2) {
                if (i11 != 5) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                do {
                    zzgyyVar.zzi(this.zza.zzf());
                    if (!this.zza.zzA()) {
                        i10 = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzgyyVar.zzi(this.zza.zzf());
                } while (this.zza.zzc() < zzc);
                return;
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 2) {
                if (i12 != 5) {
                    throw new zzgzl("Protocol message tag had invalid wire type.");
                }
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (!this.zza.zzA()) {
                        zzl = this.zza.zzl();
                    } else {
                        return;
                    }
                } while (zzl == this.zzb);
                i10 = zzl;
            } else {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
        }
        this.zzd = i10;
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhad implements zzhdc {
    private final zzhac zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzhad(zzhac zzhacVar) {
        zzhbr.zzc(zzhacVar, "input");
        this.zza = zzhacVar;
        zzhacVar.zzc = this;
    }

    private final void zzO(Object obj, zzhdk zzhdkVar, zzhao zzhaoVar) throws IOException {
        int i2 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzhdkVar.zzh(obj, this, zzhaoVar);
            if (this.zzb == this.zzc) {
            } else {
                throw new zzhbt("Failed to parse the message.");
            }
        } finally {
            this.zzc = i2;
        }
    }

    private final void zzP(Object obj, zzhdk zzhdkVar, zzhao zzhaoVar) throws IOException {
        zzhac zzhacVar = this.zza;
        int zzm = zzhacVar.zzm();
        if (zzhacVar.zza >= zzhacVar.zzb) {
            throw new zzhbt("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int zzd = zzhacVar.zzd(zzm);
        this.zza.zza++;
        zzhdkVar.zzh(obj, this, zzhaoVar);
        this.zza.zzy(0);
        r5.zza--;
        this.zza.zzz(zzd);
    }

    private final void zzQ(int i2) throws IOException {
        if (this.zza.zzc() != i2) {
            throw new zzhbt("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzR(int i2) throws IOException {
        if ((this.zzb & 7) != i2) {
            throw new zzhbs("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzS(int i2) throws IOException {
        if ((i2 & 3) != 0) {
            throw new zzhbt("Failed to parse the message.");
        }
    }

    private static final void zzT(int i2) throws IOException {
        if ((i2 & 7) != 0) {
            throw new zzhbt("Failed to parse the message.");
        }
    }

    public static zzhad zzq(zzhac zzhacVar) {
        zzhad zzhadVar = zzhacVar.zzc;
        return zzhadVar != null ? zzhadVar : new zzhad(zzhacVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzA(List list) throws IOException {
        int zzl;
        int i2;
        if (list instanceof zzhce) {
            zzhce zzhceVar = (zzhce) list;
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                int zzm = this.zza.zzm();
                zzT(zzm);
                int zzc = zzm + this.zza.zzc();
                do {
                    zzhceVar.zzg(this.zza.zzn());
                } while (this.zza.zzc() < zzc);
                return;
            }
            do {
                zzhceVar.zzg(this.zza.zzn());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i2 = this.zza.zzl();
                }
            } while (i2 == this.zzb);
        } else {
            int i4 = this.zzb & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                int zzm2 = this.zza.zzm();
                zzT(zzm2);
                int zzc2 = zzm2 + this.zza.zzc();
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i2 = zzl;
        }
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzB(List list) throws IOException {
        int zzl;
        int i2;
        if (list instanceof zzhav) {
            zzhav zzhavVar = (zzhav) list;
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzhavVar.zzh(this.zza.zzb());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i3 != 5) {
                throw new zzhbs("Protocol message tag had invalid wire type.");
            }
            do {
                zzhavVar.zzh(this.zza.zzb());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i2 = this.zza.zzl();
                }
            } while (i2 == this.zzb);
        } else {
            int i4 = this.zzb & 7;
            if (i4 == 2) {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            if (i4 != 5) {
                throw new zzhbs("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i2 = zzl;
        }
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    @Deprecated
    public final void zzC(List list, zzhdk zzhdkVar, zzhao zzhaoVar) throws IOException {
        int zzl;
        int i2 = this.zzb;
        if ((i2 & 7) != 3) {
            throw new zzhbs("Protocol message tag had invalid wire type.");
        }
        do {
            Object zze = zzhdkVar.zze();
            zzO(zze, zzhdkVar, zzhaoVar);
            zzhdkVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzA() || this.zzd != 0) {
                return;
            } else {
                zzl = this.zza.zzl();
            }
        } while (zzl == i2);
        this.zzd = zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzD(List list) throws IOException {
        int zzl;
        int i2;
        if (list instanceof zzhbf) {
            zzhbf zzhbfVar = (zzhbf) list;
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                zzhac zzhacVar = this.zza;
                int zzc = zzhacVar.zzc() + zzhacVar.zzm();
                do {
                    zzhbfVar.zzi(this.zza.zzg());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzhbfVar.zzi(this.zza.zzg());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i2 = this.zza.zzl();
                }
            } while (i2 == this.zzb);
        } else {
            int i4 = this.zzb & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                zzhac zzhacVar2 = this.zza;
                int zzc2 = zzhacVar2.zzc() + zzhacVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i2 = zzl;
        }
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzE(List list) throws IOException {
        int zzl;
        int i2;
        if (list instanceof zzhce) {
            zzhce zzhceVar = (zzhce) list;
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                zzhac zzhacVar = this.zza;
                int zzc = zzhacVar.zzc() + zzhacVar.zzm();
                do {
                    zzhceVar.zzg(this.zza.zzo());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzhceVar.zzg(this.zza.zzo());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i2 = this.zza.zzl();
                }
            } while (i2 == this.zzb);
        } else {
            int i4 = this.zzb & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                zzhac zzhacVar2 = this.zza;
                int zzc2 = zzhacVar2.zzc() + zzhacVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i2 = zzl;
        }
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzF(List list, zzhdk zzhdkVar, zzhao zzhaoVar) throws IOException {
        int zzl;
        int i2 = this.zzb;
        if ((i2 & 7) != 2) {
            throw new zzhbs("Protocol message tag had invalid wire type.");
        }
        do {
            Object zze = zzhdkVar.zze();
            zzP(zze, zzhdkVar, zzhaoVar);
            zzhdkVar.zzf(zze);
            list.add(zze);
            if (this.zza.zzA() || this.zzd != 0) {
                return;
            } else {
                zzl = this.zza.zzl();
            }
        } while (zzl == i2);
        this.zzd = zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzG(List list) throws IOException {
        int zzl;
        int i2;
        if (list instanceof zzhbf) {
            zzhbf zzhbfVar = (zzhbf) list;
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzhbfVar.zzi(this.zza.zzj());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i3 != 5) {
                throw new zzhbs("Protocol message tag had invalid wire type.");
            }
            do {
                zzhbfVar.zzi(this.zza.zzj());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i2 = this.zza.zzl();
                }
            } while (i2 == this.zzb);
        } else {
            int i4 = this.zzb & 7;
            if (i4 == 2) {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            if (i4 != 5) {
                throw new zzhbs("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i2 = zzl;
        }
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzH(List list) throws IOException {
        int zzl;
        int i2;
        if (list instanceof zzhce) {
            zzhce zzhceVar = (zzhce) list;
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                int zzm = this.zza.zzm();
                zzT(zzm);
                int zzc = zzm + this.zza.zzc();
                do {
                    zzhceVar.zzg(this.zza.zzs());
                } while (this.zza.zzc() < zzc);
                return;
            }
            do {
                zzhceVar.zzg(this.zza.zzs());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i2 = this.zza.zzl();
                }
            } while (i2 == this.zzb);
        } else {
            int i4 = this.zzb & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                int zzm2 = this.zza.zzm();
                zzT(zzm2);
                int zzc2 = zzm2 + this.zza.zzc();
                do {
                    list.add(Long.valueOf(this.zza.zzs()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzs()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i2 = zzl;
        }
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzI(List list) throws IOException {
        int zzl;
        int i2;
        if (list instanceof zzhbf) {
            zzhbf zzhbfVar = (zzhbf) list;
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                zzhac zzhacVar = this.zza;
                int zzc = zzhacVar.zzc() + zzhacVar.zzm();
                do {
                    zzhbfVar.zzi(this.zza.zzk());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzhbfVar.zzi(this.zza.zzk());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i2 = this.zza.zzl();
                }
            } while (i2 == this.zzb);
        } else {
            int i4 = this.zzb & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                zzhac zzhacVar2 = this.zza;
                int zzc2 = zzhacVar2.zzc() + zzhacVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i2 = zzl;
        }
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzJ(List list) throws IOException {
        int zzl;
        int i2;
        if (list instanceof zzhce) {
            zzhce zzhceVar = (zzhce) list;
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                zzhac zzhacVar = this.zza;
                int zzc = zzhacVar.zzc() + zzhacVar.zzm();
                do {
                    zzhceVar.zzg(this.zza.zzt());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzhceVar.zzg(this.zza.zzt());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i2 = this.zza.zzl();
                }
            } while (i2 == this.zzb);
        } else {
            int i4 = this.zzb & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                zzhac zzhacVar2 = this.zza;
                int zzc2 = zzhacVar2.zzc() + zzhacVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i2 = zzl;
        }
        this.zzd = i2;
    }

    public final void zzK(List list, boolean z2) throws IOException {
        int zzl;
        int i2;
        if ((this.zzb & 7) != 2) {
            throw new zzhbs("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzhcb) && !z2) {
            zzhcb zzhcbVar = (zzhcb) list;
            do {
                zzp();
                zzhcbVar.zzb();
                if (this.zza.zzA()) {
                    return;
                } else {
                    i2 = this.zza.zzl();
                }
            } while (i2 == this.zzb);
        } else {
            do {
                list.add(z2 ? zzs() : zzr());
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i2 = zzl;
        }
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzL(List list) throws IOException {
        int zzl;
        int i2;
        if (list instanceof zzhbf) {
            zzhbf zzhbfVar = (zzhbf) list;
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                zzhac zzhacVar = this.zza;
                int zzc = zzhacVar.zzc() + zzhacVar.zzm();
                do {
                    zzhbfVar.zzi(this.zza.zzm());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzhbfVar.zzi(this.zza.zzm());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i2 = this.zza.zzl();
                }
            } while (i2 == this.zzb);
        } else {
            int i4 = this.zzb & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                zzhac zzhacVar2 = this.zza;
                int zzc2 = zzhacVar2.zzc() + zzhacVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzm()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzm()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i2 = zzl;
        }
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzM(List list) throws IOException {
        int zzl;
        int i2;
        if (list instanceof zzhce) {
            zzhce zzhceVar = (zzhce) list;
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                zzhac zzhacVar = this.zza;
                int zzc = zzhacVar.zzc() + zzhacVar.zzm();
                do {
                    zzhceVar.zzg(this.zza.zzu());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzhceVar.zzg(this.zza.zzu());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i2 = this.zza.zzl();
                }
            } while (i2 == this.zzb);
        } else {
            int i4 = this.zzb & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                zzhac zzhacVar2 = this.zza;
                int zzc2 = zzhacVar2.zzc() + zzhacVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i2 = zzl;
        }
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final boolean zzN() throws IOException {
        zzR(0);
        return this.zza.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final double zza() throws IOException {
        zzR(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final float zzb() throws IOException {
        zzR(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final int zzc() throws IOException {
        int i2 = this.zzd;
        if (i2 != 0) {
            this.zzb = i2;
            this.zzd = 0;
        } else {
            i2 = this.zza.zzl();
            this.zzb = i2;
        }
        return (i2 == 0 || i2 == this.zzc) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : i2 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final int zze() throws IOException {
        zzR(0);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final int zzf() throws IOException {
        zzR(5);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final int zzg() throws IOException {
        zzR(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final int zzh() throws IOException {
        zzR(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final int zzi() throws IOException {
        zzR(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final int zzj() throws IOException {
        zzR(0);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final long zzk() throws IOException {
        zzR(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final long zzl() throws IOException {
        zzR(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final long zzm() throws IOException {
        zzR(1);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final long zzn() throws IOException {
        zzR(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final long zzo() throws IOException {
        zzR(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final zzgzs zzp() throws IOException {
        zzR(2);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final String zzr() throws IOException {
        zzR(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final String zzs() throws IOException {
        zzR(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzt(Object obj, zzhdk zzhdkVar, zzhao zzhaoVar) throws IOException {
        zzR(3);
        zzO(obj, zzhdkVar, zzhaoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzu(Object obj, zzhdk zzhdkVar, zzhao zzhaoVar) throws IOException {
        zzR(2);
        zzP(obj, zzhdkVar, zzhaoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzv(List list) throws IOException {
        int zzl;
        int i2;
        if (list instanceof zzgzi) {
            zzgzi zzgziVar = (zzgzi) list;
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                zzhac zzhacVar = this.zza;
                int zzc = zzhacVar.zzc() + zzhacVar.zzm();
                do {
                    zzgziVar.zzg(this.zza.zzB());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzgziVar.zzg(this.zza.zzB());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i2 = this.zza.zzl();
                }
            } while (i2 == this.zzb);
        } else {
            int i4 = this.zzb & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                zzhac zzhacVar2 = this.zza;
                int zzc2 = zzhacVar2.zzc() + zzhacVar2.zzm();
                do {
                    list.add(Boolean.valueOf(this.zza.zzB()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzB()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i2 = zzl;
        }
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzw(List list) throws IOException {
        int zzl;
        if ((this.zzb & 7) != 2) {
            throw new zzhbs("Protocol message tag had invalid wire type.");
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

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzx(List list) throws IOException {
        int zzl;
        int i2;
        if (list instanceof zzhal) {
            zzhal zzhalVar = (zzhal) list;
            int i3 = this.zzb & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                int zzm = this.zza.zzm();
                zzT(zzm);
                int zzc = zzm + this.zza.zzc();
                do {
                    zzhalVar.zzh(this.zza.zza());
                } while (this.zza.zzc() < zzc);
                return;
            }
            do {
                zzhalVar.zzh(this.zza.zza());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i2 = this.zza.zzl();
                }
            } while (i2 == this.zzb);
        } else {
            int i4 = this.zzb & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                int zzm2 = this.zza.zzm();
                zzT(zzm2);
                int zzc2 = zzm2 + this.zza.zzc();
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i2 = zzl;
        }
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzy(List list) throws IOException {
        int zzl;
        int i2;
        if (list instanceof zzhbf) {
            zzhbf zzhbfVar = (zzhbf) list;
            int i3 = this.zzb & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                zzhac zzhacVar = this.zza;
                int zzc = zzhacVar.zzc() + zzhacVar.zzm();
                do {
                    zzhbfVar.zzi(this.zza.zze());
                } while (this.zza.zzc() < zzc);
                zzQ(zzc);
                return;
            }
            do {
                zzhbfVar.zzi(this.zza.zze());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i2 = this.zza.zzl();
                }
            } while (i2 == this.zzb);
        } else {
            int i4 = this.zzb & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zzhbs("Protocol message tag had invalid wire type.");
                }
                zzhac zzhacVar2 = this.zza;
                int zzc2 = zzhacVar2.zzc() + zzhacVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < zzc2);
                zzQ(zzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i2 = zzl;
        }
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdc
    public final void zzz(List list) throws IOException {
        int zzl;
        int i2;
        if (list instanceof zzhbf) {
            zzhbf zzhbfVar = (zzhbf) list;
            int i3 = this.zzb & 7;
            if (i3 == 2) {
                int zzm = this.zza.zzm();
                zzS(zzm);
                int zzc = this.zza.zzc() + zzm;
                do {
                    zzhbfVar.zzi(this.zza.zzf());
                } while (this.zza.zzc() < zzc);
                return;
            }
            if (i3 != 5) {
                throw new zzhbs("Protocol message tag had invalid wire type.");
            }
            do {
                zzhbfVar.zzi(this.zza.zzf());
                if (this.zza.zzA()) {
                    return;
                } else {
                    i2 = this.zza.zzl();
                }
            } while (i2 == this.zzb);
        } else {
            int i4 = this.zzb & 7;
            if (i4 == 2) {
                int zzm2 = this.zza.zzm();
                zzS(zzm2);
                int zzc2 = this.zza.zzc() + zzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            if (i4 != 5) {
                throw new zzhbs("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    zzl = this.zza.zzl();
                }
            } while (zzl == this.zzb);
            i2 = zzl;
        }
        this.zzd = i2;
    }
}

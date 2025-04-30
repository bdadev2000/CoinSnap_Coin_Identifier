package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class zzakn {
    private static final zzfyt zza = zzfyt.zzc(zzfxr.zzc(':'));
    private static final zzfyt zzb = zzfyt.zzc(zzfxr.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final int zza(zzadv zzadvVar, zzaeq zzaeqVar, List list) throws IOException {
        int i9;
        char c9;
        char c10;
        int i10 = this.zzd;
        if (i10 != 0) {
            int i11 = 2;
            if (i10 != 1) {
                short s5 = 2817;
                short s9 = 2816;
                short s10 = 2192;
                if (i10 != 2) {
                    long zzf = zzadvVar.zzf();
                    int zzd = (int) ((zzadvVar.zzd() - zzadvVar.zzf()) - this.zze);
                    zzfu zzfuVar = new zzfu(zzd);
                    zzadvVar.zzi(zzfuVar.zzM(), 0, zzd);
                    for (int i12 = 0; i12 < this.zzc.size(); i12++) {
                        zzakm zzakmVar = (zzakm) this.zzc.get(i12);
                        zzfuVar.zzK((int) (zzakmVar.zza - zzf));
                        zzfuVar.zzL(4);
                        int zzi = zzfuVar.zzi();
                        Charset charset = zzfxs.zzc;
                        String zzA = zzfuVar.zzA(zzi, charset);
                        switch (zzA.hashCode()) {
                            case -1711564334:
                                if (zzA.equals("SlowMotion_Data")) {
                                    c9 = 0;
                                    break;
                                }
                                break;
                            case -1332107749:
                                if (zzA.equals("Super_SlowMotion_Edit_Data")) {
                                    c9 = 3;
                                    break;
                                }
                                break;
                            case -1251387154:
                                if (zzA.equals("Super_SlowMotion_Data")) {
                                    c9 = 1;
                                    break;
                                }
                                break;
                            case -830665521:
                                if (zzA.equals("Super_SlowMotion_Deflickering_On")) {
                                    c9 = 4;
                                    break;
                                }
                                break;
                            case 1760745220:
                                if (zzA.equals("Super_SlowMotion_BGM")) {
                                    c9 = 2;
                                    break;
                                }
                                break;
                        }
                        c9 = 65535;
                        if (c9 != 0) {
                            if (c9 != 1) {
                                if (c9 != 2) {
                                    if (c9 != 3) {
                                        if (c9 == 4) {
                                            c10 = 2820;
                                        } else {
                                            throw zzch.zza("Invalid SEF name", null);
                                        }
                                    } else {
                                        c10 = 2819;
                                    }
                                } else {
                                    c10 = 2817;
                                }
                            } else {
                                c10 = 2816;
                            }
                        } else {
                            c10 = 2192;
                        }
                        int i13 = zzakmVar.zzb - (zzi + 8);
                        if (c10 != 2192) {
                            if (c10 != 2816 && c10 != 2817 && c10 != 2819 && c10 != 2820) {
                                throw new IllegalStateException();
                            }
                        } else {
                            ArrayList arrayList = new ArrayList();
                            List zzf2 = zzb.zzf(zzfuVar.zzA(i13, charset));
                            for (int i14 = 0; i14 < zzf2.size(); i14++) {
                                List zzf3 = zza.zzf((CharSequence) zzf2.get(i14));
                                if (zzf3.size() == 3) {
                                    try {
                                        arrayList.add(new zzaii(Long.parseLong((String) zzf3.get(0)), Long.parseLong((String) zzf3.get(1)), 1 << (Integer.parseInt((String) zzf3.get(2)) - 1)));
                                    } catch (NumberFormatException e4) {
                                        throw zzch.zza(null, e4);
                                    }
                                } else {
                                    throw zzch.zza(null, null);
                                }
                            }
                            list.add(new zzaij(arrayList));
                        }
                    }
                    zzaeqVar.zza = 0L;
                    return 1;
                }
                long zzd2 = zzadvVar.zzd();
                int i15 = this.zze - 20;
                zzfu zzfuVar2 = new zzfu(i15);
                zzadvVar.zzi(zzfuVar2.zzM(), 0, i15);
                int i16 = 0;
                while (i16 < i15 / 12) {
                    zzfuVar2.zzL(i11);
                    short zzC = zzfuVar2.zzC();
                    if (zzC != s10 && zzC != s9 && zzC != s5 && zzC != 2819 && zzC != 2820) {
                        zzfuVar2.zzL(8);
                        i9 = i15;
                    } else {
                        i9 = i15;
                        this.zzc.add(new zzakm(zzC, (zzd2 - this.zze) - zzfuVar2.zzi(), zzfuVar2.zzi()));
                    }
                    i16++;
                    i15 = i9;
                    i11 = 2;
                    s5 = 2817;
                    s9 = 2816;
                    s10 = 2192;
                }
                if (this.zzc.isEmpty()) {
                    zzaeqVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzaeqVar.zza = ((zzakm) this.zzc.get(0)).zza;
                }
            } else {
                zzfu zzfuVar3 = new zzfu(8);
                zzadvVar.zzi(zzfuVar3.zzM(), 0, 8);
                this.zze = zzfuVar3.zzi() + 8;
                if (zzfuVar3.zzg() != 1397048916) {
                    zzaeqVar.zza = 0L;
                } else {
                    zzaeqVar.zza = zzadvVar.zzf() - (this.zze - 12);
                    this.zzd = 2;
                }
            }
            return 1;
        }
        long zzd3 = zzadvVar.zzd();
        zzaeqVar.zza = (zzd3 == -1 || zzd3 < 8) ? 0L : zzd3 - 8;
        this.zzd = 1;
        return 1;
    }

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }
}

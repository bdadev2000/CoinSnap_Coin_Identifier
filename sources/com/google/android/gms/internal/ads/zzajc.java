package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
final class zzajc {
    private static final zzfxd zza = zzfxd.zzb(zzfwf.zzc(AbstractJsonLexerKt.COLON));
    private static final zzfxd zzb = zzfxd.zzb(zzfwf.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final int zza(zzacs zzacsVar, zzadn zzadnVar, List list) throws IOException {
        int i10;
        char c10;
        char c11;
        int i11 = this.zzd;
        if (i11 != 0) {
            int i12 = 2;
            if (i11 != 1) {
                char c12 = 2819;
                short s5 = 2817;
                short s10 = 2816;
                short s11 = 2192;
                if (i11 != 2) {
                    long zzf = zzacsVar.zzf();
                    int zzd = (int) ((zzacsVar.zzd() - zzacsVar.zzf()) - this.zze);
                    zzed zzedVar = new zzed(zzd);
                    zzacsVar.zzi(zzedVar.zzN(), 0, zzd);
                    int i13 = 0;
                    while (i13 < this.zzc.size()) {
                        zzajb zzajbVar = (zzajb) this.zzc.get(i13);
                        zzedVar.zzL((int) (zzajbVar.zza - zzf));
                        zzedVar.zzM(4);
                        int zzi = zzedVar.zzi();
                        String zzB = zzedVar.zzB(zzi, StandardCharsets.UTF_8);
                        switch (zzB.hashCode()) {
                            case -1711564334:
                                if (zzB.equals("SlowMotion_Data")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case -1332107749:
                                if (zzB.equals("Super_SlowMotion_Edit_Data")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                            case -1251387154:
                                if (zzB.equals("Super_SlowMotion_Data")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case -830665521:
                                if (zzB.equals("Super_SlowMotion_Deflickering_On")) {
                                    c10 = 4;
                                    break;
                                }
                                break;
                            case 1760745220:
                                if (zzB.equals("Super_SlowMotion_BGM")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                        }
                        c10 = 65535;
                        if (c10 != 0) {
                            if (c10 != 1) {
                                if (c10 != 2) {
                                    if (c10 != 3) {
                                        if (c10 == 4) {
                                            c11 = 2820;
                                        } else {
                                            throw zzbh.zza("Invalid SEF name", null);
                                        }
                                    } else {
                                        c11 = c12;
                                    }
                                } else {
                                    c11 = 2817;
                                }
                            } else {
                                c11 = 2816;
                            }
                        } else {
                            c11 = 2192;
                        }
                        int i14 = zzajbVar.zzb - (zzi + 8);
                        if (c11 != 2192) {
                            if (c11 != 2816 && c11 != 2817 && c11 != c12 && c11 != 2820) {
                                throw new IllegalStateException();
                            }
                        } else {
                            ArrayList arrayList = new ArrayList();
                            List zze = zzb.zze(zzedVar.zzB(i14, StandardCharsets.UTF_8));
                            for (int i15 = 0; i15 < zze.size(); i15++) {
                                List zze2 = zza.zze((CharSequence) zze.get(i15));
                                if (zze2.size() == 3) {
                                    try {
                                        arrayList.add(new zzahc(Long.parseLong((String) zze2.get(0)), Long.parseLong((String) zze2.get(1)), 1 << (Integer.parseInt((String) zze2.get(2)) - 1)));
                                    } catch (NumberFormatException e2) {
                                        throw zzbh.zza(null, e2);
                                    }
                                } else {
                                    throw zzbh.zza(null, null);
                                }
                            }
                            list.add(new zzahd(arrayList));
                        }
                        i13++;
                        c12 = 2819;
                    }
                    zzadnVar.zza = 0L;
                    return 1;
                }
                long zzd2 = zzacsVar.zzd();
                int i16 = this.zze - 20;
                zzed zzedVar2 = new zzed(i16);
                zzacsVar.zzi(zzedVar2.zzN(), 0, i16);
                int i17 = 0;
                while (i17 < i16 / 12) {
                    zzedVar2.zzM(i12);
                    short zzD = zzedVar2.zzD();
                    if (zzD != s11 && zzD != s10 && zzD != s5 && zzD != 2819 && zzD != 2820) {
                        zzedVar2.zzM(8);
                        i10 = i16;
                    } else {
                        i10 = i16;
                        this.zzc.add(new zzajb(zzD, (zzd2 - this.zze) - zzedVar2.zzi(), zzedVar2.zzi()));
                    }
                    i17++;
                    i16 = i10;
                    i12 = 2;
                    s5 = 2817;
                    s10 = 2816;
                    s11 = 2192;
                }
                if (this.zzc.isEmpty()) {
                    zzadnVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzadnVar.zza = ((zzajb) this.zzc.get(0)).zza;
                }
            } else {
                zzed zzedVar3 = new zzed(8);
                zzacsVar.zzi(zzedVar3.zzN(), 0, 8);
                this.zze = zzedVar3.zzi() + 8;
                if (zzedVar3.zzg() != 1397048916) {
                    zzadnVar.zza = 0L;
                } else {
                    zzadnVar.zza = zzacsVar.zzf() - (this.zze - 12);
                    this.zzd = 2;
                }
            }
            return 1;
        }
        long zzd3 = zzacsVar.zzd();
        zzadnVar.zza = (zzd3 != -1 && zzd3 >= 8) ? zzd3 - 8 : 0L;
        this.zzd = 1;
        return 1;
    }

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }
}

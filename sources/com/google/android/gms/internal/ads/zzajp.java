package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class zzajp {
    private static final zzfym zza = zzfym.zzb(zzfxn.zzc(':'));
    private static final zzfym zzb = zzfym.zzb(zzfxn.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final int zza(zzadc zzadcVar, zzadx zzadxVar, List list) throws IOException {
        int i2;
        char c2;
        char c3;
        int i3 = this.zzd;
        if (i3 == 0) {
            long zzd = zzadcVar.zzd();
            zzadxVar.zza = (zzd == -1 || zzd < 8) ? 0L : zzd - 8;
            this.zzd = 1;
            return 1;
        }
        int i4 = 2;
        if (i3 != 1) {
            short s2 = 2817;
            short s3 = 2816;
            short s4 = 2192;
            if (i3 != 2) {
                long zzf = zzadcVar.zzf();
                int zzd2 = (int) ((zzadcVar.zzd() - zzadcVar.zzf()) - this.zze);
                zzek zzekVar = new zzek(zzd2);
                zzadcVar.zzi(zzekVar.zzN(), 0, zzd2);
                for (int i5 = 0; i5 < this.zzc.size(); i5++) {
                    zzajo zzajoVar = (zzajo) this.zzc.get(i5);
                    zzekVar.zzL((int) (zzajoVar.zza - zzf));
                    zzekVar.zzM(4);
                    int zzi = zzekVar.zzi();
                    Charset charset = StandardCharsets.UTF_8;
                    String zzB = zzekVar.zzB(zzi, charset);
                    switch (zzB.hashCode()) {
                        case -1711564334:
                            if (zzB.equals("SlowMotion_Data")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -1332107749:
                            if (zzB.equals("Super_SlowMotion_Edit_Data")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case -1251387154:
                            if (zzB.equals("Super_SlowMotion_Data")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case -830665521:
                            if (zzB.equals("Super_SlowMotion_Deflickering_On")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 1760745220:
                            if (zzB.equals("Super_SlowMotion_BGM")) {
                                c2 = 2;
                                break;
                            }
                            break;
                    }
                    c2 = 65535;
                    if (c2 == 0) {
                        c3 = 2192;
                    } else if (c2 == 1) {
                        c3 = 2816;
                    } else if (c2 == 2) {
                        c3 = 2817;
                    } else if (c2 == 3) {
                        c3 = 2819;
                    } else {
                        if (c2 != 4) {
                            throw zzbo.zza("Invalid SEF name", null);
                        }
                        c3 = 2820;
                    }
                    int i6 = zzajoVar.zzb - (zzi + 8);
                    if (c3 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List zze = zzb.zze(zzekVar.zzB(i6, charset));
                        for (int i7 = 0; i7 < zze.size(); i7++) {
                            List zze2 = zza.zze((CharSequence) zze.get(i7));
                            if (zze2.size() != 3) {
                                throw zzbo.zza(null, null);
                            }
                            try {
                                arrayList.add(new zzahm(Long.parseLong((String) zze2.get(0)), Long.parseLong((String) zze2.get(1)), 1 << (Integer.parseInt((String) zze2.get(2)) - 1)));
                            } catch (NumberFormatException e) {
                                throw zzbo.zza(null, e);
                            }
                        }
                        list.add(new zzahn(arrayList));
                    } else if (c3 != 2816 && c3 != 2817 && c3 != 2819 && c3 != 2820) {
                        throw new IllegalStateException();
                    }
                }
                zzadxVar.zza = 0L;
                return 1;
            }
            long zzd3 = zzadcVar.zzd();
            int i8 = this.zze - 20;
            zzek zzekVar2 = new zzek(i8);
            zzadcVar.zzi(zzekVar2.zzN(), 0, i8);
            int i9 = 0;
            while (i9 < i8 / 12) {
                zzekVar2.zzM(i4);
                short zzD = zzekVar2.zzD();
                if (zzD == s4 || zzD == s3 || zzD == s2 || zzD == 2819 || zzD == 2820) {
                    i2 = i8;
                    this.zzc.add(new zzajo(zzD, (zzd3 - this.zze) - zzekVar2.zzi(), zzekVar2.zzi()));
                } else {
                    zzekVar2.zzM(8);
                    i2 = i8;
                }
                i9++;
                i8 = i2;
                i4 = 2;
                s2 = 2817;
                s3 = 2816;
                s4 = 2192;
            }
            if (this.zzc.isEmpty()) {
                zzadxVar.zza = 0L;
            } else {
                this.zzd = 3;
                zzadxVar.zza = ((zzajo) this.zzc.get(0)).zza;
            }
        } else {
            zzek zzekVar3 = new zzek(8);
            zzadcVar.zzi(zzekVar3.zzN(), 0, 8);
            this.zze = zzekVar3.zzi() + 8;
            if (zzekVar3.zzg() != 1397048916) {
                zzadxVar.zza = 0L;
            } else {
                zzadxVar.zza = zzadcVar.zzf() - (this.zze - 12);
                this.zzd = 2;
            }
        }
        return 1;
    }

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }
}

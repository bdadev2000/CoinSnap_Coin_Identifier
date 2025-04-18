package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public final class zzamw implements zzaom {
    private final List zza;

    public zzamw(int i2, List list) {
        this.zza = list;
    }

    private final zzaod zzc(zzaol zzaolVar) {
        return new zzaod(zze(zzaolVar));
    }

    private final zzaoq zzd(zzaol zzaolVar) {
        return new zzaoq(zze(zzaolVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zze(zzaol zzaolVar) {
        String str;
        int i2;
        zzek zzekVar = new zzek(zzaolVar.zze);
        ArrayList arrayList = this.zza;
        while (zzekVar.zzb() > 0) {
            int zzm = zzekVar.zzm();
            int zzd = zzekVar.zzd() + zzekVar.zzm();
            if (zzm == 134) {
                arrayList = new ArrayList();
                int zzm2 = zzekVar.zzm() & 31;
                for (int i3 = 0; i3 < zzm2; i3++) {
                    String zzB = zzekVar.zzB(3, StandardCharsets.UTF_8);
                    int zzm3 = zzekVar.zzm();
                    boolean z2 = (zzm3 & 128) != 0;
                    if (z2) {
                        i2 = zzm3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    byte zzm4 = (byte) zzekVar.zzm();
                    zzekVar.zzM(1);
                    List singletonList = z2 ? Collections.singletonList((zzm4 & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    zzad zzadVar = new zzad();
                    zzadVar.zzZ(str);
                    zzadVar.zzP(zzB);
                    zzadVar.zzx(i2);
                    zzadVar.zzM(singletonList);
                    arrayList.add(zzadVar.zzaf());
                }
            }
            zzekVar.zzL(zzd);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzaom
    public final SparseArray zza() {
        return new SparseArray();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0036. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzaom
    @Nullable
    public final zzaoo zzb(int i2, zzaol zzaolVar) {
        if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                return new zzant(new zzanl(zzaolVar.zzb, zzaolVar.zza()));
            }
            if (i2 == 21) {
                return new zzant(new zzanj());
            }
            if (i2 == 27) {
                return new zzant(new zzang(zzc(zzaolVar), false, false));
            }
            if (i2 == 36) {
                return new zzant(new zzani(zzc(zzaolVar)));
            }
            if (i2 == 45) {
                return new zzant(new zzanm());
            }
            if (i2 == 89) {
                return new zzant(new zzamy(zzaolVar.zzd));
            }
            if (i2 == 172) {
                return new zzant(new zzamt(zzaolVar.zzb, zzaolVar.zza()));
            }
            if (i2 == 257) {
                return new zzaob(new zzans("application/vnd.dvb.ait"));
            }
            if (i2 != 128) {
                if (i2 != 129) {
                    if (i2 != 138) {
                        if (i2 == 139) {
                            return new zzant(new zzamx(zzaolVar.zzb, zzaolVar.zza(), 5408));
                        }
                        switch (i2) {
                            case 15:
                                return new zzant(new zzamv(false, zzaolVar.zzb, zzaolVar.zza()));
                            case 16:
                                return new zzant(new zzane(zzd(zzaolVar)));
                            case 17:
                                return new zzant(new zzank(zzaolVar.zzb, zzaolVar.zza()));
                            default:
                                switch (i2) {
                                    case Opcodes.I2F /* 134 */:
                                        return new zzaob(new zzans("application/x-scte35"));
                                    case Opcodes.I2D /* 135 */:
                                        break;
                                    case Opcodes.L2I /* 136 */:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new zzant(new zzamx(zzaolVar.zzb, zzaolVar.zza(), 4096));
                }
                return new zzant(new zzamr(zzaolVar.zzb, zzaolVar.zza()));
            }
        }
        return new zzant(new zzanb(zzd(zzaolVar)));
    }

    public zzamw() {
        this(0);
    }

    public zzamw(int i2) {
        this.zza = zzgax.zzn();
    }
}

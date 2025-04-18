package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzamj implements zzanz {
    private final List zza;

    public zzamj(int i10, List list) {
        this.zza = list;
    }

    private final zzanq zzc(zzany zzanyVar) {
        return new zzanq(zze(zzanyVar));
    }

    private final zzaod zzd(zzany zzanyVar) {
        return new zzaod(zze(zzanyVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zze(zzany zzanyVar) {
        boolean z10;
        String str;
        int i10;
        List list;
        byte[] bArr;
        zzed zzedVar = new zzed(zzanyVar.zze);
        ArrayList arrayList = this.zza;
        while (zzedVar.zzb() > 0) {
            int zzm = zzedVar.zzm();
            int zzd = zzedVar.zzd() + zzedVar.zzm();
            if (zzm == 134) {
                arrayList = new ArrayList();
                int zzm2 = zzedVar.zzm() & 31;
                for (int i11 = 0; i11 < zzm2; i11++) {
                    String zzB = zzedVar.zzB(3, StandardCharsets.UTF_8);
                    int zzm3 = zzedVar.zzm();
                    if ((zzm3 & 128) != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i10 = zzm3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i10 = 1;
                    }
                    byte zzm4 = (byte) zzedVar.zzm();
                    zzedVar.zzM(1);
                    if (z10) {
                        int i12 = zzm4 & 64;
                        int i13 = zzdd.zza;
                        if (i12 != 0) {
                            bArr = new byte[]{1};
                        } else {
                            bArr = new byte[]{0};
                        }
                        list = Collections.singletonList(bArr);
                    } else {
                        list = null;
                    }
                    zzab zzabVar = new zzab();
                    zzabVar.zzZ(str);
                    zzabVar.zzP(zzB);
                    zzabVar.zzx(i10);
                    zzabVar.zzM(list);
                    arrayList.add(zzabVar.zzaf());
                }
            }
            zzedVar.zzL(zzd);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    public final SparseArray zza() {
        return new SparseArray();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0036. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzanz
    @Nullable
    public final zzaob zzb(int i10, zzany zzanyVar) {
        if (i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 27) {
                        if (i10 != 36) {
                            if (i10 != 45) {
                                if (i10 != 89) {
                                    if (i10 != 172) {
                                        if (i10 != 257) {
                                            if (i10 != 128) {
                                                if (i10 != 129) {
                                                    if (i10 != 138) {
                                                        if (i10 != 139) {
                                                            switch (i10) {
                                                                case 15:
                                                                    return new zzang(new zzami(false, zzanyVar.zzb, zzanyVar.zza()));
                                                                case 16:
                                                                    return new zzang(new zzamr(zzd(zzanyVar)));
                                                                case 17:
                                                                    return new zzang(new zzamx(zzanyVar.zzb, zzanyVar.zza()));
                                                                default:
                                                                    switch (i10) {
                                                                        case 134:
                                                                            return new zzano(new zzanf(MimeTypes.APPLICATION_SCTE35));
                                                                        case 135:
                                                                            break;
                                                                        case 136:
                                                                            break;
                                                                        default:
                                                                            return null;
                                                                    }
                                                            }
                                                        } else {
                                                            return new zzang(new zzamk(zzanyVar.zzb, zzanyVar.zza(), 5408));
                                                        }
                                                    }
                                                    return new zzang(new zzamk(zzanyVar.zzb, zzanyVar.zza(), 4096));
                                                }
                                                return new zzang(new zzame(zzanyVar.zzb, zzanyVar.zza()));
                                            }
                                        } else {
                                            return new zzano(new zzanf("application/vnd.dvb.ait"));
                                        }
                                    } else {
                                        return new zzang(new zzamg(zzanyVar.zzb, zzanyVar.zza()));
                                    }
                                } else {
                                    return new zzang(new zzaml(zzanyVar.zzd));
                                }
                            } else {
                                return new zzang(new zzamz());
                            }
                        } else {
                            return new zzang(new zzamv(zzc(zzanyVar)));
                        }
                    } else {
                        return new zzang(new zzamt(zzc(zzanyVar), false, false));
                    }
                } else {
                    return new zzang(new zzamw());
                }
            } else {
                return new zzang(new zzamy(zzanyVar.zzb, zzanyVar.zza()));
            }
        }
        return new zzang(new zzamo(zzd(zzanyVar)));
    }

    public zzamj() {
        this(0);
    }

    public zzamj(int i10) {
        this.zza = zzfzo.zzn();
    }
}

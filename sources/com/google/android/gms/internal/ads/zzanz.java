package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzanz implements zzapn {
    private final List zza;

    public zzanz(int i9, List list) {
        this.zza = list;
    }

    private final zzapd zzb(zzapm zzapmVar) {
        return new zzapd(zzd(zzapmVar));
    }

    private final zzapr zzc(zzapm zzapmVar) {
        return new zzapr(zzd(zzapmVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zzd(zzapm zzapmVar) {
        boolean z8;
        String str;
        int i9;
        List list;
        byte[] bArr;
        zzfu zzfuVar = new zzfu(zzapmVar.zze);
        ArrayList arrayList = this.zza;
        while (zzfuVar.zzb() > 0) {
            int zzm = zzfuVar.zzm();
            int zzd = zzfuVar.zzd() + zzfuVar.zzm();
            if (zzm == 134) {
                arrayList = new ArrayList();
                int zzm2 = zzfuVar.zzm() & 31;
                for (int i10 = 0; i10 < zzm2; i10++) {
                    String zzA = zzfuVar.zzA(3, zzfxs.zzc);
                    int zzm3 = zzfuVar.zzm();
                    if ((zzm3 & 128) != 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        i9 = zzm3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i9 = 1;
                    }
                    byte zzm4 = (byte) zzfuVar.zzm();
                    zzfuVar.zzL(1);
                    if (z8) {
                        if ((zzm4 & 64) != 0) {
                            bArr = new byte[]{1};
                        } else {
                            bArr = new byte[]{0};
                        }
                        list = Collections.singletonList(bArr);
                    } else {
                        list = null;
                    }
                    zzal zzalVar = new zzal();
                    zzalVar.zzX(str);
                    zzalVar.zzO(zzA);
                    zzalVar.zzw(i9);
                    zzalVar.zzL(list);
                    arrayList.add(zzalVar.zzad());
                }
            }
            zzfuVar.zzK(zzd);
            arrayList = arrayList;
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0032. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzapn
    @Nullable
    public final zzapp zza(int i9, zzapm zzapmVar) {
        if (i9 != 2) {
            if (i9 != 3 && i9 != 4) {
                if (i9 != 21) {
                    if (i9 != 27) {
                        if (i9 != 36) {
                            if (i9 != 89) {
                                if (i9 != 172) {
                                    if (i9 != 257) {
                                        if (i9 != 128) {
                                            if (i9 != 129) {
                                                if (i9 != 138) {
                                                    if (i9 != 139) {
                                                        switch (i9) {
                                                            case 15:
                                                                return new zzaot(new zzany(false, zzapmVar.zzb, zzapmVar.zza()));
                                                            case 16:
                                                                return new zzaot(new zzaoh(zzc(zzapmVar)));
                                                            case 17:
                                                                return new zzaot(new zzaop(zzapmVar.zzb, zzapmVar.zza()));
                                                            default:
                                                                switch (i9) {
                                                                    case 134:
                                                                        return new zzapc(new zzaos(MimeTypes.APPLICATION_SCTE35));
                                                                    case 135:
                                                                        break;
                                                                    case 136:
                                                                        break;
                                                                    default:
                                                                        return null;
                                                                }
                                                        }
                                                    } else {
                                                        return new zzaot(new zzaoa(zzapmVar.zzb, zzapmVar.zza(), 5408));
                                                    }
                                                }
                                                return new zzaot(new zzaoa(zzapmVar.zzb, zzapmVar.zza(), 4096));
                                            }
                                            return new zzaot(new zzans(zzapmVar.zzb, zzapmVar.zza()));
                                        }
                                    } else {
                                        return new zzapc(new zzaos("application/vnd.dvb.ait"));
                                    }
                                } else {
                                    return new zzaot(new zzanv(zzapmVar.zzb, zzapmVar.zza()));
                                }
                            } else {
                                return new zzaot(new zzaob(zzapmVar.zzd));
                            }
                        } else {
                            return new zzaot(new zzaon(zzb(zzapmVar)));
                        }
                    } else {
                        return new zzaot(new zzaol(zzb(zzapmVar), false, false));
                    }
                } else {
                    return new zzaot(new zzaoo());
                }
            } else {
                return new zzaot(new zzaoq(zzapmVar.zzb, zzapmVar.zza()));
            }
        }
        return new zzaot(new zzaoe(zzc(zzapmVar)));
    }

    public zzanz() {
        this(0);
    }

    public zzanz(int i9) {
        this.zza = zzgbc.zzm();
    }
}

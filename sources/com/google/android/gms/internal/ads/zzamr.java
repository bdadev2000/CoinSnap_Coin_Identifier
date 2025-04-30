package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.presenter.q;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class zzamr {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgbh zze = zzgbh.zzp("auto", "none");
    private static final zzgbh zzf = zzgbh.zzq("dot", "sesame", "circle");
    private static final zzgbh zzg = zzgbh.zzp("filled", q.OPEN);
    private static final zzgbh zzh = zzgbh.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzamr(int i9, int i10, int i11) {
        this.zza = i9;
        this.zzb = i10;
        this.zzc = i11;
    }

    @Nullable
    public static zzamr zza(@Nullable String str) {
        boolean z8;
        int i9;
        int i10;
        if (str != null) {
            String zza = zzfxm.zza(str.trim());
            if (!zza.isEmpty()) {
                zzgbh zzm = zzgbh.zzm(TextUtils.split(zza, zzd));
                String str2 = (String) zzgbi.zza(zzgde.zzb(zzh, zzm), "outside");
                int hashCode = str2.hashCode();
                int i11 = -1;
                int i12 = 0;
                if (hashCode != -1106037339) {
                    if (hashCode == 92734940 && str2.equals("after")) {
                        z8 = false;
                    }
                    z8 = -1;
                } else {
                    if (str2.equals("outside")) {
                        z8 = true;
                    }
                    z8 = -1;
                }
                if (z8) {
                    if (!z8) {
                        i9 = 1;
                    } else {
                        i9 = -2;
                    }
                } else {
                    i9 = 2;
                }
                zzgdd zzb = zzgde.zzb(zze, zzm);
                if (!zzb.isEmpty()) {
                    String str3 = (String) zzb.iterator().next();
                    if (str3.hashCode() == 3387192 && str3.equals("none")) {
                        i11 = 0;
                    }
                } else {
                    zzgdd zzb2 = zzgde.zzb(zzg, zzm);
                    zzgdd zzb3 = zzgde.zzb(zzf, zzm);
                    if (!zzb2.isEmpty() || !zzb3.isEmpty()) {
                        String str4 = (String) zzgbi.zza(zzb2, "filled");
                        if (str4.hashCode() == 3417674 && str4.equals(q.OPEN)) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        String str5 = (String) zzgbi.zza(zzb3, "circle");
                        int hashCode2 = str5.hashCode();
                        if (hashCode2 != -905816648) {
                            if (hashCode2 == 99657 && str5.equals("dot")) {
                                i11 = 0;
                            }
                        } else if (str5.equals("sesame")) {
                            i11 = 1;
                        }
                        if (i11 != 0) {
                            if (i11 != 1) {
                                i12 = i10;
                                i11 = 1;
                            } else {
                                i11 = 3;
                            }
                        } else {
                            i11 = 2;
                        }
                        i12 = i10;
                    }
                }
                return new zzamr(i11, i12, i9);
            }
            return null;
        }
        return null;
    }
}

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.presenter.q;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
final class zzale {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzfzt zze = zzfzt.zzp(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "none");
    private static final zzfzt zzf = zzfzt.zzq("dot", "sesame", "circle");
    private static final zzfzt zzg = zzfzt.zzp("filled", q.OPEN);
    private static final zzfzt zzh = zzfzt.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzale(int i10, int i11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    @Nullable
    public static zzale zza(@Nullable String str) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        if (str != null) {
            String zza = zzfwa.zza(str.trim());
            if (!zza.isEmpty()) {
                zzfzt zzm = zzfzt.zzm(TextUtils.split(zza, zzd));
                String str2 = (String) zzfzu.zza(zzgbq.zzb(zzh, zzm), "outside");
                int hashCode = str2.hashCode();
                int i12 = -1;
                int i13 = 0;
                if (hashCode != -1106037339) {
                    if (hashCode == 92734940 && str2.equals("after")) {
                        z10 = false;
                    }
                    z10 = -1;
                } else {
                    if (str2.equals("outside")) {
                        z10 = true;
                    }
                    z10 = -1;
                }
                if (z10) {
                    if (!z10) {
                        i10 = 1;
                    } else {
                        i10 = -2;
                    }
                } else {
                    i10 = 2;
                }
                zzgbo zzb = zzgbq.zzb(zze, zzm);
                if (!zzb.isEmpty()) {
                    String str3 = (String) zzb.iterator().next();
                    if (str3.hashCode() == 3387192 && str3.equals("none")) {
                        z12 = false;
                    } else {
                        z12 = -1;
                    }
                    if (!z12) {
                        i12 = 0;
                    }
                } else {
                    zzgbo zzb2 = zzgbq.zzb(zzg, zzm);
                    zzgbo zzb3 = zzgbq.zzb(zzf, zzm);
                    if (!zzb2.isEmpty() || !zzb3.isEmpty()) {
                        String str4 = (String) zzfzu.zza(zzb2, "filled");
                        if (str4.hashCode() == 3417674 && str4.equals(q.OPEN)) {
                            z11 = false;
                        } else {
                            z11 = -1;
                        }
                        if (z11) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                        String str5 = (String) zzfzu.zza(zzb3, "circle");
                        int hashCode2 = str5.hashCode();
                        if (hashCode2 != -905816648) {
                            if (hashCode2 == 99657 && str5.equals("dot")) {
                                i12 = 0;
                            }
                        } else if (str5.equals("sesame")) {
                            i12 = 1;
                        }
                        if (i12 != 0) {
                            if (i12 != 1) {
                                i13 = i11;
                                i12 = 1;
                            } else {
                                i12 = 3;
                            }
                        } else {
                            i12 = 2;
                        }
                        i13 = i11;
                    }
                }
                return new zzale(i12, i13, i10);
            }
            return null;
        }
        return null;
    }
}

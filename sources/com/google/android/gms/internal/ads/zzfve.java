package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.o;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import z.AbstractC2965e;

/* loaded from: classes2.dex */
class zzfve {
    static final String zza = new UUID(0, 0).toString();
    final zzfvf zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    public zzfve(Context context, String str, String str2, String str3) {
        this.zzb = zzfvf.zzb(context);
        this.zzc = str;
        this.zzd = str.concat("_3p");
        this.zze = str2;
        this.zzf = str2.concat("_3p");
        this.zzg = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        String str4;
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(o.k(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder c9 = AbstractC2965e.c(this.zzg, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        String str5 = "not null";
        if (str2 != null) {
            str4 = "not null";
        } else {
            str4 = "null";
        }
        c9.append(str4);
        c9.append(", hashKey is ");
        if (str3 == null) {
            str5 = "null";
        }
        c9.append(str5);
        throw new IllegalArgumentException(c9.toString());
    }

    public final long zza(boolean z8) {
        String str;
        if (z8) {
            str = this.zzf;
        } else {
            str = this.zze;
        }
        return this.zzb.zza(str, -1L);
    }

    public final zzfvd zzb(@Nullable String str, @Nullable String str2, long j7, boolean z8) throws IOException {
        String str3;
        boolean z9 = true;
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String zze = zze(true);
                    String zzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (zze != null && zzc != null && !zze.equals(zzh(str, str2, zzc))) {
                        return zzc(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfvd();
        }
        if (str == null) {
            z9 = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            long zza2 = zza(z9);
            if (zza2 != -1) {
                if (currentTimeMillis < zza2) {
                    zzfvf zzfvfVar = this.zzb;
                    if (z9) {
                        str3 = this.zzf;
                    } else {
                        str3 = this.zze;
                    }
                    zzfvfVar.zzd(str3, Long.valueOf(currentTimeMillis));
                } else if (currentTimeMillis >= zza2 + j7) {
                    return zzc(str, str2);
                }
            }
            String zze2 = zze(z9);
            if (zze2 == null && !z8) {
                return zzc(str, str2);
            }
            return new zzfvd(zze2, zza(z9));
        }
        throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final zzfvd zzc(String str, String str2) throws IOException {
        if (str == null) {
            return zzd(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.zzb.zzd("paid_3p_hash_key", uuid);
        return zzd(zzh(str, str2, uuid), true);
    }

    public final zzfvd zzd(String str, boolean z8) throws IOException {
        String str2;
        String str3;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            zzfvf zzfvfVar = this.zzb;
            if (z8) {
                str2 = this.zzf;
            } else {
                str2 = this.zze;
            }
            zzfvfVar.zzd(str2, Long.valueOf(currentTimeMillis));
            zzfvf zzfvfVar2 = this.zzb;
            if (z8) {
                str3 = this.zzd;
            } else {
                str3 = this.zzc;
            }
            zzfvfVar2.zzd(str3, str);
            return new zzfvd(str, currentTimeMillis);
        }
        throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final String zze(boolean z8) {
        String str;
        if (z8) {
            str = this.zzd;
        } else {
            str = this.zzc;
        }
        return this.zzb.zzc(str, null);
    }

    public final void zzf(boolean z8) throws IOException {
        String str;
        String str2;
        if (z8) {
            str = this.zzf;
        } else {
            str = this.zze;
        }
        this.zzb.zze(str);
        zzfvf zzfvfVar = this.zzb;
        if (z8) {
            str2 = this.zzd;
        } else {
            str2 = this.zzc;
        }
        zzfvfVar.zze(str2);
    }

    public final boolean zzg(boolean z8) {
        return this.zzb.zzg(this.zzc);
    }
}

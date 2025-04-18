package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.UUID;

/* loaded from: classes3.dex */
class zzfut {
    static final String zza = new UUID(0, 0).toString();
    final zzfus zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    public zzfut(Context context, String str, String str2, String str3) {
        this.zzb = zzfus.zzb(context);
        this.zzc = str;
        this.zzd = str.concat("_3p");
        this.zze = str2;
        this.zzf = str2.concat("_3p");
        this.zzg = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(androidx.compose.foundation.text.input.a.k(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder B = androidx.compose.foundation.text.input.a.B(this.zzg, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        B.append(str2 == null ? "null" : "not null");
        B.append(", hashKey is ");
        B.append(str3 == null ? "null" : "not null");
        throw new IllegalArgumentException(B.toString());
    }

    public final long zza(boolean z2) {
        return this.zzb.zza(z2 ? this.zzf : this.zze, -1L);
    }

    public final zzfur zzb(@Nullable String str, @Nullable String str2, long j2, boolean z2) throws IOException {
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
            return new zzfur();
        }
        boolean z3 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long zza2 = zza(z3);
        if (zza2 != -1) {
            if (currentTimeMillis < zza2) {
                this.zzb.zzd(z3 ? this.zzf : this.zze, Long.valueOf(currentTimeMillis));
            } else if (currentTimeMillis >= zza2 + j2) {
                return zzc(str, str2);
            }
        }
        String zze2 = zze(z3);
        return (zze2 != null || z2) ? new zzfur(zze2, Instant.ofEpochMilli(zza(z3))) : zzc(str, str2);
    }

    public final zzfur zzc(String str, String str2) throws IOException {
        if (str == null) {
            return zzd(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.zzb.zzd("paid_3p_hash_key", uuid);
        return zzd(zzh(str, str2, uuid), true);
    }

    public final zzfur zzd(String str, boolean z2) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        this.zzb.zzd(z2 ? this.zzf : this.zze, Long.valueOf(currentTimeMillis));
        this.zzb.zzd(z2 ? this.zzd : this.zzc, str);
        return new zzfur(str, Instant.ofEpochMilli(currentTimeMillis));
    }

    public final String zze(boolean z2) {
        return this.zzb.zzc(z2 ? this.zzd : this.zzc, null);
    }

    public final void zzf(boolean z2) throws IOException {
        this.zzb.zze(z2 ? this.zzf : this.zze);
        this.zzb.zze(z2 ? this.zzd : this.zzc);
    }

    public final boolean zzg(boolean z2) {
        return this.zzb.zzg(this.zzc);
    }
}

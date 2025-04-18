package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import eb.j;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
class zzftk {
    static final String zza = new UUID(0, 0).toString();
    final zzftj zzb;
    final zzfti zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    public zzftk(Context context, String str, String str2, String str3) {
        this.zzb = zzftj.zzb(context);
        this.zzc = zzfti.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        String str4;
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder n10 = j.n(this.zzh, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        String str5 = AbstractJsonLexerKt.NULL;
        if (str2 != null) {
            str4 = "not null";
        } else {
            str4 = AbstractJsonLexerKt.NULL;
        }
        n10.append(str4);
        n10.append(", hashKey is ");
        if (str3 != null) {
            str5 = "not null";
        }
        n10.append(str5);
        throw new IllegalArgumentException(n10.toString());
    }

    public final long zza(boolean z10) {
        return this.zzb.zza(z10 ? this.zzg : this.zzf, -1L);
    }

    public final zzfth zzb(@Nullable String str, @Nullable String str2, long j3, boolean z10) throws IOException {
        Instant ofEpochMilli;
        String str3;
        boolean z11 = true;
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
            return new zzfth();
        }
        if (str == null) {
            z11 = false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            long zza2 = zza(z11);
            if (zza2 != -1) {
                if (currentTimeMillis < zza2) {
                    zzftj zzftjVar = this.zzb;
                    if (z11) {
                        str3 = this.zzg;
                    } else {
                        str3 = this.zzf;
                    }
                    zzftjVar.zzd(str3, Long.valueOf(currentTimeMillis));
                } else if (currentTimeMillis >= zza2 + j3) {
                    return zzc(str, str2);
                }
            }
            String zze2 = zze(z11);
            if (zze2 == null && !z10) {
                return zzc(str, str2);
            }
            ofEpochMilli = Instant.ofEpochMilli(zza(z11));
            return new zzfth(zze2, ofEpochMilli);
        }
        throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final zzfth zzc(String str, String str2) throws IOException {
        if (str == null) {
            return zzd(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.zzb.zzd("paid_3p_hash_key", uuid);
        return zzd(zzh(str, str2, uuid), true);
    }

    public final zzfth zzd(String str, boolean z10) throws IOException {
        String str2;
        String str3;
        Instant ofEpochMilli;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= 0) {
            zzftj zzftjVar = this.zzb;
            if (z10) {
                str2 = this.zzg;
            } else {
                str2 = this.zzf;
            }
            zzftjVar.zzd(str2, Long.valueOf(currentTimeMillis));
            zzftj zzftjVar2 = this.zzb;
            if (z10) {
                str3 = this.zze;
            } else {
                str3 = this.zzd;
            }
            zzftjVar2.zzd(str3, str);
            ofEpochMilli = Instant.ofEpochMilli(currentTimeMillis);
            return new zzfth(str, ofEpochMilli);
        }
        throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
    }

    public final String zze(boolean z10) {
        return this.zzb.zzc(z10 ? this.zze : this.zzd, null);
    }

    public final void zzf(boolean z10) throws IOException {
        String str;
        String str2;
        if (z10) {
            str = this.zzg;
        } else {
            str = this.zzf;
        }
        this.zzb.zze(str);
        zzftj zzftjVar = this.zzb;
        if (z10) {
            str2 = this.zze;
        } else {
            str2 = this.zzd;
        }
        zzftjVar.zze(str2);
    }

    public final boolean zzg(boolean z10) {
        return this.zzb.zzg(this.zzd);
    }
}

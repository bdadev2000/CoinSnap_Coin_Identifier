package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* loaded from: classes3.dex */
public class zzff extends IOException {
    private zzgc zza;

    public zzff(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    public static zzfe zza() {
        return new zzfe("Protocol message tag had invalid wire type.");
    }

    public static zzff zzb() {
        return new zzff("Protocol message contained an invalid tag (zero).");
    }

    public static zzff zzc() {
        return new zzff("Protocol message had invalid UTF-8.");
    }

    public static zzff zzd() {
        return new zzff("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzff zze() {
        return new zzff("Failed to parse the message.");
    }

    public static zzff zzg() {
        return new zzff("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzff zzf(zzgc zzgcVar) {
        this.zza = zzgcVar;
        return this;
    }

    public zzff(String str) {
        super(str);
        this.zza = null;
    }
}

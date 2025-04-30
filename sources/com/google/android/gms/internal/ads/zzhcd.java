package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzhcd extends IOException {
    private zzhde zza;
    private boolean zzb;

    public zzhcd(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    public static zzhcc zza() {
        return new zzhcc("Protocol message tag had invalid wire type.");
    }

    public static zzhcd zzb() {
        return new zzhcd("Protocol message end-group tag did not match expected tag.");
    }

    public static zzhcd zzc() {
        return new zzhcd("Protocol message contained an invalid tag (zero).");
    }

    public static zzhcd zzd() {
        return new zzhcd("Protocol message had invalid UTF-8.");
    }

    public static zzhcd zze() {
        return new zzhcd("CodedInputStream encountered a malformed varint.");
    }

    public static zzhcd zzf() {
        return new zzhcd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzhcd zzg() {
        return new zzhcd("Failed to parse the message.");
    }

    public static zzhcd zzi() {
        return new zzhcd("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static zzhcd zzj() {
        return new zzhcd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzhcd zzh(zzhde zzhdeVar) {
        this.zza = zzhdeVar;
        return this;
    }

    public final void zzk() {
        this.zzb = true;
    }

    public final boolean zzl() {
        return this.zzb;
    }

    public zzhcd(String str) {
        super(str);
        this.zza = null;
    }
}

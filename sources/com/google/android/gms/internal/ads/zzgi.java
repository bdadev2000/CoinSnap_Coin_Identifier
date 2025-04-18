package com.google.android.gms.internal.ads;

import a4.j;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import vd.e;

/* loaded from: classes3.dex */
public final class zzgi {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;

    @Nullable
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzax.zzb("media3.datasource");
    }

    public final String toString() {
        StringBuilder o10 = j.o("DataSpec[GET ", this.zza.toString(), ", ");
        o10.append(this.zze);
        o10.append(", ");
        o10.append(this.zzf);
        o10.append(", null, ");
        return e.g(o10, this.zzg, "]");
    }

    public final zzgg zza() {
        return new zzgg(this, null);
    }

    public final boolean zzb(int i10) {
        return (this.zzg & i10) == i10;
    }

    private zzgi(Uri uri, long j3, int i10, @Nullable byte[] bArr, Map map, long j10, long j11, @Nullable String str, int i11, @Nullable Object obj) {
        boolean z10 = false;
        boolean z11 = j10 >= 0;
        zzdb.zzd(z11);
        zzdb.zzd(z11);
        if (j11 <= 0) {
            j11 = j11 == -1 ? -1L : j11;
            zzdb.zzd(z10);
            uri.getClass();
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zze = j10;
            this.zzf = j11;
            this.zzg = i11;
        }
        z10 = true;
        zzdb.zzd(z10);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j10;
        this.zzf = j11;
        this.zzg = i11;
    }

    @Deprecated
    public zzgi(Uri uri, long j3, long j10, @Nullable String str) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j3, j10, null, 0, null);
    }
}

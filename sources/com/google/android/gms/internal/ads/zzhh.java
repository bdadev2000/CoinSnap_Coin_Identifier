package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.o;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzhh {
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
        zzbv.zzb("media3.datasource");
    }

    public final String toString() {
        StringBuilder n2 = o.n("DataSpec[GET ", this.zza.toString(), ", ");
        n2.append(this.zze);
        n2.append(", ");
        n2.append(this.zzf);
        n2.append(", null, ");
        return AbstractC2914a.g(n2, this.zzg, "]");
    }

    public final zzhf zza() {
        return new zzhf(this, null);
    }

    public final boolean zzb(int i9) {
        return (this.zzg & i9) == i9;
    }

    private zzhh(Uri uri, long j7, int i9, @Nullable byte[] bArr, Map map, long j9, long j10, @Nullable String str, int i10, @Nullable Object obj) {
        boolean z8 = false;
        boolean z9 = j9 >= 0;
        zzeq.zzd(z9);
        zzeq.zzd(z9);
        if (j10 <= 0) {
            j10 = j10 == -1 ? -1L : j10;
            zzeq.zzd(z8);
            uri.getClass();
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zze = j9;
            this.zzf = j10;
            this.zzg = i10;
        }
        z8 = true;
        zzeq.zzd(z8);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j9;
        this.zzf = j10;
        this.zzg = i10;
    }

    @Deprecated
    public zzhh(Uri uri, long j7, long j9, @Nullable String str) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j7, j9, null, 0, null);
    }
}

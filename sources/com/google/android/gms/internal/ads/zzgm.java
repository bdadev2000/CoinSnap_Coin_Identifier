package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.d;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzgm {
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
        zzbd.zzb("media3.datasource");
    }

    public final String toString() {
        StringBuilder v2 = d.v("DataSpec[GET ", this.zza.toString(), ", ");
        v2.append(this.zze);
        v2.append(", ");
        v2.append(this.zzf);
        v2.append(", null, ");
        return androidx.compose.foundation.text.input.a.n(v2, this.zzg, "]");
    }

    public final zzgk zza() {
        return new zzgk(this, null);
    }

    public final boolean zzb(int i2) {
        return (this.zzg & i2) == i2;
    }

    private zzgm(Uri uri, long j2, int i2, @Nullable byte[] bArr, Map map, long j3, long j4, @Nullable String str, int i3, @Nullable Object obj) {
        boolean z2 = false;
        boolean z3 = j3 >= 0;
        zzdi.zzd(z3);
        zzdi.zzd(z3);
        if (j4 <= 0) {
            j4 = j4 == -1 ? -1L : j4;
            zzdi.zzd(z2);
            uri.getClass();
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zze = j3;
            this.zzf = j4;
            this.zzg = i3;
        }
        z2 = true;
        zzdi.zzd(z2);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j3;
        this.zzf = j4;
        this.zzg = i3;
    }

    @Deprecated
    public zzgm(Uri uri, long j2, long j3, @Nullable String str) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j2, j3, null, 0, null);
    }
}

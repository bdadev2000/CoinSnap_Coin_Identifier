package com.google.android.gms.internal.ads;

import android.net.Network;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes3.dex */
public final class zzfsy extends zzfsm {
    private zzfxg<Integer> zza;
    private zzfxg<Integer> zzb;

    @Nullable
    private zzfsx zzc;

    @Nullable
    private HttpURLConnection zzd;

    public zzfsy(zzfxg<Integer> zzfxgVar, zzfxg<Integer> zzfxgVar2, @Nullable zzfsx zzfsxVar) {
        this.zza = zzfxgVar;
        this.zzb = zzfxgVar2;
        this.zzc = zzfsxVar;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(@Nullable HttpURLConnection httpURLConnection) {
        zzfsn.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfsn.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfsx zzfsxVar = this.zzc;
        zzfsxVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfsxVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfsx zzfsxVar, final int i10, final int i11) throws IOException {
        this.zza = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfsq
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i10);
                return valueOf;
            }
        };
        this.zzb = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfsr
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i11);
                return valueOf;
            }
        };
        this.zzc = zzfsxVar;
        return zzm();
    }

    @RequiresApi(21)
    public HttpURLConnection zzo(@NonNull final Network network, @NonNull final URL url, final int i10, final int i11) throws IOException {
        this.zza = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfss
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i10);
                return valueOf;
            }
        };
        this.zzb = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfst
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i11);
                return valueOf;
            }
        };
        this.zzc = new zzfsx() { // from class: com.google.android.gms.internal.ads.zzfsu
            @Override // com.google.android.gms.internal.ads.zzfsx
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = network.openConnection(url);
                return openConnection;
            }
        };
        return zzm();
    }

    public URLConnection zzr(@NonNull final URL url, final int i10) throws IOException {
        this.zza = new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfsv
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i10);
                return valueOf;
            }
        };
        this.zzc = new zzfsx() { // from class: com.google.android.gms.internal.ads.zzfsw
            @Override // com.google.android.gms.internal.ads.zzfsx
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = url.openConnection();
                return openConnection;
            }
        };
        return zzm();
    }

    public zzfsy() {
        this(new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfso
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                return zzfsy.zzf();
            }
        }, new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfsp
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                return zzfsy.zzg();
            }
        }, null);
    }
}

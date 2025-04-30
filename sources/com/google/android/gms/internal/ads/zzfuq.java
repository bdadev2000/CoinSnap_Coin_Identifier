package com.google.android.gms.internal.ads;

import android.net.Network;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes2.dex */
public final class zzfuq extends zzfue {
    private zzfyw<Integer> zza;
    private zzfyw<Integer> zzb;

    @Nullable
    private zzfup zzc;

    @Nullable
    private HttpURLConnection zzd;

    public zzfuq(zzfyw<Integer> zzfywVar, zzfyw<Integer> zzfywVar2, @Nullable zzfup zzfupVar) {
        this.zza = zzfywVar;
        this.zzb = zzfywVar2;
        this.zzc = zzfupVar;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(@Nullable HttpURLConnection httpURLConnection) {
        zzfuf.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfuf.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfup zzfupVar = this.zzc;
        zzfupVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfupVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfup zzfupVar, final int i9, final int i10) throws IOException {
        this.zza = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzfui
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i9);
                return valueOf;
            }
        };
        this.zzb = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzfuj
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i10);
                return valueOf;
            }
        };
        this.zzc = zzfupVar;
        return zzm();
    }

    @RequiresApi(21)
    public HttpURLConnection zzo(@NonNull final Network network, @NonNull final URL url, final int i9, final int i10) throws IOException {
        this.zza = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzfuk
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i9);
                return valueOf;
            }
        };
        this.zzb = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzful
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i10);
                return valueOf;
            }
        };
        this.zzc = new zzfup() { // from class: com.google.android.gms.internal.ads.zzfum
            @Override // com.google.android.gms.internal.ads.zzfup
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = network.openConnection(url);
                return openConnection;
            }
        };
        return zzm();
    }

    public URLConnection zzr(@NonNull final URL url, final int i9) throws IOException {
        this.zza = new zzfyw() { // from class: com.google.android.gms.internal.ads.zzfun
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i9);
                return valueOf;
            }
        };
        this.zzc = new zzfup() { // from class: com.google.android.gms.internal.ads.zzfuo
            @Override // com.google.android.gms.internal.ads.zzfup
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = url.openConnection();
                return openConnection;
            }
        };
        return zzm();
    }

    public zzfuq() {
        this(new zzfyw() { // from class: com.google.android.gms.internal.ads.zzfug
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                return zzfuq.zzf();
            }
        }, new zzfyw() { // from class: com.google.android.gms.internal.ads.zzfuh
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                return zzfuq.zzg();
            }
        }, null);
    }
}

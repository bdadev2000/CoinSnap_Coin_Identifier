package com.google.android.gms.internal.ads;

import android.net.Network;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes3.dex */
public final class zzfui extends zzftw {
    private zzfyp<Integer> zza;
    private zzfyp<Integer> zzb;

    @Nullable
    private zzfuh zzc;

    @Nullable
    private HttpURLConnection zzd;

    public zzfui(zzfyp<Integer> zzfypVar, zzfyp<Integer> zzfypVar2, @Nullable zzfuh zzfuhVar) {
        this.zza = zzfypVar;
        this.zzb = zzfypVar2;
        this.zzc = zzfuhVar;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(@Nullable HttpURLConnection httpURLConnection) {
        zzftx.zza();
        if (httpURLConnection != null) {
            AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzftx.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfuh zzfuhVar = this.zzc;
        zzfuhVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfuhVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfuh zzfuhVar, final int i2, final int i3) throws IOException {
        this.zza = new zzfyp() { // from class: com.google.android.gms.internal.ads.zzfua
            @Override // com.google.android.gms.internal.ads.zzfyp
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzb = new zzfyp() { // from class: com.google.android.gms.internal.ads.zzfub
            @Override // com.google.android.gms.internal.ads.zzfyp
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i3);
                return valueOf;
            }
        };
        this.zzc = zzfuhVar;
        return zzm();
    }

    @RequiresApi
    public HttpURLConnection zzo(@NonNull final Network network, @NonNull final URL url, final int i2, final int i3) throws IOException {
        this.zza = new zzfyp() { // from class: com.google.android.gms.internal.ads.zzfuc
            @Override // com.google.android.gms.internal.ads.zzfyp
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzb = new zzfyp() { // from class: com.google.android.gms.internal.ads.zzfud
            @Override // com.google.android.gms.internal.ads.zzfyp
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i3);
                return valueOf;
            }
        };
        this.zzc = new zzfuh() { // from class: com.google.android.gms.internal.ads.zzfue
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = network.openConnection(url);
                return openConnection;
            }
        };
        return zzm();
    }

    public URLConnection zzr(@NonNull final URL url, final int i2) throws IOException {
        this.zza = new zzfyp() { // from class: com.google.android.gms.internal.ads.zzfuf
            @Override // com.google.android.gms.internal.ads.zzfyp
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = new zzfuh() { // from class: com.google.android.gms.internal.ads.zzfug
            @Override // com.google.android.gms.internal.ads.zzfuh
            public final URLConnection zza() {
                URLConnection openConnection;
                openConnection = url.openConnection();
                return openConnection;
            }
        };
        return zzm();
    }

    public zzfui() {
        this(new zzfyp() { // from class: com.google.android.gms.internal.ads.zzfty
            @Override // com.google.android.gms.internal.ads.zzfyp
            public final Object zza() {
                return zzfui.zzf();
            }
        }, new zzfyp() { // from class: com.google.android.gms.internal.ads.zzftz
            @Override // com.google.android.gms.internal.ads.zzfyp
            public final Object zza() {
                return zzfui.zzg();
            }
        }, null);
    }
}

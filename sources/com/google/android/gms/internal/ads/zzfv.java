package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class zzfv extends zzfw {
    private final AssetManager zza;

    @Nullable
    private Uri zzb;

    @Nullable
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzfv(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i10, int i11) throws zzfu {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.zzd;
        if (j3 == 0) {
            return -1;
        }
        if (j3 != -1) {
            try {
                i11 = (int) Math.min(j3, i11);
            } catch (IOException e2) {
                throw new zzfu(e2, 2000);
            }
        }
        InputStream inputStream = this.zzc;
        int i12 = zzen.zza;
        int read = inputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j10 = this.zzd;
        if (j10 != -1) {
            this.zzd = j10 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws zzfu {
        int i10;
        try {
            Uri uri = zzgiVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            zzi(zzgiVar);
            InputStream open = this.zza.open(path, 1);
            this.zzc = open;
            if (open.skip(zzgiVar.zze) >= zzgiVar.zze) {
                long j3 = zzgiVar.zzf;
                if (j3 != -1) {
                    this.zzd = j3;
                } else {
                    long available = this.zzc.available();
                    this.zzd = available;
                    if (available == 2147483647L) {
                        this.zzd = -1L;
                    }
                }
                this.zze = true;
                zzj(zzgiVar);
                return this.zzd;
            }
            throw new zzfu(null, 2008);
        } catch (zzfu e2) {
            throw e2;
        } catch (IOException e10) {
            if (true != (e10 instanceof FileNotFoundException)) {
                i10 = 2000;
            } else {
                i10 = 2005;
            }
            throw new zzfu(e10, i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() throws zzfu {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zzh();
                }
            } catch (IOException e2) {
                throw new zzfu(e2, 2000);
            }
        } catch (Throwable th2) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzh();
            }
            throw th2;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class zzgu extends zzgv {
    private final AssetManager zza;

    @Nullable
    private Uri zzb;

    @Nullable
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzgu(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i9, int i10) throws zzgt {
        if (i10 == 0) {
            return 0;
        }
        long j7 = this.zzd;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i10 = (int) Math.min(j7, i10);
            } catch (IOException e4) {
                throw new zzgt(e4, 2000);
            }
        }
        InputStream inputStream = this.zzc;
        int i11 = zzgd.zza;
        int read = inputStream.read(bArr, i9, i10);
        if (read == -1) {
            return -1;
        }
        long j9 = this.zzd;
        if (j9 != -1) {
            this.zzd = j9 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhh zzhhVar) throws zzgt {
        int i9;
        try {
            Uri uri = zzhhVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            zzi(zzhhVar);
            InputStream open = this.zza.open(path, 1);
            this.zzc = open;
            if (open.skip(zzhhVar.zze) >= zzhhVar.zze) {
                long j7 = zzhhVar.zzf;
                if (j7 != -1) {
                    this.zzd = j7;
                } else {
                    long available = this.zzc.available();
                    this.zzd = available;
                    if (available == 2147483647L) {
                        this.zzd = -1L;
                    }
                }
                this.zze = true;
                zzj(zzhhVar);
                return this.zzd;
            }
            throw new zzgt(null, 2008);
        } catch (zzgt e4) {
            throw e4;
        } catch (IOException e9) {
            if (true != (e9 instanceof FileNotFoundException)) {
                i9 = 2000;
            } else {
                i9 = 2005;
            }
            throw new zzgt(e9, i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzgt {
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
            } catch (IOException e4) {
                throw new zzgt(e4, 2000);
            }
        } catch (Throwable th) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzh();
            }
            throw th;
        }
    }
}

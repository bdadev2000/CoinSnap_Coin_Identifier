package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.o;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes2.dex */
public final class zzhs extends zzgv {

    @Nullable
    private RandomAccessFile zza;

    @Nullable
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzhs() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i9, int i10) throws zzhr {
        if (i10 == 0) {
            return 0;
        }
        long j7 = this.zzc;
        if (j7 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i11 = zzgd.zza;
            int read = randomAccessFile.read(bArr, i9, (int) Math.min(j7, i10));
            if (read > 0) {
                this.zzc -= read;
                zzg(read);
            }
            return read;
        } catch (IOException e4) {
            throw new zzhr(e4, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhh zzhhVar) throws zzhr {
        boolean zzb;
        Uri uri = zzhhVar.zza;
        this.zzb = uri;
        zzi(zzhhVar);
        int i9 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, CampaignEx.JSON_KEY_AD_R);
            this.zza = randomAccessFile;
            try {
                randomAccessFile.seek(zzhhVar.zze);
                long j7 = zzhhVar.zzf;
                if (j7 == -1) {
                    j7 = this.zza.length() - zzhhVar.zze;
                }
                this.zzc = j7;
                if (j7 >= 0) {
                    this.zzd = true;
                    zzj(zzhhVar);
                    return this.zzc;
                }
                throw new zzhr(null, null, 2008);
            } catch (IOException e4) {
                throw new zzhr(e4, 2000);
            }
        } catch (FileNotFoundException e9) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                int i10 = zzgd.zza;
                zzb = zzhq.zzb(e9.getCause());
                if (true != zzb) {
                    i9 = 2005;
                }
                throw new zzhr(e9, i9);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder o3 = o.o("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            o3.append(fragment);
            throw new zzhr(o3.toString(), e9, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        } catch (SecurityException e10) {
            throw new zzhr(e10, 2006);
        } catch (RuntimeException e11) {
            throw new zzhr(e11, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzhr {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzh();
                }
            } catch (IOException e4) {
                throw new zzhr(e4, 2000);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
            throw th;
        }
    }
}

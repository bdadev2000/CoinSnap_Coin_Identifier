package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public final class zzgs extends zzfw {

    @Nullable
    private RandomAccessFile zza;

    @Nullable
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzgs() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i10, int i11) throws zzgr {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.zzc;
        if (j3 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i12 = zzen.zza;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j3, i11));
            if (read > 0) {
                this.zzc -= read;
                zzg(read);
            }
            return read;
        } catch (IOException e2) {
            throw new zzgr(e2, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws zzgr {
        Uri uri = zzgiVar.zza;
        this.zzb = uri;
        zzi(zzgiVar);
        int i10 = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, CampaignEx.JSON_KEY_AD_R);
            this.zza = randomAccessFile;
            try {
                randomAccessFile.seek(zzgiVar.zze);
                long j3 = zzgiVar.zzf;
                if (j3 == -1) {
                    j3 = this.zza.length() - zzgiVar.zze;
                }
                this.zzc = j3;
                if (j3 >= 0) {
                    this.zzd = true;
                    zzj(zzgiVar);
                    return this.zzc;
                }
                throw new zzgr(null, null, 2008);
            } catch (IOException e2) {
                throw new zzgr(e2, 2000);
            }
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                if (!(e10.getCause() instanceof ErrnoException) || ((ErrnoException) e10.getCause()).errno != OsConstants.EACCES) {
                    i10 = 2005;
                }
                throw new zzgr(e10, i10);
            }
            throw new zzgr(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new zzgr(e11, 2006);
        } catch (RuntimeException e12) {
            throw new zzgr(e12, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() throws zzgr {
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
            } catch (IOException e2) {
                throw new zzgr(e2, 2000);
            }
        } catch (Throwable th2) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
            throw th2;
        }
    }
}

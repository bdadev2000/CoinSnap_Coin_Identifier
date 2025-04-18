package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public final class zzgd extends zzfz {
    private final ContentResolver zza;

    @Nullable
    private Uri zzb;

    @Nullable
    private AssetFileDescriptor zzc;

    @Nullable
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgd(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i2, int i3) throws zzgc {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.zze;
        if (j2 == 0) {
            return -1;
        }
        if (j2 != -1) {
            try {
                i3 = (int) Math.min(j2, i3);
            } catch (IOException e) {
                throw new zzgc(e, AdError.SERVER_ERROR_CODE);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        int i4 = zzeu.zza;
        int read = fileInputStream.read(bArr, i2, i3);
        if (read == -1) {
            return -1;
        }
        long j3 = this.zze;
        if (j3 != -1) {
            this.zze = j3 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(zzgm zzgmVar) throws zzgc {
        int i2;
        AssetFileDescriptor openAssetFileDescriptor;
        long j2;
        try {
            try {
                Uri normalizeScheme = zzgmVar.zza.normalizeScheme();
                this.zzb = normalizeScheme;
                zzi(zzgmVar);
                if ("content".equals(normalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.zza.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.zzc = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    IOException iOException = new IOException("Could not open file descriptor for: ".concat(String.valueOf(normalizeScheme)));
                    i2 = AdError.SERVER_ERROR_CODE;
                    try {
                        throw new zzgc(iOException, AdError.SERVER_ERROR_CODE);
                    } catch (IOException e) {
                        e = e;
                        if (true == (e instanceof FileNotFoundException)) {
                            i2 = 2005;
                        }
                        throw new zzgc(e, i2);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.zzd = fileInputStream;
                if (length != -1 && zzgmVar.zze > length) {
                    throw new zzgc(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(zzgmVar.zze + startOffset) - startOffset;
                if (skip != zzgmVar.zze) {
                    throw new zzgc(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.zze = -1L;
                        j2 = -1;
                    } else {
                        j2 = size - channel.position();
                        this.zze = j2;
                        if (j2 < 0) {
                            throw new zzgc(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                        }
                    }
                } else {
                    j2 = length - skip;
                    this.zze = j2;
                    if (j2 < 0) {
                        throw new zzgc(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
                long j3 = zzgmVar.zzf;
                if (j3 != -1) {
                    if (j2 != -1) {
                        j3 = Math.min(j2, j3);
                    }
                    this.zze = j3;
                }
                this.zzf = true;
                zzj(zzgmVar);
                long j4 = zzgmVar.zzf;
                return j4 != -1 ? j4 : this.zze;
            } catch (zzgc e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i2 = AdError.SERVER_ERROR_CODE;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() throws zzgc {
        this.zzb = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream = this.zzd;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                    } catch (IOException e) {
                        throw new zzgc(e, AdError.SERVER_ERROR_CODE);
                    }
                } catch (Throwable th) {
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                        throw th;
                    } catch (IOException e2) {
                        throw new zzgc(e2, AdError.SERVER_ERROR_CODE);
                    }
                }
            } catch (Throwable th2) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th2;
            }
        } catch (IOException e3) {
            throw new zzgc(e3, AdError.SERVER_ERROR_CODE);
        }
    }
}

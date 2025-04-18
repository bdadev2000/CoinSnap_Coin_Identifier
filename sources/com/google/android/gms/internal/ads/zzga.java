package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public final class zzga extends zzfw {
    private final ContentResolver zza;

    @Nullable
    private Uri zzb;

    @Nullable
    private AssetFileDescriptor zzc;

    @Nullable
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzga(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i10, int i11) throws zzfz {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.zze;
        if (j3 == 0) {
            return -1;
        }
        if (j3 != -1) {
            try {
                i11 = (int) Math.min(j3, i11);
            } catch (IOException e2) {
                throw new zzfz(e2, 2000);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        int i12 = zzen.zza;
        int read = fileInputStream.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        long j10 = this.zze;
        if (j10 != -1) {
            this.zze = j10 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws zzfz {
        int i10;
        AssetFileDescriptor openAssetFileDescriptor;
        long j3;
        try {
            try {
                Uri normalizeScheme = zzgiVar.zza.normalizeScheme();
                this.zzb = normalizeScheme;
                zzi(zzgiVar);
                if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(normalizeScheme.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.zza.openAssetFileDescriptor(normalizeScheme, CampaignEx.JSON_KEY_AD_R);
                }
                this.zzc = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.zzd = fileInputStream;
                    if (length != -1 && zzgiVar.zze > length) {
                        throw new zzfz(null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(zzgiVar.zze + startOffset) - startOffset;
                    if (skip == zzgiVar.zze) {
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.zze = -1L;
                                j3 = -1;
                            } else {
                                j3 = size - channel.position();
                                this.zze = j3;
                                if (j3 < 0) {
                                    throw new zzfz(null, 2008);
                                }
                            }
                        } else {
                            j3 = length - skip;
                            this.zze = j3;
                            if (j3 < 0) {
                                throw new zzfz(null, 2008);
                            }
                        }
                        long j10 = zzgiVar.zzf;
                        if (j10 != -1) {
                            if (j3 != -1) {
                                j10 = Math.min(j3, j10);
                            }
                            this.zze = j10;
                        }
                        this.zzf = true;
                        zzj(zzgiVar);
                        long j11 = zzgiVar.zzf;
                        if (j11 != -1) {
                            return j11;
                        }
                        return this.zze;
                    }
                    throw new zzfz(null, 2008);
                }
                i10 = 2000;
                try {
                    throw new zzfz(new IOException("Could not open file descriptor for: ".concat(String.valueOf(normalizeScheme))), 2000);
                } catch (IOException e2) {
                    e = e2;
                    if (true == (e instanceof FileNotFoundException)) {
                        i10 = 2005;
                    }
                    throw new zzfz(e, i10);
                }
            } catch (zzfz e10) {
                throw e10;
            }
        } catch (IOException e11) {
            e = e11;
            i10 = 2000;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() throws zzfz {
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
                    } catch (IOException e2) {
                        throw new zzfz(e2, 2000);
                    }
                } catch (IOException e10) {
                    throw new zzfz(e10, 2000);
                }
            } catch (Throwable th2) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
                throw th2;
            }
        } catch (Throwable th3) {
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
                throw th3;
            } catch (IOException e11) {
                throw new zzfz(e11, 2000);
            }
        }
    }
}

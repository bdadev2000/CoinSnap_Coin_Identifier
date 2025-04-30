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

/* loaded from: classes2.dex */
public final class zzgy extends zzgv {
    private final ContentResolver zza;

    @Nullable
    private Uri zzb;

    @Nullable
    private AssetFileDescriptor zzc;

    @Nullable
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgy(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i9, int i10) throws zzgx {
        if (i10 == 0) {
            return 0;
        }
        long j7 = this.zze;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i10 = (int) Math.min(j7, i10);
            } catch (IOException e4) {
                throw new zzgx(e4, 2000);
            }
        }
        FileInputStream fileInputStream = this.zzd;
        int i11 = zzgd.zza;
        int read = fileInputStream.read(bArr, i9, i10);
        if (read == -1) {
            return -1;
        }
        long j9 = this.zze;
        if (j9 != -1) {
            this.zze = j9 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhh zzhhVar) throws zzgx {
        int i9;
        AssetFileDescriptor openAssetFileDescriptor;
        long j7;
        try {
            try {
                Uri normalizeScheme = zzhhVar.zza.normalizeScheme();
                this.zzb = normalizeScheme;
                zzi(zzhhVar);
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
                    if (length != -1 && zzhhVar.zze > length) {
                        throw new zzgx(null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(zzhhVar.zze + startOffset) - startOffset;
                    if (skip == zzhhVar.zze) {
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.zze = -1L;
                                j7 = -1;
                            } else {
                                j7 = size - channel.position();
                                this.zze = j7;
                                if (j7 < 0) {
                                    throw new zzgx(null, 2008);
                                }
                            }
                        } else {
                            j7 = length - skip;
                            this.zze = j7;
                            if (j7 < 0) {
                                throw new zzgx(null, 2008);
                            }
                        }
                        long j9 = zzhhVar.zzf;
                        if (j9 != -1) {
                            if (j7 != -1) {
                                j9 = Math.min(j7, j9);
                            }
                            this.zze = j9;
                        }
                        this.zzf = true;
                        zzj(zzhhVar);
                        long j10 = zzhhVar.zzf;
                        if (j10 != -1) {
                            return j10;
                        }
                        return this.zze;
                    }
                    throw new zzgx(null, 2008);
                }
                i9 = 2000;
                try {
                    throw new zzgx(new IOException("Could not open file descriptor for: ".concat(String.valueOf(normalizeScheme))), 2000);
                } catch (IOException e4) {
                    e = e4;
                    if (true == (e instanceof FileNotFoundException)) {
                        i9 = 2005;
                    }
                    throw new zzgx(e, i9);
                }
            } catch (IOException e9) {
                e = e9;
                i9 = 2000;
            }
        } catch (zzgx e10) {
            throw e10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzgx {
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
                    } catch (IOException e4) {
                        throw new zzgx(e4, 2000);
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
                    } catch (IOException e9) {
                        throw new zzgx(e9, 2000);
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
        } catch (IOException e10) {
            throw new zzgx(e10, 2000);
        }
    }
}

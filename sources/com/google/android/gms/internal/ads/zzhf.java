package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.media.d;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzhf extends zzfz {
    private final Context zza;

    @Nullable
    private zzgm zzb;

    @Nullable
    private AssetFileDescriptor zzc;

    @Nullable
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzhf(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i2) {
        return Uri.parse("rawresource:///" + i2);
    }

    private static int zzk(String str) throws zzhe {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzhe("Resource identifier must be an integer.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        }
    }

    private static AssetFileDescriptor zzl(Context context, zzgm zzgmVar) throws zzhe {
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = zzgmVar.zza.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new zzhe(d.i("rawresource:// URI must have exactly one path element, found ", pathSegments.size()));
            }
            identifier = zzk(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new zzhe(androidx.compose.foundation.text.input.a.A("Unsupported URI scheme (", normalizeScheme.getScheme(), "). Only android.resource is supported."), null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new zzhe("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = zzk(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(androidx.compose.foundation.text.input.a.k(packageName, CertificateUtil.DELIMITER, path), "raw", null);
                if (identifier == 0) {
                    throw new zzhe("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new zzhe("Resource is compressed: ".concat(String.valueOf(normalizeScheme)), null, AdError.SERVER_ERROR_CODE);
        } catch (Resources.NotFoundException e2) {
            throw new zzhe(null, e2, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i2, int i3) throws zzhe {
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
                throw new zzhe(null, e, AdError.SERVER_ERROR_CODE);
            }
        }
        InputStream inputStream = this.zzd;
        int i4 = zzeu.zza;
        int read = inputStream.read(bArr, i2, i3);
        if (read == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new zzhe("End of stream reached having not read sufficient data.", new EOFException(), AdError.SERVER_ERROR_CODE);
        }
        long j3 = this.zze;
        if (j3 != -1) {
            this.zze = j3 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final long zzb(zzgm zzgmVar) throws zzhe {
        long j2;
        this.zzb = zzgmVar;
        zzi(zzgmVar);
        AssetFileDescriptor zzl = zzl(this.zza, zzgmVar);
        this.zzc = zzl;
        long length = zzl.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        if (length != -1) {
            try {
                if (zzgmVar.zze > length) {
                    throw new zzhe(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            } catch (zzhe e) {
                throw e;
            } catch (IOException e2) {
                throw new zzhe(null, e2, AdError.SERVER_ERROR_CODE);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long skip = fileInputStream.skip(zzgmVar.zze + startOffset) - startOffset;
        if (skip != zzgmVar.zze) {
            throw new zzhe(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.zze = -1L;
                j2 = -1;
            } else {
                j2 = channel.size() - channel.position();
                this.zze = j2;
                if (j2 < 0) {
                    throw new zzhe(null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
            }
        } else {
            j2 = length - skip;
            this.zze = j2;
            if (j2 < 0) {
                throw new zzgh(AdError.REMOTE_ADS_SERVICE_ERROR);
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
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    @Nullable
    public final Uri zzc() {
        zzgm zzgmVar = this.zzb;
        if (zzgmVar != null) {
            return zzgmVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgg
    public final void zzd() throws zzhe {
        this.zzb = null;
        try {
            try {
                try {
                    InputStream inputStream = this.zzd;
                    if (inputStream != null) {
                        inputStream.close();
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
                        throw new zzhe(null, e, AdError.SERVER_ERROR_CODE);
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
                        throw new zzhe(null, e2, AdError.SERVER_ERROR_CODE);
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
            throw new zzhe(null, e3, AdError.SERVER_ERROR_CODE);
        }
    }
}

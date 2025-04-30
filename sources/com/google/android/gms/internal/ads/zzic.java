package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.mbridge.msdk.foundation.entity.o;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzic extends zzgv {
    private final Context zza;

    @Nullable
    private zzhh zzb;

    @Nullable
    private AssetFileDescriptor zzc;

    @Nullable
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzic(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i9) {
        return Uri.parse("rawresource:///" + i9);
    }

    private static int zzk(String str) throws zzib {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzib("Resource identifier must be an integer.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        }
    }

    private static AssetFileDescriptor zzl(Context context, zzhh zzhhVar) throws zzib {
        String host;
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = zzhhVar.zza.normalizeScheme();
        if (TextUtils.equals(RawResourceDataSource.RAW_RESOURCE_SCHEME, normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                identifier = zzk(pathSegments.get(0));
            } else {
                throw new zzib(o.h(pathSegments.size(), "rawresource:// URI must have exactly one path element, found "));
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            if (TextUtils.isEmpty(normalizeScheme.getHost())) {
                host = context.getPackageName();
            } else {
                host = normalizeScheme.getHost();
            }
            if (host.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(host);
                } catch (PackageManager.NameNotFoundException e4) {
                    throw new zzib("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e4, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = zzk(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(o.k(host, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new zzib("Resource not found.", null, 2005);
                }
            }
        } else {
            throw new zzib(AbstractC2914a.e("Unsupported URI scheme (", normalizeScheme.getScheme(), "). Only android.resource is supported."), null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new zzib("Resource is compressed: ".concat(String.valueOf(normalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e9) {
            throw new zzib(null, e9, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzu
    public final int zza(byte[] bArr, int i9, int i10) throws zzib {
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
                throw new zzib(null, e4, 2000);
            }
        }
        InputStream inputStream = this.zzd;
        int i11 = zzgd.zza;
        int read = inputStream.read(bArr, i9, i10);
        if (read == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new zzib("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j9 = this.zze;
        if (j9 != -1) {
            this.zze = j9 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhh zzhhVar) throws zzib {
        long j7;
        this.zzb = zzhhVar;
        zzi(zzhhVar);
        AssetFileDescriptor zzl = zzl(this.zza, zzhhVar);
        this.zzc = zzl;
        long length = zzl.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        if (length != -1) {
            try {
                if (zzhhVar.zze > length) {
                    throw new zzib(null, null, 2008);
                }
            } catch (zzib e4) {
                throw e4;
            } catch (IOException e9) {
                throw new zzib(null, e9, 2000);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long skip = fileInputStream.skip(zzhhVar.zze + startOffset) - startOffset;
        if (skip == zzhhVar.zze) {
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.zze = -1L;
                    j7 = -1;
                } else {
                    j7 = channel.size() - channel.position();
                    this.zze = j7;
                    if (j7 < 0) {
                        throw new zzib(null, null, 2008);
                    }
                }
            } else {
                j7 = length - skip;
                this.zze = j7;
                if (j7 < 0) {
                    throw new zzhc(2008);
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
        throw new zzib(null, null, 2008);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    @Nullable
    public final Uri zzc() {
        zzhh zzhhVar = this.zzb;
        if (zzhhVar != null) {
            return zzhhVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzib {
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
                    } catch (IOException e4) {
                        throw new zzib(null, e4, 2000);
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
                        throw new zzib(null, e9, 2000);
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
            throw new zzib(null, e10, 2000);
        }
    }
}

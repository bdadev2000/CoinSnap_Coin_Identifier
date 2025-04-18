package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import eb.j;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzhb extends zzfw {
    private final Context zza;

    @Nullable
    private zzgi zzb;

    @Nullable
    private AssetFileDescriptor zzc;

    @Nullable
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzhb(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    private static int zzk(String str) throws zzha {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzha("Resource identifier must be an integer.", null, 1004);
        }
    }

    private static AssetFileDescriptor zzl(Context context, zzgi zzgiVar) throws zzha {
        String host;
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = zzgiVar.zza.normalizeScheme();
        if (TextUtils.equals(RawResourceDataSource.RAW_RESOURCE_SCHEME, normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                identifier = zzk(pathSegments.get(0));
            } else {
                throw new zzha(j.i("rawresource:// URI must have exactly one path element, found ", pathSegments.size()));
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
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new zzha("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e2, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = zzk(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.m(host, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new zzha("Resource not found.", null, 2005);
                }
            }
        } else {
            throw new zzha(e.f("Unsupported URI scheme (", normalizeScheme.getScheme(), "). Only android.resource is supported."), null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new zzha("Resource is compressed: ".concat(String.valueOf(normalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e10) {
            throw new zzha(null, e10, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzn
    public final int zza(byte[] bArr, int i10, int i11) throws zzha {
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
                throw new zzha(null, e2, 2000);
            }
        }
        InputStream inputStream = this.zzd;
        int i12 = zzen.zza;
        int read = inputStream.read(bArr, i10, i11);
        if (read == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new zzha("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j10 = this.zze;
        if (j10 != -1) {
            this.zze = j10 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final long zzb(zzgi zzgiVar) throws zzha {
        long j3;
        this.zzb = zzgiVar;
        zzi(zzgiVar);
        AssetFileDescriptor zzl = zzl(this.zza, zzgiVar);
        this.zzc = zzl;
        long length = zzl.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        if (length != -1) {
            try {
                if (zzgiVar.zze > length) {
                    throw new zzha(null, null, 2008);
                }
            } catch (zzha e2) {
                throw e2;
            } catch (IOException e10) {
                throw new zzha(null, e10, 2000);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long skip = fileInputStream.skip(zzgiVar.zze + startOffset) - startOffset;
        if (skip == zzgiVar.zze) {
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.zze = -1L;
                    j3 = -1;
                } else {
                    j3 = channel.size() - channel.position();
                    this.zze = j3;
                    if (j3 < 0) {
                        throw new zzha(null, null, 2008);
                    }
                }
            } else {
                j3 = length - skip;
                this.zze = j3;
                if (j3 < 0) {
                    throw new zzge(2008);
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
        throw new zzha(null, null, 2008);
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    @Nullable
    public final Uri zzc() {
        zzgi zzgiVar = this.zzb;
        if (zzgiVar != null) {
            return zzgiVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgd
    public final void zzd() throws zzha {
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
                    } catch (IOException e2) {
                        throw new zzha(null, e2, 2000);
                    }
                } catch (IOException e10) {
                    throw new zzha(null, e10, 2000);
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
                throw new zzha(null, e11, 2000);
            }
        }
    }
}

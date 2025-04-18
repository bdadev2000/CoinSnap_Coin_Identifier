package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzsf implements zzsl {

    @Nullable
    private final Context zza;

    @Deprecated
    public zzsf() {
        this.zza = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zztm] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    @Override // com.google.android.gms.internal.ads.zzsl
    public final zzsn zzd(zzsk zzskVar) throws IOException {
        Context context;
        int i10 = zzen.zza;
        if (i10 >= 23 && (i10 >= 31 || ((context = this.zza) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int zzb = zzbg.zzb(zzskVar.zzc.zzo);
            zzdt.zze("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzen.zzD(zzb)));
            zzrv zzrvVar = new zzrv(zzb);
            zzrvVar.zze(true);
            return zzrvVar.zzc(zzskVar);
        }
        MediaCodec mediaCodec = 0;
        mediaCodec = 0;
        try {
            String str = zzskVar.zza.zza;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                Surface surface = zzskVar.zzd;
                int i11 = 0;
                if (surface == null && zzskVar.zza.zzh && i10 >= 35) {
                    i11 = 8;
                }
                createByCodecName.configure(zzskVar.zzb, surface, (MediaCrypto) null, i11);
                Trace.endSection();
                Trace.beginSection("startCodec");
                createByCodecName.start();
                Trace.endSection();
                return new zztn(createByCodecName, zzskVar.zzf, mediaCodec);
            } catch (IOException | RuntimeException e2) {
                e = e2;
                mediaCodec = createByCodecName;
                if (mediaCodec != 0) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (IOException e10) {
            e = e10;
        } catch (RuntimeException e11) {
            e = e11;
        }
    }

    public zzsf(Context context) {
        this.zza = context;
    }
}

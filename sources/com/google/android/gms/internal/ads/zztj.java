package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Trace;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zztj implements zztl {

    @Nullable
    private final Context zzb;

    @Deprecated
    public zztj() {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zztl
    public final zztm zzd(zztk zztkVar) throws IOException {
        Context context;
        int i9 = zzgd.zza;
        if (i9 >= 23 && (i9 >= 31 || ((context = this.zzb) != null && i9 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int zzb = zzcg.zzb(zztkVar.zzc.zzn);
            zzfk.zze("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzgd.zzC(zzb)));
            zzsz zzszVar = new zzsz(zzb);
            zzszVar.zze(true);
            return zzszVar.zzc(zztkVar);
        }
        MediaCodec mediaCodec = null;
        try {
            String str = zztkVar.zza.zza;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                createByCodecName.configure(zztkVar.zzb, zztkVar.zzd, (MediaCrypto) null, 0);
                Trace.endSection();
                Trace.beginSection("startCodec");
                createByCodecName.start();
                Trace.endSection();
                return new zzul(createByCodecName, null);
            } catch (IOException | RuntimeException e4) {
                e = e4;
                mediaCodec = createByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (IOException e9) {
            e = e9;
        } catch (RuntimeException e10) {
            e = e10;
        }
    }

    public zztj(Context context) {
        this.zzb = context;
    }
}

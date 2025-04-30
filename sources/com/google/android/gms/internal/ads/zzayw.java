package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzayw extends zzazs {
    public zzayw(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10) {
        super(zzayeVar, "FLgp79R6LGLnWDio6G1XBjsjORgKSjLkdakyn5bigQludVyQtVZMhDAlppvakfKf", "oPDFFWKd1EuWWR8iem/Fb2LK/5grpy+LhaDBlMcgIHs=", zzatpVar, i9, 24);
    }

    private final void zzc() {
        AdvertisingIdClient zzh = this.zzb.zzh();
        if (zzh != null) {
            try {
                AdvertisingIdClient.Info info = zzh.getInfo();
                String id = info.getId();
                int i9 = zzayh.zza;
                if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                    UUID fromString = UUID.fromString(id);
                    byte[] bArr = new byte[16];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.putLong(fromString.getMostSignificantBits());
                    wrap.putLong(fromString.getLeastSignificantBits());
                    id = zzavo.zza(bArr, true);
                }
                if (id != null) {
                    synchronized (this.zze) {
                        this.zze.zzt(id);
                        this.zze.zzs(info.isLimitAdTrackingEnabled());
                        this.zze.zzu(zzatx.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazs, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzl();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (!this.zzb.zzq()) {
            synchronized (this.zze) {
                this.zze.zzt((String) this.zzf.invoke(null, this.zzb.zzb()));
            }
            return;
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final Void zzl() throws Exception {
        if (this.zzb.zzr()) {
            super.zzl();
            return null;
        }
        if (this.zzb.zzq()) {
            zzc();
        }
        return null;
    }
}

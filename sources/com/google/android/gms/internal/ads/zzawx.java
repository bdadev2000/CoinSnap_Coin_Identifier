package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class zzawx extends zzaxt {
    public zzawx(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11) {
        super(zzawfVar, "I548ixRBwSg+qVTan0l7SrCz1ZaKKX3ZWtyXgu8y1OX29GkbAkB2rT1/ilUIPvFa", "lJ7kzsnnwzWch0Zt9duIk9QjvlIbpzkFDyarwE3sjFc=", zzasfVar, i10, 24);
    }

    private final void zzc() {
        AdvertisingIdClient zzh = this.zza.zzh();
        if (zzh != null) {
            try {
                AdvertisingIdClient.Info info = zzh.getInfo();
                String id2 = info.getId();
                int i10 = zzawi.zza;
                if (id2 != null && id2.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                    UUID fromString = UUID.fromString(id2);
                    byte[] bArr = new byte[16];
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.putLong(fromString.getMostSignificantBits());
                    wrap.putLong(fromString.getLeastSignificantBits());
                    id2 = zzatt.zza(bArr, true);
                }
                if (id2 != null) {
                    synchronized (this.zzd) {
                        this.zzd.zzs(id2);
                        this.zzd.zzr(info.isLimitAdTrackingEnabled());
                        this.zzd.zzab(6);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxt, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (!this.zza.zzq()) {
            synchronized (this.zzd) {
                this.zzd.zzs((String) this.zze.invoke(null, this.zza.zzb()));
            }
            return;
        }
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final Void zzk() throws Exception {
        if (this.zza.zzr()) {
            super.zzk();
            return null;
        }
        if (this.zza.zzq()) {
            zzc();
        }
        return null;
    }
}

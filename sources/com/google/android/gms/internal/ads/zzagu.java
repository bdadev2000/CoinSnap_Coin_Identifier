package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzagu {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzagu() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzagt zzagtVar) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzagtVar.zza);
            String str = zzagtVar.zzb;
            if (str == null) {
                str = "";
            }
            zzb(this.zzb, str);
            this.zzb.writeLong(zzagtVar.zzc);
            this.zzb.writeLong(zzagtVar.zzd);
            this.zzb.write(zzagtVar.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }
}

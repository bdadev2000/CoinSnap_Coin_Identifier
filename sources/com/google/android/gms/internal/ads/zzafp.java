package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zzafp {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzafp() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzafo zzafoVar) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzafoVar.zza);
            String str = zzafoVar.zzb;
            if (str == null) {
                str = "";
            }
            zzb(this.zzb, str);
            this.zzb.writeLong(zzafoVar.zzc);
            this.zzb.writeLong(zzafoVar.zzd);
            this.zzb.write(zzafoVar.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}

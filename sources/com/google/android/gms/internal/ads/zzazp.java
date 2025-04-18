package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
final class zzazp {
    ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    public final String toString() {
        String str;
        try {
            this.zzb.close();
        } catch (IOException e2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("HashManager: Unable to convert to Base64.", e2);
        }
        try {
            try {
                this.zza.close();
                str = this.zza.toString();
            } catch (IOException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("HashManager: Unable to convert to Base64.", e10);
                str = "";
            }
            return str;
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}

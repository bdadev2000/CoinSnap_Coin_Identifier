package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzarv {
    protected static final Comparator zza = new zzaru();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList(64);
    private int zzd = 0;

    public zzarv(int i9) {
    }

    private final synchronized void zzc() {
        while (this.zzd > 4096) {
            byte[] bArr = (byte[]) this.zzb.remove(0);
            this.zzc.remove(bArr);
            this.zzd -= bArr.length;
        }
    }

    public final synchronized void zza(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.zzb.add(bArr);
                int binarySearch = Collections.binarySearch(this.zzc, bArr, zza);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.zzc.add(binarySearch, bArr);
                this.zzd += length;
                zzc();
            }
        }
    }

    public final synchronized byte[] zzb(int i9) {
        for (int i10 = 0; i10 < this.zzc.size(); i10++) {
            byte[] bArr = (byte[]) this.zzc.get(i10);
            int length = bArr.length;
            if (length >= i9) {
                this.zzd -= length;
                this.zzc.remove(i10);
                this.zzb.remove(bArr);
                return bArr;
            }
        }
        return new byte[i9];
    }
}

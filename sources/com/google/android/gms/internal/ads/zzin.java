package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class zzin extends zzih {

    @Nullable
    public zzan zza;
    public final zzik zzb = new zzik();

    @Nullable
    public ByteBuffer zzc;
    public boolean zzd;
    public long zze;

    @Nullable
    public ByteBuffer zzf;
    private final int zzg;

    static {
        zzbv.zzb("media3.decoder");
    }

    public zzin(int i9, int i10) {
        this.zzg = i9;
    }

    private final ByteBuffer zzl(int i9) {
        int capacity;
        int i10 = this.zzg;
        if (i10 == 1) {
            return ByteBuffer.allocate(i9);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i9);
        }
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new zzim(capacity, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public void zzb() {
        super.zzb();
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.zzd = false;
    }

    public final void zzi(int i9) {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer == null) {
            this.zzc = zzl(i9);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i10 = i9 + position;
        if (capacity >= i10) {
            this.zzc = byteBuffer;
            return;
        }
        ByteBuffer zzl = zzl(i10);
        zzl.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            zzl.put(byteBuffer);
        }
        this.zzc = zzl;
    }

    public final void zzj() {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean zzk() {
        return zzd(1073741824);
    }
}

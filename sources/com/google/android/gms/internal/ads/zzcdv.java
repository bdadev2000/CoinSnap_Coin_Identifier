package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class zzcdv {
    private static final AtomicInteger zza = new AtomicInteger(0);
    private static final AtomicInteger zzb = new AtomicInteger(0);

    public static AtomicInteger zzD() {
        return zza;
    }

    public static AtomicInteger zzE() {
        return zzb;
    }

    public static int zzs() {
        return zza.get();
    }

    public static int zzu() {
        return zzb.get();
    }

    public abstract long zzA();

    public abstract long zzB();

    @Nullable
    public abstract Integer zzC();

    public abstract void zzF(Uri[] uriArr, String str);

    public abstract void zzG(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z8);

    public abstract void zzH();

    public abstract void zzI(long j7);

    public abstract void zzJ(int i9);

    public abstract void zzK(int i9);

    public abstract void zzL(zzcdu zzcduVar);

    public abstract void zzM(int i9);

    public abstract void zzN(int i9);

    public abstract void zzO(boolean z8);

    public abstract void zzP(@Nullable Integer num);

    public abstract void zzQ(boolean z8);

    public abstract void zzR(int i9);

    public abstract void zzS(Surface surface, boolean z8) throws IOException;

    public abstract void zzT(float f9, boolean z8) throws IOException;

    public abstract void zzU();

    public abstract boolean zzV();

    public abstract int zzr();

    public abstract int zzt();

    public abstract long zzv();

    public abstract long zzw();

    public abstract long zzx();

    public abstract long zzy();

    public abstract long zzz();
}

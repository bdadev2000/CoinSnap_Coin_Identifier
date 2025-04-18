package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public interface zzccf extends zzcgw, zzcgz, zzbmm {
    Context getContext();

    void setBackgroundColor(int i10);

    void zzA(int i10);

    void zzB(int i10);

    void zzC(zzcgm zzcgmVar);

    String zzdi();

    int zzf();

    int zzg();

    int zzh();

    @Nullable
    Activity zzi();

    @Nullable
    com.google.android.gms.ads.internal.zza zzj();

    @Nullable
    zzbcz zzk();

    zzbda zzm();

    VersionInfoParcel zzn();

    @Nullable
    zzcbu zzo();

    @Nullable
    zzcdr zzp(String str);

    @Nullable
    zzcgm zzq();

    @Nullable
    String zzr();

    void zzt(String str, zzcdr zzcdrVar);

    void zzu();

    void zzv(boolean z10, long j3);

    void zzw();

    void zzx(int i10);

    void zzy(int i10);

    void zzz(boolean z10);
}

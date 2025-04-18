package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes3.dex */
public interface zzccj extends zzcha, zzchd, zzbmr {
    Context getContext();

    void setBackgroundColor(int i2);

    void zzA(int i2);

    void zzB(int i2);

    void zzC(zzcgq zzcgqVar);

    String zzdi();

    int zzf();

    int zzg();

    int zzh();

    @Nullable
    Activity zzi();

    @Nullable
    com.google.android.gms.ads.internal.zza zzj();

    @Nullable
    zzbdh zzk();

    zzbdi zzm();

    VersionInfoParcel zzn();

    @Nullable
    zzcby zzo();

    @Nullable
    zzcdv zzp(String str);

    @Nullable
    zzcgq zzq();

    @Nullable
    String zzr();

    void zzt(String str, zzcdv zzcdvVar);

    void zzu();

    void zzv(boolean z2, long j2);

    void zzw();

    void zzx(int i2);

    void zzy(int i2);

    void zzz(boolean z2);
}

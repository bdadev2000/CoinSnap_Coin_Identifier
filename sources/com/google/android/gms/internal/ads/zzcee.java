package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes2.dex */
public interface zzcee extends zzcip, zzcis, zzbok {
    Context getContext();

    void setBackgroundColor(int i9);

    void zzA(int i9);

    void zzB(int i9);

    void zzC(zzcif zzcifVar);

    String zzdi();

    int zzf();

    int zzg();

    int zzh();

    @Nullable
    Activity zzi();

    @Nullable
    com.google.android.gms.ads.internal.zza zzj();

    @Nullable
    zzbfb zzk();

    zzbfc zzm();

    VersionInfoParcel zzn();

    @Nullable
    zzcdt zzo();

    @Nullable
    zzcfp zzp(String str);

    @Nullable
    zzcif zzq();

    @Nullable
    String zzr();

    void zzt(String str, zzcfp zzcfpVar);

    void zzu();

    void zzv(boolean z8, long j7);

    void zzw();

    void zzx(int i9);

    void zzy(int i9);

    void zzz(boolean z8);
}

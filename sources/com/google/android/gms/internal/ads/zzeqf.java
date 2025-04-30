package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzeqf implements zzexw {
    private final zzgge zza;
    private final zzgge zzb;
    private final Context zzc;
    private final zzfho zzd;

    @Nullable
    private final View zze;

    public zzeqf(zzgge zzggeVar, zzgge zzggeVar2, Context context, zzfho zzfhoVar, @Nullable ViewGroup viewGroup) {
        this.zza = zzggeVar;
        this.zzb = zzggeVar2;
        this.zzc = context;
        this.zzd = zzfhoVar;
        this.zze = viewGroup;
    }

    private final List zze() {
        int i9;
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            if (parent instanceof ViewGroup) {
                i9 = ((ViewGroup) parent).indexOfChild(view);
            } else {
                i9 = -1;
            }
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", i9);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        zzbep.zza(this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzla)).booleanValue()) {
            return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzeqf.this.zzc();
                }
            });
        }
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqf.this.zzd();
            }
        });
    }

    public final /* synthetic */ zzeqg zzc() throws Exception {
        return new zzeqg(this.zzc, this.zzd.zze, zze());
    }

    public final /* synthetic */ zzeqg zzd() throws Exception {
        return new zzeqg(this.zzc, this.zzd.zze, zze());
    }
}

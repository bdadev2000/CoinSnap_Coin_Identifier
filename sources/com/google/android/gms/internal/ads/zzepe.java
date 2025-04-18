package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzepe implements zzexh {
    private final zzgfz zza;
    private final zzgfz zzb;
    private final Context zzc;
    private final zzfhc zzd;

    @Nullable
    private final View zze;

    public zzepe(zzgfz zzgfzVar, zzgfz zzgfzVar2, Context context, zzfhc zzfhcVar, @Nullable ViewGroup viewGroup) {
        this.zza = zzgfzVar;
        this.zzb = zzgfzVar2;
        this.zzc = context;
        this.zzd = zzfhcVar;
        this.zze = viewGroup;
    }

    private final List zze() {
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        zzbcv.zza(this.zzc);
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkI)).booleanValue() ? this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepe.this.zzc();
            }
        }) : this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepe.this.zzd();
            }
        });
    }

    public final /* synthetic */ zzepf zzc() throws Exception {
        return new zzepf(this.zzc, this.zzd.zze, zze());
    }

    public final /* synthetic */ zzepf zzd() throws Exception {
        return new zzepf(this.zzc, this.zzd.zze, zze());
    }
}

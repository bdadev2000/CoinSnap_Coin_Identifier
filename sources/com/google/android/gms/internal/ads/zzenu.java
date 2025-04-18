package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzenu implements zzevz {
    private final zzges zza;
    private final Context zzb;
    private final zzffo zzc;

    @Nullable
    private final View zzd;

    public zzenu(zzges zzgesVar, Context context, zzffo zzffoVar, @Nullable ViewGroup viewGroup) {
        this.zza = zzgesVar;
        this.zzb = context;
        this.zzc = zzffoVar;
        this.zzd = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        zzbcn.zza(this.zzb);
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzent
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzenu.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzenv zzc() throws Exception {
        int i10;
        ArrayList arrayList = new ArrayList();
        View view = this.zzd;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            if (parent instanceof ViewGroup) {
                i10 = ((ViewGroup) parent).indexOfChild(view);
            } else {
                i10 = -1;
            }
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", i10);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzenv(this.zzb, this.zzc.zze, arrayList);
    }
}

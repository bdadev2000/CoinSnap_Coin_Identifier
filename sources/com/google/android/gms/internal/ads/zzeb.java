package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class zzeb {

    @Nullable
    private static zzeb zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    private int zze = 0;

    private zzeb(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzdz(this, null), intentFilter);
    }

    public static synchronized zzeb zzb(Context context) {
        zzeb zzebVar;
        synchronized (zzeb.class) {
            if (zza == null) {
                zza = new zzeb(context);
            }
            zzebVar = zza;
        }
        return zzebVar;
    }

    public static /* synthetic */ void zzc(zzeb zzebVar, int i10) {
        synchronized (zzebVar.zzd) {
            if (zzebVar.zze == i10) {
                return;
            }
            zzebVar.zze = i10;
            Iterator it = zzebVar.zzc.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zzyt zzytVar = (zzyt) weakReference.get();
                if (zzytVar != null) {
                    zzytVar.zza.zzl(i10);
                } else {
                    zzebVar.zzc.remove(weakReference);
                }
            }
        }
    }

    public final int zza() {
        int i10;
        synchronized (this.zzd) {
            i10 = this.zze;
        }
        return i10;
    }

    public final void zzd(final zzyt zzytVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzytVar));
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdx
            @Override // java.lang.Runnable
            public final void run() {
                zzytVar.zza.zzl(zzeb.this.zza());
            }
        });
    }
}

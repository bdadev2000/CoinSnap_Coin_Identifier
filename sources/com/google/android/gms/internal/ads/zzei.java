package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class zzei {

    @Nullable
    private static zzei zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();

    @GuardedBy
    private int zze = 0;

    private zzei(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzeh(this, null), intentFilter);
    }

    public static synchronized zzei zzb(Context context) {
        zzei zzeiVar;
        synchronized (zzei.class) {
            try {
                if (zza == null) {
                    zza = new zzei(context);
                }
                zzeiVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzeiVar;
    }

    public static /* synthetic */ void zzc(zzei zzeiVar, int i2) {
        synchronized (zzeiVar.zzd) {
            try {
                if (zzeiVar.zze == i2) {
                    return;
                }
                zzeiVar.zze = i2;
                Iterator it = zzeiVar.zzc.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    zzzb zzzbVar = (zzzb) weakReference.get();
                    if (zzzbVar != null) {
                        zzzbVar.zza.zzl(i2);
                    } else {
                        zzeiVar.zzc.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zza() {
        int i2;
        synchronized (this.zzd) {
            i2 = this.zze;
        }
        return i2;
    }

    public final void zzd(final zzzb zzzbVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzzbVar));
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzee
            @Override // java.lang.Runnable
            public final void run() {
                zzzbVar.zza.zzl(zzei.this.zza());
            }
        });
    }
}

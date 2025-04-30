package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class zzfs {

    @Nullable
    private static zzfs zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    private int zze = 0;

    private zzfs(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzfr(this, null), intentFilter);
    }

    public static synchronized zzfs zzb(Context context) {
        zzfs zzfsVar;
        synchronized (zzfs.class) {
            try {
                if (zza == null) {
                    zza = new zzfs(context);
                }
                zzfsVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfsVar;
    }

    public static /* synthetic */ void zzc(zzfs zzfsVar, int i9) {
        synchronized (zzfsVar.zzd) {
            try {
                if (zzfsVar.zze == i9) {
                    return;
                }
                zzfsVar.zze = i9;
                Iterator it = zzfsVar.zzc.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    zzzw zzzwVar = (zzzw) weakReference.get();
                    if (zzzwVar != null) {
                        zzzwVar.zza.zzk(i9);
                    } else {
                        zzfsVar.zzc.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zza() {
        int i9;
        synchronized (this.zzd) {
            i9 = this.zze;
        }
        return i9;
    }

    public final void zzd(final zzzw zzzwVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzzwVar));
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfo
            @Override // java.lang.Runnable
            public final void run() {
                zzzwVar.zza.zzk(zzfs.this.zza());
            }
        });
    }
}

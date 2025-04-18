package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes3.dex */
public abstract class zzauy implements zzaux {
    protected static volatile zzawf zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;

    @Nullable
    protected zzavx zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    public zzauy(Context context) {
        try {
            zzaua.zze();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcS)).booleanValue()) {
                this.zzr = new zzavx();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzm() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (!this.zzc.isEmpty()) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        } else {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        this.zzb = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String zzp(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzauy.zzp(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    public abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzavv;

    public abstract zzasf zzb(Context context, View view, Activity activity);

    public abstract zzasf zzc(Context context, zzars zzarsVar);

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzd(Context context, @Nullable String str, @Nullable View view) {
        return zzp(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zze(Context context, @Nullable String str, @Nullable View view, @Nullable Activity activity) {
        return zzp(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzf(Context context) {
        if (!zzawi.zzc()) {
            return zzp(context, null, 1, null, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzg(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final String zzh(Context context, @Nullable View view, @Nullable Activity activity) {
        return zzp(context, null, 2, view, activity, null);
    }

    public abstract zzasf zzi(Context context, View view, Activity activity);

    public abstract zzawh zzj(MotionEvent motionEvent) throws zzavv;

    @Override // com.google.android.gms.internal.ads.zzaux
    public final synchronized void zzk(@Nullable MotionEvent motionEvent) {
        Long l10;
        if (this.zzu) {
            zzm();
            this.zzu = false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d10 = rawX - this.zzs;
                double d11 = rawY - this.zzt;
                this.zzk += Math.sqrt((d11 * d11) + (d10 * d10));
                this.zzs = rawX;
                this.zzt = rawY;
            }
        } else {
            this.zzk = 0.0d;
            this.zzs = motionEvent.getRawX();
            this.zzt = motionEvent.getRawY();
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 != 1) {
                    if (action2 != 2) {
                        if (action2 == 3) {
                            this.zzg++;
                        }
                    } else {
                        this.zze += motionEvent.getHistorySize() + 1;
                        zzawh zzj = zzj(motionEvent);
                        Long l11 = zzj.zzd;
                        if (l11 != null && zzj.zzg != null) {
                            this.zzi = l11.longValue() + zzj.zzg.longValue() + this.zzi;
                        }
                        if (this.zzq != null && (l10 = zzj.zze) != null && zzj.zzh != null) {
                            this.zzj = l10.longValue() + zzj.zzh.longValue() + this.zzj;
                        }
                    }
                } else {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.zzb = obtain;
                    this.zzc.add(obtain);
                    if (this.zzc.size() > 6) {
                        ((MotionEvent) this.zzc.remove()).recycle();
                    }
                    this.zzf++;
                    this.zzh = zza(new Throwable().getStackTrace());
                }
            } catch (zzavv unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final synchronized void zzl(int i10, int i11, int i12) {
        if (this.zzb != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcD)).booleanValue()) {
                zzm();
            } else {
                this.zzb.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzq;
        if (displayMetrics != null) {
            float f10 = displayMetrics.density;
            this.zzb = MotionEvent.obtain(0L, i12, 1, i10 * f10, i11 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzb = null;
        }
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzavx zzavxVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcS)).booleanValue() && (zzavxVar = this.zzr) != null) {
            zzavxVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaux
    public void zzo(View view) {
    }
}

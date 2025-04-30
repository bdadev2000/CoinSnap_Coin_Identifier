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

/* loaded from: classes2.dex */
public abstract class zzaxa implements zzawz {
    protected static volatile zzaye zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;

    @Nullable
    protected zzaxw zzr;
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

    public zzaxa(Context context) {
        try {
            zzavs.zze();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcH)).booleanValue()) {
                this.zzr = new zzaxw();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzj() {
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

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String zzm(android.content.Context r20, java.lang.String r21, int r22, android.view.View r23, android.app.Activity r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxa.zzm(android.content.Context, java.lang.String, int, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    public abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzaxu;

    public abstract zzatp zzb(Context context, View view, Activity activity);

    public abstract zzatp zzc(Context context, zzatg zzatgVar);

    public abstract zzatp zzd(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zze(Context context, @Nullable String str, @Nullable View view) {
        return zzm(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzf(Context context, @Nullable String str, @Nullable View view, @Nullable Activity activity) {
        return zzm(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzg(Context context) {
        if (!zzayh.zzc()) {
            return zzm(context, null, 1, null, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final String zzh(Context context, @Nullable View view, @Nullable Activity activity) {
        return zzm(context, null, 2, view, activity, null);
    }

    public abstract zzayg zzi(MotionEvent motionEvent) throws zzaxu;

    @Override // com.google.android.gms.internal.ads.zzawz
    public final synchronized void zzk(@Nullable MotionEvent motionEvent) {
        Long l;
        try {
            if (this.zzu) {
                zzj();
                this.zzu = false;
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 2) {
                    double rawX = motionEvent.getRawX();
                    double rawY = motionEvent.getRawY();
                    double d2 = rawX - this.zzs;
                    double d9 = rawY - this.zzt;
                    this.zzk += Math.sqrt((d9 * d9) + (d2 * d2));
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
                            zzayg zzi = zzi(motionEvent);
                            Long l2 = zzi.zzd;
                            if (l2 != null && zzi.zzg != null) {
                                this.zzi = l2.longValue() + zzi.zzg.longValue() + this.zzi;
                            }
                            if (this.zzq != null && (l = zzi.zze) != null && zzi.zzh != null) {
                                this.zzj = l.longValue() + zzi.zzh.longValue() + this.zzj;
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
                } catch (zzaxu unused) {
                }
            } else {
                this.zzl = motionEvent.getX();
                this.zzm = motionEvent.getY();
                this.zzn = motionEvent.getRawX();
                this.zzo = motionEvent.getRawY();
                this.zzd++;
            }
            this.zzp = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final synchronized void zzl(int i9, int i10, int i11) {
        try {
            if (this.zzb != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcx)).booleanValue()) {
                    zzj();
                } else {
                    this.zzb.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.zzq;
            if (displayMetrics != null) {
                float f9 = displayMetrics.density;
                this.zzb = MotionEvent.obtain(0L, i11, 1, i9 * f9, i10 * f9, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.zzb = null;
            }
            this.zzp = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaxw zzaxwVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcH)).booleanValue() && (zzaxwVar = this.zzr) != null) {
            zzaxwVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public void zzo(View view) {
    }
}

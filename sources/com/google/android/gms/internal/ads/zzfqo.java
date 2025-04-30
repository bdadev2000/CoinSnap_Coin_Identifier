package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzfqo implements zzfpn {
    private static final zzfqo zza = new zzfqo();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfqk();
    private static final Runnable zze = new zzfql();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfqh zzk = new zzfqh();
    private final zzfpp zzj = new zzfpp();
    private final zzfqi zzl = new zzfqi(new zzfqr());

    public static zzfqo zzd() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzfqo zzfqoVar) {
        zzfqoVar.zzg = 0;
        zzfqoVar.zzi.clear();
        zzfqoVar.zzh = false;
        for (zzfon zzfonVar : zzfpe.zza().zzb()) {
        }
        zzfqoVar.zzm = System.nanoTime();
        zzfqoVar.zzk.zzi();
        long nanoTime = System.nanoTime();
        zzfpo zza2 = zzfqoVar.zzj.zza();
        if (zzfqoVar.zzk.zze().size() > 0) {
            Iterator it = zzfqoVar.zzk.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject zza3 = zza2.zza(null);
                View zza4 = zzfqoVar.zzk.zza(str);
                zzfpo zzb2 = zzfqoVar.zzj.zzb();
                String zzc2 = zzfqoVar.zzk.zzc(str);
                if (zzc2 != null) {
                    JSONObject zza5 = zzb2.zza(zza4);
                    zzfpy.zzb(zza5, str);
                    try {
                        zza5.put("notVisibleReason", zzc2);
                    } catch (JSONException e4) {
                        zzfpz.zza("Error with setting not visible reason", e4);
                    }
                    zzfpy.zzc(zza3, zza5);
                }
                zzfpy.zzf(zza3);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfqoVar.zzl.zzc(zza3, hashSet, nanoTime);
            }
        }
        if (zzfqoVar.zzk.zzf().size() > 0) {
            JSONObject zza6 = zza2.zza(null);
            zzfqoVar.zzk(null, zza2, zza6, 1, false);
            zzfpy.zzf(zza6);
            zzfqoVar.zzl.zzd(zza6, zzfqoVar.zzk.zzf(), nanoTime);
        } else {
            zzfqoVar.zzl.zzb();
        }
        zzfqoVar.zzk.zzg();
        long nanoTime2 = System.nanoTime() - zzfqoVar.zzm;
        if (zzfqoVar.zzf.size() > 0) {
            for (zzfqn zzfqnVar : zzfqoVar.zzf) {
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                zzfqnVar.zzb();
                if (zzfqnVar instanceof zzfqm) {
                    ((zzfqm) zzfqnVar).zza();
                }
            }
        }
    }

    private final void zzk(View view, zzfpo zzfpoVar, JSONObject jSONObject, int i9, boolean z8) {
        boolean z9 = true;
        if (i9 != 1) {
            z9 = false;
        }
        zzfpoVar.zzb(view, jSONObject, this, z9, z8);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfpn
    public final void zza(View view, zzfpo zzfpoVar, JSONObject jSONObject, boolean z8) {
        int zzk;
        boolean z9;
        boolean z10;
        if (zzfqe.zza(view) == null && (zzk = this.zzk.zzk(view)) != 3) {
            JSONObject zza2 = zzfpoVar.zza(view);
            zzfpy.zzc(jSONObject, zza2);
            String zzd2 = this.zzk.zzd(view);
            if (zzd2 != null) {
                zzfpy.zzb(zza2, zzd2);
                try {
                    zza2.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzj(view)));
                } catch (JSONException e4) {
                    zzfpz.zza("Error with setting has window focus", e4);
                }
                this.zzk.zzh();
            } else {
                zzfqg zzb2 = this.zzk.zzb(view);
                if (zzb2 != null) {
                    zzfph zza3 = zzb2.zza();
                    JSONArray jSONArray = new JSONArray();
                    ArrayList zzb3 = zzb2.zzb();
                    int size = zzb3.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        jSONArray.put((String) zzb3.get(i9));
                    }
                    try {
                        zza2.put("isFriendlyObstructionFor", jSONArray);
                        zza2.put("friendlyObstructionClass", zza3.zzd());
                        zza2.put("friendlyObstructionPurpose", zza3.zza());
                        zza2.put("friendlyObstructionReason", zza3.zzc());
                    } catch (JSONException e9) {
                        zzfpz.zza("Error with setting friendly obstruction", e9);
                    }
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z8 || z9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzk(view, zzfpoVar, zza2, zzk, z10);
            }
            this.zzg++;
        }
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfqj(this));
    }
}

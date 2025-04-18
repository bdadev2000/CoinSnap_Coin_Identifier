package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class zzava extends zzauy {
    private static zzawg zzA = null;
    private static zzatx zzB = null;
    private static zzavf zzC = null;
    protected static final Object zzs = new Object();
    static boolean zzt = false;
    private static final String zzw = "zzava";
    private static long zzx;
    private static zzavi zzy;
    private static zzawo zzz;
    private final Map zzD;
    protected final zzauz zzu;
    zzawm zzv;

    public zzava(Context context, zzauz zzauzVar) {
        super(context);
        this.zzD = new HashMap();
        this.zzu = zzauzVar;
    }

    public static zzawf zzm(Context context, boolean z10) {
        if (zzauy.zza == null) {
            synchronized (zzs) {
                if (zzauy.zza == null) {
                    zzawf zzg = zzawf.zzg(context, "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", z10, zzC);
                    if (zzg.zzr()) {
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdr)).booleanValue()) {
                                zzg.zzt("xQZWBq9vk61gkKJ32GpzDEdh30ofICkb4tSa2DpYYSXjQuwXyD8GUWGym8lMJ+dF", "bIJcfftBOk0kpDuDA++0Eu/pVws1RwKw1eDUIOrZKTA=", new Class[0]);
                            }
                        } catch (IllegalStateException unused) {
                        }
                        zzg.zzt("I548ixRBwSg+qVTan0l7SrCz1ZaKKX3ZWtyXgu8y1OX29GkbAkB2rT1/ilUIPvFa", "lJ7kzsnnwzWch0Zt9duIk9QjvlIbpzkFDyarwE3sjFc=", Context.class);
                        zzg.zzt("lIDPVUPkMEk1KnSIojzWRzc28dDnPbiGtgyxpW7TpbmhRjdqd91I/FiR+wuEiwMR", "KJxrJ6uU/9eq7G+RMyslIXmSG1J2c6lM89WgXCr+3Fk=", Context.class);
                        zzg.zzt("p2B6bhXfJZNgZ0+I4L4c9cLXJrfGeKZvoxHbzoRookWEJhhW5Gvimq5QvTg4oqLM", "wcFaDbS//5pJ1R+WEpFF/o7BDXsIcxPrCZPKL326+18=", Context.class);
                        zzg.zzt("GvR+eAwGnG9v3CGqMDhazUVumHdJLt60TSBx5Df5j9bg+ZMppmesgixP833S80RN", "cPmD560wQtvtgfdpMZNJUfXZwJNhRKcjeHNf5LBrqDo=", Context.class);
                        zzg.zzt("itZtoNFCmMg/dWjmiBIlGGLU2K9YPpOnkfWPvJRQsBTuwkRvFkAFf21f0YW4IJqS", "Vl0tGZUP9VgyaB044qzcR6APHL2v0rcSEKKrSSyljVU=", Context.class);
                        Class cls = Boolean.TYPE;
                        zzg.zzt("5M/doPlP18zj3rcFgQUszE+WSqXh/st9yUF5JdFdktMd87cDlxgzyepiU5bej2uF", "KwLCo2LsichRi68Y4oRLpNy6fN1z6Wq88wujVx/pAjo=", Context.class, cls);
                        zzg.zzt("88ETcPLh1JYg+nQ5zdwp+6acsWFKzCMthjLOw7XatJOMkLvYw0fl0jJT3ig1Ktkw", "AW0WUdAlySbPNJG5w1IgQqYKXV7WN2hB/EQpNB2ZwfA=", Context.class);
                        zzg.zzt("cASF9v3LVjFjcts3pzkxEpbZ/yZ0Z6rgUJw8wYZADCZYBHbsegUqurxqMOQQnwLa", "YV8d9qma0OL6XD+53oet9uRH00OzaYnpRo+iusl6DCM=", Context.class);
                        zzg.zzt("sRvs7rrxgUqnt6rOYz625yim51I2BBWZtfI/VjF2kvlR7oyE9ojjxvT7968cQJmj", "2zpK8lkEAfKzg/gDLwTAvNZ5YGoTWj1Wvd9h3pQ20cY=", MotionEvent.class, DisplayMetrics.class);
                        zzg.zzt("64tg62Bex3MDquRtmlQJPk4NiwafsyFvyB+21DTcQv1umB8E7zvmXw8BDjm+e08c", "Bw1THEoW7bQ3OtU3uQYqnJGIWksyztmdRETM6M6rWV4=", MotionEvent.class, DisplayMetrics.class);
                        zzg.zzt("TJ62ujRRBjJb9/NqrT2Pn0c6KFZY0SF6EjGcQMXtIVccZGktu9G9qu0AxWBd9HPE", "SO84xWj1xZpVST0NHeOw+QMypPAPo6e/MVLMJbQH2M4=", new Class[0]);
                        zzg.zzt("Gni4qgp+h6AcoKfZop5I8lc+tIkw2ZH05xPrrmCfcSRn195BLh5fanbj8t/tK60H", "w5p59RLEy51WEx7/xjLAr1+9bhgJEvrJ/0voomQz2z8=", new Class[0]);
                        zzg.zzt("PDdqBkuC/wlZj3D1GonYQW5lEcio5HWZDbvjL/QlEgG/4K0ExN3jw7lwkOOq3/t+", "G3wZ8gDu6u4efTKrvmsEHv1YK8hQgMyBIdhh8ClIQBY=", new Class[0]);
                        zzg.zzt("vHxl3/k7agNEaOAb+kiexrLMKd/tl26b7leOgQmEqvHEdvK4RjfXtH7j4TmF8OsM", "1y55K+UUiCchaHGitlZ/bNKURNzH22lnMjmt1W+XJdc=", new Class[0]);
                        zzg.zzt("pqNjV8dx1XFj9T4LMPQEa0a19I+nsD8Qxz2fQuehDPd98Kfq+TQkVREvoUEgFPtf", "v02B7neKpYyNwQtluXNrII6UZlY2WS0o0AnaqwUmhpo=", new Class[0]);
                        zzg.zzt("p9pmeac90yMVCcN4sojWc0dcIOIcXaFrjT0spFQThk7HqJv1zzltubfYUBxGBSKx", "zyTzUjCmOTi6owBt6QTGC9Xa/1geFdM1/vAgrH362Ug=", new Class[0]);
                        zzg.zzt("C5H7nTBN4nltmNau+/MNt6CSB0fOzxeNv8MDz6xiw5iQrv1d68C/G+ooekFvBfaF", "+RUwiCqrIcStaeiSXRFEyI1zJGWpibshqhmF48hI+GU=", Context.class, cls, String.class);
                        zzg.zzt("XiB4JwXCMuAhsrPKvk3dS2LvKyxjCmXSaJ2VZGWg6jlAdLRjKnhTMhSQBaeXXZDY", "3gV4tnMlvvkjR90RI+zlkPr5OOXNb6rIM0OBAfjFnhQ=", StackTraceElement[].class);
                        zzg.zzt("gU8TtHMsoUkPWKRp4pchlMiybbWQk/XZmErfUYdY8xYZMhv+DT5EJrcXuMdR9TAB", "MCymTm++OZPusG19DHbi/CZ9AvqE5ZBPeRnjpDHc8+4=", View.class, DisplayMetrics.class, cls, cls);
                        zzg.zzt("XUlbwsRmHSawbobvdBjnb2xctdVbPfXMEVEnXNMe2hHlLaCP55dgLdHMQ+hYM/7L", "7XeVq1bS2Nfqusn9ZkJuz3JHMvM2X4C8Onql6XjPnDI=", Context.class, cls);
                        zzg.zzt("s0uE9hdlawP+tYGHYSI6i0EWhWy7Tdc9XW5A0finsHWGrmLjBRDuDmlHo7fmD8mf", "0+4i1BfON/tZfr/zJSlwHIdubE7ug8Met8dVp0E6y4I=", View.class, Activity.class, cls);
                        zzg.zzt("Atq0HLNiKHjz80ZnAFWvUPfMlGQHg7AXdMxxDL1JZ6bmQmTFxmAmKhIDk2Jnayuk", "Su/GzywZakXq4glBT/l81JrPkq4+JC0EaqCjCuVscxM=", Long.TYPE);
                        zzg.zzt("ixYfTYsdoNOUTNdQh/wT/2cJJ79pJ44MoQEAe7G5x6Iqy1F1xj2tWQNOQTIxtV7u", "WP0A/iiJ0kwZaUHwj1D1bpbR/N680LqPRhfJ3Mm7j/s=", new Class[0]);
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdu)).booleanValue()) {
                                zzg.zzt("znXH0RM1XxCTrwmP7d8xA6zmeZad4bsyeawjZRDuwEtKXTURGEnX+tv9VD8MEWrm", "W+zVAKx2eduhDPC6RoJgOXSegMcVlCiHMJF4lAq9BYw=", Context.class);
                            }
                        } catch (IllegalStateException unused2) {
                        }
                        zzg.zzt("QTLjHUsVFKXbBRd8imFe1ItVED7lwP3GXo5B6G2k1qI6ZE9LVZiLueNqbEPdYpXv", "L3fqGrpQIz2+lJDWzlSbCxhzTWa8jmNDfQhrqUdlO7E=", Context.class);
                        try {
                            if (Build.VERSION.SDK_INT >= 26) {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdv)).booleanValue()) {
                                    Class cls2 = Long.TYPE;
                                    zzg.zzt("TEuVeGvhlSIXkgQOkIrP3/M5xn08Noea2HjGio+2r03gBpanfVd2G9lK+KoDXH2T", "AA74eMHsp6+YeXgwW1ug4iNz8R55KIvaQAvJIVOChCk=", NetworkCapabilities.class, cls2, cls2);
                                }
                            }
                        } catch (IllegalStateException unused3) {
                        }
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcS)).booleanValue()) {
                                zzg.zzt("InzZioUCViOMoBpQHwvu/pIx3gXrXGOaM2JpzEjvxDIhnjzi/kaCZRYG9Kg1JwVe", "n5HdSerkTAgTJwRh00NQA14abEqPXtGNhLU/oVUfpWQ=", List.class);
                            }
                        } catch (IllegalStateException unused4) {
                        }
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcL)).booleanValue()) {
                                Class cls3 = Long.TYPE;
                                zzg.zzt("F3b/A5v6wf4vIgkFPpHbBE4QF+7kAwNXBYNdW+58EM84yoPYR42ji8mEXh7tsTu8", "0hPI01hyl9gRqyFiGkD5f6txe9kPcrO1Amh2RTTvv44=", cls3, cls3, cls3, cls3);
                            }
                        } catch (IllegalStateException unused5) {
                        }
                        try {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcK)).booleanValue()) {
                                zzg.zzt("SSi9+bc4LjSDCw5XbM9a3o0KjM00NEx8AzpqWTmGrN6ZCy4DwzQ9YQ8F3uOviR+R", "vovSRMWoC6DyReNhMsLU/AHhR3bWlWI4SOQQixDW2Zg=", long[].class, Context.class, View.class);
                            }
                        } catch (IllegalStateException unused6) {
                        }
                    }
                    zzauy.zza = zzg;
                }
            }
        }
        return zzauy.zza;
    }

    public static zzawh zzp(zzawf zzawfVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) throws zzavv {
        Method zzj = zzawfVar.zzj("sRvs7rrxgUqnt6rOYz625yim51I2BBWZtfI/VjF2kvlR7oyE9ojjxvT7968cQJmj", "2zpK8lkEAfKzg/gDLwTAvNZ5YGoTWj1Wvd9h3pQ20cY=");
        if (zzj != null && motionEvent != null) {
            try {
                return new zzawh((String) zzj.invoke(null, motionEvent, displayMetrics));
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new zzavv(e2);
            }
        }
        throw new zzavv();
    }

    public static synchronized void zzs(Context context, zzauz zzauzVar) {
        synchronized (zzava.class) {
            if (!zzt) {
                zzx = System.currentTimeMillis() / 1000;
                zzauy.zza = zzm(context, zzauzVar.zza);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdv)).booleanValue()) {
                    zzy = zzavi.zzc(context);
                }
                ExecutorService zzk = zzauy.zza.zzk();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdw)).booleanValue() && zzk != null) {
                    zzz = zzawo.zzd(context, zzk);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcL)).booleanValue()) {
                    zzA = new zzawg();
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcQ)).booleanValue()) {
                    zzC = new zzavf(context, zzk);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcM)).booleanValue() || zzauzVar.zzc.zzg()) {
                    zzB = new zzatx(context, zzk, zzauzVar.zzc, zzC);
                }
                zzt = true;
            }
        }
    }

    public static final void zzt(List list) {
        ExecutorService zzk;
        if (zzauy.zza != null && (zzk = zzauy.zza.zzk()) != null && !list.isEmpty()) {
            try {
                zzk.invokeAll(list, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcG)).longValue(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                String str = zzw;
                StringWriter stringWriter = new StringWriter();
                e2.printStackTrace(new PrintWriter(stringWriter));
                Log.d(str, String.format("class methods got exception: %s", stringWriter.toString()));
            }
        }
    }

    private final synchronized void zzu(zzawf zzawfVar, zzasf zzasfVar) {
        Long l10;
        int i10;
        MotionEvent motionEvent;
        try {
            zzawh zzp = zzp(zzawfVar, this.zzb, this.zzq);
            Long l11 = zzp.zza;
            if (l11 != null) {
                zzasfVar.zzN(l11.longValue());
            }
            Long l12 = zzp.zzb;
            if (l12 != null) {
                zzasfVar.zzO(l12.longValue());
            }
            Long l13 = zzp.zzc;
            if (l13 != null) {
                zzasfVar.zzL(l13.longValue());
            }
            if (this.zzp) {
                Long l14 = zzp.zzd;
                if (l14 != null) {
                    zzasfVar.zzK(l14.longValue());
                }
                Long l15 = zzp.zze;
                if (l15 != null) {
                    zzasfVar.zzH(l15.longValue());
                }
            }
        } catch (zzavv unused) {
        }
        zzasw zza = zzasx.zza();
        int i11 = 1;
        if (this.zzd > 0 && zzawi.zze(this.zzq)) {
            zza.zzd(zzawi.zza(this.zzk, 1, this.zzq));
            zza.zzq(zzawi.zza(this.zzn - this.zzl, 1, this.zzq));
            zza.zzr(zzawi.zza(this.zzo - this.zzm, 1, this.zzq));
            zza.zzj(zzawi.zza(this.zzl, 1, this.zzq));
            zza.zzl(zzawi.zza(this.zzm, 1, this.zzq));
            if (this.zzp && (motionEvent = this.zzb) != null) {
                long zza2 = zzawi.zza(((this.zzl - this.zzn) + motionEvent.getRawX()) - this.zzb.getX(), 1, this.zzq);
                if (zza2 != 0) {
                    zza.zzo(zza2);
                }
                long zza3 = zzawi.zza(((this.zzm - this.zzo) + this.zzb.getRawY()) - this.zzb.getY(), 1, this.zzq);
                if (zza3 != 0) {
                    zza.zzp(zza3);
                }
            }
        }
        try {
            zzawh zzj = zzj(this.zzb);
            Long l16 = zzj.zza;
            if (l16 != null) {
                zza.zzk(l16.longValue());
            }
            Long l17 = zzj.zzb;
            if (l17 != null) {
                zza.zzm(l17.longValue());
            }
            zza.zzi(zzj.zzc.longValue());
            if (this.zzp) {
                Long l18 = zzj.zze;
                if (l18 != null) {
                    zza.zzg(l18.longValue());
                }
                Long l19 = zzj.zzd;
                if (l19 != null) {
                    zza.zzh(l19.longValue());
                }
                Long l20 = zzj.zzf;
                if (l20 != null) {
                    if (l20.longValue() != 0) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                    zza.zzt(i10);
                }
                if (this.zze > 0) {
                    if (zzawi.zze(this.zzq)) {
                        l10 = Long.valueOf(Math.round(this.zzj / this.zze));
                    } else {
                        l10 = null;
                    }
                    if (l10 != null) {
                        zza.zzb(l10.longValue());
                    } else {
                        zza.zza();
                    }
                    zza.zzc(Math.round(this.zzi / this.zze));
                }
                Long l21 = zzj.zzi;
                if (l21 != null) {
                    zza.zze(l21.longValue());
                }
                Long l22 = zzj.zzj;
                if (l22 != null) {
                    zza.zzn(l22.longValue());
                }
                Long l23 = zzj.zzk;
                if (l23 != null) {
                    if (l23.longValue() != 0) {
                        i11 = 2;
                    }
                    zza.zzs(i11);
                }
            }
        } catch (zzavv unused2) {
        }
        long j3 = this.zzh;
        if (j3 > 0) {
            zza.zzf(j3);
        }
        zzasfVar.zzR((zzasx) zza.zzbr());
        long j10 = this.zzd;
        if (j10 > 0) {
            zzasfVar.zzI(j10);
        }
        long j11 = this.zze;
        if (j11 > 0) {
            zzasfVar.zzJ(j11);
        }
        long j12 = this.zzf;
        if (j12 > 0) {
            zzasfVar.zzM(j12);
        }
        long j13 = this.zzg;
        if (j13 > 0) {
            zzasfVar.zzG(j13);
        }
        try {
            int size = this.zzc.size() - 1;
            if (size > 0) {
                zzasfVar.zzb();
                for (int i12 = 0; i12 < size; i12++) {
                    zzawh zzp2 = zzp(zzauy.zza, (MotionEvent) this.zzc.get(i12), this.zzq);
                    zzasw zza4 = zzasx.zza();
                    zza4.zzk(zzp2.zza.longValue());
                    zza4.zzm(zzp2.zzb.longValue());
                    zzasfVar.zza((zzasx) zza4.zzbr());
                }
            }
        } catch (zzavv unused3) {
            zzasfVar.zzb();
        }
    }

    private static final void zzv() {
        zzawo zzawoVar = zzz;
        if (zzawoVar != null) {
            zzawoVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final long zza(StackTraceElement[] stackTraceElementArr) throws zzavv {
        Method zzj = zzauy.zza.zzj("XiB4JwXCMuAhsrPKvk3dS2LvKyxjCmXSaJ2VZGWg6jlAdLRjKnhTMhSQBaeXXZDY", "3gV4tnMlvvkjR90RI+zlkPr5OOXNb6rIM0OBAfjFnhQ=");
        if (zzj != null && stackTraceElementArr != null) {
            try {
                return new zzavw((String) zzj.invoke(null, stackTraceElementArr)).zza.longValue();
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new zzavv(e2);
            }
        }
        throw new zzavv();
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final zzasf zzb(Context context, View view, Activity activity) {
        zzv();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcL)).booleanValue()) {
            zzA.zzi();
        }
        zzauz zzauzVar = this.zzu;
        zzasf zza = zzata.zza();
        if (!TextUtils.isEmpty(zzauzVar.zzb)) {
            zza.zzh(this.zzu.zzb);
        }
        zzr(zzm(context, this.zzu.zza), zza, view, activity, true, context);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final zzasf zzc(Context context, zzars zzarsVar) {
        zzv();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcL)).booleanValue()) {
            zzA.zzj();
        }
        zzauz zzauzVar = this.zzu;
        zzasf zza = zzata.zza();
        if (!TextUtils.isEmpty(zzauzVar.zzb)) {
            zza.zzh(this.zzu.zzb);
        }
        zzawf zzm = zzm(context, this.zzu.zza);
        if (zzm.zzk() != null) {
            zzt(zzq(zzm, context, zza, null));
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final zzasf zzi(Context context, View view, Activity activity) {
        zzv();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcL)).booleanValue()) {
            zzA.zzk(context, view);
        }
        zzauz zzauzVar = this.zzu;
        zzasf zza = zzata.zza();
        zza.zzh(zzauzVar.zzb);
        zzr(zzm(context, this.zzu.zza), zza, view, activity, false, context);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final zzawh zzj(MotionEvent motionEvent) throws zzavv {
        Method zzj = zzauy.zza.zzj("64tg62Bex3MDquRtmlQJPk4NiwafsyFvyB+21DTcQv1umB8E7zvmXw8BDjm+e08c", "Bw1THEoW7bQ3OtU3uQYqnJGIWksyztmdRETM6M6rWV4=");
        if (zzj != null && motionEvent != null) {
            try {
                return new zzawh((String) zzj.invoke(null, motionEvent, this.zzq));
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new zzavv(e2);
            }
        }
        throw new zzavv();
    }

    @Override // com.google.android.gms.internal.ads.zzauy, com.google.android.gms.internal.ads.zzaux
    public final void zzo(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcJ)).booleanValue()) {
            return;
        }
        if (this.zzv == null) {
            zzawf zzawfVar = zzauy.zza;
            this.zzv = new zzawm(zzawfVar.zza, zzawfVar.zzf());
        }
        this.zzv.zzd(view);
    }

    public List zzq(zzawf zzawfVar, Context context, zzasf zzasfVar, zzars zzarsVar) {
        long j3;
        long j10;
        int zza = zzawfVar.zza();
        ArrayList arrayList = new ArrayList();
        if (!zzawfVar.zzr()) {
            zzasfVar.zzD(16384L);
            return arrayList;
        }
        arrayList.add(new zzawt(zzawfVar, "C5H7nTBN4nltmNau+/MNt6CSB0fOzxeNv8MDz6xiw5iQrv1d68C/G+ooekFvBfaF", "+RUwiCqrIcStaeiSXRFEyI1zJGWpibshqhmF48hI+GU=", zzasfVar, zza, 27, context, null, this.zzu.zzc, zzB));
        arrayList.add(new zzaww(zzawfVar, "TJ62ujRRBjJb9/NqrT2Pn0c6KFZY0SF6EjGcQMXtIVccZGktu9G9qu0AxWBd9HPE", "SO84xWj1xZpVST0NHeOw+QMypPAPo6e/MVLMJbQH2M4=", zzasfVar, zzx, zza, 25));
        arrayList.add(new zzaxg(zzawfVar, "PDdqBkuC/wlZj3D1GonYQW5lEcio5HWZDbvjL/QlEgG/4K0ExN3jw7lwkOOq3/t+", "G3wZ8gDu6u4efTKrvmsEHv1YK8hQgMyBIdhh8ClIQBY=", zzasfVar, zza, 1));
        arrayList.add(new zzaxj(zzawfVar, "p2B6bhXfJZNgZ0+I4L4c9cLXJrfGeKZvoxHbzoRookWEJhhW5Gvimq5QvTg4oqLM", "wcFaDbS//5pJ1R+WEpFF/o7BDXsIcxPrCZPKL326+18=", zzasfVar, zza, 31, context));
        arrayList.add(new zzaxo(zzawfVar, "Gni4qgp+h6AcoKfZop5I8lc+tIkw2ZH05xPrrmCfcSRn195BLh5fanbj8t/tK60H", "w5p59RLEy51WEx7/xjLAr1+9bhgJEvrJ/0voomQz2z8=", zzasfVar, zza, 33));
        arrayList.add(new zzaws(zzawfVar, "lIDPVUPkMEk1KnSIojzWRzc28dDnPbiGtgyxpW7TpbmhRjdqd91I/FiR+wuEiwMR", "KJxrJ6uU/9eq7G+RMyslIXmSG1J2c6lM89WgXCr+3Fk=", zzasfVar, zza, 29, context));
        arrayList.add(new zzawu(zzawfVar, "GvR+eAwGnG9v3CGqMDhazUVumHdJLt60TSBx5Df5j9bg+ZMppmesgixP833S80RN", "cPmD560wQtvtgfdpMZNJUfXZwJNhRKcjeHNf5LBrqDo=", zzasfVar, zza, 5));
        arrayList.add(new zzaxf(zzawfVar, "itZtoNFCmMg/dWjmiBIlGGLU2K9YPpOnkfWPvJRQsBTuwkRvFkAFf21f0YW4IJqS", "Vl0tGZUP9VgyaB044qzcR6APHL2v0rcSEKKrSSyljVU=", zzasfVar, zza, 12));
        arrayList.add(new zzaxh(zzawfVar, "5M/doPlP18zj3rcFgQUszE+WSqXh/st9yUF5JdFdktMd87cDlxgzyepiU5bej2uF", "KwLCo2LsichRi68Y4oRLpNy6fN1z6Wq88wujVx/pAjo=", zzasfVar, zza, 3));
        arrayList.add(new zzawv(zzawfVar, "vHxl3/k7agNEaOAb+kiexrLMKd/tl26b7leOgQmEqvHEdvK4RjfXtH7j4TmF8OsM", "1y55K+UUiCchaHGitlZ/bNKURNzH22lnMjmt1W+XJdc=", zzasfVar, zza, 44));
        arrayList.add(new zzaxb(zzawfVar, "pqNjV8dx1XFj9T4LMPQEa0a19I+nsD8Qxz2fQuehDPd98Kfq+TQkVREvoUEgFPtf", "v02B7neKpYyNwQtluXNrII6UZlY2WS0o0AnaqwUmhpo=", zzasfVar, zza, 22));
        arrayList.add(new zzaxp(zzawfVar, "88ETcPLh1JYg+nQ5zdwp+6acsWFKzCMthjLOw7XatJOMkLvYw0fl0jJT3ig1Ktkw", "AW0WUdAlySbPNJG5w1IgQqYKXV7WN2hB/EQpNB2ZwfA=", zzasfVar, zza, 48));
        arrayList.add(new zzawr(zzawfVar, "cASF9v3LVjFjcts3pzkxEpbZ/yZ0Z6rgUJw8wYZADCZYBHbsegUqurxqMOQQnwLa", "YV8d9qma0OL6XD+53oet9uRH00OzaYnpRo+iusl6DCM=", zzasfVar, zza, 49));
        arrayList.add(new zzaxm(zzawfVar, "p9pmeac90yMVCcN4sojWc0dcIOIcXaFrjT0spFQThk7HqJv1zzltubfYUBxGBSKx", "zyTzUjCmOTi6owBt6QTGC9Xa/1geFdM1/vAgrH362Ug=", zzasfVar, zza, 51));
        arrayList.add(new zzaxk(zzawfVar, "XUlbwsRmHSawbobvdBjnb2xctdVbPfXMEVEnXNMe2hHlLaCP55dgLdHMQ+hYM/7L", "7XeVq1bS2Nfqusn9ZkJuz3JHMvM2X4C8Onql6XjPnDI=", zzasfVar, zza, 61));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdv)).booleanValue()) {
            zzawo zzawoVar = zzz;
            if (zzawoVar != null) {
                j3 = zzawoVar.zzc();
                j10 = zzawoVar.zzb();
            } else {
                j3 = -1;
                j10 = -1;
            }
            arrayList.add(new zzaxe(zzawfVar, "TEuVeGvhlSIXkgQOkIrP3/M5xn08Noea2HjGio+2r03gBpanfVd2G9lK+KoDXH2T", "AA74eMHsp6+YeXgwW1ug4iNz8R55KIvaQAvJIVOChCk=", zzasfVar, zza, 11, zzy, j3, j10));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdu)).booleanValue()) {
            arrayList.add(new zzaxi(zzawfVar, "znXH0RM1XxCTrwmP7d8xA6zmeZad4bsyeawjZRDuwEtKXTURGEnX+tv9VD8MEWrm", "W+zVAKx2eduhDPC6RoJgOXSegMcVlCiHMJF4lAq9BYw=", zzasfVar, zza, 73));
        }
        arrayList.add(new zzaxc(zzawfVar, "QTLjHUsVFKXbBRd8imFe1ItVED7lwP3GXo5B6G2k1qI6ZE9LVZiLueNqbEPdYpXv", "L3fqGrpQIz2+lJDWzlSbCxhzTWa8jmNDfQhrqUdlO7E=", zzasfVar, zza, 76));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdy)).booleanValue()) {
            arrayList.add(new zzawq(zzawfVar, "ixYfTYsdoNOUTNdQh/wT/2cJJ79pJ44MoQEAe7G5x6Iqy1F1xj2tWQNOQTIxtV7u", "WP0A/iiJ0kwZaUHwj1D1bpbR/N680LqPRhfJ3Mm7j/s=", zzasfVar, zza, 89));
        }
        return arrayList;
    }

    public final void zzr(zzawf zzawfVar, zzasf zzasfVar, View view, Activity activity, boolean z10, Context context) {
        List list;
        if (!zzawfVar.zzr()) {
            zzasfVar.zzD(16384L);
            list = Arrays.asList(new zzawy(zzawfVar, zzasfVar));
        } else {
            zzu(zzawfVar, zzasfVar);
            ArrayList arrayList = new ArrayList();
            if (zzawfVar.zzk() != null) {
                int zza = zzawfVar.zza();
                arrayList.add(new zzawy(zzawfVar, zzasfVar));
                arrayList.add(new zzaxg(zzawfVar, "PDdqBkuC/wlZj3D1GonYQW5lEcio5HWZDbvjL/QlEgG/4K0ExN3jw7lwkOOq3/t+", "G3wZ8gDu6u4efTKrvmsEHv1YK8hQgMyBIdhh8ClIQBY=", zzasfVar, zza, 1));
                arrayList.add(new zzaww(zzawfVar, "TJ62ujRRBjJb9/NqrT2Pn0c6KFZY0SF6EjGcQMXtIVccZGktu9G9qu0AxWBd9HPE", "SO84xWj1xZpVST0NHeOw+QMypPAPo6e/MVLMJbQH2M4=", zzasfVar, zzx, zza, 25));
                arrayList.add(new zzawv(zzawfVar, "vHxl3/k7agNEaOAb+kiexrLMKd/tl26b7leOgQmEqvHEdvK4RjfXtH7j4TmF8OsM", "1y55K+UUiCchaHGitlZ/bNKURNzH22lnMjmt1W+XJdc=", zzasfVar, zza, 44));
                arrayList.add(new zzaxf(zzawfVar, "itZtoNFCmMg/dWjmiBIlGGLU2K9YPpOnkfWPvJRQsBTuwkRvFkAFf21f0YW4IJqS", "Vl0tGZUP9VgyaB044qzcR6APHL2v0rcSEKKrSSyljVU=", zzasfVar, zza, 12));
                arrayList.add(new zzaxh(zzawfVar, "5M/doPlP18zj3rcFgQUszE+WSqXh/st9yUF5JdFdktMd87cDlxgzyepiU5bej2uF", "KwLCo2LsichRi68Y4oRLpNy6fN1z6Wq88wujVx/pAjo=", zzasfVar, zza, 3));
                arrayList.add(new zzaxb(zzawfVar, "pqNjV8dx1XFj9T4LMPQEa0a19I+nsD8Qxz2fQuehDPd98Kfq+TQkVREvoUEgFPtf", "v02B7neKpYyNwQtluXNrII6UZlY2WS0o0AnaqwUmhpo=", zzasfVar, zza, 22));
                arrayList.add(new zzawu(zzawfVar, "GvR+eAwGnG9v3CGqMDhazUVumHdJLt60TSBx5Df5j9bg+ZMppmesgixP833S80RN", "cPmD560wQtvtgfdpMZNJUfXZwJNhRKcjeHNf5LBrqDo=", zzasfVar, zza, 5));
                arrayList.add(new zzaxp(zzawfVar, "88ETcPLh1JYg+nQ5zdwp+6acsWFKzCMthjLOw7XatJOMkLvYw0fl0jJT3ig1Ktkw", "AW0WUdAlySbPNJG5w1IgQqYKXV7WN2hB/EQpNB2ZwfA=", zzasfVar, zza, 48));
                arrayList.add(new zzawr(zzawfVar, "cASF9v3LVjFjcts3pzkxEpbZ/yZ0Z6rgUJw8wYZADCZYBHbsegUqurxqMOQQnwLa", "YV8d9qma0OL6XD+53oet9uRH00OzaYnpRo+iusl6DCM=", zzasfVar, zza, 49));
                arrayList.add(new zzaxm(zzawfVar, "p9pmeac90yMVCcN4sojWc0dcIOIcXaFrjT0spFQThk7HqJv1zzltubfYUBxGBSKx", "zyTzUjCmOTi6owBt6QTGC9Xa/1geFdM1/vAgrH362Ug=", zzasfVar, zza, 51));
                arrayList.add(new zzaxl(zzawfVar, "XiB4JwXCMuAhsrPKvk3dS2LvKyxjCmXSaJ2VZGWg6jlAdLRjKnhTMhSQBaeXXZDY", "3gV4tnMlvvkjR90RI+zlkPr5OOXNb6rIM0OBAfjFnhQ=", zzasfVar, zza, 45, new Throwable().getStackTrace()));
                arrayList.add(new zzaxq(zzawfVar, "gU8TtHMsoUkPWKRp4pchlMiybbWQk/XZmErfUYdY8xYZMhv+DT5EJrcXuMdR9TAB", "MCymTm++OZPusG19DHbi/CZ9AvqE5ZBPeRnjpDHc8+4=", zzasfVar, zza, 57, view));
                arrayList.add(new zzaxk(zzawfVar, "XUlbwsRmHSawbobvdBjnb2xctdVbPfXMEVEnXNMe2hHlLaCP55dgLdHMQ+hYM/7L", "7XeVq1bS2Nfqusn9ZkJuz3JHMvM2X4C8Onql6XjPnDI=", zzasfVar, zza, 61));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcH)).booleanValue()) {
                    arrayList.add(new zzawp(zzawfVar, "s0uE9hdlawP+tYGHYSI6i0EWhWy7Tdc9XW5A0finsHWGrmLjBRDuDmlHo7fmD8mf", "0+4i1BfON/tZfr/zJSlwHIdubE7ug8Met8dVp0E6y4I=", zzasfVar, zza, 62, view, activity));
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdy)).booleanValue()) {
                    arrayList.add(new zzawq(zzawfVar, "ixYfTYsdoNOUTNdQh/wT/2cJJ79pJ44MoQEAe7G5x6Iqy1F1xj2tWQNOQTIxtV7u", "WP0A/iiJ0kwZaUHwj1D1bpbR/N680LqPRhfJ3Mm7j/s=", zzasfVar, zza, 89));
                }
                if (z10) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcJ)).booleanValue()) {
                        arrayList.add(new zzaxn(zzawfVar, "Atq0HLNiKHjz80ZnAFWvUPfMlGQHg7AXdMxxDL1JZ6bmQmTFxmAmKhIDk2Jnayuk", "Su/GzywZakXq4glBT/l81JrPkq4+JC0EaqCjCuVscxM=", zzasfVar, zza, 53, this.zzv));
                    }
                } else {
                    try {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcK)).booleanValue()) {
                            arrayList.add(new zzaxa(zzawfVar, "SSi9+bc4LjSDCw5XbM9a3o0KjM00NEx8AzpqWTmGrN6ZCy4DwzQ9YQ8F3uOviR+R", "vovSRMWoC6DyReNhMsLU/AHhR3bWlWI4SOQQixDW2Zg=", zzasfVar, zza, 85, this.zzD, view, context));
                        }
                    } catch (IllegalStateException unused) {
                    }
                    try {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcL)).booleanValue()) {
                            arrayList.add(new zzawz(zzawfVar, "F3b/A5v6wf4vIgkFPpHbBE4QF+7kAwNXBYNdW+58EM84yoPYR42ji8mEXh7tsTu8", "0hPI01hyl9gRqyFiGkD5f6txe9kPcrO1Amh2RTTvv44=", zzasfVar, zza, 85, zzA));
                        }
                    } catch (IllegalStateException unused2) {
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzcS)).booleanValue()) {
                        arrayList.add(new zzaxd(zzawfVar, "InzZioUCViOMoBpQHwvu/pIx3gXrXGOaM2JpzEjvxDIhnjzi/kaCZRYG9Kg1JwVe", "n5HdSerkTAgTJwRh00NQA14abEqPXtGNhLU/oVUfpWQ=", zzasfVar, zza, 94, this.zzr));
                    }
                }
            }
            list = arrayList;
        }
        zzt(list);
    }
}

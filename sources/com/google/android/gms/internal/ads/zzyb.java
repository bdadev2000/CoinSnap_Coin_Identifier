package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzyb extends zzyg implements zzlp {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgaz zzc = zzgaz.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzxb
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i10 = zzyb.zzb;
            if (num.intValue() == -1) {
                if (num2.intValue() != -1) {
                    return -1;
                }
                return 0;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });

    @Nullable
    public final Context zza;
    private final Object zzd;
    private final boolean zze;
    private zzxp zzf;

    @Nullable
    private zzxt zzg;
    private zzg zzh;
    private final zzwx zzi;

    public zzyb(Context context) {
        Context context2;
        zzwx zzwxVar = new zzwx();
        zzxp zzd = zzxp.zzd(context);
        this.zzd = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.zza = context2;
        this.zzi = zzwxVar;
        this.zzf = zzd;
        this.zzh = zzg.zza;
        boolean z10 = false;
        if (context != null && zzen.zzM(context)) {
            z10 = true;
        }
        this.zze = z10;
        if (!z10 && context != null && zzen.zza >= 32) {
            this.zzg = zzxt.zza(context);
        }
        if (this.zzf.zzM && context == null) {
            zzdt.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static /* bridge */ /* synthetic */ int zzb(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    public static int zzc(zzad zzadVar, @Nullable String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(zzadVar.zzd)) {
            return 4;
        }
        String zzh = zzh(str);
        String zzh2 = zzh(zzadVar.zzd);
        if (zzh2 != null && zzh != null) {
            if (!zzh2.startsWith(zzh) && !zzh.startsWith(zzh2)) {
                int i10 = zzen.zza;
                if (!zzh2.split("-", 2)[0].equals(zzh.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z10 || zzh2 != null) {
            return 0;
        }
        return 1;
    }

    @Nullable
    public static String zzh(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        if (r1 != 3) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean zzm(com.google.android.gms.internal.ads.zzyb r8, com.google.android.gms.internal.ads.zzad r9) {
        /*
            java.lang.Object r0 = r8.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzxp r1 = r8.zzf     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.zzM     // Catch: java.lang.Throwable -> L8f
            r2 = 1
            if (r1 == 0) goto L8d
            boolean r1 = r8.zze     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L8d
            int r1 = r9.zzC     // Catch: java.lang.Throwable -> L8f
            r3 = 2
            if (r1 <= r3) goto L8d
            java.lang.String r1 = r9.zzo     // Catch: java.lang.Throwable -> L8f
            r4 = 32
            r5 = 0
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8f
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r2
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r7
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r5
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r3
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r2) goto L56
            if (r1 == r3) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = com.google.android.gms.internal.ads.zzen.zza     // Catch: java.lang.Throwable -> L8f
            if (r1 < r4) goto L8d
            com.google.android.gms.internal.ads.zzxt r1 = r8.zzg     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8d
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L8f
            if (r1 != 0) goto L65
            goto L8d
        L65:
            int r1 = com.google.android.gms.internal.ads.zzen.zza     // Catch: java.lang.Throwable -> L8f
            if (r1 < r4) goto L8c
            com.google.android.gms.internal.ads.zzxt r1 = r8.zzg     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            boolean r3 = r1.zzg()     // Catch: java.lang.Throwable -> L8f
            if (r3 == 0) goto L8c
            boolean r1 = r1.zze()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzxt r1 = r8.zzg     // Catch: java.lang.Throwable -> L8f
            boolean r1 = r1.zzf()     // Catch: java.lang.Throwable -> L8f
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzxt r1 = r8.zzg     // Catch: java.lang.Throwable -> L8f
            com.google.android.gms.internal.ads.zzg r8 = r8.zzh     // Catch: java.lang.Throwable -> L8f
            boolean r8 = r1.zzd(r8, r9)     // Catch: java.lang.Throwable -> L8f
            if (r8 == 0) goto L8c
            goto L8d
        L8c:
            r2 = r5
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            return r2
        L8f:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8f
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyb.zzm(com.google.android.gms.internal.ads.zzyb, com.google.android.gms.internal.ads.zzad):boolean");
    }

    private static void zzt(zzwr zzwrVar, zzcb zzcbVar, Map map) {
        for (int i10 = 0; i10 < zzwrVar.zzb; i10++) {
            if (((zzbx) zzcbVar.zzA.get(zzwrVar.zzb(i10))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        boolean z10;
        zzxt zzxtVar;
        synchronized (this.zzd) {
            z10 = false;
            if (this.zzf.zzM && !this.zze && zzen.zza >= 32 && (zzxtVar = this.zzg) != null && zzxtVar.zzg()) {
                z10 = true;
            }
        }
        if (z10) {
            zzs();
        }
    }

    @Nullable
    private static final Pair zzv(int i10, zzyf zzyfVar, int[][][] iArr, zzxv zzxvVar, Comparator comparator) {
        RandomAccess randomAccess;
        zzyf zzyfVar2 = zzyfVar;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < 2) {
            if (i10 == zzyfVar2.zzc(i11)) {
                zzwr zzd = zzyfVar2.zzd(i11);
                for (int i12 = 0; i12 < zzd.zzb; i12++) {
                    zzbw zzb2 = zzd.zzb(i12);
                    List zza = zzxvVar.zza(i11, zzb2, iArr[i11][i12]);
                    boolean[] zArr = new boolean[zzb2.zza];
                    int i13 = 0;
                    while (i13 < zzb2.zza) {
                        int i14 = i13 + 1;
                        zzxw zzxwVar = (zzxw) zza.get(i13);
                        int zzb3 = zzxwVar.zzb();
                        if (!zArr[i13] && zzb3 != 0) {
                            if (zzb3 == 1) {
                                randomAccess = zzfzo.zzo(zzxwVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzxwVar);
                                for (int i15 = i14; i15 < zzb2.zza; i15++) {
                                    zzxw zzxwVar2 = (zzxw) zza.get(i15);
                                    if (zzxwVar2.zzb() == 2 && zzxwVar.zzc(zzxwVar2)) {
                                        arrayList2.add(zzxwVar2);
                                        zArr[i15] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i13 = i14;
                    }
                }
            }
            i11++;
            zzyfVar2 = zzyfVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((zzxw) list.get(i16)).zzc;
        }
        zzxw zzxwVar3 = (zzxw) list.get(0);
        return Pair.create(new zzyc(zzxwVar3.zzb, iArr2, 0), Integer.valueOf(zzxwVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzlp
    public final void zza(zzln zzlnVar) {
        synchronized (this.zzd) {
            boolean z10 = this.zzf.zzQ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzyg
    public final Pair zzd(zzyf zzyfVar, int[][][] iArr, final int[] iArr2, zzur zzurVar, zzbv zzbvVar) throws zzig {
        final zzxp zzxpVar;
        Pair pair;
        int i10;
        final boolean z10;
        final String str;
        zzlr zzlrVar;
        int[] iArr3;
        int length;
        zzyd zza;
        zzyc zzycVar;
        zzxt zzxtVar;
        synchronized (this.zzd) {
            zzxpVar = this.zzf;
            if (zzxpVar.zzM && zzen.zza >= 32 && (zzxtVar = this.zzg) != null) {
                Looper myLooper = Looper.myLooper();
                zzdb.zzb(myLooper);
                zzxtVar.zzb(this, myLooper);
            }
        }
        int i11 = 2;
        zzyc[] zzycVarArr = new zzyc[2];
        Pair zzv = zzv(2, zzyfVar, iArr, new zzxv() { // from class: com.google.android.gms.internal.ads.zzxh
            /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
            @Override // com.google.android.gms.internal.ads.zzxv
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List zza(int r20, com.google.android.gms.internal.ads.zzbw r21, int[] r22) {
                /*
                    Method dump skipped, instructions count: 201
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxh.zza(int, com.google.android.gms.internal.ads.zzbw, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxi
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                return zzfzd.zzj().zzc((zzxz) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxx
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxz.zzd((zzxz) obj3, (zzxz) obj4);
                    }
                }), (zzxz) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxx
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxz.zzd((zzxz) obj3, (zzxz) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzxx
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxz.zzd((zzxz) obj3, (zzxz) obj4);
                    }
                }).zzb(list.size(), list2.size()).zzc((zzxz) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxy
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxz.zza((zzxz) obj3, (zzxz) obj4);
                    }
                }), (zzxz) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxy
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxz.zza((zzxz) obj3, (zzxz) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzxy
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzxz.zza((zzxz) obj3, (zzxz) obj4);
                    }
                }).zza();
            }
        });
        int i12 = 4;
        if (zzv == null) {
            pair = zzv(4, zzyfVar, iArr, new zzxv() { // from class: com.google.android.gms.internal.ads.zzxd
                @Override // com.google.android.gms.internal.ads.zzxv
                public final List zza(int i13, zzbw zzbwVar, int[] iArr4) {
                    int i14 = zzyb.zzb;
                    zzfzl zzfzlVar = new zzfzl();
                    for (int i15 = 0; i15 < zzbwVar.zza; i15++) {
                        zzfzlVar.zzf(new zzxm(i13, zzbwVar, i15, zzxp.this, iArr4[i15]));
                    }
                    return zzfzlVar.zzi();
                }
            }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxe
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((zzxm) ((List) obj).get(0)).zza((zzxm) ((List) obj2).get(0));
                }
            });
        } else {
            pair = null;
        }
        int i13 = 0;
        if (pair != null) {
            zzycVarArr[((Integer) pair.second).intValue()] = (zzyc) pair.first;
        } else if (zzv != null) {
            zzycVarArr[((Integer) zzv.second).intValue()] = (zzyc) zzv.first;
        }
        int i14 = 0;
        while (true) {
            i10 = 1;
            if (i14 < 2) {
                if (zzyfVar.zzc(i14) == 2 && zzyfVar.zzd(i14).zzb > 0) {
                    z10 = true;
                    break;
                }
                i14++;
            } else {
                z10 = false;
                break;
            }
        }
        Pair zzv2 = zzv(1, zzyfVar, iArr, new zzxv() { // from class: com.google.android.gms.internal.ads.zzxf
            @Override // com.google.android.gms.internal.ads.zzxv
            public final List zza(int i15, zzbw zzbwVar, int[] iArr4) {
                final zzyb zzybVar = zzyb.this;
                zzfwr zzfwrVar = new zzfwr() { // from class: com.google.android.gms.internal.ads.zzxc
                    @Override // com.google.android.gms.internal.ads.zzfwr
                    public final boolean zza(Object obj) {
                        return zzyb.zzm(zzyb.this, (zzad) obj);
                    }
                };
                int i16 = iArr2[i15];
                zzfzl zzfzlVar = new zzfzl();
                for (int i17 = 0; i17 < zzbwVar.zza; i17++) {
                    zzfzlVar.zzf(new zzxl(i15, zzbwVar, i17, zzxpVar, iArr4[i17], z10, zzfwrVar, i16));
                }
                return zzfzlVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxg
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzxl) Collections.max((List) obj)).zza((zzxl) Collections.max((List) obj2));
            }
        });
        if (zzv2 != null) {
            zzycVarArr[((Integer) zzv2.second).intValue()] = (zzyc) zzv2.first;
        }
        if (zzv2 == null) {
            str = null;
        } else {
            Object obj = zzv2.first;
            str = ((zzyc) obj).zza.zzb(((zzyc) obj).zzb[0]).zzd;
        }
        int i15 = 3;
        Pair zzv3 = zzv(3, zzyfVar, iArr, new zzxv() { // from class: com.google.android.gms.internal.ads.zzxj
            @Override // com.google.android.gms.internal.ads.zzxv
            public final List zza(int i16, zzbw zzbwVar, int[] iArr4) {
                int i17 = zzyb.zzb;
                zzfzl zzfzlVar = new zzfzl();
                for (int i18 = 0; i18 < zzbwVar.zza; i18++) {
                    int i19 = i18;
                    zzfzlVar.zzf(new zzxu(i16, zzbwVar, i19, zzxp.this, iArr4[i18], str));
                }
                return zzfzlVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxk
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzxu) ((List) obj2).get(0)).zza((zzxu) ((List) obj3).get(0));
            }
        });
        if (zzv3 != null) {
            zzycVarArr[((Integer) zzv3.second).intValue()] = (zzyc) zzv3.first;
        }
        int i16 = 0;
        while (i16 < i11) {
            int zzc2 = zzyfVar.zzc(i16);
            if (zzc2 != i11 && zzc2 != i10 && zzc2 != i15 && zzc2 != i12) {
                zzwr zzd = zzyfVar.zzd(i16);
                int[][] iArr4 = iArr[i16];
                int i17 = i13;
                int i18 = i17;
                zzbw zzbwVar = null;
                zzxn zzxnVar = null;
                while (i17 < zzd.zzb) {
                    zzbw zzb2 = zzd.zzb(i17);
                    int[] iArr5 = iArr4[i17];
                    zzxn zzxnVar2 = zzxnVar;
                    for (int i19 = i13; i19 < zzb2.zza; i19++) {
                        if (zzlo.zza(iArr5[i19], zzxpVar.zzN)) {
                            zzxn zzxnVar3 = new zzxn(zzb2.zzb(i19), iArr5[i19]);
                            if (zzxnVar2 == null || zzxnVar3.compareTo(zzxnVar2) > 0) {
                                zzbwVar = zzb2;
                                i18 = i19;
                                zzxnVar2 = zzxnVar3;
                            }
                        }
                    }
                    i17++;
                    zzxnVar = zzxnVar2;
                    i13 = 0;
                }
                if (zzbwVar == null) {
                    zzycVar = null;
                } else {
                    zzycVar = new zzyc(zzbwVar, new int[]{i18}, 0);
                }
                zzycVarArr[i16] = zzycVar;
            }
            i16++;
            i11 = 2;
            i12 = 4;
            i10 = 1;
            i13 = 0;
            i15 = 3;
        }
        HashMap hashMap = new HashMap();
        int i20 = 2;
        for (int i21 = 0; i21 < 2; i21++) {
            zzt(zzyfVar.zzd(i21), zzxpVar, hashMap);
        }
        zzt(zzyfVar.zze(), zzxpVar, hashMap);
        for (int i22 = 0; i22 < 2; i22++) {
            if (((zzbx) hashMap.get(Integer.valueOf(zzyfVar.zzc(i22)))) != null) {
                throw null;
            }
        }
        int i23 = 0;
        while (i23 < i20) {
            zzwr zzd2 = zzyfVar.zzd(i23);
            if (zzxpVar.zzg(i23, zzd2)) {
                if (zzxpVar.zze(i23, zzd2) == null) {
                    zzycVarArr[i23] = null;
                } else {
                    throw null;
                }
            }
            i23++;
            i20 = 2;
        }
        int i24 = 0;
        for (int i25 = i20; i24 < i25; i25 = 2) {
            int zzc3 = zzyfVar.zzc(i24);
            if (zzxpVar.zzf(i24) || zzxpVar.zzB.contains(Integer.valueOf(zzc3))) {
                zzycVarArr[i24] = null;
            }
            i24++;
        }
        zzwx zzwxVar = this.zzi;
        zzyr zzq = zzq();
        zzfzo zzf = zzwy.zzf(zzycVarArr);
        int i26 = 2;
        zzyd[] zzydVarArr = new zzyd[2];
        int i27 = 0;
        while (i27 < i26) {
            zzyc zzycVar2 = zzycVarArr[i27];
            if (zzycVar2 != null && (length = (iArr3 = zzycVar2.zzb).length) != 0) {
                if (length == 1) {
                    zza = new zzye(zzycVar2.zza, iArr3[0], 0, 0, null);
                } else {
                    zza = zzwxVar.zza(zzycVar2.zza, iArr3, 0, zzq, (zzfzo) zzf.get(i27));
                }
                zzydVarArr[i27] = zza;
            }
            i27++;
            i26 = 2;
        }
        zzlr[] zzlrVarArr = new zzlr[i26];
        for (int i28 = 0; i28 < i26; i28++) {
            int zzc4 = zzyfVar.zzc(i28);
            if (!zzxpVar.zzf(i28) && !zzxpVar.zzB.contains(Integer.valueOf(zzc4)) && (zzyfVar.zzc(i28) == -2 || zzydVarArr[i28] != null)) {
                zzlrVar = zzlr.zza;
            } else {
                zzlrVar = null;
            }
            zzlrVarArr[i28] = zzlrVar;
        }
        return Pair.create(zzlrVarArr, zzydVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    @Nullable
    public final zzlp zze() {
        return this;
    }

    public final zzxp zzf() {
        zzxp zzxpVar;
        synchronized (this.zzd) {
            zzxpVar = this.zzf;
        }
        return zzxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final void zzj() {
        zzxt zzxtVar;
        synchronized (this.zzd) {
            if (zzen.zza >= 32 && (zzxtVar = this.zzg) != null) {
                zzxtVar.zzc();
            }
        }
        super.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final void zzk(zzg zzgVar) {
        boolean z10;
        synchronized (this.zzd) {
            z10 = !this.zzh.equals(zzgVar);
            this.zzh = zzgVar;
        }
        if (z10) {
            zzu();
        }
    }

    public final void zzl(zzxo zzxoVar) {
        boolean z10;
        zzxp zzxpVar = new zzxp(zzxoVar);
        synchronized (this.zzd) {
            z10 = !this.zzf.equals(zzxpVar);
            this.zzf = zzxpVar;
        }
        if (z10) {
            if (zzxpVar.zzM && this.zza == null) {
                zzdt.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyj
    public final boolean zzn() {
        return true;
    }
}

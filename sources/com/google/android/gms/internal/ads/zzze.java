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

/* loaded from: classes2.dex */
public final class zzze extends zzzj implements zzmo {
    private static final zzgcn zzb = zzgcn.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzyb
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
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
    private final Object zzc;
    private final boolean zzd;
    private zzys zze;

    @Nullable
    private zzyx zzf;
    private zzk zzg;
    private final zzxx zzh;

    public zzze(Context context) {
        Context context2;
        zzxx zzxxVar = new zzxx();
        zzys zzd = zzys.zzd(context);
        this.zzc = new Object();
        if (context != null) {
            context2 = context.getApplicationContext();
        } else {
            context2 = null;
        }
        this.zza = context2;
        this.zzh = zzxxVar;
        this.zze = zzd;
        this.zzg = zzk.zza;
        boolean z8 = false;
        if (context != null && zzgd.zzN(context)) {
            z8 = true;
        }
        this.zzd = z8;
        if (!z8 && context != null && zzgd.zza >= 32) {
            this.zzf = zzyx.zza(context);
        }
        if (this.zze.zzS && context == null) {
            zzfk.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static /* bridge */ /* synthetic */ int zzb(int i9, int i10) {
        if (i9 != 0 && i9 == i10) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(i9 & i10);
    }

    public static int zzc(zzan zzanVar, @Nullable String str, boolean z8) {
        if (!TextUtils.isEmpty(str) && str.equals(zzanVar.zze)) {
            return 4;
        }
        String zzh = zzh(str);
        String zzh2 = zzh(zzanVar.zze);
        if (zzh2 != null && zzh != null) {
            if (!zzh2.startsWith(zzh) && !zzh.startsWith(zzh2)) {
                int i9 = zzgd.zza;
                if (!zzh2.split("-", 2)[0].equals(zzh.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z8 || zzh2 != null) {
            return 0;
        }
        return 1;
    }

    @Nullable
    public static String zzh(@Nullable String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return str;
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzze zzzeVar) {
        zzzeVar.zzv();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        if (r1 != 3) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean zzm(com.google.android.gms.internal.ads.zzze r8, com.google.android.gms.internal.ads.zzan r9) {
        /*
            java.lang.Object r0 = r8.zzc
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzys r1 = r8.zze     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.zzS     // Catch: java.lang.Throwable -> L8e
            r2 = 1
            if (r1 == 0) goto L90
            boolean r1 = r8.zzd     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L90
            int r1 = r9.zzA     // Catch: java.lang.Throwable -> L8e
            r3 = 2
            if (r1 <= r3) goto L90
            java.lang.String r1 = r9.zzn     // Catch: java.lang.Throwable -> L8e
            r4 = 32
            r5 = 0
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8e
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
            int r1 = com.google.android.gms.internal.ads.zzgd.zza     // Catch: java.lang.Throwable -> L8e
            if (r1 < r4) goto L90
            com.google.android.gms.internal.ads.zzyx r1 = r8.zzf     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L90
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L65
            goto L90
        L65:
            int r1 = com.google.android.gms.internal.ads.zzgd.zza     // Catch: java.lang.Throwable -> L8e
            if (r1 < r4) goto L8c
            com.google.android.gms.internal.ads.zzyx r1 = r8.zzf     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            boolean r3 = r1.zzg()     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L8c
            boolean r1 = r1.zze()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzyx r1 = r8.zzf     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.zzf()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzyx r1 = r8.zzf     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzk r8 = r8.zzg     // Catch: java.lang.Throwable -> L8e
            boolean r8 = r1.zzd(r8, r9)     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L8c
            goto L90
        L8c:
            r2 = r5
            goto L90
        L8e:
            r8 = move-exception
            goto L92
        L90:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            return r2
        L92:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzze.zzm(com.google.android.gms.internal.ads.zzze, com.google.android.gms.internal.ads.zzan):boolean");
    }

    public static boolean zzo(int i9, boolean z8) {
        int i10 = i9 & 7;
        if (i10 != 4) {
            return z8 && i10 == 3;
        }
        return true;
    }

    private static void zzu(zzxr zzxrVar, zzdl zzdlVar, Map map) {
        for (int i9 = 0; i9 < zzxrVar.zzc; i9++) {
            if (((zzdg) zzdlVar.zzD.get(zzxrVar.zzb(i9))) != null) {
                throw null;
            }
        }
    }

    public final void zzv() {
        boolean z8;
        zzyx zzyxVar;
        synchronized (this.zzc) {
            try {
                z8 = false;
                if (this.zze.zzS && !this.zzd && zzgd.zza >= 32 && (zzyxVar = this.zzf) != null && zzyxVar.zzg()) {
                    z8 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            zzt();
        }
    }

    @Nullable
    private static final Pair zzw(int i9, zzzi zzziVar, int[][][] iArr, zzyz zzyzVar, Comparator comparator) {
        RandomAccess randomAccess;
        zzzi zzziVar2 = zzziVar;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < 2) {
            if (i9 == zzziVar2.zzc(i10)) {
                zzxr zzd = zzziVar2.zzd(i10);
                for (int i11 = 0; i11 < zzd.zzc; i11++) {
                    zzde zzb2 = zzd.zzb(i11);
                    List zza = zzyzVar.zza(i10, zzb2, iArr[i10][i11]);
                    boolean[] zArr = new boolean[zzb2.zzb];
                    int i12 = 0;
                    while (i12 < zzb2.zzb) {
                        int i13 = i12 + 1;
                        zzza zzzaVar = (zzza) zza.get(i12);
                        int zzb3 = zzzaVar.zzb();
                        if (!zArr[i12] && zzb3 != 0) {
                            if (zzb3 == 1) {
                                randomAccess = zzgbc.zzn(zzzaVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzzaVar);
                                for (int i14 = i13; i14 < zzb2.zzb; i14++) {
                                    zzza zzzaVar2 = (zzza) zza.get(i14);
                                    if (zzzaVar2.zzb() == 2 && zzzaVar.zzc(zzzaVar2)) {
                                        arrayList2.add(zzzaVar2);
                                        zArr[i14] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i12 = i13;
                    }
                }
            }
            i10++;
            zzziVar2 = zzziVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i15 = 0; i15 < list.size(); i15++) {
            iArr2[i15] = ((zzza) list.get(i15)).zzc;
        }
        zzza zzzaVar3 = (zzza) list.get(0);
        return Pair.create(new zzzf(zzzaVar3.zzb, iArr2, 0), Integer.valueOf(zzzaVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzmo
    public final void zza(zzmn zzmnVar) {
        synchronized (this.zzc) {
            boolean z8 = this.zze.zzW;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzzj
    public final Pair zzd(zzzi zzziVar, int[][][] iArr, final int[] iArr2, zzvo zzvoVar, zzdc zzdcVar) throws zzjh {
        final zzys zzysVar;
        Pair pair;
        int i9;
        final boolean z8;
        final String str;
        zzmq zzmqVar;
        int i10;
        int[] iArr3;
        int length;
        zzzg zza;
        zzzf zzzfVar;
        zzyx zzyxVar;
        synchronized (this.zzc) {
            try {
                zzysVar = this.zze;
                if (zzysVar.zzS && zzgd.zza >= 32 && (zzyxVar = this.zzf) != null) {
                    Looper myLooper = Looper.myLooper();
                    zzeq.zzb(myLooper);
                    zzyxVar.zzb(this, myLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i11 = 2;
        zzzf[] zzzfVarArr = new zzzf[2];
        Pair zzw = zzw(2, zzziVar, iArr, new zzyz() { // from class: com.google.android.gms.internal.ads.zzyh
            /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
            @Override // com.google.android.gms.internal.ads.zzyz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List zza(int r20, com.google.android.gms.internal.ads.zzde r21, int[] r22) {
                /*
                    Method dump skipped, instructions count: 200
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyh.zza(int, com.google.android.gms.internal.ads.zzde, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyi
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                return zzgar.zzk().zzd((zzzd) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzzb
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzzd.zzd((zzzd) obj3, (zzzd) obj4);
                    }
                }), (zzzd) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzzb
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzzd.zzd((zzzd) obj3, (zzzd) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzzb
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzzd.zzd((zzzd) obj3, (zzzd) obj4);
                    }
                }).zzb(list.size(), list2.size()).zzd((zzzd) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzzc
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzzd.zza((zzzd) obj3, (zzzd) obj4);
                    }
                }), (zzzd) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzzc
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzzd.zza((zzzd) obj3, (zzzd) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzzc
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzzd.zza((zzzd) obj3, (zzzd) obj4);
                    }
                }).zza();
            }
        });
        int i12 = 4;
        if (zzw == null) {
            pair = zzw(4, zzziVar, iArr, new zzyz() { // from class: com.google.android.gms.internal.ads.zzyd
                @Override // com.google.android.gms.internal.ads.zzyz
                public final List zza(int i13, zzde zzdeVar, int[] iArr4) {
                    zzgaz zzgazVar = new zzgaz();
                    for (int i14 = 0; i14 < zzdeVar.zzb; i14++) {
                        zzgazVar.zzf(new zzym(i13, zzdeVar, i14, zzys.this, iArr4[i14]));
                    }
                    return zzgazVar.zzi();
                }
            }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzye
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((zzym) ((List) obj).get(0)).zza((zzym) ((List) obj2).get(0));
                }
            });
        } else {
            pair = null;
        }
        int i13 = 0;
        if (pair != null) {
            zzzfVarArr[((Integer) pair.second).intValue()] = (zzzf) pair.first;
        } else if (zzw != null) {
            zzzfVarArr[((Integer) zzw.second).intValue()] = (zzzf) zzw.first;
        }
        int i14 = 0;
        while (true) {
            i9 = 1;
            if (i14 < 2) {
                if (zzziVar.zzc(i14) == 2 && zzziVar.zzd(i14).zzc > 0) {
                    z8 = true;
                    break;
                }
                i14++;
            } else {
                z8 = false;
                break;
            }
        }
        Pair zzw2 = zzw(1, zzziVar, iArr, new zzyz() { // from class: com.google.android.gms.internal.ads.zzyf
            @Override // com.google.android.gms.internal.ads.zzyz
            public final List zza(int i15, zzde zzdeVar, int[] iArr4) {
                final zzze zzzeVar = zzze.this;
                zzfyh zzfyhVar = new zzfyh() { // from class: com.google.android.gms.internal.ads.zzyc
                    @Override // com.google.android.gms.internal.ads.zzfyh
                    public final boolean zza(Object obj) {
                        return zzze.zzm(zzze.this, (zzan) obj);
                    }
                };
                int i16 = iArr2[i15];
                zzgaz zzgazVar = new zzgaz();
                for (int i17 = 0; i17 < zzdeVar.zzb; i17++) {
                    zzgazVar.zzf(new zzyl(i15, zzdeVar, i17, zzysVar, iArr4[i17], z8, zzfyhVar, i16));
                }
                return zzgazVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyg
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzyl) Collections.max((List) obj)).zza((zzyl) Collections.max((List) obj2));
            }
        });
        if (zzw2 != null) {
            zzzfVarArr[((Integer) zzw2.second).intValue()] = (zzzf) zzw2.first;
        }
        if (zzw2 == null) {
            str = null;
        } else {
            Object obj = zzw2.first;
            str = ((zzzf) obj).zza.zzb(((zzzf) obj).zzb[0]).zze;
        }
        int i15 = 3;
        Pair zzw3 = zzw(3, zzziVar, iArr, new zzyz() { // from class: com.google.android.gms.internal.ads.zzyj
            @Override // com.google.android.gms.internal.ads.zzyz
            public final List zza(int i16, zzde zzdeVar, int[] iArr4) {
                zzgaz zzgazVar = new zzgaz();
                for (int i17 = 0; i17 < zzdeVar.zzb; i17++) {
                    int i18 = i17;
                    zzgazVar.zzf(new zzyy(i16, zzdeVar, i18, zzys.this, iArr4[i17], str));
                }
                return zzgazVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyk
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzyy) ((List) obj2).get(0)).zza((zzyy) ((List) obj3).get(0));
            }
        });
        if (zzw3 != null) {
            zzzfVarArr[((Integer) zzw3.second).intValue()] = (zzzf) zzw3.first;
        }
        int i16 = 0;
        while (i16 < i11) {
            int zzc = zzziVar.zzc(i16);
            if (zzc != i11 && zzc != i9 && zzc != i15 && zzc != i12) {
                zzxr zzd = zzziVar.zzd(i16);
                int[][] iArr4 = iArr[i16];
                int i17 = i13;
                int i18 = i17;
                zzde zzdeVar = null;
                zzyn zzynVar = null;
                while (i17 < zzd.zzc) {
                    zzde zzb2 = zzd.zzb(i17);
                    int[] iArr5 = iArr4[i17];
                    zzyn zzynVar2 = zzynVar;
                    for (int i19 = i13; i19 < zzb2.zzb; i19++) {
                        if (zzo(iArr5[i19], zzysVar.zzT)) {
                            zzyn zzynVar3 = new zzyn(zzb2.zzb(i19), iArr5[i19]);
                            if (zzynVar2 == null || zzynVar3.compareTo(zzynVar2) > 0) {
                                zzdeVar = zzb2;
                                zzynVar2 = zzynVar3;
                                i18 = i19;
                            }
                        }
                    }
                    i17++;
                    zzynVar = zzynVar2;
                    i13 = 0;
                }
                if (zzdeVar == null) {
                    zzzfVar = null;
                } else {
                    zzzfVar = new zzzf(zzdeVar, new int[]{i18}, 0);
                }
                zzzfVarArr[i16] = zzzfVar;
            }
            i16++;
            i11 = 2;
            i12 = 4;
            i9 = 1;
            i13 = 0;
            i15 = 3;
        }
        HashMap hashMap = new HashMap();
        int i20 = 2;
        for (int i21 = 0; i21 < 2; i21++) {
            zzu(zzziVar.zzd(i21), zzysVar, hashMap);
        }
        zzu(zzziVar.zze(), zzysVar, hashMap);
        for (int i22 = 0; i22 < 2; i22++) {
            if (((zzdg) hashMap.get(Integer.valueOf(zzziVar.zzc(i22)))) != null) {
                throw null;
            }
        }
        int i23 = 0;
        while (i23 < i20) {
            zzxr zzd2 = zzziVar.zzd(i23);
            if (zzysVar.zzg(i23, zzd2)) {
                if (zzysVar.zze(i23, zzd2) == null) {
                    zzzfVarArr[i23] = null;
                } else {
                    throw null;
                }
            }
            i23++;
            i20 = 2;
        }
        int i24 = 0;
        for (int i25 = i20; i24 < i25; i25 = 2) {
            int zzc2 = zzziVar.zzc(i24);
            if (zzysVar.zzf(i24) || zzysVar.zzE.contains(Integer.valueOf(zzc2))) {
                zzzfVarArr[i24] = null;
            }
            i24++;
        }
        zzxx zzxxVar = this.zzh;
        zzzu zzr = zzr();
        zzgbc zzf = zzxy.zzf(zzzfVarArr);
        int i26 = 2;
        zzzg[] zzzgVarArr = new zzzg[2];
        int i27 = 0;
        while (i27 < i26) {
            zzzf zzzfVar2 = zzzfVarArr[i27];
            if (zzzfVar2 == null || (length = (iArr3 = zzzfVar2.zzb).length) == 0) {
                i10 = i27;
            } else {
                if (length == 1) {
                    zza = new zzzh(zzzfVar2.zza, iArr3[0], 0, 0, null);
                    i10 = i27;
                } else {
                    i10 = i27;
                    zza = zzxxVar.zza(zzzfVar2.zza, iArr3, 0, zzr, (zzgbc) zzf.get(i27));
                }
                zzzgVarArr[i10] = zza;
            }
            i27 = i10 + 1;
            i26 = 2;
        }
        zzmq[] zzmqVarArr = new zzmq[i26];
        for (int i28 = 0; i28 < i26; i28++) {
            int zzc3 = zzziVar.zzc(i28);
            if (zzysVar.zzf(i28) || zzysVar.zzE.contains(Integer.valueOf(zzc3)) || (zzziVar.zzc(i28) != -2 && zzzgVarArr[i28] == null)) {
                zzmqVar = null;
            } else {
                zzmqVar = zzmq.zza;
            }
            zzmqVarArr[i28] = zzmqVar;
        }
        return Pair.create(zzmqVarArr, zzzgVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    @Nullable
    public final zzmo zze() {
        return this;
    }

    public final zzys zzf() {
        zzys zzysVar;
        synchronized (this.zzc) {
            zzysVar = this.zze;
        }
        return zzysVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final void zzj() {
        zzyx zzyxVar;
        synchronized (this.zzc) {
            try {
                if (zzgd.zza >= 32 && (zzyxVar = this.zzf) != null) {
                    zzyxVar.zzc();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final void zzk(zzk zzkVar) {
        boolean z8;
        synchronized (this.zzc) {
            z8 = !this.zzg.equals(zzkVar);
            this.zzg = zzkVar;
        }
        if (z8) {
            zzv();
        }
    }

    public final void zzl(zzyq zzyqVar) {
        boolean z8;
        zzys zzysVar = new zzys(zzyqVar);
        synchronized (this.zzc) {
            z8 = !this.zze.equals(zzysVar);
            this.zze = zzysVar;
        }
        if (z8) {
            if (zzysVar.zzS && this.zza == null) {
                zzfk.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzm
    public final boolean zzn() {
        return true;
    }
}

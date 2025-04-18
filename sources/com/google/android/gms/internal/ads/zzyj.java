package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzyj extends zzyo implements zzlt {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgci zzc = zzgci.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzxi
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i2 = zzyj.zzb;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
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

    @GuardedBy
    private zzxy zzf;

    @Nullable
    @GuardedBy
    private zzyc zzg;

    @GuardedBy
    private zzh zzh;
    private final zzxe zzi;

    public zzyj(Context context) {
        zzxe zzxeVar = new zzxe();
        zzxy zzd = zzxy.zzd(context);
        this.zzd = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzi = zzxeVar;
        this.zzf = zzd;
        this.zzh = zzh.zza;
        boolean z2 = false;
        if (context != null && zzeu.zzL(context)) {
            z2 = true;
        }
        this.zze = z2;
        if (!z2 && context != null && zzeu.zza >= 32) {
            this.zzg = zzyc.zza(context);
        }
        if (this.zzf.zzM && context == null) {
            zzea.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static /* bridge */ /* synthetic */ int zzb(int i2, int i3) {
        return (i2 == 0 || i2 != i3) ? Integer.bitCount(i2 & i3) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static int zzc(zzaf zzafVar, @Nullable String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && str.equals(zzafVar.zzd)) {
            return 4;
        }
        String zzh = zzh(str);
        String zzh2 = zzh(zzafVar.zzd);
        if (zzh2 == null || zzh == null) {
            return (z2 && zzh2 == null) ? 1 : 0;
        }
        if (zzh2.startsWith(zzh) || zzh.startsWith(zzh2)) {
            return 3;
        }
        int i2 = zzeu.zza;
        return zzh2.split("-", 2)[0].equals(zzh.split("-", 2)[0]) ? 2 : 0;
    }

    @Nullable
    public static String zzh(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static /* bridge */ /* synthetic */ void zzi(zzyj zzyjVar) {
        zzyjVar.zzu();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        if (r1 != 3) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean zzm(com.google.android.gms.internal.ads.zzyj r8, com.google.android.gms.internal.ads.zzaf r9) {
        /*
            java.lang.Object r0 = r8.zzd
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzxy r1 = r8.zzf     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.zzM     // Catch: java.lang.Throwable -> L8e
            r2 = 1
            if (r1 == 0) goto L90
            boolean r1 = r8.zze     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L90
            int r1 = r9.zzB     // Catch: java.lang.Throwable -> L8e
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
            int r1 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> L8e
            if (r1 < r4) goto L90
            com.google.android.gms.internal.ads.zzyc r1 = r8.zzg     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L90
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L65
            goto L90
        L65:
            int r1 = com.google.android.gms.internal.ads.zzeu.zza     // Catch: java.lang.Throwable -> L8e
            if (r1 < r4) goto L8c
            com.google.android.gms.internal.ads.zzyc r1 = r8.zzg     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            boolean r3 = r1.zzg()     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L8c
            boolean r1 = r1.zze()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzyc r1 = r8.zzg     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.zzf()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.zzyc r1 = r8.zzg     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.zzh r8 = r8.zzh     // Catch: java.lang.Throwable -> L8e
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyj.zzm(com.google.android.gms.internal.ads.zzyj, com.google.android.gms.internal.ads.zzaf):boolean");
    }

    private static void zzt(zzwy zzwyVar, zzci zzciVar, Map map) {
        for (int i2 = 0; i2 < zzwyVar.zzb; i2++) {
            if (((zzce) zzciVar.zzA.get(zzwyVar.zzb(i2))) != null) {
                throw null;
            }
        }
    }

    public final void zzu() {
        boolean z2;
        zzyc zzycVar;
        synchronized (this.zzd) {
            try {
                z2 = false;
                if (this.zzf.zzM && !this.zze && zzeu.zza >= 32 && (zzycVar = this.zzg) != null && zzycVar.zzg()) {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            zzs();
        }
    }

    @Nullable
    private static final Pair zzv(int i2, zzyn zzynVar, int[][][] iArr, zzye zzyeVar, Comparator comparator) {
        RandomAccess randomAccess;
        zzyn zzynVar2 = zzynVar;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < 2) {
            if (i2 == zzynVar2.zzc(i3)) {
                zzwy zzd = zzynVar2.zzd(i3);
                for (int i4 = 0; i4 < zzd.zzb; i4++) {
                    zzcd zzb2 = zzd.zzb(i4);
                    List zza = zzyeVar.zza(i3, zzb2, iArr[i3][i4]);
                    boolean[] zArr = new boolean[zzb2.zza];
                    int i5 = 0;
                    while (i5 < zzb2.zza) {
                        int i6 = i5 + 1;
                        zzyf zzyfVar = (zzyf) zza.get(i5);
                        int zzb3 = zzyfVar.zzb();
                        if (!zArr[i5] && zzb3 != 0) {
                            if (zzb3 == 1) {
                                randomAccess = zzgax.zzo(zzyfVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzyfVar);
                                for (int i7 = i6; i7 < zzb2.zza; i7++) {
                                    zzyf zzyfVar2 = (zzyf) zza.get(i7);
                                    if (zzyfVar2.zzb() == 2 && zzyfVar.zzc(zzyfVar2)) {
                                        arrayList2.add(zzyfVar2);
                                        zArr[i7] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i5 = i6;
                    }
                }
            }
            i3++;
            zzynVar2 = zzynVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((zzyf) list.get(i8)).zzc;
        }
        zzyf zzyfVar3 = (zzyf) list.get(0);
        return Pair.create(new zzyk(zzyfVar3.zzb, iArr2, 0), Integer.valueOf(zzyfVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzlt
    public final void zza(zzlr zzlrVar) {
        synchronized (this.zzd) {
            boolean z2 = this.zzf.zzQ;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzyo
    public final Pair zzd(zzyn zzynVar, int[][][] iArr, final int[] iArr2, zzuy zzuyVar, zzcc zzccVar) throws zzij {
        final zzxy zzxyVar;
        int i2;
        final boolean z2;
        final String str;
        int i3;
        int[] iArr3;
        int length;
        zzyl zza;
        zzyc zzycVar;
        synchronized (this.zzd) {
            try {
                zzxyVar = this.zzf;
                if (zzxyVar.zzM && zzeu.zza >= 32 && (zzycVar = this.zzg) != null) {
                    Looper myLooper = Looper.myLooper();
                    zzdi.zzb(myLooper);
                    zzycVar.zzb(this, myLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i4 = 2;
        zzyk[] zzykVarArr = new zzyk[2];
        Pair zzv = zzv(2, zzynVar, iArr, new zzye() { // from class: com.google.android.gms.internal.ads.zzxo
            /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
            @Override // com.google.android.gms.internal.ads.zzye
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List zza(int r20, com.google.android.gms.internal.ads.zzcd r21, int[] r22) {
                /*
                    Method dump skipped, instructions count: 202
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxo.zza(int, com.google.android.gms.internal.ads.zzcd, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxp
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                return zzgam.zzj().zzc((zzyi) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyg
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzyi.zzd((zzyi) obj3, (zzyi) obj4);
                    }
                }), (zzyi) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyg
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzyi.zzd((zzyi) obj3, (zzyi) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzyg
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzyi.zzd((zzyi) obj3, (zzyi) obj4);
                    }
                }).zzb(list.size(), list2.size()).zzc((zzyi) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyh
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzyi.zza((zzyi) obj3, (zzyi) obj4);
                    }
                }), (zzyi) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyh
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzyi.zza((zzyi) obj3, (zzyi) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzyh
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return zzyi.zza((zzyi) obj3, (zzyi) obj4);
                    }
                }).zza();
            }
        });
        int i5 = 4;
        Pair zzv2 = zzv == null ? zzv(4, zzynVar, iArr, new zzye() { // from class: com.google.android.gms.internal.ads.zzxk
            @Override // com.google.android.gms.internal.ads.zzye
            public final List zza(int i6, zzcd zzcdVar, int[] iArr4) {
                int i7 = zzyj.zzb;
                zzgau zzgauVar = new zzgau();
                for (int i8 = 0; i8 < zzcdVar.zza; i8++) {
                    zzgauVar.zzf(new zzxt(i6, zzcdVar, i8, zzxy.this, iArr4[i8]));
                }
                return zzgauVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxl
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzxt) ((List) obj).get(0)).compareTo((zzxt) ((List) obj2).get(0));
            }
        }) : null;
        int i6 = 0;
        if (zzv2 != null) {
            zzykVarArr[((Integer) zzv2.second).intValue()] = (zzyk) zzv2.first;
        } else if (zzv != null) {
            zzykVarArr[((Integer) zzv.second).intValue()] = (zzyk) zzv.first;
        }
        int i7 = 0;
        while (true) {
            i2 = 1;
            if (i7 >= 2) {
                z2 = false;
                break;
            }
            if (zzynVar.zzc(i7) == 2 && zzynVar.zzd(i7).zzb > 0) {
                z2 = true;
                break;
            }
            i7++;
        }
        Pair zzv3 = zzv(1, zzynVar, iArr, new zzye() { // from class: com.google.android.gms.internal.ads.zzxm
            @Override // com.google.android.gms.internal.ads.zzye
            public final List zza(int i8, zzcd zzcdVar, int[] iArr4) {
                final zzyj zzyjVar = zzyj.this;
                zzfya zzfyaVar = new zzfya() { // from class: com.google.android.gms.internal.ads.zzxj
                    @Override // com.google.android.gms.internal.ads.zzfya
                    public final boolean zza(Object obj) {
                        return zzyj.zzm(zzyj.this, (zzaf) obj);
                    }
                };
                int i9 = iArr2[i8];
                zzgau zzgauVar = new zzgau();
                for (int i10 = 0; i10 < zzcdVar.zza; i10++) {
                    zzgauVar.zzf(new zzxs(i8, zzcdVar, i10, zzxyVar, iArr4[i10], z2, zzfyaVar, i9));
                }
                return zzgauVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxn
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzxs) Collections.max((List) obj)).zza((zzxs) Collections.max((List) obj2));
            }
        });
        if (zzv3 != null) {
            zzykVarArr[((Integer) zzv3.second).intValue()] = (zzyk) zzv3.first;
        }
        if (zzv3 == null) {
            str = null;
        } else {
            Object obj = zzv3.first;
            str = ((zzyk) obj).zza.zzb(((zzyk) obj).zzb[0]).zzd;
        }
        int i8 = 3;
        Pair zzv4 = zzv(3, zzynVar, iArr, new zzye() { // from class: com.google.android.gms.internal.ads.zzxq
            @Override // com.google.android.gms.internal.ads.zzye
            public final List zza(int i9, zzcd zzcdVar, int[] iArr4) {
                int i10 = zzyj.zzb;
                zzgau zzgauVar = new zzgau();
                for (int i11 = 0; i11 < zzcdVar.zza; i11++) {
                    int i12 = i11;
                    zzgauVar.zzf(new zzyd(i9, zzcdVar, i12, zzxy.this, iArr4[i11], str));
                }
                return zzgauVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxr
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzyd) ((List) obj2).get(0)).zza((zzyd) ((List) obj3).get(0));
            }
        });
        if (zzv4 != null) {
            zzykVarArr[((Integer) zzv4.second).intValue()] = (zzyk) zzv4.first;
        }
        int i9 = 0;
        while (i9 < i4) {
            int zzc2 = zzynVar.zzc(i9);
            if (zzc2 != i4 && zzc2 != i2 && zzc2 != i8 && zzc2 != i5) {
                zzwy zzd = zzynVar.zzd(i9);
                int[][] iArr4 = iArr[i9];
                int i10 = i6;
                int i11 = i10;
                zzcd zzcdVar = null;
                zzxu zzxuVar = null;
                while (i10 < zzd.zzb) {
                    zzcd zzb2 = zzd.zzb(i10);
                    int[] iArr5 = iArr4[i10];
                    zzxu zzxuVar2 = zzxuVar;
                    for (int i12 = i6; i12 < zzb2.zza; i12++) {
                        if (zzls.zza(iArr5[i12], zzxyVar.zzN)) {
                            zzxu zzxuVar3 = new zzxu(zzb2.zzb(i12), iArr5[i12]);
                            if (zzxuVar2 == null || zzxuVar3.compareTo(zzxuVar2) > 0) {
                                zzcdVar = zzb2;
                                zzxuVar2 = zzxuVar3;
                                i11 = i12;
                            }
                        }
                    }
                    i10++;
                    zzxuVar = zzxuVar2;
                    i6 = 0;
                }
                zzykVarArr[i9] = zzcdVar == null ? null : new zzyk(zzcdVar, new int[]{i11}, 0);
            }
            i9++;
            i4 = 2;
            i5 = 4;
            i2 = 1;
            i6 = 0;
            i8 = 3;
        }
        HashMap hashMap = new HashMap();
        int i13 = 2;
        for (int i14 = 0; i14 < 2; i14++) {
            zzt(zzynVar.zzd(i14), zzxyVar, hashMap);
        }
        zzt(zzynVar.zze(), zzxyVar, hashMap);
        for (int i15 = 0; i15 < 2; i15++) {
            if (((zzce) hashMap.get(Integer.valueOf(zzynVar.zzc(i15)))) != null) {
                throw null;
            }
        }
        int i16 = 0;
        while (i16 < i13) {
            zzwy zzd2 = zzynVar.zzd(i16);
            if (zzxyVar.zzg(i16, zzd2)) {
                if (zzxyVar.zze(i16, zzd2) != null) {
                    throw null;
                }
                zzykVarArr[i16] = null;
            }
            i16++;
            i13 = 2;
        }
        int i17 = 0;
        for (int i18 = i13; i17 < i18; i18 = 2) {
            int zzc3 = zzynVar.zzc(i17);
            if (zzxyVar.zzf(i17) || zzxyVar.zzB.contains(Integer.valueOf(zzc3))) {
                zzykVarArr[i17] = null;
            }
            i17++;
        }
        zzxe zzxeVar = this.zzi;
        zzyz zzq = zzq();
        zzgax zzf = zzxf.zzf(zzykVarArr);
        int i19 = 2;
        zzyl[] zzylVarArr = new zzyl[2];
        int i20 = 0;
        while (i20 < i19) {
            zzyk zzykVar = zzykVarArr[i20];
            if (zzykVar == null || (length = (iArr3 = zzykVar.zzb).length) == 0) {
                i3 = i20;
            } else {
                if (length == 1) {
                    zza = new zzym(zzykVar.zza, iArr3[0], 0, 0, null);
                    i3 = i20;
                } else {
                    i3 = i20;
                    zza = zzxeVar.zza(zzykVar.zza, iArr3, 0, zzq, (zzgax) zzf.get(i20));
                }
                zzylVarArr[i3] = zza;
            }
            i20 = i3 + 1;
            i19 = 2;
        }
        zzlv[] zzlvVarArr = new zzlv[i19];
        for (int i21 = 0; i21 < i19; i21++) {
            zzlvVarArr[i21] = (zzxyVar.zzf(i21) || zzxyVar.zzB.contains(Integer.valueOf(zzynVar.zzc(i21))) || (zzynVar.zzc(i21) != -2 && zzylVarArr[i21] == null)) ? null : zzlv.zza;
        }
        return Pair.create(zzlvVarArr, zzylVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    @Nullable
    public final zzlt zze() {
        return this;
    }

    public final zzxy zzf() {
        zzxy zzxyVar;
        synchronized (this.zzd) {
            zzxyVar = this.zzf;
        }
        return zzxyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzj() {
        zzyc zzycVar;
        synchronized (this.zzd) {
            try {
                if (zzeu.zza >= 32 && (zzycVar = this.zzg) != null) {
                    zzycVar.zzc();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzk(zzh zzhVar) {
        boolean z2;
        synchronized (this.zzd) {
            z2 = !this.zzh.equals(zzhVar);
            this.zzh = zzhVar;
        }
        if (z2) {
            zzu();
        }
    }

    public final void zzl(zzxw zzxwVar) {
        boolean z2;
        zzxy zzxyVar = new zzxy(zzxwVar);
        synchronized (this.zzd) {
            z2 = !this.zzf.equals(zzxyVar);
            this.zzf = zzxyVar;
        }
        if (z2) {
            if (zzxyVar.zzM && this.zza == null) {
                zzea.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzn() {
        return true;
    }
}

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzbbz {
    private final zzbbo zza;
    private final int zzb;
    private String zzc;
    private final int zzd;

    public zzbbz(int i9, int i10, int i11) {
        this.zzb = i9;
        i10 = (i10 > 64 || i10 < 0) ? 64 : i10;
        if (i11 <= 0) {
            this.zzd = 1;
        } else {
            this.zzd = i11;
        }
        this.zza = new zzbbx(i10);
    }

    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        String str;
        Collections.sort(arrayList2, new zzbby(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((zzbbn) arrayList2.get(i9)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str2 : split) {
                    if (str2.contains("'")) {
                        StringBuilder sb = new StringBuilder(str2);
                        int i10 = 1;
                        boolean z8 = false;
                        while (true) {
                            int i11 = i10 + 2;
                            if (i11 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i10) == '\'') {
                                if (sb.charAt(i10 - 1) != ' ') {
                                    int i12 = i10 + 1;
                                    if ((sb.charAt(i12) == 's' || sb.charAt(i12) == 'S') && (i11 == sb.length() || sb.charAt(i11) == ' ')) {
                                        sb.insert(i10, ' ');
                                        i10 = i11;
                                        z8 = true;
                                    }
                                }
                                sb.setCharAt(i10, ' ');
                                z8 = true;
                            }
                            i10++;
                        }
                        if (z8) {
                            str = sb.toString();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            this.zzc = str;
                            str2 = str;
                        }
                    }
                    String[] zzb = zzbbs.zzb(str2, true);
                    if (zzb.length >= this.zzd) {
                        for (int i13 = 0; i13 < zzb.length; i13++) {
                            String str3 = "";
                            for (int i14 = 0; i14 < this.zzd; i14++) {
                                int i15 = i13 + i14;
                                if (i15 >= zzb.length) {
                                    break;
                                }
                                if (i14 > 0) {
                                    str3 = str3.concat(" ");
                                }
                                str3 = str3.concat(String.valueOf(zzb[i15]));
                            }
                            hashSet.add(str3);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
            }
        }
        zzbbq zzbbqVar = new zzbbq();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzbbqVar.zzb.write(this.zza.zzb((String) it.next()));
            } catch (IOException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error while writing hash to byteStream", e4);
            }
        }
        return zzbbqVar.toString();
    }
}

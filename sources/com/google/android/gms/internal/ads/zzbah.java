package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class zzbah {
    private final zzazw zza;
    private final int zzb;
    private final int zzc;

    public zzbah(int i2, int i3, int i4) {
        this.zzb = i2;
        i3 = (i3 > 64 || i3 < 0) ? 64 : i3;
        if (i4 <= 0) {
            this.zzc = 1;
        } else {
            this.zzc = i4;
        }
        this.zza = new zzbaf(i3);
    }

    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new zzbag(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((zzazv) arrayList2.get(i2)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str : split) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i3 = 1;
                        boolean z2 = false;
                        while (true) {
                            int i4 = i3 + 2;
                            if (i4 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i3) == '\'') {
                                if (sb.charAt(i3 - 1) != ' ') {
                                    int i5 = i3 + 1;
                                    if ((sb.charAt(i5) == 's' || sb.charAt(i5) == 'S') && (i4 == sb.length() || sb.charAt(i4) == ' ')) {
                                        sb.insert(i3, ' ');
                                        i3 = i4;
                                        z2 = true;
                                    }
                                }
                                sb.setCharAt(i3, ' ');
                                z2 = true;
                            }
                            i3++;
                        }
                        String sb2 = z2 ? sb.toString() : null;
                        if (sb2 != null) {
                            str = sb2;
                        }
                    }
                    String[] zzb = zzbaa.zzb(str, true);
                    if (zzb.length >= this.zzc) {
                        for (int i6 = 0; i6 < zzb.length; i6++) {
                            String str2 = "";
                            for (int i7 = 0; i7 < this.zzc; i7++) {
                                int i8 = i6 + i7;
                                if (i8 >= zzb.length) {
                                    break;
                                }
                                if (i7 > 0) {
                                    str2 = str2.concat(" ");
                                }
                                str2 = str2.concat(String.valueOf(zzb[i8]));
                            }
                            hashSet.add(str2);
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
        zzazy zzazyVar = new zzazy();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzazyVar.zzb.write(this.zza.zzb((String) it.next()));
            } catch (IOException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzazyVar.toString();
    }
}

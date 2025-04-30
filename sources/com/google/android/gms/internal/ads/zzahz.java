package com.google.android.gms.internal.ads;

import Q7.n0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzahz extends zzahr {
    public static final Parcelable.Creator<zzahz> CREATOR = new zzahy();

    @Nullable
    public final String zza;

    @Deprecated
    public final String zzb;
    public final zzgbc zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzahz(String str, @Nullable String str2, List list) {
        super(str);
        zzeq.zzd(!list.isEmpty());
        this.zza = str2;
        zzgbc zzk = zzgbc.zzk(list);
        this.zzc = zzk;
        this.zzb = (String) zzk.get(0);
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahz.class == obj.getClass()) {
            zzahz zzahzVar = (zzahz) obj;
            if (zzgd.zzG(this.zzf, zzahzVar.zzf) && zzgd.zzG(this.zza, zzahzVar.zza) && this.zzc.equals(zzahzVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        return this.zzc.hashCode() + (((hashCode * 31) + i9) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzahr
    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzf);
        sb.append(": description=");
        return n0.l(sb, this.zza, ": values=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeStringArray((String[]) this.zzc.toArray(new String[0]));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzahr, com.google.android.gms.internal.ads.zzcc
    public final void zza(zzby zzbyVar) {
        char c9;
        Integer num;
        String str = this.zzf;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c9 = 16;
                    break;
                }
                c9 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c9 = '\f';
                    break;
                }
                c9 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c9 = 18;
                    break;
                }
                c9 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c9 = 20;
                    break;
                }
                c9 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c9 = '\n';
                    break;
                }
                c9 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c9 = 17;
                    break;
                }
                c9 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c9 = '\r';
                    break;
                }
                c9 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c9 = 14;
                    break;
                }
                c9 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c9 = 15;
                    break;
                }
                c9 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c9 = 21;
                    break;
                }
                c9 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c9 = 19;
                    break;
                }
                c9 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c9 = '\t';
                    break;
                }
                c9 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c9 = 11;
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
            case 1:
                zzbyVar.zzq((CharSequence) this.zzc.get(0));
                return;
            case 2:
            case 3:
                zzbyVar.zze((CharSequence) this.zzc.get(0));
                return;
            case 4:
            case 5:
                zzbyVar.zzc((CharSequence) this.zzc.get(0));
                return;
            case 6:
            case 7:
                zzbyVar.zzd((CharSequence) this.zzc.get(0));
                return;
            case '\b':
            case '\t':
                String str2 = (String) this.zzc.get(0);
                int i9 = zzgd.zza;
                String[] split = str2.split("/", -1);
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    zzbyVar.zzs(Integer.valueOf(parseInt));
                    zzbyVar.zzr(num);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    zzbyVar.zzl(Integer.valueOf(Integer.parseInt((String) this.zzc.get(0))));
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    String str3 = (String) this.zzc.get(0);
                    int parseInt2 = Integer.parseInt(str3.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str3.substring(0, 2));
                    zzbyVar.zzk(Integer.valueOf(parseInt2));
                    zzbyVar.zzj(Integer.valueOf(parseInt3));
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List zzb = zzb((String) this.zzc.get(0));
                int size = zzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            return;
                        } else {
                            zzbyVar.zzj((Integer) zzb.get(2));
                        }
                    }
                    zzbyVar.zzk((Integer) zzb.get(1));
                }
                zzbyVar.zzl((Integer) zzb.get(0));
                return;
            case 15:
                List zzb2 = zzb((String) this.zzc.get(0));
                int size2 = zzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            zzbyVar.zzm((Integer) zzb2.get(2));
                        } else {
                            return;
                        }
                    }
                    zzbyVar.zzn((Integer) zzb2.get(1));
                }
                zzbyVar.zzo((Integer) zzb2.get(0));
                return;
            case 16:
            case 17:
                zzbyVar.zzf((CharSequence) this.zzc.get(0));
                return;
            case 18:
            case 19:
                zzbyVar.zzg((CharSequence) this.zzc.get(0));
                return;
            case 20:
            case 21:
                zzbyVar.zzt((CharSequence) this.zzc.get(0));
                return;
            default:
                return;
        }
    }
}

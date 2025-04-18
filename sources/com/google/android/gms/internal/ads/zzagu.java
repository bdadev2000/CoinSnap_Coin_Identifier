package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzagu extends zzagl {
    public static final Parcelable.Creator<zzagu> CREATOR = new zzagt();

    @Nullable
    public final String zza;
    public final zzfzo zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public zzagu(String str, @Nullable String str2, List list) {
        super(str);
        zzdb.zzd(!list.isEmpty());
        this.zza = str2;
        zzfzo zzl = zzfzo.zzl(list);
        this.zzb = zzl;
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
        if (obj != null && zzagu.class == obj.getClass()) {
            zzagu zzaguVar = (zzagu) obj;
            if (Objects.equals(this.zzf, zzaguVar.zzf) && Objects.equals(this.zza, zzaguVar.zza) && this.zzb.equals(zzaguVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return this.zzb.hashCode() + (((hashCode * 31) + i10) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagl
    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.zzf);
        sb2.append(": description=");
        return kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.n(sb2, this.zza, ": values=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeStringArray((String[]) this.zzb.toArray(new String[0]));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzagl, com.google.android.gms.internal.ads.zzbc
    public final void zza(zzay zzayVar) {
        char c10;
        Integer num;
        String str = this.zzf;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 18;
                    break;
                }
                c10 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c10 = 22;
                    break;
                }
                c10 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 19;
                    break;
                }
                c10 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                zzayVar.zzq((CharSequence) this.zzb.get(0));
                return;
            case 2:
            case 3:
                zzayVar.zze((CharSequence) this.zzb.get(0));
                return;
            case 4:
            case 5:
                zzayVar.zzc((CharSequence) this.zzb.get(0));
                return;
            case 6:
            case 7:
                zzayVar.zzd((CharSequence) this.zzb.get(0));
                return;
            case '\b':
            case '\t':
                String str2 = (String) this.zzb.get(0);
                int i10 = zzen.zza;
                String[] split = str2.split("/", -1);
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    zzayVar.zzs(Integer.valueOf(parseInt));
                    zzayVar.zzr(num);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    zzayVar.zzl(Integer.valueOf(Integer.parseInt((String) this.zzb.get(0))));
                    return;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    String str3 = (String) this.zzb.get(0);
                    int parseInt2 = Integer.parseInt(str3.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str3.substring(0, 2));
                    zzayVar.zzk(Integer.valueOf(parseInt2));
                    zzayVar.zzj(Integer.valueOf(parseInt3));
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List zzb = zzb((String) this.zzb.get(0));
                int size = zzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size == 3) {
                            zzayVar.zzj((Integer) zzb.get(2));
                        } else {
                            return;
                        }
                    }
                    zzayVar.zzk((Integer) zzb.get(1));
                }
                zzayVar.zzl((Integer) zzb.get(0));
                return;
            case 15:
                List zzb2 = zzb((String) this.zzb.get(0));
                int size2 = zzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            zzayVar.zzm((Integer) zzb2.get(2));
                        } else {
                            return;
                        }
                    }
                    zzayVar.zzn((Integer) zzb2.get(1));
                }
                zzayVar.zzo((Integer) zzb2.get(0));
                return;
            case 16:
            case 17:
                zzayVar.zzf((CharSequence) this.zzb.get(0));
                return;
            case 18:
            case 19:
                zzayVar.zzg((CharSequence) this.zzb.get(0));
                return;
            case 20:
            case 21:
                zzayVar.zzt((CharSequence) this.zzb.get(0));
                return;
            case 22:
                Integer zzf = zzgcr.zzf((String) this.zzb.get(0), 10);
                if (zzf == null) {
                    zzayVar.zzi((CharSequence) this.zzb.get(0));
                    return;
                }
                String zza = zzagm.zza(zzf.intValue());
                if (zza != null) {
                    zzayVar.zzi(zza);
                    return;
                }
                return;
            default:
                return;
        }
    }
}

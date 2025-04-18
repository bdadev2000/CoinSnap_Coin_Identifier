package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzahe extends zzagv {
    public static final Parcelable.Creator<zzahe> CREATOR = new zzahd();

    @Nullable
    public final String zza;
    public final zzgax zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public zzahe(String str, @Nullable String str2, List list) {
        super(str);
        zzdi.zzd(!list.isEmpty());
        this.zza = str2;
        zzgax zzl = zzgax.zzl(list);
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
        if (obj != null && zzahe.class == obj.getClass()) {
            zzahe zzaheVar = (zzahe) obj;
            if (Objects.equals(this.zzf, zzaheVar.zzf) && Objects.equals(this.zza, zzaheVar.zza) && this.zzb.equals(zzaheVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return this.zzb.hashCode() + (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagv
    public final String toString() {
        return this.zzf + ": description=" + this.zza + ": values=" + String.valueOf(this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeStringArray((String[]) this.zzb.toArray(new String[0]));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzagv, com.google.android.gms.internal.ads.zzbj
    public final void zza(zzbf zzbfVar) {
        char c2;
        String str = this.zzf;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                zzbfVar.zzq((CharSequence) this.zzb.get(0));
                return;
            case 2:
            case 3:
                zzbfVar.zze((CharSequence) this.zzb.get(0));
                return;
            case 4:
            case 5:
                zzbfVar.zzc((CharSequence) this.zzb.get(0));
                return;
            case 6:
            case 7:
                zzbfVar.zzd((CharSequence) this.zzb.get(0));
                return;
            case '\b':
            case '\t':
                String str2 = (String) this.zzb.get(0);
                int i2 = zzeu.zza;
                String[] split = str2.split(RemoteSettings.FORWARD_SLASH_STRING, -1);
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    zzbfVar.zzs(Integer.valueOf(parseInt));
                    zzbfVar.zzr(valueOf);
                    return;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    zzbfVar.zzl(Integer.valueOf(Integer.parseInt((String) this.zzb.get(0))));
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
                    zzbfVar.zzk(Integer.valueOf(parseInt2));
                    zzbfVar.zzj(Integer.valueOf(parseInt3));
                    return;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List zzb = zzb((String) this.zzb.get(0));
                int size = zzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size != 3) {
                            return;
                        } else {
                            zzbfVar.zzj((Integer) zzb.get(2));
                        }
                    }
                    zzbfVar.zzk((Integer) zzb.get(1));
                }
                zzbfVar.zzl((Integer) zzb.get(0));
                return;
            case 15:
                List zzb2 = zzb((String) this.zzb.get(0));
                int size2 = zzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 != 3) {
                            return;
                        } else {
                            zzbfVar.zzm((Integer) zzb2.get(2));
                        }
                    }
                    zzbfVar.zzn((Integer) zzb2.get(1));
                }
                zzbfVar.zzo((Integer) zzb2.get(0));
                return;
            case 16:
            case 17:
                zzbfVar.zzf((CharSequence) this.zzb.get(0));
                return;
            case 18:
            case 19:
                zzbfVar.zzg((CharSequence) this.zzb.get(0));
                return;
            case 20:
            case 21:
                zzbfVar.zzt((CharSequence) this.zzb.get(0));
                return;
            case 22:
                Integer zzf = zzgdu.zzf((String) this.zzb.get(0), 10);
                if (zzf == null) {
                    zzbfVar.zzi((CharSequence) this.zzb.get(0));
                    return;
                }
                String zza = zzagw.zza(zzf.intValue());
                if (zza != null) {
                    zzbfVar.zzi(zza);
                    return;
                }
                return;
            default:
                return;
        }
    }
}

package q8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.r0;
import com.google.common.collect.z1;
import java.util.ArrayList;
import n9.h0;
import s7.k1;
import v8.u0;

/* loaded from: classes3.dex */
public final class n extends j {
    public static final Parcelable.Creator<n> CREATOR = new com.facebook.login.l(27);

    /* renamed from: c, reason: collision with root package name */
    public final String f23729c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f23730d;

    public n(String str, String str2, z1 z1Var) {
        super(str);
        u0.d(!z1Var.isEmpty());
        this.f23729c = str2;
        r0 i10 = r0.i(z1Var);
        this.f23730d = i10;
    }

    public static ArrayList a(String str) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (h0.a(this.f23718b, nVar.f23718b) && h0.a(this.f23729c, nVar.f23729c) && this.f23730d.equals(nVar.f23730d)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // l8.a
    public final void g(k1 k1Var) {
        char c10;
        Integer num;
        String str = this.f23718b;
        str.getClass();
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
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
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 16;
                    break;
                }
                c10 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 17;
                    break;
                }
                c10 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 18;
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
                    c10 = 20;
                    break;
                }
                c10 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 21;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        r0 r0Var = this.f23730d;
        try {
            switch (c10) {
                case 0:
                case '\n':
                    k1Var.f24472c = (CharSequence) r0Var.get(0);
                    return;
                case 1:
                case 11:
                    k1Var.f24493y = (CharSequence) r0Var.get(0);
                    return;
                case 2:
                case '\f':
                    String str2 = (String) r0Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    k1Var.f24488s = Integer.valueOf(parseInt);
                    k1Var.f24489t = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case 17:
                    k1Var.f24471b = (CharSequence) r0Var.get(0);
                    return;
                case 4:
                case 18:
                    k1Var.f24473d = (CharSequence) r0Var.get(0);
                    return;
                case 5:
                case 19:
                    k1Var.f24494z = (CharSequence) r0Var.get(0);
                    return;
                case 6:
                case 20:
                    String str3 = (String) r0Var.get(0);
                    int i10 = h0.a;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    k1Var.f24482m = Integer.valueOf(parseInt3);
                    k1Var.f24483n = num;
                    return;
                case 7:
                case 16:
                    k1Var.a = (CharSequence) r0Var.get(0);
                    return;
                case '\b':
                case 15:
                    k1Var.f24492x = (CharSequence) r0Var.get(0);
                    return;
                case '\t':
                case 21:
                    k1Var.f24487r = Integer.valueOf(Integer.parseInt((String) r0Var.get(0)));
                    return;
                case '\r':
                    ArrayList a = a((String) r0Var.get(0));
                    int size = a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                k1Var.f24489t = (Integer) a.get(2);
                            } else {
                                return;
                            }
                        }
                        k1Var.f24488s = (Integer) a.get(1);
                    }
                    k1Var.f24487r = (Integer) a.get(0);
                    return;
                case 14:
                    ArrayList a10 = a((String) r0Var.get(0));
                    int size2 = a10.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                k1Var.f24491w = (Integer) a10.get(2);
                            } else {
                                return;
                            }
                        }
                        k1Var.f24490v = (Integer) a10.get(1);
                    }
                    k1Var.u = (Integer) a10.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final int hashCode() {
        int i10;
        int c10 = vd.e.c(this.f23718b, 527, 31);
        String str = this.f23729c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return this.f23730d.hashCode() + ((c10 + i10) * 31);
    }

    @Override // q8.j
    public final String toString() {
        return this.f23718b + ": description=" + this.f23729c + ": values=" + this.f23730d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f23718b);
        parcel.writeString(this.f23729c);
        parcel.writeStringArray((String[]) this.f23730d.toArray(new String[0]));
    }
}
